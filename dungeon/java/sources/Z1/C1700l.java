package Z1;

import android.os.SystemClock;

/* JADX INFO: renamed from: Z1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1700l implements S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f18324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f18325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f18326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f18329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f18330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f18333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f18335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f18336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f18337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f18338s;

    /* JADX INFO: renamed from: Z1.l$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f18339a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f18340b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f18341c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f18342d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f18343e = U1.S.M0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f18344f = U1.S.M0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f18345g = 0.999f;

        public C1700l a() {
            return new C1700l(this.f18339a, this.f18340b, this.f18341c, this.f18342d, this.f18343e, this.f18344f, this.f18345g, null);
        }
    }

    private C1700l(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f18320a = f10;
        this.f18321b = f11;
        this.f18322c = j10;
        this.f18323d = f12;
        this.f18324e = j11;
        this.f18325f = j12;
        this.f18326g = f13;
        this.f18327h = -9223372036854775807L;
        this.f18328i = -9223372036854775807L;
        this.f18330k = -9223372036854775807L;
        this.f18331l = -9223372036854775807L;
        this.f18334o = f10;
        this.f18333n = f11;
        this.f18335p = 1.0f;
        this.f18336q = -9223372036854775807L;
        this.f18329j = -9223372036854775807L;
        this.f18332m = -9223372036854775807L;
        this.f18337r = -9223372036854775807L;
        this.f18338s = -9223372036854775807L;
    }

    /* synthetic */ C1700l(float f10, float f11, long j10, float f12, long j11, long j12, float f13, a aVar) {
        this(f10, f11, j10, f12, j11, j12, f13);
    }

    private void f(long j10) {
        long j11 = this.f18337r + (this.f18338s * 3);
        if (this.f18332m > j11) {
            float fM0 = U1.S.M0(this.f18322c);
            this.f18332m = F9.h.d(j11, this.f18329j, this.f18332m - (((long) ((this.f18335p - 1.0f) * fM0)) + ((long) ((this.f18333n - 1.0f) * fM0))));
            return;
        }
        long jP = U1.S.p(j10 - ((long) (Math.max(0.0f, this.f18335p - 1.0f) / this.f18323d)), this.f18332m, j11);
        this.f18332m = jP;
        long j12 = this.f18331l;
        if (j12 == -9223372036854775807L || jP <= j12) {
            return;
        }
        this.f18332m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f18327h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f18328i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f18330k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f18331l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f18329j == j10) {
            return;
        }
        this.f18329j = j10;
        this.f18332m = j10;
        this.f18337r = -9223372036854775807L;
        this.f18338s = -9223372036854775807L;
        this.f18336q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f18337r;
        if (j13 == -9223372036854775807L) {
            this.f18337r = j12;
            this.f18338s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f18326g));
            this.f18337r = jMax;
            this.f18338s = h(this.f18338s, Math.abs(j12 - jMax), this.f18326g);
        }
    }

    @Override // Z1.S0
    public float a(long j10, long j11) {
        if (this.f18327h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f18336q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f18336q < this.f18322c) {
            return this.f18335p;
        }
        this.f18336q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f18332m;
        if (Math.abs(j12) < this.f18324e) {
            this.f18335p = 1.0f;
        } else {
            this.f18335p = U1.S.n((this.f18323d * j12) + 1.0f, this.f18334o, this.f18333n);
        }
        return this.f18335p;
    }

    @Override // Z1.S0
    public long b() {
        return this.f18332m;
    }

    @Override // Z1.S0
    public void c() {
        long j10 = this.f18332m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f18325f;
        this.f18332m = j11;
        long j12 = this.f18331l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f18332m = j12;
        }
        this.f18336q = -9223372036854775807L;
    }

    @Override // Z1.S0
    public void d(R1.u.g gVar) {
        this.f18327h = U1.S.M0(gVar.f10422a);
        this.f18330k = U1.S.M0(gVar.f10423b);
        this.f18331l = U1.S.M0(gVar.f10424c);
        float f10 = gVar.f10425d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f18320a;
        }
        this.f18334o = f10;
        float f11 = gVar.f10426e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f18321b;
        }
        this.f18333n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f18327h = -9223372036854775807L;
        }
        g();
    }

    @Override // Z1.S0
    public void e(long j10) {
        this.f18328i = j10;
        g();
    }
}
