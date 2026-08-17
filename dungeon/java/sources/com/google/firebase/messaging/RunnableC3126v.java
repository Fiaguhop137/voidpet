package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3126v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37657a;

    public /* synthetic */ RunnableC3126v(FirebaseMessaging firebaseMessaging) {
        this.f37657a = firebaseMessaging;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37657a.w();
    }
}
