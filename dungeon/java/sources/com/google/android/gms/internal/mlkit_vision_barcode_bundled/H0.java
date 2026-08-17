package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class H0 extends G0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f33333c;

    H0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f33333c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    final boolean D(I0 i10, int i11, int i12) {
        if (i12 > i10.g()) {
            throw new IllegalArgumentException("Length too large: " + i12 + g());
        }
        int i13 = i11 + i12;
        if (i13 > i10.g()) {
            throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + i10.g());
        }
        if (!(i10 instanceof H0)) {
            return i10.n(i11, i13).equals(n(0, i12));
        }
        H0 h10 = (H0) i10;
        byte[] bArr = this.f33333c;
        byte[] bArr2 = h10.f33333c;
        int iE = E() + i12;
        int iE2 = E();
        int iE3 = h10.E() + i11;
        while (iE2 < iE) {
            if (bArr[iE2] != bArr2[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    protected int E() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public byte a(int i10) {
        return this.f33333c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    byte c(int i10) {
        return this.f33333c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0) || g() != ((I0) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return obj.equals(this);
        }
        H0 h10 = (H0) obj;
        int iT = t();
        int iT2 = h10.t();
        if (iT == 0 || iT2 == 0 || iT == iT2) {
            return D(h10, 0, g());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public int g() {
        return this.f33333c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected void h(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f33333c, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final int k(int i10, int i11, int i12) {
        return AbstractC2743r1.b(i10, this.f33333c, E() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final int l(int i10, int i11, int i12) {
        int iE = E() + i11;
        return D2.f(i10, this.f33333c, iE, i12 + iE);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final I0 n(int i10, int i11) {
        int iS = I0.s(i10, i11, g());
        return iS == 0 ? I0.f33335b : new D0(this.f33333c, E() + i10, iS);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final String o(Charset charset) {
        return new String(this.f33333c, E(), g(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    final void p(AbstractC2782z0 abstractC2782z0) {
        ((N0) abstractC2782z0).D(this.f33333c, E(), g());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final boolean q() {
        int iE = E();
        return D2.g(this.f33333c, iE, g() + iE);
    }
}
