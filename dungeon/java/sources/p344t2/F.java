package p344t2;

import U1.S;
import Z1.C1694j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1694j f54195b;

    public /* synthetic */ F(I.a aVar, C1694j c1694j) {
        this.f54194a = aVar;
        this.f54195b = c1694j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54194a.f54202b)).p(this.f54195b);
    }
}
