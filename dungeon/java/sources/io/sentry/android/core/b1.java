package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f44838e;

    public void a(long j10, long j11, boolean z10, boolean z11) {
        this.f44838e += j10;
        if (z11) {
            this.f44837d += j11;
            this.f44835b++;
        } else if (z10) {
            this.f44836c += j11;
            this.f44834a++;
        }
    }

    public int b() {
        return this.f44835b;
    }

    public long c() {
        return this.f44837d;
    }

    public int d() {
        return this.f44834a;
    }

    public long e() {
        return this.f44836c;
    }

    public int f() {
        return this.f44834a + this.f44835b;
    }

    public long g() {
        return this.f44838e;
    }
}
