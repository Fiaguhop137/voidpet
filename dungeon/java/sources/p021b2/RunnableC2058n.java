package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2058n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2069z.a f26170b;

    public /* synthetic */ RunnableC2058n(InterfaceC2068y.a aVar, InterfaceC2069z.a aVar2) {
        this.f26169a = aVar;
        this.f26170b = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26169a.f26197b)).b(this.f26170b);
    }
}
