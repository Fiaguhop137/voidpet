package p037c0;

import Q0.b;
import p323s.AbstractC4108h;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static final long b(float f10, float f11, float f12, float f13, float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int iF = f(f14, f15, f16, fArr, i10);
        float f17 = (f15 - f14) * 2.0f;
        int iG = iF + g((-f17) / (((f16 - f15) * 2.0f) - f17), fArr, i10 + iF);
        float fMin = Math.min(f10, f13);
        float fMax = Math.max(f10, f13);
        for (int i11 = 0; i11 < iG; i11++) {
            float fD = d(f10, f11, f12, f13, fArr[i11]);
            fMin = Math.min(fMin, fD);
            fMax = Math.max(fMax, fD);
        }
        return AbstractC4108h.a(fMin, fMax);
    }

    public static final float c(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    private static final float d(float f10, float f11, float f12, float f13, float f14) {
        float f15 = (f13 + ((f11 - f12) * 3.0f)) - f10;
        return (((((f15 * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }

    public static final float e(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        double d10 = f10;
        double d11 = ((d10 - (((double) f11) * 2.0d)) + ((double) f12)) * 3.0d;
        double d12 = ((double) (f11 - f10)) * 3.0d;
        double d13 = ((double) (-f10)) + (((double) (f11 - f12)) * 3.0d) + ((double) f13);
        if (Math.abs(d13 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d11 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d12 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f16 = (float) ((-d10) / d12);
                f14 = f16 >= 0.0f ? f16 : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - f16) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f15;
            }
            double dSqrt = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d14 = d11 * 2.0d;
            float f17 = (float) ((dSqrt - d12) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > 1.05E-6f) {
                f18 = Float.NaN;
            }
            if (!Float.isNaN(f18)) {
                return f18;
            }
            float f19 = (float) (((-d12) - dSqrt) / d14);
            f14 = f19 >= 0.0f ? f19 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f19) > 1.05E-6f) {
                return Float.NaN;
            }
            return f15;
        }
        double d15 = d11 / d13;
        double d16 = d12 / d13;
        double d17 = d10 / d13;
        double d18 = ((d16 * 3.0d) - (d15 * d15)) / 9.0d;
        double d19 = (((((2.0d * d15) * d15) * d15) - ((9.0d * d15) * d16)) + (d17 * 27.0d)) / 54.0d;
        double d20 = d18 * d18 * d18;
        double d21 = (d19 * d19) + d20;
        double d22 = d15 / 3.0d;
        if (d21 >= 0.0d) {
            if (d21 != 0.0d) {
                double dSqrt2 = Math.sqrt(d21);
                float fA = (float) (((double) (b.a((float) ((-d19) + dSqrt2)) - b.a((float) (d19 + dSqrt2)))) - d22);
                f14 = fA >= 0.0f ? fA : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - fA) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f15;
            }
            float f20 = -b.a((float) d19);
            float f21 = (float) d22;
            float f22 = (2.0f * f20) - f21;
            float f23 = f22 < 0.0f ? 0.0f : f22;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            if (Math.abs(f23 - f22) > 1.05E-6f) {
                f23 = Float.NaN;
            }
            if (!Float.isNaN(f23)) {
                return f23;
            }
            float f24 = (-f20) - f21;
            f14 = f24 >= 0.0f ? f24 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f24) > 1.05E-6f) {
                return Float.NaN;
            }
            return f15;
        }
        double dSqrt3 = Math.sqrt(-d20);
        double d23 = (-d19) / dSqrt3;
        if (d23 < -1.0d) {
            d23 = -1.0d;
        }
        if (d23 > 1.0d) {
            d23 = 1.0d;
        }
        double dAcos = Math.acos(d23);
        double dA = b.a((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dA) - d22);
        float f25 = fCos < 0.0f ? 0.0f : fCos;
        if (f25 > 1.0f) {
            f25 = 1.0f;
        }
        if (Math.abs(f25 - fCos) > 1.05E-6f) {
            f25 = Float.NaN;
        }
        if (!Float.isNaN(f25)) {
            return f25;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dA) - d22);
        float f26 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f26 > 1.0f) {
            f26 = 1.0f;
        }
        if (Math.abs(f26 - fCos2) > 1.05E-6f) {
            f26 = Float.NaN;
        }
        if (!Float.isNaN(f26)) {
            return f26;
        }
        float fCos3 = (float) ((dA * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d22);
        f14 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f15 = f14 <= 1.0f ? f14 : 1.0f;
        if (Math.abs(f15 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f15;
    }

    private static final int f(float f10, float f11, float f12, float[] fArr, int i10) {
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            if (d11 == d12) {
                return 0;
            }
            return g((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, i10);
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        int iG = g((float) ((-(d15 + d16)) / d14), fArr, i10);
        int iG2 = iG + g((float) ((d15 - d16) / d14), fArr, i10 + iG);
        if (iG2 <= 1) {
            return iG2;
        }
        float f13 = fArr[i10];
        int i11 = i10 + 1;
        float f14 = fArr[i11];
        if (f13 <= f14) {
            return f13 == f14 ? iG2 - 1 : iG2;
        }
        fArr[i10] = f14;
        fArr[i11] = f13;
        return iG2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }
}
