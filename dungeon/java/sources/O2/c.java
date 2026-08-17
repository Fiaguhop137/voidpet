package O2;

import J2.l;
import U1.S;
import android.util.Pair;
import p380v2.J;
import p380v2.K;

/* JADX INFO: loaded from: classes.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f8326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f8327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8328c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f8326a = jArr;
        this.f8327b = jArr2;
        this.f8328c = j10 == -9223372036854775807L ? S.M0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f5722e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f5720c + lVar.f5722e[i12]);
            j12 += (long) (lVar.f5721d + lVar.f5723f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair b(long j10, long[] jArr, long[] jArr2) {
        int iH = S.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // O2.g
    public long c(long j10) {
        return S.M0(((Long) b(j10, this.f8326a, this.f8327b).second).longValue());
    }

    @Override // O2.g
    public long d() {
        return 0L;
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        Pair pairB = b(S.o1(S.p(j10, 0L, this.f8328c)), this.f8327b, this.f8326a);
        return new J.a(new K(S.M0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // O2.g
    public long h() {
        return -1L;
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // O2.g
    public int l() {
        return -2147483647;
    }

    @Override // p380v2.J
    public long m() {
        return this.f8328c;
    }
}
