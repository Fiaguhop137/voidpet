package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2812f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C2812f0 f34707d = new C2812f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f34708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f34709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C2812f0 f34710c;

    C2812f0() {
        this.f34708a = null;
        this.f34709b = null;
    }

    C2812f0(Runnable runnable, Executor executor) {
        this.f34708a = runnable;
        this.f34709b = executor;
    }
}
