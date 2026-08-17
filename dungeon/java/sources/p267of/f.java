package p267of;

import Ed.b;
import Md.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import p088ef.C3303p;
import p088ef.InterfaceC3299n;
import p088ef.K;
import p088ef.T;
import p088ef.g1;
import p088ef.r;
import p195kf.A;

/* JADX INFO: loaded from: classes3.dex */
public class f extends j implements p267of.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f50632i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n f50633h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements InterfaceC3299n, g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3303p f50634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f50635b;

        public a(C3303p c3303p, Object obj) {
            this.f50634a = c3303p;
            this.f50635b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(f fVar, a aVar, Throwable th) {
            fVar.e(aVar.f50635b);
            return Unit.f48228a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(f fVar, a aVar, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            f.z().set(fVar, aVar.f50635b);
            fVar.e(aVar.f50635b);
            return Unit.f48228a;
        }

        @Override // p088ef.InterfaceC3299n
        public boolean C(Throwable th) {
            return this.f50634a.C(th);
        }

        @Override // p088ef.InterfaceC3299n
        public void T(Object obj) {
            this.f50634a.T(obj);
        }

        @Override // p088ef.InterfaceC3299n
        public boolean a() {
            return this.f50634a.a();
        }

        @Override // p088ef.g1
        public void b(A a10, int i10) {
            this.f50634a.b(a10, i10);
        }

        @Override // p088ef.InterfaceC3299n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void J(Unit unit, n nVar) {
            f.z().set(f.this, this.f50635b);
            this.f50634a.P(unit, new e(f.this, this));
        }

        @Override // p088ef.InterfaceC3299n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void A(K k10, Unit unit) {
            this.f50634a.A(k10, unit);
        }

        @Override // Ed.b
        public CoroutineContext getContext() {
            return this.f50634a.getContext();
        }

        @Override // p088ef.InterfaceC3299n
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object Q(Unit unit, Object obj, n nVar) {
            Object objQ = this.f50634a.Q(unit, obj, new d(f.this, this));
            if (objQ != null) {
                f.z().set(f.this, this.f50635b);
            }
            return objQ;
        }

        @Override // p088ef.InterfaceC3299n
        public boolean isCancelled() {
            return this.f50634a.isCancelled();
        }

        @Override // p088ef.InterfaceC3299n
        public boolean p() {
            return this.f50634a.p();
        }

        @Override // Ed.b
        public void resumeWith(Object obj) {
            this.f50634a.resumeWith(obj);
        }

        @Override // p088ef.InterfaceC3299n
        public void t(Function1 function1) {
            this.f50634a.t(function1);
        }

        @Override // p088ef.InterfaceC3299n
        public Object z(Throwable th) {
            return this.f50634a.z(th);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f50637a;
        this.f50633h = new b(this);
    }

    private final int A(Object obj) {
        while (d()) {
            Object obj2 = f50632i.get(this);
            if (obj2 != g.f50637a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object B(f fVar, Object obj, b bVar) {
        Object objC;
        return (!fVar.c(obj) && (objC = fVar.C(obj, bVar)) == Fd.b.e()) ? objC : Unit.f48228a;
    }

    private final Object C(Object obj, b bVar) {
        C3303p c3303pB = r.b(Fd.b.c(bVar));
        try {
            h(new a(c3303pB, obj));
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
    public static final n D(f fVar, p249nf.a aVar, Object obj, Object obj2) {
        return new c(fVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(f fVar, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        fVar.e(obj);
        return Unit.f48228a;
    }

    private final int F(Object obj) {
        while (!t()) {
            if (obj == null) {
                return 1;
            }
            int iA = A(obj);
            if (iA == 1) {
                return 2;
            }
            if (iA == 2) {
                return 1;
            }
        }
        f50632i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f50632i;
    }

    @Override // p267of.a
    public Object a(Object obj, b bVar) {
        return B(this, obj, bVar);
    }

    @Override // p267of.a
    public boolean c(Object obj) {
        int iF = F(obj);
        if (iF == 0) {
            return true;
        }
        if (iF == 1) {
            return false;
        }
        if (iF != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p267of.a
    public boolean d() {
        return m() == 0;
    }

    @Override // p267of.a
    public void e(Object obj) {
        while (d()) {
            Object obj2 = f50632i.get(this);
            if (obj2 != g.f50637a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f50632i, this, obj2, g.f50637a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + T.b(this) + "[isLocked=" + d() + ",owner=" + f50632i.get(this) + ']';
    }
}
