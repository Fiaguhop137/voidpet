package p380v2;

import U1.AbstractC1459a;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final class x implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f56148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f56149b;

    public x(y yVar, long j10) {
        this.f56148a = yVar;
        this.f56149b = j10;
    }

    private K a(long j10, long j11) {
        return new K((j10 * 1000000) / ((long) this.f56148a.f56154e), this.f56149b + j11);
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        AbstractC1459a.i(this.f56148a.f56160k);
        y yVar = this.f56148a;
        y.a aVar = yVar.f56160k;
        long[] jArr = aVar.f56162a;
        long[] jArr2 = aVar.f56163b;
        int iH = S.h(jArr, yVar.i(j10), true, false);
        K kA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (kA.f55975a == j10 || iH == jArr.length - 1) {
            return new J.a(kA);
        }
        int i10 = iH + 1;
        return new J.a(kA, a(jArr[i10], jArr2[i10]));
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // p380v2.J
    public long m() {
        return this.f56148a.f();
    }
}
