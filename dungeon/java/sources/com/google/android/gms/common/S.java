package com.google.android.gms.common;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31701c;

    /* synthetic */ S(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f31699a = str;
        this.f31700b = z10;
        this.f31701c = z13;
    }

    final boolean a() {
        return this.f31701c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, r8.a] */
    final K b(Context context) {
        return new K(this.f31699a, this.f31700b, false, p314r8.b.c1(context), false, true, false);
    }
}
