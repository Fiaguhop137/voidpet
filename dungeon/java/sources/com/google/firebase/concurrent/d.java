package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f37376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.b f37377b;

    public /* synthetic */ d(Runnable runnable, p.b bVar) {
        this.f37376a = runnable;
        this.f37377b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        o.e(this.f37376a, this.f37377b);
    }
}
