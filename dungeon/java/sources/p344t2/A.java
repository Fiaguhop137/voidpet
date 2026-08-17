package p344t2;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f54183c;

    public /* synthetic */ A(I.a aVar, Object obj, long j10) {
        this.f54181a = aVar;
        this.f54182b = obj;
        this.f54183c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54181a.f54202b)).x(this.f54182b, this.f54183c);
    }
}
