package com.swmansion.reanimated;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f38914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38916c;

    public /* synthetic */ b(View view, int i10, int i11) {
        this.f38914a = view;
        this.f38915b = i10;
        this.f38916c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.facebook.react.views.scroll.h) this.f38914a).smoothScrollTo(this.f38915b, this.f38916c);
    }
}
