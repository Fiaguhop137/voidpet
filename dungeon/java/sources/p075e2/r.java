package p075e2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.a f40345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f40346b;

    public /* synthetic */ r(t.a aVar, t tVar) {
        this.f40345a = aVar;
        this.f40346b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a aVar = this.f40345a;
        this.f40346b.c0(aVar.f40349a, aVar.f40350b);
    }
}
