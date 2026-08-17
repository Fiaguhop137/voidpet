package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2907a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f35327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f35328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f35329c;

    RunnableC2907a(C0 c10, String str, long j10) {
        this.f35327a = str;
        this.f35328b = j10;
        Objects.requireNonNull(c10);
        this.f35329c = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35329c.l(this.f35327a, this.f35328b);
    }
}
