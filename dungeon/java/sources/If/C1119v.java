package If;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1119v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f5563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f5564b;

    public C1119v(InputStream input, b0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f5563a = input;
        this.f5564b = timeout;
    }

    @Override // If.a0
    public b0 C() {
        return this.f5564b;
    }

    @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5563a.close();
    }

    @Override // If.a0
    public long o0(C1106h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f5564b.f();
            V vS = sink.S(1);
            int i10 = this.f5563a.read(vS.f5465a, vS.f5467c, (int) Math.min(j10, 8192 - vS.f5467c));
            if (i10 != -1) {
                vS.f5467c += i10;
                long j11 = i10;
                sink.K(sink.size() + j11);
                return j11;
            }
            if (vS.f5466b != vS.f5467c) {
                return -1L;
            }
            sink.f5512a = vS.b();
            W.b(vS);
            return -1L;
        } catch (AssertionError e10) {
            if (K.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public String toString() {
        return "source(" + this.f5563a + ')';
    }
}
