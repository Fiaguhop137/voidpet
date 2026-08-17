package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2381j0 extends C2393n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32405f;

    C2381j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2402q0.k(0, i11, bArr.length);
        this.f32405f = i11;
    }

    @Override // com.google.android.gms.internal.auth.C2393n0, com.google.android.gms.internal.auth.AbstractC2402q0
    public final byte a(int i10) {
        int i11 = this.f32405f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f32431e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.auth.C2393n0, com.google.android.gms.internal.auth.AbstractC2402q0
    final byte c(int i10) {
        return this.f32431e[i10];
    }

    @Override // com.google.android.gms.internal.auth.C2393n0, com.google.android.gms.internal.auth.AbstractC2402q0
    public final int e() {
        return this.f32405f;
    }

    @Override // com.google.android.gms.internal.auth.C2393n0
    protected final int p() {
        return 0;
    }
}
