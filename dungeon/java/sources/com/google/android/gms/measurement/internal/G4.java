package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class G4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f35021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f35022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f35023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f35024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f35025e;

    G4(M4 m10, E4 e10, E4 e11, long j10, boolean z10) {
        this.f35021a = e10;
        this.f35022b = e11;
        this.f35023c = j10;
        this.f35024d = z10;
        Objects.requireNonNull(m10);
        this.f35025e = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35025e.B(this.f35021a, this.f35022b, this.f35023c, this.f35024d, null);
    }
}
