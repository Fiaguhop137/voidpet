package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC2428a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2465e0 f32853a;

    /* synthetic */ CallableC2428a(C2465e0 c2465e0) {
        this.f32853a = c2465e0;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return new C2442b4(this.f32853a.f32897c);
    }
}
