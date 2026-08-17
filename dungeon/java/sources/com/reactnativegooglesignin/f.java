package com.reactnativegooglesignin;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RNGoogleSigninModule f38651a;

    public /* synthetic */ f(RNGoogleSigninModule rNGoogleSigninModule) {
        this.f38651a = rNGoogleSigninModule;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) throws Throwable {
        this.f38651a.lambda$signInSilently$0(task);
    }
}
