package com.facebook.react.views.view;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f31270a;

    public /* synthetic */ f(g gVar) {
        this.f31270a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        g.g(this.f31270a, z10);
    }
}
