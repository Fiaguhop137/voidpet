package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N f37839a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final N f37840b = new O();

    static N a() {
        return f37839a;
    }

    static N b() {
        return f37840b;
    }

    private static N c() {
        try {
            return (N) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
