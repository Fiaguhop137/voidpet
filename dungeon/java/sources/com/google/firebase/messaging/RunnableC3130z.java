package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3130z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37665b;

    public /* synthetic */ RunnableC3130z(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f37664a = firebaseMessaging;
        this.f37665b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging.i(this.f37664a, this.f37665b);
    }
}
