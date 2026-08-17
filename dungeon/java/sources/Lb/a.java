package Lb;

import Ad.x;
import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6587a = new a();

    /* JADX INFO: renamed from: Lb.a$a, reason: collision with other inner class name */
    private static final class C0120a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float[] f6588a;

        public C0120a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                for (int i14 = i12 > 0 ? 0 : 1; i14 * i11 < (i11 - i12) * i10; i14++) {
                    i13++;
                }
                i12++;
            }
            this.f6588a = new float[i13];
        }

        public final int a(byte[] hash, int i10, int i11, float f10) {
            Intrinsics.checkNotNullParameter(hash, "hash");
            int length = this.f6588a.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f6588a[i12] = ((((hash[(i11 >> 1) + i10] >> ((i11 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f10;
                i11++;
            }
            return i11;
        }

        public final float[] b() {
            return this.f6588a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f6591c;

        public b(int i10, int i11, byte[] rgba) {
            Intrinsics.checkNotNullParameter(rgba, "rgba");
            this.f6589a = i10;
            this.f6590b = i11;
            this.f6591c = rgba;
        }

        public final int a() {
            return this.f6590b;
        }

        public final byte[] b() {
            return this.f6591c;
        }

        public final int c() {
            return this.f6589a;
        }
    }

    private a() {
    }

    public final float a(byte[] hash) {
        int i10;
        Intrinsics.checkNotNullParameter(hash, "hash");
        byte b10 = hash[3];
        boolean z10 = (hash[2] & 128) != 0;
        boolean z11 = (hash[4] & 128) != 0;
        int i11 = 5;
        if (z11) {
            i10 = z10 ? 5 : 7;
        } else {
            i10 = b10 & 7;
        }
        if (z11) {
            i11 = b10 & 7;
        } else if (!z10) {
            i11 = 7;
        }
        return i10 / i11;
    }

    public final Bitmap b(byte[] hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        b bVarC = c(hash);
        int[] iArr = new int[bVarC.c() * bVarC.a()];
        byte[] bArrB = bVarC.b();
        ArrayList arrayList = new ArrayList(bArrB.length);
        int i10 = 0;
        for (byte b10 : bArrB) {
            arrayList.add(Integer.valueOf(x.g(b10) & 255));
        }
        int iC = Hd.c.c(0, arrayList.size() - 1, 4);
        if (iC >= 0) {
            while (true) {
                iArr[i10 / 4] = Color.argb(((Number) arrayList.get(i10 + 3)).intValue(), ((Number) arrayList.get(i10)).intValue(), ((Number) arrayList.get(i10 + 1)).intValue(), ((Number) arrayList.get(i10 + 2)).intValue());
                if (i10 == iC) {
                    break;
                }
                i10 += 4;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, bVarC.c(), bVarC.a(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final b c(byte[] hash) {
        int i10;
        C0120a c0120a;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(hash, "hash");
        int i14 = (hash[0] & 255) | ((hash[1] & 255) << 8) | ((hash[2] & 255) << 16);
        int i15 = (hash[3] & 255) | ((hash[4] & 255) << 8);
        float f10 = (i14 & 63) / 63.0f;
        float f11 = 1.0f;
        float f12 = (((i14 >> 6) & 63) / 31.5f) - 1.0f;
        float f13 = (((i14 >> 12) & 63) / 31.5f) - 1.0f;
        float f14 = ((i14 >> 18) & 31) / 31.0f;
        boolean z10 = (i14 >> 23) != 0;
        float f15 = ((i15 >> 3) & 63) / 63.0f;
        float f16 = ((i15 >> 9) & 63) / 63.0f;
        boolean z11 = (i15 >> 15) != 0;
        int i16 = 7;
        if (z11) {
            i10 = z10 ? 5 : 7;
        } else {
            i10 = i15 & 7;
        }
        int iMax = Math.max(3, i10);
        if (z11) {
            i16 = 7 & i15;
        } else if (z10) {
            i16 = 5;
        }
        int iMax2 = Math.max(3, i16);
        float f17 = z10 ? (hash[5] & 15) / 15.0f : 1.0f;
        float f18 = ((hash[5] >> 4) & 15) / 15.0f;
        int i17 = z10 ? 6 : 5;
        C0120a c0120a2 = new C0120a(iMax, iMax2);
        C0120a c0120a3 = new C0120a(3, 3);
        boolean z12 = z10;
        C0120a c0120a4 = new C0120a(3, 3);
        int iA = c0120a4.a(hash, i17, c0120a3.a(hash, i17, c0120a2.a(hash, i17, 0, f14), f15 * 1.25f), f16 * 1.25f);
        float[] fArrB = null;
        if (z12) {
            c0120a = new C0120a(5, 5);
            c0120a.a(hash, i17, iA, f18);
        } else {
            c0120a = null;
        }
        float[] fArrB2 = c0120a2.b();
        float[] fArrB3 = c0120a3.b();
        float[] fArrB4 = c0120a4.b();
        if (z12) {
            Intrinsics.c(c0120a);
            fArrB = c0120a.b();
        }
        float fA = a(hash);
        int iRound = Math.round(fA > f11 ? 32.0f : fA * 32.0f);
        int iRound2 = Math.round(fA > f11 ? 32.0f / fA : 32.0f);
        byte[] bArr = new byte[iRound * iRound2 * 4];
        int iMax3 = Math.max(iMax, z12 ? 5 : 3);
        int iMax4 = Math.max(iMax2, z12 ? 5 : 3);
        float[] fArr = new float[iMax3];
        float[] fArr2 = new float[iMax4];
        int i18 = 0;
        int i19 = 0;
        while (i18 < iRound2) {
            float[] fArr3 = fArrB4;
            int i20 = 0;
            while (i20 < iRound) {
                float[] fArr4 = fArrB2;
                int i21 = 0;
                while (i21 < iMax3) {
                    fArr[i21] = (float) Math.cos((3.141592653589793d / ((double) iRound)) * ((double) (i20 + 0.5f)) * ((double) i21));
                    i21++;
                    f10 = f10;
                    iMax = iMax;
                }
                int i22 = iMax;
                float f19 = f10;
                int i23 = 0;
                while (i23 < iMax4) {
                    fArr2[i23] = (float) Math.cos((3.141592653589793d / ((double) iRound2)) * ((double) (i18 + 0.5f)) * ((double) i23));
                    i23++;
                    i20 = i20;
                    i18 = i18;
                }
                int i24 = i18;
                int i25 = i20;
                float f20 = f19;
                int i26 = 0;
                int i27 = 0;
                while (i26 < iMax2) {
                    float f21 = fArr2[i26] * 2.0f;
                    int i28 = i26 > 0 ? 0 : 1;
                    int i29 = i26;
                    while (true) {
                        i13 = i27;
                        if (i28 * iMax2 < i22 * (iMax2 - i29)) {
                            f20 += fArr4[i13] * fArr[i28] * f21;
                            i28++;
                            i27 = i13 + 1;
                        }
                    }
                    i26 = i29 + 1;
                    i27 = i13;
                }
                float f22 = f12;
                float f23 = f13;
                int i30 = 0;
                int i31 = 0;
                while (i30 < 3) {
                    float f24 = fArr2[i30] * 2.0f;
                    int i32 = i30 > 0 ? 0 : 1;
                    while (true) {
                        i12 = i30;
                        if (i32 < 3 - i12) {
                            float f25 = fArr[i32] * f24;
                            f22 += fArrB3[i31] * f25;
                            f23 += fArr3[i31] * f25;
                            i32++;
                            i31++;
                            i30 = i12;
                        }
                    }
                    i30 = i12 + 1;
                }
                float f26 = f17;
                if (z12) {
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < 5) {
                        float f27 = fArr2[i33] * 2.0f;
                        int i35 = i33 > 0 ? 0 : 1;
                        while (true) {
                            i11 = i33;
                            if (i35 < 5 - i11) {
                                Intrinsics.c(fArrB);
                                f26 += fArrB[i34] * fArr[i35] * f27;
                                i35++;
                                i34++;
                                i33 = i11;
                            }
                        }
                        i33 = i11 + 1;
                    }
                }
                float f28 = f20 - (f22 * 0.6666667f);
                float f29 = (((f20 * 3.0f) - f28) + f23) / 2.0f;
                bArr[i19] = (byte) Math.max(0, Math.round(Math.min(f11, f29) * 255.0f));
                bArr[i19 + 1] = (byte) Math.max(0, Math.round(Math.min(1.0f, f29 - f23) * 255.0f));
                bArr[i19 + 2] = (byte) Math.max(0, Math.round(Math.min(1.0f, f28) * 255.0f));
                bArr[i19 + 3] = (byte) Math.max(0, Math.round(Math.min(1.0f, f26) * 255.0f));
                i20 = i25 + 1;
                i19 += 4;
                f11 = 1.0f;
                fArrB2 = fArr4;
                f10 = f19;
                iMax = i22;
                i18 = i24;
            }
            i18++;
            fArrB4 = fArr3;
            fArrB2 = fArrB2;
            f10 = f10;
        }
        return new b(iRound, iRound2, bArr);
    }
}
