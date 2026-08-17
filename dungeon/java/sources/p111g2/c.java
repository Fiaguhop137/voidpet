package p111g2;

import C9.AbstractC0879w;
import R1.z;
import U1.AbstractC1459a;
import U1.S;
import W1.f;
import W1.j;
import W1.s;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p093f2.d;
import p236n2.B;
import p236n2.C4027y;
import p236n2.L;
import p308r2.e;
import p308r2.k;
import p308r2.m;
import p308r2.o;

/* JADX INFO: loaded from: classes.dex */
public final class c implements m, m.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m.a f41940p = new p111g2.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f41941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f41942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f41943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f41944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f41945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f41946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private L.a f41947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f41948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f41949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m.e f41950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f41951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f41952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f41953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f41955o;

    private class b implements m.b {
        private b() {
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }

        @Override // g2.m.b
        public boolean a(Uri uri, k.c cVar, boolean z10) {
            C0482c c0482c;
            if (c.this.f41953m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((i) S.i(c.this.f41951k)).f42056e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0482c c0482c2 = (C0482c) c.this.f41944d.get(((i.b) list.get(i11)).f42069a);
                    if (c0482c2 != null && jElapsedRealtime < c0482c2.f41964h) {
                        i10++;
                    }
                }
                k.b bVarC = c.this.f41943c.c(new k.a(1, 0, c.this.f41951k.f42056e.size(), i10), cVar);
                if (bVarC != null && bVarC.f52079a == 2 && (c0482c = (C0482c) c.this.f41944d.get(uri)) != null) {
                    c0482c.h(bVarC.f52080b);
                }
            }
            return false;
        }

        @Override // g2.m.b
        public void f() {
            c.this.f41945e.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2.c$c, reason: collision with other inner class name */
    final class C0482c implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f41957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f41958b = new m("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f41959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f41960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f41961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f41962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f41963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f41964h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f41965i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IOException f41966j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f41967k;

        public C0482c(Uri uri) {
            this.f41957a = uri;
            this.f41959c = c.this.f41941a.a(4);
        }

        public static /* synthetic */ void a(C0482c c0482c, Uri uri) {
            c0482c.f41965i = false;
            c0482c.r(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j10) {
            this.f41964h = SystemClock.elapsedRealtime() + j10;
            return this.f41957a.equals(c.this.f41952l) && !c.this.P();
        }

        private Uri k() {
            f fVar = this.f41960d;
            if (fVar != null) {
                f.h hVar = fVar.f41991v;
                if (hVar.f42049a != -9223372036854775807L || hVar.f42053e) {
                    Uri.Builder builderBuildUpon = this.f41957a.buildUpon();
                    f fVar2 = this.f41960d;
                    if (fVar2.f41991v.f42053e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f41980k + ((long) fVar2.f41987r.size())));
                        f fVar3 = this.f41960d;
                        if (fVar3.f41983n != -9223372036854775807L) {
                            List list = fVar3.f41988s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.d) AbstractC0879w.d(list)).f42032m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.h hVar2 = this.f41960d.f41991v;
                    if (hVar2.f42049a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f42050b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f41957a;
        }

        private void r(Uri uri) {
            o.a aVarA = c.this.f41942b.a(c.this.f41951k, this.f41960d);
            j jVarA = new j.b().i(uri).b(1).a();
            c.v(c.this);
            o oVar = new o(this.f41959c, jVarA, 4, aVarA);
            this.f41958b.n(oVar, this, c.this.f41943c.b(oVar.f52107c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(Uri uri) {
            this.f41964h = 0L;
            if (this.f41965i || this.f41958b.j() || this.f41958b.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f41963g) {
                r(uri);
            } else {
                this.f41965i = true;
                c.this.f41949i.postDelayed(new d(this, uri), this.f41963g - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(f fVar, C4027y c4027y) {
            boolean z10;
            long j10;
            f fVar2 = this.f41960d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f41961e = jElapsedRealtime;
            f fVarJ = c.this.J(fVar2, fVar);
            this.f41960d = fVarJ;
            IOException dVar = null;
            if (fVarJ != fVar2) {
                this.f41966j = null;
                this.f41962f = jElapsedRealtime;
                c.this.W(this.f41957a, fVarJ);
            } else if (!fVarJ.f41984o) {
                long size = fVar.f41980k + ((long) fVar.f41987r.size());
                f fVar3 = this.f41960d;
                if (size < fVar3.f41980k) {
                    dVar = new m.c(this.f41957a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (jElapsedRealtime - this.f41962f > S.o1(fVar3.f41982m) * c.this.f41946f) {
                        dVar = new m.d(this.f41957a);
                    }
                }
                if (dVar != null) {
                    this.f41966j = dVar;
                    c.this.R(this.f41957a, new k.c(c4027y, new B(4), dVar, 1), z10);
                }
            }
            f fVar4 = this.f41960d;
            if (!fVar4.f41991v.f42053e) {
                j10 = fVar4 != fVar2 ? fVar4.f41982m : fVar4.f41982m / 2;
            } else if (fVar4 == fVar2) {
                long j11 = fVar4.f41983n;
                j10 = j11 != -9223372036854775807L ? j11 / 2 : fVar4.f41982m / 2;
            } else {
                j10 = 0;
            }
            this.f41963g = (jElapsedRealtime + S.o1(j10)) - c4027y.f49881f;
            if (this.f41960d.f41984o) {
                return;
            }
            if (this.f41957a.equals(c.this.f41952l) || this.f41967k) {
                s(k());
            }
        }

        public void A(boolean z10) {
            this.f41967k = z10;
        }

        public f m() {
            return this.f41960d;
        }

        public boolean o() {
            return this.f41967k;
        }

        public boolean p() {
            int i10;
            if (this.f41960d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, S.o1(this.f41960d.f41990u));
            f fVar = this.f41960d;
            return fVar.f41984o || (i10 = fVar.f41973d) == 2 || i10 == 1 || this.f41961e + jMax > jElapsedRealtime;
        }

        public void q(boolean z10) {
            s(z10 ? k() : this.f41957a);
        }

        public void t() throws IOException {
            this.f41958b.a();
            IOException iOException = this.f41966j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // r2.m.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void i(o oVar, long j10, long j11, boolean z10) {
            C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            c.this.f41943c.d(oVar.f52105a);
            c.this.f41947g.l(c4027y, 4);
        }

        @Override // r2.m.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, long j10, long j11) {
            j jVar = (j) oVar.e();
            C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            if (jVar instanceof f) {
                y((f) jVar, c4027y);
                c.this.f41947g.o(c4027y, 4);
            } else {
                this.f41966j = z.c("Loaded playlist has unexpected type.", null);
                c.this.f41947g.s(c4027y, 4, this.f41966j, true);
            }
            c.this.f41943c.d(oVar.f52105a);
        }

        @Override // r2.m.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public m.c n(o oVar, long j10, long j11, IOException iOException, int i10) {
            m.c cVarH;
            C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            boolean z10 = iOException instanceof k.a;
            if ((oVar.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof s ? ((s) iOException).f14548d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f41963g = SystemClock.elapsedRealtime();
                    q(false);
                    ((L.a) S.i(c.this.f41947g)).s(c4027y, oVar.f52107c, iOException, true);
                    return m.f52087f;
                }
            }
            k.c cVar = new k.c(c4027y, new B(oVar.f52107c), iOException, i10);
            if (c.this.R(this.f41957a, cVar, false)) {
                long jA = c.this.f41943c.a(cVar);
                cVarH = jA != -9223372036854775807L ? m.h(false, jA) : m.f52088g;
            } else {
                cVarH = m.f52087f;
            }
            boolean zC = cVarH.c();
            c.this.f41947g.s(c4027y, oVar.f52107c, iOException, !zC);
            if (!zC) {
                c.this.f41943c.d(oVar.f52105a);
            }
            return cVarH;
        }

        @Override // r2.m.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void l(o oVar, long j10, long j11, int i10) {
            c.this.f41947g.u(i10 == 0 ? new C4027y(oVar.f52105a, oVar.f52106b, j10) : new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f52107c, i10);
        }

        public void z() {
            this.f41958b.l();
        }
    }

    public c(d dVar, k kVar, l lVar, e eVar) {
        this(dVar, kVar, lVar, eVar, 3.5d);
    }

    public c(d dVar, k kVar, l lVar, e eVar, double d10) {
        this.f41941a = dVar;
        this.f41942b = lVar;
        this.f41943c = kVar;
        this.f41946f = d10;
        this.f41945e = new CopyOnWriteArrayList();
        this.f41944d = new HashMap();
        this.f41955o = -9223372036854775807L;
    }

    private void H(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f41944d.put(uri, new C0482c(uri));
        }
    }

    private static f.C0483f I(f fVar, f fVar2) {
        int i10 = (int) (fVar2.f41980k - fVar.f41980k);
        List list = fVar.f41987r;
        if (i10 < list.size()) {
            return (f.C0483f) list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f J(f fVar, f fVar2) {
        if (fVar2.f(fVar)) {
            return fVar2.c(L(fVar, fVar2), K(fVar, fVar2));
        }
        return fVar2.f41984o ? fVar.d() : fVar;
    }

    private int K(f fVar, f fVar2) {
        f.C0483f c0483fI;
        if (fVar2.f41978i) {
            return fVar2.f41979j;
        }
        f fVar3 = this.f41953m;
        return (fVar == null || (c0483fI = I(fVar, fVar2)) == null) ? fVar3 != null ? fVar3.f41979j : 0 : (fVar.f41979j + c0483fI.f42041d) - ((f.C0483f) fVar2.f41987r.get(0)).f42041d;
    }

    private long L(f fVar, f fVar2) {
        if (fVar2.f41985p) {
            return fVar2.f41977h;
        }
        f fVar3 = this.f41953m;
        long j10 = fVar3 != null ? fVar3.f41977h : 0L;
        if (fVar != null) {
            int size = fVar.f41987r.size();
            f.C0483f c0483fI = I(fVar, fVar2);
            if (c0483fI != null) {
                return fVar.f41977h + c0483fI.f42042e;
            }
            if (size == fVar2.f41980k - fVar.f41980k) {
                return fVar.e();
            }
        }
        return j10;
    }

    private Uri M(Uri uri) {
        f.e eVar;
        f fVar = this.f41953m;
        if (fVar == null || !fVar.f41991v.f42053e || (eVar = (f.e) fVar.f41989t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f42034b));
        int i10 = eVar.f42035c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    private boolean N(Uri uri) {
        List list = this.f41951k.f42056e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((i.b) list.get(i10)).f42069a)) {
                return true;
            }
        }
        return false;
    }

    private void O(Uri uri) {
        C0482c c0482c = (C0482c) this.f41944d.get(uri);
        f fVarM = c0482c.m();
        if (c0482c.o()) {
            return;
        }
        c0482c.A(true);
        if (fVarM == null || fVarM.f41984o) {
            return;
        }
        c0482c.q(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        List list = this.f41951k.f42056e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0482c c0482c = (C0482c) AbstractC1459a.e((C0482c) this.f41944d.get(((i.b) list.get(i10)).f42069a));
            if (jElapsedRealtime > c0482c.f41964h) {
                Uri uri = c0482c.f41957a;
                this.f41952l = uri;
                c0482c.s(M(uri));
                return true;
            }
        }
        return false;
    }

    private void Q(Uri uri) {
        if (uri.equals(this.f41952l) || !N(uri)) {
            return;
        }
        f fVar = this.f41953m;
        if (fVar == null || !fVar.f41984o) {
            this.f41952l = uri;
            C0482c c0482c = (C0482c) this.f41944d.get(uri);
            f fVar2 = c0482c.f41960d;
            if (fVar2 == null || !fVar2.f41984o) {
                c0482c.s(M(uri));
            } else {
                this.f41953m = fVar2;
                this.f41950j.m(fVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(Uri uri, k.c cVar, boolean z10) {
        Iterator it = this.f41945e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((m.b) it.next()).a(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Uri uri, f fVar) {
        if (uri.equals(this.f41952l)) {
            if (this.f41953m == null) {
                this.f41954n = !fVar.f41984o;
                this.f41955o = fVar.f41977h;
            }
            this.f41953m = fVar;
            this.f41950j.m(fVar);
        }
        Iterator it = this.f41945e.iterator();
        while (it.hasNext()) {
            ((m.b) it.next()).f();
        }
    }

    static /* synthetic */ e v(c cVar) {
        cVar.getClass();
        return null;
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void i(o oVar, long j10, long j11, boolean z10) {
        C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f41943c.d(oVar.f52105a);
        this.f41947g.l(c4027y, 4);
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void j(o oVar, long j10, long j11) {
        j jVar = (j) oVar.e();
        boolean z10 = jVar instanceof f;
        i iVarE = z10 ? i.e(jVar.f42075a) : (i) jVar;
        this.f41951k = iVarE;
        this.f41952l = ((i.b) iVarE.f42056e.get(0)).f42069a;
        this.f41945e.add(new b(this, null));
        H(iVarE.f42055d);
        C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        C0482c c0482c = (C0482c) this.f41944d.get(this.f41952l);
        if (z10) {
            c0482c.y((f) jVar, c4027y);
        } else {
            c0482c.q(false);
        }
        this.f41943c.d(oVar.f52105a);
        this.f41947g.o(c4027y, 4);
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public m.c n(o oVar, long j10, long j11, IOException iOException, int i10) {
        C4027y c4027y = new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long jA = this.f41943c.a(new k.c(c4027y, new B(oVar.f52107c), iOException, i10));
        boolean z10 = jA == -9223372036854775807L;
        this.f41947g.s(c4027y, oVar.f52107c, iOException, z10);
        if (z10) {
            this.f41943c.d(oVar.f52105a);
        }
        return z10 ? m.f52088g : m.h(false, jA);
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void l(o oVar, long j10, long j11, int i10) {
        this.f41947g.u(i10 == 0 ? new C4027y(oVar.f52105a, oVar.f52106b, j10) : new C4027y(oVar.f52105a, oVar.f52106b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f52107c, i10);
    }

    @Override // p111g2.m
    public void a(Uri uri) {
        C0482c c0482c = (C0482c) this.f41944d.get(uri);
        if (c0482c != null) {
            c0482c.A(false);
        }
    }

    @Override // p111g2.m
    public void b(Uri uri) throws IOException {
        ((C0482c) this.f41944d.get(uri)).t();
    }

    @Override // p111g2.m
    public void c(Uri uri, L.a aVar, m.e eVar) {
        this.f41949i = S.z();
        this.f41947g = aVar;
        this.f41950j = eVar;
        o oVar = new o(this.f41941a.a(4), new j.b().i(uri).b(1).a(), 4, this.f41942b.b());
        AbstractC1459a.g(this.f41948h == null);
        m mVar = new m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f41948h = mVar;
        mVar.n(oVar, this, this.f41943c.b(oVar.f52107c));
    }

    @Override // p111g2.m
    public long d() {
        return this.f41955o;
    }

    @Override // p111g2.m
    public i e() {
        return this.f41951k;
    }

    @Override // p111g2.m
    public void f(Uri uri) {
        ((C0482c) this.f41944d.get(uri)).q(true);
    }

    @Override // p111g2.m
    public void g(m.b bVar) {
        AbstractC1459a.e(bVar);
        this.f41945e.add(bVar);
    }

    @Override // p111g2.m
    public boolean h(Uri uri) {
        return ((C0482c) this.f41944d.get(uri)).p();
    }

    @Override // p111g2.m
    public boolean k() {
        return this.f41954n;
    }

    @Override // p111g2.m
    public boolean m(Uri uri, long j10) {
        C0482c c0482c = (C0482c) this.f41944d.get(uri);
        if (c0482c != null) {
            return !c0482c.h(j10);
        }
        return false;
    }

    @Override // p111g2.m
    public void o() throws IOException {
        m mVar = this.f41948h;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = this.f41952l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // p111g2.m
    public void p(m.b bVar) {
        this.f41945e.remove(bVar);
    }

    @Override // p111g2.m
    public f q(Uri uri, boolean z10) {
        f fVarM = ((C0482c) this.f41944d.get(uri)).m();
        if (fVarM != null && z10) {
            Q(uri);
            O(uri);
        }
        return fVarM;
    }

    @Override // p111g2.m
    public void stop() {
        this.f41952l = null;
        this.f41953m = null;
        this.f41951k = null;
        this.f41955o = -9223372036854775807L;
        this.f41948h.l();
        this.f41948h = null;
        Iterator it = this.f41944d.values().iterator();
        while (it.hasNext()) {
            ((C0482c) it.next()).z();
        }
        this.f41949i.removeCallbacksAndMessages(null);
        this.f41949i = null;
        this.f41944d.clear();
    }
}
