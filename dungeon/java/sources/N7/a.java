package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Q9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q9.a f7898a = new a();

    /* JADX INFO: renamed from: N7.a$a, reason: collision with other inner class name */
    private static final class C0135a implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0135a f7899a = new C0135a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7900b = P9.c.a("window").b(S9.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final P9.c f7901c = P9.c.a("logSourceMetrics").b(S9.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final P9.c f7902d = P9.c.a("globalMetrics").b(S9.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final P9.c f7903e = P9.c.a("appNamespace").b(S9.a.b().c(4).a()).a();

        private C0135a() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q7.a aVar, P9.e eVar) {
            eVar.e(f7900b, aVar.d());
            eVar.e(f7901c, aVar.c());
            eVar.e(f7902d, aVar.b());
            eVar.e(f7903e, aVar.a());
        }
    }

    private static final class b implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f7904a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7905b = P9.c.a("storageMetrics").b(S9.a.b().c(1).a()).a();

        private b() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q7.b bVar, P9.e eVar) {
            eVar.e(f7905b, bVar.a());
        }
    }

    private static final class c implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f7906a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7907b = P9.c.a("eventsDroppedCount").b(S9.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final P9.c f7908c = P9.c.a("reason").b(S9.a.b().c(3).a()).a();

        private c() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q7.c cVar, P9.e eVar) {
            eVar.a(f7907b, cVar.a());
            eVar.e(f7908c, cVar.b());
        }
    }

    private static final class d implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f7909a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7910b = P9.c.a("logSource").b(S9.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final P9.c f7911c = P9.c.a("logEventDropped").b(S9.a.b().c(2).a()).a();

        private d() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q7.d dVar, P9.e eVar) {
            eVar.e(f7910b, dVar.b());
            eVar.e(f7911c, dVar.a());
        }
    }

    private static final class e implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f7912a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7913b = P9.c.d("clientMetrics");

        private e() {
        }

        @Override // P9.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (P9.e) obj2);
        }

        public void b(l lVar, P9.e eVar) {
            throw null;
        }
    }

    private static final class f implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f7914a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7915b = P9.c.a("currentCacheSizeBytes").b(S9.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final P9.c f7916c = P9.c.a("maxCacheSizeBytes").b(S9.a.b().c(2).a()).a();

        private f() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q7.e eVar, P9.e eVar2) {
            eVar2.a(f7915b, eVar.a());
            eVar2.a(f7916c, eVar.b());
        }
    }

    private static final class g implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f7917a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f7918b = P9.c.a("startMs").b(S9.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final P9.c f7919c = P9.c.a("endMs").b(S9.a.b().c(2).a()).a();

        private g() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q7.f fVar, P9.e eVar) {
            eVar.a(f7918b, fVar.b());
            eVar.a(f7919c, fVar.a());
        }
    }

    private a() {
    }

    @Override // Q9.a
    public void a(Q9.b bVar) {
        bVar.a(l.class, e.f7912a);
        bVar.a(Q7.a.class, C0135a.f7899a);
        bVar.a(Q7.f.class, g.f7917a);
        bVar.a(Q7.d.class, d.f7909a);
        bVar.a(Q7.c.class, c.f7906a);
        bVar.a(Q7.b.class, b.f7904a);
        bVar.a(Q7.e.class, f.f7914a);
    }
}
