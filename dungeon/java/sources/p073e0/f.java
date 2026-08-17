package p073e0;

import O0.d;
import O0.t;
import androidx.compose.ui.graphics.c;
import p019b0.e;
import p019b0.k;
import p019b0.l;
import p037c0.AbstractC2071a0;
import p037c0.AbstractC2077d0;
import p037c0.P;
import p037c0.o0;

/* JADX INFO: loaded from: classes.dex */
public interface f extends d {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final a f40217x1 = a.f40218a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40218a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f40219b = c.f21453a.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f40220c = AbstractC2077d0.f26711a.a();

        private a() {
        }

        public final int a() {
            return f40219b;
        }

        public final int b() {
            return f40220c;
        }
    }

    private default long X0(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    static /* synthetic */ void c1(f fVar, long j10, long j11, long j12, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i11 & 2) != 0 ? e.f25805b.c() : j11;
        fVar.L0(j10, jC, (i11 & 4) != 0 ? fVar.X0(fVar.D(), jC) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f40222a : gVar, (i11 & 32) != 0 ? null : abstractC2071a0, (i11 & 64) != 0 ? f40217x1.a() : i10);
    }

    static /* synthetic */ void d1(f fVar, P p10, long j10, long j11, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i11 & 2) != 0 ? e.f25805b.c() : j10;
        fVar.j0(p10, jC, (i11 & 4) != 0 ? fVar.X0(fVar.D(), jC) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f40222a : gVar, (i11 & 32) != 0 ? null : abstractC2071a0, (i11 & 64) != 0 ? f40217x1.a() : i10);
    }

    static /* synthetic */ void s1(f fVar, long j10, float f10, long j11, float f11, g gVar, AbstractC2071a0 abstractC2071a0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i11 & 2) != 0) {
            f10 = k.h(fVar.D()) / 2.0f;
        }
        fVar.u0(j10, f10, (i11 & 4) != 0 ? fVar.i1() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? j.f40222a : gVar, (i11 & 32) != 0 ? null : abstractC2071a0, (i11 & 64) != 0 ? f40217x1.a() : i10);
    }

    default long D() {
        return f1().D();
    }

    void L0(long j10, long j11, long j12, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10);

    void M0(long j10, long j11, long j12, long j13, g gVar, float f10, AbstractC2071a0 abstractC2071a0, int i10);

    void Q0(P p10, long j10, long j11, long j12, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10);

    void U(o0 o0Var, long j10, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10);

    d f1();

    t getLayoutDirection();

    default long i1() {
        return l.a(f1().D());
    }

    void j0(P p10, long j10, long j11, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10);

    void m1(o0 o0Var, P p10, float f10, g gVar, AbstractC2071a0 abstractC2071a0, int i10);

    void u0(long j10, float f10, long j11, float f11, g gVar, AbstractC2071a0 abstractC2071a0, int i10);
}
