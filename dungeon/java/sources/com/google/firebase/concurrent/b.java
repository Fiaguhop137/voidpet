package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f37367e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f37368a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f37371d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f37369b = str;
        this.f37370c = i10;
        this.f37371d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f37370c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f37371d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = f37367e.newThread(new a(this, runnable));
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f37369b, Long.valueOf(this.f37368a.getAndIncrement())));
        return threadNewThread;
    }
}
