package U7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7.o f13339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f13341d;

    public /* synthetic */ g(r rVar, N7.o oVar, int i10, Runnable runnable) {
        this.f13338a = rVar;
        this.f13339b = oVar;
        this.f13340c = i10;
        this.f13341d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.i(this.f13338a, this.f13339b, this.f13340c, this.f13341d);
    }
}
