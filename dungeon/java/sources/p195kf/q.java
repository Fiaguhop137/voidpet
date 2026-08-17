package p195kf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48164e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48165f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f48166g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f48167h = new D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f48171d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48172a;

        public b(int i10) {
            this.f48172a = i10;
        }
    }

    public q(int i10, boolean z10) {
        this.f48168a = i10;
        this.f48169b = z10;
        int i11 = i10 - 1;
        this.f48170c = i11;
        this.f48171d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final q b(long j10) {
        q qVar = new q(this.f48168a * 2, this.f48169b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f48170c;
            if ((i10 & i12) == (i12 & i11)) {
                f48166g.set(qVar, f48164e.d(j10, 1152921504606846976L));
                return qVar;
            }
            Object bVar = f().get(this.f48170c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            qVar.f().set(qVar.f48170c & i10, bVar);
            i10++;
        }
    }

    private final q c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48165f;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            androidx.concurrent.futures.b.a(f48165f, this, null, b(j10));
        }
    }

    private final q e(int i10, Object obj) {
        Object obj2 = f().get(this.f48170c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f48172a != i10) {
            return null;
        }
        f().set(i10 & this.f48170c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f48171d;
    }

    private final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f48166g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = 1152921504606846976L | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final q n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f48166g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f48166g.compareAndSet(this, j10, f48164e.b(j10, i11)));
        f().set(this.f48170c & i12, null);
        return null;
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f48166g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f48164e.a(j10);
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f48170c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f48169b && f().get(i11 & i12) != null) {
                int i13 = this.f48168a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f48166g.compareAndSet(this, j10, f48164e.c(j10, (i11 + 1) & 1073741823))) {
                f().set(i11 & i12, obj);
                q qVarE = this;
                while ((f48166g.get(qVarE) & 1152921504606846976L) != 0 && (qVarE = qVarE.l().e(i11, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f48166g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final int g() {
        long j10 = f48166g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f48166g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final q l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f48166g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f48167h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f48170c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = f().get(this.f48170c & i10);
            if (obj == null) {
                if (this.f48169b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f48166g.compareAndSet(this, j10, f48164e.b(j10, i12))) {
                    f().set(this.f48170c & i10, null);
                    return obj;
                }
                if (this.f48169b) {
                    q qVarN = this;
                    do {
                        qVarN = qVarN.n(i10, i12);
                    } while (qVarN != null);
                    return obj;
                }
            }
        }
    }
}
