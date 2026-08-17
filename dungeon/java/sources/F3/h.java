package F3;

import Q3.t;
import java.util.Map;
import p435y3.n;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f2938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f2939b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f2940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f2941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f2942c;

        public a(n nVar, Map map, long j10) {
            this.f2940a = nVar;
            this.f2941b = map;
            this.f2942c = j10;
        }

        public final Map a() {
            return this.f2941b;
        }

        public final n b() {
            return this.f2940a;
        }

        public final long c() {
            return this.f2942c;
        }
    }

    public static final class b extends t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f2943d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, h hVar) {
            super(j10);
            this.f2943d = hVar;
        }

        @Override // Q3.t
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(d.b bVar, a aVar, a aVar2) {
            this.f2943d.f2938a.d(bVar, aVar.b(), aVar.a(), aVar.c());
        }

        @Override // Q3.t
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public long j(d.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public h(long j10, k kVar) {
        this.f2938a = kVar;
        this.f2939b = new b(j10, this);
    }

    @Override // F3.j
    public long a() {
        return this.f2939b.e();
    }

    @Override // F3.j
    public d.c b(d.b bVar) {
        a aVar = (a) this.f2939b.c(bVar);
        if (aVar != null) {
            return new d.c(aVar.b(), aVar.a());
        }
        return null;
    }

    @Override // F3.j
    public boolean c(d.b bVar) {
        return this.f2939b.h(bVar) != null;
    }

    @Override // F3.j
    public void clear() {
        this.f2939b.a();
    }

    @Override // F3.j
    public void d(d.b bVar, n nVar, Map map, long j10) {
        if (j10 <= g()) {
            this.f2939b.f(bVar, new a(nVar, map, j10));
        } else {
            this.f2939b.h(bVar);
            this.f2938a.d(bVar, nVar, map, j10);
        }
    }

    @Override // F3.j
    public void e(long j10) {
        this.f2939b.k(j10);
    }

    public long g() {
        return this.f2939b.d();
    }
}
