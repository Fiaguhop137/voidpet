package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3150p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f37990a = c();

    public static C3151q a() {
        C3151q c3151qB = b("getEmptyRegistry");
        return c3151qB != null ? c3151qB : C3151q.f37996d;
    }

    private static final C3151q b(String str) {
        Class cls = f37990a;
        if (cls == null) {
            return null;
        }
        try {
            return (C3151q) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
