package Pf;

import java.io.IOException;

/* JADX INFO: renamed from: Pf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1293a extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9100b = new C0151a(AbstractC1293a.class, 30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final char[] f9101a;

    /* JADX INFO: renamed from: Pf.a$a, reason: collision with other inner class name */
    static class C0151a extends L {
        C0151a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return AbstractC1293a.w(c1320n0.A());
        }
    }

    AbstractC1293a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i10 = length / 2;
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 != i10; i11++) {
            int i12 = i11 * 2;
            cArr[i11] = (char) ((bArr[i12 + 1] & 255) | (bArr[i12] << 8));
        }
        this.f9101a = cArr;
    }

    AbstractC1293a(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f9101a = cArr;
    }

    static AbstractC1293a w(byte[] bArr) {
        return new C1300d0(bArr);
    }

    static AbstractC1293a x(char[] cArr) {
        return new C1300d0(cArr);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public final int hashCode() {
        return Ug.a.p(this.f9101a);
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof AbstractC1293a) {
            return Ug.a.c(this.f9101a, ((AbstractC1293a) abstractC1333y).f9101a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    final void k(C1331w c1331w, boolean z10) throws IOException {
        int length = this.f9101a.length;
        c1331w.s(z10, 30);
        c1331w.k(length * 2);
        byte[] bArr = new byte[8];
        int i10 = length & (-4);
        int i11 = 0;
        while (i11 < i10) {
            char[] cArr = this.f9101a;
            char c10 = cArr[i11];
            char c11 = cArr[i11 + 1];
            char c12 = cArr[i11 + 2];
            char c13 = cArr[i11 + 3];
            i11 += 4;
            bArr[0] = (byte) (c10 >> '\b');
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> '\b');
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> '\b');
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> '\b');
            bArr[7] = (byte) c13;
            c1331w.j(bArr, 0, 8);
        }
        if (i11 < length) {
            int i12 = 0;
            do {
                char c14 = this.f9101a[i11];
                i11++;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (c14 >> '\b');
                i12 += 2;
                bArr[i13] = (byte) c14;
            } while (i11 < length);
            c1331w.j(bArr, 0, i12);
        }
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    final int p(boolean z10) {
        return C1331w.g(z10, this.f9101a.length * 2);
    }

    public String toString() {
        return y();
    }

    public final String y() {
        return new String(this.f9101a);
    }
}
