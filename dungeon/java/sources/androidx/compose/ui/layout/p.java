package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import p091f0.C3406c;
import p324s0.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements p288q0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f21667d = q.f21671b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21668e = O0.n.f8279b.b();

    public static abstract class a implements O0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21669a;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void C(p pVar) {
            if (pVar instanceof Y) {
                ((Y) pVar).L(this.f21669a);
            }
        }

        public static /* synthetic */ void K(a aVar, p pVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.J(pVar, i10, i11, f10);
        }

        public static /* synthetic */ void O(a aVar, p pVar, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.L(pVar, j10, f10);
        }

        public static /* synthetic */ void T(a aVar, p pVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.Q(pVar, i10, i11, f10);
        }

        public static /* synthetic */ void Y(a aVar, p pVar, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = q.f21670a;
            }
            aVar.X(pVar, i10, i11, f11, function1);
        }

        public static /* synthetic */ void a0(a aVar, p pVar, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = q.f21670a;
            }
            aVar.Z(pVar, i10, i11, f11, function1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int A();

        public final void J(p pVar, int i10, int i11, float f10) {
            long jD = O0.n.d((((long) i11) & 4294967295L) | (((long) i10) << 32));
            C(pVar);
            pVar.P0(O0.n.k(jD, pVar.f21668e), f10, null);
        }

        public final void L(p pVar, long j10, float f10) {
            C(pVar);
            pVar.P0(O0.n.k(j10, pVar.f21668e), f10, null);
        }

        public final void Q(p pVar, int i10, int i11, float f10) {
            long jD = O0.n.d((((long) i10) << 32) | (((long) i11) & 4294967295L));
            if (z() == O0.t.Ltr || A() == 0) {
                C(pVar);
                pVar.P0(O0.n.k(jD, pVar.f21668e), f10, null);
            } else {
                long jD2 = O0.n.d((((long) ((A() - pVar.H0()) - O0.n.g(jD))) << 32) | (((long) O0.n.h(jD)) & 4294967295L));
                C(pVar);
                pVar.P0(O0.n.k(jD2, pVar.f21668e), f10, null);
            }
        }

        public final void X(p pVar, int i10, int i11, float f10, Function1 function1) {
            long jD = O0.n.d((((long) i10) << 32) | (((long) i11) & 4294967295L));
            if (z() == O0.t.Ltr || A() == 0) {
                C(pVar);
                pVar.P0(O0.n.k(jD, pVar.f21668e), f10, function1);
            } else {
                long jD2 = O0.n.d((((long) ((A() - pVar.H0()) - O0.n.g(jD))) << 32) | (((long) O0.n.h(jD)) & 4294967295L));
                C(pVar);
                pVar.P0(O0.n.k(jD2, pVar.f21668e), f10, function1);
            }
        }

        public final void Z(p pVar, int i10, int i11, float f10, Function1 function1) {
            long jD = O0.n.d((((long) i11) & 4294967295L) | (((long) i10) << 32));
            C(pVar);
            pVar.P0(O0.n.k(jD, pVar.f21668e), f10, function1);
        }

        public final void c0(p pVar, long j10, float f10, Function1 function1) {
            C(pVar);
            pVar.P0(O0.n.k(j10, pVar.f21668e), f10, function1);
        }

        public final void d0(p pVar, long j10, C3406c c3406c, float f10) {
            C(pVar);
            pVar.K0(O0.n.k(j10, pVar.f21668e), f10, c3406c);
        }

        public float t(v vVar, float f10) {
            return f10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract O0.t z();
    }

    public p() {
        long j10 = 0;
        this.f21666c = O0.r.c((j10 & 4294967295L) | (j10 << 32));
    }

    private final void J0() {
        this.f21664a = kotlin.ranges.e.m((int) (this.f21666c >> 32), O0.b.n(this.f21667d), O0.b.l(this.f21667d));
        int iM = kotlin.ranges.e.m((int) (this.f21666c & 4294967295L), O0.b.m(this.f21667d), O0.b.k(this.f21667d));
        this.f21665b = iM;
        int i10 = this.f21664a;
        long j10 = this.f21666c;
        this.f21668e = O0.n.d((((long) ((i10 - ((int) (j10 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM - ((int) (j10 & 4294967295L))) / 2))));
    }

    public final int A0() {
        return this.f21665b;
    }

    public int B0() {
        return (int) (this.f21666c & 4294967295L);
    }

    protected final long C0() {
        return this.f21666c;
    }

    public int E0() {
        return (int) (this.f21666c >> 32);
    }

    protected final long F0() {
        return this.f21667d;
    }

    public final int H0() {
        return this.f21664a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K0(long j10, float f10, C3406c c3406c) {
        P0(j10, f10, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void P0(long j10, float f10, Function1 function1);

    protected final void R0(long j10) {
        if (O0.r.e(this.f21666c, j10)) {
            return;
        }
        this.f21666c = j10;
        J0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S0(long j10) {
        if (O0.b.f(this.f21667d, j10)) {
            return;
        }
        this.f21667d = j10;
        J0();
    }

    protected final long z0() {
        return this.f21668e;
    }
}
