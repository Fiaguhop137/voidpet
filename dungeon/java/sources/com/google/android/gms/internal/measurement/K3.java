package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static J3 f32554a;

    public static synchronized void a(J3 j10) {
        if (f32554a != null) {
            throw new IllegalStateException("init() already called");
        }
        f32554a = j10;
    }

    public static synchronized J3 b() {
        try {
            if (f32554a == null) {
                a(new N3());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f32554a;
    }
}
