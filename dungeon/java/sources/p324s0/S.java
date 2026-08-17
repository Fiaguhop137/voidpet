package p324s0;

import O0.n;
import O0.r;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.p;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.v;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p288q0.AbstractC4054a;
import p288q0.E;
import p288q0.m;
import p288q0.y;
import p323s.O;
import p323s.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends p implements k, Y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f52915o = new b(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Function1 f52916p = a.f52926a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f52917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function1 f52918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t0 f52919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p.a f52923l = q.a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private x0 f52924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private O f52925n;

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52926a = new a();

        a() {
            super(1);
        }

        public final void a(t0 t0Var) {
            if (t0Var.G0()) {
                t0Var.a().j1(t0Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t0) obj);
            return Unit.f48228a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class c implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f52927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f52928b = n.f8279b.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f52929c = r.f8289b.a();

        public c() {
        }

        public final boolean a() {
            return this.f52927a;
        }

        @Override // O0.l
        public float b1() {
            return S.this.b1();
        }

        public final long e() {
            return this.f52928b;
        }

        public final long g() {
            return this.f52929c;
        }

        @Override // O0.d
        public float getDensity() {
            return S.this.getDensity();
        }

        public final void p(boolean z10) {
            this.f52927a = z10;
        }

        public final void t(long j10) {
            this.f52928b = j10;
        }

        @Override // p288q0.E
        public m x() {
            this.f52927a = true;
            m mVarX = S.this.x();
            if (n.f(this.f52928b, n.f8279b.a())) {
                this.f52928b = O0.o.d(p288q0.n.f(mVarX));
                this.f52929c = mVarX.g();
            }
            S.this.t1().c0().H();
            return mVarX;
        }

        @Override // p288q0.E
        public void y0(v vVar, float f10) {
            S.this.F1(vVar, f10);
        }

        public final void z(long j10) {
            this.f52929c = j10;
        }
    }

    static final class d extends o implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f52932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f52933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0 f52934d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, long j11, t0 t0Var) {
            super(0);
            this.f52932b = j10;
            this.f52933c = j11;
            this.f52934d = t0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m273invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m273invoke() {
            S.this.y1().p(false);
            S.this.y1().t(this.f52932b);
            S.this.y1().z(this.f52933c);
            Function1 function1V = this.f52934d.b().v();
            if (function1V != null) {
                function1V.invoke(S.this.y1());
            }
        }
    }

    public static final class e implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f52937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f52938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f52939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f52940f;

        e(int i10, int i11, Map map, Function1 function1, Function1 function2, S s10) {
            this.f52935a = i10;
            this.f52936b = i11;
            this.f52937c = map;
            this.f52938d = function1;
            this.f52939e = function2;
            this.f52940f = s10;
        }

        @Override // p288q0.y
        public int getHeight() {
            return this.f52936b;
        }

        @Override // p288q0.y
        public int getWidth() {
            return this.f52935a;
        }

        @Override // p288q0.y
        public Map t() {
            return this.f52937c;
        }

        @Override // p288q0.y
        public void u() {
            this.f52939e.invoke(this.f52940f.w1());
        }

        @Override // p288q0.y
        public Function1 v() {
            return this.f52938d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void E1(P p10) {
        I i10;
        Object[] objArr = p10.f52684b;
        long[] jArr = p10.f52683a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && (i10 = (I) ((J0) objArr[(i11 << 3) + i13]).get()) != null) {
                        if (i0()) {
                            i10.A1(false);
                        } else {
                            i10.E1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x009f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void Y0(I i10, v vVar) {
        char c10;
        long j10;
        long j11;
        long j12;
        int i11;
        int i12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i13;
        char c11;
        long j14;
        int i14;
        int i15;
        int i16;
        boolean z10;
        O o10 = this.f52925n;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i17 = 8;
        if (o10 != null) {
            Object[] objArr = o10.f52662c;
            long[] jArr3 = o10.f52660a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i18 = 0;
                j11 = 128;
                while (true) {
                    long j16 = jArr3[i18];
                    j12 = 255;
                    if ((((~j16) << c12) & j16 & j15) != j15) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j16 & 255) < 128) {
                                c11 = c12;
                                P p10 = (P) objArr[(i18 << 3) + i20];
                                j14 = j15;
                                Object[] objArr2 = p10.f52684b;
                                long[] jArr4 = p10.f52683a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i21 = i17;
                                    int i22 = 0;
                                    while (true) {
                                        int i23 = length2;
                                        long j17 = jArr4[i22];
                                        jArr2 = jArr3;
                                        j13 = j16;
                                        if ((((~j17) << c11) & j17 & j14) != j14) {
                                            int i24 = 8 - ((~(i22 - i23)) >>> 31);
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                if ((j17 & 255) < 128) {
                                                    int i26 = (i22 << 3) + i25;
                                                    I i27 = (I) ((J0) objArr2[i26]).get();
                                                    i15 = i25;
                                                    if (i27 != null) {
                                                        boolean zE = i27.e();
                                                        i16 = i20;
                                                        z10 = zE;
                                                        if (!z10) {
                                                            p10.A(i26);
                                                        }
                                                    } else {
                                                        i16 = i20;
                                                    }
                                                    if (!z10) {
                                                        p10.A(i26);
                                                    }
                                                } else {
                                                    i15 = i25;
                                                    i16 = i20;
                                                }
                                                j17 >>= i21;
                                                i25 = i15 + 1;
                                                i20 = i16;
                                            }
                                            i13 = i20;
                                            if (i24 != i21) {
                                                break;
                                            }
                                        } else {
                                            i13 = i20;
                                        }
                                        length2 = i23;
                                        if (i22 == length2) {
                                            break;
                                        }
                                        i22++;
                                        jArr3 = jArr2;
                                        j16 = j13;
                                        i20 = i13;
                                        i21 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j13 = j16;
                                    i13 = i20;
                                }
                                i14 = 8;
                            } else {
                                jArr2 = jArr3;
                                j13 = j16;
                                i13 = i20;
                                c11 = c12;
                                j14 = j15;
                                i14 = i17;
                            }
                            i17 = i14;
                            j16 = j13 >> i14;
                            c12 = c11;
                            j15 = j14;
                            i20 = i13 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c10 = c12;
                        j10 = j15;
                        if (i19 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c10 = c12;
                        j10 = j15;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    c12 = c10;
                    j15 = j10;
                    jArr3 = jArr;
                    i17 = 8;
                }
            } else {
                c10 = 7;
                j10 = -9187201950435737472L;
                j11 = 128;
                j12 = 255;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        O o11 = this.f52925n;
        if (o11 != null) {
            long[] jArr5 = o11.f52660a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i28 = 0;
                while (true) {
                    long j18 = jArr5[i28];
                    if ((((~j18) << c10) & j18 & j10) != j10) {
                        int i29 = 8 - ((~(i28 - length3)) >>> 31);
                        for (int i30 = 0; i30 < i29; i30++) {
                            if ((j18 & j12) < j11) {
                                int i31 = (i28 << 3) + i30;
                                if (((P) o11.f52662c[i31]).d()) {
                                    o11.v(i31);
                                }
                            }
                            j18 >>= 8;
                        }
                        if (i29 != 8) {
                            break;
                        }
                    }
                    if (i28 == length3) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
        }
        O o12 = this.f52925n;
        if (o12 == null) {
            i11 = 0;
            i12 = 1;
            o12 = new O(0, 1, null);
            this.f52925n = o12;
        } else {
            i11 = 0;
            i12 = 1;
        }
        Object objE = o12.e(vVar);
        if (objE == null) {
            objE = new P(i11, i12, null);
            o12.x(vVar, objE);
        }
        ((P) objE).w(new J0(i10));
    }

    private final void a1(t0 t0Var, long j10, long j11) {
        q0 snapshotObserver;
        O o10 = this.f52925n;
        x0 x0Var = this.f52924m;
        if (x0Var == null) {
            x0Var = new x0();
            this.f52924m = x0Var;
        }
        o0 o0VarY0 = t1().y0();
        if (o0VarY0 != null && (snapshotObserver = o0VarY0.getSnapshotObserver()) != null) {
            snapshotObserver.i(t0Var, f52916p, new d(j10, j11, t0Var));
        }
        x0Var.d(i0(), this, o10);
    }

    static /* synthetic */ void g1(S s10, t0 t0Var, long j10, long j11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i10 & 2) != 0) {
            j10 = n.f8279b.a();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = r.f8289b.a();
        }
        s10.a1(t0Var, j12, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[LOOP:0: B:11:0x001e->B:21:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[EDGE_INSN: B:27:0x0058->B:22:0x0058 BREAK  A[LOOP:0: B:11:0x001e->B:21:0x0055], SYNTHETIC] */
    public final void j1(t0 t0Var) {
        if (this.f52922k) {
            return;
        }
        Function1 function1V = t0Var.b().v();
        O o10 = this.f52925n;
        if (function1V != null) {
            g1(this, t0Var, 0L, 0L, 6, null);
            this.f52918g = function1V;
            return;
        }
        if (o10 != null) {
            Object[] objArr = o10.f52662c;
            long[] jArr = o10.f52660a;
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
                                E1((P) objArr[(i10 << 3) + i12]);
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
            o10.k();
        }
    }

    private final S l1(v vVar) {
        S sV1;
        S s10 = this;
        while (true) {
            x0 x0Var = s10.f52924m;
            if ((x0Var != null && x0Var.b(vVar)) || (sV1 = s10.v1()) == null) {
                return s10;
            }
            s10 = sV1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c y1() {
        c cVar = this.f52917f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f52917f = cVar2;
        return cVar2;
    }

    public final void A1(v vVar) {
        O o10 = l1(vVar).f52925n;
        P p10 = o10 != null ? (P) o10.u(vVar) : null;
        if (p10 != null) {
            E1(p10);
        }
    }

    public boolean B1() {
        return this.f52920i;
    }

    public final boolean C1() {
        return this.f52922k;
    }

    public final boolean D1() {
        return this.f52921j;
    }

    public final void F1(v vVar, float f10) {
        x0 x0Var = this.f52924m;
        if (x0Var == null) {
            x0Var = new x0();
            this.f52924m = x0Var;
        }
        x0Var.e(vVar, f10);
    }

    public abstract void G1();

    public void H1(boolean z10) {
        this.f52920i = z10;
    }

    public final void I1(boolean z10) {
        this.f52922k = z10;
    }

    public final void J1(boolean z10) {
        this.f52921j = z10;
    }

    @Override // p324s0.Y
    public void L(boolean z10) {
        S sV1 = v1();
        I iT1 = sV1 != null ? sV1.t1() : null;
        if (Intrinsics.b(iT1, t1())) {
            H1(z10);
            return;
        }
        if ((iT1 != null ? iT1.e0() : null) != I.e.LayingOut) {
            if ((iT1 != null ? iT1.e0() : null) != I.e.LookaheadLayingOut) {
                return;
            }
        }
        H1(z10);
    }

    public abstract int Z0(AbstractC4054a abstractC4054a);

    @Override // androidx.compose.ui.layout.k
    public y h1(int i10, int i11, Map map, Function1 function1, Function1 function2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            p270p0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i10, i11, map, function1, function2, this);
    }

    @Override // p288q0.j
    public boolean i0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[LOOP:2: B:57:0x00ee->B:67:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x011e A[EDGE_INSN: B:80:0x011e->B:68:0x011e BREAK  A[LOOP:2: B:57:0x00ee->B:67:0x011b], SYNTHETIC] */
    public final void k1(y yVar) {
        char c10;
        O o10 = this.f52925n;
        char c11 = 7;
        if (yVar == null) {
            if (o10 != null) {
                Object[] objArr = o10.f52662c;
                long[] jArr = o10.f52660a;
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
                                if ((j10 & 255) < 128) {
                                    E1((P) objArr[(i10 << 3) + i12]);
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
            }
            if (o10 != null) {
                o10.k();
            }
            x0 x0Var = this.f52924m;
            if (x0Var != null) {
                x0Var.a();
                return;
            }
            return;
        }
        if (this.f52922k) {
            return;
        }
        Function1 function1V = yVar.v();
        if (function1V != null) {
            boolean z10 = this.f52918g != function1V;
            long jA = n.f8279b.a();
            long jA2 = r.f8289b.a();
            if (!z10 && y1().a()) {
                m mVarX = x();
                jA = O0.o.d(p288q0.n.f(mVarX));
                jA2 = mVarX.g();
                z10 = (n.f(jA, y1().e()) && r.e(jA2, y1().g())) ? false : true;
            }
            long j11 = jA;
            long j12 = jA2;
            if (z10) {
                t0 t0Var = this.f52919h;
                if (t0Var != null) {
                    t0Var.c(yVar);
                } else {
                    t0Var = new t0(yVar, this);
                    this.f52919h = t0Var;
                }
                a1(t0Var, j11, j12);
                this.f52918g = yVar.v();
                return;
            }
            return;
        }
        if (o10 != null) {
            Object[] objArr2 = o10.f52662c;
            long[] jArr2 = o10.f52660a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr2[i13];
                    if ((((~j13) << c11) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j13 & 255) < 128) {
                                E1((P) objArr2[(i13 << 3) + i15]);
                            }
                            j13 >>= 8;
                            i15++;
                            c11 = c11;
                        }
                        c10 = c11;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        c10 = c11;
                    }
                    if (i13 == length2) {
                        break;
                    }
                    i13++;
                    c11 = c10;
                }
            }
            o10.k();
        }
    }

    @Override // p288q0.z
    public final int n0(AbstractC4054a abstractC4054a) {
        int iZ0;
        if (q1() && (iZ0 = Z0(abstractC4054a)) != Integer.MIN_VALUE) {
            return iZ0 + n.h(z0());
        }
        return Integer.MIN_VALUE;
    }

    public final float o1(v vVar, float f10) {
        if (this.f52922k) {
            return f10;
        }
        S s10 = this;
        while (true) {
            x0 x0Var = s10.f52924m;
            float fC = x0Var != null ? x0Var.c(vVar, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fC)) {
                s10.Y0(t1(), vVar);
                return vVar.a(fC, s10.x(), x());
            }
            S sV1 = s10.v1();
            if (sV1 == null) {
                s10.Y0(t1(), vVar);
                return f10;
            }
            s10 = sV1;
        }
    }

    public abstract S p1();

    public abstract boolean q1();

    public abstract I t1();

    public abstract y u1();

    public abstract S v1();

    public final p.a w1() {
        return this.f52923l;
    }

    public abstract m x();

    public abstract long x1();

    protected final void z1(AbstractC4133d0 abstractC4133d0) {
        AbstractC4126a abstractC4126aT;
        AbstractC4133d0 abstractC4133d0W2 = abstractC4133d0.w2();
        if (!Intrinsics.b(abstractC4133d0W2 != null ? abstractC4133d0W2.t1() : null, abstractC4133d0.t1())) {
            abstractC4133d0.k2().t().m();
            return;
        }
        InterfaceC4128b interfaceC4128bJ = abstractC4133d0.k2().J();
        if (interfaceC4128bJ == null || (abstractC4126aT = interfaceC4128bJ.t()) == null) {
            return;
        }
        abstractC4126aT.m();
    }
}
