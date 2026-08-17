package com.applovin.impl;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTracker f28068a;

    public i2(SessionTracker sessionTracker) {
        this.f28068a = sessionTracker;
    }

    @Override // com.applovin.impl.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        SessionTracker.a(this.f28068a);
    }
}
