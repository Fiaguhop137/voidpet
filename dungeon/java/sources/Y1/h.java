package Y1;

import U1.AbstractC1459a;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f16822a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f16826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g[] f16827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f16830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f16831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16834m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16823b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f16835n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f16824c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f16825d = new ArrayDeque();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.v();
        }
    }

    protected h(f[] fVarArr, g[] gVarArr) {
        this.f16826e = fVarArr;
        this.f16828g = fVarArr.length;
        for (int i10 = 0; i10 < this.f16828g; i10++) {
            this.f16826e[i10] = i();
        }
        this.f16827f = gVarArr;
        this.f16829h = gVarArr.length;
        for (int i11 = 0; i11 < this.f16829h; i11++) {
            this.f16827f[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f16822a = aVar;
        aVar.start();
    }

    private boolean h() {
        return !this.f16824c.isEmpty() && this.f16829h > 0;
    }

    private boolean m() {
        e eVarK;
        synchronized (this.f16823b) {
            while (!this.f16833l && !h()) {
                try {
                    this.f16823b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f16833l) {
                return false;
            }
            f fVar = (f) this.f16824c.removeFirst();
            g[] gVarArr = this.f16827f;
            int i10 = this.f16829h - 1;
            this.f16829h = i10;
            g gVar = gVarArr[i10];
            boolean z10 = this.f16832k;
            this.f16832k = false;
            if (fVar.t()) {
                gVar.o(4);
            } else {
                gVar.f16819b = fVar.f16813f;
                if (fVar.u()) {
                    gVar.o(134217728);
                }
                if (!p(fVar.f16813f)) {
                    gVar.f16821d = true;
                }
                try {
                    eVarK = l(fVar, gVar, z10);
                } catch (OutOfMemoryError e10) {
                    eVarK = k(e10);
                } catch (RuntimeException e11) {
                    eVarK = k(e11);
                }
                if (eVarK != null) {
                    synchronized (this.f16823b) {
                        this.f16831j = eVarK;
                    }
                    return false;
                }
            }
            synchronized (this.f16823b) {
                try {
                    if (this.f16832k) {
                        gVar.z();
                    } else if (gVar.f16821d) {
                        this.f16834m++;
                        gVar.z();
                    } else {
                        gVar.f16820c = this.f16834m;
                        this.f16834m = 0;
                        this.f16825d.addLast(gVar);
                    }
                    s(fVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    private void q() {
        if (h()) {
            this.f16823b.notify();
        }
    }

    private void r() throws e {
        e eVar = this.f16831j;
        if (eVar != null) {
            throw eVar;
        }
    }

    private void s(f fVar) {
        fVar.p();
        f[] fVarArr = this.f16826e;
        int i10 = this.f16828g;
        this.f16828g = i10 + 1;
        fVarArr[i10] = fVar;
    }

    private void u(g gVar) {
        gVar.p();
        g[] gVarArr = this.f16827f;
        int i10 = this.f16829h;
        this.f16829h = i10 + 1;
        gVarArr[i10] = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    @Override // Y1.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(f fVar) {
        synchronized (this.f16823b) {
            r();
            AbstractC1459a.a(fVar == this.f16830i);
            this.f16824c.addLast(fVar);
            q();
            this.f16830i = null;
        }
    }

    @Override // Y1.d
    public final void e(long j10) {
        synchronized (this.f16823b) {
            try {
                AbstractC1459a.g(this.f16828g == this.f16826e.length || this.f16832k);
                this.f16835n = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y1.d
    public final void flush() {
        synchronized (this.f16823b) {
            try {
                this.f16832k = true;
                this.f16834m = 0;
                f fVar = this.f16830i;
                if (fVar != null) {
                    s(fVar);
                    this.f16830i = null;
                }
                while (!this.f16824c.isEmpty()) {
                    s((f) this.f16824c.removeFirst());
                }
                while (!this.f16825d.isEmpty()) {
                    ((g) this.f16825d.removeFirst()).z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract f i();

    protected abstract g j();

    protected abstract e k(Throwable th);

    protected abstract e l(f fVar, g gVar, boolean z10);

    @Override // Y1.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f f() {
        f fVar;
        synchronized (this.f16823b) {
            r();
            AbstractC1459a.g(this.f16830i == null);
            int i10 = this.f16828g;
            if (i10 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.f16826e;
                int i11 = i10 - 1;
                this.f16828g = i11;
                fVar = fVarArr[i11];
            }
            this.f16830i = fVar;
        }
        return fVar;
    }

    @Override // Y1.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final g a() {
        synchronized (this.f16823b) {
            try {
                r();
                if (this.f16825d.isEmpty()) {
                    return null;
                }
                return (g) this.f16825d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final boolean p(long j10) {
        boolean z10;
        synchronized (this.f16823b) {
            long j11 = this.f16835n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    @Override // Y1.d
    public void release() {
        synchronized (this.f16823b) {
            this.f16833l = true;
            this.f16823b.notify();
        }
        try {
            this.f16822a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected void t(g gVar) {
        synchronized (this.f16823b) {
            u(gVar);
            q();
        }
    }

    protected final void w(int i10) {
        AbstractC1459a.g(this.f16828g == this.f16826e.length);
        for (f fVar : this.f16826e) {
            fVar.A(i10);
        }
    }
}
