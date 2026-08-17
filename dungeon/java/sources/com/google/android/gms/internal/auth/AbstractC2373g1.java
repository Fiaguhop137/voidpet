package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2373g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2370f1 f32333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2370f1 f32334b;

    static {
        C2370f1 c2370f1 = null;
        try {
            c2370f1 = (C2370f1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f32333a = c2370f1;
        f32334b = new C2370f1();
    }

    static C2370f1 a() {
        return f32333a;
    }

    static C2370f1 b() {
        return f32334b;
    }
}
