package com.swmansion.reanimated.layoutReanimation;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedTransitionManager f38942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewParent f38943b;

    public /* synthetic */ e(SharedTransitionManager sharedTransitionManager, ViewParent viewParent) {
        this.f38942a = sharedTransitionManager;
        this.f38943b = viewParent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38942a.lambda$finishSharedAnimation$1(this.f38943b);
    }
}
