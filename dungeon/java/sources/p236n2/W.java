package p236n2;

import R1.G;
import R1.InterfaceC1350j;
import R1.x;
import R1.y;
import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.C1469k;
import U1.F;
import U1.S;
import W1.i;
import W1.j;
import W1.w;
import Z1.R0;
import Z1.U0;
import Z1.z1;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p075e2.t;
import p075e2.u;
import p308r2.k;
import p308r2.m;
import p380v2.A;
import p380v2.C4251n;
import p380v2.E;
import p380v2.I;
import p380v2.J;
import p380v2.O;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
final class W implements C, r, m.b, m.f, b0.d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final Map f49549R = N();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final R1.r f49550S = new R1.r.b().j0("icy").y0("application/x-icy").P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f49551A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private f f49552B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private J f49553C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f49554D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f49555E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f49556F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f49557G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f49558H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f49559I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f49560J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f49561K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f49562L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f49563M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f49564N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f49565O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f49566P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f49567Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f49568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W1.f f49569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f49570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f49571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L.a f49572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t.a f49573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f49574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p308r2.b f49575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f49576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f49577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f49578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final R1.r f49579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f49580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f49581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Q f49582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C1469k f49583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f49584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f49585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f49586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C.a f49587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private I2.b f49588u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b0[] f49589v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e[] f49590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f49591x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f49592y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f49593z;

    class a extends A {
        a(J j10) {
            super(j10);
        }

        @Override // p380v2.A, p380v2.J
        public long m() {
            return W.this.f49554D;
        }
    }

    final class b implements m.e, C4026x.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f49596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w f49597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Q f49598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final r f49599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C1469k f49600f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f49602h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f49604j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private O f49606l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f49607m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final I f49601g = new I();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f49603i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f49595a = C4027y.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private j f49605k = i(0);

        public b(Uri uri, W1.f fVar, Q q10, r rVar, C1469k c1469k) {
            this.f49596b = uri;
            this.f49597c = new w(fVar);
            this.f49598d = q10;
            this.f49599e = rVar;
            this.f49600f = c1469k;
        }

        private j i(long j10) {
            return new j.b().i(this.f49596b).h(j10).f(W.this.f49576i).b(6).e(W.f49549R).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f49601g.f55969a = j10;
            this.f49604j = j11;
            this.f49603i = true;
            this.f49607m = false;
        }

        @Override // r2.m.e
        public void a() {
            int iC = 0;
            while (iC == 0 && !this.f49602h) {
                try {
                    long j10 = this.f49601g.f55969a;
                    j jVarI = i(j10);
                    this.f49605k = jVarI;
                    long jM = this.f49597c.m(jVarI);
                    if (this.f49602h) {
                        if (iC != 1 && this.f49598d.d() != -1) {
                            this.f49601g.f55969a = this.f49598d.d();
                        }
                        i.a(this.f49597c);
                        return;
                    }
                    if (jM != -1) {
                        jM += j10;
                        W.this.Y();
                    }
                    long j11 = jM;
                    W.this.f49588u = I2.b.d(this.f49597c.f());
                    InterfaceC1350j c4026x = this.f49597c;
                    if (W.this.f49588u != null && W.this.f49588u.f4915f != -1) {
                        c4026x = new C4026x(this.f49597c, W.this.f49588u.f4915f, this);
                        O oQ = W.this.Q();
                        this.f49606l = oQ;
                        oQ.b(W.f49550S);
                    }
                    this.f49598d.e(c4026x, this.f49596b, this.f49597c.f(), j10, j11, this.f49599e);
                    if (W.this.f49588u != null) {
                        this.f49598d.b();
                    }
                    if (this.f49603i) {
                        this.f49598d.a(j10, this.f49604j);
                        this.f49603i = false;
                    }
                    while (iC == 0 && !this.f49602h) {
                        try {
                            this.f49600f.a();
                            iC = this.f49598d.c(this.f49601g);
                            long jD = this.f49598d.d();
                            if (jD > W.this.f49577j + j10) {
                                this.f49600f.d();
                                W.this.f49586s.post(W.this.f49585r);
                                j10 = jD;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.f49598d.d() != -1) {
                        this.f49601g.f55969a = this.f49598d.d();
                    }
                    i.a(this.f49597c);
                } catch (Throwable th) {
                    if (iC != 1 && this.f49598d.d() != -1) {
                        this.f49601g.f55969a = this.f49598d.d();
                    }
                    i.a(this.f49597c);
                    throw th;
                }
            }
        }

        @Override // p236n2.C4026x.a
        public void b(F f10) {
            long jMax = !this.f49607m ? this.f49604j : Math.max(W.this.P(true), this.f49604j);
            int iA = f10.a();
            O o10 = (O) AbstractC1459a.e(this.f49606l);
            o10.f(f10, iA);
            o10.c(jMax, 1, iA, 0, null);
            this.f49607m = true;
        }

        @Override // r2.m.e
        public void c() {
            this.f49602h = true;
        }
    }

    interface c {
        void k(long j10, J j11, boolean z10);
    }

    private final class d implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f49609a;

        public d(int i10) {
            this.f49609a = i10;
        }

        @Override // p236n2.c0
        public void a() throws IOException {
            W.this.X(this.f49609a);
        }

        @Override // p236n2.c0
        public boolean f() {
            return W.this.S(this.f49609a);
        }

        @Override // p236n2.c0
        public int p(long j10) {
            return W.this.i0(this.f49609a, j10);
        }

        @Override // p236n2.c0
        public int t(R0 r10, Y1.f fVar, int i10) {
            return W.this.e0(this.f49609a, r10, fVar, i10);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49612b;

        public e(int i10, boolean z10) {
            this.f49611a = i10;
            this.f49612b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f49611a == eVar.f49611a && this.f49612b == eVar.f49612b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f49611a * 31) + (this.f49612b ? 1 : 0);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0 f49613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f49614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f49615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f49616d;

        public f(m0 m0Var, boolean[] zArr) {
            this.f49613a = m0Var;
            this.f49614b = zArr;
            int i10 = m0Var.f49821a;
            this.f49615c = new boolean[i10];
            this.f49616d = new boolean[i10];
        }
    }

    public W(Uri uri, W1.f fVar, Q q10, u uVar, t.a aVar, k kVar, L.a aVar2, c cVar, p308r2.b bVar, String str, int i10, int i11, R1.r rVar, long j10, p326s2.a aVar3) {
        this.f49568a = uri;
        this.f49569b = fVar;
        this.f49570c = uVar;
        this.f49573f = aVar;
        this.f49571d = kVar;
        this.f49572e = aVar2;
        this.f49574g = cVar;
        this.f49575h = bVar;
        this.f49576i = str;
        this.f49577j = i10;
        this.f49578k = i11;
        this.f49579l = rVar;
        this.f49581n = aVar3 != null ? new m(aVar3) : new m("ProgressiveMediaPeriod");
        this.f49582o = q10;
        this.f49580m = j10;
        this.f49583p = new C1469k();
        this.f49584q = new T(this);
        this.f49585r = new U(this);
        this.f49586s = S.z();
        this.f49590w = new e[0];
        this.f49589v = new b0[0];
        this.f49563M = -9223372036854775807L;
        this.f49556F = 1;
    }

    private void L() {
        AbstractC1459a.g(this.f49592y);
        AbstractC1459a.e(this.f49552B);
        AbstractC1459a.e(this.f49553C);
    }

    private boolean M(b bVar, int i10) {
        J j10;
        if (this.f49561K || !((j10 = this.f49553C) == null || j10.m() == -9223372036854775807L)) {
            this.f49565O = i10;
            return true;
        }
        if (this.f49592y && !k0()) {
            this.f49564N = true;
            return false;
        }
        this.f49558H = this.f49592y;
        this.f49562L = 0L;
        this.f49565O = 0;
        for (b0 b0Var : this.f49589v) {
            b0Var.X();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map N() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int O() {
        int iJ = 0;
        for (b0 b0Var : this.f49589v) {
            iJ += b0Var.J();
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f49589v.length; i10++) {
            if (z10 || ((f) AbstractC1459a.e(this.f49552B)).f49615c[i10]) {
                jMax = Math.max(jMax, this.f49589v[i10].C());
            }
        }
        return jMax;
    }

    private boolean R() {
        return this.f49563M != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f49567Q || this.f49592y || !this.f49591x || this.f49553C == null) {
            return;
        }
        for (b0 b0Var : this.f49589v) {
            if (b0Var.I() == null) {
                return;
            }
        }
        this.f49583p.d();
        int length = this.f49589v.length;
        G[] gArr = new G[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            R1.r rVarP = (R1.r) AbstractC1459a.e(this.f49589v[i10].I());
            String str = rVarP.f10277o;
            boolean zO = y.o(str);
            boolean z10 = zO || y.t(str);
            zArr[i10] = z10;
            this.f49593z = z10 | this.f49593z;
            this.f49551A = this.f49580m != -9223372036854775807L && length == 1 && y.q(str);
            I2.b bVar = this.f49588u;
            if (bVar != null) {
                if (zO || this.f49590w[i10].f49612b) {
                    x xVar = rVarP.f10274l;
                    rVarP = rVarP.b().r0(xVar == null ? new x(bVar) : xVar.a(bVar)).P();
                }
                if (zO && rVarP.f10270h == -1 && rVarP.f10271i == -1 && bVar.f4910a != -1) {
                    rVarP = rVarP.b().S(bVar.f4910a).P();
                }
            }
            R1.r rVarC = rVarP.c(this.f49570c.d(rVarP));
            gArr[i10] = new G(Integer.toString(i10), rVarC);
            this.f49559I = rVarC.f10283u | this.f49559I;
        }
        this.f49552B = new f(new m0(gArr), zArr);
        if (this.f49551A && this.f49554D == -9223372036854775807L) {
            this.f49554D = this.f49580m;
            this.f49553C = new a(this.f49553C);
        }
        this.f49574g.k(this.f49554D, this.f49553C, this.f49555E);
        this.f49592y = true;
        ((C.a) AbstractC1459a.e(this.f49587t)).f(this);
    }

    private void U(int i10) {
        L();
        f fVar = this.f49552B;
        boolean[] zArr = fVar.f49616d;
        if (zArr[i10]) {
            return;
        }
        R1.r rVarA = fVar.f49613a.b(i10).a(0);
        this.f49572e.j(y.k(rVarA.f10277o), rVarA, 0, null, this.f49562L);
        zArr[i10] = true;
    }

    private void V(int i10) {
        L();
        if (this.f49564N) {
            if (!this.f49593z || this.f49552B.f49614b[i10]) {
                if (this.f49589v[i10].N(false)) {
                    return;
                }
                this.f49563M = 0L;
                this.f49564N = false;
                this.f49558H = true;
                this.f49562L = 0L;
                this.f49565O = 0;
                for (b0 b0Var : this.f49589v) {
                    b0Var.X();
                }
                ((C.a) AbstractC1459a.e(this.f49587t)).i(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.f49586s.post(new S(this));
    }

    private O d0(e eVar) {
        int length = this.f49589v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f49590w[i10])) {
                return this.f49589v[i10];
            }
        }
        if (this.f49591x) {
            AbstractC1477t.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f49611a + ") after finishing tracks.");
            return new C4251n();
        }
        b0 b0VarL = b0.l(this.f49575h, this.f49570c, this.f49573f);
        b0VarL.f0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f49590w, i11);
        eVarArr[length] = eVar;
        this.f49590w = (e[]) S.j(eVarArr);
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.f49589v, i11);
        b0VarArr[length] = b0VarL;
        this.f49589v = (b0[]) S.j(b0VarArr);
        return b0VarL;
    }

    private boolean g0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f49589v.length;
        for (int i10 = 0; i10 < length; i10++) {
            b0 b0Var = this.f49589v[i10];
            if (b0Var.F() != 0 || !z10) {
                if (!(this.f49551A ? b0Var.a0(b0Var.A()) : b0Var.b0(j10, this.f49566P)) && (zArr[i10] || !this.f49593z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(J j10) {
        this.f49553C = this.f49588u == null ? j10 : new J.b(-9223372036854775807L);
        this.f49554D = j10.m();
        boolean z10 = !this.f49561K && j10.m() == -9223372036854775807L;
        this.f49555E = z10;
        this.f49556F = z10 ? 7 : 1;
        if (this.f49592y) {
            this.f49574g.k(this.f49554D, j10, z10);
        } else {
            T();
        }
    }

    private void j0() {
        b bVar = new b(this.f49568a, this.f49569b, this.f49582o, this, this.f49583p);
        if (this.f49592y) {
            AbstractC1459a.g(R());
            long j10 = this.f49554D;
            if (j10 != -9223372036854775807L && this.f49563M > j10) {
                this.f49566P = true;
                this.f49563M = -9223372036854775807L;
                return;
            }
            bVar.j(((J) AbstractC1459a.e(this.f49553C)).e(this.f49563M).f55970a.f55976b, this.f49563M);
            for (b0 b0Var : this.f49589v) {
                b0Var.d0(this.f49563M);
            }
            this.f49563M = -9223372036854775807L;
        }
        this.f49565O = O();
        this.f49581n.n(bVar, this, this.f49571d.b(this.f49556F));
    }

    private boolean k0() {
        return this.f49558H || R();
    }

    public static /* synthetic */ void y(W w10) {
        if (w10.f49567Q) {
            return;
        }
        ((C.a) AbstractC1459a.e(w10.f49587t)).i(w10);
    }

    O Q() {
        return d0(new e(0, true));
    }

    boolean S(int i10) {
        return !k0() && this.f49589v[i10].N(this.f49566P);
    }

    void W() throws IOException {
        this.f49581n.k(this.f49571d.b(this.f49556F));
    }

    void X(int i10) throws IOException {
        this.f49589v[i10].P();
        W();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, long j10, long j11, boolean z10) {
        w wVar = bVar.f49597c;
        C4027y c4027y = new C4027y(bVar.f49595a, bVar.f49605k, wVar.q(), wVar.r(), j10, j11, wVar.p());
        this.f49571d.d(bVar.f49595a);
        this.f49572e.m(c4027y, 1, -1, null, 0, null, bVar.f49604j, this.f49554D);
        if (z10) {
            return;
        }
        for (b0 b0Var : this.f49589v) {
            b0Var.X();
        }
        if (this.f49560J > 0) {
            ((C.a) AbstractC1459a.e(this.f49587t)).i(this);
        }
    }

    @Override // n2.b0.d
    public void a(R1.r rVar) {
        this.f49586s.post(this.f49584q);
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void j(b bVar, long j10, long j11) {
        if (this.f49554D == -9223372036854775807L && this.f49553C != null) {
            long jP = P(true);
            long j12 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.f49554D = j12;
            this.f49574g.k(j12, this.f49553C, this.f49555E);
        }
        w wVar = bVar.f49597c;
        C4027y c4027y = new C4027y(bVar.f49595a, bVar.f49605k, wVar.q(), wVar.r(), j10, j11, wVar.p());
        this.f49571d.d(bVar.f49595a);
        this.f49572e.p(c4027y, 1, -1, null, 0, null, bVar.f49604j, this.f49554D);
        this.f49566P = true;
        ((C.a) AbstractC1459a.e(this.f49587t)).i(this);
    }

    @Override // p236n2.C, p236n2.d0
    public long b() {
        return g();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c n(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        m.c cVarH;
        w wVar = bVar.f49597c;
        C4027y c4027y = new C4027y(bVar.f49595a, bVar.f49605k, wVar.q(), wVar.r(), j10, j11, wVar.p());
        long jA = this.f49571d.a(new k.c(c4027y, new B(1, -1, null, 0, null, S.o1(bVar.f49604j), S.o1(this.f49554D)), iOException, i10));
        if (jA == -9223372036854775807L) {
            cVarH = m.f52088g;
            bVar2 = bVar;
        } else {
            int iO = O();
            bVar2 = bVar;
            cVarH = M(bVar2, iO) ? m.h(iO > this.f49565O, jA) : m.f52087f;
        }
        boolean zC = cVarH.c();
        this.f49572e.r(c4027y, 1, -1, null, 0, null, bVar2.f49604j, this.f49554D, iOException, !zC);
        if (!zC) {
            this.f49571d.d(bVar2.f49595a);
        }
        return cVarH;
    }

    @Override // p236n2.C, p236n2.d0
    public boolean c() {
        return this.f49581n.j() && this.f49583p.e();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void l(b bVar, long j10, long j11, int i10) {
        w wVar = bVar.f49597c;
        this.f49572e.v(i10 == 0 ? new C4027y(bVar.f49595a, bVar.f49605k, j10) : new C4027y(bVar.f49595a, bVar.f49605k, wVar.q(), wVar.r(), j10, j11, wVar.p()), 1, -1, null, 0, null, bVar.f49604j, this.f49554D, i10);
    }

    @Override // p236n2.C, p236n2.d0
    public boolean d(U0 u10) {
        if (this.f49566P || this.f49581n.i() || this.f49564N) {
            return false;
        }
        if ((this.f49592y || this.f49579l != null) && this.f49560J == 0) {
            return false;
        }
        boolean zF = this.f49583p.f();
        if (this.f49581n.j()) {
            return zF;
        }
        j0();
        return true;
    }

    @Override // p236n2.C
    public long e(long j10, z1 z1Var) {
        L();
        if (!this.f49553C.i()) {
            return 0L;
        }
        J.a aVarE = this.f49553C.e(j10);
        return z1Var.a(j10, aVarE.f55970a.f55975a, aVarE.f55971b.f55975a);
    }

    int e0(int i10, R0 r10, Y1.f fVar, int i11) {
        if (k0()) {
            return -3;
        }
        U(i10);
        int iU = this.f49589v[i10].U(r10, fVar, i11, this.f49566P);
        if (iU == -3) {
            V(i10);
        }
        return iU;
    }

    @Override // p380v2.r
    public O f(int i10, int i11) {
        return d0(new e(i10, false));
    }

    public void f0() {
        if (this.f49592y) {
            for (b0 b0Var : this.f49589v) {
                b0Var.T();
            }
        }
        this.f49581n.m(this);
        this.f49586s.removeCallbacksAndMessages(null);
        this.f49587t = null;
        this.f49567Q = true;
    }

    @Override // p236n2.C, p236n2.d0
    public long g() {
        long jP;
        L();
        if (this.f49566P || this.f49560J == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f49563M;
        }
        if (this.f49593z) {
            int length = this.f49589v.length;
            jP = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f49552B;
                if (fVar.f49614b[i10] && fVar.f49615c[i10] && !this.f49589v[i10].M()) {
                    jP = Math.min(jP, this.f49589v[i10].C());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        return jP == Long.MIN_VALUE ? this.f49562L : jP;
    }

    @Override // p236n2.C, p236n2.d0
    public void h(long j10) {
    }

    int i0(int i10, long j10) throws Throwable {
        if (k0()) {
            return 0;
        }
        U(i10);
        b0 b0Var = this.f49589v[i10];
        int iH = b0Var.H(j10, this.f49566P);
        b0Var.g0(iH);
        if (iH == 0) {
            V(i10);
        }
        return iH;
    }

    @Override // p236n2.C
    public long k(long j10) {
        L();
        boolean[] zArr = this.f49552B.f49614b;
        if (!this.f49553C.i()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f49558H = false;
        boolean z10 = this.f49562L == j10;
        this.f49562L = j10;
        if (R()) {
            this.f49563M = j10;
            return j10;
        }
        if (this.f49556F == 7 || ((!this.f49566P && !this.f49581n.j()) || !g0(zArr, j10, z10))) {
            this.f49564N = false;
            this.f49563M = j10;
            this.f49566P = false;
            this.f49559I = false;
            if (this.f49581n.j()) {
                b0[] b0VarArr = this.f49589v;
                int length = b0VarArr.length;
                while (i10 < length) {
                    b0VarArr[i10].s();
                    i10++;
                }
                this.f49581n.f();
                return j10;
            }
            this.f49581n.g();
            b0[] b0VarArr2 = this.f49589v;
            int length2 = b0VarArr2.length;
            while (i10 < length2) {
                b0VarArr2[i10].X();
                i10++;
            }
        }
        return j10;
    }

    @Override // p236n2.C
    public long m() {
        if (this.f49559I) {
            this.f49559I = false;
            return this.f49562L;
        }
        if (!this.f49558H) {
            return -9223372036854775807L;
        }
        if (!this.f49566P && O() <= this.f49565O) {
            return -9223372036854775807L;
        }
        this.f49558H = false;
        return this.f49562L;
    }

    @Override // r2.m.f
    public void o() {
        for (b0 b0Var : this.f49589v) {
            b0Var.V();
        }
        this.f49582o.release();
    }

    @Override // p380v2.r
    public void p(J j10) {
        this.f49586s.post(new V(this, j10));
    }

    @Override // p236n2.C
    public long q(p290q2.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        p290q2.y yVar;
        L();
        f fVar = this.f49552B;
        m0 m0Var = fVar.f49613a;
        boolean[] zArr3 = fVar.f49615c;
        int i10 = this.f49560J;
        int i11 = 0;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            c0 c0Var = c0VarArr[i12];
            if (c0Var != null && (yVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) c0Var).f49609a;
                AbstractC1459a.g(zArr3[i13]);
                this.f49560J--;
                zArr3[i13] = false;
                c0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f49557G ? j10 == 0 || this.f49551A : i10 != 0;
        for (int i14 = 0; i14 < yVarArr.length; i14++) {
            if (c0VarArr[i14] == null && (yVar = yVarArr[i14]) != null) {
                AbstractC1459a.g(yVar.length() == 1);
                AbstractC1459a.g(yVar.d(0) == 0);
                int iD = m0Var.d(yVar.k());
                AbstractC1459a.g(!zArr3[iD]);
                this.f49560J++;
                zArr3[iD] = true;
                this.f49559I = yVar.p().f10283u | this.f49559I;
                c0VarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    b0 b0Var = this.f49589v[iD];
                    z10 = (b0Var.F() == 0 || b0Var.b0(j10, true)) ? false : true;
                }
            }
        }
        if (this.f49560J == 0) {
            this.f49564N = false;
            this.f49558H = false;
            this.f49559I = false;
            if (this.f49581n.j()) {
                b0[] b0VarArr = this.f49589v;
                int length = b0VarArr.length;
                while (i11 < length) {
                    b0VarArr[i11].s();
                    i11++;
                }
                this.f49581n.f();
            } else {
                this.f49566P = false;
                b0[] b0VarArr2 = this.f49589v;
                int length2 = b0VarArr2.length;
                while (i11 < length2) {
                    b0VarArr2[i11].X();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = k(j10);
            while (i11 < c0VarArr.length) {
                if (c0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f49557G = true;
        return j10;
    }

    @Override // p236n2.C
    public void r(C.a aVar, long j10) {
        this.f49587t = aVar;
        if (this.f49579l == null) {
            this.f49583p.f();
            j0();
        } else {
            f(this.f49578k, 3).b(this.f49579l);
            h0(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
            t();
            this.f49563M = j10;
        }
    }

    @Override // p236n2.C
    public void s() throws IOException {
        W();
        if (this.f49566P && !this.f49592y) {
            throw z.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p380v2.r
    public void t() {
        this.f49591x = true;
        this.f49586s.post(this.f49584q);
    }

    @Override // p236n2.C
    public m0 u() {
        L();
        return this.f49552B.f49613a;
    }

    @Override // p236n2.C
    public void v(long j10, boolean z10) {
        if (this.f49551A) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f49552B.f49615c;
        int length = this.f49589v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f49589v[i10].r(j10, z10, zArr[i10]);
        }
    }
}
