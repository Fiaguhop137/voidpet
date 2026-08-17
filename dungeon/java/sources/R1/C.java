package R1;

import U1.S;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface C {

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9884b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f9885c = S.z0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f9886a;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f9887b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p.b f9888a = new p.b();

            public a a(int i10) {
                this.f9888a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f9888a.b(bVar.f9886a);
                return this;
            }

            public a c(int... iArr) {
                this.f9888a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f9888a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f9888a.e(), null);
            }
        }

        private b(p pVar) {
            this.f9886a = pVar;
        }

        /* synthetic */ b(p pVar, a aVar) {
            this(pVar);
        }

        public boolean b(int i10) {
            return this.f9886a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f9886a.equals(((b) obj).f9886a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9886a.hashCode();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f9889a;

        public c(p pVar) {
            this.f9889a = pVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f9889a.equals(((c) obj).f9889a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9889a.hashCode();
        }
    }

    public interface d {
        default void B(int i10) {
        }

        default void C(boolean z10) {
        }

        default void D(I i10) {
        }

        default void G(b bVar) {
        }

        void I(int i10);

        default void M(int i10, boolean z10) {
        }

        default void O(A a10) {
        }

        default void Q() {
        }

        default void S(C1353m c1353m) {
        }

        default void T(int i10, int i11) {
        }

        default void U(int i10) {
        }

        default void W(C c10, c cVar) {
        }

        void X(boolean z10);

        default void Y(float f10) {
        }

        void Z(u uVar, int i10);

        default void a(M m10) {
        }

        default void b0(F f10, int i10) {
        }

        default void c(int i10) {
        }

        default void d(boolean z10) {
        }

        default void e0(boolean z10, int i10) {
        }

        default void g0(int i10) {
        }

        default void i0(e eVar, e eVar2, int i10) {
        }

        default void k0(boolean z10, int i10) {
        }

        default void m(x xVar) {
        }

        default void m0(w wVar) {
        }

        default void n(List list) {
        }

        default void n0(A a10) {
        }

        void p0(boolean z10);

        default void q(B b10) {
        }

        default void u(T1.c cVar) {
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f9890k = S.z0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f9891l = S.z0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f9892m = S.z0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f9893n = S.z0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f9894o = S.z0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f9895p = S.z0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f9896q = S.z0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u f9900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f9901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9902f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f9903g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f9904h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f9905i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f9906j;

        public e(Object obj, int i10, u uVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f9897a = obj;
            this.f9898b = i10;
            this.f9899c = i10;
            this.f9900d = uVar;
            this.f9901e = obj2;
            this.f9902f = i11;
            this.f9903g = j10;
            this.f9904h = j11;
            this.f9905i = i12;
            this.f9906j = i13;
        }

        public boolean a(e eVar) {
            return this.f9899c == eVar.f9899c && this.f9902f == eVar.f9902f && this.f9903g == eVar.f9903g && this.f9904h == eVar.f9904h && this.f9905i == eVar.f9905i && this.f9906j == eVar.f9906j && Objects.equals(this.f9900d, eVar.f9900d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f9897a, eVar.f9897a) && Objects.equals(this.f9901e, eVar.f9901e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f9897a, Integer.valueOf(this.f9899c), this.f9900d, this.f9901e, Integer.valueOf(this.f9902f), Long.valueOf(this.f9903g), Long.valueOf(this.f9904h), Integer.valueOf(this.f9905i), Integer.valueOf(this.f9906j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f9899c + ", period=" + this.f9902f + ", pos=" + this.f9903g;
            if (this.f9905i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f9904h + ", adGroup=" + this.f9905i + ", ad=" + this.f9906j;
        }
    }

    boolean A();

    int B();

    boolean C();

    int D();

    void E(int i10);

    int F();

    boolean G();

    long H();

    boolean I();

    B c();

    void d(B b10);

    void e();

    void f(float f10);

    void g();

    long getDuration();

    boolean h();

    long i();

    A j();

    void k(boolean z10);

    I l();

    boolean m();

    int n();

    boolean o();

    int p();

    void pause();

    F q();

    b r();

    boolean s();

    void stop();

    int t();

    float u();

    void v(d dVar);

    boolean w();

    int x();

    void y(long j10);

    long z();
}
