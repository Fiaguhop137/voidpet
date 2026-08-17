package com.swmansion.reanimated;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f38911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38913c;

    public /* synthetic */ a(View view, int i10, int i11) {
        this.f38911a = view;
        this.f38912b = i10;
        this.f38913c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.facebook.react.views.scroll.g) this.f38911a).smoothScrollTo(this.f38912b, this.f38913c);
    }
}
