package I;

import S.AbstractC1432l;
import S.AbstractC1442w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class T extends S.W implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f4551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S1 f4552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f4553d = new a(AbstractC1442w.M().i());

    public static final class a extends S.X implements U.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0098a f4554h = new C0098a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f4555i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f4556j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p323s.S f4559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f4560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f4561g;

        /* JADX INFO: renamed from: I.T$a$a, reason: collision with other inner class name */
        public static final class C0098a {
            private C0098a() {
            }

            public /* synthetic */ C0098a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.f4556j;
            }
        }

        public a(long j10) {
            super(j10);
            this.f4559e = p323s.T.a();
            this.f4560f = f4556j;
        }

        @Override // I.U.a
        public Object a() {
            return this.f4560f;
        }

        @Override // I.U.a
        public p323s.S b() {
            return this.f4559e;
        }

        @Override // S.X
        public void c(S.X x10) {
            Intrinsics.d(x10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) x10;
            m(aVar.b());
            this.f4560f = aVar.f4560f;
            this.f4561g = aVar.f4561g;
        }

        @Override // S.X
        public S.X d(long j10) {
            return new a(j10);
        }

        public final Object j() {
            return this.f4560f;
        }

        public final boolean k(U u10, AbstractC1432l abstractC1432l) {
            boolean z10;
            boolean z11;
            synchronized (AbstractC1442w.O()) {
                z10 = true;
                z11 = (this.f4557c == abstractC1432l.i() && this.f4558d == abstractC1432l.j()) ? false : true;
            }
            if (this.f4560f == f4556j || (z11 && this.f4561g != l(u10, abstractC1432l))) {
                z10 = false;
            }
            if (!z10 || !z11) {
                return z10;
            }
            synchronized (AbstractC1442w.O()) {
                this.f4557c = abstractC1432l.i();
                this.f4558d = abstractC1432l.j();
                Unit unit = Unit.f48228a;
            }
            return z10;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c6 A[DONT_GENERATE, LOOP:3: B:43:0x00c4->B:44:0x00c6, LOOP_END] */
        public final int l(U u10, AbstractC1432l abstractC1432l) {
            p323s.S sB;
            int iA;
            int i10;
            int i11;
            int i12;
            synchronized (AbstractC1442w.O()) {
                sB = b();
            }
            int i13 = 7;
            if (!sB.h()) {
                return 7;
            }
            K.c cVarA = T1.a();
            Object[] objArr = cVarA.f5867a;
            int iL = cVarA.l();
            for (int i14 = 0; i14 < iL; i14++) {
                ((V) objArr[i14]).b(u10);
            }
            try {
                Object[] objArr2 = sB.f52640b;
                int[] iArr = sB.f52641c;
                long[] jArr = sB.f52639a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iA = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    i11 = i13;
                                    S.V v10 = (S.V) objArr2[i19];
                                    i12 = i16;
                                    if (iArr[i19] == 1) {
                                        S.X xD = v10 instanceof T ? ((T) v10).D(abstractC1432l) : AbstractC1442w.L(v10.w(), abstractC1432l);
                                        iA = (((iA * 31) + Q.s.a(xD)) * 31) + Long.hashCode(xD.f());
                                    }
                                } else {
                                    i11 = i13;
                                    i12 = i16;
                                }
                                j10 >>= i12;
                                i18++;
                                i16 = i12;
                                i13 = i11;
                            }
                            i10 = i13;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            i10 = i13;
                        }
                        if (i15 != length) {
                            i15++;
                            i13 = i10;
                        } else {
                            i13 = iA;
                        }
                    }
                    Unit unit = Unit.f48228a;
                    return iA;
                }
                iA = i13;
                Unit unit2 = Unit.f48228a;
                return iA;
            } finally {
                Object[] objArr3 = cVarA.f5867a;
                int iL2 = cVarA.l();
                for (int i20 = 0; i20 < iL2; i20++) {
                    ((V) objArr3[i20]).a(u10);
                }
            }
        }

        public void m(p323s.S s10) {
            this.f4559e = s10;
        }

        public final void n(Object obj) {
            this.f4560f = obj;
        }

        public final void o(int i10) {
            this.f4561g = i10;
        }

        public final void p(long j10) {
            this.f4557c = j10;
        }

        public final void q(int i10) {
            this.f4558d = i10;
        }
    }

    public T(Function0 function0, S1 s10) {
        this.f4551b = function0;
        this.f4552c = s10;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[Catch: all -> 0x0043, LOOP:1: B:16:0x0056->B:30:0x00ab, LOOP_END, TryCatch #2 {all -> 0x0043, blocks: (B:8:0x0026, B:10:0x0036, B:13:0x0046, B:16:0x0056, B:18:0x0069, B:20:0x0074, B:22:0x007e, B:24:0x0097, B:26:0x009d, B:30:0x00ab, B:31:0x00b1), top: B:87:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b1 A[EDGE_INSN: B:92:0x00b1->B:31:0x00b1 BREAK  A[LOOP:1: B:16:0x0056->B:30:0x00ab], SYNTHETIC] */
    private final a E(a aVar, AbstractC1432l abstractC1432l, boolean z10, Function0 function0) {
        AbstractC1432l.a aVar2;
        S1 s1L;
        int i10;
        a aVar3 = aVar;
        int i11 = 0;
        if (!aVar3.k(this, abstractC1432l)) {
            p323s.K k10 = new p323s.K(0, 1, null);
            Q.j jVar = (Q.j) U1.f4562a.a();
            if (jVar == null) {
                jVar = new Q.j(0);
                U1.f4562a.b(jVar);
            }
            int iA = jVar.a();
            K.c cVarA = T1.a();
            Object[] objArr = cVarA.f5867a;
            int iL = cVarA.l();
            for (int i12 = 0; i12 < iL; i12++) {
                ((V) objArr[i12]).b(this);
            }
            try {
                jVar.b(iA + 1);
                Object objG = AbstractC1432l.f11377e.g(new S(this, jVar, k10, iA), null, function0);
                jVar.b(iA);
                Object[] objArr2 = cVarA.f5867a;
                int iL2 = cVarA.l();
                for (int i13 = 0; i13 < iL2; i13++) {
                    ((V) objArr2[i13]).a(this);
                }
                synchronized (AbstractC1442w.O()) {
                    try {
                        aVar2 = AbstractC1432l.f11377e;
                        AbstractC1432l abstractC1432lC = aVar2.c();
                        if (aVar3.j() == a.f4554h.a() || (s1L = l()) == null || !s1L.b(objG, aVar3.j())) {
                            aVar3 = (a) AbstractC1442w.V(this.f4553d, this, abstractC1432lC);
                            aVar3.m(k10);
                            aVar3.o(aVar3.l(this, abstractC1432lC));
                            aVar3.n(objG);
                        } else {
                            aVar3.m(k10);
                            aVar3.o(aVar3.l(this, abstractC1432lC));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Q.j jVar2 = (Q.j) U1.f4562a.a();
                if (jVar2 == null || jVar2.a() != 0) {
                    return aVar3;
                }
                aVar2.f();
                synchronized (AbstractC1442w.O()) {
                    AbstractC1432l abstractC1432lC2 = aVar2.c();
                    aVar3.p(abstractC1432lC2.i());
                    aVar3.q(abstractC1432lC2.j());
                    Unit unit = Unit.f48228a;
                }
                return aVar3;
            } catch (Throwable th2) {
                Object[] objArr3 = cVarA.f5867a;
                int iL3 = cVarA.l();
                for (int i14 = 0; i14 < iL3; i14++) {
                    ((V) objArr3[i14]).a(this);
                }
                throw th2;
            }
        }
        if (z10) {
            K.c cVarA2 = T1.a();
            Object[] objArr4 = cVarA2.f5867a;
            int iL4 = cVarA2.l();
            for (int i15 = 0; i15 < iL4; i15++) {
                ((V) objArr4[i15]).b(this);
            }
            try {
                p323s.S sB = aVar3.b();
                Q.j jVar3 = (Q.j) U1.f4562a.a();
                if (jVar3 == null) {
                    jVar3 = new Q.j(0);
                    U1.f4562a.b(jVar3);
                }
                int iA2 = jVar3.a();
                Object[] objArr5 = sB.f52640b;
                int[] iArr = sB.f52641c;
                long[] jArr = sB.f52639a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j10 = jArr[i16];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i16 != length) {
                                break;
                                break;
                            }
                            i16++;
                            i11 = 0;
                        } else {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            while (i11 < i18) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i16 << 3) + i11;
                                    i10 = i17;
                                    S.V v10 = (S.V) objArr5[i19];
                                    jVar3.b(iA2 + iArr[i19]);
                                    Function1 function1G = abstractC1432l.g();
                                    if (function1G != null) {
                                        function1G.invoke(v10);
                                    }
                                } else {
                                    i10 = i17;
                                }
                                j10 >>= i10;
                                i11++;
                                i17 = i10;
                            }
                            if (i18 != i17) {
                                break;
                            }
                            if (i16 != length) {
                                break;
                            }
                            i16++;
                            i11 = 0;
                        }
                    }
                }
                jVar3.b(iA2);
                Unit unit2 = Unit.f48228a;
            } finally {
                Object[] objArr6 = cVarA2.f5867a;
                int iL5 = cVarA2.l();
                for (int i20 = 0; i20 < iL5; i20++) {
                    ((V) objArr6[i20]).a(this);
                }
            }
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(T t10, Q.j jVar, p323s.K k10, int i10, Object obj) {
        if (obj == t10) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof S.V) {
            k10.u(obj, Math.min(jVar.a() - i10, k10.e(obj, Integer.MAX_VALUE)));
        }
        return Unit.f48228a;
    }

    private final String H() {
        a aVar = (a) AbstractC1442w.K(this.f4553d);
        return aVar.k(this, AbstractC1432l.f11377e.c()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    public final S.X D(AbstractC1432l abstractC1432l) {
        return E((a) AbstractC1442w.L(this.f4553d, abstractC1432l), abstractC1432l, false, this.f4551b);
    }

    @Override // I.d2
    public Object getValue() {
        AbstractC1432l.a aVar = AbstractC1432l.f11377e;
        Function1 function1G = aVar.c().g();
        if (function1G != null) {
            function1G.invoke(this);
        }
        AbstractC1432l abstractC1432lC = aVar.c();
        return E((a) AbstractC1442w.L(this.f4553d, abstractC1432lC), abstractC1432lC, true, this.f4551b).j();
    }

    @Override // I.U
    public S1 l() {
        return this.f4552c;
    }

    @Override // S.V
    public void n(S.X x10) {
        Intrinsics.d(x10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f4553d = (a) x10;
    }

    public String toString() {
        return "DerivedState(value=" + H() + ")@" + hashCode();
    }

    @Override // S.V
    public S.X w() {
        return this.f4553d;
    }

    @Override // I.U
    public U.a z() {
        AbstractC1432l abstractC1432lC = AbstractC1432l.f11377e.c();
        return E((a) AbstractC1442w.L(this.f4553d, abstractC1432lC), abstractC1432lC, false, this.f4551b);
    }
}
