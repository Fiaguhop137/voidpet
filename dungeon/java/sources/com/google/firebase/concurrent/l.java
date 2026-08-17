package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.b f37405c;

    public /* synthetic */ l(o oVar, Runnable runnable, p.b bVar) {
        this.f37403a = oVar;
        this.f37404b = runnable;
        this.f37405c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37403a.f37410a.execute(new e(this.f37404b, this.f37405c));
    }
}
