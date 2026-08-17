package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class L4 extends N4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f32566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32568g;

    L4(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f32566e = bArr;
        this.f32568g = 0;
        this.f32567f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void A(long j10) throws M4 {
        int i10 = this.f32568g;
        try {
            byte[] bArr = this.f32566e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f32568g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(i10, this.f32567f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void B(byte[] bArr, int i10, int i11) {
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void C(String str) throws M4 {
        int i10 = this.f32568g;
        try {
            int iE = N4.E(str.length() * 3);
            int iE2 = N4.E(str.length());
            if (iE2 != iE) {
                x(AbstractC2525k6.b(str));
                byte[] bArr = this.f32566e;
                int i11 = this.f32568g;
                this.f32568g = AbstractC2525k6.c(str, bArr, i11, this.f32567f - i11);
                return;
            }
            int i12 = i10 + iE2;
            this.f32568g = i12;
            int iC = AbstractC2525k6.c(str, this.f32566e, i12, this.f32567f - i12);
            this.f32568g = i10;
            x((iC - i10) - iE2);
            this.f32568g = iC;
        } catch (C2516j6 e10) {
            this.f32568g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new M4(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final int D() {
        return this.f32567f - this.f32568g;
    }

    public final void F(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f32566e, this.f32568g, i11);
            this.f32568g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(this.f32568g, this.f32567f, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void i(int i10, int i11) throws M4 {
        x((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void j(int i10, int i11) throws M4 {
        x(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void k(int i10, int i11) throws M4 {
        x(i10 << 3);
        x(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void l(int i10, int i11) throws M4 {
        x((i10 << 3) | 5);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void m(int i10, long j10) throws M4 {
        x(i10 << 3);
        z(j10);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void n(int i10, long j10) throws M4 {
        x((i10 << 3) | 1);
        A(j10);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void o(int i10, boolean z10) throws M4 {
        x(i10 << 3);
        v(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void p(int i10, String str) throws M4 {
        x((i10 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void q(int i10, I4 i11) throws M4 {
        x((i10 << 3) | 2);
        r(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void r(I4 i10) throws M4 {
        x(i10.e());
        i10.h(this);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void s(byte[] bArr, int i10, int i11) throws M4 {
        x(i11);
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    final void t(int i10, E5 e10, P5 p10) throws M4 {
        x((i10 << 3) | 2);
        x(((AbstractC2612u4) e10).f(p10));
        p10.j(e10, this.f32666a);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void u(E5 e10) throws M4 {
        x(e10.b());
        e10.c(this);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void v(byte b10) throws M4 {
        int i10 = this.f32568g;
        try {
            int i11 = i10 + 1;
            try {
                this.f32566e[i10] = b10;
                this.f32568g = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new M4(i10, this.f32567f, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void w(int i10) throws M4 {
        if (i10 >= 0) {
            x(i10);
        } else {
            z(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void x(int i10) throws M4 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f32568g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f32566e[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new M4(i12, this.f32567f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new M4(i12, this.f32567f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f32566e[i12] = (byte) i10;
        this.f32568g = i11;
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void y(int i10) throws M4 {
        int i11 = this.f32568g;
        try {
            byte[] bArr = this.f32566e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f32568g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(i11, this.f32567f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void z(long j10) throws M4 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = N4.f32664c;
        int i11 = this.f32568g;
        if (!z10 || this.f32567f - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f32566e[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new M4(i11, this.f32567f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f32566e[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new M4(i11, this.f32567f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC2498h6.u(this.f32566e, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            AbstractC2498h6.u(this.f32566e, i11, (byte) j10);
        }
        this.f32568g = i10;
    }
}
