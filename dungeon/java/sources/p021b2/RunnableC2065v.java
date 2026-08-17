package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2065v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26189b;

    public /* synthetic */ RunnableC2065v(InterfaceC2068y.a aVar, long j10) {
        this.f26188a = aVar;
        this.f26189b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26188a.f26197b)).o(this.f26189b);
    }
}
