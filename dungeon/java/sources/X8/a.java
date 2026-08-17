package X8;

import Q8.i;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.q;
import com.google.android.gms.common.util.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f15307r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f15308s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f15309t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile e f15310u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f15312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f15314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f15316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Q8.b f15319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.util.e f15320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkSource f15321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f15322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f15323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f15324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f15325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicInteger f15326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f15327q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f15311a = new Object();
        this.f15313c = 0;
        this.f15316f = new HashSet();
        this.f15317g = true;
        this.f15320j = h.d();
        this.f15325o = new HashMap();
        this.f15326p = new AtomicInteger(0);
        r.m(context, "WakeLock: context must not be null");
        r.g(str, "WakeLock: wakeLockName must not be empty");
        this.f15324n = context.getApplicationContext();
        this.f15323m = str;
        this.f15319i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f15322l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f15322l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f15312b = wakeLockNewWakeLock;
        if (s.c(context)) {
            WorkSource workSourceB = s.b(context, q.a(packageName) ? context.getPackageName() : packageName);
            this.f15321k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f15308s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f15309t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f15308s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        Q8.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f15308s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f15327q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f15311a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f15322l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f15313c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f15317g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f15316f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f15316f);
        this.f15316f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f15311a) {
            try {
                if (b()) {
                    if (this.f15317g) {
                        int i11 = this.f15313c - 1;
                        this.f15313c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f15313c = 0;
                    }
                    g();
                    Iterator it = this.f15325o.values().iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f15329a = 0;
                    }
                    this.f15325o.clear();
                    Future future = this.f15314d;
                    if (future != null) {
                        future.cancel(false);
                        this.f15314d = null;
                        this.f15315e = 0L;
                    }
                    this.f15318h = 0;
                    if (this.f15312b.isHeld()) {
                        try {
                            try {
                                this.f15312b.release();
                                if (this.f15319i != null) {
                                    this.f15319i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f15322l).concat(" failed to release!"), e10);
                                if (this.f15319i != null) {
                                    this.f15319i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f15319i != null) {
                                this.f15319i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f15322l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f15326p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f15307r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f15311a) {
            try {
                if (!b()) {
                    this.f15319i = Q8.b.a(false, null);
                    this.f15312b.acquire();
                    this.f15320j.c();
                }
                this.f15313c++;
                this.f15318h++;
                f(null);
                d dVar = (d) this.f15325o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f15325o.put(null, dVar);
                }
                dVar.f15329a++;
                long jC = this.f15320j.c();
                long j11 = Long.MAX_VALUE - jC > jMax ? jC + jMax : Long.MAX_VALUE;
                if (j11 > this.f15315e) {
                    this.f15315e = j11;
                    Future future = this.f15314d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f15314d = this.f15327q.schedule(new b(this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f15311a) {
            z10 = this.f15313c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f15326p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f15322l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f15311a) {
            try {
                f(null);
                if (this.f15325o.containsKey(null)) {
                    d dVar = (d) this.f15325o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f15329a - 1;
                        dVar.f15329a = i10;
                        if (i10 == 0) {
                            this.f15325o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f15322l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f15311a) {
            this.f15317g = z10;
        }
    }
}
