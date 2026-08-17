package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3627c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f44839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f44840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0 f44841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.o f44842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f44843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f44844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f44845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f44846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f44847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f44848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f44849k;

    /* JADX INFO: renamed from: io.sentry.android.core.c$a */
    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    C3627c(long j10, boolean z10, a aVar, ILogger iLogger, Context context) {
        this(new C3623a(), j10, 500L, z10, aVar, iLogger, new N0(), context);
    }

    C3627c(io.sentry.transport.o oVar, long j10, long j11, boolean z10, a aVar, ILogger iLogger, N0 n10, Context context) {
        super("|ANR-WatchDog|");
        this.f44846h = 0L;
        this.f44847i = new AtomicBoolean(false);
        this.f44842d = oVar;
        this.f44844f = j10;
        this.f44843e = j11;
        this.f44839a = z10;
        this.f44840b = aVar;
        this.f44845g = iLogger;
        this.f44841c = n10;
        this.f44848j = context;
        this.f44849k = new RunnableC3625b(this, oVar);
        if (j10 < this.f44843e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f44843e * 2)));
        }
    }

    public static /* synthetic */ void a(C3627c c3627c, io.sentry.transport.o oVar) {
        c3627c.getClass();
        c3627c.f44846h = oVar.a();
        c3627c.f44847i.set(false);
    }

    private boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f44848j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.f44845g.b(EnumC3721i3.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f44849k.run();
        while (!isInterrupted()) {
            this.f44841c.b(this.f44849k);
            try {
                Thread.sleep(this.f44843e);
                if (this.f44842d.a() - this.f44846h > this.f44844f) {
                    if (!this.f44839a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f44845g.c(EnumC3721i3.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f44847i.set(true);
                    } else if (c() && this.f44847i.compareAndSet(false, true)) {
                        this.f44840b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f44844f + " ms.", this.f44841c.a()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f44845g.c(EnumC3721i3.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f44845g.c(EnumC3721i3.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }
}
