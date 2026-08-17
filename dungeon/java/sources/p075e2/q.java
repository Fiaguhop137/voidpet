package p075e2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.a f40343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f40344b;

    public /* synthetic */ q(t.a aVar, t tVar) {
        this.f40343a = aVar;
        this.f40344b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a aVar = this.f40343a;
        this.f40344b.V(aVar.f40349a, aVar.f40350b);
    }
}
