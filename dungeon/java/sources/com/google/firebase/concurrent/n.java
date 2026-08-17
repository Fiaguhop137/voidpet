package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f37408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.b f37409b;

    public /* synthetic */ n(Callable callable, p.b bVar) {
        this.f37408a = callable;
        this.f37409b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.d(this.f37408a, this.f37409b);
    }
}
