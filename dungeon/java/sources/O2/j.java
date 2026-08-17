package O2;

import U1.AbstractC1459a;
import U1.S;
import p380v2.F;
import p380v2.J;
import p380v2.K;

/* JADX INFO: loaded from: classes.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f8369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f8370g;

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f8364a = j10;
        this.f8365b = i10;
        this.f8366c = j11;
        this.f8367d = i11;
        this.f8368e = j12;
        this.f8370g = jArr;
        this.f8369f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static j a(i iVar, long j10) {
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        F.a aVar = iVar.f8358a;
        return new j(j10, aVar.f55964c, jA, aVar.f55967f, iVar.f8360c, iVar.f8363f);
    }

    private long b(int i10) {
        return (this.f8366c * ((long) i10)) / 100;
    }

    @Override // O2.g
    public long c(long j10) {
        long j11 = j10 - this.f8364a;
        if (!i() || j11 <= this.f8365b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC1459a.i(this.f8370g);
        double d10 = (j11 * 256.0d) / this.f8368e;
        int iH = S.h(jArr, (long) d10, true, true);
        long jB = b(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jB2 = b(i10);
        long j13 = iH == 99 ? 256L : jArr[i10];
        return jB + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jB2 - jB));
    }

    @Override // O2.g
    public long d() {
        return this.f8364a + ((long) this.f8365b);
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        if (!i()) {
            return new J.a(new K(0L, this.f8364a + ((long) this.f8365b)));
        }
        long jP = S.p(j10, 0L, this.f8366c);
        double d10 = (jP * 100.0d) / this.f8366c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) AbstractC1459a.i(this.f8370g);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new J.a(new K(jP, this.f8364a + S.p(Math.round((d11 / 256.0d) * this.f8368e), this.f8365b, this.f8368e - 1)));
    }

    @Override // O2.g
    public long h() {
        return this.f8369f;
    }

    @Override // p380v2.J
    public boolean i() {
        return this.f8370g != null;
    }

    @Override // O2.g
    public int l() {
        return this.f8367d;
    }

    @Override // p380v2.J
    public long m() {
        return this.f8366c;
    }
}
