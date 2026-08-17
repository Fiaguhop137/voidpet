package p142hf;

import Ad.n;
import Ad.q;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import p088ef.C3303p;
import p088ef.InterfaceC3286g0;
import p088ef.r;
import p177jf.m;
import p195kf.D;

/* JADX INFO: loaded from: classes3.dex */
public class y extends p177jf.b implements s, InterfaceC3564c, m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f43039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f43040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p124gf.a f43041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f43042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f43043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f43044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43046l;

    private static final class a implements InterfaceC3286g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f43047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f43048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f43049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ed.b f43050d;

        public a(y yVar, long j10, Object obj, Ed.b bVar) {
            this.f43047a = yVar;
            this.f43048b = j10;
            this.f43049c = obj;
            this.f43050d = bVar;
        }

        @Override // p088ef.InterfaceC3286g0
        public void dispose() {
            this.f43047a.y(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43051a;

        static {
            int[] iArr = new int[p124gf.a.values().length];
            try {
                iArr[p124gf.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p124gf.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p124gf.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43051a = iArr;
        }
    }

    static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f43052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f43053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f43054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43056e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43058g;

        c(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43056e = obj;
            this.f43058g |= Integer.MIN_VALUE;
            return y.A(y.this, null, this);
        }
    }

    public y(int i10, int i11, p124gf.a aVar) {
        this.f43039e = i10;
        this.f43040f = i11;
        this.f43041g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((p142hf.L) r9).a(r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object A(p142hf.y r8, p142hf.InterfaceC3565d r9, Ed.b r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hf.y.A(hf.y, hf.d, Ed.b):java.lang.Object");
    }

    private final void B(long j10) {
        p177jf.d[] dVarArr;
        if (((p177jf.b) this).f47382b != 0 && (dVarArr = ((p177jf.b) this).f47381a) != null) {
            for (p177jf.d dVar : dVarArr) {
                if (dVar != null) {
                    A a10 = (A) dVar;
                    long j11 = a10.f42860a;
                    if (j11 >= 0 && j11 < j10) {
                        a10.f42860a = j10;
                    }
                }
            }
        }
        this.f43044j = j10;
    }

    private final void E() {
        Object[] objArr = this.f43042h;
        Intrinsics.c(objArr);
        z.g(objArr, K(), null);
        this.f43045k--;
        long jK = K() + 1;
        if (this.f43043i < jK) {
            this.f43043i = jK;
        }
        if (this.f43044j < jK) {
            B(jK);
        }
    }

    static /* synthetic */ Object F(y yVar, Object obj, Ed.b bVar) {
        Object objG;
        return (!yVar.b(obj) && (objG = yVar.G(obj, bVar)) == Fd.b.e()) ? objG : Unit.f48228a;
    }

    private final Object G(Object obj, Ed.b bVar) throws Throwable {
        Throwable th;
        Ed.b[] bVarArrI;
        a aVar;
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        Ed.b[] bVarArrI2 = p177jf.c.f47385a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        q.a aVar2 = q.f327b;
                        c3303p.resumeWith(q.b(Unit.f48228a));
                        bVarArrI = I(bVarArrI2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + ((long) P()), obj, c3303p);
                        H(aVar);
                        this.f43046l++;
                        if (this.f43040f == 0) {
                            bVarArrI2 = I(bVarArrI2);
                        }
                        bVarArrI = bVarArrI2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    r.a(c3303p, aVar);
                }
                for (Ed.b bVar2 : bVarArrI) {
                    if (bVar2 != null) {
                        q.a aVar3 = q.f327b;
                        bVar2.resumeWith(q.b(Unit.f48228a));
                    }
                }
                Object objV = c3303p.v();
                if (objV == Fd.b.e()) {
                    h.c(bVar);
                }
                return objV == Fd.b.e() ? objV : Unit.f48228a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f43042h;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        z.g(objArrQ, K() + ((long) iP), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Ed.b[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Ed.b[] I(Ed.b[] bVarArr) {
        p177jf.d[] dVarArr;
        A a10;
        Ed.b bVar;
        int length = bVarArr.length;
        if (((p177jf.b) this).f47382b != 0 && (dVarArr = ((p177jf.b) this).f47381a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                p177jf.d dVar = dVarArr[i10];
                if (dVar == null || (bVar = (a10 = (A) dVar).f42861b) == null || T(a10) < 0) {
                    bVarArr = bVarArr;
                } else {
                    if (length >= bVarArr.length) {
                        bVarArr = bVarArr;
                        bVarArr = bVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) bVarArr, Math.max(2, bVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        bVarArr = objArrCopyOf;
                    }
                    bVarArr = bVarArr;
                    bVarArr = bVarArr;
                    ((Ed.b[]) bVarArr)[length] = bVar;
                    a10.f42861b = null;
                    length++;
                }
                i10++;
                bVarArr = bVarArr;
            }
            bVarArr = bVarArr;
        }
        return (Ed.b[]) bVarArr;
    }

    private final long J() {
        return K() + ((long) this.f43045k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f43044j, this.f43043i);
    }

    private final Object M(long j10) {
        Object[] objArr = this.f43042h;
        Intrinsics.c(objArr);
        Object objF = z.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f43049c : objF;
    }

    private final long N() {
        return K() + ((long) this.f43045k) + ((long) this.f43046l);
    }

    private final int O() {
        return (int) ((K() + ((long) this.f43045k)) - this.f43043i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f43045k + this.f43046l;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f43042h = objArr2;
        if (objArr != null) {
            long jK = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jK;
                z.g(objArr2, j10, z.f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f43045k >= this.f43040f && this.f43044j <= this.f43043i) {
            int i10 = b.f43051a[this.f43041g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new n();
            }
        }
        H(obj);
        int i11 = this.f43045k + 1;
        this.f43045k = i11;
        if (i11 > this.f43040f) {
            E();
        }
        if (O() > this.f43039e) {
            V(this.f43043i + 1, this.f43044j, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f43039e == 0) {
            return true;
        }
        H(obj);
        int i10 = this.f43045k + 1;
        this.f43045k = i10;
        if (i10 > this.f43039e) {
            E();
        }
        this.f43044j = K() + ((long) this.f43045k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(A a10) {
        long j10 = a10.f42860a;
        if (j10 >= J() && (this.f43040f > 0 || j10 > K() || this.f43046l == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object U(A a10) {
        Object obj;
        Ed.b[] bVarArrW = p177jf.c.f47385a;
        synchronized (this) {
            try {
                long jT = T(a10);
                if (jT < 0) {
                    obj = z.f43059a;
                } else {
                    long j10 = a10.f42860a;
                    Object objM = M(jT);
                    a10.f42860a = jT + 1;
                    bVarArrW = W(j10);
                    obj = objM;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Ed.b bVar : bVarArrW) {
            if (bVar != null) {
                q.a aVar = q.f327b;
                bVar.resumeWith(q.b(Unit.f48228a));
            }
        }
        return obj;
    }

    private final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f43042h;
            Intrinsics.c(objArr);
            z.g(objArr, jK, null);
        }
        this.f43043i = j10;
        this.f43044j = j11;
        this.f43045k = (int) (j12 - jMin);
        this.f43046l = (int) (j13 - j12);
    }

    private final Object x(A a10, Ed.b bVar) {
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        synchronized (this) {
            try {
                if (T(a10) < 0) {
                    a10.f42861b = c3303p;
                } else {
                    q.a aVar = q.f327b;
                    c3303p.resumeWith(q.b(Unit.f48228a));
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            h.c(bVar);
        }
        return objV == Fd.b.e() ? objV : Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f43048b < K()) {
                return;
            }
            Object[] objArr = this.f43042h;
            Intrinsics.c(objArr);
            if (z.f(objArr, aVar.f43048b) != aVar) {
                return;
            }
            z.g(objArr, aVar.f43048b, z.f43059a);
            z();
            Unit unit = Unit.f48228a;
        }
    }

    private final void z() {
        if (this.f43040f != 0 || this.f43046l > 1) {
            Object[] objArr = this.f43042h;
            Intrinsics.c(objArr);
            while (this.f43046l > 0 && z.f(objArr, (K() + ((long) P())) - 1) == z.f43059a) {
                this.f43046l--;
                z.g(objArr, K() + ((long) P()), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p177jf.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public A i() {
        return new A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p177jf.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public A[] j(int i10) {
        return new A[i10];
    }

    protected final Object L() {
        Object[] objArr = this.f43042h;
        Intrinsics.c(objArr);
        return z.f(objArr, (this.f43043i + ((long) O())) - 1);
    }

    public final Ed.b[] W(long j10) {
        long j11;
        long j12;
        long j13;
        p177jf.d[] dVarArr;
        if (j10 > this.f43044j) {
            return p177jf.c.f47385a;
        }
        long jK = K();
        long j14 = ((long) this.f43045k) + jK;
        if (this.f43040f == 0 && this.f43046l > 0) {
            j14++;
        }
        if (((p177jf.b) this).f47382b != 0 && (dVarArr = ((p177jf.b) this).f47381a) != null) {
            for (p177jf.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((A) dVar).f42860a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f43044j) {
            return p177jf.c.f47385a;
        }
        long J10 = J();
        int iMin = l() > 0 ? Math.min(this.f43046l, this.f43040f - ((int) (J10 - j14))) : this.f43046l;
        Ed.b[] bVarArr = p177jf.c.f47385a;
        long j16 = ((long) this.f43046l) + J10;
        if (iMin > 0) {
            bVarArr = new Ed.b[iMin];
            Object[] objArr = this.f43042h;
            Intrinsics.c(objArr);
            j13 = 1;
            long j17 = J10;
            int i10 = 0;
            while (true) {
                if (J10 >= j16) {
                    j11 = jK;
                    j12 = j14;
                    J10 = j17;
                    break;
                }
                Object objF = z.f(objArr, J10);
                j11 = jK;
                D d10 = z.f43059a;
                if (objF != d10) {
                    Intrinsics.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    bVarArr[i10] = aVar.f43050d;
                    z.g(objArr, J10, d10);
                    z.g(objArr, j17, aVar.f43049c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        J10 = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                J10++;
                jK = j11;
                j14 = j12;
            }
        } else {
            j11 = jK;
            j12 = j14;
            j13 = 1;
        }
        Ed.b[] bVarArr2 = bVarArr;
        int i12 = (int) (J10 - j11);
        long j19 = l() == 0 ? J10 : j12;
        long jMax = Math.max(this.f43043i, J10 - ((long) Math.min(this.f43039e, i12)));
        if (this.f43040f == 0 && jMax < j16) {
            Object[] objArr2 = this.f43042h;
            Intrinsics.c(objArr2);
            if (Intrinsics.b(z.f(objArr2, jMax), z.f43059a)) {
                J10 += j13;
                jMax += j13;
            }
        }
        V(jMax, j19, J10, j16);
        z();
        return !(bVarArr2.length == 0) ? I(bVarArr2) : bVarArr2;
    }

    public final long X() {
        long j10 = this.f43043i;
        if (j10 < this.f43044j) {
            this.f43044j = j10;
        }
        return j10;
    }

    @Override // p177jf.m
    public InterfaceC3564c a(CoroutineContext coroutineContext, int i10, p124gf.a aVar) {
        return z.e(this, coroutineContext, i10, aVar);
    }

    @Override // p142hf.s
    public boolean b(Object obj) {
        int i10;
        boolean z10;
        Ed.b[] bVarArrI = p177jf.c.f47385a;
        synchronized (this) {
            if (R(obj)) {
                bVarArrI = I(bVarArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Ed.b bVar : bVarArrI) {
            if (bVar != null) {
                q.a aVar = q.f327b;
                bVar.resumeWith(q.b(Unit.f48228a));
            }
        }
        return z10;
    }

    @Override // p142hf.x, p142hf.InterfaceC3564c
    public Object collect(InterfaceC3565d interfaceC3565d, Ed.b bVar) {
        return A(this, interfaceC3565d, bVar);
    }

    @Override // p142hf.s, p142hf.InterfaceC3565d
    public Object emit(Object obj, Ed.b bVar) {
        return F(this, obj, bVar);
    }

    @Override // p142hf.s
    public void g() throws Throwable {
        synchronized (this) {
            try {
                try {
                    V(J(), this.f43044j, J(), N());
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
