package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface M extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void b(a aVar);
    }

    void F3(b bVar);

    boolean k3(b bVar);

    a o1();

    String p0();
}
