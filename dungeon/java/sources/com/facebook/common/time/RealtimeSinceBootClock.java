package com.facebook.common.time;

import V4.d;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p042c5.b;

/* JADX INFO: loaded from: classes.dex */
@d
public class RealtimeSinceBootClock implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f28694a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f28694a;
    }

    @Override // p042c5.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p042c5.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
