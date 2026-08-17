package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z0 extends AbstractRunnableC2565p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f32845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2651z1 f32846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z0(C2651z1 c2651z1, Runnable runnable) {
        super(c2651z1, true);
        this.f32845e = runnable;
        Objects.requireNonNull(c2651z1);
        this.f32846f = c2651z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2565p1
    final void a() {
        ((InterfaceC2617v0) p170j8.r.l(this.f32846f.n())).retrieveAndUploadBatches(new Y0(this, this.f32845e));
    }
}
