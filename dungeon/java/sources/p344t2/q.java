package p344t2;

import B9.t;
import B9.u;
import C9.AbstractC0876t;
import R1.C1349i;
import R1.InterfaceC1352l;
import R1.K;
import R1.L;
import R1.r;
import U1.AbstractC1459a;
import U1.AbstractC1473o;
import U1.AbstractC1477t;
import U1.G;
import U1.InterfaceC1466h;
import U1.InterfaceC1474p;
import U1.J;
import U1.S;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q implements L.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Executor f54322A = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f54323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L.a f54324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f54325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J f54327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final J.b f54328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1466h f54329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f54330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private J f54331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f54332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private R1.J f54333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC0876t f54334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC1474p f54335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s f54336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f54337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f54339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Pair f54341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f54342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f54343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f54344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f54345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f54346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f54347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f54348z;

    class a implements J.b {
        a() {
        }

        @Override // t2.J.b
        public void a(long j10) {
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC1459a.i(null));
            throw null;
        }

        @Override // t2.J.b
        public void b() {
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC1459a.i(null));
            throw null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f54350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f54351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private L.a f54352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f54353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC1466h f54354e = InterfaceC1466h.f12906a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f54355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f54356g;

        public b(Context context, t tVar) {
            this.f54350a = context.getApplicationContext();
            this.f54351b = tVar;
        }

        public q f() {
            AbstractC1459a.g(!this.f54355f);
            if (this.f54352c == null) {
                this.f54352c = new f(this.f54356g);
            }
            q qVar = new q(this, null);
            this.f54355f = true;
            return qVar;
        }

        public b g(InterfaceC1466h interfaceC1466h) {
            this.f54354e = interfaceC1466h;
            return this;
        }

        public b h(boolean z10) {
            this.f54353d = z10;
            return this;
        }
    }

    private final class c implements J, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54358b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private r f54360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f54361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f54362f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f54366j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f54367k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC0876t f54359c = AbstractC0876t.w();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f54363g = -9223372036854775807L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private J.a f54364h = J.a.f54203a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Executor f54365i = q.f54322A;

        public c(Context context, int i10) {
            this.f54358b = i10;
            this.f54357a = S.f0(context);
        }

        private void w(r rVar) {
            rVar.b().V(q.this.C(rVar.f10250E)).P();
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC1459a.e(null));
            throw null;
        }

        @Override // p344t2.J
        public void a(Surface surface, G g10) {
            q.this.O(surface, g10);
        }

        @Override // p344t2.J
        public boolean b() {
            return isInitialized() && q.this.E();
        }

        @Override // p344t2.J
        public void c(long j10) {
            this.f54362f = j10;
        }

        @Override // p344t2.J
        public void d() {
            q.this.f54345w = this.f54363g;
            if (q.this.f54344v >= q.this.f54345w) {
                q.this.T();
            }
        }

        @Override // p344t2.J
        public void e(J.a aVar, Executor executor) {
            this.f54364h = aVar;
            this.f54365i = executor;
        }

        @Override // p344t2.J
        public void f(List list) {
            if (this.f54359c.equals(list)) {
                return;
            }
            this.f54359c = AbstractC0876t.p(list);
            r rVar = this.f54360d;
            if (rVar != null) {
                w(rVar);
            }
        }

        @Override // p344t2.J
        public void g(long j10, long j11) {
            q.this.M(j10 + this.f54362f, j11);
        }

        @Override // p344t2.J
        public boolean h(boolean z10) {
            return q.this.G(z10 && isInitialized());
        }

        @Override // p344t2.J
        public void i() {
            if (isInitialized()) {
                long unused = q.this.f54344v;
                q.this.B(false);
                q.v(q.this);
                android.support.v4.media.session.b.a(AbstractC1459a.e(null));
                throw null;
            }
        }

        @Override // p344t2.J
        public boolean isInitialized() {
            return this.f54367k;
        }

        @Override // p344t2.J
        public void j() {
            if (q.this.f54331i.k() == 0) {
                q.this.z();
                return;
            }
            J j10 = new J();
            boolean z10 = true;
            while (q.this.f54331i.k() > 0) {
                g gVar = (g) AbstractC1459a.e((g) q.this.f54331i.h());
                if (z10) {
                    int i10 = gVar.f54373b;
                    if (i10 == 0 || i10 == 1) {
                        gVar = new g(gVar.f54372a, 0, gVar.f54374c);
                    } else {
                        q.this.z();
                    }
                    z10 = false;
                }
                j10.a(gVar.f54374c, gVar);
            }
            q.this.f54331i = j10;
        }

        @Override // p344t2.J
        public Surface k() {
            AbstractC1459a.g(isInitialized());
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC1459a.e(null));
            throw null;
        }

        @Override // p344t2.J
        public void l() {
            if (q.this.f54326d) {
                q.this.V();
            }
        }

        @Override // p344t2.J
        public void m() {
            if (q.this.f54326d) {
                q.this.U();
            }
        }

        @Override // p344t2.J
        public void n(int i10, r rVar, long j10, int i11, List list) {
            AbstractC1459a.g(isInitialized());
            this.f54359c = AbstractC0876t.p(list);
            this.f54361e = i10;
            this.f54360d = rVar;
            q.this.f54345w = -9223372036854775807L;
            q.this.f54346x = false;
            w(rVar);
            boolean z10 = this.f54363g == -9223372036854775807L;
            if (q.this.f54326d || (this.f54358b == 0 && z10)) {
                long j11 = z10 ? -4611686018427387904L : this.f54363g + 1;
                q.this.f54331i.a(j11, new g(this.f54362f + j10, i11, j11));
            }
        }

        @Override // p344t2.J
        public void o(int i10) {
            if (this.f54358b == 0) {
                q.this.N(i10);
            }
        }

        @Override // p344t2.J
        public void p(float f10) {
            if (this.f54358b == 0) {
                q.this.P(f10);
            }
        }

        @Override // p344t2.J
        public void q() {
            q.this.A();
        }

        @Override // p344t2.J
        public void r(boolean z10) {
            if (isInitialized()) {
                q.v(q.this);
                android.support.v4.media.session.b.a(AbstractC1459a.e(null));
                throw null;
            }
            this.f54363g = -9223372036854775807L;
            q.this.B(z10);
            this.f54366j = false;
        }

        @Override // p344t2.J
        public void release() {
            q.this.L();
        }

        @Override // p344t2.J
        public boolean s(long j10, J.b bVar) {
            AbstractC1459a.g(isInitialized());
            if (!q.this.S()) {
                return false;
            }
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC1459a.e(null));
            throw null;
        }

        @Override // p344t2.J
        public void t(boolean z10) {
            if (q.this.f54326d) {
                q.this.H(z10);
            }
        }

        @Override // p344t2.J
        public void u(s sVar) {
            if (this.f54358b == 0) {
                q.this.R(sVar);
            }
        }

        @Override // p344t2.J
        public boolean v(r rVar) throws J.c {
            AbstractC1459a.g(!isInitialized());
            boolean zK = q.this.K(rVar, this.f54358b);
            this.f54367k = zK;
            return zK;
        }
    }

    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements K.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final t f54369b = u.a(new r());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f54370a;

        public e(boolean z10) {
            this.f54370a = z10;
        }

        public static /* synthetic */ Class a() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static final class f implements L.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K.b f54371a;

        public f(boolean z10) {
            this.f54371a = new e(z10);
        }

        @Override // R1.L.a
        public L a(Context context, C1349i c1349i, InterfaceC1352l interfaceC1352l, L.b bVar, Executor executor, long j10, boolean z10) {
            try {
                ((L.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(K.b.class).newInstance(this.f54371a)).a(context, c1349i, interfaceC1352l, bVar, executor, j10, z10);
                return null;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f54372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f54374c;

        public g(long j10, int i10, long j11) {
            this.f54372a = j10;
            this.f54373b = i10;
            this.f54374c = j11;
        }
    }

    private q(b bVar) {
        this.f54323a = bVar.f54350a;
        this.f54331i = new J();
        this.f54324b = (L.a) AbstractC1459a.i(bVar.f54352c);
        this.f54325c = new SparseArray();
        this.f54334l = AbstractC0876t.w();
        this.f54333k = R1.J.f10088a;
        this.f54326d = bVar.f54353d;
        InterfaceC1466h interfaceC1466h = bVar.f54354e;
        this.f54329g = interfaceC1466h;
        this.f54327e = new C4196e(bVar.f54351b, interfaceC1466h);
        this.f54328f = new a();
        this.f54330h = new CopyOnWriteArraySet();
        this.f54332j = new r.b().P();
        this.f54339q = -9223372036854775807L;
        this.f54344v = -9223372036854775807L;
        this.f54345w = -9223372036854775807L;
        this.f54347y = -1;
        this.f54343u = 0;
    }

    /* synthetic */ q(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z10) {
        if (F()) {
            this.f54342t++;
            this.f54327e.r(z10);
            while (this.f54331i.k() > 1) {
                this.f54331i.h();
            }
            if (this.f54331i.k() == 1) {
                g gVar = (g) AbstractC1459a.e((g) this.f54331i.h());
                this.f54339q = gVar.f54372a;
                this.f54340r = gVar.f54373b;
                J();
            }
            this.f54344v = -9223372036854775807L;
            this.f54345w = -9223372036854775807L;
            this.f54346x = false;
            ((InterfaceC1474p) AbstractC1459a.i(this.f54335m)).h(new n(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1349i C(C1349i c1349i) {
        return (c1349i == null || !c1349i.g() || this.f54338p) ? C1349i.f10161h : c1349i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E() {
        return this.f54342t == 0 && this.f54346x && this.f54327e.b();
    }

    private boolean F() {
        return this.f54343u == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(boolean z10) {
        return this.f54327e.h(z10 && this.f54342t == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(boolean z10) {
        this.f54327e.t(z10);
    }

    private void I(Surface surface, int i10, int i11) {
    }

    private void J() {
        this.f54327e.n(1, this.f54332j, this.f54339q, this.f54340r, AbstractC0876t.w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(r rVar, int i10) throws J.c {
        if (i10 != 0) {
            if (!F()) {
                return false;
            }
            android.support.v4.media.session.b.a(AbstractC1459a.e(null));
            throw null;
        }
        AbstractC1459a.g(this.f54343u == 0);
        C1349i c1349iC = C(rVar.f10250E);
        try {
            if (this.f54337o) {
                c1349iC = C1349i.f10161h;
            } else if (c1349iC.f10171c == 7 && Build.VERSION.SDK_INT < 34 && AbstractC1473o.e()) {
                c1349iC = c1349iC.a().e(6).a();
            } else if (!AbstractC1473o.f(c1349iC.f10171c) && Build.VERSION.SDK_INT >= 29) {
                AbstractC1477t.h("PlaybackVidGraphWrapper", S.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(c1349iC.f10171c)));
                c1349iC = C1349i.f10161h;
            }
            C1349i c1349i = c1349iC;
            InterfaceC1474p interfaceC1474pE = this.f54329g.e((Looper) AbstractC1459a.i(Looper.myLooper()), null);
            this.f54335m = interfaceC1474pE;
            L.a aVar = this.f54324b;
            Context context = this.f54323a;
            InterfaceC1352l interfaceC1352l = InterfaceC1352l.f10182a;
            Objects.requireNonNull(interfaceC1474pE);
            aVar.a(context, c1349i, interfaceC1352l, this, new p(interfaceC1474pE), 0L, false);
            throw null;
        } catch (AbstractC1473o.a e10) {
            throw new J.c(e10, rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j10, long j11) {
        this.f54327e.g(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10) {
        this.f54327e.o(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(float f10) {
        this.f54327e.p(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(s sVar) {
        this.f54336n = sVar;
        this.f54327e.u(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        int i10 = this.f54347y;
        return i10 != -1 && i10 == this.f54348z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.f54327e.d();
        this.f54346x = true;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void b(q qVar) {
        qVar.f54342t--;
    }

    static /* synthetic */ L v(q qVar) {
        qVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.f54327e.j();
    }

    public void A() {
        G g10 = G.f12858c;
        I(null, g10.b(), g10.a());
        this.f54341s = null;
    }

    public J D(int i10) {
        if (S.q(this.f54325c, i10)) {
            return (J) this.f54325c.get(i10);
        }
        c cVar = new c(this.f54323a, i10);
        if (i10 == 0) {
            y(cVar);
        }
        this.f54325c.put(i10, cVar);
        return cVar;
    }

    public void L() {
        if (this.f54343u == 2) {
            return;
        }
        InterfaceC1474p interfaceC1474p = this.f54335m;
        if (interfaceC1474p != null) {
            interfaceC1474p.e(null);
        }
        this.f54341s = null;
        this.f54343u = 2;
    }

    public void O(Surface surface, G g10) {
        Pair pair = this.f54341s;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((G) this.f54341s.second).equals(g10)) {
            return;
        }
        this.f54341s = Pair.create(surface, g10);
        I(surface, g10.b(), g10.a());
    }

    public void Q(int i10) {
        this.f54347y = i10;
    }

    public void U() {
        this.f54327e.m();
    }

    public void V() {
        this.f54327e.l();
    }

    public void y(d dVar) {
        this.f54330h.add(dVar);
    }
}
