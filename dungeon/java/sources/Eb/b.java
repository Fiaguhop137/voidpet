package Eb;

import Ad.v;
import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2757a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f2758b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f2759c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f2760d;

    static {
        List listO = CollectionsKt.o('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listO, 10));
        int i10 = 0;
        for (Object obj : listO) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.v();
            }
            Character ch = (Character) obj;
            ch.charValue();
            arrayList.add(v.a(ch, Integer.valueOf(i10)));
            i10 = i11;
        }
        f2760d = N.r(arrayList);
    }

    private b() {
    }

    private final Bitmap b(int i10, int i11, int i12, int i13, float[][] fArr, boolean z10) {
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        int[] iArr = new int[i14 * i15];
        boolean z11 = (z10 && f2758b.containsKey(Integer.valueOf(i14 * i16))) ? false : true;
        double[] dArrH = h(z11, i14, i16);
        boolean z12 = (z10 && f2759c.containsKey(Integer.valueOf(i15 * i17))) ? false : true;
        double[] dArrI = i(z12, i15, i17);
        int i18 = 0;
        while (i18 < i15) {
            int i19 = 0;
            while (i19 < i14) {
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                int i20 = 0;
                while (i20 < i17) {
                    float f13 = f12;
                    float f14 = f11;
                    float f15 = f10;
                    int i21 = 0;
                    while (i21 < i16) {
                        double dJ = j(dArrH, z11, i21, i16, i19, i14);
                        int i22 = i15;
                        int i23 = i17;
                        double[] dArr = dArrH;
                        double[] dArr2 = dArrI;
                        int i24 = i21;
                        int i25 = i20;
                        boolean z13 = z11;
                        boolean z14 = z12;
                        int i26 = i19;
                        int i27 = i18;
                        float fJ = (float) (dJ * j(dArr2, z14, i25, i23, i27, i22));
                        float[] fArr2 = fArr[(i25 * i12) + i24];
                        f15 += fArr2[0] * fJ;
                        f13 += fArr2[1] * fJ;
                        f14 += fArr2[2] * fJ;
                        int i28 = i24 + 1;
                        i15 = i22;
                        i14 = i14;
                        dArrI = dArr2;
                        i18 = i27;
                        z11 = z13;
                        i19 = i26;
                        i16 = i12;
                        z12 = z14;
                        i20 = i25;
                        i21 = i28;
                        dArrH = dArr;
                        i17 = i13;
                    }
                    i15 = i15;
                    i14 = i14;
                    f10 = f15;
                    z11 = z11;
                    i19 = i19;
                    f11 = f14;
                    f12 = f13;
                    i16 = i12;
                    z12 = z12;
                    i20++;
                    dArrH = dArrH;
                    i17 = i13;
                }
                int i29 = i15;
                int i30 = i14;
                double[] dArr3 = dArrH;
                boolean z15 = z12;
                int i31 = i19;
                iArr[(i30 * i18) + i31] = Color.rgb(k(f10), k(f12), k(f11));
                int i32 = i31 + 1;
                i15 = i29;
                i14 = i30;
                z12 = z15;
                z11 = z11;
                i16 = i12;
                i19 = i32;
                dArrH = dArr3;
                i17 = i13;
            }
            i18++;
            i15 = i15;
            i14 = i14;
            dArrH = dArrH;
            i16 = i12;
            i17 = i13;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i14, i15, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap d(b bVar, String str, int i10, int i11, float f10, boolean z10, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i12 & 16) != 0) {
            z10 = true;
        }
        return bVar.c(str, i10, i11, f11, z10);
    }

    private final int e(String str, int i10, int i11) {
        int i12 = 0;
        while (i10 < i11) {
            Integer num = (Integer) f2760d.get(Character.valueOf(str.charAt(i10)));
            int iIntValue = num != null ? num.intValue() : -1;
            if (iIntValue != -1) {
                i12 = (i12 * 83) + iIntValue;
            }
            i10++;
        }
        return i12;
    }

    private final float[] f(int i10, float f10) {
        return new float[]{l(((i10 / 361) - 9) / 9.0f) * f10, l((((i10 / 19) % 19) - 9) / 9.0f) * f10, l(((i10 % 19) - 9) / 9.0f) * f10};
    }

    private final float[] g(int i10) {
        e eVar = e.f2762a;
        return new float[]{eVar.c(i10 >> 16), eVar.c((i10 >> 8) & 255), eVar.c(i10 & 255)};
    }

    private final double[] h(boolean z10, int i10, int i11) {
        if (!z10) {
            Object obj = f2758b.get(Integer.valueOf(i10 * i11));
            Intrinsics.c(obj);
            return (double[]) obj;
        }
        int i12 = i10 * i11;
        double[] dArr = new double[i12];
        f2758b.put(Integer.valueOf(i12), dArr);
        return dArr;
    }

    private final double[] i(boolean z10, int i10, int i11) {
        if (!z10) {
            Object obj = f2759c.get(Integer.valueOf(i10 * i11));
            Intrinsics.c(obj);
            return (double[]) obj;
        }
        int i12 = i10 * i11;
        double[] dArr = new double[i12];
        f2759c.put(Integer.valueOf(i12), dArr);
        return dArr;
    }

    private final double j(double[] dArr, boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            dArr[(i11 * i12) + i10] = Math.cos(((((double) i12) * 3.141592653589793d) * ((double) i10)) / ((double) i13));
        }
        return dArr[i10 + (i11 * i12)];
    }

    private final int k(float f10) {
        float fPow;
        float f11;
        float fL = kotlin.ranges.e.l(f10, 0.0f, 1.0f);
        if (fL <= 0.0031308f) {
            fPow = fL * 12.92f;
            f11 = 255.0f;
        } else {
            fPow = (((float) Math.pow(fL, 0.41666666f)) * 1.055f) - 0.055f;
            f11 = 255;
        }
        return (int) ((fPow * f11) + 0.5f);
    }

    private final float l(float f10) {
        return Math.copySign((float) Math.pow(f10, 2.0f), f10);
    }

    public final void a() {
        f2758b.clear();
        f2759c.clear();
    }

    public final Bitmap c(String str, int i10, int i11, float f10, boolean z10) {
        float[] fArrF;
        if (str == null || str.length() < 6) {
            return null;
        }
        int iE = e(str, 0, 1);
        int i12 = (iE % 9) + 1;
        int i13 = (iE / 9) + 1;
        if (str.length() != (i12 * 2 * i13) + 4) {
            return null;
        }
        float fE = (e(str, 1, 2) + 1) / 166.0f;
        int i14 = i12 * i13;
        float[][] fArr = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == 0) {
                b bVar = f2757a;
                fArrF = bVar.g(bVar.e(str, 2, 6));
            } else {
                int i16 = i15 * 2;
                b bVar2 = f2757a;
                fArrF = bVar2.f(bVar2.e(str, i16 + 4, i16 + 6), fE * f10);
            }
            fArr[i15] = fArrF;
        }
        return b(i10, i11, i12, i13, fArr, z10);
    }
}
