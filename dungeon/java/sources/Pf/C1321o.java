package Pf;

import java.math.BigInteger;

/* JADX INFO: renamed from: Pf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1321o extends AbstractC1333y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final L f9150c = new a(C1321o.class, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9152b;

    /* JADX INFO: renamed from: Pf.o$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return C1321o.w(c1320n0.A());
        }
    }

    public C1321o(long j10) {
        this.f9151a = BigInteger.valueOf(j10).toByteArray();
        this.f9152b = 0;
    }

    public C1321o(BigInteger bigInteger) {
        this.f9151a = bigInteger.toByteArray();
        this.f9152b = 0;
    }

    C1321o(byte[] bArr, boolean z10) {
        if (E(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f9151a = z10 ? Ug.a.e(bArr) : bArr;
        this.f9152b = H(bArr);
    }

    static int C(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 4);
        int i12 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i12;
            }
            i12 = (i12 << 8) | (bArr[iMax] & 255);
        }
    }

    static boolean E(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Ug.g.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static long F(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 8);
        long j10 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j10;
            }
            j10 = (j10 << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    static int H(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    static C1321o w(byte[] bArr) {
        return new C1321o(bArr, false);
    }

    public static C1321o x(G g10, boolean z10) {
        return (C1321o) f9150c.e(g10, z10);
    }

    public static C1321o y(Object obj) {
        if (obj == null || (obj instanceof C1321o)) {
            return (C1321o) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C1321o) f9150c.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public BigInteger A() {
        return new BigInteger(this.f9151a);
    }

    public boolean B(int i10) {
        byte[] bArr = this.f9151a;
        int length = bArr.length;
        int i11 = this.f9152b;
        return length - i11 <= 4 && C(bArr, i11, -1) == i10;
    }

    public int D() {
        byte[] bArr = this.f9151a;
        int length = bArr.length;
        int i10 = this.f9152b;
        if (length - i10 <= 4) {
            return C(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long G() {
        byte[] bArr = this.f9151a;
        int length = bArr.length;
        int i10 = this.f9152b;
        if (length - i10 <= 8) {
            return F(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(this.f9151a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof C1321o) {
            return Ug.a.b(this.f9151a, ((C1321o) abstractC1333y).f9151a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 2, this.f9151a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9151a.length);
    }

    public String toString() {
        return A().toString();
    }
}
