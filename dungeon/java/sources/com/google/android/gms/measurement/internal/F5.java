package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class F5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f35003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f35004b;

    F5(N5 n10, long j10) {
        this.f35003a = j10;
        Objects.requireNonNull(n10);
        this.f35004b = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35004b.s(this.f35003a);
    }
}
