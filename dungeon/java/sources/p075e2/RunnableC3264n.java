package p075e2;

/* JADX INFO: renamed from: e2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3264n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.a f40335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f40336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f40337c;

    public /* synthetic */ RunnableC3264n(t.a aVar, t tVar, Exception exc) {
        this.f40335a = aVar;
        this.f40336b = tVar;
        this.f40337c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a aVar = this.f40335a;
        this.f40336b.o0(aVar.f40349a, aVar.f40350b, this.f40337c);
    }
}
