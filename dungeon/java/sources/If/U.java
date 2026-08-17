package If;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements InterfaceC1108j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f5460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1106h f5461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5462c;

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            U u10 = U.this;
            if (u10.f5462c) {
                throw new IOException("closed");
            }
            return (int) Math.min(u10.f5461b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            U.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            U u10 = U.this;
            if (u10.f5462c) {
                throw new IOException("closed");
            }
            if (u10.f5461b.size() == 0) {
                U u11 = U.this;
                if (u11.f5460a.o0(u11.f5461b, 8192L) == -1) {
                    return -1;
                }
            }
            return U.this.f5461b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (U.this.f5462c) {
                throw new IOException("closed");
            }
            AbstractC1103e.b(data.length, i10, i11);
            if (U.this.f5461b.size() == 0) {
                U u10 = U.this;
                if (u10.f5460a.o0(u10.f5461b, 8192L) == -1) {
                    return -1;
                }
            }
            return U.this.f5461b.read(data, i10, i11);
        }

        public String toString() {
            return U.this + ".inputStream()";
        }
    }

    public U(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f5460a = source;
        this.f5461b = new C1106h();
    }

    @Override // If.InterfaceC1108j
    public C1106h B() {
        return this.f5461b;
    }

    @Override // If.InterfaceC1108j
    public String B1() {
        return K0(Long.MAX_VALUE);
    }

    @Override // If.a0
    public b0 C() {
        return this.f5460a.C();
    }

    @Override // If.InterfaceC1108j
    public byte[] F1(long j10) throws EOFException {
        U1(j10);
        return this.f5461b.F1(j10);
    }

    @Override // If.InterfaceC1108j
    public long G3(C1109k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return b(bytes, 0L);
    }

    @Override // If.InterfaceC1108j
    public long H0(byte b10, long j10, long j11) {
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jH0 = this.f5461b.H0(b11, jMax, j12);
            if (jH0 != -1) {
                return jH0;
            }
            long size = this.f5461b.size();
            if (size >= j12 || this.f5460a.o0(this.f5461b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // If.InterfaceC1108j
    public int H3(O options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iE = Jf.a.e(this.f5461b, options, true);
            if (iE != -2) {
                if (iE == -1) {
                    return -1;
                }
                this.f5461b.skip(options.i()[iE].M());
                return iE;
            }
        } while (this.f5460a.o0(this.f5461b, 8192L) != -1);
        return -1;
    }

    @Override // If.InterfaceC1108j
    public short I1() throws EOFException {
        U1(2L);
        return this.f5461b.I1();
    }

    @Override // If.InterfaceC1108j
    public long I2() throws EOFException {
        U1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!u1(j11)) {
                break;
            }
            byte bO = this.f5461b.o(j10);
            if ((bO < 48 || bO > 57) && !(j10 == 0 && bO == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bO, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.f5461b.I2();
    }

    @Override // If.InterfaceC1108j
    public long J3(Y sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f5460a.o0(this.f5461b, 8192L) != -1) {
            long jE = this.f5461b.e();
            if (jE > 0) {
                j10 += jE;
                sink.w1(this.f5461b, jE);
            }
        }
        if (this.f5461b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f5461b.size();
        C1106h c1106h = this.f5461b;
        sink.w1(c1106h, c1106h.size());
        return size;
    }

    @Override // If.InterfaceC1108j
    public String K0(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jH0 = H0((byte) 10, 0L, j11);
        if (jH0 != -1) {
            return Jf.a.d(this.f5461b, jH0);
        }
        if (j11 < Long.MAX_VALUE && u1(j11) && this.f5461b.o(j11 - 1) == 13 && u1(j11 + 1) && this.f5461b.o(j11) == 10) {
            return Jf.a.d(this.f5461b, j11);
        }
        C1106h c1106h = new C1106h();
        C1106h c1106h2 = this.f5461b;
        c1106h2.g(c1106h, 0L, Math.min(32, c1106h2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f5461b.size(), j10) + " content=" + c1106h.z().w() + (char) 8230);
    }

    @Override // If.InterfaceC1108j
    public long M1() throws EOFException {
        U1(8L);
        return this.f5461b.M1();
    }

    @Override // If.InterfaceC1108j
    public void U1(long j10) throws EOFException {
        if (!u1(j10)) {
            throw new EOFException();
        }
    }

    @Override // If.InterfaceC1108j
    public long V3() throws EOFException {
        U1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!u1(i11)) {
                break;
            }
            byte bO = this.f5461b.o(i10);
            if ((bO < 48 || bO > 57) && ((bO < 97 || bO > 102) && (bO < 65 || bO > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bO, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.f5461b.V3();
    }

    @Override // If.InterfaceC1108j
    public InputStream Y() {
        return new a();
    }

    public long a(byte b10) {
        return H0(b10, 0L, Long.MAX_VALUE);
    }

    public long b(C1109k bytes, long j10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jP = this.f5461b.p(bytes, j10);
            if (jP != -1) {
                return jP;
            }
            long size = this.f5461b.size();
            if (this.f5460a.o0(this.f5461b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) bytes.M())) + 1);
        }
    }

    @Override // If.InterfaceC1108j
    public String b3(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f5461b.U0(this.f5460a);
        return this.f5461b.b3(charset);
    }

    public long c(C1109k targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jR = this.f5461b.r(targetBytes, j10);
            if (jR != -1) {
                return jR;
            }
            long size = this.f5461b.size();
            if (this.f5460a.o0(this.f5461b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f5462c) {
            return;
        }
        this.f5462c = true;
        this.f5460a.close();
        this.f5461b.c();
    }

    public boolean d(long j10, C1109k bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.M() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!u1(1 + j11) || this.f5461b.o(j11) != bytes.r(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // If.InterfaceC1108j
    public C1106h g0() {
        return this.f5461b;
    }

    @Override // If.InterfaceC1108j
    public boolean h1(long j10, C1109k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return d(j10, bytes, 0, bytes.M());
    }

    @Override // If.InterfaceC1108j
    public String h2(long j10) throws EOFException {
        U1(j10);
        return this.f5461b.h2(j10);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f5462c;
    }

    @Override // If.InterfaceC1108j
    public C1109k k2(long j10) throws EOFException {
        U1(j10);
        return this.f5461b.k2(j10);
    }

    @Override // If.InterfaceC1108j
    public long m2(C1109k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return c(targetBytes, 0L);
    }

    @Override // If.InterfaceC1108j
    public void m3(C1106h sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            U1(j10);
            this.f5461b.m3(sink, j10);
        } catch (EOFException e10) {
            sink.U0(this.f5461b);
            throw e10;
        }
    }

    @Override // If.a0
    public long o0(C1106h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        if (this.f5461b.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f5460a.o0(this.f5461b, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f5461b.o0(sink, Math.min(j10, this.f5461b.size()));
    }

    @Override // If.InterfaceC1108j
    public InterfaceC1108j peek() {
        return K.d(new S(this));
    }

    @Override // If.InterfaceC1108j
    public int r3() throws EOFException {
        U1(4L);
        return this.f5461b.r3();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f5461b.size() == 0 && this.f5460a.o0(this.f5461b, 8192L) == -1) {
            return -1;
        }
        return this.f5461b.read(sink);
    }

    @Override // If.InterfaceC1108j
    public byte readByte() throws EOFException {
        U1(1L);
        return this.f5461b.readByte();
    }

    @Override // If.InterfaceC1108j
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            U1(sink.length);
            this.f5461b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f5461b.size() > 0) {
                C1106h c1106h = this.f5461b;
                int i11 = c1106h.read(sink, i10, (int) c1106h.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // If.InterfaceC1108j
    public int readInt() throws EOFException {
        U1(4L);
        return this.f5461b.readInt();
    }

    @Override // If.InterfaceC1108j
    public long readLong() throws EOFException {
        U1(8L);
        return this.f5461b.readLong();
    }

    @Override // If.InterfaceC1108j
    public short readShort() throws EOFException {
        U1(2L);
        return this.f5461b.readShort();
    }

    @Override // If.InterfaceC1108j
    public void skip(long j10) throws EOFException {
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f5461b.size() == 0 && this.f5460a.o0(this.f5461b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f5461b.size());
            this.f5461b.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f5460a + ')';
    }

    @Override // If.InterfaceC1108j
    public boolean u1(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        while (this.f5461b.size() < j10) {
            if (this.f5460a.o0(this.f5461b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // If.InterfaceC1108j
    public String x3() {
        this.f5461b.U0(this.f5460a);
        return this.f5461b.x3();
    }

    @Override // If.InterfaceC1108j
    public byte[] y2() {
        this.f5461b.U0(this.f5460a);
        return this.f5461b.y2();
    }

    @Override // If.InterfaceC1108j
    public boolean z2() {
        if (this.f5462c) {
            throw new IllegalStateException("closed");
        }
        return this.f5461b.z2() && this.f5460a.o0(this.f5461b, 8192L) == -1;
    }
}
