package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3103f extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f37044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f37045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f37046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f37047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f37048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f37049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f37050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f37051m;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3103f.this.f37110b.a0(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3103f.this.f37110b.a0(false);
        }
    }

    C3103f(r rVar) {
        super(rVar);
        this.f37048j = new ViewOnClickListenerC3098a(this);
        this.f37049k = new ViewOnFocusChangeListenerC3099b(this);
        this.f37043e = p207l9.d.f(rVar.getContext(), Y8.a.f16963K, 100);
        this.f37044f = p207l9.d.f(rVar.getContext(), Y8.a.f16963K, 150);
        this.f37045g = p207l9.d.g(rVar.getContext(), Y8.a.f16967O, Z8.a.f18801a);
        this.f37046h = p207l9.d.g(rVar.getContext(), Y8.a.f16966N, Z8.a.f18804d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f37110b.F() == z10;
        if (z10 && !this.f37050l.isRunning()) {
            this.f37051m.cancel();
            this.f37050l.start();
            if (z11) {
                this.f37050l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f37050l.cancel();
        this.f37051m.start();
        if (z11) {
            this.f37051m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37045g);
        valueAnimatorOfFloat.setDuration(this.f37043e);
        valueAnimatorOfFloat.addUpdateListener(new C3100c(this));
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f37046h);
        valueAnimatorOfFloat.setDuration(this.f37044f);
        valueAnimatorOfFloat.addUpdateListener(new C3102e(this));
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f37050l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f37050l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f37051m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f37047i;
        if (editText != null) {
            return (editText.hasFocus() || this.f37112d.hasFocus()) && this.f37047i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(C3103f c3103f, View view) {
        EditText editText = c3103f.f37047i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c3103f.r();
    }

    public static /* synthetic */ void x(C3103f c3103f, ValueAnimator valueAnimator) {
        c3103f.getClass();
        c3103f.f37112d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(C3103f c3103f, ValueAnimator valueAnimator) {
        c3103f.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c3103f.f37112d.setScaleX(fFloatValue);
        c3103f.f37112d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f37110b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return Y8.i.f17174e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return Y8.d.f17093i;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f37049k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37048j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f37049k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f37047i = editText;
        this.f37109a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z10) {
        if (this.f37110b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f37047i;
        if (editText != null) {
            editText.post(new RunnableC3101d(this));
        }
    }
}
