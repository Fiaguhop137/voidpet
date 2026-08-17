package p088ef;

import Ad.q;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3281e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40820b = AtomicIntegerFieldUpdater.newUpdater(C3281e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W[] f40821a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: ef.e$a */
    private final class a extends G0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f40822h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3299n f40823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC3286g0 f40824f;

        public a(InterfaceC3299n interfaceC3299n) {
            this.f40823e = interfaceC3299n;
        }

        public final void B(b bVar) {
            f40822h.set(this, bVar);
        }

        public final void C(InterfaceC3286g0 interfaceC3286g0) {
            this.f40824f = interfaceC3286g0;
        }

        @Override // p088ef.G0
        public boolean v() {
            return false;
        }

        @Override // p088ef.G0
        public void w(Throwable th) {
            if (th != null) {
                Object objZ = this.f40823e.z(th);
                if (objZ != null) {
                    this.f40823e.T(objZ);
                    b bVarY = y();
                    if (bVarY != null) {
                        bVarY.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C3281e.d().decrementAndGet(C3281e.this) == 0) {
                InterfaceC3299n interfaceC3299n = this.f40823e;
                W[] wArr = C3281e.this.f40821a;
                ArrayList arrayList = new ArrayList(wArr.length);
                for (W w10 : wArr) {
                    arrayList.add(w10.f());
                }
                interfaceC3299n.resumeWith(q.b(arrayList));
            }
        }

        public final b y() {
            return (b) f40822h.get(this);
        }

        public final InterfaceC3286g0 z() {
            InterfaceC3286g0 interfaceC3286g0 = this.f40824f;
            if (interfaceC3286g0 != null) {
                return interfaceC3286g0;
            }
            Intrinsics.r("handle");
            return null;
        }
    }

    /* JADX INFO: renamed from: ef.e$b */
    private final class b implements InterfaceC3297m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f40826a;

        public b(a[] aVarArr) {
            this.f40826a = aVarArr;
        }

        @Override // p088ef.InterfaceC3297m
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f40826a) {
                aVar.z().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f40826a + ']';
        }
    }

    public C3281e(W[] wArr) {
        this.f40821a = wArr;
        this.notCompletedCount$volatile = wArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f40820b;
    }

    public final Object c(Ed.b bVar) {
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        int length = this.f40821a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            W w10 = this.f40821a[i10];
            w10.start();
            a aVar = new a(c3303p);
            aVar.C(F0.m(w10, false, aVar, 1, null));
            Unit unit = Unit.f48228a;
            aVarArr[i10] = aVar;
        }
        b bVar2 = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].B(bVar2);
        }
        if (c3303p.p()) {
            bVar2.b();
        } else {
            r.c(c3303p, bVar2);
        }
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            h.c(bVar);
        }
        return objV;
    }
}
