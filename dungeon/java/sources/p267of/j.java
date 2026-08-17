package p267of;

import Md.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import p088ef.C3303p;
import p088ef.InterfaceC3299n;
import p088ef.g1;
import p088ef.r;
import p124gf.l;
import p195kf.A;
import p195kf.AbstractC3923a;
import p195kf.B;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f50640c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f50641d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f50642e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f50643f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f50644g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f50646b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50647a = new a();

        a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m(((Number) obj).longValue(), (m) obj2);
        }

        public final m m(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    /* synthetic */ class b extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f50648a = new b();

        b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m(((Number) obj).longValue(), (m) obj2);
        }

        public final m m(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    public j(int i10, int i11) {
        this.f50645a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.f50646b = new i(this);
    }

    private final Object i(Ed.b bVar) {
        C3303p c3303pB = r.b(Fd.b.c(bVar));
        try {
            if (!j(c3303pB)) {
                h(c3303pB);
            }
            Object objV = c3303pB.v();
            if (objV == Fd.b.e()) {
                h.c(bVar);
            }
            return objV == Fd.b.e() ? objV : Unit.f48228a;
        } catch (Throwable th) {
            c3303pB.N();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(g1 g1Var) {
        Object objC;
        m mVar = (m) f50642e.get(this);
        long andIncrement = f50643f.getAndIncrement(this);
        a aVar = a.f50647a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50642e;
        long j10 = andIncrement / ((long) l.f50654f);
        loop0: while (true) {
            objC = AbstractC3923a.c(mVar, j10, aVar);
            if (!B.c(objC)) {
                A aB = B.b(objC);
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
                    if (a10.f48121c >= aB.f48121c) {
                        break loop0;
                    }
                    if (!aB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a10, aB)) {
                        if (!a10.p()) {
                            break loop0;
                        }
                        a10.n();
                        break loop0;
                    }
                    if (aB.p()) {
                        aB.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) B.b(objC);
        int i10 = (int) (andIncrement % ((long) l.f50654f));
        if (l.a(mVar2.v(), i10, null, g1Var)) {
            g1Var.b(mVar2, i10);
            return true;
        }
        if (!l.a(mVar2.v(), i10, l.f50650b, l.f50651c)) {
            return false;
        }
        if (g1Var instanceof InterfaceC3299n) {
            Intrinsics.d(g1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC3299n) g1Var).J(Unit.f48228a, this.f50646b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + g1Var).toString());
    }

    private final void k() {
        int i10;
        do {
            i10 = f50644g.get(this);
            if (i10 <= this.f50645a) {
                return;
            }
        } while (!f50644g.compareAndSet(this, i10, this.f50645a));
    }

    private final int l() {
        int andDecrement;
        do {
            andDecrement = f50644g.getAndDecrement(this);
        } while (andDecrement > this.f50645a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(j jVar, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        jVar.release();
        return Unit.f48228a;
    }

    private final boolean u(Object obj) {
        if (!(obj instanceof InterfaceC3299n)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC3299n interfaceC3299n = (InterfaceC3299n) obj;
        Object objQ = interfaceC3299n.Q(Unit.f48228a, null, this.f50646b);
        if (objQ == null) {
            return false;
        }
        interfaceC3299n.T(objQ);
        return true;
    }

    private final boolean v() {
        Object objC;
        m mVar = (m) f50640c.get(this);
        long andIncrement = f50641d.getAndIncrement(this);
        long j10 = andIncrement / ((long) l.f50654f);
        b bVar = b.f50648a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50640c;
        loop0: while (true) {
            objC = AbstractC3923a.c(mVar, j10, bVar);
            if (B.c(objC)) {
                break;
            }
            A aB = B.b(objC);
            while (true) {
                A a10 = (A) atomicReferenceFieldUpdater.get(this);
                if (a10.f48121c >= aB.f48121c) {
                    break loop0;
                }
                if (!aB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a10, aB)) {
                    if (!a10.p()) {
                        break loop0;
                    }
                    a10.n();
                    break loop0;
                }
                if (aB.p()) {
                    aB.n();
                }
            }
        }
        m mVar2 = (m) B.b(objC);
        mVar2.c();
        if (mVar2.f48121c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) l.f50654f));
        Object andSet = mVar2.v().getAndSet(i10, l.f50650b);
        if (andSet != null) {
            if (andSet == l.f50653e) {
                return false;
            }
            return u(andSet);
        }
        int i11 = l.f50649a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (mVar2.v().get(i10) == l.f50651c) {
                return true;
            }
        }
        return !l.a(mVar2.v(), i10, l.f50650b, l.f50652d);
    }

    public final Object b(Ed.b bVar) {
        Object objI;
        return (l() <= 0 && (objI = i(bVar)) == Fd.b.e()) ? objI : Unit.f48228a;
    }

    protected final void h(InterfaceC3299n interfaceC3299n) {
        while (l() <= 0) {
            Intrinsics.d(interfaceC3299n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((g1) interfaceC3299n)) {
                return;
            }
        }
        interfaceC3299n.J(Unit.f48228a, this.f50646b);
    }

    public final int m() {
        return Math.max(f50644g.get(this), 0);
    }

    public final void release() {
        do {
            int andIncrement = f50644g.getAndIncrement(this);
            if (andIncrement >= this.f50645a) {
                k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f50645a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final boolean t() {
        while (true) {
            int i10 = f50644g.get(this);
            if (i10 > this.f50645a) {
                k();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f50644g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
