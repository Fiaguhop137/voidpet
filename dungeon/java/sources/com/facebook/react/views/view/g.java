package com.facebook.react.views.view;

import Ad.InterfaceC0791a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.W;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C2241a;
import com.facebook.react.uimanager.C2247d;
import com.facebook.react.uimanager.C2281y;
import com.facebook.react.uimanager.EnumC2282z;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.InterfaceC2246c0;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.S;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p080e7.o;
import p080e7.q;

/* JADX INFO: loaded from: classes2.dex */
public class g extends ViewGroup implements X6.d, L, S, X6.c, InterfaceC2246c0, Q {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;

    @NotNull
    private static final b Companion = new b(null);

    @NotNull
    private static final ViewGroup.LayoutParams defaultLayoutParam = new ViewGroup.LayoutParams(0, 0);

    @Nullable
    private A0 _drawingOrderHelper;

    @Nullable
    private q _overflow;
    private boolean _removeClippedSubviews;

    @Nullable
    private AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;

    @Nullable
    private View[] allChildren;
    private int allChildrenCount;

    @Nullable
    private List<String> axOrderList;
    private float backfaceOpacity;
    private boolean backfaceVisible;

    @Nullable
    private a childrenLayoutChangeListener;

    @Nullable
    private Set<Integer> childrenRemovedWhileTransitioning;

    @Nullable
    private Rect clippingRect;

    @Nullable
    private Rect hitSlopRect;
    private volatile boolean inSubviewClippingLoop;
    private boolean needsOffscreenAlphaCompositing;

    @Nullable
    private X6.b onInterceptTouchEventListener;

    @NotNull
    private final Rect overflowInset;

    @NotNull
    private I pointerEvents;
    private int recycleCount;

    private static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f31271a;

        public a(g gVar) {
            this.f31271a = gVar;
        }

        public final void a() {
            this.f31271a = null;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            g gVar;
            Intrinsics.checkNotNullParameter(v10, "v");
            g gVar2 = this.f31271a;
            if (gVar2 == null || !gVar2.getRemoveClippedSubviews() || (gVar = this.f31271a) == null) {
                return;
            }
            gVar.u(v10);
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(View view, boolean z10) {
            view.setTag(AbstractC2232l.f29812F, Boolean.valueOf(z10));
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31272a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31272a = iArr;
        }
    }

    public g(Context context) {
        super(context);
        this.overflowInset = new Rect();
        this.pointerEvents = I.AUTO;
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(g gVar, boolean z10) {
        if (z10) {
            return;
        }
        K.f(gVar);
    }

    private final A0 getDrawingOrderHelper() {
        if (this._drawingOrderHelper == null) {
            this._drawingOrderHelper = new A0(this);
        }
        A0 a10 = this._drawingOrderHelper;
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void h(View view, int i10) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i11 = this.allChildrenCount;
        int length = viewArr.length;
        if (i10 == i11) {
            if (length == i11) {
                View[] viewArr2 = new View[length + 12];
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                this.allChildren = viewArr2;
                viewArr = viewArr2;
            }
            int i12 = this.allChildrenCount;
            this.allChildrenCount = i12 + 1;
            viewArr[i12] = view;
            return;
        }
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index=" + i10 + " count=" + i11);
        }
        if (length == i11) {
            View[] viewArr3 = new View[length + 12];
            System.arraycopy(viewArr, 0, viewArr3, 0, i10);
            System.arraycopy(viewArr, i10, viewArr3, i10 + 1, i11 - i10);
            this.allChildren = viewArr3;
            viewArr = viewArr3;
        } else {
            System.arraycopy(viewArr, i10, viewArr, i10 + 1, i11 - i10);
        }
        viewArr[i10] = view;
        this.allChildrenCount++;
    }

    private final void i(View view, boolean z10) {
        if (this.inSubviewClippingLoop) {
            Object tag = view.getTag(AbstractC2232l.f29812F);
            if (!Intrinsics.b(Boolean.valueOf(z10), tag)) {
                ReactSoftExceptionLogger.logSoftException("ReactViewGroup.onViewRemoved", new ReactNoCrashSoftException("View clipping tag mismatch: tag=" + tag + " expected=" + z10));
            }
        }
        if (this._removeClippedSubviews) {
            view.setTag(AbstractC2232l.f29812F, Boolean.valueOf(z10));
        } else {
            view.setTag(AbstractC2232l.f29812F, null);
        }
    }

    private final boolean j() {
        return getId() != -1 && Z6.a.a(getId()) == 2;
    }

    private final int k(View view) {
        int i10 = this.allChildrenCount;
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (viewArr[i11] == view) {
                return i11;
            }
        }
        return -1;
    }

    private final void l() {
        setClipChildren(false);
        this._removeClippedSubviews = false;
        this.inSubviewClippingLoop = false;
        this.allChildren = null;
        this.allChildrenCount = 0;
        this.clippingRect = null;
        setHitSlopRect(null);
        this._overflow = q.VISIBLE;
        setPointerEvents(I.AUTO);
        this.childrenLayoutChangeListener = null;
        this.onInterceptTouchEventListener = null;
        this.needsOffscreenAlphaCompositing = false;
        this._drawingOrderHelper = null;
        this.backfaceOpacity = 1.0f;
        this.backfaceVisible = true;
        this.childrenRemovedWhileTransitioning = null;
    }

    private final boolean m(View view) {
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(view.getId()));
    }

    private final boolean n(View view, Integer num) {
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object tag = view.getTag(AbstractC2232l.f29812F);
        if (tag != null) {
            return ((Boolean) tag).booleanValue();
        }
        ViewParent parent = view.getParent();
        boolean zM = m(view);
        if (num != null) {
            ReactSoftExceptionLogger.logSoftException("ReactViewGroup.isViewClipped", new ReactNoCrashSoftException("View missing clipping tag: index=" + num + " parentNull=" + (parent == null) + " parentThis=" + (parent == this) + " transitioning=" + zM));
        }
        if (parent == null || zM) {
            return true;
        }
        if (parent == this) {
            return false;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void o(int i10) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i11 = this.allChildrenCount;
        if (i10 == i11 - 1) {
            int i12 = i11 - 1;
            this.allChildrenCount = i12;
            viewArr[i12] = null;
        } else {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i10 + 1, viewArr, i10, (i11 - i10) - 1);
            int i13 = this.allChildrenCount - 1;
            this.allChildrenCount = i13;
            viewArr[i13] = null;
        }
    }

    private final void p() {
        setPointerEvents(I.AUTO);
    }

    private final void q(int i10) {
        if (this.childrenRemovedWhileTransitioning == null) {
            this.childrenRemovedWhileTransitioning = new LinkedHashSet();
        }
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.add(Integer.valueOf(i10));
        }
    }

    private final void r(Drawable drawable) {
        super.setBackground(drawable);
    }

    private final void s(Rect rect, Set set) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i10 = this.allChildrenCount;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            try {
                t(rect, i12, i11, set);
                if (n(viewArr[i12], Integer.valueOf(i12))) {
                    i11++;
                }
                if (i12 - i11 > getChildCount()) {
                    throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.allChildrenCount + " recycleCount=" + this.recycleCount + "  excludedViews=" + (set != null ? set.size() : 0));
                }
            } catch (IndexOutOfBoundsException e10) {
                HashSet hashSet = new HashSet();
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    i13 += n(viewArr[i14], Integer.valueOf(i14)) ? 1 : 0;
                    hashSet.add(viewArr[i14]);
                }
                throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.allChildrenCount + " recycleCount=" + this.recycleCount + " realClippedSoFar=" + i13 + " uniqueViewsCount=" + hashSet.size() + " excludedViews=" + (set != null ? set.size() : 0), e10);
            }
        }
        this.inSubviewClippingLoop = false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void t(Rect rect, int i10, int i11, Set set) {
        View view;
        boolean z10;
        boolean z11;
        int i12;
        View view2;
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.allChildren;
        if (viewArr != null) {
            view2 = viewArr[i10];
        } else {
            view = 0;
        }
        if (view == 0) {
            view = view2;
            throw new IllegalStateException("Required value was null.");
        }
        boolean zIntersects = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Animation animation = view.getAnimation();
        boolean z12 = false;
        if (animation == null || animation.hasEnded()) {
            view = view2;
            view = view2;
            z10 = false;
        } else {
            z10 = true;
        }
        if (set == null || !set.contains(Integer.valueOf(view.getId()))) {
            view = view2;
            view = view2;
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z13 = set != null;
        if (zIntersects) {
            if (z11) {
                i12 = i10 - i11;
                if (i12 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Companion.b(view, false);
                addViewInLayout(view, i12, defaultLayoutParam, true);
                invalidate();
            } else {
                i12 = i10 - i11;
                if (i12 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Companion.b(view, false);
                addViewInLayout(view, i12, defaultLayoutParam, true);
                invalidate();
            }
            z13 = true;
        } else {
            view = view2;
            if (!n(view, Integer.valueOf(i10)) && !z10 && view != getFocusedChild() && !z11) {
                Companion.b(view, true);
                removeViewInLayout(view);
            } else if ((z11 || zIntersects) && n(view, Integer.valueOf(i10))) {
                i12 = i10 - i11;
                if (i12 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Companion.b(view, false);
                addViewInLayout(view, i12, defaultLayoutParam, true);
                invalidate();
            } else if (zIntersects) {
            }
            z13 = true;
        }
        if (z13) {
            L l10 = view instanceof L ? (L) view : null;
            if (l10 != null && l10.getRemoveClippedSubviews()) {
                z12 = true;
            }
            if (z12) {
                ((L) view).updateClippingRect(set);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(View view) {
        g gVar;
        if (this._removeClippedSubviews && getParent() != null) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            View[] viewArr = this.allChildren;
            if (viewArr == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != (!n(view, null))) {
                this.inSubviewClippingLoop = true;
                int i10 = this.allChildrenCount;
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    View view2 = viewArr[i11];
                    if (view2 == view) {
                        updateSubviewClipStatus$default(this, rect, i11, i12, null, 8, null);
                        gVar = this;
                        gVar.inSubviewClippingLoop = false;
                    } else {
                        int i13 = i11;
                        Rect rect2 = rect;
                        if (n(view2, Integer.valueOf(i13))) {
                            i12++;
                        }
                        rect = rect2;
                        i11 = i13 + 1;
                    }
                }
                gVar = this;
                gVar.inSubviewClippingLoop = false;
            }
        }
    }

    static /* synthetic */ void updateClippingToRect$default(g gVar, Rect rect, Set set, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClippingToRect");
        }
        if ((i10 & 2) != 0) {
            set = null;
        }
        gVar.s(rect, set);
    }

    static /* synthetic */ void updateSubviewClipStatus$default(g gVar, Rect rect, int i10, int i11, Set set, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubviewClipStatus");
        }
        if ((i12 & 8) != 0) {
            set = null;
        }
        gVar.t(rect, i10, i11, set);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(@NotNull ArrayList<View> outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
        g gVar = (g) getTag(AbstractC2232l.f29821g);
        List<String> list = gVar != null ? gVar.axOrderList : null;
        List<String> list2 = this.axOrderList;
        if (list2 == null) {
            if (list == null) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable()) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (isFocusable() && (getContentDescription() == null || Intrinsics.b(getContentDescription(), ""))) {
                super.addChildrenForAccessibility(outChildren);
                K.f30320a.d(this, list);
                return;
            } else {
                if (!isFocusable() || getContentDescription() == null) {
                    return;
                }
                Intrinsics.b(getContentDescription(), "");
                return;
            }
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (this.accessibilityStateChangeListener == null && accessibilityManager != null) {
            f fVar = new f(this);
            accessibilityManager.addAccessibilityStateChangeListener(fVar);
            this.accessibilityStateChangeListener = fVar;
        }
        int size = list2.size();
        View[] viewArr = new View[size];
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            K k10 = K.f30320a;
            View childAt = getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            k10.a(childAt, list2, viewArr);
        }
        for (int i11 = 0; i11 < size; i11++) {
            View view = viewArr[i11];
            if (view != null) {
                if (view.isFocusable()) {
                    outChildren.add(view);
                } else {
                    view.addChildrenForAccessibility(outChildren);
                }
            }
        }
    }

    public final void addViewWithSubviewClippingEnabled$ReactAndroid_release(@NotNull View child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        Companion.b(child, true);
        h(child, i10);
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (n(viewArr[i12], Integer.valueOf(i12))) {
                i11++;
            }
        }
        updateSubviewClipStatus$default(this, rect, i10, i11, null, 8, null);
        this.inSubviewClippingLoop = false;
        child.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
    }

    public final void cleanUpAxOrderListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        Object systemService = getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && (accessibilityStateChangeListener = this.accessibilityStateChangeListener) != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        this.accessibilityStateChangeListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this._overflow != q.VISIBLE || getTag(AbstractC2232l.f29829o) != null) {
            C2241a.a(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (I.f30192a.b(getPointerEvents())) {
            return super.dispatchGenericMotionEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(@NotNull ViewStructure structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        try {
            super.dispatchProvideStructure(structure);
        } catch (NullPointerException e10) {
            W4.a.n("ReactNative", "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z10) {
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT < 29 || Z6.a.c(this) != 2 || !C2247d.a(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c A[PHI: r4
      0x006c: PHI (r4v1 android.graphics.BlendMode) = 
      (r4v0 android.graphics.BlendMode)
      (r4v0 android.graphics.BlendMode)
      (r4v0 android.graphics.BlendMode)
      (r4v3 android.graphics.BlendMode)
     binds: [B:9:0x0022, B:11:0x0029, B:13:0x002f, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j10) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean z10 = child.getElevation() > 0.0f;
        if (z10) {
            com.facebook.react.views.view.a.a(canvas, true);
        }
        BlendMode blendModeA = null;
        if (Build.VERSION.SDK_INT >= 29 && Z6.a.c(this) == 2 && C2247d.a(this)) {
            Object tag = child.getTag(AbstractC2232l.f29833s);
            blendModeA = e.a(tag) ? W.a(tag) : null;
            if (blendModeA != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeA);
                Rect overflowInset = getOverflowInset();
                canvas2 = canvas;
                canvas2.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        boolean zDrawChild = super.drawChild(canvas2, child, j10);
        if (blendModeA != null) {
            canvas2.restore();
        }
        if (z10) {
            com.facebook.react.views.view.a.a(canvas2, false);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    public final int getAllChildrenCount$ReactAndroid_release() {
        return this.allChildrenCount;
    }

    @Nullable
    public final List<String> getAxOrderList() {
        return this.axOrderList;
    }

    @Nullable
    public final View getChildAtWithSubviewClippingEnabled$ReactAndroid_release(int i10) {
        if (i10 < 0 || i10 >= this.allChildrenCount) {
            return null;
        }
        View[] viewArr = this.allChildren;
        if (viewArr != null) {
            return viewArr[i10];
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        return !j() ? getDrawingOrderHelper().c(i10, i11) : i11;
    }

    @Override // com.facebook.react.uimanager.L
    public void getClippingRect(@NotNull Rect outClippingRect) {
        Intrinsics.checkNotNullParameter(outClippingRect, "outClippingRect");
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        outClippingRect.set(rect);
    }

    @Override // X6.c
    @Nullable
    public Rect getHitSlopRect() {
        return this.hitSlopRect;
    }

    @Override // com.facebook.react.uimanager.P
    @Nullable
    public String getOverflow() {
        q qVar = this._overflow;
        int i10 = qVar == null ? -1 : c.f31272a[qVar.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.Q
    @NotNull
    public Rect getOverflowInset() {
        return this.overflowInset;
    }

    @Override // com.facebook.react.uimanager.S
    @NotNull
    public I getPointerEvents() {
        return this.pointerEvents;
    }

    public boolean getRemoveClippedSubviews() {
        return this._removeClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.InterfaceC2246c0
    public int getZIndexMappedChildIndex(int i10) {
        UiThreadUtil.assertOnUiThread();
        return (j() || !getDrawingOrderHelper().h()) ? i10 : getDrawingOrderHelper().c(getChildCount(), i10);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.needsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ReactFeatureFlags.dispatchPointerEvents ? I.f30192a.a(getPointerEvents()) : super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        X6.b bVar = this.onInterceptTouchEventListener;
        if ((bVar == null || !bVar.a(this, event)) && I.f30192a.b(getPointerEvents())) {
            return super.onInterceptTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        B.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return I.f30192a.a(getPointerEvents());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        UiThreadUtil.assertOnUiThread();
        i(child, false);
        if (j()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().f(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().h());
        }
        super.onViewAdded(child);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        UiThreadUtil.assertOnUiThread();
        i(child, true);
        if (j()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().g(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().h());
        }
        if (child.getParent() != null) {
            q(child.getId());
        }
        super.onViewRemoved(child);
    }

    public void recycleView$ReactAndroid_release() {
        a aVar;
        this.recycleCount++;
        View[] viewArr = this.allChildren;
        if (viewArr != null && (aVar = this.childrenLayoutChangeListener) != null) {
            if (aVar != null) {
                aVar.a();
            }
            int i10 = this.allChildrenCount;
            for (int i11 = 0; i11 < i10; i11++) {
                View view = viewArr[i11];
                if (view != null) {
                    view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
                }
            }
        }
        l();
        getOverflowInset().setEmpty();
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        r(null);
        p();
    }

    public final void removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release() {
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i10 = this.allChildrenCount;
        for (int i11 = 0; i11 < i10; i11++) {
            View view = viewArr[i11];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        removeAllViewsInLayout();
        this.allChildrenCount = 0;
    }

    public final void removeViewWithSubviewClippingEnabled$ReactAndroid_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UiThreadUtil.assertOnUiThread();
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
        int iK = k(view);
        if (!n(viewArr[iK], Integer.valueOf(iK))) {
            int i10 = 0;
            for (int i11 = 0; i11 < iK; i11++) {
                if (n(viewArr[i11], Integer.valueOf(i11))) {
                    i10++;
                }
            }
            removeViewsInLayout(iK - i10, 1);
            invalidate();
        }
        o(iK);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public final void setAxOrderList(@Nullable List<String> list) {
        this.axOrderList = list;
    }

    public final void setBackfaceVisibility(@NotNull String backfaceVisibility) {
        Intrinsics.checkNotNullParameter(backfaceVisibility, "backfaceVisibility");
        this.backfaceVisible = Intrinsics.b("visible", backfaceVisibility);
        setBackfaceVisibilityDependantOpacity();
    }

    public final void setBackfaceVisibilityDependantOpacity() {
        if (this.backfaceVisible) {
            setAlpha(this.backfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.backfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C2241a.o(this, Integer.valueOf(i10));
    }

    public final void setBorderColor(int i10, @Nullable Integer num) {
        C2241a.q(this, (o) o.g().get(i10), num);
    }

    @InterfaceC0791a
    public final void setBorderRadius(float f10) {
        C2241a.r(this, p080e7.d.BORDER_RADIUS, Float.isNaN(f10) ? null : new C2281y(f10, EnumC2282z.POINT));
    }

    @InterfaceC0791a
    public final void setBorderRadius(float f10, int i10) {
        C2241a.r(this, (p080e7.d) p080e7.d.g().get(i10), Float.isNaN(f10) ? null : new C2281y(f10, EnumC2282z.POINT));
    }

    public final void setBorderRadius(@NotNull p080e7.d property, @Nullable C2281y c2281y) {
        Intrinsics.checkNotNullParameter(property, "property");
        C2241a.r(this, property, c2281y);
    }

    public final void setBorderStyle(@Nullable String str) {
        C2241a.s(this, str != null ? p080e7.f.f40562a.a(str) : null);
    }

    public final void setBorderWidth(int i10, float f10) {
        C2241a.t(this, (o) o.g().get(i10), Float.valueOf(H.g(f10)));
    }

    public void setHitSlopRect(@Nullable Rect rect) {
        this.hitSlopRect = rect;
    }

    public final void setNeedsOffscreenAlphaCompositing(boolean z10) {
        this.needsOffscreenAlphaCompositing = z10;
    }

    @Override // X6.d
    public void setOnInterceptTouchEventListener(@NotNull X6.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onInterceptTouchEventListener = listener;
    }

    public final void setOpacityIfPossible(float f10) {
        this.backfaceOpacity = f10;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(@Nullable String str) {
        this._overflow = str == null ? q.VISIBLE : q.f40625a.a(str);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.Q
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        if (C2247d.a(this) && (getOverflowInset().left != i10 || getOverflowInset().top != i11 || getOverflowInset().right != i12 || getOverflowInset().bottom != i13)) {
            invalidate();
        }
        getOverflowInset().set(i10, i11, i12, i13);
    }

    public void setPointerEvents(@NotNull I i10) {
        Intrinsics.checkNotNullParameter(i10, "<set-?>");
        this.pointerEvents = i10;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 == this._removeClippedSubviews) {
            return;
        }
        this._removeClippedSubviews = z10;
        this.childrenRemovedWhileTransitioning = null;
        if (z10) {
            Rect rect = new Rect();
            M.a(this, rect);
            this.clippingRect = rect;
            int childCount = getChildCount();
            this.allChildrenCount = childCount;
            View[] viewArr = new View[Math.max(12, childCount)];
            this.childrenLayoutChangeListener = new a(this);
            int i10 = this.allChildrenCount;
            for (int i11 = 0; i11 < i10; i11++) {
                View childAt = getChildAt(i11);
                viewArr[i11] = childAt;
                childAt.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
                b bVar = Companion;
                Intrinsics.c(childAt);
                bVar.b(childAt, false);
            }
            this.allChildren = viewArr;
            updateClippingRect();
            return;
        }
        View[] viewArr2 = this.allChildren;
        if (viewArr2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (this.childrenLayoutChangeListener == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i12 = this.allChildrenCount;
        for (int i13 = 0; i13 < i12; i13++) {
            View view = viewArr2[i13];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        Rect rect2 = this.clippingRect;
        if (rect2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        getDrawingRect(rect2);
        updateClippingToRect$default(this, rect2, null, 2, null);
        this.allChildren = null;
        this.clippingRect = null;
        this.allChildrenCount = 0;
        this.childrenLayoutChangeListener = null;
    }

    @InterfaceC0791a
    public final void setTranslucentBackgroundDrawable(@Nullable Drawable drawable) {
        C2241a.w(this, drawable);
    }

    public void updateClippingRect() {
        updateClippingRect(null);
    }

    @Override // com.facebook.react.uimanager.L
    public void updateClippingRect(@Nullable Set<Integer> set) {
        if (this._removeClippedSubviews) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            M.a(this, rect);
            s(rect, set);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC2246c0
    public void updateDrawingOrder() {
        if (j()) {
            return;
        }
        getDrawingOrderHelper().i();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().h());
        invalidate();
    }
}
