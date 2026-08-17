package com.reactnativegooglesignin;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RNGoogleSigninModule f38654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f38655b;

    public /* synthetic */ h(RNGoogleSigninModule rNGoogleSigninModule, Activity activity) {
        this.f38654a = rNGoogleSigninModule;
        this.f38655b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38654a.lambda$signIn$2(this.f38655b);
    }
}
