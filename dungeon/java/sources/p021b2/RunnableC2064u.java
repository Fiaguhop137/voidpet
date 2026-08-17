package p021b2;

import Z1.C1694j;

/* JADX INFO: renamed from: b2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2064u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1694j f26187b;

    public /* synthetic */ RunnableC2064u(InterfaceC2068y.a aVar, C1694j c1694j) {
        this.f26186a = aVar;
        this.f26187b = c1694j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2068y.a.d(this.f26186a, this.f26187b);
    }
}
