package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2062s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f26182b;

    public /* synthetic */ RunnableC2062s(InterfaceC2068y.a aVar, Exception exc) {
        this.f26181a = aVar;
        this.f26182b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26181a.f26197b)).e(this.f26182b);
    }
}
