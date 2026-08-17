package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f44695a;

    N0() {
        this(Looper.getMainLooper());
    }

    N0(Looper looper) {
        this.f44695a = new Handler(looper);
    }

    public Thread a() {
        return this.f44695a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f44695a.post(runnable);
    }
}
