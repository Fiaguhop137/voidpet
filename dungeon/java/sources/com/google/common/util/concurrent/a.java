package com.google.common.util.concurrent;

import B9.n;
import B9.s;
import com.google.android.gms.internal.play_billing.AbstractC2862p0;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends G9.a implements com.google.common.util.concurrent.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f37298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.google.common.util.concurrent.f f37299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f37300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f37301g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f37302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f37303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile k f37304c;

    private static abstract class b {
        private b() {
        }

        /* synthetic */ b(C0406a c0406a) {
            this();
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, k kVar, k kVar2);

        abstract e d(a aVar, e eVar);

        abstract k e(a aVar, k kVar);

        abstract void f(k kVar, k kVar2);

        abstract void g(k kVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f37305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f37306d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f37307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f37308b;

        static {
            if (a.f37298d) {
                f37306d = null;
                f37305c = null;
            } else {
                f37306d = new c(false, null);
                f37305c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f37307a = z10;
            this.f37308b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f37309b = new d(new C0407a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f37310a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$d$a, reason: collision with other inner class name */
        class C0407a extends Throwable {
            C0407a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f37310a = (Throwable) n.j(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f37311d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f37312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f37313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f37314c;

        e() {
            this.f37312a = null;
            this.f37313b = null;
        }

        e(Runnable runnable, Executor executor) {
            this.f37312a = runnable;
            this.f37313b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f37315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f37316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f37317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f37318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f37319e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.f37315a = atomicReferenceFieldUpdater;
            this.f37316b = atomicReferenceFieldUpdater2;
            this.f37317c = atomicReferenceFieldUpdater3;
            this.f37318d = atomicReferenceFieldUpdater4;
            this.f37319e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f37318d, aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f37319e, aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, k kVar, k kVar2) {
            return androidx.concurrent.futures.b.a(this.f37317c, aVar, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            return (e) this.f37318d.getAndSet(aVar, eVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        k e(a aVar, k kVar) {
            return (k) this.f37317c.getAndSet(aVar, kVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(k kVar, k kVar2) {
            this.f37316b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(k kVar, Thread thread) {
            this.f37315a.lazySet(kVar, thread);
        }
    }

    private static final class g extends b {
        private g() {
            super(null);
        }

        /* synthetic */ g(C0406a c0406a) {
            this();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37303b != eVar) {
                        return false;
                    }
                    aVar.f37303b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37302a != obj) {
                        return false;
                    }
                    aVar.f37302a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37304c != kVar) {
                        return false;
                    }
                    aVar.f37304c = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                try {
                    eVar2 = aVar.f37303b;
                    if (eVar2 != eVar) {
                        aVar.f37303b = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        k e(a aVar, k kVar) {
            k kVar2;
            synchronized (aVar) {
                try {
                    kVar2 = aVar.f37304c;
                    if (kVar2 != kVar) {
                        aVar.f37304c = kVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(k kVar, k kVar2) {
            kVar.f37328b = kVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(k kVar, Thread thread) {
            kVar.f37327a = thread;
        }
    }

    interface h extends com.google.common.util.concurrent.g {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class i extends a implements h {
        i() {
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.g
        public final void o(Runnable runnable, Executor executor) {
            super.o(runnable, executor);
        }
    }

    private static final class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f37320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f37321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f37322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f37323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f37324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f37325f;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$j$a, reason: collision with other inner class name */
        class C0408a implements PrivilegedExceptionAction {
            C0408a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0408a());
            }
            try {
                f37322c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f37321b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f37323d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f37324e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f37325f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f37320a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private j() {
            super(null);
        }

        /* synthetic */ j(C0406a c0406a) {
            this();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return AbstractC2862p0.a(f37320a, aVar, f37321b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return AbstractC2862p0.a(f37320a, aVar, f37323d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, k kVar, k kVar2) {
            return AbstractC2862p0.a(f37320a, aVar, f37322c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = aVar.f37303b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        k e(a aVar, k kVar) {
            k kVar2;
            do {
                kVar2 = aVar.f37304c;
                if (kVar == kVar2) {
                    break;
                }
            } while (!c(aVar, kVar2, kVar));
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(k kVar, k kVar2) {
            f37320a.putObject(kVar, f37325f, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(k kVar, Thread thread) {
            f37320a.putObject(kVar, f37324e, thread);
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final k f37326c = new k(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f37327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile k f37328b;

        k() {
            a.f37300f.g(this, Thread.currentThread());
        }

        k(boolean z10) {
        }

        void a(k kVar) {
            a.f37300f.f(this, kVar);
        }

        void b() {
            Thread thread = this.f37327a;
            if (thread != null) {
                this.f37327a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z10;
        Throwable th;
        b gVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f37298d = z10;
        f37299e = new com.google.common.util.concurrent.f(a.class);
        Throwable th2 = null;
        try {
            gVar = new j(null);
            th = null;
        } catch (Error | Exception e10) {
            th = e10;
            try {
                gVar = new f(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                th2 = e11;
                gVar = new g(null);
            }
        }
        f37300f = gVar;
        if (th2 != null) {
            com.google.common.util.concurrent.f fVar = f37299e;
            Logger loggerA = fVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            fVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f37301g = new Object();
    }

    protected a() {
    }

    private void i(StringBuilder sb2) {
        try {
            Object objT = t(this);
            sb2.append("SUCCESS, result=[");
            l(sb2, objT);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void j(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        try {
            strA = s.a(v());
        } catch (Exception | StackOverflowError e10) {
            strA = "Exception thrown from implementation: " + e10.getClass();
        }
        if (strA != null) {
            sb2.append(", info=[");
            sb2.append(strA);
            sb2.append("]");
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            i(sb2);
        }
    }

    private void l(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static CancellationException m(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e n(e eVar) {
        e eVar2 = eVar;
        e eVarD = f37300f.d(this, e.f37311d);
        while (eVarD != null) {
            e eVar3 = eVarD.f37314c;
            eVarD.f37314c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    private static void q(a aVar, boolean z10) {
        aVar.w();
        if (z10) {
            aVar.u();
        }
        aVar.k();
        e eVarN = aVar.n(null);
        while (eVarN != null) {
            e eVar = eVarN.f37314c;
            Runnable runnable = eVarN.f37312a;
            Objects.requireNonNull(runnable);
            Executor executor = eVarN.f37313b;
            Objects.requireNonNull(executor);
            r(runnable, executor);
            eVarN = eVar;
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f37299e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object s(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m("Task was cancelled.", ((c) obj).f37308b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f37310a);
        }
        return obj == f37301g ? com.google.common.util.concurrent.i.a() : obj;
    }

    private static Object t(Future future) {
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

    private void w() {
        for (k kVarE = f37300f.e(this, k.f37326c); kVarE != null; kVarE = kVarE.f37328b) {
            kVarE.b();
        }
    }

    private void x(k kVar) {
        kVar.f37327a = null;
        while (true) {
            k kVar2 = this.f37304c;
            if (kVar2 == k.f37326c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f37328b;
                if (kVar2.f37327a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f37328b = kVar4;
                    if (kVar3.f37327a == null) {
                    }
                } else if (!f37300f.c(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    @Override // G9.a
    protected final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f37302a;
        if (obj instanceof d) {
            return ((d) obj).f37310a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f37302a;
        if (obj == null) {
            if (f37298d) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z10 ? c.f37305c : c.f37306d;
                Objects.requireNonNull(cVar);
            }
            if (f37300f.b(this, obj, cVar)) {
                q(this, z10);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f37302a;
        if (obj2 != null) {
            return s(obj2);
        }
        k kVar = this.f37304c;
        if (kVar != k.f37326c) {
            k kVar2 = new k();
            do {
                kVar2.a(kVar);
                if (f37300f.c(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            x(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f37302a;
                    } while (!(obj != null));
                    return s(obj);
                }
                kVar = this.f37304c;
            } while (kVar != k.f37326c);
        }
        Object obj3 = this.f37302a;
        Objects.requireNonNull(obj3);
        return s(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f37302a;
        if (obj != null) {
            return s(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.f37304c;
            if (kVar != k.f37326c) {
                k kVar2 = new k();
                while (true) {
                    kVar2.a(kVar);
                    if (f37300f.c(this, kVar, kVar2)) {
                        do {
                            com.google.common.util.concurrent.j.a(this, nanos);
                            if (Thread.interrupted()) {
                                x(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f37302a;
                            if (obj2 != null) {
                                return s(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        x(kVar2);
                        break;
                    }
                    kVar = this.f37304c;
                    if (kVar == k.f37326c) {
                    }
                }
            }
            Object obj3 = this.f37302a;
            Objects.requireNonNull(obj3);
            return s(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f37302a;
            if (obj4 != null) {
                return s(obj4);
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
    public boolean isCancelled() {
        return this.f37302a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f37302a != null;
    }

    protected void k() {
    }

    @Override // com.google.common.util.concurrent.g
    public void o(Runnable runnable, Executor executor) {
        e eVar;
        n.k(runnable, "Runnable was null.");
        n.k(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f37303b) != e.f37311d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f37314c = eVar;
                if (f37300f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f37303b;
                }
            } while (eVar != e.f37311d);
        }
        r(runnable, executor);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            i(sb2);
        } else {
            j(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void u() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String v() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean y(Object obj) {
        if (obj == null) {
            obj = f37301g;
        }
        if (!f37300f.b(this, null, obj)) {
            return false;
        }
        q(this, false);
        return true;
    }

    protected boolean z(Throwable th) {
        if (!f37300f.b(this, null, new d((Throwable) n.j(th)))) {
            return false;
        }
        q(this, false);
        return true;
    }
}
