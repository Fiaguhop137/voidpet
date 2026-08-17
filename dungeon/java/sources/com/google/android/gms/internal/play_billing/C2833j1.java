package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2833j1 extends AbstractC2828i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f34741c;

    C2833j1(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f34741c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    public final byte a(int i10) {
        return this.f34741c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    final byte c(int i10) {
        return this.f34741c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    protected final int e(int i10, int i11, int i12) {
        return M1.b(i10, this.f34741c, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    public final int g() {
        return this.f34741c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    public final AbstractC2843l1 h(int i10, int i11) {
        byte[] bArr = this.f34741c;
        int iK = AbstractC2843l1.k(0, i11, bArr.length);
        return iK == 0 ? AbstractC2843l1.f34755b : new C2818g1(bArr, 0, iK);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    final void i(AbstractC2803d1 abstractC2803d1) throws C2872r1 {
        byte[] bArr = this.f34741c;
        ((C2863p1) abstractC2803d1).u(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    protected final boolean j(AbstractC2843l1 abstractC2843l1) {
        boolean z10 = abstractC2843l1 instanceof C2833j1;
        if (z10) {
            return Arrays.equals(this.f34741c, ((C2833j1) abstractC2843l1).f34741c);
        }
        boolean z11 = abstractC2843l1 instanceof C2818g1;
        if (!z11) {
            return abstractC2843l1.j(this);
        }
        byte[] bArr = this.f34741c;
        int iG = abstractC2843l1.g();
        int length = bArr.length;
        if (length > iG) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length <= abstractC2843l1.g()) {
            if (z10) {
                return AbstractC2843l1.n(bArr, 0, ((C2833j1) abstractC2843l1).f34741c, 0, length);
            }
            if (!z11) {
                return abstractC2843l1.h(0, length).equals(h(0, length));
            }
            C2818g1 c2818g1 = (C2818g1) abstractC2843l1;
            return AbstractC2843l1.n(bArr, 0, c2818g1.f34726c, c2818g1.f34727d, length);
        }
        throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + abstractC2843l1.g());
    }
}
