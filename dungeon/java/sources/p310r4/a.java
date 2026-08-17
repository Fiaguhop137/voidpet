package p310r4;

import L4.k;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f52162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f52163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f52164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f52165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f52166f;

    /* JADX INFO: renamed from: r4.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0628a implements ThreadFactory {

        /* JADX INFO: renamed from: r4.a$a$a, reason: collision with other inner class name */
        class RunnableC0629a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f52167a;

            RunnableC0629a(Runnable runnable) {
                this.f52167a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f52167a.run();
            }
        }

        ThreadFactoryC0628a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0629a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f52170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f52171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f52172c;

        c(f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f52170a = (f) k.d(fVar);
            this.f52172c = (pVar.e() && z10) ? (v) k.d(pVar.d()) : null;
            this.f52171b = pVar.e();
        }

        void a() {
            this.f52172c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0628a()));
    }

    a(boolean z10, Executor executor) {
        this.f52163c = new HashMap();
        this.f52164d = new ReferenceQueue();
        this.f52161a = z10;
        this.f52162b = executor;
        executor.execute(new b());
    }

    synchronized void a(f fVar, p pVar) {
        c cVar = (c) this.f52163c.put(fVar, new c(fVar, pVar, this.f52164d, this.f52161a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f52166f) {
            try {
                c((c) this.f52164d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f52163c.remove(cVar.f52170a);
            if (cVar.f52171b && (vVar = cVar.f52172c) != null) {
                this.f52165e.c(cVar.f52170a, new p(vVar, true, false, cVar.f52170a, this.f52165e));
            }
        }
    }

    synchronized void d(f fVar) {
        c cVar = (c) this.f52163c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized p e(f fVar) {
        c cVar = (c) this.f52163c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f52165e = aVar;
            }
        }
    }
}
