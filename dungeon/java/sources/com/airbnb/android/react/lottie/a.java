package com.airbnb.android.react.lottie;

import R3.C1363j;
import R3.P;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1363j f27472a;

    public /* synthetic */ a(C1363j c1363j) {
        this.f27472a = c1363j;
    }

    @Override // R3.P
    public final void onResult(Object obj) {
        LottieAnimationViewManager.createViewInstance$lambda$0(this.f27472a, (Throwable) obj);
    }
}
