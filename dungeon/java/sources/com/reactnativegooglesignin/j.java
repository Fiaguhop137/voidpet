package com.reactnativegooglesignin;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RNGoogleSigninModule f38658a;

    public /* synthetic */ j(RNGoogleSigninModule rNGoogleSigninModule) {
        this.f38658a = rNGoogleSigninModule;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f38658a.lambda$signInSilently$1();
    }
}
