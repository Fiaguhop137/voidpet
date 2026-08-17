package If;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1105g implements Y {
    @Override // If.Y
    public b0 C() {
        return b0.f5484e;
    }

    @Override // If.Y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // If.Y, java.io.Flushable
    public void flush() {
    }

    @Override // If.Y
    public void w1(C1106h source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }
}
