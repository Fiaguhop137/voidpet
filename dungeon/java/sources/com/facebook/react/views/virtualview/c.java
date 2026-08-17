package com.facebook.react.views.virtualview;

import Ad.n;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.uimanager.T;
import com.facebook.react.views.scroll.o;
import com.facebook.react.views.scroll.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends com.facebook.react.views.view.g implements o.i, o.f, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f31276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f31277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.facebook.react.views.virtualview.a f31278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f31279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnWindowFocusChangeListener f31282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f31283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f31284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f31285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f31286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31289n;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31290a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Prerender.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31290a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31277b = i.Unknown;
        this.f31279d = D6.b.A();
        this.f31280e = D6.b.q();
        this.f31281f = D6.b.s();
        this.f31282g = new b(this);
        this.f31284i = new Rect();
        this.f31285j = new Rect();
        this.f31286k = new Rect();
    }

    private final void A(f fVar) {
        com.facebook.react.views.virtualview.a aVar = this.f31278c;
        if (aVar != null) {
            aVar.a(fVar, this.f31285j, this.f31286k, true);
        }
    }

    private final void B(f fVar, f fVar2) {
        if (getDebugLogEnabled$ReactAndroid_release()) {
            if (d.f31291a) {
                int id2 = getId();
                String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                W4.a.b("ReactVirtualView:Mode change", ((Object) (fVar + "->" + fVar2)) + " [" + id2 + "][" + nativeId$ReactAndroid_release + "]");
            } else {
                int id3 = getId();
                String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                W4.a.I("ReactVirtualView:Mode change", ((Object) (fVar + "->" + fVar2)) + " [" + id3 + "][" + nativeId$ReactAndroid_release2 + "]");
            }
        }
        p295q7.a.c(0L, "VirtualView::mode change " + fVar + " -> " + fVar2 + ", nativeID=" + getNativeId$ReactAndroid_release());
        int i10 = a.f31290a[fVar2.ordinal()];
        if (i10 == 1) {
            i iVar = this.f31277b;
            if (iVar == i.Unknown || fVar != f.Prerender || iVar != i.Rendered) {
                A(f.Visible);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new n();
            }
            z(f.Hidden);
        } else if (fVar != f.Visible) {
            z(f.Prerender);
        }
        p295q7.a.i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(c cVar, boolean z10) {
        cVar.x(false);
    }

    private final boolean D(Rect rect, Rect rect2) {
        return rect.top < rect2.bottom && rect2.top < rect.bottom && rect.left < rect2.right && rect2.left < rect.right;
    }

    private final ViewGroup E(boolean z10) {
        ViewParent parent = getParent();
        while (parent != null) {
            if (!(parent instanceof com.facebook.react.views.scroll.h) && !(parent instanceof com.facebook.react.views.scroll.g)) {
                if (parent instanceof T) {
                    return null;
                }
                if (parent instanceof View) {
                    View view = (View) parent;
                    view.removeOnLayoutChangeListener(this);
                    if (z10) {
                        view.addOnLayoutChangeListener(this);
                    }
                }
                parent = parent.getParent();
            }
            return (ViewGroup) parent;
        }
        return null;
    }

    private final void F() {
        View view = this.f31283h;
        if (view == null) {
            return;
        }
        this.f31287l = 0;
        this.f31288m = 0;
        this.f31289n = false;
        for (ViewParent parent = getParent(); parent != null && !Intrinsics.b(parent, view); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                this.f31287l += view2.getLeft();
                this.f31288m += view2.getTop();
            }
        }
    }

    private final ViewGroup getParentScrollView() {
        return E(true);
    }

    private final void w() {
        E(false);
    }

    private final void x(boolean z10) {
        View view;
        boolean zD;
        f fVar;
        if (this.f31278c == null || (view = this.f31283h) == null) {
            return;
        }
        if (this.f31289n) {
            F();
        }
        this.f31285j.set(getLeft() + this.f31287l, getTop() + this.f31288m, getRight() + this.f31287l, getBottom() + this.f31288m);
        view.getDrawingRect(this.f31286k);
        if ((this.f31285j.width() == 0 && this.f31285j.height() == 0) || this.f31286k.isEmpty()) {
            if (getDebugLogEnabled$ReactAndroid_release()) {
                if (d.f31291a) {
                    String str = "empty rects target=" + this.f31285j.toShortString() + " threshold=" + this.f31286k.toShortString();
                    W4.a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                String str2 = "empty rects target=" + this.f31285j.toShortString() + " threshold=" + this.f31286k.toShortString();
                W4.a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            return;
        }
        if (z10) {
            if (!this.f31284i.isEmpty() && Intrinsics.b(this.f31284i, this.f31285j)) {
                if (getDebugLogEnabled$ReactAndroid_release()) {
                    if (d.f31291a) {
                        W4.a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) "no rect change") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                        return;
                    }
                    W4.a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) "no rect change") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                return;
            }
            this.f31284i.set(this.f31285j);
        }
        if (D(this.f31285j, this.f31286k)) {
            fVar = (!this.f31281f || hasWindowFocus()) ? f.Visible : f.Prerender;
        } else {
            if (this.f31279d > 0.0d) {
                Rect rect = this.f31286k;
                rect.inset((int) (((double) (-rect.width())) * this.f31279d), (int) (((double) (-this.f31286k.height())) * this.f31279d));
                zD = D(this.f31285j, this.f31286k);
            } else {
                zD = false;
            }
            if (zD) {
                fVar = f.Prerender;
            } else {
                fVar = f.Hidden;
                this.f31286k.setEmpty();
            }
        }
        if (getDebugLogEnabled$ReactAndroid_release()) {
            if (d.f31291a) {
                String str3 = "mode=" + this.f31276a + " target=" + this.f31285j.toShortString() + " threshold=" + this.f31286k.toShortString();
                W4.a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str3) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                String str4 = "mode=" + this.f31276a + " target=" + this.f31285j.toShortString() + " threshold=" + this.f31286k.toShortString();
                W4.a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str4) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        f fVar2 = this.f31276a;
        if (fVar == fVar2) {
            return;
        }
        this.f31276a = fVar;
        B(fVar2, fVar);
    }

    private final void z(f fVar) {
        com.facebook.react.views.virtualview.a aVar = this.f31278c;
        if (aVar != null) {
            aVar.a(fVar, this.f31285j, this.f31286k, false);
        }
    }

    @Override // com.facebook.react.views.scroll.o.i
    public void b(ViewGroup viewGroup) {
        if (Intrinsics.b(viewGroup, this.f31283h)) {
            x(false);
        }
    }

    @Override // com.facebook.react.views.scroll.o.i
    public void c(ViewGroup viewGroup, q qVar, float f10, float f11) {
        if (Intrinsics.b(viewGroup, this.f31283h)) {
            x(false);
        }
    }

    @Override // com.facebook.react.views.scroll.o.f
    public void e(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        if (Intrinsics.b(scrollView, this.f31283h)) {
            this.f31289n = true;
            x(false);
        }
    }

    public final boolean getDebugLogEnabled$ReactAndroid_release() {
        return this.f31280e;
    }

    public final boolean getDetectWindowFocus$ReactAndroid_release() {
        return this.f31281f;
    }

    @Nullable
    public final f getMode$ReactAndroid_release() {
        return this.f31276a;
    }

    @Nullable
    public final com.facebook.react.views.virtualview.a getModeChangeEmitter$ReactAndroid_release() {
        return this.f31278c;
    }

    @Nullable
    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(AbstractC2232l.f29814H);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public final double getPrerenderRatio$ReactAndroid_release() {
        return this.f31279d;
    }

    @NotNull
    public final i getRenderState$ReactAndroid_release() {
        return this.f31277b;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o.B(this);
        o.y(this);
        if (this.f31281f) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.f31282g);
        }
        w();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f31289n = true;
            x(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f31289n = (!this.f31289n && i14 == i10 && i15 == i11) ? false : true;
        x(true);
    }

    @Override // com.facebook.react.views.view.g
    public void recycleView$ReactAndroid_release() {
        o.B(this);
        o.y(this);
        w();
        this.f31276a = null;
        this.f31278c = null;
        this.f31284i.setEmpty();
        this.f31283h = null;
        this.f31287l = 0;
        this.f31288m = 0;
        this.f31289n = false;
    }

    public final void setMode$ReactAndroid_release(@Nullable f fVar) {
        this.f31276a = fVar;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(@Nullable com.facebook.react.views.virtualview.a aVar) {
        this.f31278c = aVar;
    }

    public final void setPrerenderRatio$ReactAndroid_release(double d10) {
        this.f31279d = d10;
    }

    public final void setRenderState$ReactAndroid_release(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f31277b = iVar;
    }

    public final void y() {
        ViewGroup parentScrollView = getParentScrollView();
        if (parentScrollView != null) {
            this.f31289n = true;
            o.f(this);
            o.e(this);
        } else {
            parentScrollView = null;
        }
        this.f31283h = parentScrollView;
        if (getDebugLogEnabled$ReactAndroid_release()) {
            if (d.f31291a) {
                W4.a.b("ReactVirtualView:onAttachedToWindow", ((Object) "") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                W4.a.I("ReactVirtualView:onAttachedToWindow", ((Object) "") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        if (this.f31281f) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.f31282g);
        }
        x(false);
    }
}
