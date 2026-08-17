package O2;

import U1.AbstractC1477t;
import U1.S;
import p380v2.F;
import p380v2.J;
import p380v2.K;

/* JADX INFO: loaded from: classes.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f8352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f8353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8357f;

    private h(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f8352a = jArr;
        this.f8353b = jArr2;
        this.f8354c = j10;
        this.f8355d = j11;
        this.f8356e = j12;
        this.f8357f = i10;
    }

    public static h a(long j10, long j11, F.a aVar, U1.F f10) {
        int iL;
        f10.b0(6);
        int iU = f10.u();
        long j12 = j11 + ((long) aVar.f55964c);
        long jMax = ((long) iU) + j12;
        int iU2 = f10.u();
        if (iU2 <= 0) {
            return null;
        }
        long jZ0 = S.Z0((((long) iU2) * ((long) aVar.f55968g)) - 1, aVar.f55965d);
        int iT = f10.T();
        int iT2 = f10.T();
        int iT3 = f10.T();
        f10.b0(2);
        int i10 = iT2;
        long[] jArr = new long[iT];
        long[] jArr2 = new long[iT];
        int i11 = 0;
        long j13 = j11 + ((long) aVar.f55964c);
        while (i11 < iT) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i11] = (((long) i11) * jZ0) / ((long) iT);
            jArr3[i11] = j13;
            if (iT3 == 1) {
                iL = f10.L();
            } else if (iT3 == 2) {
                iL = f10.T();
            } else if (iT3 == 3) {
                iL = f10.O();
            } else {
                if (iT3 != 4) {
                    return null;
                }
                iL = f10.P();
            }
            int i12 = i11;
            int i13 = i10;
            j13 += ((long) iL) * ((long) i13);
            i10 = i13;
            i11 = i12 + 1;
            iT = iT;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j10 != -1 && j10 != jMax) {
            AbstractC1477t.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jMax);
        }
        if (jMax != j13) {
            AbstractC1477t.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j13 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j13);
        }
        return new h(jArr6, jArr5, jZ0, j12, jMax, aVar.f55967f);
    }

    @Override // O2.g
    public long c(long j10) {
        return this.f8352a[S.h(this.f8353b, j10, true, true)];
    }

    @Override // O2.g
    public long d() {
        return this.f8355d;
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        int iH = S.h(this.f8352a, j10, true, true);
        K k10 = new K(this.f8352a[iH], this.f8353b[iH]);
        if (k10.f55975a >= j10 || iH == this.f8352a.length - 1) {
            return new J.a(k10);
        }
        int i10 = iH + 1;
        return new J.a(k10, new K(this.f8352a[i10], this.f8353b[i10]));
    }

    @Override // O2.g
    public long h() {
        return this.f8356e;
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // O2.g
    public int l() {
        return this.f8357f;
    }

    @Override // p380v2.J
    public long m() {
        return this.f8354c;
    }
}
