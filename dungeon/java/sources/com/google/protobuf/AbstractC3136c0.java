package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3136c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC3132a0 f37887a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC3132a0 f37888b = new C3134b0();

    static InterfaceC3132a0 a() {
        return f37887a;
    }

    static InterfaceC3132a0 b() {
        return f37888b;
    }

    private static InterfaceC3132a0 c() {
        try {
            return (InterfaceC3132a0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
