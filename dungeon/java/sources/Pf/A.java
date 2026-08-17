package Pf;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public class A extends AbstractC1333y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final L f9031c = new a(A.class, 13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f9032d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9034b;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return A.y(c1320n0.A(), false);
        }
    }

    private A(byte[] bArr, String str) {
        this.f9033a = bArr;
        this.f9034b = str;
    }

    static boolean B(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z10 = true;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (z10 && (bArr[i10] & 255) == 128) {
                return false;
            }
            z10 = (bArr[i10] & 128) == 0;
        }
        return z10;
    }

    static boolean C(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (i12 < i10) {
                return i11 != 0 && (i11 <= 1 || str.charAt(length) != '0');
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == '.') {
                if (i11 == 0 || (i11 > 1 && str.charAt(length) == '0')) {
                    return false;
                }
                i11 = 0;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    return false;
                }
                i11++;
            }
            length = i12;
        }
    }

    static String D(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        BigInteger bigIntegerShiftLeft = null;
        long j10 = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j10);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j10 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return stringBuffer.toString();
    }

    static byte[] E(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Q0 q10 = new Q0(str);
        while (q10.a()) {
            String strB = q10.b();
            if (strB.length() <= 18) {
                F(byteArrayOutputStream, Long.parseLong(strB));
            } else {
                G(byteArrayOutputStream, new BigInteger(strB));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    static void F(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i10 = 8;
        bArr[8] = (byte) (((int) j10) & 127);
        while (j10 >= 128) {
            j10 >>= 7;
            i10--;
            bArr[i10] = (byte) (((int) j10) | 128);
        }
        byteArrayOutputStream.write(bArr, i10, 9 - i10);
    }

    static void G(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i10 = iBitLength - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i10] = (byte) (bArr[i10] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    static void w(int i10) {
        if (i10 > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
    }

    static void x(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16383) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (C(str, 0)) {
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid relative OID");
    }

    static A y(byte[] bArr, boolean z10) {
        w(bArr.length);
        A a10 = (A) f9032d.get(new C1328t.b(bArr));
        if (a10 != null) {
            return a10;
        }
        if (!B(bArr)) {
            throw new IllegalArgumentException("invalid relative OID contents");
        }
        if (z10) {
            bArr = Ug.a.e(bArr);
        }
        return new A(bArr, null);
    }

    public synchronized String A() {
        try {
            if (this.f9034b == null) {
                this.f9034b = D(this.f9033a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9034b;
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(this.f9033a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (this == abstractC1333y) {
            return true;
        }
        if (abstractC1333y instanceof A) {
            return Ug.a.b(this.f9033a, ((A) abstractC1333y).f9033a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 13, this.f9033a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9033a.length);
    }

    public String toString() {
        return A();
    }
}
