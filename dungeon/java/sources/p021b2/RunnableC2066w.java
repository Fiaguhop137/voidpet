package p021b2;

import U1.S;

/* JADX INFO: renamed from: b2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2066w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2068y.a f26190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26193d;

    public /* synthetic */ RunnableC2066w(InterfaceC2068y.a aVar, int i10, long j10, long j11) {
        this.f26190a = aVar;
        this.f26191b = i10;
        this.f26192c = j10;
        this.f26193d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2068y) S.i(this.f26190a.f26197b)).z(this.f26191b, this.f26192c, this.f26193d);
    }
}
