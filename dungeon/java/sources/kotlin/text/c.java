package kotlin.text;

import Ad.z;
import kotlin.collections.AbstractC3942d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f48498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f48499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f48500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f48501d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f48498a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f48499b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f48500c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f48501d = jArr;
    }

    private static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) z.p(z.g(j10))));
    }

    private static final int b(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return f(str2, cArr, c(bArr, i10, iArr, cArr, f(str, cArr, i11)));
    }

    private static final int c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int d(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return a((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    public static final int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return a(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
    }

    private static final int f(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.d(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String g(byte[] bArr, int i10, int i11, d format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractC3942d.f48249a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = format.c() ? f48499b : f48498a;
        d.a aVarB = format.b();
        return aVarB.i() ? j(bArr, i10, i11, aVarB, iArr) : m(bArr, i10, i11, aVarB, iArr);
    }

    public static final String h(byte[] bArr, d format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return g(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String i(byte[] bArr, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = d.f48502d.a();
        }
        return h(bArr, dVar);
    }

    private static final String j(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        return aVar.j() ? l(bArr, i10, i11, aVar, iArr) : k(bArr, i10, i11, aVar, iArr);
    }

    private static final String k(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        char[] cArr = new char[d(i11 - i10, strD.length(), strC.length(), strE.length())];
        int iB = b(bArr, i10, strC, strE, iArr, cArr, 0);
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            iB = b(bArr, i12, strC, strE, iArr, cArr, f(strD, cArr, iB));
        }
        return t.s(cArr);
    }

    private static final String l(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iC = 0;
        if (length == 0) {
            char[] cArr = new char[a(((long) i12) * 2)];
            while (i10 < i11) {
                iC = c(bArr, i10, iArr, cArr, iC);
                i10++;
            }
            return t.s(cArr);
        }
        char[] cArr2 = new char[a((((long) i12) * 3) - 1)];
        char cCharAt = aVar.d().charAt(0);
        int iC2 = c(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iC2] = cCharAt;
            iC2 = c(bArr, i13, iArr, cArr2, iC2 + 1);
        }
        return t.s(cArr2);
    }

    private static final String m(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        int i12;
        int i13;
        int iG = aVar.g();
        int iF = aVar.f();
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        String strH = aVar.h();
        int iE = e(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        char[] cArr = new char[iE];
        int i14 = i10;
        int iF2 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            if (i15 == iG) {
                cArr[iF2] = '\n';
                iF2++;
                i12 = 0;
                i13 = 0;
            } else if (i16 == iF) {
                iF2 = f(strH, cArr, iF2);
                i12 = i15;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i16;
            }
            if (i13 != 0) {
                iF2 = f(strD, cArr, iF2);
            }
            String str = strC;
            int iB = b(bArr, i14, str, strE, iArr, cArr, iF2);
            i14++;
            i16 = i13 + 1;
            iF2 = iB;
            strC = str;
            i15 = i12 + 1;
        }
        if (iF2 == iE) {
            return t.s(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
