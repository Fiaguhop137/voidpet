package Pf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Pf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1295b extends AbstractC1333y implements InterfaceC1297c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9105b = new a(AbstractC1295b.class, 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f9106c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9107a;

    /* JADX INFO: renamed from: Pf.b$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y c(B b10) {
            return b10.C();
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return AbstractC1295b.w(c1320n0.A());
        }
    }

    AbstractC1295b(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f9107a = Ug.a.s(bArr, (byte) i10);
    }

    AbstractC1295b(byte[] bArr, boolean z10) {
        if (z10) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i10 = bArr[0] & 255;
            if (i10 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i10 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.f9107a = bArr;
    }

    public static AbstractC1295b A(Object obj) {
        if (obj == null || (obj instanceof AbstractC1295b)) {
            return (AbstractC1295b) obj;
        }
        if (obj instanceof InterfaceC1301e) {
            AbstractC1333y abstractC1333yG = ((InterfaceC1301e) obj).g();
            if (abstractC1333yG instanceof AbstractC1295b) {
                return (AbstractC1295b) abstractC1333yG;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC1295b) f9105b.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    static AbstractC1295b w(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i10 = bArr[0] & 255;
        if (i10 > 0) {
            if (i10 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b10 = bArr[length - 1];
            if (b10 != ((byte) ((255 << i10) & b10))) {
                return new z0(bArr, false);
            }
        }
        return new C1302e0(bArr, false);
    }

    public static AbstractC1295b y(G g10, boolean z10) {
        return (AbstractC1295b) f9105b.e(g10, z10);
    }

    public byte[] B() {
        byte[] bArr = this.f9107a;
        if (bArr[0] == 0) {
            return Ug.a.k(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String C() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i10 = 0; i10 != encoded.length; i10++) {
                byte b10 = encoded[i10];
                char[] cArr = f9106c;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new C1332x("Internal error encoding BitString: " + e10.getMessage(), e10);
        }
    }

    @Override // Pf.InterfaceC1297c
    public int c() {
        return this.f9107a[0] & 255;
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return g();
    }

    @Override // Pf.InterfaceC1297c
    public InputStream h() {
        byte[] bArr = this.f9107a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        byte[] bArr = this.f9107a;
        if (bArr.length < 2) {
            return 1;
        }
        int i10 = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Ug.a.o(bArr, 0, length) * 257) ^ ((byte) ((255 << i10) & bArr[length]));
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (!(abstractC1333y instanceof AbstractC1295b)) {
            return false;
        }
        byte[] bArr = this.f9107a;
        byte[] bArr2 = ((AbstractC1295b) abstractC1333y).f9107a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i10 = length - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        int i12 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i10] & i12)) == ((byte) (bArr2[i10] & i12));
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        return new C1302e0(this.f9107a, false);
    }

    public String toString() {
        return C();
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        return new z0(this.f9107a, false);
    }

    public byte[] x() {
        byte[] bArr = this.f9107a;
        if (bArr.length == 1) {
            return AbstractC1329u.f9168c;
        }
        int i10 = bArr[0] & 255;
        byte[] bArrK = Ug.a.k(bArr, 1, bArr.length);
        int length = bArrK.length - 1;
        bArrK[length] = (byte) (((byte) (255 << i10)) & bArrK[length]);
        return bArrK;
    }
}
