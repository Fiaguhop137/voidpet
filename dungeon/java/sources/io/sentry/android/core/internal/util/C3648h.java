package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3648h implements io.sentry.transport.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.sentry.transport.o f45049a = new C3648h();

    private C3648h() {
    }

    public static io.sentry.transport.o b() {
        return f45049a;
    }

    @Override // io.sentry.transport.o
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
