package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3153t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f38029a = new C3152s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f38030b = c();

    static r a() {
        r rVar = f38030b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static r b() {
        return f38029a;
    }

    private static r c() {
        try {
            return (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
