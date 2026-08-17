package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f35187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35188b;

    public R5(com.google.android.gms.common.util.e eVar) {
        p170j8.r.l(eVar);
        this.f35187a = eVar;
    }

    public final void a() {
        this.f35188b = this.f35187a.c();
    }

    public final void b() {
        this.f35188b = 0L;
    }

    public final boolean c(long j10) {
        return this.f35188b == 0 || this.f35187a.c() - this.f35188b >= 3600000;
    }
}
