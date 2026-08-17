package U5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13140h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Class f13141i = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q4.k f13142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y4.i f13143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y4.l f13144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f13145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f13146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f13147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f13148g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(Q4.k fileCache, Y4.i pooledByteBufferFactory, Y4.l pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f13142a = fileCache;
        this.f13143b = pooledByteBufferFactory;
        this.f13144c = pooledByteStreams;
        this.f13145d = readExecutor;
        this.f13146e = writeExecutor;
        this.f13147f = imageCacheStatsTracker;
        C cD = C.d();
        Intrinsics.checkNotNullExpressionValue(cD, "getInstance(...)");
        this.f13148g = cD;
    }

    private final boolean g(P4.d dVar) {
        p025b6.k kVarC = this.f13148g.c(dVar);
        if (kVarC != null) {
            kVarC.close();
            W4.a.y(f13141i, "Found image for %s in staging area", dVar.a());
            this.f13147f.j(dVar);
            return true;
        }
        W4.a.y(f13141i, "Did not find image for %s in staging area", dVar.a());
        this.f13147f.f(dVar);
        try {
            return this.f13142a.d(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object objE = p043c6.a.e(obj, null);
        try {
            this$0.f13148g.a();
            this$0.f13142a.a();
            p043c6.a.f(objE);
            return null;
        } catch (Throwable th) {
            try {
                p043c6.a.c(obj, th);
                throw th;
            } catch (Throwable th2) {
                p043c6.a.f(objE);
                throw th2;
            }
        }
    }

    private final p417x3.f l(P4.d dVar, p025b6.k kVar) {
        W4.a.y(f13141i, "Found image for %s in staging area", dVar.a());
        this.f13147f.j(dVar);
        p417x3.f fVarH = p417x3.f.h(kVar);
        Intrinsics.checkNotNullExpressionValue(fVarH, "forResult(...)");
        return fVarH;
    }

    private final p417x3.f n(P4.d dVar, AtomicBoolean atomicBoolean) {
        try {
            return p417x3.f.b(new f(p043c6.a.d("BufferedDiskCache_getAsync"), atomicBoolean, this, dVar), this.f13145d);
        } catch (Exception e10) {
            W4.a.H(f13141i, e10, "Failed to schedule disk-cache read for %s", dVar.a());
            return p417x3.f.g(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p025b6.k o(Object obj, AtomicBoolean isCancelled, j this$0, P4.d key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objE = p043c6.a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            p025b6.k kVarC = this$0.f13148g.c(key);
            if (kVarC != null) {
                W4.a.y(f13141i, "Found image for %s in staging area", key.a());
                this$0.f13147f.j(key);
            } else {
                W4.a.y(f13141i, "Did not find image for %s in staging area", key.a());
                this$0.f13147f.f(key);
                try {
                    Y4.h hVarR = this$0.r(key);
                    if (hVarR == null) {
                        p043c6.a.f(objE);
                        return null;
                    }
                    Z4.a aVarS = Z4.a.s(hVarR);
                    Intrinsics.checkNotNullExpressionValue(aVarS, "of(...)");
                    try {
                        p025b6.k kVar = new p025b6.k(aVarS);
                        Z4.a.g(aVarS);
                        kVarC = kVar;
                    } catch (Throwable th) {
                        Z4.a.g(aVarS);
                        throw th;
                    }
                } catch (Exception unused) {
                    p043c6.a.f(objE);
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                p043c6.a.f(objE);
                return kVarC;
            }
            W4.a.x(f13141i, "Host thread was interrupted, decreasing reference count");
            kVarC.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                p043c6.a.c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                p043c6.a.f(objE);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j this$0, P4.d key, p025b6.k kVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objE = p043c6.a.e(obj, null);
        try {
            this$0.u(key, kVar);
            C c10 = this$0.f13148g;
            Intrinsics.c(kVar);
            c10.h(key, kVar);
            p025b6.k.c(kVar);
            p043c6.a.f(objE);
        } catch (Throwable th) {
            try {
                p043c6.a.c(obj, th);
                throw th;
            } catch (Throwable th2) {
                C c11 = this$0.f13148g;
                Intrinsics.c(kVar);
                c11.h(key, kVar);
                p025b6.k.c(kVar);
                p043c6.a.f(objE);
                throw th2;
            }
        }
    }

    private final Y4.h r(P4.d dVar) throws IOException {
        try {
            Class cls = f13141i;
            W4.a.y(cls, "Disk cache read for %s", dVar.a());
            O4.a aVarF = this.f13142a.f(dVar);
            if (aVarF == null) {
                W4.a.y(cls, "Disk cache miss for %s", dVar.a());
                this.f13147f.c(dVar);
                return null;
            }
            W4.a.y(cls, "Found entry in disk cache for %s", dVar.a());
            this.f13147f.m(dVar);
            InputStream inputStreamA = aVarF.a();
            try {
                Y4.h hVarB = this.f13143b.b(inputStreamA, (int) aVarF.size());
                inputStreamA.close();
                W4.a.y(cls, "Successful read from disk cache for %s", dVar.a());
                return hVarB;
            } catch (Throwable th) {
                inputStreamA.close();
                throw th;
            }
        } catch (IOException e10) {
            W4.a.H(f13141i, e10, "Exception reading from cache for %s", dVar.a());
            this.f13147f.n(dVar);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j this$0, P4.d key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objE = p043c6.a.e(obj, null);
        try {
            this$0.f13148g.g(key);
            this$0.f13142a.g(key);
            p043c6.a.f(objE);
            return null;
        } catch (Throwable th) {
            try {
                p043c6.a.c(obj, th);
                throw th;
            } catch (Throwable th2) {
                p043c6.a.f(objE);
                throw th2;
            }
        }
    }

    private final void u(P4.d dVar, p025b6.k kVar) {
        Class cls = f13141i;
        W4.a.y(cls, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f13142a.c(dVar, new i(kVar, this));
            this.f13147f.i(dVar);
            W4.a.y(cls, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e10) {
            W4.a.H(f13141i, e10, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(p025b6.k kVar, j this$0, OutputStream os) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.c(kVar);
        InputStream inputStreamK = kVar.k();
        if (inputStreamK == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f13144c.a(inputStreamK, os);
    }

    public final void f(P4.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f13142a.b(key);
    }

    public final p417x3.f h() {
        this.f13148g.a();
        try {
            return p417x3.f.b(new h(p043c6.a.d("BufferedDiskCache_clearAll"), this), this.f13146e);
        } catch (Exception e10) {
            W4.a.H(f13141i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return p417x3.f.g(e10);
        }
    }

    public final boolean j(P4.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f13148g.b(key) || this.f13142a.e(key);
    }

    public final boolean k(P4.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final p417x3.f m(P4.d key, AtomicBoolean isCancelled) {
        p417x3.f fVarN;
        p417x3.f fVarL;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        if (!p151i6.b.d()) {
            p025b6.k kVarC = this.f13148g.c(key);
            return (kVarC == null || (fVarL = l(key, kVarC)) == null) ? n(key, isCancelled) : fVarL;
        }
        p151i6.b.a("BufferedDiskCache#get");
        try {
            p025b6.k kVarC2 = this.f13148g.c(key);
            if (kVarC2 == null || (fVarN = l(key, kVarC2)) == null) {
                fVarN = n(key, isCancelled);
            }
            return fVarN;
        } finally {
            p151i6.b.b();
        }
    }

    public final void p(P4.d key, p025b6.k encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!p151i6.b.d()) {
            if (!p025b6.k.F(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f13148g.f(key, encodedImage);
            p025b6.k kVarB = p025b6.k.b(encodedImage);
            try {
                this.f13146e.execute(new e(p043c6.a.d("BufferedDiskCache_putAsync"), this, key, kVarB));
                return;
            } catch (Exception e10) {
                W4.a.H(f13141i, e10, "Failed to schedule disk-cache write for %s", key.a());
                this.f13148g.h(key, encodedImage);
                p025b6.k.c(kVarB);
                return;
            }
        }
        p151i6.b.a("BufferedDiskCache#put");
        try {
            if (!p025b6.k.F(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f13148g.f(key, encodedImage);
            p025b6.k kVarB2 = p025b6.k.b(encodedImage);
            try {
                this.f13146e.execute(new e(p043c6.a.d("BufferedDiskCache_putAsync"), this, key, kVarB2));
            } catch (Exception e11) {
                W4.a.H(f13141i, e11, "Failed to schedule disk-cache write for %s", key.a());
                this.f13148g.h(key, encodedImage);
                p025b6.k.c(kVarB2);
            }
            Unit unit = Unit.f48228a;
            p151i6.b.b();
        } catch (Throwable th) {
            p151i6.b.b();
            throw th;
        }
    }

    public final p417x3.f s(P4.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f13148g.g(key);
        try {
            return p417x3.f.b(new g(p043c6.a.d("BufferedDiskCache_remove"), this, key), this.f13146e);
        } catch (Exception e10) {
            W4.a.H(f13141i, e10, "Failed to schedule disk-cache remove for %s", key.a());
            return p417x3.f.g(e10);
        }
    }
}
