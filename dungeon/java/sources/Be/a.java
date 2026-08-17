package Be;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f702a = 0;

    /* JADX INFO: renamed from: Be.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0017a implements p.a {

        /* JADX INFO: renamed from: Be.a$a$a, reason: collision with other inner class name */
        static final class C0018a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f703a;

            C0018a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f703a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f703a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f703a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f703a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f703a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f703a -= i13;
                }
                return i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f703a));
                if (jSkip >= 0) {
                    this.f703a = (int) (((long) this.f703a) - jSkip);
                }
                return jSkip;
            }
        }

        protected static v c(p pVar) {
            return new v(pVar);
        }
    }

    v a() {
        return new v(this);
    }

    public void c(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        f fVarI = f.I(outputStream, f.t(f.u(serializedSize) + serializedSize));
        fVarI.n0(serializedSize);
        b(fVarI);
        fVarI.H();
    }
}
