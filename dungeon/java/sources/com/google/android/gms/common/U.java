package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class U {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final U f31703e = new U(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f31704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f31705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Throwable f31706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f31707d;

    private U(boolean z10, int i10, int i11, String str, Throwable th, long j10) {
        this.f31704a = z10;
        this.f31707d = i10;
        this.f31705b = str;
        this.f31706c = th;
    }

    /* synthetic */ U(boolean z10, int i10, int i11, String str, Throwable th, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }

    static U b() {
        return f31703e;
    }

    static U c(String str) {
        return new U(false, 1, 5, str, null, -1L);
    }

    static U d(String str, Throwable th) {
        return new U(false, 1, 5, str, th, -1L);
    }

    public static U f(int i10, long j10) {
        return new U(true, i10, 1, null, null, j10);
    }

    static U g(int i10, int i11, String str, Throwable th) {
        return new U(false, i10, i11, str, th, -1L);
    }

    String a() {
        return this.f31705b;
    }

    final void e() {
        if (this.f31704a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f31706c;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
