package kotlin.jvm.internal;

import Ad.InterfaceC0795e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class K {
    public static Collection a(Object obj) {
        if ((obj instanceof Nd.a) && !(obj instanceof Nd.b)) {
            r(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof Nd.a) && !(obj instanceof Nd.c)) {
            r(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof Nd.a) && !(obj instanceof Nd.e)) {
            r(obj, "kotlin.collections.MutableMap");
        }
        return h(obj);
    }

    public static Set d(Object obj) {
        if ((obj instanceof Nd.a) && !(obj instanceof Nd.f)) {
            r(obj, "kotlin.collections.MutableSet");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            r(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Map h(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Set i(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC3973j) {
            return ((InterfaceC3973j) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Md.n) {
            return 3;
        }
        if (obj instanceof Md.o) {
            return 4;
        }
        if (obj instanceof Md.p) {
            return 5;
        }
        if (obj instanceof Md.q) {
            return 6;
        }
        if (obj instanceof Md.r) {
            return 7;
        }
        if (obj instanceof Md.s) {
            return 8;
        }
        if (obj instanceof Md.t) {
            return 9;
        }
        if (obj instanceof Md.a) {
            return 10;
        }
        if (obj instanceof Md.b) {
            return 11;
        }
        if (obj instanceof Md.c) {
            return 12;
        }
        if (obj instanceof Md.d) {
            return 13;
        }
        if (obj instanceof Md.e) {
            return 14;
        }
        if (obj instanceof Md.f) {
            return 15;
        }
        if (obj instanceof Md.g) {
            return 16;
        }
        if (obj instanceof Md.h) {
            return 17;
        }
        if (obj instanceof Md.i) {
            return 18;
        }
        if (obj instanceof Md.j) {
            return 19;
        }
        if (obj instanceof Md.k) {
            return 20;
        }
        if (obj instanceof Md.l) {
            return 21;
        }
        return obj instanceof Md.m ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof InterfaceC0795e) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof Nd.a) || (obj instanceof Nd.d);
        }
        return false;
    }

    public static boolean m(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof Nd.a) || (obj instanceof Nd.e);
        }
        return false;
    }

    public static boolean n(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof Nd.a) || (obj instanceof Nd.e.a);
        }
        return false;
    }

    public static boolean o(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof Nd.a) || (obj instanceof Nd.f);
        }
        return false;
    }

    private static Throwable p(Throwable th) {
        return Intrinsics.k(th, K.class.getName());
    }

    public static ClassCastException q(ClassCastException classCastException) {
        throw ((ClassCastException) p(classCastException));
    }

    public static void r(Object obj, String str) {
        s((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void s(String str) {
        throw q(new ClassCastException(str));
    }
}
