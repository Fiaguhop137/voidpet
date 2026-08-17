package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2061q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26178b;

    public /* synthetic */ RunnableC2061q(InterfaceC2068y.a aVar, String str) {
        this.f26177a = aVar;
        this.f26178b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26177a.f26197b)).k(this.f26178b);
    }
}
