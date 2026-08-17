package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class T extends AbstractC1329u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1329u[] f9096e;

    public T(byte[] bArr) {
        this(bArr, 1000);
    }

    public T(byte[] bArr, int i10) {
        this(bArr, null, i10);
    }

    private T(byte[] bArr, AbstractC1329u[] abstractC1329uArr, int i10) {
        super(bArr);
        this.f9096e = abstractC1329uArr;
        this.f9095d = i10;
    }

    public T(AbstractC1329u[] abstractC1329uArr) {
        this(abstractC1329uArr, 1000);
    }

    public T(AbstractC1329u[] abstractC1329uArr, int i10) {
        this(B(abstractC1329uArr), abstractC1329uArr, i10);
    }

    static byte[] B(AbstractC1329u[] abstractC1329uArr) {
        int length = abstractC1329uArr.length;
        if (length == 0) {
            return AbstractC1329u.f9168c;
        }
        if (length == 1) {
            return abstractC1329uArr[0].f9169a;
        }
        int length2 = 0;
        for (AbstractC1329u abstractC1329u : abstractC1329uArr) {
            length2 += abstractC1329u.f9169a.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (AbstractC1329u abstractC1329u2 : abstractC1329uArr) {
            byte[] bArr2 = abstractC1329u2.f9169a;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.s(z10, 36);
        c1331w.i(128);
        AbstractC1329u[] abstractC1329uArr = this.f9096e;
        if (abstractC1329uArr == null) {
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f9169a;
                if (i10 >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i10, this.f9095d);
                C1320n0.B(c1331w, true, this.f9169a, i10, iMin);
                i10 += iMin;
            }
        } else {
            c1331w.v(abstractC1329uArr);
        }
        c1331w.i(0);
        c1331w.i(0);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return true;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        int iP = z10 ? 4 : 3;
        if (this.f9096e == null) {
            int length = this.f9169a.length;
            int i10 = this.f9095d;
            int i11 = length / i10;
            int iC = iP + (C1320n0.C(true, i10) * i11);
            int length2 = this.f9169a.length - (i11 * this.f9095d);
            return length2 > 0 ? iC + C1320n0.C(true, length2) : iC;
        }
        int i12 = 0;
        while (true) {
            AbstractC1329u[] abstractC1329uArr = this.f9096e;
            if (i12 >= abstractC1329uArr.length) {
                return iP;
            }
            iP += abstractC1329uArr[i12].p(true);
            i12++;
        }
    }
}
