package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements com.google.common.util.concurrent.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f22413d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f22414e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f22415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f22416g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f22417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f22418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile h f22419c;

    private static abstract class b {
        private b() {
        }

        /* synthetic */ b(C0273a c0273a) {
            this();
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f22420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f22421d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f22422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f22423b;

        static {
            if (a.f22413d) {
                f22421d = null;
                f22420c = null;
            } else {
                f22421d = new c(false, null);
                f22420c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f22422a = z10;
            this.f22423b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f22424b = new d(new C0274a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f22425a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0274a extends Throwable {
            C0274a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f22425a = (Throwable) a.i(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f22426d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f22427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f22428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f22429c;

        e(Runnable runnable, Executor executor) {
            this.f22427a = runnable;
            this.f22428b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f22430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f22431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f22432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f22433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f22434e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.f22430a = atomicReferenceFieldUpdater;
            this.f22431b = atomicReferenceFieldUpdater2;
            this.f22432c = atomicReferenceFieldUpdater3;
            this.f22433d = atomicReferenceFieldUpdater4;
            this.f22434e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f22433d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f22434e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f22432c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f22431b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f22430a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super(null);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f22418b != eVar) {
                        return false;
                    }
                    aVar.f22418b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f22417a != obj) {
                        return false;
                    }
                    aVar.f22417a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f22419c != hVar) {
                        return false;
                    }
                    aVar.f22419c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f22437b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f22436a = thread;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f22435c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f22436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f22437b;

        h() {
            a.f22415f.e(this, Thread.currentThread());
        }

        h(boolean z10) {
        }

        void a(h hVar) {
            a.f22415f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f22436a;
            if (thread != null) {
                this.f22436a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f22415f = gVar;
        if (th != null) {
            f22414e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f22416g = new Object();
    }

    protected a() {
    }

    private String C(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void e(StringBuilder sb2) {
        try {
            Object objV = v(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(C(objV));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object i(Object obj) {
        obj.getClass();
        return obj;
    }

    private e r(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f22418b;
        } while (!f22415f.a(this, eVar2, e.f22426d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f22429c;
            eVar4.f22429c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void s(a aVar) {
        aVar.y();
        aVar.g();
        e eVarR = aVar.r(null);
        while (eVarR != null) {
            e eVar = eVarR.f22429c;
            t(eVarR.f22427a, eVarR.f22428b);
            eVarR = eVar;
        }
    }

    private static void t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f22414e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object u(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw h("Task was cancelled.", ((c) obj).f22423b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f22425a);
        }
        if (obj == f22416g) {
            return null;
        }
        return obj;
    }

    static Object v(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void y() {
        h hVar;
        do {
            hVar = this.f22419c;
        } while (!f22415f.c(this, hVar, h.f22435c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f22437b;
        }
    }

    private void z(h hVar) {
        hVar.f22436a = null;
        while (true) {
            h hVar2 = this.f22419c;
            if (hVar2 == h.f22435c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f22437b;
                if (hVar2.f22436a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f22437b = hVar4;
                    if (hVar3.f22436a == null) {
                    }
                } else if (!f22415f.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    protected boolean A(Object obj) {
        if (obj == null) {
            obj = f22416g;
        }
        if (!f22415f.b(this, null, obj)) {
            return false;
        }
        s(this);
        return true;
    }

    protected boolean B(Throwable th) {
        if (!f22415f.b(this, null, new d((Throwable) i(th)))) {
            return false;
        }
        s(this);
        return true;
    }

    protected final boolean D() {
        Object obj = this.f22417a;
        return (obj instanceof c) && ((c) obj).f22422a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f22417a;
        if (obj == null) {
            if (f22413d) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z10 ? c.f22420c : c.f22421d;
            }
            if (f22415f.b(this, obj, cVar)) {
                if (z10) {
                    w();
                }
                s(this);
                return true;
            }
        }
        return false;
    }

    protected void g() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f22417a;
        if (obj2 != null) {
            return u(obj2);
        }
        h hVar = this.f22419c;
        if (hVar != h.f22435c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f22415f.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            z(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f22417a;
                    } while (!(obj != null));
                    return u(obj);
                }
                hVar = this.f22419c;
            } while (hVar != h.f22435c);
        }
        return u(this.f22417a);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f22417a;
        if (obj != null) {
            return u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f22419c;
            if (hVar != h.f22435c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.a(hVar);
                    if (f22415f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                z(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f22417a;
                            if (obj2 != null) {
                                return u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        z(hVar2);
                        break;
                    }
                    hVar = this.f22419c;
                    if (hVar == h.f22435c) {
                    }
                }
            }
            return u(this.f22417a);
        }
        while (nanos > 0) {
            Object obj3 = this.f22417a;
            if (obj3 != null) {
                return u(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f22417a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f22417a != null;
    }

    @Override // com.google.common.util.concurrent.g
    public final void o(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        e eVar = this.f22418b;
        if (eVar != e.f22426d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f22429c = eVar;
                if (f22415f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f22418b;
                }
            } while (eVar != e.f22426d);
        }
        t(runnable, executor);
    }

    public String toString() {
        String strX;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            e(sb2);
        } else {
            try {
                strX = x();
            } catch (RuntimeException e10) {
                strX = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strX != null && !strX.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strX);
                sb2.append("]");
            } else if (isDone()) {
                e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void w() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String x() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }
}
