package U5;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P4.d f13127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p025b6.k f13128d;

    public /* synthetic */ e(Object obj, j jVar, P4.d dVar, p025b6.k kVar) {
        this.f13125a = obj;
        this.f13126b = jVar;
        this.f13127c = dVar;
        this.f13128d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.q(this.f13125a, this.f13126b, this.f13127c, this.f13128d);
    }
}
