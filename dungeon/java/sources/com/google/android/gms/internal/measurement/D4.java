package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class D4 extends H4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32492d;

    D4(byte[] bArr, int i10, int i11) {
        super(bArr);
        I4.l(0, i11, bArr.length);
        this.f32492d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.H4, com.google.android.gms.internal.measurement.I4
    public final byte a(int i10) {
        int i11 = this.f32492d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f32515c[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.H4, com.google.android.gms.internal.measurement.I4
    final byte c(int i10) {
        return this.f32515c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.H4, com.google.android.gms.internal.measurement.I4
    public final int e() {
        return this.f32492d;
    }

    @Override // com.google.android.gms.internal.measurement.H4
    protected final int n() {
        return 0;
    }
}
