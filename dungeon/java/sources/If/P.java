package If;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class P implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f5445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f5446b;

    public P(OutputStream out, b0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f5445a = out;
        this.f5446b = timeout;
    }

    @Override // If.Y
    public b0 C() {
        return this.f5446b;
    }

    @Override // If.Y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5445a.close();
    }

    @Override // If.Y, java.io.Flushable
    public void flush() throws IOException {
        this.f5445a.flush();
    }

    public String toString() {
        return "sink(" + this.f5445a + ')';
    }

    @Override // If.Y
    public void w1(C1106h source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC1103e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f5446b.f();
            V v10 = source.f5512a;
            Intrinsics.c(v10);
            int iMin = (int) Math.min(j10, v10.f5467c - v10.f5466b);
            this.f5445a.write(v10.f5465a, v10.f5466b, iMin);
            v10.f5466b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.K(source.size() - j11);
            if (v10.f5466b == v10.f5467c) {
                source.f5512a = v10.b();
                W.b(v10);
            }
        }
    }
}
