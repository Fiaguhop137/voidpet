package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2651z1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile C2651z1 f33271j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33272a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.e f33273b = com.google.android.gms.common.util.h.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ExecutorService f33274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S8.a f33275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f33276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f33279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile InterfaceC2617v0 f33280i;

    protected C2651z1(Context context, Bundle bundle) {
        AbstractC2573q0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2502i1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f33274c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f33275d = new S8.a(this);
        this.f33276e = new ArrayList();
        try {
            if (T8.H.a(context, "google_app_id", T8.o.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C2651z1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f33279h = null;
                    this.f33278g = true;
                    Log.w(this.f33272a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f33279h = "fa";
        j(new V0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f33272a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2643y1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(AbstractRunnableC2565p1 abstractRunnableC2565p1) {
        this.f33274c.execute(abstractRunnableC2565p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void k(Exception exc, boolean z10, boolean z11) {
        C2651z1 c2651z1;
        Exception exc2;
        this.f33278g |= z10;
        if (z10) {
            Log.w(this.f33272a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c2651z1 = this;
            exc2 = exc;
            c2651z1.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            c2651z1 = this;
            exc2 = exc;
        }
        Log.w(c2651z1.f33272a, "Error with data collection. Data lost.", exc2);
    }

    private final void r(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        j(new C2556o1(this, l10, str, str2, bundle, z10, z11));
    }

    public static C2651z1 s(Context context, Bundle bundle) {
        p170j8.r.l(context);
        if (f33271j == null) {
            synchronized (C2651z1.class) {
                try {
                    if (f33271j == null) {
                        f33271j = new C2651z1(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33271j;
    }

    public final List A(String str, String str2) {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new O0(this, str, str2, binderC2590s0));
        List list = (List) BinderC2590s0.d1(binderC2590s0.c1(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void B(String str) {
        j(new P0(this, str));
    }

    public final void C(J0 j10, String str, String str2) {
        j(new Q0(this, j10, str, str2));
    }

    public final void D(Boolean bool) {
        j(new R0(this, bool));
    }

    public final void E(Bundle bundle) {
        j(new S0(this, bundle));
    }

    public final void F() {
        j(new T0(this));
    }

    public final void G(long j10) {
        j(new U0(this, j10));
    }

    public final void H(String str) {
        j(new W0(this, str));
    }

    public final void I(String str) {
        j(new X0(this, str));
    }

    public final void J(Runnable runnable) {
        j(new Z0(this, runnable));
    }

    public final String K() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2430a1(this, binderC2590s0));
        return binderC2590s0.h(500L);
    }

    public final String L() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2439b1(this, binderC2590s0));
        return binderC2590s0.h(50L);
    }

    public final long M() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2448c1(this, binderC2590s0));
        Long lK = binderC2590s0.k(500L);
        if (lK != null) {
            return lK.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f33273b.a()).nextLong();
        int i10 = this.f33277f + 1;
        this.f33277f = i10;
        return jNextLong + ((long) i10);
    }

    public final String a() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2457d1(this, binderC2590s0));
        return binderC2590s0.h(500L);
    }

    public final String b() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2475f1(this, binderC2590s0));
        return binderC2590s0.h(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2484g1(this, str, str2, z10, binderC2590s0));
        Bundle bundleC1 = binderC2590s0.c1(5000L);
        if (bundleC1 == null || bundleC1.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleC1.size());
        for (String str3 : bundleC1.keySet()) {
            Object obj = bundleC1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        j(new C2493h1(this, false, 5, str, obj, null, null));
    }

    public final int e(String str) {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2511j1(this, str, binderC2590s0));
        Integer num = (Integer) BinderC2590s0.d1(binderC2590s0.c1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String f() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2520k1(this, binderC2590s0));
        return binderC2590s0.h(120000L);
    }

    public final Long g() {
        BinderC2590s0 binderC2590s0 = new BinderC2590s0();
        j(new C2529l1(this, binderC2590s0));
        return binderC2590s0.k(120000L);
    }

    public final void h(boolean z10) {
        j(new C2538m1(this, z10));
    }

    public final void i(Bundle bundle) {
        j(new C2547n1(this, bundle));
    }

    final /* synthetic */ String l() {
        return this.f33272a;
    }

    final /* synthetic */ boolean m() {
        return this.f33278g;
    }

    final /* synthetic */ InterfaceC2617v0 n() {
        return this.f33280i;
    }

    final /* synthetic */ void o(InterfaceC2617v0 interfaceC2617v0) {
        this.f33280i = interfaceC2617v0;
    }

    public final S8.a t() {
        return this.f33275d;
    }

    protected final InterfaceC2617v0 u(Context context, boolean z10) {
        try {
            return AbstractBinderC2608u0.asInterface(DynamiteModule.e(context, z10 ? DynamiteModule.f31966e : DynamiteModule.f31964c, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            k(e10, true, false);
            return null;
        }
    }

    public final void v(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void w(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void x(String str, String str2, Object obj, boolean z10) {
        j(new L0(this, str, str2, obj, z10));
    }

    public final void y(Bundle bundle) {
        j(new M0(this, bundle));
    }

    public final void z(String str, String str2, Bundle bundle) {
        j(new N0(this, str, str2, bundle));
    }
}
