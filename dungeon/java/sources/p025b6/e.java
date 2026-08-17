package p025b6;

import H5.a;
import Z4.d;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends Closeable, m, d, a {
    int M();

    boolean T3();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    p d3();

    int getHeight();

    int getWidth();

    boolean isClosed();

    m j3();
}
