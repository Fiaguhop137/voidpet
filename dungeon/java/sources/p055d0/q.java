package p055d0;

import Q0.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p037c0.AbstractC2073b0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC3219c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39608e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f39609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float[] f39610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f39611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f39612i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        float[] fArrB = AbstractC3217a.f39542b.a().b();
        o oVar = o.f39596a;
        float[] fArrL = AbstractC3220d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC3220d.e(fArrB, oVar.b().c(), oVar.e().c()));
        f39609f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f39610g = fArr;
        f39611h = AbstractC3220d.k(fArrL);
        f39612i = AbstractC3220d.k(fArr);
    }

    public q(String str, int i10) {
        super(str, AbstractC3218b.f39547a.a(), i10, null);
    }

    @Override // p055d0.AbstractC3219c
    public float c(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // p055d0.AbstractC3219c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // p055d0.AbstractC3219c
    public long h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f39612i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f39611h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19))) & 4294967295L);
    }

    @Override // p055d0.AbstractC3219c
    public float i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f39612i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f39611h;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    @Override // p055d0.AbstractC3219c
    public long j(float f10, float f11, float f12, float f13, AbstractC3219c abstractC3219c) {
        float[] fArr = f39609f;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float fA = b.a(f14);
        float fA2 = b.a(f15);
        float fA3 = b.a(f16);
        float[] fArr2 = f39610g;
        return AbstractC2073b0.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), f13, abstractC3219c);
    }
}
