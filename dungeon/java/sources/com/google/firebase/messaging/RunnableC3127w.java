package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3127w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37659b;

    public /* synthetic */ RunnableC3127w(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f37658a = firebaseMessaging;
        this.f37659b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging.c(this.f37658a, this.f37659b);
    }
}
