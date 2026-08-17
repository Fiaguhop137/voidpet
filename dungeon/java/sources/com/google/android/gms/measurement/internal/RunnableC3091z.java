package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3091z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f36040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f36041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f36042c;

    RunnableC3091z(C0 c10, String str, long j10) {
        this.f36040a = str;
        this.f36041b = j10;
        Objects.requireNonNull(c10);
        this.f36042c = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36042c.m(this.f36040a, this.f36041b);
    }
}
