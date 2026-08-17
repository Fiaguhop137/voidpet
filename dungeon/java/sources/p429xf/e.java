package p429xf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f57678h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f57679i = new e(new c(p375uf.e.N(p375uf.e.f55645i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f57680j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f57681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f57684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f57685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f57686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f57687g;

    public interface a {
        void a(e eVar, long j10);

        long b();

        void c(e eVar);

        void execute(Runnable runnable);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return e.f57680j;
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f57688a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f57688a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // xf.e.a
        public void a(e taskRunner, long j10) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // xf.e.a
        public long b() {
            return System.nanoTime();
        }

        @Override // xf.e.a
        public void c(e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // xf.e.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f57688a.execute(runnable);
        }
    }

    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p429xf.a aVarD;
            long jB;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                p429xf.d dVarD = aVarD.d();
                Intrinsics.c(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f57678h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jB = dVarD.h().g().b();
                    p429xf.b.c(aVarD, dVarD, "starting");
                } else {
                    jB = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        Unit unit = Unit.f48228a;
                        if (zIsLoggable) {
                            p429xf.b.c(aVarD, dVarD, "finished run in " + p429xf.b.b(dVarD.h().g().b() - jB));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            p429xf.b.c(aVarD, dVarD, "failed a run in " + p429xf.b.b(dVarD.h().g().b() - jB));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f57680j = logger;
    }

    public e(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f57681a = backend;
        this.f57682b = 10000;
        this.f57685e = new ArrayList();
        this.f57686f = new ArrayList();
        this.f57687g = new d();
    }

    private final void c(p429xf.a aVar, long j10) {
        if (p375uf.e.f55644h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        p429xf.d dVarD = aVar.d();
        Intrinsics.c(dVarD);
        if (dVarD.c() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f57685e.remove(dVarD);
        if (j10 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j10, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f57686f.add(dVarD);
    }

    private final void e(p429xf.a aVar) {
        if (p375uf.e.f55644h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        p429xf.d dVarD = aVar.d();
        Intrinsics.c(dVarD);
        dVarD.e().remove(aVar);
        this.f57686f.remove(dVarD);
        dVarD.l(aVar);
        this.f57685e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(p429xf.a aVar) {
        if (p375uf.e.f55644h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                Unit unit = Unit.f48228a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                Unit unit2 = Unit.f48228a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final p429xf.a d() {
        boolean z10;
        if (p375uf.e.f55644h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f57686f.isEmpty()) {
            long jB = this.f57681a.b();
            Iterator it = this.f57686f.iterator();
            long jMin = Long.MAX_VALUE;
            p429xf.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                p429xf.a aVar2 = (p429xf.a) ((p429xf.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f57683c && !this.f57686f.isEmpty())) {
                    this.f57681a.execute(this.f57687g);
                }
                return aVar;
            }
            if (this.f57683c) {
                if (jMin < this.f57684d - jB) {
                    this.f57681a.c(this);
                }
                return null;
            }
            this.f57683c = true;
            this.f57684d = jB + jMin;
            try {
                try {
                    this.f57681a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.f57683c = false;
            } catch (Throwable th) {
                this.f57683c = false;
                throw th;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f57685e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((p429xf.d) this.f57685e.get(size)).b();
            }
        }
        for (int size2 = this.f57686f.size() - 1; -1 < size2; size2--) {
            p429xf.d dVar = (p429xf.d) this.f57686f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f57686f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f57681a;
    }

    public final void h(p429xf.d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (p375uf.e.f55644h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f57686f.remove(taskQueue);
            } else {
                p375uf.e.c(this.f57686f, taskQueue);
            }
        }
        if (this.f57683c) {
            this.f57681a.c(this);
        } else {
            this.f57681a.execute(this.f57687g);
        }
    }

    public final p429xf.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f57682b;
            this.f57682b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new p429xf.d(this, sb2.toString());
    }
}
