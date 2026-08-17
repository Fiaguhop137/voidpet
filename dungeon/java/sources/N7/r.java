package N7;

/* JADX INFO: loaded from: classes2.dex */
final class r implements L7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f7971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7.c f7973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L7.g f7974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f7975e;

    r(o oVar, String str, L7.c cVar, L7.g gVar, s sVar) {
        this.f7971a = oVar;
        this.f7972b = str;
        this.f7973c = cVar;
        this.f7974d = gVar;
        this.f7975e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // L7.h
    public void a(L7.d dVar) {
        c(dVar, new q());
    }

    public void c(L7.d dVar, L7.j jVar) {
        this.f7975e.a(n.a().e(this.f7971a).c(dVar).f(this.f7972b).d(this.f7974d).b(this.f7973c).a(), jVar);
    }
}
