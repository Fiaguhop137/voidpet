package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.M3;
import io.sentry.android.core.AbstractC3662p0;
import io.sentry.android.core.C3636g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f45011n = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f45012o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3636g0 f45013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f45014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f45015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f45016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f45017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f45018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f45020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Window.OnFrameMetricsAvailableListener f45021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Choreographer f45022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Field f45023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f45024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f45025m;

    class a implements c {
        a() {
        }
    }

    public interface b {
        void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10);
    }

    public interface c {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public H(Context context, ILogger iLogger, C3636g0 c3636g0) {
        this(context, iLogger, c3636g0, new a());
    }

    public H(Context context, ILogger iLogger, C3636g0 c3636g0, c cVar) {
        this.f45014b = new CopyOnWriteArraySet();
        this.f45018f = new ConcurrentHashMap();
        this.f45019g = false;
        this.f45024l = 0L;
        this.f45025m = 0L;
        Context context2 = (Context) io.sentry.util.w.c(AbstractC3662p0.g(context), "The context is required");
        this.f45015c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f45013a = (C3636g0) io.sentry.util.w.c(c3636g0, "BuildInfoProvider is required");
        this.f45020h = (c) io.sentry.util.w.c(cVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && c3636g0.d() >= 24) {
            this.f45019g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new E(iLogger));
            handlerThread.start();
            this.f45016d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new F(this, iLogger));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f45023k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.b(EnumC3721i3.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f45021i = new G(this, c3636g0);
        }
    }

    public static /* synthetic */ void a(H h10, ILogger iLogger) {
        h10.getClass();
        try {
            h10.f45022j = Choreographer.getInstance();
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    public static /* synthetic */ void b(H h10, Window window) {
        if (h10.f45014b.add(window)) {
            try {
                h10.f45020h.a(window, h10.f45021i, h10.f45016d);
            } catch (Throwable th) {
                h10.f45015c.b(EnumC3721i3.ERROR, "Failed to add frameMetricsAvailableListener", th);
            }
        }
    }

    public static /* synthetic */ void c(H h10, Window window) {
        h10.getClass();
        try {
            if (h10.f45014b.remove(window)) {
                h10.f45020h.b(window, h10.f45021i);
            }
        } catch (Throwable th) {
            h10.f45015c.b(EnumC3721i3.ERROR, "Failed to remove frameMetricsAvailableListener", th);
        }
    }

    public static /* synthetic */ void e(H h10, C3636g0 c3636g0, Window window, FrameMetrics frameMetrics, int i10) {
        h10.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = c3636g0.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f10 = f45011n;
        long jF = h10.f(frameMetrics);
        long jMax = Math.max(0L, jF - ((long) (f10 / refreshRate)));
        long jG = h10.g(frameMetrics);
        if (jG < 0) {
            jG = jNanoTime - jF;
        }
        long jMax2 = Math.max(jG, h10.f45025m);
        if (jMax2 == h10.f45024l) {
            return;
        }
        h10.f45024l = jMax2;
        h10.f45025m = jMax2 + jF;
        boolean zJ = j(jF, (long) (f10 / (refreshRate - 1.0f)));
        boolean z10 = zJ && i(jF);
        Iterator it = h10.f45018f.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).e(jMax2, h10.f45025m, jF, jMax, zJ, z10, refreshRate);
        }
    }

    private long f(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    private long g(FrameMetrics frameMetrics) {
        return this.f45013a.d() >= 26 ? frameMetrics.getMetric(10) : h();
    }

    public static boolean i(long j10) {
        return j10 > f45012o;
    }

    public static boolean j(long j10, long j11) {
        return j10 > j11;
    }

    private void k(Window window) {
        WeakReference weakReference = this.f45017e;
        if (weakReference == null || weakReference.get() != window) {
            this.f45017e = new WeakReference(window);
            o();
        }
    }

    private void n(Window window) {
        new Handler(Looper.getMainLooper()).post(new D(this, window));
    }

    private void o() {
        WeakReference weakReference = this.f45017e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f45019g || this.f45018f.isEmpty() || this.f45016d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new C(this, window));
    }

    public long h() {
        Field field;
        Choreographer choreographer = this.f45022j;
        if (choreographer == null || (field = this.f45023k) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public String l(b bVar) {
        if (!this.f45019g) {
            return null;
        }
        String strA = M3.a();
        this.f45018f.put(strA, bVar);
        o();
        return strA;
    }

    public void m(String str) {
        if (this.f45019g) {
            if (str != null) {
                this.f45018f.remove(str);
            }
            WeakReference weakReference = this.f45017e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !this.f45018f.isEmpty()) {
                return;
            }
            n(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        n(activity.getWindow());
        WeakReference weakReference = this.f45017e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f45017e = null;
    }
}
