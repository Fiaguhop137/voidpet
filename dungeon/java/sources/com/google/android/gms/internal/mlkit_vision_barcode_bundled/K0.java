package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
final class K0 extends M0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33339d;

    /* synthetic */ K0(byte[] bArr, int i10, int i11, boolean z10, J0 j10) {
        super(null);
        this.f33339d = Integer.MAX_VALUE;
        this.f33337b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f33339d;
        this.f33339d = 0;
        int i12 = this.f33337b + this.f33338c;
        this.f33337b = i12;
        if (i12 <= 0) {
            this.f33338c = 0;
            return i11;
        }
        this.f33338c = i12;
        this.f33337b = 0;
        return i11;
    }
}
