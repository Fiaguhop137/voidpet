package p310r4;

import H4.g;
import L4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
class l implements h.b, M4.a.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final c f52295z = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f52296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M4.c f52297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f52298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p199l1.e f52299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f52300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f52301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p364u4.a f52302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p364u4.a f52303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p364u4.a f52304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p364u4.a f52305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f52306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f f52307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f52308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f52309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f52310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f52311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v f52312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    p274p4.a f52313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f52314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    q f52315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f52316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    p f52317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f52318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f52319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f52320y;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f52321a;

        a(g gVar) {
            this.f52321a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f52321a.d()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f52296a.c(this.f52321a)) {
                            l.this.e(this.f52321a);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f52323a;

        b(g gVar) {
            this.f52323a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f52323a.d()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f52296a.c(this.f52323a)) {
                            l.this.f52317v.c();
                            l.this.f(this.f52323a);
                            l.this.r(this.f52323a);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f52325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f52326b;

        d(g gVar, Executor executor) {
            this.f52325a = gVar;
            this.f52326b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f52325a.equals(((d) obj).f52325a);
            }
            return false;
        }

        public int hashCode() {
            return this.f52325a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f52327a;

        e() {
            this(new ArrayList(2));
        }

        e(List list) {
            this.f52327a = list;
        }

        private static d g(g gVar) {
            return new d(gVar, L4.e.a());
        }

        void a(g gVar, Executor executor) {
            this.f52327a.add(new d(gVar, executor));
        }

        boolean c(g gVar) {
            return this.f52327a.contains(g(gVar));
        }

        void clear() {
            this.f52327a.clear();
        }

        e e() {
            return new e(new ArrayList(this.f52327a));
        }

        void h(g gVar) {
            this.f52327a.remove(g(gVar));
        }

        boolean isEmpty() {
            return this.f52327a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f52327a.iterator();
        }

        int size() {
            return this.f52327a.size();
        }
    }

    l(p364u4.a aVar, p364u4.a aVar2, p364u4.a aVar3, p364u4.a aVar4, m mVar, p.a aVar5, p199l1.e eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f52295z);
    }

    l(p364u4.a aVar, p364u4.a aVar2, p364u4.a aVar3, p364u4.a aVar4, m mVar, p.a aVar5, p199l1.e eVar, c cVar) {
        this.f52296a = new e();
        this.f52297b = M4.c.a();
        this.f52306k = new AtomicInteger();
        this.f52302g = aVar;
        this.f52303h = aVar2;
        this.f52304i = aVar3;
        this.f52305j = aVar4;
        this.f52301f = mVar;
        this.f52298c = aVar5;
        this.f52299d = eVar;
        this.f52300e = cVar;
    }

    private p364u4.a j() {
        if (this.f52309n) {
            return this.f52304i;
        }
        return this.f52310o ? this.f52305j : this.f52303h;
    }

    private boolean m() {
        return this.f52316u || this.f52314s || this.f52319x;
    }

    private synchronized void q() {
        if (this.f52307l == null) {
            throw new IllegalArgumentException();
        }
        this.f52296a.clear();
        this.f52307l = null;
        this.f52317v = null;
        this.f52312q = null;
        this.f52316u = false;
        this.f52319x = false;
        this.f52314s = false;
        this.f52320y = false;
        this.f52318w.H(false);
        this.f52318w = null;
        this.f52315t = null;
        this.f52313r = null;
        this.f52299d.a(this);
    }

    @Override // r4.h.b
    public void a(v vVar, p274p4.a aVar, boolean z10) {
        synchronized (this) {
            this.f52312q = vVar;
            this.f52313r = aVar;
            this.f52320y = z10;
        }
        o();
    }

    @Override // r4.h.b
    public void b(q qVar) {
        synchronized (this) {
            this.f52315t = qVar;
        }
        n();
    }

    @Override // r4.h.b
    public void c(h hVar) {
        j().execute(hVar);
    }

    synchronized void d(g gVar, Executor executor) {
        try {
            this.f52297b.c();
            this.f52296a.a(gVar, executor);
            if (this.f52314s) {
                k(1);
                executor.execute(new b(gVar));
            } else if (this.f52316u) {
                k(1);
                executor.execute(new a(gVar));
            } else {
                k.a(!this.f52319x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void e(g gVar) {
        try {
            gVar.b(this.f52315t);
        } catch (Throwable th) {
            throw new p310r4.b(th);
        }
    }

    void f(g gVar) {
        try {
            gVar.a(this.f52317v, this.f52313r, this.f52320y);
        } catch (Throwable th) {
            throw new p310r4.b(th);
        }
    }

    void g() {
        if (m()) {
            return;
        }
        this.f52319x = true;
        this.f52318w.o();
        this.f52301f.d(this, this.f52307l);
    }

    @Override // M4.a.f
    public M4.c h() {
        return this.f52297b;
    }

    void i() {
        p pVar;
        synchronized (this) {
            try {
                this.f52297b.c();
                k.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f52306k.decrementAndGet();
                k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.f52317v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void k(int i10) {
        p pVar;
        k.a(m(), "Not yet complete!");
        if (this.f52306k.getAndAdd(i10) == 0 && (pVar = this.f52317v) != null) {
            pVar.c();
        }
    }

    synchronized l l(f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52307l = fVar;
        this.f52308m = z10;
        this.f52309n = z11;
        this.f52310o = z12;
        this.f52311p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f52297b.c();
                if (this.f52319x) {
                    q();
                    return;
                }
                if (this.f52296a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f52316u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f52316u = true;
                f fVar = this.f52307l;
                e<d> eVarE = this.f52296a.e();
                k(eVarE.size() + 1);
                this.f52301f.a(this, fVar, null);
                for (d dVar : eVarE) {
                    dVar.f52326b.execute(new a(dVar.f52325a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f52297b.c();
                if (this.f52319x) {
                    this.f52312q.recycle();
                    q();
                    return;
                }
                if (this.f52296a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f52314s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f52317v = this.f52300e.a(this.f52312q, this.f52308m, this.f52307l, this.f52298c);
                this.f52314s = true;
                e<d> eVarE = this.f52296a.e();
                k(eVarE.size() + 1);
                this.f52301f.a(this, this.f52307l, this.f52317v);
                for (d dVar : eVarE) {
                    dVar.f52326b.execute(new b(dVar.f52325a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean p() {
        return this.f52311p;
    }

    synchronized void r(g gVar) {
        try {
            this.f52297b.c();
            this.f52296a.h(gVar);
            if (this.f52296a.isEmpty()) {
                g();
                if (this.f52314s || this.f52316u) {
                    if (this.f52306k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f52318w = hVar;
            (hVar.O() ? this.f52302g : j()).execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
