package A0;

import Md.o;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f107a = new long[192];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f108b = new long[192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f109c;

    private final void h(int i10, int i11, long[] jArr) {
        int iMax = Math.max(i10 * 2, i11 + 3);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.f107a = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.f108b, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
        this.f108b = jArrCopyOf2;
    }

    private final void k(long j10, int i10, int i11) {
        int i12;
        char c10;
        char c11;
        long[] jArr = this.f107a;
        long[] jArr2 = this.f108b;
        int iC = c();
        jArr2[0] = j10;
        int i13 = 1;
        while (i13 > 0) {
            i13--;
            long j11 = jArr2[i13];
            int i14 = 67108863;
            int i15 = ((int) j11) & 67108863;
            char c12 = 26;
            int i16 = ((int) (j11 >> 26)) & 67108863;
            char c13 = '4';
            char c14 = 511;
            int i17 = ((int) (j11 >> 52)) & 511;
            int i18 = i17 == 511 ? iC : i17 + i16;
            if (i16 < 0) {
                return;
            }
            while (i16 < jArr.length - 2 && i16 < i18) {
                int i19 = i16 + 2;
                long j12 = jArr[i19];
                int i20 = i14;
                char c15 = c12;
                if ((((int) (j12 >> c15)) & i20) == i15) {
                    long j13 = jArr[i16];
                    int i21 = i16 + 1;
                    c10 = c13;
                    long j14 = jArr[i21];
                    i12 = i15;
                    jArr[i16] = (((long) (((int) j13) + i11)) & 4294967295L) | (((long) (((int) (j13 >> 32)) + i10)) << 32);
                    jArr[i21] = (((long) (((int) j14) + i11)) & 4294967295L) | (((long) (((int) (j14 >> 32)) + i10)) << 32);
                    jArr[i19] = 2305843009213693952L | j12;
                    c11 = 511;
                    if ((((int) (j12 >> c10)) & 511) > 0) {
                        jArr2[i13] = (((long) ((i16 + 3) & i20)) << c15) | ((-4503599560261633L) & j12);
                        i13++;
                    }
                } else {
                    i12 = i15;
                    c10 = c13;
                    c11 = c14;
                }
                i16 += 3;
                i14 = i20;
                c12 = c15;
                c14 = c11;
                c13 = c10;
                i15 = i12;
            }
        }
    }

    public final void a() {
        long[] jArr = this.f107a;
        int i10 = this.f109c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            jArr[i12] = jArr[i12] & (-2305843009213693953L);
        }
    }

    public final void b() {
        long[] jArr = this.f107a;
        int i10 = this.f109c;
        long[] jArr2 = this.f108b;
        int i11 = 0;
        for (int i12 = 0; i12 < jArr.length - 2 && i11 < jArr2.length - 2 && i12 < i10; i12 += 3) {
            int i13 = i12 + 2;
            if (jArr[i13] != 2305843009213693951L) {
                jArr2[i11] = jArr[i12];
                jArr2[i11 + 1] = jArr[i12 + 1];
                jArr2[i11 + 2] = jArr[i13];
                i11 += 3;
            }
        }
        this.f109c = i11;
        this.f107a = jArr2;
        this.f108b = jArr;
    }

    public final int c() {
        return this.f109c / 3;
    }

    public final void d(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        long[] jArr = this.f107a;
        int i16 = this.f109c;
        int i17 = i16 + 3;
        this.f109c = i17;
        int length = jArr.length;
        if (length <= i17) {
            h(length, i16, jArr);
        }
        long[] jArr2 = this.f107a;
        jArr2[i16] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        jArr2[i16 + 1] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i18) << 26) | ((long) (i10 & 67108863));
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j10 = jArr2[i20];
            if ((((int) j10) & 67108863) == i18) {
                jArr2[i20] = (j10 & (-2301339409586323457L)) | (((long) ((i16 - i19) & 511)) << 52);
                return;
            }
        }
    }

    public final void e(int i10) {
        int i11 = i10 & 67108863;
        long[] jArr = this.f107a;
        int i12 = this.f109c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & 67108863) == i11) {
                jArr[i14] = 2305843009213693952L | j10;
                return;
            }
        }
    }

    public final boolean f(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & 67108863;
        long[] jArr = this.f107a;
        int i16 = this.f109c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & 67108863) == i15) {
                long j11 = jArr[i17];
                jArr[i17] = (((long) i12) & 4294967295L) | (((long) i11) << 32);
                int i19 = i17;
                jArr[i17 + 1] = (((long) i14) & 4294967295L) | (((long) i13) << 32);
                jArr[i18] = 2305843009213693952L | j10;
                int i20 = i11 - ((int) (j11 >> 32));
                int i21 = i12 - ((int) j11);
                if ((i20 != 0) | (i21 != 0)) {
                    k(((-4503599560261633L) & j10) | (((long) ((i19 + 3) & 67108863)) << 26), i20, i21);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i10) {
        int i11 = i10 & 67108863;
        long[] jArr = this.f107a;
        int i12 = this.f109c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            if ((((int) jArr[i14]) & 67108863) == i11) {
                jArr[i13] = -1;
                jArr[i13 + 1] = -1;
                jArr[i14] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean i(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & 67108863;
        long[] jArr = this.f107a;
        int i16 = this.f109c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & 67108863) == i15) {
                jArr[i17] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
                jArr[i17 + 1] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
                jArr[i18] = 2305843009213693952L | j10;
                return true;
            }
        }
        return false;
    }

    public final boolean j(int i10, boolean z10, boolean z11) {
        int i11 = i10 & 67108863;
        long[] jArr = this.f107a;
        int i12 = this.f109c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & 67108863) == i11) {
                jArr[i14] = ((z10 ? 1L : 0L) * 4611686018427387904L) | (4611686018427387903L & j10) | ((z11 ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean l(int i10, o oVar) {
        int i11 = i10 & 67108863;
        long[] jArr = this.f107a;
        int i12 = this.f109c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j10 = jArr[i13];
                long j11 = jArr[i13 + 1];
                oVar.c(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return true;
            }
        }
        return false;
    }
}
