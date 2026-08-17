package p234n0;

import O0.y;
import O0.z;
import p019b0.e;
import p270p0.a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a f49455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f49456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f49457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49459e;

    public d() {
        c.a aVar = e.i() ? c.a.Impulse : c.a.Lsq2;
        this.f49455a = aVar;
        this.f49456b = new c(false, aVar, 1, null);
        this.f49457c = new c(false, aVar, 1, null);
        this.f49458d = e.f25805b.c();
    }

    public final void a(long j10, long j11) {
        this.f49456b.a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.f49457c.a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public final long b(long j10) {
        if (!(y.e(j10) > 0.0f && y.f(j10) > 0.0f)) {
            a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y.k(j10)));
        }
        return z.a(this.f49456b.d(y.e(j10)), this.f49457c.d(y.f(j10)));
    }

    public final long c() {
        return this.f49458d;
    }

    public final long d() {
        return this.f49459e;
    }

    public final void e() {
        this.f49456b.e();
        this.f49457c.e();
        this.f49459e = 0L;
    }

    public final void f(long j10) {
        this.f49458d = j10;
    }

    public final void g(long j10) {
        this.f49459e = j10;
    }
}
