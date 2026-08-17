package p344t2;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f54185b;

    public /* synthetic */ B(I.a aVar, Exception exc) {
        this.f54184a = aVar;
        this.f54185b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54184a.f54202b)).r(this.f54185b);
    }
}
