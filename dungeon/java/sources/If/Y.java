package If;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public interface Y extends Closeable, Flushable {
    b0 C();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void w1(C1106h c1106h, long j10);
}
