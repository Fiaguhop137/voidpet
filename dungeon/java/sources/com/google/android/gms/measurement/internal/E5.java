package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class E5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f34989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f34990b;

    E5(N5 n10, long j10) {
        this.f34989a = j10;
        Objects.requireNonNull(n10);
        this.f34990b = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34990b.r(this.f34989a);
    }
}
