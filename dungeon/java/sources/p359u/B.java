package p359u;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC4226z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4223w f54777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f54778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f54779e;

    public B(int i10, int i11, InterfaceC4223w interfaceC4223w) {
        this.f54775a = i10;
        this.f54776b = i11;
        this.f54777c = interfaceC4223w;
        this.f54778d = ((long) i10) * 1000000;
        this.f54779e = ((long) i11) * 1000000;
    }

    @Override // p359u.InterfaceC4226z
    public float c(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f54779e;
        long j12 = this.f54778d;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        float fA = this.f54777c.a(this.f54775a == 0 ? 1.0f : j11 / j12);
        return (f10 * (1 - fA)) + (f11 * fA);
    }

    @Override // p359u.InterfaceC4226z
    public float d(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f54779e;
        long j12 = this.f54778d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f12;
        }
        return (c(j13, f10, f11, f12) - c(j13 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // p359u.InterfaceC4226z
    public long e(float f10, float f11, float f12) {
        return this.f54779e + this.f54778d;
    }
}
