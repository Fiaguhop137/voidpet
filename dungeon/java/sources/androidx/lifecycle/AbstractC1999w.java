package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1999w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f24376k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f24377a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p269p.b f24378b = new p269p.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f24379c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f24381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f24382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f24386j;

    /* JADX INFO: renamed from: androidx.lifecycle.w$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1999w.this.f24377a) {
                obj = AbstractC1999w.this.f24382f;
                AbstractC1999w.this.f24382f = AbstractC1999w.f24376k;
            }
            AbstractC1999w.this.n(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.w$b */
    private class b extends d {
        b(z zVar) {
            super(zVar);
        }

        @Override // androidx.lifecycle.AbstractC1999w.d
        boolean d() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.w$c */
    class c extends d implements InterfaceC1991n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final InterfaceC1994q f24389e;

        c(InterfaceC1994q interfaceC1994q, z zVar) {
            super(zVar);
            this.f24389e = interfaceC1994q;
        }

        @Override // androidx.lifecycle.AbstractC1999w.d
        void b() {
            this.f24389e.y().d(this);
        }

        @Override // androidx.lifecycle.AbstractC1999w.d
        boolean c(InterfaceC1994q interfaceC1994q) {
            return this.f24389e == interfaceC1994q;
        }

        @Override // androidx.lifecycle.AbstractC1999w.d
        boolean d() {
            return this.f24389e.y().b().g(AbstractC1987j.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1991n
        public void f(InterfaceC1994q interfaceC1994q, AbstractC1987j.a aVar) {
            AbstractC1987j.b bVarB = this.f24389e.y().b();
            if (bVarB == AbstractC1987j.b.DESTROYED) {
                AbstractC1999w.this.m(this.f24391a);
                return;
            }
            AbstractC1987j.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f24389e.y().b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.w$d */
    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final z f24391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f24392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24393c = -1;

        d(z zVar) {
            this.f24391a = zVar;
        }

        void a(boolean z10) {
            if (z10 == this.f24392b) {
                return;
            }
            this.f24392b = z10;
            AbstractC1999w.this.c(z10 ? 1 : -1);
            if (this.f24392b) {
                AbstractC1999w.this.e(this);
            }
        }

        void b() {
        }

        boolean c(InterfaceC1994q interfaceC1994q) {
            return false;
        }

        abstract boolean d();
    }

    public AbstractC1999w() {
        Object obj = f24376k;
        this.f24382f = obj;
        this.f24386j = new a();
        this.f24381e = obj;
        this.f24383g = -1;
    }

    static void b(String str) {
        if (p251o.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f24392b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f24393c;
            int i11 = this.f24383g;
            if (i10 >= i11) {
                return;
            }
            dVar.f24393c = i11;
            dVar.f24391a.a(this.f24381e);
        }
    }

    void c(int i10) {
        int i11 = this.f24379c;
        this.f24379c = i10 + i11;
        if (this.f24380d) {
            return;
        }
        this.f24380d = true;
        while (true) {
            try {
                int i12 = this.f24379c;
                if (i11 == i12) {
                    this.f24380d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f24380d = false;
                throw th;
            }
        }
    }

    void e(d dVar) {
        if (this.f24384h) {
            this.f24385i = true;
            return;
        }
        this.f24384h = true;
        do {
            this.f24385i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                p.b.d dVarE = this.f24378b.e();
                while (dVarE.hasNext()) {
                    d((d) ((Map.Entry) dVarE.next()).getValue());
                    if (this.f24385i) {
                        break;
                    }
                }
            }
        } while (this.f24385i);
        this.f24384h = false;
    }

    public Object f() {
        Object obj = this.f24381e;
        if (obj != f24376k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f24379c > 0;
    }

    public void h(InterfaceC1994q interfaceC1994q, z zVar) {
        b("observe");
        if (interfaceC1994q.y().b() == AbstractC1987j.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1994q, zVar);
        d dVar = (d) this.f24378b.i(zVar, cVar);
        if (dVar != null && !dVar.c(interfaceC1994q)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC1994q.y().a(cVar);
    }

    public void i(z zVar) {
        b("observeForever");
        b bVar = new b(zVar);
        d dVar = (d) this.f24378b.i(zVar, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(Object obj) {
        boolean z10;
        synchronized (this.f24377a) {
            z10 = this.f24382f == f24376k;
            this.f24382f = obj;
        }
        if (z10) {
            p251o.c.g().c(this.f24386j);
        }
    }

    public void m(z zVar) {
        b("removeObserver");
        d dVar = (d) this.f24378b.j(zVar);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(Object obj) {
        b("setValue");
        this.f24383g++;
        this.f24381e = obj;
        e(null);
    }
}
