package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2056l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f26166b;

    public /* synthetic */ RunnableC2056l(InterfaceC2068y.a aVar, Exception exc) {
        this.f26165a = aVar;
        this.f26166b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26165a.f26197b)).y(this.f26166b);
    }
}
