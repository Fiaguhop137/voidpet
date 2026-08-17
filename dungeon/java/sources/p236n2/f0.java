package p236n2;

import R1.F;
import R1.u;
import U1.AbstractC1459a;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends F {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f49738r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final u f49739s = new u.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f49741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f49742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f49743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f49744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f49745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f49746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f49747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f49748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f49749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f49750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u f49751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u.g f49752q;

    public f0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, u uVar, u.g gVar) {
        this.f49740e = j10;
        this.f49741f = j11;
        this.f49742g = j12;
        this.f49743h = j13;
        this.f49744i = j14;
        this.f49745j = j15;
        this.f49746k = j16;
        this.f49747l = z10;
        this.f49748m = z11;
        this.f49749n = z12;
        this.f49750o = obj;
        this.f49751p = (u) AbstractC1459a.e(uVar);
        this.f49752q = gVar;
    }

    public f0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, u uVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, uVar, z12 ? uVar.f10347d : null);
    }

    public f0(long j10, boolean z10, boolean z11, boolean z12, Object obj, u uVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, uVar);
    }

    @Override // R1.F
    public int b(Object obj) {
        return f49738r.equals(obj) ? 0 : -1;
    }

    @Override // R1.F
    public F.b g(int i10, F.b bVar, boolean z10) {
        AbstractC1459a.c(i10, 0, 1);
        return bVar.s(null, z10 ? f49738r : null, 0, this.f49743h, -this.f49745j);
    }

    @Override // R1.F
    public int i() {
        return 1;
    }

    @Override // R1.F
    public Object m(int i10) {
        AbstractC1459a.c(i10, 0, 1);
        return f49738r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // R1.F
    public F.c o(int i10, F.c cVar, long j10) {
        long j11;
        AbstractC1459a.c(i10, 0, 1);
        long j12 = this.f49746k;
        boolean z10 = this.f49748m;
        if (!z10 || this.f49749n || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f49744i;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return cVar.g(F.c.f9935q, this.f49751p, this.f49750o, this.f49740e, this.f49741f, this.f49742g, this.f49747l, z10, this.f49752q, j11, this.f49744i, 0, 0, this.f49745j);
    }

    @Override // R1.F
    public int p() {
        return 1;
    }
}
