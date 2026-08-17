package Y4;

import V4.p;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends OutputStream {
    public abstract h a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e10) {
            p.a(e10);
        }
    }

    public abstract int size();
}
