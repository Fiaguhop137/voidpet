package p021b2;

import U1.S;
import Z1.C1694j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1694j f26180b;

    public /* synthetic */ r(InterfaceC2068y.a aVar, C1694j c1694j) {
        this.f26179a = aVar;
        this.f26180b = c1694j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26179a.f26197b)).t(this.f26180b);
    }
}
