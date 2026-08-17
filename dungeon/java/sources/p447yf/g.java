package p447yf;

import Df.j;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p339sf.C4182a;
import p429xf.d;
import p429xf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f58129f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f58131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f58132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f58133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f58134e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends p429xf.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // p429xf.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f58130a = i10;
        this.f58131b = timeUnit.toNanos(j10);
        this.f58132c = taskRunner.i();
        this.f58133d = new b(p375uf.e.f55645i + " ConnectionPool");
        this.f58134e = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int d(f fVar, long j10) {
        if (p375uf.e.f55644h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference reference = (Reference) listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.d(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                j.f2485a.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i10);
                fVar.D(true);
                if (listN.isEmpty()) {
                    fVar.C(j10 - this.f58131b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    public final boolean a(C4182a address, e call, List list, boolean z10) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        for (f connection : this.f58134e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    try {
                        if (connection.v()) {
                            if (connection.t(address, list)) {
                                call.d(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (connection.t(address, list)) {
                    call.d(connection);
                    return true;
                }
                Unit unit = Unit.f48228a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f58134e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jO = j10 - connection.o();
                    if (jO > j11) {
                        fVar = connection;
                        j11 = jO;
                    }
                    Unit unit = Unit.f48228a;
                }
            }
        }
        long j12 = this.f58131b;
        if (j11 < j12 && i10 <= this.f58130a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        Intrinsics.c(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.D(true);
            this.f58134e.remove(fVar);
            p375uf.e.n(fVar.E());
            if (this.f58134e.isEmpty()) {
                this.f58132c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (p375uf.e.f55644h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.f58130a != 0) {
            d.j(this.f58132c, this.f58133d, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.f58134e.remove(connection);
        if (this.f58134e.isEmpty()) {
            this.f58132c.a();
        }
        return true;
    }

    public final void e(f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!p375uf.e.f55644h || Thread.holdsLock(connection)) {
            this.f58134e.add(connection);
            d.j(this.f58132c, this.f58133d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
