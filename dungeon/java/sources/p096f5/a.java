package p096f5;

import V4.k;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p096f5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f41740a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f41743d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f41744e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f41745f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41742c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f41741b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f41746g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f5.a$a, reason: collision with other inner class name */
    class RunnableC0476a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f41747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f41748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f41749c;

        RunnableC0476a(boolean z10, e eVar, boolean z11) {
            this.f41747a = z10;
            this.f41748b = eVar;
            this.f41749c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f41747a) {
                this.f41748b.b(a.this);
            } else if (this.f41749c) {
                this.f41748b.a(a.this);
            } else {
                this.f41748b.c(a.this);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f41751a;

        b(e eVar) {
            this.f41751a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41751a.d(a.this);
        }
    }

    public interface c {
    }

    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    public static c i() {
        return null;
    }

    private void m() {
        boolean zJ = j();
        boolean zW = w();
        for (Pair pair : this.f41746g) {
            l((e) pair.first, (Executor) pair.second, zJ, zW);
        }
    }

    private synchronized boolean r(Throwable th, Map map) {
        if (!this.f41742c && this.f41741b == d.IN_PROGRESS) {
            this.f41741b = d.FAILURE;
            this.f41744e = th;
            this.f41740a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean t(float f10) {
        if (!this.f41742c && this.f41741b == d.IN_PROGRESS) {
            if (f10 < this.f41745f) {
                return false;
            }
            this.f41745f = f10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    private boolean v(Object obj, boolean z10) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f41742c && this.f41741b == d.IN_PROGRESS) {
                            if (z10) {
                                this.f41741b = d.SUCCESS;
                                this.f41745f = 1.0f;
                            }
                            Object obj4 = this.f41743d;
                            if (obj4 != obj) {
                                try {
                                    this.f41743d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj4;
                                    throw th;
                                }
                            } else {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                h(obj2);
                            }
                            return true;
                        }
                        if (obj != null) {
                            h(obj);
                        }
                        return false;
                    } catch (Throwable th2) {
                        obj3 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (obj3 != null) {
                h(obj3);
            }
            throw th4;
        }
    }

    private synchronized boolean w() {
        return k() && !a();
    }

    @Override // p096f5.c
    public synchronized boolean a() {
        return this.f41741b != d.IN_PROGRESS;
    }

    @Override // p096f5.c
    public synchronized Object b() {
        return this.f41743d;
    }

    @Override // p096f5.c
    public synchronized boolean c() {
        return this.f41743d != null;
    }

    @Override // p096f5.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f41742c) {
                    return false;
                }
                this.f41742c = true;
                Object obj = this.f41743d;
                this.f41743d = null;
                if (obj != null) {
                    h(obj);
                }
                if (!a()) {
                    m();
                }
                synchronized (this) {
                    this.f41746g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p096f5.c
    public synchronized Throwable d() {
        return this.f41744e;
    }

    @Override // p096f5.c
    public synchronized float e() {
        return this.f41745f;
    }

    @Override // p096f5.c
    public boolean f() {
        return false;
    }

    @Override // p096f5.c
    public void g(e eVar, Executor executor) {
        k.g(eVar);
        k.g(executor);
        synchronized (this) {
            try {
                if (this.f41742c) {
                    return;
                }
                if (this.f41741b == d.IN_PROGRESS) {
                    this.f41746g.add(Pair.create(eVar, executor));
                }
                boolean z10 = c() || a() || w();
                if (z10) {
                    l(eVar, executor, j(), w());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p096f5.c
    public Map getExtras() {
        return this.f41740a;
    }

    protected void h(Object obj) {
    }

    public synchronized boolean j() {
        return this.f41741b == d.FAILURE;
    }

    public synchronized boolean k() {
        return this.f41742c;
    }

    protected void l(e eVar, Executor executor, boolean z10, boolean z11) {
        RunnableC0476a runnableC0476a = new RunnableC0476a(z10, eVar, z11);
        i();
        executor.execute(runnableC0476a);
    }

    protected void n() {
        for (Pair pair : this.f41746g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void o(Map map) {
        this.f41740a = map;
    }

    protected boolean p(Throwable th) {
        return q(th, null);
    }

    protected boolean q(Throwable th, Map map) {
        boolean zR = r(th, map);
        if (zR) {
            m();
        }
        return zR;
    }

    protected boolean s(float f10) {
        boolean zT = t(f10);
        if (zT) {
            n();
        }
        return zT;
    }

    protected boolean u(Object obj, boolean z10, Map map) {
        o(map);
        boolean zV = v(obj, z10);
        if (zV) {
            m();
        }
        return zV;
    }
}
