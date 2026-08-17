package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2393n0 extends AbstractC2390m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f32431e;

    C2393n0(byte[] bArr) {
        bArr.getClass();
        this.f32431e = bArr;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    public byte a(int i10) {
        return this.f32431e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    byte c(int i10) {
        return this.f32431e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    public int e() {
        return this.f32431e.length;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2402q0) || e() != ((AbstractC2402q0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof C2393n0)) {
            return obj.equals(this);
        }
        C2393n0 c2393n0 = (C2393n0) obj;
        int iL = l();
        int iL2 = c2393n0.l();
        if (iL != 0 && iL2 != 0 && iL != iL2) {
            return false;
        }
        int iE = e();
        if (iE > c2393n0.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > c2393n0.e()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iE + ", " + c2393n0.e());
        }
        byte[] bArr = this.f32431e;
        byte[] bArr2 = c2393n0.f32431e;
        c2393n0.p();
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

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    protected final int g(int i10, int i11, int i12) {
        return G0.b(i10, this.f32431e, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    public final AbstractC2402q0 h(int i10, int i11) {
        int iK = AbstractC2402q0.k(0, i11, e());
        return iK == 0 ? AbstractC2402q0.f32443b : new C2381j0(this.f32431e, 0, iK);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    protected final String i(Charset charset) {
        return new String(this.f32431e, 0, e(), charset);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2402q0
    public final boolean j() {
        return E1.c(this.f32431e, 0, e());
    }

    protected int p() {
        return 0;
    }
}
