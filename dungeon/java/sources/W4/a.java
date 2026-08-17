package W4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f14625a = b.l();

    public static void A(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (w(2)) {
            x(cls, q(str, obj, obj2, obj3));
        }
    }

    public static void B(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f14625a.j(2)) {
            f14625a.f(r(cls), q(str, obj, obj2, obj3, obj4));
        }
    }

    public static void C(Class cls, String str, Object... objArr) {
        if (f14625a.j(2)) {
            f14625a.f(r(cls), q(str, objArr));
        }
    }

    public static void D(String str, String str2, Object... objArr) {
        if (f14625a.j(2)) {
            f14625a.f(str, q(str2, objArr));
        }
    }

    public static void E(Class cls, String str) {
        if (f14625a.j(5)) {
            f14625a.d(r(cls), str);
        }
    }

    public static void F(Class cls, String str, Throwable th) {
        if (f14625a.j(5)) {
            f14625a.b(r(cls), str, th);
        }
    }

    public static void G(Class cls, String str, Object... objArr) {
        if (f14625a.j(5)) {
            f14625a.d(r(cls), q(str, objArr));
        }
    }

    public static void H(Class cls, Throwable th, String str, Object... objArr) {
        if (w(5)) {
            F(cls, q(str, objArr), th);
        }
    }

    public static void I(String str, String str2) {
        if (f14625a.j(5)) {
            f14625a.d(str, str2);
        }
    }

    public static void J(String str, String str2, Throwable th) {
        if (f14625a.j(5)) {
            f14625a.b(str, str2, th);
        }
    }

    public static void K(String str, String str2, Object... objArr) {
        if (f14625a.j(5)) {
            f14625a.d(str, q(str2, objArr));
        }
    }

    public static void L(String str, Throwable th, String str2, Object... objArr) {
        if (f14625a.j(5)) {
            f14625a.b(str, q(str2, objArr), th);
        }
    }

    public static void M(Class cls, String str, Throwable th) {
        if (f14625a.j(6)) {
            f14625a.i(r(cls), str, th);
        }
    }

    public static void N(String str, String str2, Object... objArr) {
        if (f14625a.j(6)) {
            f14625a.g(str, q(str2, objArr));
        }
    }

    public static void a(Class cls, String str, Object obj) {
        if (f14625a.j(3)) {
            f14625a.h(r(cls), q(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f14625a.j(3)) {
            f14625a.h(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f14625a.j(3)) {
            f14625a.h(str, q(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f14625a.j(3)) {
            f14625a.h(str, q(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f14625a.j(3)) {
            f14625a.h(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f14625a.j(3)) {
            f14625a.h(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (f14625a.j(3)) {
            f14625a.a(str, str2, th);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f14625a.j(3)) {
            b(str, q(str2, objArr));
        }
    }

    public static void i(Class cls, String str) {
        if (f14625a.j(6)) {
            f14625a.e(r(cls), str);
        }
    }

    public static void j(Class cls, String str, Throwable th) {
        if (f14625a.j(6)) {
            f14625a.c(r(cls), str, th);
        }
    }

    public static void k(Class cls, String str, Object... objArr) {
        if (f14625a.j(6)) {
            f14625a.e(r(cls), q(str, objArr));
        }
    }

    public static void l(Class cls, Throwable th, String str, Object... objArr) {
        if (f14625a.j(6)) {
            f14625a.c(r(cls), q(str, objArr), th);
        }
    }

    public static void m(String str, String str2) {
        if (f14625a.j(6)) {
            f14625a.e(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th) {
        if (f14625a.j(6)) {
            f14625a.c(str, str2, th);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        if (f14625a.j(6)) {
            f14625a.e(str, q(str2, objArr));
        }
    }

    public static void p(String str, Throwable th, String str2, Object... objArr) {
        if (f14625a.j(6)) {
            f14625a.c(str, q(str2, objArr), th);
        }
    }

    private static String q(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String r(Class cls) {
        return cls.getSimpleName();
    }

    public static void s(String str, String str2) {
        if (f14625a.j(4)) {
            f14625a.k(str, str2);
        }
    }

    public static void t(String str, String str2, Object obj, Object obj2) {
        if (f14625a.j(4)) {
            f14625a.k(str, q(str2, obj, obj2));
        }
    }

    public static void u(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f14625a.j(4)) {
            f14625a.k(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (f14625a.j(4)) {
            f14625a.k(str, q(str2, objArr));
        }
    }

    public static boolean w(int i10) {
        return f14625a.j(i10);
    }

    public static void x(Class cls, String str) {
        if (f14625a.j(2)) {
            f14625a.f(r(cls), str);
        }
    }

    public static void y(Class cls, String str, Object obj) {
        if (f14625a.j(2)) {
            f14625a.f(r(cls), q(str, obj));
        }
    }

    public static void z(Class cls, String str, Object obj, Object obj2) {
        if (f14625a.j(2)) {
            f14625a.f(r(cls), q(str, obj, obj2));
        }
    }
}
