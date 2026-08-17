package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.InterfaceC3708g0;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements InterfaceC3708g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O f44714a = new O();

    private O() {
    }

    public static O c() {
        return f44714a;
    }

    @Override // io.sentry.InterfaceC3708g0
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC3708g0
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
