package p088ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.Nullable;
import p195kf.M;
import p195kf.N;
import p195kf.q;

/* JADX INFO: renamed from: ef.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3296l0 extends AbstractC3298m0 implements Y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f40846f = AtomicReferenceFieldUpdater.newUpdater(AbstractC3296l0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f40847g = AtomicReferenceFieldUpdater.newUpdater(AbstractC3296l0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40848h = AtomicIntegerFieldUpdater.newUpdater(AbstractC3296l0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: ef.l0$a */
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC3299n f40849c;

        public a(long j10, InterfaceC3299n interfaceC3299n) {
            super(j10);
            this.f40849c = interfaceC3299n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40849c.A(AbstractC3296l0.this, Unit.f48228a);
        }

        @Override // p088ef.AbstractC3296l0.c
        public String toString() {
            return super.toString() + this.f40849c;
        }
    }

    /* JADX INFO: renamed from: ef.l0$b */
    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f40851c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f40851c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40851c.run();
        }

        @Override // p088ef.AbstractC3296l0.c
        public String toString() {
            return super.toString() + this.f40851c;
        }
    }

    /* JADX INFO: renamed from: ef.l0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC3286g0, N {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f40852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40853b = -1;

        public c(long j10) {
            this.f40852a = j10;
        }

        @Override // p088ef.InterfaceC3286g0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC3302o0.f40857a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC3302o0.f40857a;
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p195kf.N
        public M g() {
            Object obj = this._heap;
            if (obj instanceof M) {
                return (M) obj;
            }
            return null;
        }

        @Override // p195kf.N
        public int getIndex() {
            return this.f40853b;
        }

        @Override // p195kf.N
        public void h(M m10) {
            if (this._heap == AbstractC3302o0.f40857a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f40852a - cVar.f40852a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int o(long j10, d dVar, AbstractC3296l0 abstractC3296l0) {
            synchronized (this) {
                if (this._heap == AbstractC3302o0.f40857a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC3296l0.p()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f40854c = j10;
                        } else {
                            long j11 = cVar.f40852a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f40854c > 0) {
                                dVar.f40854c = j10;
                            }
                        }
                        long j12 = this.f40852a;
                        long j13 = dVar.f40854c;
                        if (j12 - j13 < 0) {
                            this.f40852a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean p(long j10) {
            return j10 - this.f40852a >= 0;
        }

        @Override // p195kf.N
        public void setIndex(int i10) {
            this.f40853b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f40852a + ']';
        }
    }

    /* JADX INFO: renamed from: ef.l0$d */
    public static final class d extends M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40854c;

        public d(long j10) {
            this.f40854c = j10;
        }
    }

    private final void C1(boolean z10) {
        f40848h.set(this, z10 ? 1 : 0);
    }

    private final boolean D1(c cVar) {
        d dVar = (d) f40847g.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    private final void b1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40846f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f40846f, this, null, AbstractC3302o0.f40858b)) {
                    return;
                }
            } else if (obj instanceof q) {
                ((q) obj).d();
                return;
            } else {
                if (obj == AbstractC3302o0.f40858b) {
                    return;
                }
                q qVar = new q(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f40846f, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable c1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40846f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof q) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                q qVar = (q) obj;
                Object objM = qVar.m();
                if (objM != q.f48167h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f40846f, this, obj, qVar.l());
            } else {
                if (obj == AbstractC3302o0.f40858b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f40846f, this, obj, null)) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void g1() {
        N nI;
        d dVar = (d) f40847g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC3277c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    N nB = dVar.b();
                    nI = null;
                    if (nB != null) {
                        c cVar = (c) nB;
                        nI = cVar.p(jNanoTime) ? j1(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) nI) != null);
    }

    private final boolean j1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40846f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (p()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f40846f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof q) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                q qVar = (q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f40846f, this, obj, qVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC3302o0.f40858b) {
                    return false;
                }
                q qVar2 = new q(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f40846f, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        return f40848h.get(this) != 0;
    }

    private final void r1() {
        c cVar;
        AbstractC3277c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f40847g.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                V0(jNanoTime, cVar);
            }
        }
    }

    private final int v1(long j10, c cVar) {
        if (p()) {
            return 1;
        }
        d dVar = (d) f40847g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f40847g, this, null, new d(j10));
            Object obj = f40847g.get(this);
            Intrinsics.c(obj);
            dVar = (d) obj;
        }
        return cVar.o(j10, dVar, this);
    }

    @Override // p088ef.AbstractC3294k0
    public long J0() {
        if (N0()) {
            return 0L;
        }
        g1();
        Runnable runnableC1 = c1();
        if (runnableC1 == null) {
            return v0();
        }
        runnableC1.run();
        return 0L;
    }

    public void d1(Runnable runnable) {
        g1();
        if (j1(runnable)) {
            W0();
        } else {
            U.f40801i.d1(runnable);
        }
    }

    @Override // p088ef.K
    public final void e0(CoroutineContext coroutineContext, Runnable runnable) {
        d1(runnable);
    }

    protected boolean q1() {
        if (!G0()) {
            return false;
        }
        d dVar = (d) f40847g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f40846f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof q) {
            return ((q) obj).j();
        }
        return obj == AbstractC3302o0.f40858b;
    }

    protected final void s1() {
        f40846f.set(this, null);
        f40847g.set(this, null);
    }

    @Override // p088ef.AbstractC3294k0
    public void shutdown() {
        Y0.f40805a.c();
        C1(true);
        b1();
        while (J0() <= 0) {
        }
        r1();
    }

    public InterfaceC3286g0 t(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return Y.a.a(this, j10, runnable, coroutineContext);
    }

    public final void t1(long j10, c cVar) {
        int iV1 = v1(j10, cVar);
        if (iV1 == 0) {
            if (D1(cVar)) {
                W0();
            }
        } else if (iV1 == 1) {
            V0(j10, cVar);
        } else if (iV1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // p088ef.AbstractC3294k0
    protected long v0() {
        c cVar;
        if (super.v0() == 0) {
            return 0L;
        }
        Object obj = f40846f.get(this);
        if (obj != null) {
            if (!(obj instanceof q)) {
                return obj == AbstractC3302o0.f40858b ? Long.MAX_VALUE : 0L;
            }
            if (!((q) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f40847g.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f40852a;
        AbstractC3277c.a();
        return e.f(j10 - System.nanoTime(), 0L);
    }

    protected final InterfaceC3286g0 y1(long j10, Runnable runnable) {
        long jC = AbstractC3302o0.c(j10);
        if (jC >= 4611686018427387903L) {
            return O0.f40789a;
        }
        AbstractC3277c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        t1(jNanoTime, bVar);
        return bVar;
    }

    @Override // p088ef.Y
    public void z(long j10, InterfaceC3299n interfaceC3299n) {
        long jC = AbstractC3302o0.c(j10);
        if (jC < 4611686018427387903L) {
            AbstractC3277c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC3299n);
            t1(jNanoTime, aVar);
            r.a(interfaceC3299n, aVar);
        }
    }
}
