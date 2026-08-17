package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Y0 extends A0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f32837e;

    Y0(Z0 z10, Runnable runnable) {
        this.f32837e = runnable;
        Objects.requireNonNull(z10);
    }

    @Override // com.google.android.gms.internal.measurement.B0
    public final void b() {
        this.f32837e.run();
    }
}
