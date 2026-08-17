package p075e2;

/* JADX INFO: renamed from: e2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3265o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.a f40338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f40339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40340c;

    public /* synthetic */ RunnableC3265o(t.a aVar, t tVar, int i10) {
        this.f40338a = aVar;
        this.f40339b = tVar;
        this.f40340c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a aVar = this.f40338a;
        this.f40339b.l0(aVar.f40349a, aVar.f40350b, this.f40340c);
    }
}
