package com.applovin.impl;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTracker f28076a;

    public j2(SessionTracker sessionTracker) {
        this.f28076a = sessionTracker;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f28076a.f27927d.set(i10);
        if (i10 == 20) {
            SessionTracker.b(this.f28076a);
        }
    }
}
