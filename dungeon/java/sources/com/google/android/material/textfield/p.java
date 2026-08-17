package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.Z;
import p217m1.AbstractC4001c;

/* JADX INFO: loaded from: classes2.dex */
class p extends s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f37063s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f37065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f37066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f37067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f37068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f37069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC4001c.b f37070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f37074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f37075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f37076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f37077r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f37077r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f37068i = new l(this);
        this.f37069j = new m(this);
        this.f37070k = new n(this);
        this.f37074o = Long.MAX_VALUE;
        this.f37065f = p207l9.d.f(rVar.getContext(), Y8.a.f16963K, 67);
        this.f37064e = p207l9.d.f(rVar.getContext(), Y8.a.f16963K, 50);
        this.f37066g = p207l9.d.g(rVar.getContext(), Y8.a.f16967O, Z8.a.f18801a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37066g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new i(this));
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f37077r = E(this.f37065f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f37064e, 1.0f, 0.0f);
        this.f37076q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f37074o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    private void H(boolean z10) {
        if (this.f37073n != z10) {
            this.f37073n = z10;
            this.f37077r.cancel();
            this.f37076q.start();
        }
    }

    private void I() {
        this.f37067h.setOnTouchListener(new j(this));
        if (f37063s) {
            this.f37067h.setOnDismissListener(new k(this));
        }
        this.f37067h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f37067h == null) {
            return;
        }
        if (G()) {
            this.f37072m = false;
        }
        if (this.f37072m) {
            this.f37072m = false;
            return;
        }
        if (f37063s) {
            H(!this.f37073n);
        } else {
            this.f37073n = !this.f37073n;
            r();
        }
        if (!this.f37073n) {
            this.f37067h.dismissDropDown();
        } else {
            this.f37067h.requestFocus();
            this.f37067h.showDropDown();
        }
    }

    private void K() {
        this.f37072m = true;
        this.f37074o = System.currentTimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f37067h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f37072m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f37067h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        Z.v0(pVar.f37112d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f37112d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f37071l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f37072m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f37072m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f37075p.isTouchExplorationEnabled() && q.a(this.f37067h) && !this.f37112d.hasFocus()) {
            this.f37067h.dismissDropDown();
        }
        this.f37067h.post(new o(this));
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return Y8.i.f17176g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f37063s ? Y8.d.f17091g : Y8.d.f17092h;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f37069j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37068i;
    }

    @Override // com.google.android.material.textfield.s
    public AbstractC4001c.b h() {
        return this.f37070k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f37071l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f37073n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f37067h = D(editText);
        I();
        this.f37109a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f37075p.isTouchExplorationEnabled()) {
            Z.v0(this.f37112d, 2);
        }
        this.f37109a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, p217m1.B b10) {
        if (!q.a(this.f37067h)) {
            b10.z0(Spinner.class.getName());
        }
        if (b10.h0()) {
            b10.M0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f37075p.isEnabled() || q.a(this.f37067h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f37073n && !this.f37067h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f37075p = (AccessibilityManager) this.f37111c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f37067h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f37063s) {
                this.f37067h.setOnDismissListener(null);
            }
        }
    }
}
