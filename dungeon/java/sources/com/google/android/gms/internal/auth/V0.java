package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U0 f32286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U0 f32287b;

    static {
        U0 u10 = null;
        try {
            u10 = (U0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f32286a = u10;
        f32287b = new U0();
    }

    static U0 a() {
        return f32286a;
    }

    static U0 b() {
        return f32287b;
    }
}
