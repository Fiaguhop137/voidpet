package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
class H4 extends G4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f32515c;

    H4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f32515c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public byte a(int i10) {
        return this.f32515c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.I4
    byte c(int i10) {
        return this.f32515c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public int e() {
        return this.f32515c.length;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I4) || e() != ((I4) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof H4)) {
            return obj.equals(this);
        }
        H4 h10 = (H4) obj;
        int iK = k();
        int iK2 = h10.k();
        if (iK != 0 && iK2 != 0 && iK != iK2) {
            return false;
        }
        int iE = e();
        if (iE > h10.e()) {
            int iE2 = e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iE).length() + 18 + String.valueOf(iE2).length());
            sb2.append("Length too large: ");
            sb2.append(iE);
            sb2.append(iE2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iE > h10.e()) {
            int iE3 = h10.e();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iE).length() + 27 + String.valueOf(iE3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iE);
            sb3.append(", ");
            sb3.append(iE3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f32515c;
        byte[] bArr2 = h10.f32515c;
        h10.n();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iE) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final I4 g(int i10, int i11) {
        int iL = I4.l(0, i11, e());
        return iL == 0 ? I4.f32539b : new D4(this.f32515c, 0, iL);
    }

    @Override // com.google.android.gms.internal.measurement.I4
    final void h(AbstractC2654z4 abstractC2654z4) {
        ((L4) abstractC2654z4).F(this.f32515c, 0, e());
    }

    @Override // com.google.android.gms.internal.measurement.I4
    protected final int i(int i10, int i11, int i12) {
        return AbstractC2524k5.c(i10, this.f32515c, 0, i12);
    }

    protected int n() {
        return 0;
    }
}
