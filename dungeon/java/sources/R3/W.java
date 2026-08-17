package R3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f10723e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f10724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f10725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile U f10727d;

    private static class a extends FutureTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private W f10728a;

        a(W w10, Callable callable) {
            super(callable);
            this.f10728a = w10;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f10728a.l((U) get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f10728a.l(new U(e10));
                }
            } finally {
                this.f10728a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f10723e = new androidx.privacysandbox.ads.adservices.measurement.k();
        } else {
            f10723e = Executors.newCachedThreadPool(new p077e4.h());
        }
    }

    public W(Object obj) {
        this.f10724a = new LinkedHashSet(1);
        this.f10725b = new LinkedHashSet(1);
        this.f10726c = new Handler(Looper.getMainLooper());
        this.f10727d = null;
        l(new U(obj));
    }

    public W(Callable callable) {
        this(callable, false);
    }

    W(Callable callable, boolean z10) {
        this.f10724a = new LinkedHashSet(1);
        this.f10725b = new LinkedHashSet(1);
        this.f10726c = new Handler(Looper.getMainLooper());
        this.f10727d = null;
        if (!z10) {
            f10723e.execute(new a(this, callable));
            return;
        }
        try {
            l((U) callable.call());
        } catch (Throwable th) {
            l(new U(th));
        }
    }

    private synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f10725b);
        if (arrayList.isEmpty()) {
            p077e4.g.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((P) it.next()).onResult(th);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f10726c.post(new V(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        U u10 = this.f10727d;
        if (u10 == null) {
            return;
        }
        if (u10.b() != null) {
            i(u10.b());
        } else {
            f(u10.a());
        }
    }

    private synchronized void i(Object obj) {
        Iterator it = new ArrayList(this.f10724a).iterator();
        while (it.hasNext()) {
            ((P) it.next()).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(U u10) {
        if (this.f10727d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f10727d = u10;
        g();
    }

    public synchronized W c(P p10) {
        try {
            U u10 = this.f10727d;
            if (u10 != null && u10.a() != null) {
                p10.onResult(u10.a());
            }
            this.f10725b.add(p10);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized W d(P p10) {
        try {
            U u10 = this.f10727d;
            if (u10 != null && u10.b() != null) {
                p10.onResult(u10.b());
            }
            this.f10724a.add(p10);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public U e() {
        return this.f10727d;
    }

    public synchronized W j(P p10) {
        this.f10725b.remove(p10);
        return this;
    }

    public synchronized W k(P p10) {
        this.f10724a.remove(p10);
        return this;
    }
}
