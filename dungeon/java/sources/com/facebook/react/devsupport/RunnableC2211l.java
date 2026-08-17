package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2211l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2212m f29698b;

    public /* synthetic */ RunnableC2211l(boolean z10, C2212m c2212m) {
        this.f29697a = z10;
        this.f29698b = c2212m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2212m.c(this.f29697a, this.f29698b);
    }
}
