package p344t2;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54193c;

    public /* synthetic */ E(I.a aVar, long j10, int i10) {
        this.f54191a = aVar;
        this.f54192b = j10;
        this.f54193c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54191a.f54202b)).A(this.f54192b, this.f54193c);
    }
}
