package p344t2;

import R1.M;
import U1.AbstractC1459a;
import U1.InterfaceC1466h;
import U1.J;
import U1.v;

/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f54421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f54422b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54431k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t.a f54423c = new t.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final J f54424d = new J();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J f54425e = new J();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f54426f = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54427g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M f54430j = M.f10090e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54428h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f54429i = -9223372036854775807L;

    interface a {
        void a(M m10);

        void b();

        void c(long j10, long j11, boolean z10);
    }

    public x(a aVar, t tVar) {
        this.f54421a = aVar;
        this.f54422b = tVar;
    }

    private void a() {
        this.f54426f.f();
        this.f54421a.b();
    }

    private static Object c(J j10) {
        AbstractC1459a.a(j10.k() > 0);
        while (j10.k() > 1) {
            j10.h();
        }
        return AbstractC1459a.e(j10.h());
    }

    private boolean e(long j10) {
        Long l10 = (Long) this.f54425e.i(j10);
        if (l10 == null || l10.longValue() == this.f54431k) {
            return false;
        }
        this.f54431k = l10.longValue();
        return true;
    }

    private boolean f(long j10) {
        M m10 = (M) this.f54424d.i(j10);
        if (m10 == null || m10.equals(M.f10090e) || m10.equals(this.f54430j)) {
            return false;
        }
        this.f54430j = m10;
        return true;
    }

    private void k(boolean z10) {
        long jF = this.f54426f.f();
        if (f(jF)) {
            this.f54421a.a(this.f54430j);
        }
        this.f54421a.c(z10 ? InterfaceC1466h.f12906a.b() : this.f54423c.g(), jF, this.f54422b.g());
    }

    public void b() {
        this.f54426f.b();
        this.f54427g = -9223372036854775807L;
        this.f54428h = -9223372036854775807L;
        this.f54429i = -9223372036854775807L;
        if (this.f54425e.k() > 0) {
            this.f54431k = ((Long) c(this.f54425e)).longValue();
        }
        if (this.f54424d.k() > 0) {
            this.f54424d.a(0L, (M) c(this.f54424d));
        }
    }

    public boolean d() {
        long j10 = this.f54429i;
        return j10 != -9223372036854775807L && this.f54428h == j10;
    }

    public void g(long j10) {
        this.f54426f.a(j10);
        this.f54427g = j10;
        this.f54429i = -9223372036854775807L;
    }

    public void h(int i10, long j10) {
        if (this.f54426f.e()) {
            this.f54422b.j(i10);
            this.f54431k = j10;
        } else {
            J j11 = this.f54425e;
            long j12 = this.f54427g;
            j11.a(j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1, Long.valueOf(j10));
        }
    }

    public void i(int i10, int i11) {
        J j10 = this.f54424d;
        long j11 = this.f54427g;
        j10.a(j11 == -9223372036854775807L ? 0L : j11 + 1, new M(i10, i11));
    }

    public void j(long j10, long j11) {
        while (!this.f54426f.e()) {
            long jD = this.f54426f.d();
            if (e(jD)) {
                this.f54422b.j(2);
            }
            int iC = this.f54422b.c(jD, j10, j11, this.f54431k, false, false, this.f54423c);
            if (iC == 0 || iC == 1) {
                this.f54428h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f54428h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f54428h = jD;
            }
        }
    }

    public void l() {
        if (this.f54427g == -9223372036854775807L) {
            this.f54427g = Long.MIN_VALUE;
            this.f54428h = Long.MIN_VALUE;
        }
        this.f54429i = this.f54427g;
    }
}
