package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3124t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37655a;

    public /* synthetic */ RunnableC3124t(FirebaseMessaging firebaseMessaging) {
        this.f37655a = firebaseMessaging;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging.b(this.f37655a);
    }
}
