package S1;

import U1.AbstractC1459a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f11466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f11469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f11470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f11471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f11473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f11475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f11482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f11484w;

    public r(int i10, int i11, float f10, float f11, int i12) {
        this.f11462a = i10;
        this.f11463b = i11;
        this.f11464c = f10;
        this.f11465d = f11;
        this.f11466e = i10 / i12;
        this.f11467f = i10 / 400;
        int i13 = i10 / 65;
        this.f11468g = i13;
        int i14 = i13 * 2;
        this.f11469h = i14;
        this.f11470i = new short[i14];
        this.f11471j = new short[i14 * i11];
        this.f11473l = new short[i14 * i11];
        this.f11475n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f11474m == i10) {
            return;
        }
        int i13 = this.f11462a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f11476o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f11477p;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f11478q;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f11473l = f(this.f11473l, this.f11474m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f11463b;
                    if (i16 < i17) {
                        this.f11473l[(this.f11474m * i17) + i16] = n(this.f11475n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f11478q++;
                this.f11474m++;
            }
            int i18 = i11 + 1;
            this.f11477p = i18;
            if (i18 == j11) {
                this.f11477p = 0;
                AbstractC1459a.g(((long) i12) == j10);
                this.f11478q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        r rVar;
        double d11;
        int i10 = this.f11472k;
        if (i10 < this.f11469h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f11479r > 0) {
                iM += c(iM);
                rVar = this;
                d11 = d10;
            } else {
                int iG = g(this.f11471j, iM);
                if (d10 > 1.0d) {
                    rVar = this;
                    d11 = d10;
                    iM += iG + rVar.w(this.f11471j, iM, d11, iG);
                } else {
                    rVar = this;
                    d11 = d10;
                    iM += rVar.m(rVar.f11471j, iM, d11, iG);
                }
            }
            if (rVar.f11469h + iM > i10) {
                v(iM);
                return;
            }
            d10 = d11;
        }
    }

    private int c(int i10) {
        int iMin = Math.min(this.f11469h, this.f11479r);
        d(this.f11471j, i10, iMin);
        this.f11479r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f11473l, this.f11474m, i11);
        this.f11473l = sArrF;
        int i12 = this.f11463b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f11474m * i12, i12 * i11);
        this.f11474m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f11469h / i11;
        int i13 = this.f11463b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f11470i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f11463b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f11462a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f11463b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f11467f, this.f11468g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f11470i, 0, this.f11467f / i12, this.f11468g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f11467f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f11468g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f11463b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f11470i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f11482u, this.f11483v) ? this.f11480s : iH;
        this.f11481t = this.f11482u;
        this.f11480s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f11463b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f11482u = i15 / i16;
        this.f11483v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f11484w;
            int iRound = (int) Math.round(d11);
            this.f11484w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f11484w;
            int iRound2 = (int) Math.round(d12);
            this.f11479r = iRound2;
            this.f11484w = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f11473l, this.f11474m, i13);
        this.f11473l = sArrF;
        int i14 = this.f11463b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f11474m * i14, i14 * i11);
        p(i12, this.f11463b, this.f11473l, this.f11474m + i11, sArr, i10 + i11, sArr, i10);
        this.f11474m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f11463b];
        long j12 = ((long) this.f11478q) * j10;
        int i11 = this.f11477p;
        long j13 = ((long) i11) * j11;
        long j14 = ((long) (i11 + 1)) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((((long) s10) * j15) + ((j16 - j15) * ((long) s11))) / j16);
    }

    private void o(int i10) {
        int i11 = this.f11474m - i10;
        short[] sArrF = f(this.f11475n, this.f11476o, i11);
        this.f11475n = sArrF;
        short[] sArr = this.f11473l;
        int i12 = this.f11463b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f11476o * i12, i12 * i11);
        this.f11474m = i10;
        this.f11476o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f11480s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f11481t * 3;
    }

    private void r() {
        int i10 = this.f11474m;
        float f10 = this.f11464c;
        float f11 = this.f11465d;
        double d10 = f10 / f11;
        float f12 = this.f11466e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f11471j, 0, this.f11472k);
            this.f11472k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f11475n;
        int i11 = this.f11463b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f11476o - i10) * i11);
        this.f11476o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f11472k - i10;
        short[] sArr = this.f11471j;
        int i12 = this.f11463b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f11472k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f11484w;
            int iRound = (int) Math.round(d11);
            this.f11484w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f11484w;
            int iRound2 = (int) Math.round(d12);
            this.f11479r = iRound2;
            this.f11484w = d12 - ((double) iRound2);
            i12 = i11;
        }
        short[] sArrF = f(this.f11473l, this.f11474m, i12);
        this.f11473l = sArrF;
        p(i12, this.f11463b, sArrF, this.f11474m, sArr, i10, sArr, i10 + i11);
        this.f11474m += i12;
        return i12;
    }

    public void i() {
        this.f11472k = 0;
        this.f11474m = 0;
        this.f11476o = 0;
        this.f11477p = 0;
        this.f11478q = 0;
        this.f11479r = 0;
        this.f11480s = 0;
        this.f11481t = 0;
        this.f11482u = 0;
        this.f11483v = 0;
        this.f11484w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        AbstractC1459a.g(this.f11474m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f11463b, this.f11474m);
        shortBuffer.put(this.f11473l, 0, this.f11463b * iMin);
        int i10 = this.f11474m - iMin;
        this.f11474m = i10;
        short[] sArr = this.f11473l;
        int i11 = this.f11463b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        AbstractC1459a.g(this.f11474m >= 0);
        return this.f11474m * this.f11463b * 2;
    }

    public int l() {
        return this.f11472k * this.f11463b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f11472k;
        float f10 = this.f11464c;
        float f11 = this.f11465d;
        double d10 = f10 / f11;
        double d11 = this.f11466e * f11;
        int i12 = this.f11479r;
        int i13 = this.f11474m + ((int) ((((((((double) (i11 - i12)) / d10) + ((double) i12)) + this.f11484w) + ((double) this.f11476o)) / d11) + 0.5d));
        this.f11484w = 0.0d;
        this.f11471j = f(this.f11471j, i11, (this.f11469h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f11469h;
            int i15 = this.f11463b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f11471j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f11472k += i10 * 2;
        r();
        if (this.f11474m > i13) {
            this.f11474m = Math.max(i13, 0);
        }
        this.f11472k = 0;
        this.f11479r = 0;
        this.f11476o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f11463b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f11471j, this.f11472k, i11);
        this.f11471j = sArrF;
        shortBuffer.get(sArrF, this.f11472k * this.f11463b, ((i10 * i11) * 2) / 2);
        this.f11472k += i11;
        r();
    }
}
