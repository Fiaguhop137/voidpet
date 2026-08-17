package C5;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1440c;

    public /* synthetic */ f(g gVar, int i10, int i11) {
        this.f1438a = gVar;
        this.f1439b = i10;
        this.f1440c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.n(this.f1438a, this.f1439b, this.f1440c);
    }
}
