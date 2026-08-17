package p075e2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.a f40347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f40348b;

    public /* synthetic */ s(t.a aVar, t tVar) {
        this.f40347a = aVar;
        this.f40348b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a aVar = this.f40347a;
        this.f40348b.F(aVar.f40349a, aVar.f40350b);
    }
}
