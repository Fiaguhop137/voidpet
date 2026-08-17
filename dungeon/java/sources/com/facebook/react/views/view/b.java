package com.facebook.react.views.view;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f31265a = new b();

    private b() {
    }

    private final int a(double d10) {
        return Math.max(0, Math.min(255, Od.a.b(d10)));
    }

    public static final int b(double d10, double d11, double d12, double d13) {
        b bVar = f31265a;
        return (bVar.a(d10) << 16) | (bVar.a(d13 * ((double) 255)) << 24) | (bVar.a(d11) << 8) | bVar.a(d12);
    }
}
