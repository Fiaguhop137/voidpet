package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3052t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3045s2 f35846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f35848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f35849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f35851f;

    /* synthetic */ RunnableC3052t2(String str, InterfaceC3045s2 interfaceC3045s2, int i10, Throwable th, byte[] bArr, Map map, byte[] bArr2) {
        p170j8.r.l(interfaceC3045s2);
        this.f35846a = interfaceC3045s2;
        this.f35847b = i10;
        this.f35848c = th;
        this.f35849d = bArr;
        this.f35850e = str;
        this.f35851f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35846a.a(this.f35850e, this.f35847b, this.f35848c, this.f35849d, this.f35851f);
    }
}
