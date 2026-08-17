package p344t2;

import R1.M;
import R1.r;
import U1.AbstractC1459a;
import U1.G;
import U1.InterfaceC1466h;
import Z1.P;
import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: t2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4196e implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f54207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f54208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f54209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f54210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f54211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private J.a f54213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f54214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s f54215i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2.e$b */
    final class b implements x.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f54216a;

        private b() {
        }

        /* synthetic */ b(C4196e c4196e, a aVar) {
            this();
        }

        @Override // t2.x.a
        public void a(M m10) {
            this.f54216a = new r.b().F0(m10.f10094a).h0(m10.f10095b).y0("video/raw").P();
            C4196e.this.f54214h.execute(new RunnableC4199h(this, m10));
        }

        @Override // t2.x.a
        public void b() {
            C4196e.this.f54214h.execute(new RunnableC4198g(this));
            ((J.b) C4196e.this.f54209c.remove()).b();
        }

        @Override // t2.x.a
        public void c(long j10, long j11, boolean z10) {
            if (z10 && C4196e.this.f54210d != null) {
                C4196e.this.f54214h.execute(new RunnableC4197f(this));
            }
            r rVarP = this.f54216a;
            if (rVarP == null) {
                rVarP = new r.b().P();
            }
            C4196e.this.f54215i.c(j11, j10, rVarP, null);
            ((J.b) C4196e.this.f54209c.remove()).a(j10);
        }
    }

    public C4196e(t tVar, InterfaceC1466h interfaceC1466h) {
        this.f54207a = tVar;
        tVar.m(interfaceC1466h);
        this.f54208b = new x(new b(this, null), tVar);
        this.f54209c = new ArrayDeque();
        this.f54211e = new r.b().P();
        this.f54212f = -9223372036854775807L;
        this.f54213g = J.a.f54203a;
        this.f54214h = new ExecutorC4193b();
        this.f54215i = new C4194c();
    }

    public static /* synthetic */ void w(Runnable runnable) {
    }

    public static /* synthetic */ void y(long j10, long j11, r rVar, MediaFormat mediaFormat) {
    }

    @Override // p344t2.J
    public void a(Surface surface, G g10) {
        this.f54210d = surface;
        this.f54207a.o(surface);
    }

    @Override // p344t2.J
    public boolean b() {
        return this.f54208b.d();
    }

    @Override // p344t2.J
    public void c(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // p344t2.J
    public void d() {
        this.f54208b.l();
    }

    @Override // p344t2.J
    public void e(J.a aVar, Executor executor) {
        this.f54213g = aVar;
        this.f54214h = executor;
    }

    @Override // p344t2.J
    public void f(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // p344t2.J
    public void g(long j10, long j11) throws J.c {
        try {
            this.f54208b.j(j10, j11);
        } catch (P e10) {
            throw new J.c(e10, this.f54211e);
        }
    }

    @Override // p344t2.J
    public boolean h(boolean z10) {
        return this.f54207a.d(z10);
    }

    @Override // p344t2.J
    public void i() {
        throw new UnsupportedOperationException();
    }

    @Override // p344t2.J
    public boolean isInitialized() {
        return true;
    }

    @Override // p344t2.J
    public void j() {
        this.f54207a.a();
    }

    @Override // p344t2.J
    public Surface k() {
        return (Surface) AbstractC1459a.i(this.f54210d);
    }

    @Override // p344t2.J
    public void l() {
        this.f54207a.i();
    }

    @Override // p344t2.J
    public void m() {
        this.f54207a.h();
    }

    @Override // p344t2.J
    public void n(int i10, r rVar, long j10, int i11, List list) {
        AbstractC1459a.g(list.isEmpty());
        int i12 = rVar.f10284v;
        r rVar2 = this.f54211e;
        if (i12 != rVar2.f10284v || rVar.f10285w != rVar2.f10285w) {
            this.f54208b.i(i12, rVar.f10285w);
        }
        float f10 = rVar.f10288z;
        if (f10 != this.f54211e.f10288z) {
            this.f54207a.n(f10);
        }
        this.f54211e = rVar;
        if (j10 != this.f54212f) {
            this.f54208b.h(i11, j10);
            this.f54212f = j10;
        }
    }

    @Override // p344t2.J
    public void o(int i10) {
        this.f54207a.l(i10);
    }

    @Override // p344t2.J
    public void p(float f10) {
        this.f54207a.p(f10);
    }

    @Override // p344t2.J
    public void q() {
        this.f54210d = null;
        this.f54207a.o(null);
    }

    @Override // p344t2.J
    public void r(boolean z10) {
        if (z10) {
            this.f54207a.k();
        }
        this.f54208b.b();
        this.f54209c.clear();
    }

    @Override // p344t2.J
    public void release() {
    }

    @Override // p344t2.J
    public boolean s(long j10, J.b bVar) {
        this.f54209c.add(bVar);
        this.f54208b.g(j10);
        this.f54214h.execute(new RunnableC4195d(this));
        return true;
    }

    @Override // p344t2.J
    public void t(boolean z10) {
        this.f54207a.e(z10);
    }

    @Override // p344t2.J
    public void u(s sVar) {
        this.f54215i = sVar;
    }

    @Override // p344t2.J
    public boolean v(r rVar) {
        return true;
    }
}
