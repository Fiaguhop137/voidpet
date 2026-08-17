package p344t2;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f54190c;

    public /* synthetic */ D(I.a aVar, int i10, long j10) {
        this.f54188a = aVar;
        this.f54189b = i10;
        this.f54190c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54188a.f54202b)).v(this.f54189b, this.f54190c);
    }
}
