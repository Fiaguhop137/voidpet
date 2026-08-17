package p359u;

import kotlin.collections.AbstractC3952n;

/* JADX INFO: renamed from: u.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4220t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[][] f54919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54920b = true;

    /* JADX INFO: renamed from: u.t$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f54921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f54922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f54923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f54924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f54925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f54926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f54927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float[] f54928h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f54929i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float f54930j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float f54931k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f54932l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f54933m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f54934n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final float f54935o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f54936p;

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f54921a = f10;
            this.f54922b = f11;
            this.f54923c = f12;
            this.f54924d = f13;
            this.f54925e = f14;
            this.f54926f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            float f18 = z11 ? -1.0f : 1.0f;
            this.f54931k = f18;
            float f19 = 1 / (f11 - f10);
            this.f54929i = f19;
            this.f54928h = new float[101];
            boolean z12 = i10 == 3;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.f54927g = fHypot;
                this.f54930j = fHypot * f19;
                this.f54935o = f16 * f19;
                this.f54936p = f17 * f19;
                this.f54932l = Float.NaN;
                this.f54933m = Float.NaN;
            } else {
                this.f54932l = f16 * f18;
                this.f54933m = f17 * (-f18);
                this.f54935o = z11 ? f14 : f12;
                this.f54936p = z11 ? f13 : f15;
                a(f12, f13, f14, f15);
                this.f54930j = this.f54927g * f19;
                z10 = z12;
            }
            this.f54934n = z10;
        }

        public final void a(float f10, float f11, float f12, float f13) {
            float f14;
            float f15;
            float fHypot;
            float f16 = f12 - f10;
            float f17 = f11 - f13;
            float[] fArr = AbstractC4221u.f54942a;
            int length = fArr.length - 1;
            float f18 = length;
            float[] fArr2 = this.f54928h;
            if (1 <= length) {
                float f19 = f17;
                int i10 = 1;
                fHypot = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    f15 = 0.0f;
                    double radians = (float) Math.toRadians((((double) i10) * 90.0d) / ((double) length));
                    float fSin = ((float) Math.sin(radians)) * f16;
                    float fCos = ((float) Math.cos(radians)) * f17;
                    f14 = f18;
                    fHypot += (float) Math.hypot(fSin - f20, fCos - f19);
                    fArr[i10] = fHypot;
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    f19 = fCos;
                    f18 = f14;
                    f20 = fSin;
                }
            } else {
                f14 = f18;
                f15 = 0.0f;
                fHypot = 0.0f;
            }
            this.f54927g = fHypot;
            if (1 <= length) {
                int i11 = 1;
                while (true) {
                    fArr[i11] = fArr[i11] / fHypot;
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                float f21 = i12 / 100.0f;
                int iG = AbstractC3952n.g(fArr, f21, 0, 0, 6, null);
                if (iG >= 0) {
                    fArr2[i12] = iG / f14;
                } else {
                    if (iG == -1) {
                        fArr2[i12] = f15;
                    } else {
                        int i13 = -iG;
                        int i14 = i13 - 2;
                        float f22 = i14;
                        float f23 = fArr[i14];
                        fArr2[i12] = (f22 + ((f21 - f23) / (fArr[i13 - 1] - f23))) / f14;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public C4220t(int[] iArr, float[] fArr, float[][] fArr2) {
        int i10;
        int i11 = 1;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i12 = 1;
        int i13 = 1;
        int i14 = 0;
        while (i14 < length) {
            int i15 = iArr[i14];
            int i16 = 3;
            if (i15 == 0) {
                i10 = i16;
            } else if (i15 == i11) {
                i12 = i11;
                i10 = i12;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        i16 = 4;
                        if (i15 != 4) {
                            i16 = 5;
                            if (i15 != 5) {
                                i10 = i13;
                            } else {
                                i10 = i16;
                            }
                        } else {
                            i10 = i16;
                        }
                    } else {
                        if (i12 != i11) {
                            i12 = i11;
                        }
                        i10 = i12;
                    }
                }
                i12 = 2;
                i10 = i12;
            }
            float[] fArr3 = fArr2[i14];
            int i17 = i14 + 1;
            float[] fArr4 = fArr2[i17];
            float f10 = fArr[i14];
            float f11 = fArr[i17];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18 * 2;
                int i20 = i18;
                int i21 = i19 + 1;
                aVarArr2[i20] = new a(i10, f10, f11, fArr3[i19], fArr3[i21], fArr4[i19], fArr4[i21]);
                i18 = i20 + 1;
            }
            aVarArr[i14] = aVarArr2;
            i14 = i17;
            i13 = i10;
            i11 = 1;
        }
        this.f54919a = aVarArr;
    }
}
