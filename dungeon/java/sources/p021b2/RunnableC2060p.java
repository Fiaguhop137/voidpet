package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2060p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26176d;

    public /* synthetic */ RunnableC2060p(InterfaceC2068y.a aVar, String str, long j10, long j11) {
        this.f26173a = aVar;
        this.f26174b = str;
        this.f26175c = j10;
        this.f26176d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26173a.f26197b)).l(this.f26174b, this.f26175c, this.f26176d);
    }
}
