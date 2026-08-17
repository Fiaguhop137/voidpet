package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f34914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f34915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f34916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f34917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f34918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f34919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f34920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f34921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f34922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f34923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f34924k;

    C(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        p170j8.r.f(str);
        p170j8.r.f(str2);
        p170j8.r.a(j10 >= 0);
        p170j8.r.a(j11 >= 0);
        p170j8.r.a(j12 >= 0);
        p170j8.r.a(j14 >= 0);
        this.f34914a = str;
        this.f34915b = str2;
        this.f34916c = j10;
        this.f34917d = j11;
        this.f34918e = j12;
        this.f34919f = j13;
        this.f34920g = j14;
        this.f34921h = l10;
        this.f34922i = l11;
        this.f34923j = l12;
        this.f34924k = bool;
    }

    final C a(long j10) {
        return new C(this.f34914a, this.f34915b, this.f34916c, this.f34917d, this.f34918e, j10, this.f34920g, this.f34921h, this.f34922i, this.f34923j, this.f34924k);
    }

    final C b(long j10, long j11) {
        return new C(this.f34914a, this.f34915b, this.f34916c, this.f34917d, this.f34918e, this.f34919f, j10, Long.valueOf(j11), this.f34922i, this.f34923j, this.f34924k);
    }

    final C c(Long l10, Long l11, Boolean bool) {
        return new C(this.f34914a, this.f34915b, this.f34916c, this.f34917d, this.f34918e, this.f34919f, this.f34920g, this.f34921h, l10, l11, bool);
    }
}
