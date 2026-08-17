package com.facebook.react.views.virtualview;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f31275a;

    public /* synthetic */ b(c cVar) {
        this.f31275a = cVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        c.C(this.f31275a, z10);
    }
}
