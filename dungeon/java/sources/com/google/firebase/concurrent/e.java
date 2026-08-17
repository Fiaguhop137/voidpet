package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f37378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.b f37379b;

    public /* synthetic */ e(Runnable runnable, p.b bVar) {
        this.f37378a = runnable;
        this.f37379b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.i(this.f37378a, this.f37379b);
    }
}
