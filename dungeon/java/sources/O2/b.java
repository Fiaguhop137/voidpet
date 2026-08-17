package O2;

import U1.S;
import java.math.RoundingMode;
import p380v2.E;
import p380v2.J;

/* JADX INFO: loaded from: classes.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E f8325d;

    public b(long j10, long j11, long j12) {
        this.f8325d = new E(new long[]{j11}, new long[]{0}, j10);
        this.f8322a = j11;
        this.f8323b = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f8324c = -2147483647;
            return;
        }
        long jD1 = S.d1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jD1 > 0 && jD1 <= 2147483647L) {
            i10 = (int) jD1;
        }
        this.f8324c = i10;
    }

    public boolean a(long j10) {
        return this.f8325d.b(j10, 100000L);
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f8325d.a(j10, j11);
    }

    @Override // O2.g
    public long c(long j10) {
        return this.f8325d.c(j10);
    }

    @Override // O2.g
    public long d() {
        return this.f8322a;
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        return this.f8325d.e(j10);
    }

    void f(long j10) {
        this.f8325d.f(j10);
    }

    @Override // O2.g
    public long h() {
        return this.f8323b;
    }

    @Override // p380v2.J
    public boolean i() {
        return this.f8325d.i();
    }

    @Override // O2.g
    public int l() {
        return this.f8324c;
    }

    @Override // p380v2.J
    public long m() {
        return this.f8325d.m();
    }
}
