package p380v2;

import U1.AbstractC1459a;
import U1.S;

/* JADX INFO: renamed from: v2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4242e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f56061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f56062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f56063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56064d;

    /* JADX INFO: renamed from: v2.e$a */
    public static class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f56065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f56066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f56067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f56068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f56069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f56070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f56071g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f56065a = dVar;
            this.f56066b = j10;
            this.f56067c = j11;
            this.f56068d = j12;
            this.f56069e = j13;
            this.f56070f = j14;
            this.f56071g = j15;
        }

        @Override // p380v2.J
        public J.a e(long j10) {
            return new J.a(new K(j10, c.h(this.f56065a.a(j10), this.f56067c, this.f56068d, this.f56069e, this.f56070f, this.f56071g)));
        }

        @Override // p380v2.J
        public boolean i() {
            return true;
        }

        public long k(long j10) {
            return this.f56065a.a(j10);
        }

        @Override // p380v2.J
        public long m() {
            return this.f56066b;
        }
    }

    /* JADX INFO: renamed from: v2.e$b */
    public static final class b implements d {
        @Override // p380v2.AbstractC4242e.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: renamed from: v2.e$c */
    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f56072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f56073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f56074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f56075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f56076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f56077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f56078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f56079h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f56072a = j10;
            this.f56073b = j11;
            this.f56075d = j12;
            this.f56076e = j13;
            this.f56077f = j14;
            this.f56078g = j15;
            this.f56074c = j16;
            this.f56079h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return S.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f56078g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f56077f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f56079h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f56072a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f56073b;
        }

        private void n() {
            this.f56079h = h(this.f56073b, this.f56075d, this.f56076e, this.f56077f, this.f56078g, this.f56074c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f56076e = j10;
            this.f56078g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f56075d = j10;
            this.f56077f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: v2.e$d */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: v2.e$e, reason: collision with other inner class name */
    public static final class C0712e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0712e f56080d = new C0712e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f56081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f56082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f56083c;

        private C0712e(int i10, long j10, long j11) {
            this.f56081a = i10;
            this.f56082b = j10;
            this.f56083c = j11;
        }

        public static C0712e d(long j10, long j11) {
            return new C0712e(-1, j10, j11);
        }

        public static C0712e e(long j10) {
            return new C0712e(0, -9223372036854775807L, j10);
        }

        public static C0712e f(long j10, long j11) {
            return new C0712e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: v2.e$f */
    public interface f {
        C0712e a(InterfaceC4254q interfaceC4254q, long j10);

        default void b() {
        }
    }

    protected AbstractC4242e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f56062b = fVar;
        this.f56064d = i10;
        this.f56061a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f56061a.k(j10), this.f56061a.f56067c, this.f56061a.f56068d, this.f56061a.f56069e, this.f56061a.f56070f, this.f56061a.f56071g);
    }

    public final J b() {
        return this.f56061a;
    }

    public int c(InterfaceC4254q interfaceC4254q, I i10) {
        while (true) {
            c cVar = (c) AbstractC1459a.i(this.f56063c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f56064d) {
                e(false, j10);
                return g(interfaceC4254q, j10, i10);
            }
            if (!i(interfaceC4254q, jK)) {
                return g(interfaceC4254q, jK, i10);
            }
            interfaceC4254q.d();
            C0712e c0712eA = this.f56062b.a(interfaceC4254q, cVar.m());
            int i11 = c0712eA.f56081a;
            if (i11 == -3) {
                e(false, jK);
                return g(interfaceC4254q, jK, i10);
            }
            if (i11 == -2) {
                cVar.p(c0712eA.f56082b, c0712eA.f56083c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC4254q, c0712eA.f56083c);
                    e(true, c0712eA.f56083c);
                    return g(interfaceC4254q, c0712eA.f56083c, i10);
                }
                cVar.o(c0712eA.f56082b, c0712eA.f56083c);
            }
        }
    }

    public final boolean d() {
        return this.f56063c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f56063c = null;
        this.f56062b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(InterfaceC4254q interfaceC4254q, long j10, I i10) {
        if (j10 == interfaceC4254q.getPosition()) {
            return 0;
        }
        i10.f55969a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f56063c;
        if (cVar == null || cVar.l() != j10) {
            this.f56063c = a(j10);
        }
    }

    protected final boolean i(InterfaceC4254q interfaceC4254q, long j10) {
        long position = j10 - interfaceC4254q.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC4254q.l((int) position);
        return true;
    }
}
