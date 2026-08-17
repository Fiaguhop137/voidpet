package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2067x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2069z.a f26195b;

    public /* synthetic */ RunnableC2067x(InterfaceC2068y.a aVar, InterfaceC2069z.a aVar2) {
        this.f26194a = aVar;
        this.f26195b = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26194a.f26197b)).f(this.f26195b);
    }
}
