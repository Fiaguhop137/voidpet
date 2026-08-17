package I;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1029d1 implements InterfaceC1094z1, InterfaceC1023b1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4613h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f4614i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1035f1 f4615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1021b f4617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function2 f4618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p323s.K f4620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p323s.O f4621g;

    /* JADX INFO: renamed from: I.d1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(G1 g10, List list, InterfaceC1035f1 interfaceC1035f1) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objW0 = g10.W0((C1021b) list.get(i10), 0);
                C1029d1 c1029d1 = objW0 instanceof C1029d1 ? (C1029d1) objW0 : null;
                if (c1029d1 != null) {
                    c1029d1.c(interfaceC1035f1);
                }
            }
        }
    }

    public C1029d1(InterfaceC1035f1 interfaceC1035f1) {
        this.f4615a = interfaceC1035f1;
    }

    private final void J(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 32 : i10 & (-33);
    }

    private final void N(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 16 : i10 & (-17);
    }

    private final boolean d(U u10, p323s.O o10) {
        Intrinsics.d(u10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        S1 s1L = u10.l();
        if (s1L == null) {
            s1L = T1.m();
        }
        return !s1L.b(u10.z().a(), o10.e(u10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[LOOP:0: B:11:0x0020->B:35:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[EDGE_INSN: B:39:0x008a->B:36:0x008a BREAK  A[LOOP:0: B:11:0x0020->B:35:0x0087], SYNTHETIC] */
    public static final Unit g(C1029d1 c1029d1, int i10, p323s.K k10, InterfaceC1086x interfaceC1086x) {
        int i11;
        if (c1029d1.f4619e == i10 && Intrinsics.b(k10, c1029d1.f4620f) && (interfaceC1086x instanceof B)) {
            long[] jArr = k10.f52639a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((255 & j10) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = k10.f52640b[i16];
                                boolean z10 = k10.f52641c[i16] != i10;
                                if (z10) {
                                    B b10 = (B) interfaceC1086x;
                                    b10.U(obj, c1029d1);
                                    i11 = i13;
                                    if (obj instanceof U) {
                                        b10.T((U) obj);
                                        p323s.O o10 = c1029d1.f4621g;
                                        if (o10 != null) {
                                            o10.u(obj);
                                        }
                                    }
                                } else {
                                    i11 = i13;
                                }
                                if (z10) {
                                    k10.s(i16);
                                }
                            } else {
                                i11 = i13;
                            }
                            j10 >>= i11;
                            i15++;
                            i13 = i11;
                        }
                        if (i14 != i13) {
                            break;
                        }
                        if (i12 != length) {
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        return Unit.f48228a;
    }

    private final boolean o() {
        return (this.f4616b & 32) != 0;
    }

    public final void A() {
        InterfaceC1035f1 interfaceC1035f1 = this.f4615a;
        if (interfaceC1035f1 != null) {
            interfaceC1035f1.i(this);
        }
        this.f4615a = null;
        this.f4620f = null;
        this.f4621g = null;
        this.f4618d = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void B() {
        p323s.K k10;
        InterfaceC1035f1 interfaceC1035f1 = this.f4615a;
        if (interfaceC1035f1 == null || (k10 = this.f4620f) == null) {
            return;
        }
        J(true);
        try {
            Object[] objArr = k10.f52640b;
            int[] iArr = k10.f52641c;
            long[] jArr = k10.f52639a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                int i14 = iArr[i13];
                                interfaceC1035f1.a(obj);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } finally {
            J(false);
        }
    }

    public final void C() {
        if (r()) {
            return;
        }
        N(true);
    }

    public final void D(C1021b c1021b) {
        this.f4617c = c1021b;
    }

    public final void E(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 2 : i10 & (-3);
    }

    public final void F(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 4 : i10 & (-5);
    }

    public final void G(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 64 : i10 & (-65);
    }

    public final void H(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 256 : i10 & (-257);
    }

    public final void I(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 8 : i10 & (-9);
    }

    public final void K(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 1024 : i10 & (-1025);
    }

    public final void L(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 512 : i10 & (-513);
    }

    public final void M(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 128 : i10 & (-129);
    }

    public final void O(boolean z10) {
        int i10 = this.f4616b;
        this.f4616b = z10 ? i10 | 1 : i10 & (-2);
    }

    public final void P(int i10) {
        this.f4619e = i10;
        N(false);
    }

    @Override // I.InterfaceC1094z1
    public void a(Function2 function2) {
        this.f4618d = function2;
    }

    public final void c(InterfaceC1035f1 interfaceC1035f1) {
        this.f4615a = interfaceC1035f1;
    }

    public final void e(InterfaceC1054m interfaceC1054m) {
        Function2 function2 = this.f4618d;
        if (function2 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        function2.invoke(interfaceC1054m, 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final Function1 f(int i10) {
        p323s.K k10 = this.f4620f;
        if (k10 != null && !s()) {
            Object[] objArr = k10.f52640b;
            int[] iArr = k10.f52641c;
            long[] jArr = k10.f52639a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                if (iArr[i14] != i10) {
                                    return new C1026c1(this, i10, k10);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
            }
        }
        return null;
    }

    public final C1021b h() {
        return this.f4617c;
    }

    public final boolean i() {
        return this.f4618d != null;
    }

    @Override // I.InterfaceC1023b1
    public void invalidate() {
        InterfaceC1035f1 interfaceC1035f1 = this.f4615a;
        if (interfaceC1035f1 != null) {
            interfaceC1035f1.f(this, null);
        }
    }

    public final boolean j() {
        return (this.f4616b & 2) != 0;
    }

    public final boolean k() {
        return (this.f4616b & 4) != 0;
    }

    public final boolean l() {
        return (this.f4616b & 64) != 0;
    }

    public final boolean m() {
        return (this.f4616b & 256) != 0;
    }

    public final boolean n() {
        return (this.f4616b & 8) != 0;
    }

    public final boolean p() {
        return (this.f4616b & 1024) != 0;
    }

    public final boolean q() {
        return (this.f4616b & 512) != 0;
    }

    public final boolean r() {
        return (this.f4616b & 128) != 0;
    }

    public final boolean s() {
        return (this.f4616b & 16) != 0;
    }

    public final boolean t() {
        return (this.f4616b & 1) != 0;
    }

    public final boolean u() {
        if (this.f4615a != null) {
            C1021b c1021b = this.f4617c;
            if (c1021b != null ? c1021b.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final EnumC1052l0 v(Object obj) {
        EnumC1052l0 enumC1052l0F;
        InterfaceC1035f1 interfaceC1035f1 = this.f4615a;
        return (interfaceC1035f1 == null || (enumC1052l0F = interfaceC1035f1.f(this, obj)) == null) ? EnumC1052l0.IGNORED : enumC1052l0F;
    }

    public final boolean w() {
        return this.f4621g != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean x(Object obj) {
        p323s.O o10;
        if (obj == null || (o10 = this.f4621g) == null) {
            return true;
        }
        if (obj instanceof U) {
            return d((U) obj, o10);
        }
        if (!(obj instanceof p323s.b0)) {
            return true;
        }
        p323s.b0 b0Var = (p323s.b0) obj;
        if (b0Var.e()) {
            Object[] objArr = b0Var.f52684b;
            long[] jArr = b0Var.f52683a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj2 = objArr[(i10 << 3) + i12];
                                if (!(obj2 instanceof U) || d((U) obj2, o10)) {
                                    return true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 != length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return false;
    }

    public final void y(U u10, Object obj) {
        p323s.O o10 = this.f4621g;
        if (o10 == null) {
            o10 = new p323s.O(0, 1, null);
            this.f4621g = o10;
        }
        o10.x(u10, obj);
    }

    public final boolean z(Object obj) {
        if (o()) {
            return false;
        }
        p323s.K k10 = this.f4620f;
        if (k10 == null) {
            k10 = new p323s.K(0, 1, null);
            this.f4620f = k10;
        }
        return k10.q(obj, this.f4619e, -1) == this.f4619e;
    }
}
