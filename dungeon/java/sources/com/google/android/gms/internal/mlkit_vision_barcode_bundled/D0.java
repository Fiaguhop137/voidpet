package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
final class D0 extends H0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33290e;

    D0(byte[] bArr, int i10, int i11) {
        super(bArr);
        I0.s(i10, i10 + i11, bArr.length);
        this.f33289d = i10;
        this.f33290e = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0
    protected final int E() {
        return this.f33289d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final byte a(int i10) {
        I0.A(i10, this.f33290e);
        return this.f33333c[this.f33289d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    final byte c(int i10) {
        return this.f33333c[this.f33289d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final int g() {
        return this.f33290e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final void h(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f33333c, this.f33289d + i10, bArr, i11, i12);
    }
}
