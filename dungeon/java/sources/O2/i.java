package O2;

import U1.S;
import p380v2.F;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.a f8358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f8363f;

    private i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f8358a = new F.a(aVar);
        this.f8359b = j10;
        this.f8360c = j11;
        this.f8363f = jArr;
        this.f8361d = i10;
        this.f8362e = i11;
    }

    public static i b(F.a aVar, U1.F f10) {
        long[] jArr;
        int i10;
        int i11;
        int iU = f10.u();
        int iP = (iU & 1) != 0 ? f10.P() : -1;
        long jN = (iU & 2) != 0 ? f10.N() : -1L;
        if ((iU & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = f10.L();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iU & 8) != 0) {
            f10.b0(4);
        }
        if (f10.a() >= 24) {
            f10.b0(21);
            int iO = f10.O();
            i11 = iO & 4095;
            i10 = (16773120 & iO) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iP, jN, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f8359b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        F.a aVar = this.f8358a;
        return S.Z0((j10 * ((long) aVar.f55968g)) - 1, aVar.f55965d);
    }
}
