package io.sentry.android.core.internal.util;

import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f45002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window f45003b;

    public /* synthetic */ C(H h10, Window window) {
        this.f45002a = h10;
        this.f45003b = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H.b(this.f45002a, this.f45003b);
    }
}
