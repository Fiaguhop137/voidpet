package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2215p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2216q f29711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29712b;

    public /* synthetic */ RunnableC2215p(C2216q c2216q, String str) {
        this.f29711a = c2216q;
        this.f29712b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2216q.j(this.f29711a, this.f29712b);
    }
}
