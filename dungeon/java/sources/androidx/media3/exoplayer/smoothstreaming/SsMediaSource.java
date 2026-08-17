package androidx.media3.exoplayer.smoothstreaming;

import R1.v;
import S2.s;
import U1.AbstractC1459a;
import U1.S;
import W1.f;
import W1.x;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p075e2.C3262l;
import p075e2.u;
import p075e2.w;
import p236n2.AbstractC4004a;
import p236n2.B;
import p236n2.C;
import p236n2.C4014k;
import p236n2.C4027y;
import p236n2.D;
import p236n2.InterfaceC4013j;
import p236n2.L;
import p236n2.M;
import p236n2.f0;
import p308r2.e;
import p308r2.j;
import p308r2.k;
import p308r2.m;
import p308r2.n;
import p308r2.o;

/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource extends AbstractC4004a implements m.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f24765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f24766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f.a f24767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b.a f24768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC4013j f24769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u f24770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f24771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f24772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final L.a f24773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o.a f24774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f24775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f24776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m f24777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private n f24778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private x f24779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f24780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p218m2.a f24781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f24782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private R1.u f24783z;

    public static final class Factory implements M {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f24784j = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b.a f24785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f.a f24786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC4013j f24787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private w f24788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k f24789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f24790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private o.a f24791i;

        public Factory(f.a aVar) {
            this(new androidx.media3.exoplayer.smoothstreaming.a.C0308a(aVar), aVar);
        }

        public Factory(b.a aVar, f.a aVar2) {
            this.f24785c = (b.a) AbstractC1459a.e(aVar);
            this.f24786d = aVar2;
            this.f24788f = new C3262l();
            this.f24789g = new j();
            this.f24790h = 30000L;
            this.f24787e = new C4014k();
            b(true);
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SsMediaSource f(R1.u uVar) {
            AbstractC1459a.e(uVar.f10345b);
            o.a bVar = this.f24791i;
            if (bVar == null) {
                bVar = new p218m2.b();
            }
            List list = uVar.f10345b.f10443d;
            return new SsMediaSource(uVar, null, this.f24786d, !list.isEmpty() ? new p182k2.b(bVar, list) : bVar, this.f24785c, this.f24787e, null, this.f24788f.a(uVar), this.f24789g, this.f24790h, null);
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f24785c.b(z10);
            return this;
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f24788f = (w) AbstractC1459a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory e(k kVar) {
            this.f24789g = (k) AbstractC1459a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // n2.D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f24785c.a((s.a) AbstractC1459a.e(aVar));
            return this;
        }
    }

    static {
        v.a("media3.exoplayer.smoothstreaming");
    }

    private SsMediaSource(R1.u uVar, p218m2.a aVar, f.a aVar2, o.a aVar3, b.a aVar4, InterfaceC4013j interfaceC4013j, e eVar, u uVar2, k kVar, long j10) {
        AbstractC1459a.g(aVar == null || !aVar.f48996d);
        this.f24783z = uVar;
        R1.u.h hVar = (R1.u.h) AbstractC1459a.e(uVar.f10345b);
        this.f24781x = aVar;
        this.f24766i = hVar.f10440a.equals(Uri.EMPTY) ? null : S.F(hVar.f10440a);
        this.f24767j = aVar2;
        this.f24774q = aVar3;
        this.f24768k = aVar4;
        this.f24769l = interfaceC4013j;
        this.f24770m = uVar2;
        this.f24771n = kVar;
        this.f24772o = j10;
        this.f24773p = y(null);
        this.f24765h = aVar != null;
        this.f24775r = new ArrayList();
    }

    /* synthetic */ SsMediaSource(R1.u uVar, p218m2.a aVar, f.a aVar2, o.a aVar3, b.a aVar4, InterfaceC4013j interfaceC4013j, e eVar, u uVar2, k kVar, long j10, a aVar5) {
        this(uVar, aVar, aVar2, aVar3, aVar4, interfaceC4013j, eVar, uVar2, kVar, j10);
    }

    private void L() {
        f0 f0Var;
        for (int i10 = 0; i10 < this.f24775r.size(); i10++) {
            ((d) this.f24775r.get(i10)).x(this.f24781x);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (m2.a.b bVar : this.f24781x.f48998f) {
            if (bVar.f49014k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f49014k - 1) + bVar.c(bVar.f49014k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f24781x.f48996d ? -9223372036854775807L : 0L;
            p218m2.a aVar = this.f24781x;
            boolean z10 = aVar.f48996d;
            f0Var = new f0(j10, 0L, 0L, 0L, true, z10, z10, aVar, c());
        } else {
            p218m2.a aVar2 = this.f24781x;
            if (aVar2.f48996d) {
                long j11 = aVar2.f49000h;
                if (j11 != -9223372036854775807L && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jM0 = j13 - S.M0(this.f24772o);
                if (jM0 < 5000000) {
                    jM0 = Math.min(5000000L, j13 / 2);
                }
                f0Var = new f0(-9223372036854775807L, j13, j12, jM0, true, true, true, this.f24781x, c());
            } else {
                long j14 = aVar2.f48999g;
                if (j14 == -9223372036854775807L) {
                    j14 = jMax - jMax2;
                }
                long j15 = j14;
                f0Var = new f0(jMax2 + j15, j15, jMax2, 0L, true, false, false, this.f24781x, c());
            }
        }
        E(f0Var);
    }

    private void M() {
        if (this.f24781x.f48996d) {
            this.f24782y.postDelayed(new p200l2.a(this), Math.max(0L, (this.f24780w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.f24777t.i()) {
            return;
        }
        o oVar = new o(this.f24776s, new W1.j.b().i(this.f24766i).b(1).a(), 4, this.f24774q);
        this.f24777t.n(oVar, this, this.f24771n.b(oVar.f52107c));
    }

    @Override // p236n2.AbstractC4004a
    protected void D(x xVar) {
        this.f24779v = xVar;
        this.f24770m.b(Looper.myLooper(), B());
        this.f24770m.e();
        if (this.f24765h) {
            this.f24778u = new n.a();
            L();
            return;
        }
        this.f24776s = this.f24767j.a();
        m mVar = new m("SsMediaSource");
        this.f24777t = mVar;
        this.f24778u = mVar;
        this.f24782y = S.z();
        N();
    }

    @Override // p236n2.AbstractC4004a
    protected void F() {
        this.f24781x = this.f24765h ? this.f24781x : null;
        this.f24776s = null;
        this.f24780w = 0L;
        m mVar = this.f24777t;
        if (mVar != null) {
            mVar.l();
            this.f24777t = null;
        }
        Handler handler = this.f24782y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f24782y = null;
        }
        this.f24770m.release();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void i(o oVar, long j10, long j11, boolean z10) {
        C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f24771n.d(oVar.f52105a);
        this.f24773p.l(c4027y, oVar.f52107c);
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void j(o oVar, long j10, long j11) {
        C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f24771n.d(oVar.f52105a);
        this.f24773p.o(c4027y, oVar.f52107c);
        this.f24781x = (p218m2.a) oVar.e();
        this.f24780w = j10 - j11;
        L();
        M();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public m.c n(o oVar, long j10, long j11, IOException iOException, int i10) {
        C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long jA = this.f24771n.a(new k.c(c4027y, new B(oVar.f52107c), iOException, i10));
        m.c cVarH = jA == -9223372036854775807L ? m.f52088g : m.h(false, jA);
        boolean zC = cVarH.c();
        this.f24773p.s(c4027y, oVar.f52107c, iOException, !zC);
        if (!zC) {
            this.f24771n.d(oVar.f52105a);
        }
        return cVarH;
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void l(o oVar, long j10, long j11, int i10) {
        this.f24773p.u(i10 == 0 ? new C4027y(oVar.f52105a, oVar.f52106b, j10) : new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f52107c, i10);
    }

    @Override // p236n2.D
    public synchronized R1.u c() {
        return this.f24783z;
    }

    @Override // p236n2.D
    public synchronized void f(R1.u uVar) {
        this.f24783z = uVar;
    }

    @Override // p236n2.D
    public void g(C c10) {
        ((d) c10).w();
        this.f24775r.remove(c10);
    }

    @Override // p236n2.D
    public C o(D.b bVar, p308r2.b bVar2, long j10) {
        L.a aVarY = y(bVar);
        d dVar = new d(this.f24781x, this.f24768k, this.f24779v, this.f24769l, null, this.f24770m, w(bVar), this.f24771n, aVarY, this.f24778u, bVar2);
        this.f24775r.add(dVar);
        return dVar;
    }

    @Override // p236n2.D
    public void s() {
        this.f24778u.a();
    }
}
