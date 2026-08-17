package If;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements InterfaceC1107i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f5456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1106h f5457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5458c;

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            T.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            T t10 = T.this;
            if (t10.f5458c) {
                return;
            }
            t10.flush();
        }

        public String toString() {
            return T.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            T t10 = T.this;
            if (t10.f5458c) {
                throw new IOException("closed");
            }
            t10.f5457b.writeByte((byte) i10);
            T.this.I0();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            T t10 = T.this;
            if (t10.f5458c) {
                throw new IOException("closed");
            }
            t10.f5457b.write(data, i10, i11);
            T.this.I0();
        }
    }

    public T(Y sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f5456a = sink;
        this.f5457b = new C1106h();
    }

    @Override // If.InterfaceC1107i
    public C1106h B() {
        return this.f5457b;
    }

    @Override // If.Y
    public b0 C() {
        return this.f5456a.C();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i C2(C1109k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.C2(byteString);
        return I0();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i I0() {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        long jE = this.f5457b.e();
        if (jE > 0) {
            this.f5456a.w1(this.f5457b, jE);
        }
        return this;
    }

    @Override // If.InterfaceC1107i
    public long U0(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jO0 = source.o0(this.f5457b, 8192L);
            if (jO0 == -1) {
                return j10;
            }
            j10 += jO0;
            I0();
        }
    }

    @Override // If.InterfaceC1107i
    public OutputStream X() {
        return new a();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i Y1(long j10) {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.Y1(j10);
        return I0();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i Z0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.Z0(string);
        return I0();
    }

    @Override // If.Y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f5458c) {
            return;
        }
        if (this.f5457b.size() > 0) {
            Y y10 = this.f5456a;
            C1106h c1106h = this.f5457b;
            y10.w1(c1106h, c1106h.size());
        }
        th = null;
        try {
            this.f5456a.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f5458c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // If.InterfaceC1107i, If.Y, java.io.Flushable
    public void flush() {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        if (this.f5457b.size() > 0) {
            Y y10 = this.f5456a;
            C1106h c1106h = this.f5457b;
            y10.w1(c1106h, c1106h.size());
        }
        this.f5456a.flush();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i h3(long j10) {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.h3(j10);
        return I0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f5458c;
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i j0() {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f5457b.size();
        if (size > 0) {
            this.f5456a.w1(this.f5457b, size);
        }
        return this;
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i n1(String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.n1(string, i10, i11);
        return I0();
    }

    public String toString() {
        return "buffer(" + this.f5456a + ')';
    }

    @Override // If.Y
    public void w1(C1106h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.w1(source, j10);
        I0();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f5457b.write(source);
        I0();
        return iWrite;
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.write(source);
        return I0();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.write(source, i10, i11);
        return I0();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i writeByte(int i10) {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.writeByte(i10);
        return I0();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i writeInt(int i10) {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.writeInt(i10);
        return I0();
    }

    @Override // If.InterfaceC1107i
    public InterfaceC1107i writeShort(int i10) {
        if (this.f5458c) {
            throw new IllegalStateException("closed");
        }
        this.f5457b.writeShort(i10);
        return I0();
    }
}
