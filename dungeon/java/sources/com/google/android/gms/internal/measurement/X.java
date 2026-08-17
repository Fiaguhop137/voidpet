package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class X extends AbstractC2456d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f32766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32768d;

    X() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2456d0
    public final AbstractC2456d0 a(boolean z10) {
        this.f32766b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2456d0
    public final AbstractC2474f0 b() {
        if (this.f32766b == 1 && this.f32765a != null && this.f32767c != 0 && this.f32768d != 0) {
            return new Y(this.f32765a, false, this.f32767c, null, null, this.f32768d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f32765a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f32766b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f32767c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f32768d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2456d0
    final AbstractC2456d0 c(int i10) {
        this.f32767c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2456d0
    public final AbstractC2456d0 d(int i10) {
        this.f32768d = 1;
        return this;
    }

    public final AbstractC2456d0 e(String str) {
        this.f32765a = "";
        return this;
    }
}
