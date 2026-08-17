package Y4;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int D(int i10, byte[] bArr, int i11, int i12);

    ByteBuffer E();

    byte R(int i10);

    long W();

    boolean isClosed();

    int size();
}
