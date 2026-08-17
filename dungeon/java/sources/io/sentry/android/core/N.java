package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC3732l;
import io.sentry.C3754p1;
import io.sentry.C3776r3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3693d0;
import io.sentry.InterfaceC3698e0;
import io.sentry.M3;
import io.sentry.util.C3799a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f44671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44672c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.H f44676g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.util.p.a f44681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ILogger f44682m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f44670a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f44673d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f44674e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque f44677h = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque f44678i = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f44679j = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f44680k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f44683n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final C3799a f44684o = new C3799a();

    class a implements io.sentry.android.core.internal.util.H.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f44685a = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.H.b
        public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
            long jP = new C3776r3().p();
            long jNanoTime = ((j11 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - N.this.f44670a;
            if (jNanoTime < 0) {
                return;
            }
            if (z11) {
                N.this.f44679j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jP));
            } else if (z10) {
                N.this.f44678i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jP));
            }
            if (f10 != this.f44685a) {
                this.f44685a = f10;
                N.this.f44677h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f10), jP));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f44688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f44689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f44690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f44691e;

        public b(long j10, long j11, boolean z10, File file, Map map) {
            this.f44687a = j10;
            this.f44689c = file;
            this.f44688b = j11;
            this.f44690d = map;
            this.f44691e = z10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f44693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f44694c;

        public c(long j10, long j11, Date date) {
            this.f44692a = j10;
            this.f44693b = j11;
            this.f44694c = date;
        }
    }

    public N(String str, int i10, io.sentry.android.core.internal.util.H h10, io.sentry.util.p.a aVar, ILogger iLogger) {
        this.f44671b = new File((String) io.sentry.util.w.c(str, "TracesFilesDirPath is required"));
        this.f44672c = i10;
        this.f44682m = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f44681l = aVar;
        this.f44676g = (io.sentry.android.core.internal.util.H) io.sentry.util.w.c(h10, "SentryFrameMetricsCollector is required");
    }

    private void i(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f44670a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3754p1 c3754p1 = (C3754p1) it.next();
                        long jB = c3754p1.b();
                        long j10 = jB + jElapsedRealtimeNanos;
                        Double dA = c3754p1.a();
                        Long lC = c3754p1.c();
                        Long lD = c3754p1.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lD, jB));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f44680k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f44680k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f44680k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public void f() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44684o.a();
        try {
            Future future = this.f44673d;
            if (future != null) {
                future.cancel(true);
                this.f44673d = null;
            }
            if (this.f44683n) {
                g(true, null);
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public b g(boolean z10, List list) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44684o.a();
        try {
            if (!this.f44683n) {
                this.f44682m.c(EnumC3721i3.WARNING, "Profiler not running", new Object[0]);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th) {
                try {
                    this.f44682m.b(EnumC3721i3.ERROR, "Error while stopping profiling: ", th);
                } catch (Throwable th2) {
                    this.f44683n = false;
                    throw th2;
                }
            }
            this.f44683n = false;
            this.f44676g.m(this.f44675f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f44674e == null) {
                this.f44682m.c(EnumC3721i3.ERROR, "Trace file does not exists", new Object[0]);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            if (!this.f44678i.isEmpty()) {
                this.f44680k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f44678i));
            }
            if (!this.f44679j.isEmpty()) {
                this.f44680k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f44679j));
            }
            if (!this.f44677h.isEmpty()) {
                this.f44680k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f44677h));
            }
            i(list);
            Future future = this.f44673d;
            if (future != null) {
                future.cancel(true);
                this.f44673d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z10, this.f44674e, this.f44680k);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return bVar;
        } catch (Throwable th3) {
            if (interfaceC3698e0A == null) {
                throw th3;
            }
            try {
                interfaceC3698e0A.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    boolean h() {
        return this.f44683n;
    }

    public c j() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44684o.a();
        try {
            int i10 = this.f44672c;
            if (i10 == 0) {
                this.f44682m.c(EnumC3721i3.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            if (this.f44683n) {
                this.f44682m.c(EnumC3721i3.WARNING, "Profiling has already started...", new Object[0]);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            this.f44674e = new File(this.f44671b, M3.a() + ".trace");
            this.f44680k.clear();
            this.f44677h.clear();
            this.f44678i.clear();
            this.f44679j.clear();
            this.f44675f = this.f44676g.l(new a());
            try {
                io.sentry.util.p.a aVar = this.f44681l;
                if (aVar != null) {
                    this.f44673d = ((InterfaceC3693d0) aVar.a()).c(new M(this), 30000L);
                }
            } catch (RejectedExecutionException e10) {
                this.f44682m.b(EnumC3721i3.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
            }
            this.f44670a = SystemClock.elapsedRealtimeNanos();
            Date dateD = AbstractC3732l.d();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f44674e.getPath(), 3000000, this.f44672c);
                this.f44683n = true;
                c cVar = new c(this.f44670a, elapsedCpuTime, dateD);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return cVar;
            } catch (Throwable th) {
                g(false, null);
                this.f44682m.b(EnumC3721i3.ERROR, "Unable to start a profile: ", th);
                this.f44683n = false;
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            if (interfaceC3698e0A == null) {
                throw th2;
            }
            try {
                interfaceC3698e0A.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
