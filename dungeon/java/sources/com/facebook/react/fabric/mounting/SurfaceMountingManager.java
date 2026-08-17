package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.C2275s;
import com.facebook.react.uimanager.InterfaceC2252f0;
import com.facebook.react.uimanager.InterfaceC2260j0;
import com.facebook.react.uimanager.InterfaceC2273q;
import com.facebook.react.uimanager.J0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.T;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.X;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p323s.g0;

/* JADX INFO: loaded from: classes2.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private X6.a mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private g0 mTagSetForStoppedSurface;
    private C2262k0 mThemedReactContext;
    private J0 mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$1, reason: invalid class name */
    class AnonymousClass1 extends GuardedRunnable {
        final /* synthetic */ View val$rootView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReactContext reactContext, View view) {
            super(reactContext);
            this.val$rootView = view;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            if (SurfaceMountingManager.this.isStopped()) {
                return;
            }
            if (this.val$rootView.getId() == SurfaceMountingManager.this.mSurfaceId) {
                ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new C2275s("Race condition in addRootView detected. Trying to set an id of [" + SurfaceMountingManager.this.mSurfaceId + "] on the RootView, but that id has already been set. "));
            } else if (this.val$rootView.getId() != -1) {
                String str = SurfaceMountingManager.TAG;
                W4.a.o(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(this.val$rootView.getId()), Integer.valueOf(SurfaceMountingManager.this.mSurfaceId));
                ReactSoftExceptionLogger.logSoftException(str, new C2275s("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
            }
            this.val$rootView.setId(SurfaceMountingManager.this.mSurfaceId);
            KeyEvent.Callback callback = this.val$rootView;
            if (callback instanceof T) {
                ((T) callback).setRootViewTag(SurfaceMountingManager.this.mSurfaceId);
            }
            SurfaceMountingManager.this.executeMountItemsOnViewAttach();
            SurfaceMountingManager.this.mRootViewAttached = true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$parentTag;
        final /* synthetic */ ViewGroup val$parentView;
        final /* synthetic */ int val$tag;

        AnonymousClass2(int i10, int i11, int i12, ViewGroup viewGroup) {
            this.val$tag = i10;
            this.val$parentTag = i11;
            this.val$index = i12;
            this.val$parentView = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            W4.a.m(SurfaceMountingManager.TAG, "addViewAt: [" + this.val$tag + "] -> [" + this.val$parentTag + "] idx: " + this.val$index + " AFTER");
            SurfaceMountingManager.logViewHierarchy(this.val$parentView, false);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ int val$finalIndex;
        final /* synthetic */ int val$parentTag;
        final /* synthetic */ ViewGroup val$parentView;
        final /* synthetic */ int val$tag;

        AnonymousClass3(int i10, int i11, int i12, ViewGroup viewGroup) {
            this.val$tag = i10;
            this.val$parentTag = i11;
            this.val$finalIndex = i12;
            this.val$parentView = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            W4.a.m(SurfaceMountingManager.TAG, "removeViewAt: [" + this.val$tag + "] -> [" + this.val$parentTag + "] idx: " + this.val$finalIndex + " AFTER");
            SurfaceMountingManager.logViewHierarchy(this.val$parentView, false);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        final /* synthetic */ PendingViewEvent val$viewEvent;
        final /* synthetic */ ViewState val$viewState;

        AnonymousClass4(ViewState viewState, PendingViewEvent pendingViewEvent) {
            this.val$viewState = viewState;
            this.val$viewEvent = pendingViewEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewState viewState = this.val$viewState;
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                this.val$viewEvent.dispatch(eventEmitterWrapper);
                return;
            }
            if (viewState.mPendingEventQueue == null) {
                viewState.mPendingEventQueue = new LinkedList();
            }
            this.val$viewState.mPendingEventQueue.add(this.val$viewEvent);
        }
    }

    private static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i10, boolean z10) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i10;
            this.mCanCoalesceEvent = z10;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    private static class ViewState {
        ReadableMap mCurrentLocalData;
        X mCurrentProps;
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        InterfaceC2260j0 mStateWrapper;
        View mView;
        ViewManager mViewManager;

        private ViewState(int i10) {
            this(i10, null, null, false);
        }

        private ViewState(int i10, View view, ViewManager viewManager, boolean z10) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i10;
            this.mView = view;
            this.mIsRoot = z10;
            this.mViewManager = viewManager;
        }

        /* synthetic */ ViewState(int i10, View view, ViewManager viewManager, boolean z10, b bVar) {
            this(i10, view, viewManager, z10);
        }

        /* synthetic */ ViewState(int i10, b bVar) {
            this(i10);
        }

        @NonNull
        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }
    }

    static {
        p384v6.a aVar = p384v6.a.f56276a;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i10, @NonNull X6.a aVar, @NonNull J0 j10, @NonNull RootViewManager rootViewManager, @NonNull MountingManager.MountItemExecutor mountItemExecutor, @NonNull C2262k0 c2262k0) {
        this.mSurfaceId = i10;
        this.mJSResponderHandler = aVar;
        this.mViewManagerRegistry = j10;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = c2262k0;
    }

    private void addRootView(@NonNull View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true, null));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((ReactContext) p240n6.a.c(this.mThemedReactContext), view);
        if (UiThreadUtil.isOnUiThread()) {
            anonymousClass1.run();
        } else {
            UiThreadUtil.runOnUiThread(anonymousClass1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    private ViewState getNullableViewState(int i10) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i10));
    }

    @NonNull
    private static InterfaceC2273q getViewGroupManager(@NonNull ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (InterfaceC2273q) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    @NonNull
    private ViewState getViewState(int i10) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i10 + ". Surface stopped: " + isStopped());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$0() {
        if (D6.b.n()) {
            this.mViewManagerRegistry.m(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new g0();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.l(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        W4.a.m(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z10) {
        int id2 = viewGroup.getId();
        W4.a.m(TAG, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            W4.a.m(TAG, "     <View idx=" + i10 + " tag=" + viewGroup.getChildAt(i10).getId() + " class=" + viewGroup.getChildAt(i10).getClass().toString() + ">");
        }
        String str = TAG;
        W4.a.m(str, "  </ViewGroup tag=" + id2 + ">");
        if (z10) {
            W4.a.m(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                W4.a.m(TAG, "<ViewParent tag=" + id3 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    private void onViewStateDeleted(ViewState viewState) {
        InterfaceC2260j0 interfaceC2260j0 = viewState.mStateWrapper;
        if (interfaceC2260j0 != null) {
            interfaceC2260j0.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    public void addViewAt(int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        View view = viewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i10 + " - Tag: " + i11 + " - Index: " + i12;
            W4.a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ViewState viewState2 = getViewState(i11);
        View view2 = viewState2.mView;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i11);
        }
        boolean z10 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z10) {
            W4.a.m(TAG, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z11 = parent instanceof ViewGroup;
            int id2 = z11 ? ((ViewGroup) parent).getId() : -1;
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i11 + "] into parent [" + i10 + "]: View already has a parent: [" + id2 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z11) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i11));
        }
        try {
            getViewGroupManager(viewState).addView(viewGroup, view2, i12);
            if (z10) {
                UiThreadUtil.runOnUiThread(new AnonymousClass2(i11, i10, i12, viewGroup));
            }
        } catch (IllegalStateException | IndexOutOfBoundsException e10) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i11 + "] into parent [" + i10 + "] at index " + i12, e10);
        }
    }

    public void attachRootView(View view, C2262k0 c2262k0) {
        this.mThemedReactContext = c2262k0;
        addRootView(view);
    }

    public void createView(@NonNull String str, int i10, ReadableMap readableMap, InterfaceC2260j0 interfaceC2260j0, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i10, readableMap, interfaceC2260j0, eventEmitterWrapper, z10);
        }
    }

    public void createViewUnsafe(@NonNull String str, int i10, ReadableMap readableMap, InterfaceC2260j0 interfaceC2260j0, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        p295q7.a.c(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            X x10 = new X(readableMap);
            ViewState viewState = new ViewState(i10, null);
            viewState.mCurrentProps = x10;
            viewState.mStateWrapper = interfaceC2260j0;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
            if (z10) {
                ViewManager viewManagerG = this.mViewManagerRegistry.g(str);
                viewState.mView = viewManagerG.createView(i10, this.mThemedReactContext, x10, interfaceC2260j0, this.mJSResponderHandler);
                viewState.mViewManager = viewManagerG;
            }
        } finally {
            p295q7.a.i(0L);
        }
    }

    public void deleteView(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException("SurfaceMountingManager:MissingViewState", new ReactNoCrashSoftException("Unable to find viewState for tag: " + i10 + " for deleteView"));
            return;
        }
        if (this.mViewsWithActiveTouches.contains(Integer.valueOf(i10))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i10));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i10));
            onViewStateDeleted(nullableViewState);
        }
    }

    public void enqueuePendingEvent(int i10, String str, boolean z10, WritableMap writableMap, int i11) {
        ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i10))) == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new AnonymousClass4(viewState, new PendingViewEvent(str, writableMap, i11, z10)));
    }

    public C2262k0 getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new C2275s("Trying to resolve view with tag " + i10 + " which doesn't exist");
    }

    public boolean getViewExists(int i10) {
        g0 g0Var = this.mTagSetForStoppedSurface;
        if (g0Var != null && g0Var.e(i10)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i10));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i10) {
        this.mViewsWithActiveTouches.add(Integer.valueOf(i10));
    }

    public void preallocateView(@NonNull String str, int i10, ReadableMap readableMap, InterfaceC2260j0 interfaceC2260j0, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i10) == null) {
            createViewUnsafe(str, i10, readableMap, interfaceC2260j0, null, z10);
        }
    }

    public void printSurfaceState() {
        W4.a.o(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            W4.a.o(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i10, int i11, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i10 + "] for commandId: " + i11);
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i10);
        }
        View view = nullableViewState.mView;
        if (view != null) {
            viewManager.receiveCommand(view, i11, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    public void receiveCommand(int i10, @NonNull String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i10 + " for commandId: " + str);
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        View view = nullableViewState.mView;
        if (view != null) {
            viewManager.receiveCommand(view, str, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    public void removeViewAt(int i10, int i11, int i12) {
        int i13;
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i10))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C2275s("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i10 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException("SurfaceMountingManager:MissingViewState", new IllegalStateException("Unable to find viewState for tag: [" + i11 + "] for removeViewAt"));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i10 + " - Index: " + i12;
            W4.a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
        }
        int i14 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            W4.a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i12 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        InterfaceC2273q viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i12);
        int id2 = childAt != null ? childAt.getId() : -1;
        if (id2 != i10) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i14 >= childCount) {
                    i14 = -1;
                    break;
                } else if (viewGroup.getChildAt(i14).getId() == i10) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 == -1) {
                W4.a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] @" + i12 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            logViewHierarchy(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i10 + "] of parent [" + i11 + "] at index " + i12 + ", but got view tag " + id2 + " - actual index of view: " + i14));
            i13 = i14;
        } else {
            i13 = i12;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i13);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new AnonymousClass3(i10, i11, i13, viewGroup));
            }
        } catch (RuntimeException e10) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i13 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e10);
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        View view = viewState.mView;
        if (view != null) {
            view.sendAccessibilityEvent(i11);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z10) {
            this.mJSResponderHandler.d(i11, null);
            return;
        }
        ViewState viewState = getViewState(i10);
        View view = viewState.mView;
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.d(i11, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i10 + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i10 + "] that is a root view");
        }
        this.mJSResponderHandler.d(i11, view.getParent());
    }

    public void stopSurface() {
        W4.a.m(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            InterfaceC2260j0 interfaceC2260j0 = viewState.mStateWrapper;
            if (interfaceC2260j0 != null) {
                interfaceC2260j0.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        a aVar = new a(this);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    public void sweepActiveTouchForTag(int i10) {
        this.mViewsWithActiveTouches.remove(Integer.valueOf(i10));
        if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i10))) {
            this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i10));
            deleteView(i10);
        }
    }

    public void updateEventEmitter(int i10, @NonNull EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState == null) {
            viewState = new ViewState(i10, null);
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        InterfaceC2273q interfaceC2273q;
        int i18;
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        int i19 = 1;
        if (i17 == 1) {
            i19 = 0;
        } else if (i17 != 2) {
            i19 = 2;
        }
        view.setLayoutDirection(i19);
        view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof InterfaceC2252f0) {
            parent.requestLayout();
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState != null) {
            NativeModule nativeModule = nullableViewState.mViewManager;
            interfaceC2273q = nativeModule != null ? (InterfaceC2273q) nativeModule : null;
            if (interfaceC2273q != null || !interfaceC2273q.needsCustomLayoutForChildren()) {
                view.layout(i12, i13, i14 + i12, i15 + i13);
            }
            i18 = i16 == 0 ? 4 : 0;
            if (view.getVisibility() != i18) {
                view.setVisibility(i18);
            }
        }
        ReactSoftExceptionLogger.logSoftException("SurfaceMountingManager:MissingViewState", new ReactNoCrashSoftException("Unable to find viewState for tag: " + i11 + " for updateLayout"));
        if (interfaceC2273q != null) {
            view.layout(i12, i13, i14 + i12, i15 + i13);
        } else {
            view.layout(i12, i13, i14 + i12, i15 + i13);
        }
        if (i16 == 0) {
        }
        if (view.getVisibility() != i18) {
            view.setVisibility(i18);
        }
    }

    public void updateOverflowInset(int i10, int i11, int i12, int i13, int i14) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = viewState.mView;
        if (callback != null) {
            if (callback instanceof Q) {
                ((Q) callback).setOverflowInset(i11, i12, i13, i14);
            }
        } else {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
    }

    public void updatePadding(int i10, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            viewManager.setPadding(view, i11, i12, i13, i14);
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    public void updateProps(int i10, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        viewState.mCurrentProps = new X(readableMap);
        View view = viewState.mView;
        if (view != null) {
            ((ViewManager) p240n6.a.c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i10 + "]");
    }

    public void updateState(int i10, InterfaceC2260j0 interfaceC2260j0) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        InterfaceC2260j0 interfaceC2260j1 = viewState.mStateWrapper;
        viewState.mStateWrapper = interfaceC2260j0;
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i10);
        }
        Object objUpdateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, interfaceC2260j0);
        if (objUpdateState != null) {
            viewManager.updateExtraData(viewState.mView, objUpdateState);
        }
        if (interfaceC2260j1 != null) {
            interfaceC2260j1.destroyState();
        }
    }
}
