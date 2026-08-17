package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockHandView f37227a;

    public /* synthetic */ a(ClockHandView clockHandView) {
        this.f37227a = clockHandView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ClockHandView.a(this.f37227a, valueAnimator);
    }
}
