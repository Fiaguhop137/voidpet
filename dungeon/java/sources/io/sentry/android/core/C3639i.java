package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3698e0;
import io.sentry.protocol.C3767k;
import io.sentry.util.C3799a;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.core.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3639i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.util.p f44915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f44916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f44917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f44918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N0 f44919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C3799a f44920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.p f44921g;

    /* JADX INFO: renamed from: io.sentry.android.core.i$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f44922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f44923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f44924c;

        private b(int i10, int i11, int i12) {
            this.f44922a = i10;
            this.f44923b = i11;
            this.f44924c = i12;
        }

        /* synthetic */ b(int i10, int i11, int i12, a aVar) {
            this(i10, i11, i12);
        }
    }

    public C3639i(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions) {
        this(sVar, sentryAndroidOptions, new N0());
    }

    public C3639i(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions, N0 n10) {
        this.f44917c = new ConcurrentHashMap();
        this.f44918d = new WeakHashMap();
        this.f44920f = new C3799a();
        this.f44921g = sVar.e("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.f44915a = new io.sentry.util.p(new C3629d());
        this.f44916b = sentryAndroidOptions;
        this.f44919e = n10;
    }

    public static /* synthetic */ void c(C3639i c3639i, Runnable runnable, String str) {
        c3639i.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                c3639i.f44916b.getLogger().c(EnumC3721i3.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public static /* synthetic */ FrameMetricsAggregator e() {
        return new FrameMetricsAggregator();
    }

    private b g() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!i() || !((Boolean) this.f44921g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = ((FrameMetricsAggregator) this.f44915a.a()).b();
        int i12 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new b(i12, i10, i11, null);
    }

    private b h(Activity activity) {
        b bVarG;
        b bVar = (b) this.f44918d.remove(activity);
        if (bVar == null || (bVarG = g()) == null) {
            return null;
        }
        return new b(bVarG.f44922a - bVar.f44922a, bVarG.f44923b - bVar.f44923b, bVarG.f44924c - bVar.f44924c, null);
    }

    private void j(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.m.e().a()) {
                runnable.run();
            } else {
                this.f44919e.b(new RunnableC3635g(this, runnable, str));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f44916b.getLogger().c(EnumC3721i3.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void l(Activity activity) {
        b bVarG = g();
        if (bVarG != null) {
            this.f44918d.put(activity, bVarG);
        }
    }

    public void f(Activity activity) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44920f.a();
        try {
            if (!i()) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
            } else {
                j(new RunnableC3631e(this, activity), "FrameMetricsAggregator.add");
                l(activity);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
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

    public boolean i() {
        return ((Boolean) this.f44921g.a()).booleanValue() && this.f44916b.isEnableFramesTracking() && !this.f44916b.isEnablePerformanceV2();
    }

    public void k(Activity activity, io.sentry.protocol.x xVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44920f.a();
        try {
            if (!i()) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            j(new RunnableC3637h(this, activity), null);
            b bVarH = h(activity);
            if (bVarH != null && (bVarH.f44922a != 0 || bVarH.f44923b != 0 || bVarH.f44924c != 0)) {
                C3767k c3767k = new C3767k(Integer.valueOf(bVarH.f44922a), "none");
                C3767k c3767k2 = new C3767k(Integer.valueOf(bVarH.f44923b), "none");
                C3767k c3767k3 = new C3767k(Integer.valueOf(bVarH.f44924c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", c3767k);
                map.put("frames_slow", c3767k2);
                map.put("frames_frozen", c3767k3);
                this.f44917c.put(xVar, map);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
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

    public void m() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44920f.a();
        try {
            if (i()) {
                j(new RunnableC3633f(this), "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) this.f44915a.a()).d();
            }
            this.f44917c.clear();
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

    public Map n(io.sentry.protocol.x xVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44920f.a();
        try {
            if (!i()) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            Map map = (Map) this.f44917c.get(xVar);
            this.f44917c.remove(xVar);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return map;
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
}
