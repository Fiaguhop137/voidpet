package io.sentry.android.replay;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface g extends Closeable {
    void A(s sVar);

    void pause();

    void reset();

    void start();

    void stop();

    void v();
}
