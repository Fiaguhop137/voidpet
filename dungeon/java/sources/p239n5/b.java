package p239n5;

import I5.a;
import I5.e;
import I5.i;
import I5.j;
import I5.n;
import java.io.Closeable;
import p025b6.m;
import p329s5.F;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a implements Closeable, F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p042c5.b f49908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f49909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f49910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f49911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f49912g;

    public b(p042c5.b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    public b(p042c5.b bVar, j jVar, i iVar, boolean z10) {
        this.f49911f = null;
        this.f49908c = bVar;
        this.f49909d = jVar;
        this.f49910e = iVar;
        this.f49912g = z10;
    }

    private void k(j jVar, long j10) {
        jVar.R(false);
        jVar.L(j10);
        r(jVar, n.INVISIBLE);
    }

    private void p(j jVar, e eVar) {
        jVar.H(eVar);
        this.f49910e.a(jVar, eVar);
        i iVar = this.f49911f;
        if (iVar != null) {
            iVar.a(jVar, eVar);
        }
    }

    private void r(j jVar, n nVar) {
        this.f49910e.b(jVar, nVar);
        i iVar = this.f49911f;
        if (iVar != null) {
            iVar.b(jVar, nVar);
        }
    }

    @Override // I5.a, I5.b
    public void b(String str, Object obj, I5.b.a aVar) {
        long jNow = this.f49908c.now();
        j jVar = this.f49909d;
        jVar.x();
        jVar.D(jNow);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        p(jVar, e.REQUESTED);
        if (this.f49912g) {
            m(jVar, jNow);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o();
    }

    @Override // I5.a, I5.b
    public void d(String str, Throwable th, I5.b.a aVar) {
        long jNow = this.f49908c.now();
        j jVar = this.f49909d;
        jVar.F(aVar);
        jVar.z(jNow);
        jVar.B(str);
        jVar.E(th);
        p(jVar, e.ERROR);
        k(jVar, jNow);
    }

    @Override // p329s5.F
    public void f(boolean z10) {
        if (z10) {
            m(this.f49909d, this.f49908c.now());
        } else {
            k(this.f49909d, this.f49908c.now());
        }
    }

    @Override // I5.a, I5.b
    public void g(String str, I5.b.a aVar) {
        long jNow = this.f49908c.now();
        j jVar = this.f49909d;
        jVar.F(aVar);
        jVar.B(str);
        p(jVar, e.RELEASED);
        if (this.f49912g) {
            k(jVar, jNow);
        }
    }

    @Override // I5.a, I5.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(String str, m mVar, I5.b.a aVar) {
        long jNow = this.f49908c.now();
        j jVar = this.f49909d;
        jVar.F(aVar);
        jVar.A(jNow);
        jVar.J(jNow);
        jVar.B(str);
        jVar.G(mVar);
        p(jVar, e.SUCCESS);
    }

    @Override // I5.a, I5.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(String str, m mVar) {
        long jNow = this.f49908c.now();
        j jVar = this.f49909d;
        jVar.C(jNow);
        jVar.B(str);
        jVar.G(mVar);
        p(jVar, e.INTERMEDIATE_AVAILABLE);
    }

    public void m(j jVar, long j10) {
        jVar.R(true);
        jVar.Q(j10);
        r(jVar, n.VISIBLE);
    }

    public void o() {
        this.f49909d.w();
    }

    @Override // p329s5.F
    public void onDraw() {
    }
}
