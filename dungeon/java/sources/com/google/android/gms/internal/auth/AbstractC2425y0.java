package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2425y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2419w0 f32472a = new C2422x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2419w0 f32473b;

    static {
        AbstractC2419w0 abstractC2419w0 = null;
        try {
            abstractC2419w0 = (AbstractC2419w0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f32473b = abstractC2419w0;
    }

    static AbstractC2419w0 a() {
        AbstractC2419w0 abstractC2419w0 = f32473b;
        if (abstractC2419w0 != null) {
            return abstractC2419w0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2419w0 b() {
        return f32472a;
    }
}
