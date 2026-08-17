package com.facebook.common.time;

import V4.d;
import p042c5.c;

/* JADX INFO: loaded from: classes.dex */
@d
public class AwakeTimeSinceBootClock implements c {

    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p042c5.c, p042c5.b
    @d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // p042c5.c, p042c5.b
    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
