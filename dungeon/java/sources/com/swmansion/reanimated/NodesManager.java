package com.swmansion.reanimated;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC2271p;
import com.facebook.react.uimanager.C2268n0;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.C2275s;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.t0;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.nativeProxy.NoopEventHandler;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class NodesManager implements com.facebook.react.uimanager.events.i {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ReaCompatibility compatibility;
    private double lastFrameTimeMs;
    private final AnimationsManager mAnimationManager;
    private int mAnimationsDragFactor;
    private final AbstractChoreographerFrameCallbackC2271p mChoreographerCallback;
    private final ReactContext mContext;
    protected final UIManagerModule.d mCustomEventNamesResolver;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private NativeProxy mNativeProxy;
    private Queue<NativeUpdateOperation> mOperationsInBatch;
    private final com.facebook.react.modules.core.b mReactChoreographer;
    private boolean mTryRunBatchUpdatesSynchronously;
    private final C2268n0 mUIImplementation;
    private final UIManager mUIManager;
    private Runnable mUnsubscribe;
    private final WorkletsModule mWorkletsModule;
    public Set<String> nativeProps;
    public Set<String> uiProps;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private RCTEventEmitter mCustomEventHandler = new NoopEventHandler();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.swmansion.reanimated.NodesManager$1, reason: invalid class name */
    class AnonymousClass1 extends GuardedRunnable {
        final /* synthetic */ ReadableArray val$commandArgs;
        final /* synthetic */ String val$commandId;
        final /* synthetic */ int val$viewTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JSExceptionHandler jSExceptionHandler, int i10, String str, ReadableArray readableArray) {
            super(jSExceptionHandler);
            this.val$viewTag = i10;
            this.val$commandId = str;
            this.val$commandArgs = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            NodesManager.this.mUIManager.dispatchCommand(this.val$viewTag, this.val$commandId, this.val$commandArgs);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.reanimated.NodesManager$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractChoreographerFrameCallbackC2271p {
        AnonymousClass2(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC2271p
        protected void doFrameGuarded(long j10) {
            NodesManager.this.onAnimationFrame(j10);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.reanimated.NodesManager$3, reason: invalid class name */
    class AnonymousClass3 extends GuardedRunnable {
        final /* synthetic */ Queue val$copiedOperationsQueue;
        final /* synthetic */ Semaphore val$semaphore;
        final /* synthetic */ boolean val$trySynchronously;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(JSExceptionHandler jSExceptionHandler, boolean z10, Semaphore semaphore, Queue queue) {
            super(jSExceptionHandler);
            this.val$trySynchronously = z10;
            this.val$semaphore = semaphore;
            this.val$copiedOperationsQueue = queue;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            boolean zA = t0.a(NodesManager.this.mUIImplementation);
            boolean z10 = this.val$trySynchronously && zA;
            if (!z10) {
                this.val$semaphore.release();
            }
            while (!this.val$copiedOperationsQueue.isEmpty()) {
                NativeUpdateOperation nativeUpdateOperation = (NativeUpdateOperation) this.val$copiedOperationsQueue.remove();
                V vN = NodesManager.this.mUIImplementation.N(nativeUpdateOperation.mViewTag);
                if (vN != null) {
                    ((UIManagerModule) NodesManager.this.mUIManager).updateView(nativeUpdateOperation.mViewTag, vN.v(), nativeUpdateOperation.mNativeProps);
                }
            }
            if (zA) {
                NodesManager.this.mUIImplementation.m(-1);
            }
            if (z10) {
                this.val$semaphore.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.reanimated.NodesManager$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private final class NativeUpdateOperation {
        public WritableMap mNativeProps;
        public int mViewTag;

        public NativeUpdateOperation(int i10, WritableMap writableMap) {
            this.mViewTag = i10;
            this.mNativeProps = writableMap;
        }
    }

    public interface OnAnimationFrame {
        void onAnimationFrame(double d10);
    }

    public NodesManager(ReactContext reactContext, WorkletsModule workletsModule) {
        Set<String> set = Collections.EMPTY_SET;
        this.uiProps = set;
        this.nativeProps = set;
        this.mUnsubscribe = null;
        this.mOperationsInBatch = new LinkedList();
        this.mTryRunBatchUpdatesSynchronously = false;
        this.mContext = reactContext;
        this.mWorkletsModule = workletsModule;
        UIManager uIManagerG = C2270o0.g(reactContext, 1);
        this.mUIManager = uIManagerG;
        this.mUIImplementation = uIManagerG instanceof UIManagerModule ? ((UIManagerModule) uIManagerG).getUIImplementation() : null;
        Objects.requireNonNull(uIManagerG);
        this.mCustomEventNamesResolver = new c(uIManagerG);
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mReactChoreographer = com.facebook.react.modules.core.b.h();
        this.mChoreographerCallback = new AnonymousClass2(reactContext);
        EventDispatcher eventDispatcherB = C2270o0.b(reactContext, 1);
        Objects.requireNonNull(eventDispatcherB);
        EventDispatcher eventDispatcher = eventDispatcherB;
        eventDispatcher.c(this);
        this.mUnsubscribe = new d(this, eventDispatcher);
        this.mAnimationManager = new AnimationsManager(reactContext, uIManagerG);
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof ReadableArray) {
            if (obj instanceof WritableArray) {
                writableMap.putArray(str, (ReadableArray) obj);
                return;
            } else {
                writableMap.putArray(str, copyReadableArray((ReadableArray) obj));
                return;
            }
        }
        if (!(obj instanceof ReadableMap)) {
            throw new IllegalStateException("[Reanimated] Unknown type of animated value.");
        }
        if (obj instanceof WritableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            writableMap.putMap(str, copyReadableMap((ReadableMap) obj));
        }
    }

    private static WritableArray copyReadableArray(ReadableArray readableArray) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (AnonymousClass4.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()]) {
                case 1:
                    writableArrayCreateArray.pushBoolean(readableArray.getBoolean(i10));
                    break;
                case 2:
                    writableArrayCreateArray.pushString(readableArray.getString(i10));
                    break;
                case 3:
                    writableArrayCreateArray.pushNull();
                    break;
                case 4:
                    writableArrayCreateArray.pushDouble(readableArray.getDouble(i10));
                    break;
                case 5:
                    writableArrayCreateArray.pushMap(copyReadableMap(readableArray.getMap(i10)));
                    break;
                case 6:
                    writableArrayCreateArray.pushArray(copyReadableArray(readableArray.getArray(i10)));
                    break;
                default:
                    throw new IllegalStateException("[Reanimated] Unknown type of ReadableArray.");
            }
        }
        return writableArrayCreateArray;
    }

    private static WritableMap copyReadableMap(ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        return writableMapCreateMap;
    }

    private void handleEvent(int i10, String str, WritableMap writableMap) {
        this.mCustomEventHandler.receiveEvent(i10, str, writableMap);
    }

    private void handleEvent(com.facebook.react.uimanager.events.d dVar) {
        dVar.dispatch(this.mCustomEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(EventDispatcher eventDispatcher) {
        eventDispatcher.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationFrame(long j10) {
        double dLongValue = j10 / 1000000.0d;
        if (this.mSlowAnimationsEnabled) {
            dLongValue = ((dLongValue - this.mFirstUptime.longValue()) / ((double) this.mAnimationsDragFactor)) + this.mFirstUptime.longValue();
        }
        if (dLongValue > this.lastFrameTimeMs) {
            this.lastFrameTimeMs = dLongValue;
            while (!this.mEventQueue.isEmpty()) {
                CopiedEvent copiedEventPoll = this.mEventQueue.poll();
                handleEvent(copiedEventPoll.getTargetTag(), copiedEventPoll.getEventName(), copiedEventPoll.getPayload());
            }
            if (!this.mFrameCallbacks.isEmpty()) {
                List<OnAnimationFrame> list = this.mFrameCallbacks;
                this.mFrameCallbacks = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).onAnimationFrame(dLongValue);
                }
            }
            performOperations();
        }
        this.mCallbackPosted.set(false);
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.n(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
        }
    }

    public void configureProps(Set<String> set, Set<String> set2) {
        this.uiProps = set;
        this.nativeProps = set2;
    }

    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new AnonymousClass1(reactContext.getExceptionHandler(), i10, str, readableArray));
    }

    public void enableSlowAnimations(boolean z10, int i10) {
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationsDragFactor = i10;
        if (z10) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void enqueueUpdateViewOnNativeThread(int i10, WritableMap writableMap, boolean z10) {
        if (z10) {
            this.mTryRunBatchUpdatesSynchronously = true;
        }
        this.mOperationsInBatch.add(new NativeUpdateOperation(i10, writableMap));
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationManager;
    }

    public UIManagerModule.d getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public void initWithContext(ReactApplicationContext reactApplicationContext) {
        this.mNativeProxy = new NativeProxy(reactApplicationContext, this.mWorkletsModule);
        this.mAnimationManager.setAndroidUIScheduler(this.mWorkletsModule.getAndroidUIScheduler());
        ReaCompatibility reaCompatibility = new ReaCompatibility(reactApplicationContext);
        this.compatibility = reaCompatibility;
        reaCompatibility.registerFabricEventListener(this);
    }

    public void invalidate() {
        AnimationsManager animationsManager = this.mAnimationManager;
        if (animationsManager != null) {
            animationsManager.invalidate();
        }
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.invalidate();
            this.mNativeProxy = null;
        }
        ReaCompatibility reaCompatibility = this.compatibility;
        if (reaCompatibility != null) {
            reaCompatibility.unregisterFabricEventListener(this);
        }
        Runnable runnable = this.mUnsubscribe;
        if (runnable != null) {
            runnable.run();
            this.mUnsubscribe = null;
        }
    }

    public boolean isAnimationRunning() {
        return this.mCallbackPosted.get();
    }

    public float[] measure(int i10) {
        try {
            return NativeMethodsHelper.measure(this.mUIManager.resolveView(i10));
        } catch (C2275s e10) {
            e10.printStackTrace();
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    public String obtainProp(int i10, String str) {
        try {
            View viewResolveView = this.mUIManager.resolveView(i10);
            str.getClass();
            switch (str) {
                case "opacity":
                    return Float.toString(viewResolveView.getAlpha());
                case "height":
                    return Float.toString(H.g(viewResolveView.getHeight()));
                case "zIndex":
                    return Float.toString(viewResolveView.getElevation());
                case "top":
                    return Float.toString(H.g(viewResolveView.getTop()));
                case "left":
                    return Float.toString(H.g(viewResolveView.getLeft()));
                case "width":
                    return Float.toString(H.g(viewResolveView.getWidth()));
                case "backgroundColor":
                    Drawable background = viewResolveView.getBackground();
                    try {
                        String str2 = String.format("%08x", Integer.valueOf(((Integer) background.getClass().getMethod("getColor", null).invoke(background, null)).intValue()));
                        return "#" + str2.substring(2, 8) + str2.substring(0, 2);
                    } catch (Exception unused) {
                        return "Unable to resolve background color";
                    }
                default:
                    throw new IllegalArgumentException("[Reanimated] Attempted to get unsupported property " + str + " with function `getViewProp`");
            }
        } catch (Exception unused2) {
            return "[Reanimated] Unable to resolve view";
        }
    }

    @Override // com.facebook.react.uimanager.events.i
    public void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
        if (this.mNativeProxy == null) {
            return;
        }
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(dVar);
            performOperations();
            return;
        }
        if (this.mNativeProxy.isAnyHandlerWaitingForEvent(this.mCustomEventNamesResolver.a(dVar.getEventName()), dVar.getViewTag())) {
            this.mEventQueue.offer(new CopiedEvent(dVar));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void performOperations() {
        if (this.mOperationsInBatch.isEmpty()) {
            return;
        }
        Queue<NativeUpdateOperation> queue = this.mOperationsInBatch;
        this.mOperationsInBatch = new LinkedList();
        boolean z10 = this.mTryRunBatchUpdatesSynchronously;
        this.mTryRunBatchUpdatesSynchronously = false;
        Semaphore semaphore = new Semaphore(0);
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new AnonymousClass3(reactContext.getExceptionHandler(), z10, semaphore, queue));
        if (z10) {
            try {
                semaphore.tryAcquire(16L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void scrollTo(int i10, double d10, double d11, boolean z10) {
        try {
            NativeMethodsHelper.scrollTo(this.mUIManager.resolveView(i10), d10, d11, z10);
        } catch (C2275s e10) {
            e10.printStackTrace();
        }
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
    }

    public void updateProps(int i10, Map<String, Object> map) {
        try {
            if (this.mUIManager.resolveView(i10) == null) {
                return;
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (this.uiProps.contains(key)) {
                    addProp(javaOnlyMap, key, value);
                    z10 = true;
                } else if (this.nativeProps.contains(key)) {
                    addProp(writableMapCreateMap2, key, value);
                    z11 = true;
                } else {
                    addProp(writableMapCreateMap, key, value);
                    z12 = true;
                }
            }
            if (i10 != -1) {
                if (z10) {
                    this.mUIImplementation.V(i10, new X(javaOnlyMap));
                }
                if (z11) {
                    enqueueUpdateViewOnNativeThread(i10, writableMapCreateMap2, true);
                }
                if (z12) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putInt("viewTag", i10);
                    writableMapCreateMap3.putMap("props", writableMapCreateMap);
                    sendEvent("onReanimatedPropsChange", writableMapCreateMap3);
                }
            }
        } catch (C2275s unused) {
        }
    }
}
