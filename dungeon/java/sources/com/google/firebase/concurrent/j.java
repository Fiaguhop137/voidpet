package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.b f37399c;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.f37397a = oVar;
        this.f37398b = runnable;
        this.f37399c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37397a.f37410a.execute(new m(this.f37398b, this.f37399c));
    }
}
