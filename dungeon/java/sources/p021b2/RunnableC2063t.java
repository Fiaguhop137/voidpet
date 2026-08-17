package p021b2;

import R1.r;
import U1.S;
import Z1.C1697k;

/* JADX INFO: renamed from: b2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2063t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1697k f26185c;

    public /* synthetic */ RunnableC2063t(InterfaceC2068y.a aVar, r rVar, C1697k c1697k) {
        this.f26183a = aVar;
        this.f26184b = rVar;
        this.f26185c = c1697k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26183a.f26197b)).j(this.f26184b, this.f26185c);
    }
}
