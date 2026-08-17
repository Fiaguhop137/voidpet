package p039c2;

import p057d2.i;
import p380v2.C4244g;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4244g f26763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26764b;

    public h(C4244g c4244g, long j10) {
        this.f26763a = c4244g;
        this.f26764b = j10;
    }

    @Override // p039c2.f
    public long a(long j10, long j11) {
        return this.f26763a.f56087d[(int) j10];
    }

    @Override // p039c2.f
    public long b(long j10, long j11) {
        return 0L;
    }

    @Override // p039c2.f
    public long c(long j10) {
        return this.f26763a.f56088e[(int) j10] - this.f26764b;
    }

    @Override // p039c2.f
    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // p039c2.f
    public i e(long j10) {
        C4244g c4244g = this.f26763a;
        int i10 = (int) j10;
        return new i(null, c4244g.f56086c[i10], c4244g.f56085b[i10]);
    }

    @Override // p039c2.f
    public long f(long j10, long j11) {
        return this.f26763a.a(j10 + this.f26764b);
    }

    @Override // p039c2.f
    public long g(long j10) {
        return this.f26763a.f56084a;
    }

    @Override // p039c2.f
    public boolean h() {
        return true;
    }

    @Override // p039c2.f
    public long i() {
        return 0L;
    }

    @Override // p039c2.f
    public long j(long j10, long j11) {
        return this.f26763a.f56084a;
    }
}
