package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.b f37396c;

    public /* synthetic */ i(o oVar, Runnable runnable, p.b bVar) {
        this.f37394a = oVar;
        this.f37395b = runnable;
        this.f37396c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37394a.f37410a.execute(new d(this.f37395b, this.f37396c));
    }
}
