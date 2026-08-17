package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2818g1 extends AbstractC2828i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f34726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f34728e;

    C2818g1(byte[] bArr, int i10, int i11) {
        super(null);
        AbstractC2843l1.k(i10, i10 + i11, bArr.length);
        this.f34726c = bArr;
        this.f34727d = i10;
        this.f34728e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    public final byte a(int i10) {
        int i11 = this.f34728e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f34726c[this.f34727d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    final byte c(int i10) {
        return this.f34726c[this.f34727d + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    protected final int e(int i10, int i11, int i12) {
        return M1.b(i10, this.f34726c, this.f34727d, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    public final int g() {
        return this.f34728e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    public final AbstractC2843l1 h(int i10, int i11) {
        int iK = AbstractC2843l1.k(i10, i11, this.f34728e);
        return iK == 0 ? AbstractC2843l1.f34755b : new C2818g1(this.f34726c, this.f34727d + i10, iK);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    final void i(AbstractC2803d1 abstractC2803d1) throws C2872r1 {
        ((C2863p1) abstractC2803d1).u(this.f34726c, this.f34727d, this.f34728e);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2843l1
    protected final boolean j(AbstractC2843l1 abstractC2843l1) {
        boolean z10 = abstractC2843l1 instanceof C2833j1;
        if (!z10 && !(abstractC2843l1 instanceof C2818g1)) {
            return abstractC2843l1.j(this);
        }
        int i10 = this.f34728e;
        if (i10 > abstractC2843l1.g()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > abstractC2843l1.g()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + abstractC2843l1.g());
        }
        if (z10) {
            return AbstractC2843l1.n(this.f34726c, this.f34727d, ((C2833j1) abstractC2843l1).f34741c, 0, i10);
        }
        if (abstractC2843l1 instanceof C2818g1) {
            C2818g1 c2818g1 = (C2818g1) abstractC2843l1;
            return AbstractC2843l1.n(this.f34726c, this.f34727d, c2818g1.f34726c, c2818g1.f34727d, i10);
        }
        AbstractC2843l1 abstractC2843l1H = abstractC2843l1.h(0, i10);
        int i11 = this.f34727d;
        return abstractC2843l1H.equals(h(i11, i10 + i11));
    }
}
