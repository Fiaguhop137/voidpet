package O2;

import p380v2.C4246i;
import p380v2.F;

/* JADX INFO: loaded from: classes.dex */
final class a extends C4246i implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f8317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f8318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f8319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f8320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f8321l;

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f8317h = j11;
        this.f8318i = i10;
        this.f8319j = i11;
        this.f8320k = z10;
        this.f8321l = j12 == -1 ? -1L : j12;
    }

    public a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f55967f, aVar.f55964c, z10);
    }

    @Override // O2.g
    public long c(long j10) {
        return b(j10);
    }

    @Override // O2.g
    public long d() {
        return this.f8317h;
    }

    public a g(long j10) {
        return new a(j10, this.f8317h, this.f8318i, this.f8319j, this.f8320k);
    }

    @Override // O2.g
    public long h() {
        return this.f8321l;
    }

    @Override // O2.g
    public int l() {
        return this.f8318i;
    }
}
