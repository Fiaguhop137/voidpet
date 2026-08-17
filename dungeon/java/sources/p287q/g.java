package p287q;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1999w;
import androidx.lifecycle.Q;
import androidx.lifecycle.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class g extends Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f51073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f.a f51074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.d f51075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.c f51076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p287q.a f51077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f51078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DialogInterface.OnClickListener f51079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f51080i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f51083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f51084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f51085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f51086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private y f51087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private y f51088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y f51089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y f51090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y f51091t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y f51093v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private y f51095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private y f51096y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51081j = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f51092u = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f51094w = 0;

    class a extends f.a {
        a() {
        }
    }

    private static final class b extends q.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f51098a;

        b(g gVar) {
            this.f51098a = new WeakReference(gVar);
        }

        @Override // q.a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f51098a.get() == null || ((g) this.f51098a.get()).A() || !((g) this.f51098a.get()).y()) {
                return;
            }
            ((g) this.f51098a.get()).H(new p287q.c(i10, charSequence));
        }

        @Override // q.a.d
        void b() {
            if (this.f51098a.get() == null || !((g) this.f51098a.get()).y()) {
                return;
            }
            ((g) this.f51098a.get()).I(true);
        }

        @Override // q.a.d
        void c(CharSequence charSequence) {
            if (this.f51098a.get() != null) {
                ((g) this.f51098a.get()).J(charSequence);
            }
        }

        @Override // q.a.d
        void d(f.b bVar) {
            if (this.f51098a.get() == null || !((g) this.f51098a.get()).y()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new f.b(bVar.b(), ((g) this.f51098a.get()).s());
            }
            ((g) this.f51098a.get()).K(bVar);
        }
    }

    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f51099a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f51099a.post(runnable);
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f51100a;

        d(g gVar) {
            this.f51100a = new WeakReference(gVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f51100a.get() != null) {
                ((g) this.f51100a.get()).Y(true);
            }
        }
    }

    private static void c0(y yVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            yVar.n(obj);
        } else {
            yVar.l(obj);
        }
    }

    boolean A() {
        return this.f51084m;
    }

    boolean B() {
        return this.f51085n;
    }

    AbstractC1999w C() {
        if (this.f51093v == null) {
            this.f51093v = new y();
        }
        return this.f51093v;
    }

    boolean D() {
        return this.f51092u;
    }

    boolean E() {
        return this.f51086o;
    }

    AbstractC1999w F() {
        if (this.f51091t == null) {
            this.f51091t = new y();
        }
        return this.f51091t;
    }

    boolean G() {
        return this.f51082k;
    }

    void H(p287q.c cVar) {
        if (this.f51088q == null) {
            this.f51088q = new y();
        }
        c0(this.f51088q, cVar);
    }

    void I(boolean z10) {
        if (this.f51090s == null) {
            this.f51090s = new y();
        }
        c0(this.f51090s, Boolean.valueOf(z10));
    }

    void J(CharSequence charSequence) {
        if (this.f51089r == null) {
            this.f51089r = new y();
        }
        c0(this.f51089r, charSequence);
    }

    void K(f.b bVar) {
        if (this.f51087p == null) {
            this.f51087p = new y();
        }
        c0(this.f51087p, bVar);
    }

    void L(boolean z10) {
        this.f51083l = z10;
    }

    void M(int i10) {
        this.f51081j = i10;
    }

    void N(f.a aVar) {
        this.f51074c = aVar;
    }

    void O(Executor executor) {
        this.f51073b = executor;
    }

    void P(boolean z10) {
        this.f51084m = z10;
    }

    void Q(f.c cVar) {
        this.f51076e = cVar;
    }

    void R(boolean z10) {
        this.f51085n = z10;
    }

    void S(boolean z10) {
        if (this.f51093v == null) {
            this.f51093v = new y();
        }
        c0(this.f51093v, Boolean.valueOf(z10));
    }

    void T(boolean z10) {
        this.f51092u = z10;
    }

    void U(CharSequence charSequence) {
        if (this.f51096y == null) {
            this.f51096y = new y();
        }
        c0(this.f51096y, charSequence);
    }

    void V(int i10) {
        this.f51094w = i10;
    }

    void W(int i10) {
        if (this.f51095x == null) {
            this.f51095x = new y();
        }
        c0(this.f51095x, Integer.valueOf(i10));
    }

    void X(boolean z10) {
        this.f51086o = z10;
    }

    void Y(boolean z10) {
        if (this.f51091t == null) {
            this.f51091t = new y();
        }
        c0(this.f51091t, Boolean.valueOf(z10));
    }

    void Z(CharSequence charSequence) {
        this.f51080i = charSequence;
    }

    void a0(f.d dVar) {
        this.f51075d = dVar;
    }

    void b0(boolean z10) {
        this.f51082k = z10;
    }

    int e() {
        f.d dVar = this.f51075d;
        if (dVar != null) {
            return p287q.b.b(dVar, this.f51076e);
        }
        return 0;
    }

    p287q.a f() {
        if (this.f51077f == null) {
            this.f51077f = new p287q.a(new b(this));
        }
        return this.f51077f;
    }

    y g() {
        if (this.f51088q == null) {
            this.f51088q = new y();
        }
        return this.f51088q;
    }

    AbstractC1999w h() {
        if (this.f51089r == null) {
            this.f51089r = new y();
        }
        return this.f51089r;
    }

    AbstractC1999w i() {
        if (this.f51087p == null) {
            this.f51087p = new y();
        }
        return this.f51087p;
    }

    int j() {
        return this.f51081j;
    }

    h k() {
        if (this.f51078g == null) {
            this.f51078g = new h();
        }
        return this.f51078g;
    }

    f.a l() {
        if (this.f51074c == null) {
            this.f51074c = new a();
        }
        return this.f51074c;
    }

    Executor m() {
        Executor executor = this.f51073b;
        return executor != null ? executor : new c();
    }

    f.c n() {
        return this.f51076e;
    }

    CharSequence o() {
        f.d dVar = this.f51075d;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    AbstractC1999w p() {
        if (this.f51096y == null) {
            this.f51096y = new y();
        }
        return this.f51096y;
    }

    int q() {
        return this.f51094w;
    }

    AbstractC1999w r() {
        if (this.f51095x == null) {
            this.f51095x = new y();
        }
        return this.f51095x;
    }

    int s() {
        int iE = e();
        return (!p287q.b.d(iE) || p287q.b.c(iE)) ? -1 : 2;
    }

    DialogInterface.OnClickListener t() {
        if (this.f51079h == null) {
            this.f51079h = new d(this);
        }
        return this.f51079h;
    }

    CharSequence u() {
        CharSequence charSequence = this.f51080i;
        if (charSequence != null) {
            return charSequence;
        }
        f.d dVar = this.f51075d;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence v() {
        f.d dVar = this.f51075d;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence w() {
        f.d dVar = this.f51075d;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    AbstractC1999w x() {
        if (this.f51090s == null) {
            this.f51090s = new y();
        }
        return this.f51090s;
    }

    boolean y() {
        return this.f51083l;
    }

    boolean z() {
        f.d dVar = this.f51075d;
        return dVar == null || dVar.f();
    }
}
