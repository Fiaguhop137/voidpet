package p344t2;

import Z1.C1694j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1694j f54200b;

    public /* synthetic */ H(I.a aVar, C1694j c1694j) {
        this.f54199a = aVar;
        this.f54200b = c1694j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I.a.d(this.f54199a, this.f54200b);
    }
}
