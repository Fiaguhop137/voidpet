package p236n2;

import B9.t;
import C9.AbstractC0876t;
import S2.h;
import S2.o;
import S2.s;
import U1.AbstractC1459a;
import U1.S;
import W1.f;
import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p075e2.w;
import p308r2.k;
import p380v2.C4250m;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.O;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class r implements M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f49835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.a f49836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s.a f49837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private D.a f49838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f49839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f49840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f49841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f49842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f49843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f49844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f49845m;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f49846a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f.a f49849d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s.a f49851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f49853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private k f49854i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f49847b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f49848c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49850e = true;

        public a(u uVar, s.a aVar) {
            this.f49846a = uVar;
            this.f49851f = aVar;
        }

        public static /* synthetic */ D.a c(a aVar, f.a aVar2) {
            aVar.getClass();
            return new X.b(aVar2, aVar.f49846a);
        }

        private t g(int i10) {
            t c4016m;
            t c4019p;
            t tVar = (t) this.f49847b.get(Integer.valueOf(i10));
            if (tVar != null) {
                return tVar;
            }
            f.a aVar = (f.a) AbstractC1459a.e(this.f49849d);
            if (i10 == 0) {
                int i11 = DashMediaSource.Factory.f24455k;
                c4016m = new C4016m(DashMediaSource.Factory.class.asSubclass(D.a.class), aVar);
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i12 = HlsMediaSource.Factory.f24581r;
                        c4016m = new C4018o(HlsMediaSource.Factory.class.asSubclass(D.a.class), aVar);
                    } else if (i10 == 3) {
                        c4019p = new C4019p(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(D.a.class));
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        c4019p = new C4020q(this, aVar);
                    }
                    this.f49847b.put(Integer.valueOf(i10), c4019p);
                    return c4019p;
                }
                int i13 = SsMediaSource.Factory.f24784j;
                c4016m = new C4017n(SsMediaSource.Factory.class.asSubclass(D.a.class), aVar);
            }
            c4019p = c4016m;
            this.f49847b.put(Integer.valueOf(i10), c4019p);
            return c4019p;
        }

        public D.a f(int i10) {
            D.a aVar = (D.a) this.f49848c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            D.a aVar2 = (D.a) g(i10).get();
            w wVar = this.f49853h;
            if (wVar != null) {
                aVar2.d(wVar);
            }
            k kVar = this.f49854i;
            if (kVar != null) {
                aVar2.e(kVar);
            }
            aVar2.a(this.f49851f);
            aVar2.b(this.f49850e);
            aVar2.c(this.f49852g);
            this.f49848c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void h(int i10) {
            this.f49852g = i10;
            this.f49846a.c(i10);
        }

        public void i(f.a aVar) {
            if (aVar != this.f49849d) {
                this.f49849d = aVar;
                this.f49847b.clear();
                this.f49848c.clear();
            }
        }

        public void j(w wVar) {
            this.f49853h = wVar;
            Iterator it = this.f49848c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).d(wVar);
            }
        }

        public void k(int i10) {
            u uVar = this.f49846a;
            if (uVar instanceof C4250m) {
                ((C4250m) uVar).n(i10);
            }
        }

        public void l(k kVar) {
            this.f49854i = kVar;
            Iterator it = this.f49848c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).e(kVar);
            }
        }

        public void m(boolean z10) {
            this.f49850e = z10;
            this.f49846a.b(z10);
            Iterator it = this.f49848c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).b(z10);
            }
        }

        public void n(s.a aVar) {
            this.f49851f = aVar;
            this.f49846a.a(aVar);
            Iterator it = this.f49848c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).a(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements InterfaceC4253p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final R1.r f49855a;

        public b(R1.r rVar) {
            this.f49855a = rVar;
        }

        @Override // p380v2.InterfaceC4253p
        public void a(long j10, long j11) {
        }

        @Override // p380v2.InterfaceC4253p
        public void b(p380v2.r rVar) {
            O oF = rVar.f(0, 3);
            rVar.p(new J.b(-9223372036854775807L));
            rVar.t();
            oF.b(this.f49855a.b().y0("text/x-unknown").U(this.f49855a.f10277o).P());
        }

        @Override // p380v2.InterfaceC4253p
        public boolean f(InterfaceC4254q interfaceC4254q) {
            return true;
        }

        @Override // p380v2.InterfaceC4253p
        public int j(InterfaceC4254q interfaceC4254q, I i10) {
            return interfaceC4254q.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // p380v2.InterfaceC4253p
        public void release() {
        }
    }

    public r(f.a aVar, u uVar) {
        this.f49836d = aVar;
        h hVar = new h();
        this.f49837e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f49835c = aVar2;
        aVar2.i(aVar);
        this.f49840h = -9223372036854775807L;
        this.f49841i = -9223372036854775807L;
        this.f49842j = -9223372036854775807L;
        this.f49843k = -3.4028235E38f;
        this.f49844l = -3.4028235E38f;
        this.f49845m = true;
    }

    public r(Context context, u uVar) {
        this(new W1.k.a(context), uVar);
    }

    public static /* synthetic */ InterfaceC4253p[] g(r rVar, R1.r rVar2) {
        return new InterfaceC4253p[]{rVar.f49837e.a(rVar2) ? new o(rVar.f49837e.c(rVar2), null) : new b(rVar2)};
    }

    private static D l(R1.u uVar, D d10) {
        R1.u.d dVar = uVar.f10349f;
        return (dVar.f10375b == 0 && dVar.f10377d == Long.MIN_VALUE && !dVar.f10379f) ? d10 : new C4009f.b(d10).n(uVar.f10349f.f10375b).l(uVar.f10349f.f10377d).k(!uVar.f10349f.f10380g).i(uVar.f10349f.f10378e).m(uVar.f10349f.f10379f).j(uVar.f10349f.f10381h).h();
    }

    private D m(R1.u uVar, D d10) {
        AbstractC1459a.e(uVar.f10345b);
        uVar.f10345b.getClass();
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static D.a n(Class cls) {
        try {
            return (D.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static D.a o(Class cls, f.a aVar) {
        try {
            return (D.a) cls.getConstructor(f.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // n2.D.a
    public D f(R1.u uVar) {
        AbstractC1459a.e(uVar.f10345b);
        String scheme = uVar.f10345b.f10440a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((D.a) AbstractC1459a.e(this.f49838f)).f(uVar);
        }
        if (Objects.equals(uVar.f10345b.f10441b, "application/x-image-uri")) {
            long jM0 = S.M0(uVar.f10345b.f10448i);
            android.support.v4.media.session.b.a(AbstractC1459a.e(null));
            return new C4024v.b(jM0, null).f(uVar);
        }
        R1.u.h hVar = uVar.f10345b;
        int iX0 = S.x0(hVar.f10440a, hVar.f10441b);
        if (uVar.f10345b.f10448i != -9223372036854775807L) {
            this.f49835c.k(1);
        }
        try {
            D.a aVarF = this.f49835c.f(iX0);
            R1.u.g.a aVarA = uVar.f10347d.a();
            if (uVar.f10347d.f10422a == -9223372036854775807L) {
                aVarA.k(this.f49840h);
            }
            if (uVar.f10347d.f10425d == -3.4028235E38f) {
                aVarA.j(this.f49843k);
            }
            if (uVar.f10347d.f10426e == -3.4028235E38f) {
                aVarA.h(this.f49844l);
            }
            if (uVar.f10347d.f10423b == -9223372036854775807L) {
                aVarA.i(this.f49841i);
            }
            if (uVar.f10347d.f10424c == -9223372036854775807L) {
                aVarA.g(this.f49842j);
            }
            R1.u.g gVarF = aVarA.f();
            if (!gVarF.equals(uVar.f10347d)) {
                uVar = uVar.a().b(gVarF).a();
            }
            D dF = aVarF.f(uVar);
            AbstractC0876t abstractC0876t = ((R1.u.h) S.i(uVar.f10345b)).f10445f;
            if (!abstractC0876t.isEmpty()) {
                D[] dArr = new D[abstractC0876t.size() + 1];
                dArr[0] = dF;
                for (int i10 = 0; i10 < abstractC0876t.size(); i10++) {
                    if (this.f49845m) {
                        R1.r rVarP = new R1.r.b().y0(((R1.u.k) abstractC0876t.get(i10)).f10467b).n0(((R1.u.k) abstractC0876t.get(i10)).f10468c).A0(((R1.u.k) abstractC0876t.get(i10)).f10469d).w0(((R1.u.k) abstractC0876t.get(i10)).f10470e).l0(((R1.u.k) abstractC0876t.get(i10)).f10471f).j0(((R1.u.k) abstractC0876t.get(i10)).f10472g).P();
                        X.b bVar = new X.b(this.f49836d, new C4015l(this, rVarP));
                        if (this.f49837e.a(rVarP)) {
                            rVarP = rVarP.b().y0("application/x-media3-cues").U(rVarP.f10277o).Y(this.f49837e.b(rVarP)).P();
                        }
                        X.b bVarI = bVar.i(0, rVarP);
                        k kVar = this.f49839g;
                        if (kVar != null) {
                            bVarI.e(kVar);
                        }
                        dArr[i10 + 1] = bVarI.f(R1.u.c(((R1.u.k) abstractC0876t.get(i10)).f10466a.toString()));
                    } else {
                        h0.b bVar2 = new h0.b(this.f49836d);
                        k kVar2 = this.f49839g;
                        if (kVar2 != null) {
                            bVar2.b(kVar2);
                        }
                        dArr[i10 + 1] = bVar2.a((R1.u.k) abstractC0876t.get(i10), -9223372036854775807L);
                    }
                }
                dF = new P(dArr);
            }
            return m(uVar, l(uVar, dF));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // n2.D.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public r b(boolean z10) {
        this.f49845m = z10;
        this.f49835c.m(z10);
        return this;
    }

    @Override // n2.D.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public r c(int i10) {
        this.f49835c.h(i10);
        return this;
    }

    @Override // n2.D.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public r d(w wVar) {
        this.f49835c.j((w) AbstractC1459a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // n2.D.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public r e(k kVar) {
        this.f49839g = (k) AbstractC1459a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f49835c.l(kVar);
        return this;
    }

    @Override // n2.D.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public r a(s.a aVar) {
        this.f49837e = (s.a) AbstractC1459a.e(aVar);
        this.f49835c.n(aVar);
        return this;
    }
}
