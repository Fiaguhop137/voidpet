package io.sentry.android.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: io.sentry.android.core.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3623a implements io.sentry.transport.o {
    @Override // io.sentry.transport.o
    public final long a() {
        return SystemClock.uptimeMillis();
    }
}
