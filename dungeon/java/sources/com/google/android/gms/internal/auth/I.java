package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Uri f32224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f32225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f32226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f32227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f32228e;

    public I(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private I(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, Q q10) {
        this.f32224a = uri;
        this.f32225b = "";
        this.f32226c = "";
        this.f32227d = z10;
        this.f32228e = z12;
    }

    public final I a() {
        return new I(null, this.f32224a, this.f32225b, this.f32226c, this.f32227d, false, true, false, null);
    }

    public final I b() {
        if (this.f32225b.isEmpty()) {
            return new I(null, this.f32224a, this.f32225b, this.f32226c, true, false, this.f32228e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final M c(String str, double d10) {
        return new G(this, str, Double.valueOf(0.0d), true);
    }

    public final M d(String str, long j10) {
        return new E(this, str, Long.valueOf(j10), true);
    }

    public final M e(String str, boolean z10) {
        return new F(this, str, Boolean.valueOf(z10), true);
    }

    public final M f(String str, Object obj, N1 n10) {
        return new H(this, "getTokenRefactor__blocked_packages", obj, true, n10);
    }
}
