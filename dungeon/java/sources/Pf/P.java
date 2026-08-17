package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class P extends AbstractC1295b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1295b[] f9086e;

    public P(byte[] bArr, int i10) {
        this(bArr, i10, 1000);
    }

    public P(byte[] bArr, int i10, int i11) {
        super(bArr, i10);
        this.f9086e = null;
        this.f9085d = i11;
    }

    public P(AbstractC1295b[] abstractC1295bArr) {
        this(abstractC1295bArr, 1000);
    }

    public P(AbstractC1295b[] abstractC1295bArr, int i10) {
        super(D(abstractC1295bArr), false);
        this.f9086e = abstractC1295bArr;
        this.f9085d = i10;
    }

    static byte[] D(AbstractC1295b[] abstractC1295bArr) {
        int length = abstractC1295bArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC1295bArr[0].f9107a;
        }
        int i10 = length - 1;
        int length2 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr = abstractC1295bArr[i11].f9107a;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC1295bArr[i10].f9107a;
        byte b10 = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b10;
        int i12 = 1;
        for (AbstractC1295b abstractC1295b : abstractC1295bArr) {
            byte[] bArr4 = abstractC1295b.f9107a;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i12, length3);
            i12 += length3;
        }
        return bArr3;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        C1331w c1331w2;
        if (!l()) {
            byte[] bArr = this.f9107a;
            z0.E(c1331w, z10, bArr, 0, bArr.length);
            return;
        }
        c1331w.s(z10, 35);
        c1331w.i(128);
        AbstractC1295b[] abstractC1295bArr = this.f9086e;
        if (abstractC1295bArr == null) {
            byte[] bArr2 = this.f9107a;
            if (bArr2.length >= 2) {
                byte b10 = bArr2[0];
                int length = bArr2.length;
                int i10 = length - 1;
                int i11 = this.f9085d - 1;
                while (i10 > i11) {
                    C1331w c1331w3 = c1331w;
                    z0.D(c1331w3, true, (byte) 0, this.f9107a, length - i10, i11);
                    i10 -= i11;
                    c1331w = c1331w3;
                }
                c1331w2 = c1331w;
                z0.D(c1331w2, true, b10, this.f9107a, length - i10, i10);
            }
            c1331w2.i(0);
            c1331w2.i(0);
        }
        c1331w.v(abstractC1295bArr);
        c1331w2 = c1331w;
        c1331w2.i(0);
        c1331w2.i(0);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return this.f9086e != null || this.f9107a.length > this.f9085d;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        if (!l()) {
            return z0.F(z10, this.f9107a.length);
        }
        int iP = z10 ? 4 : 3;
        if (this.f9086e == null) {
            byte[] bArr = this.f9107a;
            if (bArr.length < 2) {
                return iP;
            }
            int length = bArr.length - 2;
            int i10 = this.f9085d;
            int i11 = length / (i10 - 1);
            return iP + (z0.F(true, i10) * i11) + z0.F(true, this.f9107a.length - (i11 * (this.f9085d - 1)));
        }
        int i12 = 0;
        while (true) {
            AbstractC1295b[] abstractC1295bArr = this.f9086e;
            if (i12 >= abstractC1295bArr.length) {
                return iP;
            }
            iP += abstractC1295bArr[i12].p(true);
            i12++;
        }
    }
}
