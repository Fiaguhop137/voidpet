package L5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Object f6360a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f6361b = new a(null);

    private static class a {
        private a() {
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    private static class b {
        private b() {
        }

        /* synthetic */ b(e eVar) {
            this();
        }
    }

    public static Object a(Object obj, String str) {
        HashMap map = (HashMap) obj;
        if (!map.containsKey(str)) {
            return d();
        }
        Object obj2 = map.get(str);
        return obj2 == null ? b() : obj2;
    }

    public static Object b() {
        return f6361b;
    }

    public static void c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    public static Object d() {
        return f6360a;
    }

    public static boolean e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Map g(Object obj) {
        return (HashMap) obj;
    }

    public static String h(Object obj) {
        return (String) obj;
    }

    public static boolean i(Object obj) {
        return obj instanceof Boolean;
    }

    public static boolean j(Object obj) {
        return obj instanceof a;
    }

    public static boolean k(Object obj) {
        return obj instanceof Double;
    }

    public static boolean l(Object obj) {
        return obj instanceof HashMap;
    }

    public static boolean m(Object obj) {
        return obj instanceof String;
    }

    public static boolean n(Object obj) {
        return obj instanceof b;
    }

    public static Object o(boolean z10) {
        return Boolean.valueOf(z10);
    }

    public static Object p(double d10) {
        return Double.valueOf(d10);
    }

    public static Object q() {
        return new HashMap();
    }

    public static Object r(String str) {
        return str;
    }
}
