package If;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: If.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1106h implements InterfaceC1108j, InterfaceC1107i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V f5512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5513b;

    /* JADX INFO: renamed from: If.h$a */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1106h f5514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V f5516c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f5518e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f5517d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5519f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5520g = -1;

        public final V a() {
            return this.f5516c;
        }

        public final int b() {
            long j10 = this.f5517d;
            C1106h c1106h = this.f5514a;
            Intrinsics.c(c1106h);
            if (j10 == c1106h.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f5517d;
            return d(j11 == -1 ? 0L : j11 + ((long) (this.f5520g - this.f5519f)));
        }

        public final long c(long j10) {
            C1106h c1106h = this.f5514a;
            if (c1106h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f5515b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c1106h.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (j11 > 0) {
                    V v10 = c1106h.f5512a;
                    Intrinsics.c(v10);
                    V v11 = v10.f5471g;
                    Intrinsics.c(v11);
                    int i10 = v11.f5467c;
                    long j12 = i10 - v11.f5466b;
                    if (j12 > j11) {
                        v11.f5467c = i10 - ((int) j11);
                        break;
                    }
                    c1106h.f5512a = v11.b();
                    W.b(v11);
                    j11 -= j12;
                }
                e(null);
                this.f5517d = j10;
                this.f5518e = null;
                this.f5519f = -1;
                this.f5520g = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    V vS = c1106h.S(1);
                    int iMin = (int) Math.min(j13, 8192 - vS.f5467c);
                    vS.f5467c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        e(vS);
                        this.f5517d = size;
                        this.f5518e = vS.f5465a;
                        int i11 = vS.f5467c;
                        this.f5519f = i11 - iMin;
                        this.f5520g = i11;
                        z10 = false;
                    }
                }
            }
            c1106h.K(j10);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5514a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f5514a = null;
            e(null);
            this.f5517d = -1L;
            this.f5518e = null;
            this.f5519f = -1;
            this.f5520g = -1;
        }

        public final int d(long j10) {
            V vC;
            C1106h c1106h = this.f5514a;
            if (c1106h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c1106h.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c1106h.size());
            }
            if (j10 == -1 || j10 == c1106h.size()) {
                e(null);
                this.f5517d = j10;
                this.f5518e = null;
                this.f5519f = -1;
                this.f5520g = -1;
                return -1;
            }
            long size = c1106h.size();
            V vA = c1106h.f5512a;
            long j11 = 0;
            if (a() != null) {
                long j12 = this.f5517d;
                int i10 = this.f5519f;
                V vA2 = a();
                Intrinsics.c(vA2);
                long j13 = j12 - ((long) (i10 - vA2.f5466b));
                if (j13 > j10) {
                    vC = vA;
                    vA = a();
                    size = j13;
                } else {
                    vC = a();
                    j11 = j13;
                }
            } else {
                vC = vA;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    Intrinsics.c(vC);
                    int i11 = vC.f5467c;
                    int i12 = vC.f5466b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    vC = vC.f5470f;
                }
            } else {
                while (size > j10) {
                    Intrinsics.c(vA);
                    vA = vA.f5471g;
                    Intrinsics.c(vA);
                    size -= (long) (vA.f5467c - vA.f5466b);
                }
                j11 = size;
                vC = vA;
            }
            if (this.f5515b) {
                Intrinsics.c(vC);
                if (vC.f5468d) {
                    V vF = vC.f();
                    if (c1106h.f5512a == vC) {
                        c1106h.f5512a = vF;
                    }
                    vC = vC.c(vF);
                    V v10 = vC.f5471g;
                    Intrinsics.c(v10);
                    v10.b();
                }
            }
            e(vC);
            this.f5517d = j10;
            Intrinsics.c(vC);
            this.f5518e = vC.f5465a;
            int i13 = vC.f5466b + ((int) (j10 - j11));
            this.f5519f = i13;
            int i14 = vC.f5467c;
            this.f5520g = i14;
            return i14 - i13;
        }

        public final void e(V v10) {
            this.f5516c = v10;
        }
    }

    /* JADX INFO: renamed from: If.h$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C1106h.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C1106h.this.size() > 0) {
                return C1106h.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C1106h.this.read(sink, i10, i11);
        }

        public String toString() {
            return C1106h.this + ".inputStream()";
        }
    }

    /* JADX INFO: renamed from: If.h$c */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C1106h.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C1106h.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            C1106h.this.write(data, i10, i11);
        }
    }

    public static /* synthetic */ a x(C1106h c1106h, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC1103e.d();
        }
        return c1106h.u(aVar);
    }

    @Override // If.InterfaceC1108j
    public C1106h B() {
        return this;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C1106h Z0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return n1(string, 0, string.length());
    }

    @Override // If.InterfaceC1108j
    public String B1() {
        return K0(Long.MAX_VALUE);
    }

    @Override // If.a0
    public b0 C() {
        return b0.f5484e;
    }

    public String F(long j10, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f5513b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        int i10 = v10.f5466b;
        if (((long) i10) + j10 > v10.f5467c) {
            return new String(F1(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(v10.f5465a, i10, i11, charset);
        int i12 = v10.f5466b + i11;
        v10.f5466b = i12;
        this.f5513b -= j10;
        if (i12 == v10.f5467c) {
            this.f5512a = v10.b();
            W.b(v10);
        }
        return str;
    }

    @Override // If.InterfaceC1108j
    public byte[] F1(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C1106h n1(String string, int i10, int i11) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                V vS = S(1);
                byte[] bArr = vS.f5465a;
                int i12 = vS.f5467c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = vS.f5467c;
                int i15 = (i12 + i10) - i14;
                vS.f5467c = i14 + i15;
                K(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    V vS2 = S(2);
                    byte[] bArr2 = vS2.f5465a;
                    int i16 = vS2.f5467c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    vS2.f5467c = i16 + 2;
                    K(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    V vS3 = S(3);
                    byte[] bArr3 = vS3.f5465a;
                    int i17 = vS3.f5467c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    vS3.f5467c = i17 + 3;
                    K(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        V vS4 = S(4);
                        byte[] bArr4 = vS4.f5465a;
                        int i20 = vS4.f5467c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        vS4.f5467c = i20 + 4;
                        K(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // If.InterfaceC1108j
    public long G3(C1109k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return p(bytes, 0L);
    }

    @Override // If.InterfaceC1108j
    public long H0(byte b10, long j10, long j11) {
        V v10;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (v10 = this.f5512a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                v10 = v10.f5471g;
                Intrinsics.c(v10);
                size -= (long) (v10.f5467c - v10.f5466b);
            }
            while (size < j11) {
                byte[] bArr = v10.f5465a;
                int iMin = (int) Math.min(v10.f5467c, (((long) v10.f5466b) + j11) - size);
                i10 = (int) ((((long) v10.f5466b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (v10.f5467c - v10.f5466b);
                v10 = v10.f5470f;
                Intrinsics.c(v10);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (v10.f5467c - v10.f5466b)) + size;
            if (j12 > j10) {
                break;
            }
            v10 = v10.f5470f;
            Intrinsics.c(v10);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = v10.f5465a;
            int iMin2 = (int) Math.min(v10.f5467c, (((long) v10.f5466b) + j11) - size);
            i10 = (int) ((((long) v10.f5466b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (v10.f5467c - v10.f5466b);
            v10 = v10.f5470f;
            Intrinsics.c(v10);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - v10.f5466b)) + size;
    }

    @Override // If.InterfaceC1108j
    public int H3(O options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iF = Jf.a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        skip(options.i()[iF].M());
        return iF;
    }

    @Override // If.InterfaceC1108j
    public short I1() {
        return AbstractC1103e.j(readShort());
    }

    @Override // If.InterfaceC1108j
    public long I2() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            V v10 = this.f5512a;
            Intrinsics.c(v10);
            byte[] bArr = v10.f5465a;
            int i11 = v10.f5466b;
            int i12 = v10.f5467c;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                this.f5512a = v10.b();
                W.b(v10);
            } else {
                v10.f5466b = i11;
            }
            if (z11 || this.f5512a == null) {
                K(size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (size() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC1103e.k(o(j10)));
            }
            j11 = j10;
        }
        C1106h c1106hWriteByte = new C1106h().Y1(j12).writeByte(b10);
        if (!z10) {
            c1106hWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + c1106hWriteByte.x3());
    }

    public C1106h J0(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            V vS = S(2);
            byte[] bArr = vS.f5465a;
            int i11 = vS.f5467c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            vS.f5467c = i11 + 2;
            K(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            V vS2 = S(3);
            byte[] bArr2 = vS2.f5465a;
            int i12 = vS2.f5467c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            vS2.f5467c = i12 + 3;
            K(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC1103e.l(i10));
        }
        V vS3 = S(4);
        byte[] bArr3 = vS3.f5465a;
        int i13 = vS3.f5467c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        vS3.f5467c = i13 + 4;
        K(size() + 4);
        return this;
    }

    @Override // If.InterfaceC1108j
    public long J3(Y sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.w1(this, size);
        }
        return size;
    }

    public final void K(long j10) {
        this.f5513b = j10;
    }

    @Override // If.InterfaceC1108j
    public String K0(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jH0 = H0((byte) 10, 0L, j11);
        if (jH0 != -1) {
            return Jf.a.d(this, jH0);
        }
        if (j11 < size() && o(j11 - 1) == 13 && o(j11) == 10) {
            return Jf.a.d(this, j11);
        }
        C1106h c1106h = new C1106h();
        g(c1106h, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c1106h.z().w() + (char) 8230);
    }

    @Override // If.InterfaceC1108j
    public long M1() {
        return AbstractC1103e.i(readLong());
    }

    public final C1109k O() {
        if (size() <= 2147483647L) {
            return P((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final C1109k P(int i10) {
        if (i10 == 0) {
            return C1109k.f5524e;
        }
        AbstractC1103e.b(size(), 0L, i10);
        V v10 = this.f5512a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.c(v10);
            int i14 = v10.f5467c;
            int i15 = v10.f5466b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            v10 = v10.f5470f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        V v11 = this.f5512a;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.c(v11);
            bArr[i16] = v11.f5465a;
            i11 += v11.f5467c - v11.f5466b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = v11.f5466b;
            v11.f5468d = true;
            i16++;
            v11 = v11.f5470f;
        }
        return new X(bArr, iArr);
    }

    public final V S(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        V v10 = this.f5512a;
        if (v10 != null) {
            Intrinsics.c(v10);
            V v11 = v10.f5471g;
            Intrinsics.c(v11);
            return (v11.f5467c + i10 > 8192 || !v11.f5469e) ? v11.c(W.c()) : v11;
        }
        V vC = W.c();
        this.f5512a = vC;
        vC.f5471g = vC;
        vC.f5470f = vC;
        return vC;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C1106h C2(C1109k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.T(this, 0, byteString.M());
        return this;
    }

    @Override // If.InterfaceC1107i
    public long U0(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jO0 = source.o0(this, 8192L);
            if (jO0 == -1) {
                return j10;
            }
            j10 += jO0;
        }
    }

    @Override // If.InterfaceC1108j
    public void U1(long j10) throws EOFException {
        if (this.f5513b < j10) {
            throw new EOFException();
        }
    }

    public C1106h V(a0 source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long jO0 = source.o0(this, j10);
            if (jO0 == -1) {
                throw new EOFException();
            }
            j10 -= jO0;
        }
        return this;
    }

    @Override // If.InterfaceC1108j
    public long V3() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            V v10 = this.f5512a;
            Intrinsics.c(v10);
            byte[] bArr = v10.f5465a;
            int i12 = v10.f5466b;
            int i13 = v10.f5467c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC1103e.k(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new C1106h().h3(j10).writeByte(b10).x3());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f5512a = v10.b();
                W.b(v10);
            } else {
                v10.f5466b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f5512a != null);
        K(size() - ((long) i11));
        return j10;
    }

    @Override // If.InterfaceC1107i
    public OutputStream X() {
        return new c();
    }

    @Override // If.InterfaceC1108j
    public InputStream Y() {
        return new b();
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C1106h write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    public final long b() {
        return this.f5513b;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C1106h write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        AbstractC1103e.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            V vS = S(1);
            int iMin = Math.min(i12 - i10, 8192 - vS.f5467c);
            int i13 = i10 + iMin;
            AbstractC3952n.h(source, vS.f5465a, vS.f5467c, i10, i13);
            vS.f5467c += iMin;
            i10 = i13;
        }
        K(size() + j10);
        return this;
    }

    @Override // If.InterfaceC1108j
    public String b3(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return F(this.f5513b, charset);
    }

    public final void c() throws EOFException {
        skip(size());
    }

    @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1106h clone() {
        return f();
    }

    public final long e() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        V v11 = v10.f5471g;
        Intrinsics.c(v11);
        int i10 = v11.f5467c;
        return (i10 >= 8192 || !v11.f5469e) ? size : size - ((long) (i10 - v11.f5466b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1106h)) {
            return false;
        }
        C1106h c1106h = (C1106h) obj;
        if (size() != c1106h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        V v11 = c1106h.f5512a;
        Intrinsics.c(v11);
        int i10 = v10.f5466b;
        int i11 = v11.f5466b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(v10.f5467c - i10, v11.f5467c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (v10.f5465a[i10] != v11.f5465a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == v10.f5467c) {
                v10 = v10.f5470f;
                Intrinsics.c(v10);
                i10 = v10.f5466b;
            }
            if (i11 == v11.f5467c) {
                v11 = v11.f5470f;
                Intrinsics.c(v11);
                i11 = v11.f5466b;
            }
            j10 += jMin;
        }
        return true;
    }

    public final C1106h f() {
        C1106h c1106h = new C1106h();
        if (size() == 0) {
            return c1106h;
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        V vD = v10.d();
        c1106h.f5512a = vD;
        vD.f5471g = vD;
        vD.f5470f = vD;
        for (V v11 = v10.f5470f; v11 != v10; v11 = v11.f5470f) {
            V v12 = vD.f5471g;
            Intrinsics.c(v12);
            Intrinsics.c(v11);
            v12.c(v11.d());
        }
        c1106h.K(size());
        return c1106h;
    }

    @Override // If.InterfaceC1107i, If.Y, java.io.Flushable
    public void flush() {
    }

    public final C1106h g(C1106h out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        AbstractC1103e.b(size(), j12, j11);
        if (j11 != 0) {
            out.K(out.size() + j11);
            V v10 = this.f5512a;
            while (true) {
                Intrinsics.c(v10);
                int i10 = v10.f5467c;
                int i11 = v10.f5466b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                v10 = v10.f5470f;
            }
            V v11 = v10;
            long j13 = j11;
            while (j13 > 0) {
                Intrinsics.c(v11);
                V vD = v11.d();
                int i12 = vD.f5466b + ((int) j12);
                vD.f5466b = i12;
                vD.f5467c = Math.min(i12 + ((int) j13), vD.f5467c);
                V v12 = out.f5512a;
                if (v12 == null) {
                    vD.f5471g = vD;
                    vD.f5470f = vD;
                    out.f5512a = vD;
                } else {
                    Intrinsics.c(v12);
                    V v13 = v12.f5471g;
                    Intrinsics.c(v13);
                    v13.c(vD);
                }
                j13 -= (long) (vD.f5467c - vD.f5466b);
                v11 = v11.f5470f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // If.InterfaceC1108j
    public C1106h g0() {
        return this;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1106h j0() {
        return this;
    }

    @Override // If.InterfaceC1108j
    public boolean h1(long j10, C1109k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return s(j10, bytes, 0, bytes.M());
    }

    @Override // If.InterfaceC1108j
    public String h2(long j10) throws EOFException {
        return F(j10, Charsets.UTF_8);
    }

    public int hashCode() {
        V v10 = this.f5512a;
        if (v10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = v10.f5467c;
            for (int i12 = v10.f5466b; i12 < i11; i12++) {
                i10 = (i10 * 31) + v10.f5465a[i12];
            }
            v10 = v10.f5470f;
            Intrinsics.c(v10);
        } while (v10 != this.f5512a);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // If.InterfaceC1108j
    public C1109k k2(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C1109k(F1(j10));
        }
        C1109k c1109kP = P((int) j10);
        skip(j10);
        return c1109kP;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1106h I0() {
        return this;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C1106h writeByte(int i10) {
        V vS = S(1);
        byte[] bArr = vS.f5465a;
        int i11 = vS.f5467c;
        vS.f5467c = i11 + 1;
        bArr[i11] = (byte) i10;
        K(size() + 1);
        return this;
    }

    @Override // If.InterfaceC1108j
    public long m2(C1109k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return r(targetBytes, 0L);
    }

    @Override // If.InterfaceC1108j
    public void m3(C1106h sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.w1(this, j10);
        } else {
            sink.w1(this, size());
            throw new EOFException();
        }
    }

    public final byte o(long j10) {
        AbstractC1103e.b(size(), j10, 1L);
        V v10 = this.f5512a;
        if (v10 == null) {
            Intrinsics.c(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                v10 = v10.f5471g;
                Intrinsics.c(v10);
                size -= (long) (v10.f5467c - v10.f5466b);
            }
            Intrinsics.c(v10);
            return v10.f5465a[(int) ((((long) v10.f5466b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (v10.f5467c - v10.f5466b)) + j11;
            if (j12 > j10) {
                Intrinsics.c(v10);
                return v10.f5465a[(int) ((((long) v10.f5466b) + j10) - j11)];
            }
            v10 = v10.f5470f;
            Intrinsics.c(v10);
            j11 = j12;
        }
    }

    @Override // If.a0
    public long o0(C1106h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.w1(this, j10);
        return j10;
    }

    public long p(C1109k bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.M() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        V v10 = this.f5512a;
        if (v10 == null) {
            return -1L;
        }
        if (size() - j11 >= j11) {
            while (true) {
                long j12 = ((long) (v10.f5467c - v10.f5466b)) + size;
                if (j12 > j11) {
                    break;
                }
                v10 = v10.f5470f;
                Intrinsics.c(v10);
                size = j12;
            }
            byte[] bArrA = bytes.A();
            byte b10 = bArrA[0];
            int iM = bytes.M();
            long size2 = (size() - ((long) iM)) + 1;
            while (size < size2) {
                byte[] bArr = v10.f5465a;
                int iMin = (int) Math.min(v10.f5467c, (((long) v10.f5466b) + size2) - size);
                i10 = (int) ((((long) v10.f5466b) + j11) - size);
                while (i10 < iMin) {
                    if (bArr[i10] == b10 && Jf.a.c(v10, i10 + 1, bArrA, 1, iM)) {
                    }
                    i10++;
                }
                size += (long) (v10.f5467c - v10.f5466b);
                v10 = v10.f5470f;
                Intrinsics.c(v10);
                j11 = size;
            }
            return -1L;
        }
        size = size();
        while (size > j11) {
            v10 = v10.f5471g;
            Intrinsics.c(v10);
            size -= (long) (v10.f5467c - v10.f5466b);
        }
        byte[] bArrA2 = bytes.A();
        byte b11 = bArrA2[0];
        int iM2 = bytes.M();
        long size3 = (size() - ((long) iM2)) + 1;
        while (size < size3) {
            byte[] bArr2 = v10.f5465a;
            long j13 = size3;
            int iMin2 = (int) Math.min(v10.f5467c, (((long) v10.f5466b) + size3) - size);
            i10 = (int) ((((long) v10.f5466b) + j11) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b11 || !Jf.a.c(v10, i10 + 1, bArrA2, 1, iM2)) {
                    i10++;
                }
            }
            size += (long) (v10.f5467c - v10.f5466b);
            v10 = v10.f5470f;
            Intrinsics.c(v10);
            j11 = size;
            size3 = j13;
        }
        return -1L;
        return ((long) (i10 - v10.f5466b)) + size;
    }

    @Override // If.InterfaceC1108j
    public InterfaceC1108j peek() {
        return K.d(new S(this));
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C1106h Y1(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return Z0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        V vS = S(i10);
        byte[] bArr = vS.f5465a;
        int i11 = vS.f5467c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = Jf.a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        vS.f5467c += i10;
        K(size() + ((long) i10));
        return this;
    }

    public long r(C1109k targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        V v10 = this.f5512a;
        if (v10 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                v10 = v10.f5471g;
                Intrinsics.c(v10);
                size -= (long) (v10.f5467c - v10.f5466b);
            }
            if (targetBytes.M() == 2) {
                byte bR = targetBytes.r(0);
                byte bR2 = targetBytes.r(1);
                while (size < size()) {
                    byte[] bArr = v10.f5465a;
                    i10 = (int) ((((long) v10.f5466b) + j10) - size);
                    int i12 = v10.f5467c;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (v10.f5467c - v10.f5466b);
                            v10 = v10.f5470f;
                            Intrinsics.c(v10);
                            j10 = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bR || b10 == bR2) {
                                i11 = v10.f5466b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrA = targetBytes.A();
                while (size < size()) {
                    byte[] bArr2 = v10.f5465a;
                    i10 = (int) ((((long) v10.f5466b) + j10) - size);
                    int i13 = v10.f5467c;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrA.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrA[i14]) {
                                    i11 = v10.f5466b;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (v10.f5467c - v10.f5466b);
                            v10 = v10.f5470f;
                            Intrinsics.c(v10);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (v10.f5467c - v10.f5466b)) + size;
            if (j11 > j10) {
                break;
            }
            v10 = v10.f5470f;
            Intrinsics.c(v10);
            size = j11;
        }
        if (targetBytes.M() == 2) {
            byte bR3 = targetBytes.r(0);
            byte bR4 = targetBytes.r(1);
            while (size < size()) {
                byte[] bArr3 = v10.f5465a;
                i10 = (int) ((((long) v10.f5466b) + j10) - size);
                int i15 = v10.f5467c;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (v10.f5467c - v10.f5466b);
                        v10 = v10.f5470f;
                        Intrinsics.c(v10);
                        j10 = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bR3 || b12 == bR4) {
                            i11 = v10.f5466b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrA2 = targetBytes.A();
            while (size < size()) {
                byte[] bArr4 = v10.f5465a;
                i10 = (int) ((((long) v10.f5466b) + j10) - size);
                int i16 = v10.f5467c;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrA2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrA2[i17]) {
                                i11 = v10.f5466b;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (v10.f5467c - v10.f5466b);
                        v10 = v10.f5470f;
                        Intrinsics.c(v10);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C1106h h3(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        V vS = S(i10);
        byte[] bArr = vS.f5465a;
        int i11 = vS.f5467c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = Jf.a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        vS.f5467c += i10;
        K(size() + ((long) i10));
        return this;
    }

    @Override // If.InterfaceC1108j
    public int r3() {
        return AbstractC1103e.h(readInt());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        V v10 = this.f5512a;
        if (v10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), v10.f5467c - v10.f5466b);
        sink.put(v10.f5465a, v10.f5466b, iMin);
        int i10 = v10.f5466b + iMin;
        v10.f5466b = i10;
        this.f5513b -= (long) iMin;
        if (i10 == v10.f5467c) {
            this.f5512a = v10.b();
            W.b(v10);
        }
        return iMin;
    }

    public int read(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC1103e.b(sink.length, i10, i11);
        V v10 = this.f5512a;
        if (v10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, v10.f5467c - v10.f5466b);
        byte[] bArr = v10.f5465a;
        int i12 = v10.f5466b;
        AbstractC3952n.h(bArr, sink, i10, i12, i12 + iMin);
        v10.f5466b += iMin;
        K(size() - ((long) iMin));
        if (v10.f5466b == v10.f5467c) {
            this.f5512a = v10.b();
            W.b(v10);
        }
        return iMin;
    }

    @Override // If.InterfaceC1108j
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        int i10 = v10.f5466b;
        int i11 = v10.f5467c;
        int i12 = i10 + 1;
        byte b10 = v10.f5465a[i10];
        K(size() - 1);
        if (i12 != i11) {
            v10.f5466b = i12;
            return b10;
        }
        this.f5512a = v10.b();
        W.b(v10);
        return b10;
    }

    @Override // If.InterfaceC1108j
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // If.InterfaceC1108j
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        int i10 = v10.f5466b;
        int i11 = v10.f5467c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = v10.f5465a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        K(size() - 4);
        if (i14 != i11) {
            v10.f5466b = i14;
            return i15;
        }
        this.f5512a = v10.b();
        W.b(v10);
        return i15;
    }

    @Override // If.InterfaceC1108j
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        int i10 = v10.f5466b;
        int i11 = v10.f5467c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = v10.f5465a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        K(size() - 8);
        if (i13 != i11) {
            v10.f5466b = i13;
            return j11;
        }
        this.f5512a = v10.b();
        W.b(v10);
        return j11;
    }

    @Override // If.InterfaceC1108j
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        V v10 = this.f5512a;
        Intrinsics.c(v10);
        int i10 = v10.f5466b;
        int i11 = v10.f5467c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = v10.f5465a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        K(size() - 2);
        if (i14 == i11) {
            this.f5512a = v10.b();
            W.b(v10);
        } else {
            v10.f5466b = i14;
        }
        return (short) i15;
    }

    public boolean s(long j10, C1109k bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.M() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (o(((long) i12) + j10) != bytes.r(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C1106h writeInt(int i10) {
        V vS = S(4);
        byte[] bArr = vS.f5465a;
        int i11 = vS.f5467c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        vS.f5467c = i11 + 4;
        K(size() + 4);
        return this;
    }

    public final long size() {
        return this.f5513b;
    }

    @Override // If.InterfaceC1108j
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            V v10 = this.f5512a;
            if (v10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, v10.f5467c - v10.f5466b);
            long j11 = iMin;
            K(size() - j11);
            j10 -= j11;
            int i10 = v10.f5466b + iMin;
            v10.f5466b = i10;
            if (i10 == v10.f5467c) {
                this.f5512a = v10.b();
                W.b(v10);
            }
        }
    }

    public C1106h t0(long j10) {
        V vS = S(8);
        byte[] bArr = vS.f5465a;
        int i10 = vS.f5467c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        vS.f5467c = i10 + 8;
        K(size() + 8);
        return this;
    }

    public String toString() {
        return O().toString();
    }

    public final a u(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return Jf.a.a(this, unsafeCursor);
    }

    @Override // If.InterfaceC1107i
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C1106h writeShort(int i10) {
        V vS = S(2);
        byte[] bArr = vS.f5465a;
        int i11 = vS.f5467c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        vS.f5467c = i11 + 2;
        K(size() + 2);
        return this;
    }

    @Override // If.InterfaceC1108j
    public boolean u1(long j10) {
        return this.f5513b >= j10;
    }

    @Override // If.Y
    public void w1(C1106h source, long j10) {
        V v10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1103e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            V v11 = source.f5512a;
            Intrinsics.c(v11);
            int i10 = v11.f5467c;
            V v12 = source.f5512a;
            Intrinsics.c(v12);
            if (j10 < i10 - v12.f5466b) {
                V v13 = this.f5512a;
                if (v13 != null) {
                    Intrinsics.c(v13);
                    v10 = v13.f5471g;
                } else {
                    v10 = null;
                }
                if (v10 != null && v10.f5469e) {
                    if ((((long) v10.f5467c) + j10) - ((long) (v10.f5468d ? 0 : v10.f5466b)) <= 8192) {
                        V v14 = source.f5512a;
                        Intrinsics.c(v14);
                        v14.g(v10, (int) j10);
                        source.K(source.size() - j10);
                        K(size() + j10);
                        return;
                    }
                }
                V v15 = source.f5512a;
                Intrinsics.c(v15);
                source.f5512a = v15.e((int) j10);
            }
            V v16 = source.f5512a;
            Intrinsics.c(v16);
            long j11 = v16.f5467c - v16.f5466b;
            source.f5512a = v16.b();
            V v17 = this.f5512a;
            if (v17 == null) {
                this.f5512a = v16;
                v16.f5471g = v16;
                v16.f5470f = v16;
            } else {
                Intrinsics.c(v17);
                V v18 = v17.f5471g;
                Intrinsics.c(v18);
                v18.c(v16).a();
            }
            source.K(source.size() - j11);
            K(size() + j11);
            j10 -= j11;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            V vS = S(1);
            int iMin = Math.min(i10, 8192 - vS.f5467c);
            source.get(vS.f5465a, vS.f5467c, iMin);
            i10 -= iMin;
            vS.f5467c += iMin;
        }
        this.f5513b += (long) iRemaining;
        return iRemaining;
    }

    @Override // If.InterfaceC1108j
    public String x3() {
        return F(this.f5513b, Charsets.UTF_8);
    }

    public C1106h y0(String string, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (Intrinsics.b(charset, Charsets.UTF_8)) {
            return n1(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // If.InterfaceC1108j
    public byte[] y2() {
        return F1(size());
    }

    public C1109k z() {
        return k2(size());
    }

    public C1106h z0(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return y0(string, 0, string.length(), charset);
    }

    @Override // If.InterfaceC1108j
    public boolean z2() {
        return this.f5513b == 0;
    }
}
