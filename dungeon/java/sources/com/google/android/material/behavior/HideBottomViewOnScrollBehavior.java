package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p207l9.d;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f36158j = Y8.a.f16959G;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f36159k = Y8.a.f16961I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f36160l = Y8.a.f16966N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f36161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f36164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f36165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f36169i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f36169i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f36161a = new LinkedHashSet();
        this.f36166f = 0;
        this.f36167g = 2;
        this.f36168h = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36161a = new LinkedHashSet();
        this.f36166f = 0;
        this.f36167g = 2;
        this.f36168h = 0;
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f36169i = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void M(View view, int i10) {
        this.f36167g = i10;
        Iterator it = this.f36161a.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f36167g == 1;
    }

    public boolean H() {
        return this.f36167g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f36169i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i10 = this.f36166f + this.f36168h;
        if (z10) {
            F(view, i10, this.f36163c, this.f36165e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f36169i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z10) {
            F(view, 0, this.f36162b, this.f36164d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f36166f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f36162b = d.f(view.getContext(), f36158j, 225);
        this.f36163c = d.f(view.getContext(), f36159k, 175);
        Context context = view.getContext();
        int i11 = f36160l;
        this.f36164d = d.g(context, i11, Z8.a.f18804d);
        this.f36165e = d.g(view.getContext(), i11, Z8.a.f18803c);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }
}
