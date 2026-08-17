package com.google.firebase.messaging;

import android.content.Intent;

/* JADX INFO: renamed from: com.google.firebase.messaging.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3121p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3122q f37651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f37652b;

    public /* synthetic */ RunnableC3121p(C3122q c3122q, Intent intent) {
        this.f37651a = c3122q;
        this.f37652b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37651a.b(this.f37652b);
    }
}
