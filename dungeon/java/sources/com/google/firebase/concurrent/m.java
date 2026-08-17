package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f37406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.b f37407b;

    public /* synthetic */ m(Runnable runnable, p.b bVar) {
        this.f37406a = runnable;
        this.f37407b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.m(this.f37406a, this.f37407b);
    }
}
