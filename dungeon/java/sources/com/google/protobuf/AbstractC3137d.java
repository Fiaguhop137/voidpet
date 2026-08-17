package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3137d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f37889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f37890b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f37891c;

    static {
        f37891c = (f37889a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f37890b;
    }

    static boolean c() {
        if (f37889a) {
            return true;
        }
        return (f37890b == null || f37891c) ? false : true;
    }
}
