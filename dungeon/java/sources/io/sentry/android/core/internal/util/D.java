package io.sentry.android.core.internal.util;

import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f45004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window f45005b;

    public /* synthetic */ D(H h10, Window window) {
        this.f45004a = h10;
        this.f45005b = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H.c(this.f45004a, this.f45005b);
    }
}
