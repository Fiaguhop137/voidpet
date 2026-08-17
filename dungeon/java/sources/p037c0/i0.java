package p037c0;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p019b0.c;
import p019b0.e;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26718b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f26719a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ i0(float[] fArr) {
        this.f26719a = fArr;
    }

    public static final /* synthetic */ i0 a(float[] fArr) {
        return new i0(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof i0) && Intrinsics.b(fArr, ((i0) obj).n());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        if (fArr.length < 16) {
            return j10;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float f19 = 1 / (((f12 * fIntBitsToFloat) + (f15 * fIntBitsToFloat2)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        return e.e((((long) Float.floatToRawIntBits((((f10 * fIntBitsToFloat) + (f13 * fIntBitsToFloat2)) + f16) * f19)) << 32) | (((long) Float.floatToRawIntBits(f19 * ((f11 * fIntBitsToFloat) + (f14 * fIntBitsToFloat2) + f17))) & 4294967295L));
    }

    public static final void g(float[] fArr, c cVar) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fB = cVar.b();
        float fD = cVar.d();
        float fC = cVar.c();
        float fA = cVar.a();
        float f19 = f12 * fB;
        float f20 = f15 * fD;
        float f21 = 1.0f / ((f19 + f20) + f18);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f10 * fB;
        float f23 = f13 * fD;
        float f24 = f21 * (f22 + f23 + f16);
        float f25 = fB * f11;
        float f26 = fD * f14;
        float f27 = f21 * (f25 + f26 + f17);
        float f28 = f15 * fA;
        float f29 = 1.0f / ((f19 + f28) + f18);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f13 * fA;
        float f31 = (f22 + f30 + f16) * f29;
        float f32 = f14 * fA;
        float f33 = f29 * (f25 + f32 + f17);
        float f34 = f12 * fC;
        float f35 = 1.0f / ((f20 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f10 * fC;
        float f37 = f35 * (f36 + f23 + f16);
        float f38 = fC * f11;
        float f39 = f35 * (f26 + f38 + f17);
        float f40 = 1.0f / ((f34 + f28) + f18);
        float f41 = (Float.floatToRawIntBits(f40) & Integer.MAX_VALUE) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f16) * f41;
        float f43 = f41 * (f38 + f32 + f17);
        cVar.i(Math.min(f24, Math.min(f31, Math.min(f37, f42))));
        cVar.k(Math.min(f27, Math.min(f33, Math.min(f39, f43))));
        cVar.j(Math.max(f24, Math.max(f31, Math.max(f37, f42))));
        cVar.h(Math.max(f27, Math.max(f33, Math.max(f39, f43))));
    }

    public static final void h(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void i(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        double d10 = ((double) f15) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f21 = -fSin;
        float f22 = (f13 * fCos) - (f14 * fSin);
        float f23 = (f13 * fSin) + (f14 * fCos);
        double d11 = ((double) f16) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f24 = -fSin2;
        float f25 = fSin * fSin2;
        float f26 = fSin * fCos2;
        float f27 = fCos * fSin2;
        float f28 = fCos * fCos2;
        float f29 = (f12 * fCos2) + (f23 * fSin2);
        float f30 = ((-f12) * fSin2) + (f23 * fCos2);
        double d12 = ((double) f17) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d12);
        float fCos3 = (float) Math.cos(d12);
        float f31 = -fSin3;
        float f32 = (f31 * fCos2) + (fCos3 * f25);
        float f33 = fCos * fCos3;
        float f34 = (f31 * f24) + (fCos3 * f26);
        float f35 = ((fCos2 * fCos3) + (f25 * fSin3)) * f18;
        float f36 = fSin3 * fCos * f18;
        float f37 = ((fCos3 * f24) + (fSin3 * f26)) * f18;
        float f38 = f32 * f19;
        float f39 = f33 * f19;
        float f40 = f34 * f19;
        float f41 = f27 * f20;
        float f42 = f21 * f20;
        float f43 = f28 * f20;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f35;
        fArr[1] = f36;
        fArr[2] = f37;
        fArr[3] = 0.0f;
        fArr[4] = f38;
        fArr[5] = f39;
        fArr[6] = f40;
        fArr[7] = 0.0f;
        fArr[8] = f41;
        fArr[9] = f42;
        fArr[10] = f43;
        fArr[11] = 0.0f;
        float f44 = -f10;
        fArr[12] = ((f35 * f44) - (f38 * f11)) + f29 + f10;
        fArr[13] = ((f36 * f44) - (f39 * f11)) + f22 + f11;
        fArr[14] = ((f44 * f37) - (f11 * f40)) + f30;
        fArr[15] = 1.0f;
    }

    public static final void j(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[4];
            float f14 = fArr[2];
            float f15 = fArr2[8];
            float f16 = fArr[3];
            float f17 = fArr2[12];
            float f18 = (f10 * f11) + (f12 * f13) + (f14 * f15) + (f16 * f17);
            float f19 = fArr2[1];
            float f20 = fArr2[5];
            float f21 = fArr2[9];
            float f22 = fArr2[13];
            float f23 = (f10 * f19) + (f12 * f20) + (f14 * f21) + (f16 * f22);
            float f24 = fArr2[2];
            float f25 = fArr2[6];
            float f26 = fArr2[10];
            float f27 = fArr2[14];
            float f28 = (f10 * f24) + (f12 * f25) + (f14 * f26) + (f16 * f27);
            float f29 = fArr2[3];
            float f30 = fArr2[7];
            float f31 = fArr2[11];
            float f32 = fArr2[15];
            float f33 = (f10 * f29) + (f12 * f30) + (f14 * f31) + (f16 * f32);
            float f34 = fArr[4];
            float f35 = fArr[5];
            float f36 = fArr[6];
            float f37 = fArr[7];
            float f38 = (f34 * f11) + (f35 * f13) + (f36 * f15) + (f37 * f17);
            float f39 = (f34 * f19) + (f35 * f20) + (f36 * f21) + (f37 * f22);
            float f40 = (f34 * f24) + (f35 * f25) + (f36 * f26) + (f37 * f27);
            float f41 = (f34 * f29) + (f35 * f30) + (f36 * f31) + (f37 * f32);
            float f42 = fArr[8];
            float f43 = fArr[9];
            float f44 = fArr[10];
            float f45 = fArr[11];
            float f46 = (f42 * f11) + (f43 * f13) + (f44 * f15) + (f45 * f17);
            float f47 = (f42 * f19) + (f43 * f20) + (f44 * f21) + (f45 * f22);
            float f48 = (f42 * f24) + (f43 * f25) + (f44 * f26) + (f45 * f27);
            float f49 = (f42 * f29) + (f43 * f30) + (f44 * f31) + (f45 * f32);
            float f50 = fArr[12];
            float f51 = fArr[13];
            float f52 = (f11 * f50) + (f13 * f51);
            float f53 = fArr[14];
            float f54 = f52 + (f15 * f53);
            float f55 = fArr[15];
            fArr[0] = f18;
            fArr[1] = f23;
            fArr[2] = f28;
            fArr[3] = f33;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f41;
            fArr[8] = f46;
            fArr[9] = f47;
            fArr[10] = f48;
            fArr[11] = f49;
            fArr[12] = f54 + (f17 * f55);
            fArr[13] = (f19 * f50) + (f20 * f51) + (f21 * f53) + (f22 * f55);
            fArr[14] = (f24 * f50) + (f25 * f51) + (f26 * f53) + (f27 * f55);
            fArr[15] = (f50 * f29) + (f51 * f30) + (f53 * f31) + (f55 * f32);
        }
    }

    public static String k(float[] fArr) {
        return StringsKt.j("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f26719a, obj);
    }

    public int hashCode() {
        return e(this.f26719a);
    }

    public final /* synthetic */ float[] n() {
        return this.f26719a;
    }

    public String toString() {
        return k(this.f26719a);
    }
}
