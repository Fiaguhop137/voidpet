package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacks2C2310c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C2310c f31802e = new ComponentCallbacks2C2310c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f31803a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f31804b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f31805c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31806d = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z10);
    }

    private ComponentCallbacks2C2310c() {
    }

    public static ComponentCallbacks2C2310c b() {
        return f31802e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C2310c componentCallbacks2C2310c = f31802e;
        synchronized (componentCallbacks2C2310c) {
            try {
                if (!componentCallbacks2C2310c.f31806d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2310c);
                    application.registerComponentCallbacks(componentCallbacks2C2310c);
                    componentCallbacks2C2310c.f31806d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f31802e) {
            try {
                Iterator it = this.f31805c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f31802e) {
            this.f31805c.add(aVar);
        }
    }

    public boolean d() {
        return this.f31803a.get();
    }

    public boolean e(boolean z10) {
        AtomicBoolean atomicBoolean = this.f31804b;
        if (!atomicBoolean.get()) {
            if (com.google.android.gms.common.util.p.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f31803a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f31804b;
        boolean zCompareAndSet = this.f31803a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f31804b;
        boolean zCompareAndSet = this.f31803a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f31803a.compareAndSet(false, true)) {
            this.f31804b.set(true);
            f(true);
        }
    }
}
