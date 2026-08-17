package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f45051a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f45052b = Process.myTid();

    private m() {
        new Handler(Looper.getMainLooper()).post(new l());
    }

    public static m e() {
        return f45051a;
    }

    public static long f(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return i(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    public boolean g(long j10) {
        return f(Looper.getMainLooper().getThread()) == j10;
    }

    public boolean h(io.sentry.protocol.D d10) {
        Long l10 = d10.l();
        return l10 != null && g(l10.longValue());
    }

    public boolean i(Thread thread) {
        return g(f(thread));
    }
}
