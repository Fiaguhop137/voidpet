package S;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: S.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1442w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f11410b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C1437q f11413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f11414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1435o f11415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final N f11416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static List f11417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static List f11418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C1422b f11419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AbstractC1432l f11420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Q.a f11421m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f11409a = new C1439t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Q.q f11411c = new Q.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f11412d = new Object();

    static {
        C1437q.a aVar = C1437q.f11392e;
        f11413e = aVar.a();
        long j10 = 1;
        f11414f = r.c(1) + j10;
        f11415g = new C1435o();
        f11416h = new N();
        f11417i = CollectionsKt.l();
        f11418j = CollectionsKt.l();
        long j11 = f11414f;
        f11414f = j10 + j11;
        C1422b c1422b = new C1422b(j11, aVar.a());
        f11413e = f11413e.s(c1422b.i());
        f11419k = c1422b;
        f11420l = c1422b;
        f11421m = new Q.a(0);
    }

    public static final C1437q E(C1437q c1437q, long j10, long j11) {
        while (Intrinsics.f(j10, j11) < 0) {
            c1437q = c1437q.s(j10);
            j10 += (long) 1;
        }
        return c1437q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[Catch: all -> 0x008b, LOOP:1: B:30:0x005b->B:42:0x0095, LOOP_END, TryCatch #2 {all -> 0x008b, blocks: (B:25:0x004c, B:27:0x0051, B:30:0x005b, B:32:0x006b, B:34:0x0077, B:36:0x0080, B:39:0x008d, B:42:0x0095, B:43:0x0098), top: B:54:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0098 A[EDGE_INSN: B:58:0x0098->B:43:0x0098 BREAK  A[LOOP:1: B:30:0x005b->B:42:0x0095], SYNTHETIC] */
    public static final Object F(Function1 function1) {
        p323s.P pE;
        Object objH0;
        C1422b c1422b = f11419k;
        synchronized (O()) {
            try {
                pE = c1422b.E();
                if (pE != null) {
                    f11421m.a(1);
                }
                objH0 = h0(c1422b, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pE != null) {
            try {
                List list = f11417i;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Function2) list.get(i10)).invoke(K.f.a(pE), c1422b);
                }
                f11421m.a(-1);
            } catch (Throwable th2) {
                f11421m.a(-1);
                throw th2;
            }
        }
        synchronized (O()) {
            try {
                H();
                if (pE != null) {
                    Object[] objArr = pE.f52684b;
                    long[] jArr = pE.f52683a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i11 != length) {
                                    break;
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        b0((V) objArr[(i11 << 3) + i13]);
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                                if (i11 != length) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    Unit unit = Unit.f48228a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objH0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G() {
        F(f11409a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H() {
        N n10 = f11416h;
        int iE = n10.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            Q.y yVar = n10.f()[i10];
            Object obj = yVar != null ? yVar.get() : null;
            if (obj != null && a0((V) obj)) {
                if (i11 != i10) {
                    n10.f()[i11] = yVar;
                    n10.d()[i11] = n10.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            n10.f()[i12] = null;
            n10.d()[i12] = 0;
        }
        if (i11 != iE) {
            n10.g(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1432l I(AbstractC1432l abstractC1432l, Function1 function1, boolean z10) {
        boolean z11 = abstractC1432l instanceof C1424d;
        if (z11 || abstractC1432l == null) {
            return new Z(z11 ? (C1424d) abstractC1432l : null, function1, null, false, z10);
        }
        return new a0(abstractC1432l, function1, false, z10);
    }

    static /* synthetic */ AbstractC1432l J(AbstractC1432l abstractC1432l, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return I(abstractC1432l, function1, z10);
    }

    public static final X K(X x10) {
        X xD0;
        AbstractC1432l.a aVar = AbstractC1432l.f11377e;
        AbstractC1432l abstractC1432lC = aVar.c();
        X xD1 = d0(x10, abstractC1432lC.i(), abstractC1432lC.f());
        if (xD1 != null) {
            return xD1;
        }
        synchronized (O()) {
            AbstractC1432l abstractC1432lC2 = aVar.c();
            xD0 = d0(x10, abstractC1432lC2.i(), abstractC1432lC2.f());
        }
        if (xD0 != null) {
            return xD0;
        }
        c0();
        throw new Ad.g();
    }

    public static final X L(X x10, AbstractC1432l abstractC1432l) {
        X xD0;
        X xD1 = d0(x10, abstractC1432l.i(), abstractC1432l.f());
        if (xD1 != null) {
            return xD1;
        }
        synchronized (O()) {
            xD0 = d0(x10, abstractC1432l.i(), abstractC1432l.f());
        }
        if (xD0 != null) {
            return xD0;
        }
        c0();
        throw new Ad.g();
    }

    public static final AbstractC1432l M() {
        AbstractC1432l abstractC1432l = (AbstractC1432l) f11411c.a();
        return abstractC1432l == null ? f11419k : abstractC1432l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(C1437q c1437q) {
        return Unit.f48228a;
    }

    public static final Object O() {
        return f11412d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 P(Function1 function1, Function1 function2, boolean z10) {
        if (!z10) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new C1438s(function1, function2);
    }

    static /* synthetic */ Function1 Q(Function1 function1, Function1 function2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return P(function1, function2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 S(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new C1440u(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f48228a;
    }

    public static final X U(X x10, V v10) {
        X xL0 = l0(v10);
        if (xL0 != null) {
            xL0.h(Long.MAX_VALUE);
            return xL0;
        }
        X xD = x10.d(Long.MAX_VALUE);
        xD.g(v10.w());
        Intrinsics.d(xD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        v10.n(xD);
        Intrinsics.d(xD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return xD;
    }

    public static final X V(X x10, V v10, AbstractC1432l abstractC1432l) {
        X xW;
        synchronized (O()) {
            xW = W(x10, v10, abstractC1432l);
        }
        return xW;
    }

    private static final X W(X x10, V v10, AbstractC1432l abstractC1432l) {
        X xU = U(x10, v10);
        xU.c(x10);
        xU.h(abstractC1432l.i());
        return xU;
    }

    public static final void X(AbstractC1432l abstractC1432l, V v10) {
        abstractC1432l.w(abstractC1432l.j() + 1);
        Function1 function1K = abstractC1432l.k();
        if (function1K != null) {
            function1K.invoke(v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Y(long j10, C1424d c1424d, C1437q c1437q) {
        long[] jArr;
        Map map;
        C1437q c1437q2;
        long[] jArr2;
        Map map2;
        int i10;
        p323s.P pE = c1424d.E();
        Map map3 = null;
        if (pE == null) {
            return null;
        }
        C1437q c1437qQ = c1424d.f().s(c1424d.i()).q(c1424d.F());
        Object[] objArr = pE.f52684b;
        long[] jArr3 = pE.f52683a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i11 = 0;
        while (true) {
            long j11 = jArr3[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j11) < 128) {
                        V v10 = (V) objArr[(i11 << 3) + i14];
                        map2 = map3;
                        X xW = v10.w();
                        i10 = i12;
                        X xD0 = d0(xW, j10, c1437q);
                        if (xD0 == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            X xD1 = d0(xW, j10, c1437qQ);
                            if (xD1 != null && !Intrinsics.b(xD0, xD1)) {
                                X xD2 = d0(xW, c1424d.i(), c1424d.f());
                                if (xD2 == null) {
                                    c0();
                                    throw new Ad.g();
                                }
                                X xV = v10.v(xD1, xD0, xD2);
                                if (xV == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(xD0, xV);
                                map4 = map4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        i10 = i12;
                    }
                    j11 >>= i10;
                    i14++;
                    j10 = j10;
                    map3 = map2;
                    i12 = i10;
                    jArr3 = jArr2;
                    c1437qQ = c1437qQ;
                }
                jArr = jArr3;
                map = map3;
                c1437q2 = c1437qQ;
                if (i13 != i12) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                c1437q2 = c1437qQ;
            }
            if (i11 == length) {
                return map4;
            }
            i11++;
            map3 = map;
            jArr3 = jArr;
            c1437qQ = c1437q2;
        }
    }

    public static final X Z(X x10, V v10, AbstractC1432l abstractC1432l, X x11) {
        X xU;
        if (abstractC1432l.h()) {
            abstractC1432l.p(v10);
        }
        long jI = abstractC1432l.i();
        if (x11.f() == jI) {
            return x11;
        }
        synchronized (O()) {
            xU = U(x10, v10);
        }
        xU.h(jI);
        if (x11.f() != r.c(1)) {
            abstractC1432l.p(v10);
        }
        return xU;
    }

    private static final boolean a0(V v10) {
        X x10;
        long jE = f11415g.e(f11414f);
        X x11 = null;
        X xW = null;
        int i10 = 0;
        for (X xW2 = v10.w(); xW2 != null; xW2 = xW2.e()) {
            long jF = xW2.f();
            if (jF != f11410b) {
                if (Intrinsics.f(jF, jE) >= 0) {
                    i10++;
                } else if (x11 == null) {
                    i10++;
                    x11 = xW2;
                } else {
                    if (Intrinsics.f(xW2.f(), x11.f()) < 0) {
                        x10 = x11;
                        x11 = xW2;
                    } else {
                        x10 = xW2;
                    }
                    if (xW == null) {
                        xW = v10.w();
                        X x12 = xW;
                        while (true) {
                            if (xW == null) {
                                xW = x12;
                                break;
                            }
                            if (Intrinsics.f(xW.f(), jE) >= 0) {
                                break;
                            }
                            if (Intrinsics.f(x12.f(), xW.f()) < 0) {
                                x12 = xW;
                            }
                            xW = xW.e();
                        }
                    }
                    x11.h(f11410b);
                    x11.c(xW);
                    x11 = x10;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(V v10) {
        if (a0(v10)) {
            f11416h.a(v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X d0(X x10, long j10, C1437q c1437q) {
        X x11 = null;
        while (x10 != null) {
            if (n0(x10, j10, c1437q) && (x11 == null || Intrinsics.f(x11.f(), x10.f()) < 0)) {
                x11 = x10;
            }
            x10 = x10.e();
        }
        if (x11 != null) {
            return x11;
        }
        return null;
    }

    public static final X e0(X x10, V v10) {
        X xD0;
        AbstractC1432l.a aVar = AbstractC1432l.f11377e;
        AbstractC1432l abstractC1432lC = aVar.c();
        Function1 function1G = abstractC1432lC.g();
        if (function1G != null) {
            function1G.invoke(v10);
        }
        X xD1 = d0(x10, abstractC1432lC.i(), abstractC1432lC.f());
        if (xD1 != null) {
            return xD1;
        }
        synchronized (O()) {
            AbstractC1432l abstractC1432lC2 = aVar.c();
            X xW = v10.w();
            Intrinsics.d(xW, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            xD0 = d0(xW, abstractC1432lC2.i(), abstractC1432lC2.f());
            if (xD0 == null) {
                c0();
                throw new Ad.g();
            }
        }
        return xD0;
    }

    public static final void f0(int i10) {
        f11415g.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void g0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h0(C1422b c1422b, Function1 function1) {
        long jI = c1422b.i();
        Object objInvoke = function1.invoke(f11413e.k(jI));
        long j10 = f11414f;
        f11414f = ((long) 1) + j10;
        f11413e = f11413e.k(jI);
        c1422b.v(j10);
        c1422b.u(f11413e);
        c1422b.w(0);
        c1422b.Q(null);
        c1422b.q();
        f11413e = f11413e.s(j10);
        return objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1432l i0(Function1 function1) {
        return (AbstractC1432l) F(new C1441v(function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1432l j0(Function1 function1, C1437q c1437q) {
        AbstractC1432l abstractC1432l = (AbstractC1432l) function1.invoke(c1437q);
        synchronized (O()) {
            f11413e = f11413e.s(abstractC1432l.i());
            Unit unit = Unit.f48228a;
        }
        return abstractC1432l;
    }

    public static final int k0(long j10, C1437q c1437q) {
        int iA;
        long jP = c1437q.p(j10);
        synchronized (O()) {
            iA = f11415g.a(jP);
        }
        return iA;
    }

    private static final X l0(V v10) {
        long jE = f11415g.e(f11414f) - ((long) 1);
        C1437q c1437qA = C1437q.f11392e.a();
        X x10 = null;
        for (X xW = v10.w(); xW != null; xW = xW.e()) {
            if (xW.f() != f11410b) {
                if (n0(xW, jE, c1437qA)) {
                    if (x10 == null) {
                        x10 = xW;
                    } else if (Intrinsics.f(xW.f(), x10.f()) >= 0) {
                        return x10;
                    }
                }
            }
            return xW;
        }
        return null;
    }

    private static final boolean m0(long j10, long j11, C1437q c1437q) {
        return (j11 == f11410b || Intrinsics.f(j11, j10) > 0 || c1437q.n(j11)) ? false : true;
    }

    private static final boolean n0(X x10, long j10, C1437q c1437q) {
        return m0(j10, x10.f(), c1437q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(AbstractC1432l abstractC1432l) {
        long jE;
        if (f11413e.n(abstractC1432l.i())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: snapshotId=");
        sb2.append(abstractC1432l.i());
        sb2.append(", disposed=");
        sb2.append(abstractC1432l.e());
        sb2.append(", applied=");
        C1424d c1424d = abstractC1432l instanceof C1424d ? (C1424d) abstractC1432l : null;
        sb2.append(c1424d != null ? Boolean.valueOf(c1424d.D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (O()) {
            jE = f11415g.e(-1L);
        }
        sb2.append(jE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final X p0(X x10, V v10, AbstractC1432l abstractC1432l) {
        X xD0;
        if (abstractC1432l.h()) {
            abstractC1432l.p(v10);
        }
        long jI = abstractC1432l.i();
        X xD1 = d0(x10, jI, abstractC1432l.f());
        if (xD1 == null) {
            c0();
            throw new Ad.g();
        }
        if (xD1.f() == abstractC1432l.i()) {
            return xD1;
        }
        synchronized (O()) {
            xD0 = d0(v10.w(), jI, abstractC1432l.f());
            if (xD0 == null) {
                c0();
                throw new Ad.g();
            }
            if (xD0.f() != jI) {
                xD0 = W(xD0, v10, abstractC1432l);
            }
        }
        Intrinsics.d(xD0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (xD1.f() != r.c(1)) {
            abstractC1432l.p(v10);
        }
        return xD0;
    }
}
