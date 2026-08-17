package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2916b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f35340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0 f35341b;

    RunnableC2916b0(C0 c10, long j10) {
        this.f35340a = j10;
        Objects.requireNonNull(c10);
        this.f35341b = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35341b.n(this.f35340a);
    }
}
