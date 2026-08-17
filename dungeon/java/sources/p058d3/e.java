package p058d3;

import U1.S;
import p380v2.J;
import p380v2.K;

/* JADX INFO: loaded from: classes.dex */
final class e implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f39774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f39778e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f39774a = cVar;
        this.f39775b = i10;
        this.f39776c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f39767e);
        this.f39777d = j12;
        this.f39778e = a(j12);
    }

    private long a(long j10) {
        return S.a1(j10 * ((long) this.f39775b), 1000000L, this.f39774a.f39765c);
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        long jP = S.p((((long) this.f39774a.f39765c) * j10) / (((long) this.f39775b) * 1000000), 0L, this.f39777d - 1);
        long j11 = this.f39776c + (((long) this.f39774a.f39767e) * jP);
        long jA = a(jP);
        K k10 = new K(jA, j11);
        if (jA >= j10 || jP == this.f39777d - 1) {
            return new J.a(k10);
        }
        long j12 = jP + 1;
        return new J.a(k10, new K(a(j12), this.f39776c + (((long) this.f39774a.f39767e) * j12)));
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // p380v2.J
    public long m() {
        return this.f39778e;
    }
}
