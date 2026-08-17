package p236n2;

import B9.t;
import R1.F;
import R1.r;
import U1.AbstractC1459a;
import U1.S;
import W1.f;
import W1.x;
import android.net.Uri;
import android.os.Looper;
import p003a2.D1;
import p075e2.C3262l;
import p075e2.u;
import p075e2.w;
import p308r2.j;
import p308r2.k;
import p380v2.C4250m;
import p380v2.J;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC4004a implements W.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f.a f49617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q.a f49618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f49619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k f49620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f49621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f49622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r f49623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t f49624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f49625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f49626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f49627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f49629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private R1.u f49630u;

    class a extends AbstractC4025w {
        a(F f10) {
            super(f10);
        }

        @Override // p236n2.AbstractC4025w, R1.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f9927f = true;
            return bVar;
        }

        @Override // p236n2.AbstractC4025w, R1.F
        public F.c o(int i10, F.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f9955k = true;
            return cVar;
        }
    }

    public static final class b implements M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.a f49632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Q.a f49633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w f49634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k f49635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private t f49637h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49638i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private r f49639j;

        public b(f.a aVar) {
            this(aVar, new C4250m());
        }

        public b(f.a aVar, Q.a aVar2) {
            this(aVar, aVar2, new C3262l(), new j(), 1048576);
        }

        public b(f.a aVar, Q.a aVar2, w wVar, k kVar, int i10) {
            this.f49632c = aVar;
            this.f49633d = aVar2;
            this.f49634e = wVar;
            this.f49635f = kVar;
            this.f49636g = i10;
        }

        public b(f.a aVar, p380v2.u uVar) {
            this(aVar, new Y(uVar));
        }

        public static /* synthetic */ Q g(p380v2.u uVar, D1 d10) {
            return new C4007d(uVar);
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public X f(R1.u uVar) {
            AbstractC1459a.e(uVar.f10345b);
            return new X(uVar, this.f49632c, this.f49633d, this.f49634e.a(uVar), this.f49635f, this.f49636g, this.f49638i, this.f49639j, this.f49637h, null);
        }

        b i(int i10, r rVar) {
            this.f49638i = i10;
            this.f49639j = (r) AbstractC1459a.e(rVar);
            return this;
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b d(w wVar) {
            this.f49634e = (w) AbstractC1459a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b e(k kVar) {
            this.f49635f = (k) AbstractC1459a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    private X(R1.u uVar, f.a aVar, Q.a aVar2, u uVar2, k kVar, int i10, int i11, r rVar, t tVar) {
        this.f49630u = uVar;
        this.f49617h = aVar;
        this.f49618i = aVar2;
        this.f49619j = uVar2;
        this.f49620k = kVar;
        this.f49621l = i10;
        this.f49623n = rVar;
        this.f49622m = i11;
        this.f49625p = true;
        this.f49626q = -9223372036854775807L;
        this.f49624o = tVar;
    }

    /* synthetic */ X(R1.u uVar, f.a aVar, Q.a aVar2, u uVar2, k kVar, int i10, int i11, r rVar, t tVar, a aVar3) {
        this(uVar, aVar, aVar2, uVar2, kVar, i10, i11, rVar, tVar);
    }

    private R1.u.h G() {
        return (R1.u.h) AbstractC1459a.e(c().f10345b);
    }

    private void H() {
        F f0Var = new f0(this.f49626q, this.f49627r, false, this.f49628s, null, c());
        if (this.f49625p) {
            f0Var = new a(f0Var);
        }
        E(f0Var);
    }

    @Override // p236n2.AbstractC4004a
    protected void D(x xVar) {
        this.f49629t = xVar;
        this.f49619j.b((Looper) AbstractC1459a.e(Looper.myLooper()), B());
        this.f49619j.e();
        H();
    }

    @Override // p236n2.AbstractC4004a
    protected void F() {
        this.f49619j.release();
    }

    @Override // p236n2.D
    public synchronized R1.u c() {
        return this.f49630u;
    }

    @Override // p236n2.D
    public synchronized void f(R1.u uVar) {
        this.f49630u = uVar;
    }

    @Override // p236n2.D
    public void g(C c10) {
        ((W) c10).f0();
    }

    @Override // n2.W.c
    public void k(long j10, J j11, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f49626q;
        }
        boolean zI = j11.i();
        if (!this.f49625p && this.f49626q == j10 && this.f49627r == zI && this.f49628s == z10) {
            return;
        }
        this.f49626q = j10;
        this.f49627r = zI;
        this.f49628s = z10;
        this.f49625p = false;
        H();
    }

    @Override // p236n2.D
    public C o(D.b bVar, p308r2.b bVar2, long j10) {
        f fVarA = this.f49617h.a();
        x xVar = this.f49629t;
        if (xVar != null) {
            fVarA.j(xVar);
        }
        R1.u.h hVarG = G();
        Uri uri = hVarG.f10440a;
        Q qA = this.f49618i.a(B());
        u uVar = this.f49619j;
        e2.t.a aVarW = w(bVar);
        k kVar = this.f49620k;
        L.a aVarY = y(bVar);
        String str = hVarG.f10444e;
        int i10 = this.f49621l;
        int i11 = this.f49622m;
        r rVar = this.f49623n;
        long jM0 = S.M0(hVarG.f10448i);
        t tVar = this.f49624o;
        return new W(uri, fVarA, qA, uVar, aVarW, kVar, aVarY, this, bVar2, str, i10, i11, rVar, jM0, tVar != null ? (p326s2.a) tVar.get() : null);
    }

    @Override // p236n2.D
    public void s() {
    }
}
