package R1;

import U1.AbstractC1459a;
import U1.S;
import android.net.Uri;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f9913a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9914b = S.z0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f9915c = S.z0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9916d = S.z0(2);

    class a extends F {
        a() {
        }

        @Override // R1.F
        public int b(Object obj) {
            return -1;
        }

        @Override // R1.F
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // R1.F
        public int i() {
            return 0;
        }

        @Override // R1.F
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // R1.F
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // R1.F
        public int p() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f9917h = S.z0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f9918i = S.z0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f9919j = S.z0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f9920k = S.z0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f9921l = S.z0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f9922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f9923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C1341a f9928g = C1341a.f10098g;

        public int a(int i10) {
            return this.f9928g.a(i10).f10122b;
        }

        public long b(int i10, int i11) {
            C1341a.C0160a c0160aA = this.f9928g.a(i10);
            if (c0160aA.f10122b != -1) {
                return c0160aA.f10127g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f9928g.f10105b;
        }

        public int d(long j10) {
            return this.f9928g.b(j10, this.f9925d);
        }

        public int e(long j10) {
            return this.f9928g.c(j10, this.f9925d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f9922a, bVar.f9922a) && Objects.equals(this.f9923b, bVar.f9923b) && this.f9924c == bVar.f9924c && this.f9925d == bVar.f9925d && this.f9926e == bVar.f9926e && this.f9927f == bVar.f9927f && Objects.equals(this.f9928g, bVar.f9928g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f9928g.a(i10).f10121a;
        }

        public long g() {
            return this.f9928g.f10106c;
        }

        public int h(int i10, int i11) {
            C1341a.C0160a c0160aA = this.f9928g.a(i10);
            if (c0160aA.f10122b != -1) {
                return c0160aA.f10126f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f9922a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f9923b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9924c) * 31;
            long j10 = this.f9925d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f9926e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f9927f ? 1 : 0)) * 31) + this.f9928g.hashCode();
        }

        public long i(int i10) {
            return this.f9928g.a(i10).f10129i;
        }

        public long j() {
            return this.f9925d;
        }

        public int k(int i10) {
            return this.f9928g.a(i10).c();
        }

        public int l(int i10, int i11) {
            return this.f9928g.a(i10).d(i11);
        }

        public long m() {
            return S.o1(this.f9926e);
        }

        public long n() {
            return this.f9926e;
        }

        public int o() {
            return this.f9928g.f10108e;
        }

        public boolean p(int i10) {
            return !this.f9928g.a(i10).e();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f9928g.d(i10);
        }

        public boolean r(int i10) {
            return this.f9928g.a(i10).f10130j;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, C1341a.f10098g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, C1341a c1341a, boolean z10) {
            this.f9922a = obj;
            this.f9923b = obj2;
            this.f9924c = i10;
            this.f9925d = j10;
            this.f9926e = j11;
            this.f9928g = c1341a;
            this.f9927f = z10;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f9946b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f9948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9950f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f9951g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9952h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9953i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public u.g f9954j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f9955k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f9956l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f9957m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f9958n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f9959o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f9960p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f9935q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f9936r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final u f9937s = new u.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f9938t = S.z0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f9939u = S.z0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f9940v = S.z0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f9941w = S.z0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f9942x = S.z0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f9943y = S.z0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f9944z = S.z0(7);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private static final String f9929A = S.z0(8);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private static final String f9930B = S.z0(9);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final String f9931C = S.z0(10);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final String f9932D = S.z0(11);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final String f9933E = S.z0(12);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final String f9934F = S.z0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f9945a = f9935q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f9947c = f9937s;

        public long a() {
            return S.h0(this.f9951g);
        }

        public long b() {
            return S.o1(this.f9956l);
        }

        public long c() {
            return this.f9956l;
        }

        public long d() {
            return S.o1(this.f9957m);
        }

        public long e() {
            return this.f9960p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f9945a, cVar.f9945a) && Objects.equals(this.f9947c, cVar.f9947c) && Objects.equals(this.f9948d, cVar.f9948d) && Objects.equals(this.f9954j, cVar.f9954j) && this.f9949e == cVar.f9949e && this.f9950f == cVar.f9950f && this.f9951g == cVar.f9951g && this.f9952h == cVar.f9952h && this.f9953i == cVar.f9953i && this.f9955k == cVar.f9955k && this.f9956l == cVar.f9956l && this.f9957m == cVar.f9957m && this.f9958n == cVar.f9958n && this.f9959o == cVar.f9959o && this.f9960p == cVar.f9960p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f9954j != null;
        }

        public c g(Object obj, u uVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, u.g gVar, long j13, long j14, int i10, int i11, long j15) {
            u.h hVar;
            this.f9945a = obj;
            this.f9947c = uVar != null ? uVar : f9937s;
            this.f9946b = (uVar == null || (hVar = uVar.f10345b) == null) ? null : hVar.f10447h;
            this.f9948d = obj2;
            this.f9949e = j10;
            this.f9950f = j11;
            this.f9951g = j12;
            this.f9952h = z10;
            this.f9953i = z11;
            this.f9954j = gVar;
            this.f9956l = j13;
            this.f9957m = j14;
            this.f9958n = i10;
            this.f9959o = i11;
            this.f9960p = j15;
            this.f9955k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f9945a.hashCode()) * 31) + this.f9947c.hashCode()) * 31;
            Object obj = this.f9948d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            u.g gVar = this.f9954j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f9949e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f9950f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f9951g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f9952h ? 1 : 0)) * 31) + (this.f9953i ? 1 : 0)) * 31) + (this.f9955k ? 1 : 0)) * 31;
            long j13 = this.f9956l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f9957m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f9958n) * 31) + this.f9959o) * 31;
            long j15 = this.f9960p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected F() {
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f9924c;
        if (n(i12, cVar).f9959o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f9958n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (f10.p() != p() || f10.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(f10.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(f10.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != f10.a(true) || (iC = c(true)) != f10.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != f10.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i10, long j10) {
        return (Pair) AbstractC1459a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair k(c cVar, b bVar, int i10, long j10, long j11) {
        AbstractC1459a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f9958n;
        f(i11, bVar);
        while (i11 < cVar.f9959o && bVar.f9926e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f9926e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f9926e;
        long j12 = bVar.f9925d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(AbstractC1459a.e(bVar.f9923b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
