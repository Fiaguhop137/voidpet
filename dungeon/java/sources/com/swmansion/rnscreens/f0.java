package com.swmansion.rnscreens;

import android.animation.ValueAnimator;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f39077a;

    public /* synthetic */ f0(Window window) {
        this.f39077a = window;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        e0.b.b(this.f39077a, valueAnimator);
    }
}
