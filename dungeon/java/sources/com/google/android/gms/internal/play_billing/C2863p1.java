package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2863p1 extends AbstractC2881t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f34796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f34797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34798f;

    C2863p1(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f34796d = bArr;
        this.f34798f = 0;
        this.f34797e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final int c() {
        return this.f34797e - this.f34798f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void d(byte b10) throws C2872r1 {
        int i10 = this.f34798f;
        try {
            int i11 = i10 + 1;
            try {
                this.f34796d[i10] = b10;
                this.f34798f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new C2872r1(i10, this.f34797e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void e(int i10, boolean z10) throws C2872r1 {
        p(i10 << 3);
        d(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void f(int i10, AbstractC2843l1 abstractC2843l1) throws C2872r1 {
        p((i10 << 3) | 2);
        v(abstractC2843l1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void g(int i10, int i11) throws C2872r1 {
        p((i10 << 3) | 5);
        h(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void h(int i10) throws C2872r1 {
        int i11 = this.f34798f;
        try {
            byte[] bArr = this.f34796d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f34798f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2872r1(i11, this.f34797e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void i(int i10, long j10) throws C2872r1 {
        p((i10 << 3) | 1);
        j(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void j(long j10) throws C2872r1 {
        int i10 = this.f34798f;
        try {
            byte[] bArr = this.f34796d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f34798f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2872r1(i10, this.f34797e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void k(int i10, int i11) throws C2872r1 {
        p(i10 << 3);
        l(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void l(int i10) throws C2872r1 {
        if (i10 >= 0) {
            p(i10);
        } else {
            r(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void m(int i10, String str) throws C2872r1 {
        p((i10 << 3) | 2);
        w(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void n(int i10, int i11) throws C2872r1 {
        p((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void o(int i10, int i11) throws C2872r1 {
        p(i10 << 3);
        p(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void p(int i10) throws C2872r1 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f34798f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f34796d[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new C2872r1(i12, this.f34797e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new C2872r1(i12, this.f34797e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f34796d[i12] = (byte) i10;
        this.f34798f = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void q(int i10, long j10) throws C2872r1 {
        p(i10 << 3);
        r(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2881t1
    public final void r(long j10) throws C2872r1 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.f34798f;
        if (!AbstractC2881t1.f34807b || this.f34797e - i11 < 10) {
            int i12 = i11;
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.f34796d[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new C2872r1(i12, this.f34797e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i12 + 1;
            try {
                this.f34796d[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new C2872r1(i12, this.f34797e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC2906z2.s(this.f34796d, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            AbstractC2906z2.s(this.f34796d, i11, (byte) j10);
        }
        this.f34798f = i10;
    }

    public final void u(byte[] bArr, int i10, int i11) throws C2872r1 {
        try {
            System.arraycopy(bArr, i10, this.f34796d, this.f34798f, i11);
            this.f34798f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2872r1(this.f34798f, this.f34797e, i11, e10);
        }
    }

    public final void v(AbstractC2843l1 abstractC2843l1) throws C2872r1 {
        p(abstractC2843l1.g());
        abstractC2843l1.i(this);
    }

    public final void w(String str) throws C2872r1 {
        int i10 = this.f34798f;
        try {
            int iS = AbstractC2881t1.s(str.length() * 3);
            int iS2 = AbstractC2881t1.s(str.length());
            if (iS2 != iS) {
                p(D2.b(str));
                byte[] bArr = this.f34796d;
                int i11 = this.f34798f;
                this.f34798f = D2.a(str, bArr, i11, this.f34797e - i11);
                return;
            }
            int i12 = i10 + iS2;
            this.f34798f = i12;
            int iA = D2.a(str, this.f34796d, i12, this.f34797e - i12);
            this.f34798f = i10;
            p((iA - i10) - iS2);
            this.f34798f = iA;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2872r1(e10);
        }
    }
}
