package V6;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f14129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f14130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f14131c;

    public /* synthetic */ l(a aVar, n nVar, o oVar) {
        this.f14129a = aVar;
        this.f14130b = nVar;
        this.f14131c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.a.m(this.f14129a, this.f14130b, this.f14131c);
    }
}
