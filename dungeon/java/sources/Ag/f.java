package Ag;

import Pf.C1328t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map f404a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map f405b = new HashMap();

    static {
        Map map = f404a;
        C1328t c1328t = Rf.a.f11228c;
        map.put("SHA-256", c1328t);
        Map map2 = f404a;
        C1328t c1328t2 = Rf.a.f11232e;
        map2.put("SHA-512", c1328t2);
        Map map3 = f404a;
        C1328t c1328t3 = Rf.a.f11248m;
        map3.put("SHAKE128", c1328t3);
        Map map4 = f404a;
        C1328t c1328t4 = Rf.a.f11250n;
        map4.put("SHAKE256", c1328t4);
        f405b.put(c1328t, "SHA-256");
        f405b.put(c1328t2, "SHA-512");
        f405b.put(c1328t3, "SHAKE128");
        f405b.put(c1328t4, "SHAKE256");
    }

    static Vf.j a(C1328t c1328t) {
        if (c1328t.q(Rf.a.f11228c)) {
            return new Xf.d();
        }
        if (c1328t.q(Rf.a.f11232e)) {
            return new Xf.g();
        }
        if (c1328t.q(Rf.a.f11248m)) {
            return new Xf.h(128);
        }
        if (c1328t.q(Rf.a.f11250n)) {
            return new Xf.h(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1328t);
    }

    static String b(C1328t c1328t) {
        String str = (String) f405b.get(c1328t);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + c1328t);
    }

    static C1328t c(String str) {
        C1328t c1328t = (C1328t) f404a.get(str);
        if (c1328t != null) {
            return c1328t;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
