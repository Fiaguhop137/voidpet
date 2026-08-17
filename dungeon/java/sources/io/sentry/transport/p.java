package io.sentry.transport;

import io.sentry.C3771q2;
import io.sentry.H;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface p extends Closeable {
    void F0(C3771q2 c3771q2, H h10);

    void j(boolean z10);

    void l(long j10);

    default boolean q() {
        return true;
    }

    default void u3(C3771q2 c3771q2) {
        F0(c3771q2, new H());
    }

    z w();
}
