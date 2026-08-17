package Z1;

import U1.AbstractC1459a;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f18606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z1 f18607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z1 f18608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z1 f18609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z1 f18610g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18612b;

    static {
        z1 z1Var = new z1(0L, 0L);
        f18606c = z1Var;
        f18607d = new z1(Long.MAX_VALUE, Long.MAX_VALUE);
        f18608e = new z1(Long.MAX_VALUE, 0L);
        f18609f = new z1(0L, Long.MAX_VALUE);
        f18610g = z1Var;
    }

    public z1(long j10, long j11) {
        AbstractC1459a.a(j10 >= 0);
        AbstractC1459a.a(j11 >= 0);
        this.f18611a = j10;
        this.f18612b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j10, long j11, long j12) {
        long j13 = this.f18611a;
        if (j13 == 0 && this.f18612b == 0) {
            return j10;
        }
        long jK1 = U1.S.k1(j10, j13, Long.MIN_VALUE);
        long jC = U1.S.c(j10, this.f18612b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = jK1 <= j11 && j11 <= jC;
        if (jK1 <= j12 && j12 <= jC) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z11) {
            if (z10) {
                return j12;
            }
            return jK1;
        }
        return j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z1.class == obj.getClass()) {
            z1 z1Var = (z1) obj;
            if (this.f18611a == z1Var.f18611a && this.f18612b == z1Var.f18612b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f18611a) * 31) + ((int) this.f18612b);
    }
}
