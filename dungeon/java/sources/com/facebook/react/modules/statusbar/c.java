package com.facebook.react.modules.statusbar;

import android.animation.ValueAnimator;
import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f29981a;

    public /* synthetic */ c(Activity activity) {
        this.f29981a = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        StatusBarModule.b.b(this.f29981a, valueAnimator);
    }
}
