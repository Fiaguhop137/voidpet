package io.sentry.ndk;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeScope implements a {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeRemoveExtra(String str);

    public static native void nativeRemoveTag(String str);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(String str, String str2);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetTrace(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);

    @Override // io.sentry.ndk.a
    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }

    @Override // io.sentry.ndk.a
    public void b(String str) {
        nativeRemoveExtra(str);
    }

    @Override // io.sentry.ndk.a
    public void c(String str, String str2) {
        nativeSetTag(str, str2);
    }

    @Override // io.sentry.ndk.a
    public void d(String str, String str2) {
        nativeSetExtra(str, str2);
    }

    @Override // io.sentry.ndk.a
    public void e() {
        nativeRemoveUser();
    }

    @Override // io.sentry.ndk.a
    public void f(String str) {
        nativeRemoveTag(str);
    }

    @Override // io.sentry.ndk.a
    public void g(String str, String str2, String str3, String str4) {
        nativeSetUser(str, str2, str3, str4);
    }

    @Override // io.sentry.ndk.a
    public void h(String str, String str2) {
        nativeSetTrace(str, str2);
    }
}
