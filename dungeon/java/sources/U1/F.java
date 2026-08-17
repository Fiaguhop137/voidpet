package U1;

import C9.AbstractC0878v;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f12852d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f12853e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC0878v f12854f = AbstractC0878v.A(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f12855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12857c;

    public F() {
        this.f12855a = S.f12881f;
    }

    public F(int i10) {
        this.f12855a = new byte[i10];
        this.f12857c = i10;
    }

    public F(byte[] bArr) {
        this.f12855a = bArr;
        this.f12857c = bArr.length;
    }

    public F(byte[] bArr, int i10) {
        this.f12855a = bArr;
        this.f12857c = i10;
    }

    private static int c(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return F9.f.i((byte) 0, F9.i.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), F9.i.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), F9.i.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    private void d0(Charset charset) {
        if (r(charset, f12852d) == '\r') {
            r(charset, f12853e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    private int e(Charset charset) {
        int i10;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f12856b;
        while (true) {
            int i12 = this.f12857c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !S.F0(this.f12855a[i11])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.f12855a;
                    if (bArr2[i11] != 0 || !S.F0(bArr2[i11 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.f12855a;
                            if (bArr[i11 + 1] != 0 || !S.F0(bArr[i11])) {
                            }
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.f12855a;
                        if (bArr[i11 + 1] != 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            }
            return i11;
        }
    }

    private static int h(Charset charset) {
        AbstractC1459a.b(f12854f.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean i(byte b10) {
        return (b10 & 192) == 128;
    }

    private char k(ByteOrder byteOrder, int i10) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f12855a;
            int i11 = this.f12856b;
            return F9.b.c(bArr[i11 + i10], bArr[i11 + i10 + 1]);
        }
        byte[] bArr2 = this.f12855a;
        int i12 = this.f12856b;
        return F9.b.c(bArr2[i12 + i10 + 1], bArr2[i12 + i10]);
    }

    private int m(Charset charset) {
        int codePoint;
        int iB;
        AbstractC1459a.b(f12854f.contains(charset), "Unsupported charset: " + charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f12856b + ", limit=" + this.f12857c);
        }
        byte b10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b11 = this.f12855a[this.f12856b];
            if ((b11 & 128) != 0) {
                return 0;
            }
            codePoint = F9.i.b(b11);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bO = o();
            if (bO == 1) {
                iB = F9.i.b(this.f12855a[this.f12856b]);
            } else if (bO == 2) {
                byte[] bArr = this.f12855a;
                int i10 = this.f12856b;
                iB = c(0, 0, bArr[i10], bArr[i10 + 1]);
            } else if (bO == 3) {
                byte[] bArr2 = this.f12855a;
                int i11 = this.f12856b;
                iB = c(0, bArr2[i11] & 15, bArr2[i11 + 1], bArr2[i11 + 2]);
            } else {
                if (bO != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f12855a;
                int i12 = this.f12856b;
                iB = c(bArr3[i12], bArr3[i12 + 1], bArr3[i12 + 2], bArr3[i12 + 3]);
            }
            b10 = bO;
            codePoint = iB;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cK = k(byteOrder, 0);
            if (!Character.isHighSurrogate(cK) || a() < 4) {
                codePoint = cK;
                b10 = 2;
            } else {
                codePoint = Character.toCodePoint(cK, k(byteOrder, 2));
                b10 = 4;
            }
        }
        return (codePoint << 8) | b10;
    }

    private byte o() {
        byte b10 = this.f12855a[this.f12856b];
        if ((b10 & 128) == 0) {
            return (byte) 1;
        }
        if ((b10 & 224) == 192 && a() >= 2 && i(this.f12855a[this.f12856b + 1])) {
            return (byte) 2;
        }
        if ((this.f12855a[this.f12856b] & 240) == 224 && a() >= 3 && i(this.f12855a[this.f12856b + 1]) && i(this.f12855a[this.f12856b + 2])) {
            return (byte) 3;
        }
        return ((this.f12855a[this.f12856b] & 248) == 240 && a() >= 4 && i(this.f12855a[this.f12856b + 1]) && i(this.f12855a[this.f12856b + 2]) && i(this.f12855a[this.f12856b + 3])) ? (byte) 4 : (byte) 0;
    }

    private char r(Charset charset, char[] cArr) {
        int iM;
        if (a() < h(charset) || (iM = m(charset)) == 0) {
            return (char) 0;
        }
        int iA = F9.j.a(iM >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cA = F9.b.a(iA);
        if (!F9.b.b(cArr, cA)) {
            return (char) 0;
        }
        this.f12856b += F9.f.e(iM & 255);
        return cA;
    }

    public short A() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = bArr[i10] & 255;
        this.f12856b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long B() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f12856b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f12856b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f12856b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int C() {
        int iY = y();
        if (iY >= 0) {
            return iY;
        }
        throw new IllegalStateException("Top bit not zero: " + iY);
    }

    public int D() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = bArr[i10] & 255;
        this.f12856b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long E() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f12856b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f12856b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f12856b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f12856b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f12856b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f12856b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f12856b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public String F() {
        return s((char) 0);
    }

    public String G(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f12856b;
        int i12 = (i11 + i10) - 1;
        String strI = S.I(this.f12855a, i11, (i12 >= this.f12857c || this.f12855a[i12] != 0) ? i10 : i10 - 1);
        this.f12856b += i10;
        return strI;
    }

    public short H() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f12856b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String I(int i10) {
        return J(i10, StandardCharsets.UTF_8);
    }

    public String J(int i10, Charset charset) {
        String str = new String(this.f12855a, this.f12856b, i10, charset);
        this.f12856b += i10;
        return str;
    }

    public int K() {
        return (L() << 21) | (L() << 14) | (L() << 7) | L();
    }

    public int L() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        this.f12856b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int M() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f12856b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f12856b = i10 + 4;
        return i13;
    }

    public long N() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f12856b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f12856b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f12856b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int O() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f12856b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f12856b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int P() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int Q() {
        return F9.f.e(R());
    }

    public long R() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f12856b == this.f12857c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jL = L();
            j10 |= (127 & jL) << (i10 * 7);
            if ((jL & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long S() {
        long jE = E();
        if (jE >= 0) {
            return jE;
        }
        throw new IllegalStateException("Top bit not zero: " + jE);
    }

    public int T() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f12856b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long U() {
        int i10;
        int i11;
        long j10 = this.f12855a[this.f12856b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f12855a[this.f12856b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f12856b += i11;
        return j10;
    }

    public Charset V() {
        if (a() >= 3) {
            byte[] bArr = this.f12855a;
            int i10 = this.f12856b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f12856b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f12855a;
        int i11 = this.f12856b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f12856b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f12856b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void W(int i10) {
        Y(b() < i10 ? new byte[i10] : this.f12855a, i10);
    }

    public void X(byte[] bArr) {
        Y(bArr, bArr.length);
    }

    public void Y(byte[] bArr, int i10) {
        this.f12855a = bArr;
        this.f12857c = i10;
        this.f12856b = 0;
    }

    public void Z(int i10) {
        AbstractC1459a.a(i10 >= 0 && i10 <= this.f12855a.length);
        this.f12857c = i10;
    }

    public int a() {
        return Math.max(this.f12857c - this.f12856b, 0);
    }

    public void a0(int i10) {
        AbstractC1459a.a(i10 >= 0 && i10 <= this.f12857c);
        this.f12856b = i10;
    }

    public int b() {
        return this.f12855a.length;
    }

    public void b0(int i10) {
        a0(this.f12856b + i10);
    }

    public void c0() {
        while ((L() & 128) != 0) {
        }
    }

    public void d(int i10) {
        if (i10 > b()) {
            this.f12855a = Arrays.copyOf(this.f12855a, i10);
        }
    }

    public byte[] f() {
        return this.f12855a;
    }

    public int g() {
        return this.f12856b;
    }

    public int j() {
        return this.f12857c;
    }

    public int l(Charset charset) {
        int iM = m(charset);
        if (iM != 0) {
            return F9.f.e(iM >>> 8);
        }
        return 1114112;
    }

    public int n() {
        return this.f12855a[this.f12856b] & 255;
    }

    public void p(E e10, int i10) {
        q(e10.f12848a, 0, i10);
        e10.p(0);
    }

    public void q(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f12855a, this.f12856b, bArr, i10, i11);
        this.f12856b += i11;
    }

    public String s(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f12856b;
        while (i10 < this.f12857c && this.f12855a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f12855a;
        int i11 = this.f12856b;
        String strI = S.I(bArr, i11, i10 - i11);
        this.f12856b = i10;
        if (i10 < this.f12857c) {
            this.f12856b = i10 + 1;
        }
        return strI;
    }

    public double t() {
        return Double.longBitsToDouble(E());
    }

    public int u() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f12856b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f12856b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f12856b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int v() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f12856b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f12856b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public String w() {
        return x(StandardCharsets.UTF_8);
    }

    public String x(Charset charset) {
        AbstractC1459a.b(f12854f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            V();
        }
        String strJ = J(e(charset) - this.f12856b, charset);
        if (this.f12856b == this.f12857c) {
            return strJ;
        }
        d0(charset);
        return strJ;
    }

    public int y() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f12856b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f12856b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f12856b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long z() {
        byte[] bArr = this.f12855a;
        int i10 = this.f12856b;
        int i11 = i10 + 1;
        this.f12856b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f12856b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f12856b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f12856b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f12856b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f12856b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f12856b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f12856b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }
}
