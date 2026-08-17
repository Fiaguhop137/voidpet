package V6;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f14126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f14127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f14128c;

    public /* synthetic */ k(a aVar, n nVar, o oVar) {
        this.f14126a = aVar;
        this.f14127b = nVar;
        this.f14128c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.a.p(this.f14126a, this.f14127b, this.f14128c);
    }
}
