package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2059o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26172b;

    public /* synthetic */ RunnableC2059o(InterfaceC2068y.a aVar, int i10) {
        this.f26171a = aVar;
        this.f26172b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26171a.f26197b)).c(this.f26172b);
    }
}
