package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class D {
    private static final String TAG;
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final X6.a mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private final p062d7.f mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final J0 mViewManagers;

    class a implements p062d7.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f30167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f30168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f30169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f30170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30171e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i10) {
            this.f30167a = viewGroupManager;
            this.f30168b = viewGroup;
            this.f30169c = view;
            this.f30170d = set;
            this.f30171e = i10;
        }

        @Override // p062d7.g
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f30167a.removeView(this.f30168b, this.f30169c);
            D.this.dropView(this.f30169c);
            this.f30170d.remove(Integer.valueOf(this.f30169c.getId()));
            if (this.f30170d.isEmpty()) {
                D.this.mPendingDeletionsForTag.remove(Integer.valueOf(this.f30171e));
            }
        }
    }

    static {
        p348t6.b.a("NativeViewHierarchyManager", p348t6.a.ERROR);
        TAG = D.class.getSimpleName();
    }

    public D(J0 j10) {
        this(j10, new RootViewManager());
    }

    public D(J0 j10, RootViewManager rootViewManager) {
        p384v6.a aVar = p384v6.a.f56276a;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new X6.a();
        this.mLayoutAnimator = new p062d7.f();
        this.mBoundingBox = new RectF();
        this.mViewManagers = j10;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    private boolean b(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void c(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        g(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String d(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, x0[] x0VarArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i10 = 0; viewGroupManager.getChildAt(viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt(viewGroup, i12) == null || i11 >= 16) {
                        break;
                    }
                    sb2.append(viewGroupManager.getChildAt(viewGroup, i12).getId() + ",");
                    i11++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 >= iArr.length || i14 >= 16) {
                        break;
                    }
                    sb2.append(iArr[i15] + ",");
                    i14++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (x0VarArr != null) {
            sb2.append("  viewsToAdd(" + x0VarArr.length + "): [\n");
            for (int i16 = 0; i16 < x0VarArr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 >= x0VarArr.length || i17 >= 16) {
                        break;
                    }
                    sb2.append("[" + x0VarArr[i18].f30673b + "," + x0VarArr[i18].f30672a + "],");
                    i17++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 >= iArr2.length || i20 >= 16) {
                        break;
                    }
                    sb2.append(iArr2[i21] + ",");
                    i20++;
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String e(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        x0[] x0VarArr = new x0[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            x0VarArr[i10] = new x0(readableArray.getInt(i10), i10);
        }
        return d(viewGroup, viewGroupManager, null, x0VarArr, null);
    }

    private Set f(int i10) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i10))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i10), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i10));
    }

    private void g(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    private void h(View view, long j10) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(AbstractC2232l.f29813G, Long.valueOf(j10));
    }

    private void i(View view, int i10, int i11, int i12, int i13) {
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view, i10, i11, i12, i13);
        } else {
            view.layout(i10, i11, i10 + i12, i11 + i13);
        }
    }

    public synchronized void addRootView(int i10, View view) {
        addRootViewGroup(i10, view);
    }

    protected final synchronized void addRootViewGroup(int i10, View view) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.d(TAG, "addRootViewGroup[%d]: %s", Integer.valueOf(i10), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                W4.a.m(TAG, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.mTagsToViews.put(i10, view);
            this.mTagsToViewManagers.put(i10, this.mRootViewManager);
            this.mRootTags.put(i10, true);
            view.setId(i10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    synchronized void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(C2262k0 c2262k0, int i10, String str, X x10) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.e(TAG, "createView[%d]: %s %s", Integer.valueOf(i10), str, x10 != null ? x10.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            p295q7.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
            try {
                ViewManager viewManagerG = this.mViewManagers.g(str);
                this.mTagsToViews.put(i10, viewManagerG.createView(i10, c2262k0, x10, null, this.mJSResponderHandler));
                this.mTagsToViewManagers.put(i10, viewManagerG);
                p295q7.a.i(0L);
            } catch (Throwable th) {
                p295q7.a.i(0L);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.e(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i10), Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
            }
            resolveViewManager(i10).receiveCommand(view, i11, readableArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.e(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i10), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
            }
            resolveViewManager(i10).receiveCommand(view, str, readableArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected synchronized void dropView(View view) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.c(TAG, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.mTagsToViewManagers.get(view.getId()) == null) {
                return;
            }
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        W4.a.m(TAG, "Unable to drop null child view");
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int findTargetTagForTouch(int i10, float f10, float f11) {
        View view;
        try {
            if (this.DEBUG_MODE) {
                W4.a.e(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return C2264l0.d(f10, f11, (ViewGroup) view);
    }

    public synchronized long getInstanceHandle(int i10) {
        Long l10;
        View view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new C2275s("Unable to find view for tag: " + i10);
        }
        l10 = (Long) view.getTag(AbstractC2232l.f29813G);
        if (l10 == null) {
            throw new C2275s("Unable to find instanceHandle for tag: " + i10);
        }
        return l10.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    public synchronized void manageChildren(int i10, int[] iArr, x0[] x0VarArr, int[] iArr2) throws Throwable {
        Throwable th;
        int i11;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        W4.a.f(TAG, "createView[%d]: %s %s %s", Integer.valueOf(i10), iArr != null ? iArr.toString() : "<null>", x0VarArr != null ? x0VarArr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                Set setF = f(i10);
                ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
                ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
                if (viewGroup == null) {
                    throw new C2275s("Trying to manageChildren view with tag " + i10 + " which doesn't exist\n detail: " + d(viewGroup, viewGroupManager, iArr, x0VarArr, iArr2));
                }
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (length >= 0) {
                        int i12 = iArr[length];
                        if (i12 < 0) {
                            throw new C2275s("Trying to remove a negative view index:" + i12 + " view tag: " + i10 + "\n detail: " + d(viewGroup, viewGroupManager, iArr, x0VarArr, iArr2));
                        }
                        if (viewGroupManager.getChildAt(viewGroup, i12) == null) {
                            if (this.mRootTags.get(i10) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                return;
                            }
                            throw new C2275s("Trying to remove a view index above child count " + i12 + " view tag: " + i10 + "\n detail: " + d(viewGroup, viewGroupManager, iArr, x0VarArr, iArr2));
                        }
                        if (i12 >= childCount) {
                            throw new C2275s("Trying to remove an out of order view index:" + i12 + " view tag: " + i10 + "\n detail: " + d(viewGroup, viewGroupManager, iArr, x0VarArr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, i12);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !b(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, i12);
                        }
                        length--;
                        childCount = i12;
                    }
                }
                if (iArr2 != null) {
                    int i13 = 0;
                    while (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        View view = this.mTagsToViews.get(i14);
                        if (view == null) {
                            throw new C2275s("Trying to destroy unknown view tag: " + i14 + "\n detail: " + d(viewGroup, viewGroupManager, iArr, x0VarArr, iArr2));
                        }
                        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                            setF.add(Integer.valueOf(i14));
                            i11 = i10;
                            this.mLayoutAnimator.deleteView(view, new a(viewGroupManager, viewGroup, view, setF, i11));
                        } else {
                            i11 = i10;
                            dropView(view);
                        }
                        i13++;
                        i10 = i11;
                    }
                }
                int i15 = i10;
                if (x0VarArr != null) {
                    for (x0 x0Var : x0VarArr) {
                        View view2 = this.mTagsToViews.get(x0Var.f30672a);
                        if (view2 == null) {
                            throw new C2275s("Trying to add unknown view tag: " + x0Var.f30672a + "\n detail: " + d(viewGroup, viewGroupManager, iArr, x0VarArr, iArr2));
                        }
                        int i16 = x0Var.f30673b;
                        if (!setF.isEmpty()) {
                            i16 = 0;
                            int i17 = 0;
                            while (i16 < viewGroup.getChildCount() && i17 != x0Var.f30673b) {
                                if (!setF.contains(Integer.valueOf(viewGroup.getChildAt(i16).getId()))) {
                                    i17++;
                                }
                                i16++;
                            }
                        }
                        viewGroupManager.addView(viewGroup, view2, i16);
                    }
                }
                if (setF.isEmpty()) {
                    this.mPendingDeletionsForTag.remove(Integer.valueOf(i15));
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public synchronized void measure(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.c(TAG, "measure[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new F("No native view for " + i10 + " currently exists");
            }
            View view2 = (View) C2254g0.a(view);
            if (view2 == null) {
                throw new F("Native view " + i10 + " is no longer on screen");
            }
            c(view2, iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            c(view, iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void measureInWindow(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.c(TAG, "measureInWindow[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new F("No native view for " + i10 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void removeRootView(int i10) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.c(TAG, "removeRootView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i10)) {
                SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
            }
            View view = this.mTagsToViews.get(i10);
            dropView(view);
            this.mRootTags.delete(i10);
            if (view != null) {
                view.setId(-1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View resolveView(int i10) {
        View view;
        view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new C2275s("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i10) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i10);
        if (viewManager == null) {
            throw new C2275s("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i10, int i11) {
        View view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i10);
        }
        view.sendAccessibilityEvent(i11);
    }

    public synchronized void setChildren(int i10, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.d(TAG, "setChildren[%d]: %s", Integer.valueOf(i10), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                View view = this.mTagsToViews.get(readableArray.getInt(i11));
                if (view == null) {
                    throw new C2275s("Trying to add unknown view tag: " + readableArray.getInt(i11) + "\n detail: " + e(viewGroup, viewGroupManager, readableArray));
                }
                viewGroupManager.addView(viewGroup, view, i11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        try {
            if (!z10) {
                this.mJSResponderHandler.d(i11, null);
                return;
            }
            View view = this.mTagsToViews.get(i10);
            if (i11 != i10 && (view instanceof ViewParent)) {
                this.mJSResponderHandler.d(i11, (ViewParent) view);
                return;
            }
            if (this.mRootTags.get(i10)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
            }
            this.mJSResponderHandler.d(i11, view.getParent());
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setLayoutAnimationEnabled(boolean z10) {
        this.mLayoutAnimationEnabled = z10;
    }

    public synchronized void updateInstanceHandle(int i10, long j10) {
        UiThreadUtil.assertOnUiThread();
        try {
            h(resolveView(i10), j10);
        } catch (C2275s e10) {
            W4.a.n(TAG, "Unable to update properties for view tag " + i10, e10);
        }
    }

    @Deprecated
    public void updateLayout(int i10, int i11, int i12, int i13, int i14) throws Throwable {
        updateLayout(i10, i10, i11, i12, i13, i14, com.facebook.yoga.h.INHERIT);
    }

    public synchronized void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) throws Throwable {
        Throwable th;
        Throwable th2;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        W4.a.h(TAG, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                p295q7.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i11).c();
                try {
                    View viewResolveView = resolveView(i11);
                    viewResolveView.setLayoutDirection(C2278v.a(hVar));
                    viewResolveView.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                    ViewParent parent = viewResolveView.getParent();
                    if (parent instanceof InterfaceC2252f0) {
                        try {
                            parent.requestLayout();
                        } catch (Throwable th4) {
                            th2 = th4;
                            p295q7.a.i(0L);
                            throw th2;
                        }
                    }
                    if (this.mRootTags.get(i10)) {
                        try {
                            i(viewResolveView, i12, i13, i14, i15);
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            p295q7.a.i(0L);
                            throw th2;
                        }
                    } else {
                        NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i10);
                        if (!(nativeModule instanceof r)) {
                            throw new C2275s("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                        }
                        r rVar = (r) nativeModule;
                        if (rVar != null && !rVar.needsCustomLayoutForChildren()) {
                            i(viewResolveView, i12, i13, i14, i15);
                        }
                    }
                    p295q7.a.i(0L);
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                th = th;
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public synchronized void updateProperties(int i10, X x10) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i10), x10.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager viewManagerResolveViewManager = resolveViewManager(i10);
                View viewResolveView = resolveView(i10);
                if (x10 != null) {
                    viewManagerResolveViewManager.updateProperties(viewResolveView, x10);
                }
            } catch (C2275s e10) {
                W4.a.n(TAG, "Unable to update properties for view tag " + i10, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateViewExtraData(int i10, Object obj) {
        try {
            if (this.DEBUG_MODE) {
                W4.a.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i10), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            resolveViewManager(i10).updateExtraData(resolveView(i10), obj);
        } catch (Throwable th) {
            throw th;
        }
    }
}
