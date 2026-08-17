package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f37365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37366b;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f37365a = bVar;
        this.f37366b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a(this.f37365a, this.f37366b);
    }
}
