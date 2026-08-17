package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2057m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26168b;

    public /* synthetic */ RunnableC2057m(InterfaceC2068y.a aVar, boolean z10) {
        this.f26167a = aVar;
        this.f26168b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26167a.f26197b)).d(this.f26168b);
    }
}
