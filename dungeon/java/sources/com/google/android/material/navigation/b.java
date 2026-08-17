package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.m0;
import androidx.core.view.L;
import androidx.core.view.Z;
import androidx.core.widget.i;
import p217m1.B;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends FrameLayout implements k.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final int[] f36795G = {16842912};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final d f36796H = new d(null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final d f36797I = new e(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f36798A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f36799B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f36800C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f36801D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f36802E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p010a9.a f36803F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f36805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f36806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f36810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f36811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f36812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f36815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f36816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f36817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ViewGroup f36818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final TextView f36819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextView f36820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f36822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g f36823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f36824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f36825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f36826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ValueAnimator f36827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f36828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f36829z;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (b.this.f36817n.getVisibility() == 0) {
                b bVar = b.this;
                bVar.w(bVar.f36817n);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.b$b, reason: collision with other inner class name */
    class RunnableC0403b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f36831a;

        RunnableC0403b(int i10) {
            this.f36831a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.x(this.f36831a);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f36833a;

        c(float f10) {
            this.f36833a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f36833a);
        }
    }

    private static class d {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        protected float a(float f10, float f11) {
            return Z8.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10, float f11) {
            return Z8.a.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10, float f11) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10, f11));
            view.setScaleY(c(f10, f11));
            view.setAlpha(a(f10, f11));
        }
    }

    private static class e extends d {
        private e() {
            super(null);
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.google.android.material.navigation.b.d
        protected float c(float f10, float f11) {
            return b(f10, f11);
        }
    }

    public b(Context context) {
        super(context);
        this.f36804a = false;
        this.f36821r = -1;
        this.f36822s = 0;
        this.f36828y = f36796H;
        this.f36829z = 0.0f;
        this.f36798A = false;
        this.f36799B = 0;
        this.f36800C = 0;
        this.f36801D = false;
        this.f36802E = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f36815l = (FrameLayout) findViewById(Y8.e.f17102G);
        this.f36816m = findViewById(Y8.e.f17101F);
        ImageView imageView = (ImageView) findViewById(Y8.e.f17103H);
        this.f36817n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(Y8.e.f17104I);
        this.f36818o = viewGroup;
        TextView textView = (TextView) findViewById(Y8.e.f17106K);
        this.f36819p = textView;
        TextView textView2 = (TextView) findViewById(Y8.e.f17105J);
        this.f36820q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f36807d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f36808e = viewGroup.getPaddingBottom();
        this.f36809f = getResources().getDimensionPixelSize(Y8.c.f17017A);
        Z.v0(textView, 2);
        Z.v0(textView2, 2);
        setFocusable(true);
        g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private void g(float f10, float f11) {
        this.f36810g = f10 - f11;
        this.f36811h = (f11 * 1.0f) / f10;
        this.f36812i = (f10 * 1.0f) / f11;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f36815l;
        return frameLayout != null ? frameLayout : this.f36817n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof b) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        p010a9.a aVar = this.f36803F;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f36803F.n();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f36817n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private static Drawable i(ColorStateList colorStateList) {
        return new RippleDrawable(p261o9.b.a(colorStateList), null, null);
    }

    private FrameLayout j(View view) {
        ImageView imageView = this.f36817n;
        if (view == imageView && p010a9.c.f19608a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean k() {
        return this.f36803F != null;
    }

    private boolean l() {
        return this.f36801D && this.f36813j == 2;
    }

    private void m(float f10) {
        if (!this.f36798A || !this.f36804a || !Z.Q(this)) {
            q(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f36827x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36827x = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36829z, f10);
        this.f36827x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f10));
        this.f36827x.setInterpolator(p207l9.d.g(getContext(), Y8.a.f16966N, Z8.a.f18802b));
        this.f36827x.setDuration(p207l9.d.f(getContext(), Y8.a.f16959G, getResources().getInteger(Y8.f.f17146b)));
        this.f36827x.start();
    }

    private void n() {
        g gVar = this.f36823t;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void o() {
        Drawable drawableI = this.f36806c;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f36805b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f36798A && getActiveIndicatorDrawable() != null && this.f36815l != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(p261o9.b.d(this.f36805b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableI == null) {
                drawableI = i(this.f36805b);
            }
        }
        FrameLayout frameLayout = this.f36815l;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f36815l.setForeground(rippleDrawable);
        }
        Z.q0(this, drawableI);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(float f10, float f11) {
        View view = this.f36816m;
        if (view != null) {
            this.f36828y.d(f10, f11, view);
        }
        this.f36829z = f10;
    }

    private static void r(TextView textView, int i10) {
        i.o(textView, i10);
        int i11 = p243n9.c.i(textView.getContext(), i10, 0);
        if (i11 != 0) {
            textView.setTextSize(0, i11);
        }
    }

    private static void s(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private static void t(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private void u(View view) {
        if (k() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            p010a9.c.a(this.f36803F, view, j(view));
        }
    }

    private void v(View view) {
        if (k()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                p010a9.c.d(this.f36803F, view);
            }
            this.f36803F = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (k()) {
            p010a9.c.e(this.f36803F, view, j(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i10) {
        if (this.f36816m == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.f36799B, i10 - (this.f36802E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36816m.getLayoutParams();
        layoutParams.height = l() ? iMin : this.f36800C;
        layoutParams.width = iMin;
        this.f36816m.setLayoutParams(layoutParams);
    }

    private void y() {
        if (l()) {
            this.f36828y = f36797I;
        } else {
            this.f36828y = f36796H;
        }
    }

    private static void z(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f36823t = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        m0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f36804a = true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f36815l;
        if (frameLayout != null && this.f36798A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f36816m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public p010a9.a getBadge() {
        return this.f36803F;
    }

    protected int getItemBackgroundResId() {
        return Y8.d.f17094j;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f36823t;
    }

    protected int getItemDefaultMarginResId() {
        return Y8.c.f17062j0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f36821r;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36818o.getLayoutParams();
        return getSuggestedIconHeight() + (this.f36818o.getVisibility() == 0 ? this.f36809f : 0) + layoutParams.topMargin + this.f36818o.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36818o.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f36818o.getMeasuredWidth() + layoutParams.rightMargin);
    }

    void h() {
        p();
        this.f36823t = null;
        this.f36829z = 0.0f;
        this.f36804a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f36823t;
        if (gVar != null && gVar.isCheckable() && this.f36823t.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36795G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p010a9.a aVar = this.f36803F;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f36823t.getTitle();
            if (!TextUtils.isEmpty(this.f36823t.getContentDescription())) {
                title = this.f36823t.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f36803F.k()));
        }
        B bS1 = B.s1(accessibilityNodeInfo);
        bS1.C0(B.g.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            bS1.A0(false);
            bS1.p0(B.a.f48962i);
        }
        bS1.a1(getResources().getString(Y8.i.f17177h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new RunnableC0403b(i10));
    }

    void p() {
        v(this.f36817n);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f36816m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        o();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f36798A = z10;
        o();
        View view = this.f36816m;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f36800C = i10;
        x(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f36809f != i10) {
            this.f36809f = i10;
            n();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f36802E = i10;
        x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f36801D = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f36799B = i10;
        x(getWidth());
    }

    void setBadge(@NonNull p010a9.a aVar) {
        if (this.f36803F == aVar) {
            return;
        }
        if (k() && this.f36817n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            v(this.f36817n);
        }
        this.f36803F = aVar;
        ImageView imageView = this.f36817n;
        if (imageView != null) {
            u(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f36820q;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f36820q;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f36819p;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f36819p;
        textView4.setPivotY(textView4.getBaseline());
        m(z10 ? 1.0f : 0.0f);
        int i10 = this.f36813j;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    t(getIconOrContainer(), this.f36807d, 49);
                    z(this.f36818o, this.f36808e);
                    this.f36820q.setVisibility(0);
                } else {
                    t(getIconOrContainer(), this.f36807d, 17);
                    z(this.f36818o, 0);
                    this.f36820q.setVisibility(4);
                }
                this.f36819p.setVisibility(4);
            } else if (i10 == 1) {
                z(this.f36818o, this.f36808e);
                if (z10) {
                    t(getIconOrContainer(), (int) (this.f36807d + this.f36810g), 49);
                    s(this.f36820q, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f36819p;
                    float f10 = this.f36811h;
                    s(textView5, f10, f10, 4);
                } else {
                    t(getIconOrContainer(), this.f36807d, 49);
                    TextView textView6 = this.f36820q;
                    float f11 = this.f36812i;
                    s(textView6, f11, f11, 4);
                    s(this.f36819p, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                t(getIconOrContainer(), this.f36807d, 17);
                this.f36820q.setVisibility(8);
                this.f36819p.setVisibility(8);
            }
        } else if (this.f36814k) {
            if (z10) {
                t(getIconOrContainer(), this.f36807d, 49);
                z(this.f36818o, this.f36808e);
                this.f36820q.setVisibility(0);
            } else {
                t(getIconOrContainer(), this.f36807d, 17);
                z(this.f36818o, 0);
                this.f36820q.setVisibility(4);
            }
            this.f36819p.setVisibility(4);
        } else {
            z(this.f36818o, this.f36808e);
            if (z10) {
                t(getIconOrContainer(), (int) (this.f36807d + this.f36810g), 49);
                s(this.f36820q, 1.0f, 1.0f, 0);
                TextView textView7 = this.f36819p;
                float f12 = this.f36811h;
                s(textView7, f12, f12, 4);
            } else {
                t(getIconOrContainer(), this.f36807d, 49);
                TextView textView8 = this.f36820q;
                float f13 = this.f36812i;
                s(textView8, f13, f13, 4);
                s(this.f36819p, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f36819p.setEnabled(z10);
        this.f36820q.setEnabled(z10);
        this.f36817n.setEnabled(z10);
        if (z10) {
            Z.C0(this, L.b(getContext(), 1002));
        } else {
            Z.C0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f36825v) {
            return;
        }
        this.f36825v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = p038c1.a.r(drawable).mutate();
            this.f36826w = drawable;
            ColorStateList colorStateList = this.f36824u;
            if (colorStateList != null) {
                p038c1.a.o(drawable, colorStateList);
            }
        }
        this.f36817n.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36817n.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f36817n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f36824u = colorStateList;
        if (this.f36823t == null || (drawable = this.f36826w) == null) {
            return;
        }
        p038c1.a.o(drawable, colorStateList);
        this.f36826w.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : Z0.b.e(getContext(), i10));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f36806c = drawable;
        o();
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f36808e != i10) {
            this.f36808e = i10;
            n();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f36807d != i10) {
            this.f36807d = i10;
            n();
        }
    }

    public void setItemPosition(int i10) {
        this.f36821r = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f36805b = colorStateList;
        o();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f36813j != i10) {
            this.f36813j = i10;
            y();
            x(getWidth());
            n();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f36814k != z10) {
            this.f36814k = z10;
            n();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.f36822s = i10;
        r(this.f36820q, i10);
        g(this.f36819p.getTextSize(), this.f36820q.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        setTextAppearanceActive(this.f36822s);
        TextView textView = this.f36820q;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) {
        r(this.f36819p, i10);
        g(this.f36819p.getTextSize(), this.f36820q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f36819p.setTextColor(colorStateList);
            this.f36820q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f36819p.setText(charSequence);
        this.f36820q.setText(charSequence);
        g gVar = this.f36823t;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.f36823t;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f36823t.getTooltipText();
        }
        m0.a(this, charSequence);
    }
}
