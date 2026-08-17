package L8;

import p170j8.C3845j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3845j f6451a = new C3845j("Games");

    public static void a(String str, String str2) {
        f6451a.b(h(str), str2);
    }

    public static void b(String str, String str2, Throwable th) {
        f6451a.c(h("GamesApiManager"), "Authentication task failed", th);
    }

    public static void c(String str, String str2) {
        f6451a.f(h(str), str2);
    }

    public static void d(String str, String str2) {
        f6451a.g(h(str), str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f6451a.h(h(str), str2, th);
    }

    public static void f(String str, String str2) {
        f6451a.d(h(str), str2);
    }

    public static void g(String str, String str2, Throwable th) {
        f6451a.e(h(str), str2, th);
    }

    private static String h(String str) {
        return String.format("%s[%s]", "PlayGamesServices", str);
    }
}
