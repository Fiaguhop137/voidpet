package com.google.android.material.internal;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f36787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f36788b;

    public /* synthetic */ o(View view, boolean z10) {
        this.f36787a = view;
        this.f36788b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.k(this.f36787a, this.f36788b);
    }
}
