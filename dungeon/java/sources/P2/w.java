package P2;

import U1.AbstractC1459a;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f8795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f8797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f8798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f8800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f8801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8802h;

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        AbstractC1459a.a(iArr.length == jArr2.length);
        AbstractC1459a.a(jArr.length == jArr2.length);
        AbstractC1459a.a(iArr2.length == jArr2.length);
        this.f8795a = tVar;
        this.f8797c = jArr;
        this.f8798d = iArr;
        this.f8799e = i10;
        this.f8800f = jArr2;
        this.f8801g = iArr2;
        this.f8802h = j10;
        this.f8796b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iH = S.h(this.f8800f, j10, true, false); iH >= 0; iH--) {
            if ((this.f8801g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = S.d(this.f8800f, j10, true, false); iD < this.f8800f.length; iD++) {
            if ((this.f8801g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }
}
