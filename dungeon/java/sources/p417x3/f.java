package p417x3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f57367i = p417x3.b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f57368j = p417x3.b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f57369k = p417x3.a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static f f57370l = new f((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static f f57371m = new f(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static f f57372n = new f(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static f f57373o = new f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f57377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f57378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f57379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f57380g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f57374a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f57381h = new ArrayList();

    class a implements p417x3.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f57382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p417x3.d f57383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f57384c;

        a(g gVar, p417x3.d dVar, Executor executor, p417x3.c cVar) {
            this.f57382a = gVar;
            this.f57383b = dVar;
            this.f57384c = executor;
        }

        @Override // p417x3.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f fVar) {
            f.d(this.f57382a, this.f57383b, fVar, this.f57384c, null);
            return null;
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f57386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p417x3.d f57387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f57388c;

        b(p417x3.c cVar, g gVar, p417x3.d dVar, f fVar) {
            this.f57386a = gVar;
            this.f57387b = dVar;
            this.f57388c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f57386a.d(this.f57387b.a(this.f57388c));
            } catch (CancellationException unused) {
                this.f57386a.b();
            } catch (Exception e10) {
                this.f57386a.c(e10);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f57389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f57390b;

        c(p417x3.c cVar, g gVar, Callable callable) {
            this.f57389a = gVar;
            this.f57390b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f57389a.d(this.f57390b.call());
            } catch (CancellationException unused) {
                this.f57389a.b();
            } catch (Exception e10) {
                this.f57389a.c(e10);
            }
        }
    }

    public interface d {
    }

    f() {
    }

    private f(Object obj) {
        r(obj);
    }

    private f(boolean z10) {
        if (z10) {
            p();
        } else {
            r(null);
        }
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static f c(Callable callable, Executor executor, p417x3.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(g gVar, p417x3.d dVar, f fVar, Executor executor, p417x3.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f57370l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f57371m : f57372n;
        }
        g gVar = new g();
        gVar.d(obj);
        return gVar.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f57374a) {
            Iterator it = this.f57381h.iterator();
            while (it.hasNext()) {
                try {
                    ((p417x3.d) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f57381h = null;
        }
    }

    public f e(p417x3.d dVar) {
        return f(dVar, f57368j, null);
    }

    public f f(p417x3.d dVar, Executor executor, p417x3.c cVar) throws Throwable {
        p417x3.d dVar2;
        Executor executor2;
        p417x3.c cVar2;
        g gVar = new g();
        synchronized (this.f57374a) {
            try {
                try {
                    boolean zM = m();
                    if (zM) {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                    } else {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                        this.f57381h.add(new a(gVar, dVar2, executor2, cVar2));
                    }
                    if (zM) {
                        d(gVar, dVar2, this, executor2, cVar2);
                    }
                    return gVar.a();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f57374a) {
            try {
                if (this.f57378e != null) {
                    this.f57379f = true;
                }
                exc = this.f57378e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f57374a) {
            obj = this.f57377d;
        }
        return obj;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f57374a) {
            z10 = this.f57376c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f57374a) {
            z10 = this.f57375b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f57374a) {
            z10 = i() != null;
        }
        return z10;
    }

    boolean p() {
        synchronized (this.f57374a) {
            try {
                if (this.f57375b) {
                    return false;
                }
                this.f57375b = true;
                this.f57376c = true;
                this.f57374a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f57374a) {
            try {
                if (this.f57375b) {
                    return false;
                }
                this.f57375b = true;
                this.f57378e = exc;
                this.f57379f = false;
                this.f57374a.notifyAll();
                o();
                if (!this.f57379f) {
                    k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean r(Object obj) {
        synchronized (this.f57374a) {
            try {
                if (this.f57375b) {
                    return false;
                }
                this.f57375b = true;
                this.f57377d = obj;
                this.f57374a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
