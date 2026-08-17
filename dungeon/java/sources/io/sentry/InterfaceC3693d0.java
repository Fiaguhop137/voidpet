package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3693d0 {
    void a(long j10);

    void b();

    Future c(Runnable runnable, long j10);

    boolean isClosed();

    Future submit(Runnable runnable);
}
