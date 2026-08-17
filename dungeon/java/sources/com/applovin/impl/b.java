package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27935a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f27936b;

    public b(Context context) {
        this.f27936b = new WeakReference(null);
        new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f27936b = new WeakReference(activity);
            activity.hasWindowFocus();
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        new WeakReference(null);
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f27936b = new WeakReference(activity);
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f27935a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }
}
