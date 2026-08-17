package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2652z2 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(InterfaceC2572q interfaceC2572q) {
        if (interfaceC2572q == null) {
            return false;
        }
        Double dA = interfaceC2572q.a();
        return !dA.isNaN() && dA.doubleValue() >= 0.0d && dA.equals(Double.valueOf(Math.floor(dA.doubleValue())));
    }

    public static N e(String str) {
        N nE = null;
        if (str != null && !str.isEmpty()) {
            nE = N.e(Integer.parseInt(str));
        }
        if (nE != null) {
            return nE;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(InterfaceC2572q interfaceC2572q, InterfaceC2572q interfaceC2572q2) {
        if (!interfaceC2572q.getClass().equals(interfaceC2572q2.getClass())) {
            return false;
        }
        if ((interfaceC2572q instanceof C2616v) || (interfaceC2572q instanceof C2554o)) {
            return true;
        }
        if (interfaceC2572q instanceof C2509j) {
            if (Double.isNaN(interfaceC2572q.a().doubleValue()) || Double.isNaN(interfaceC2572q2.a().doubleValue())) {
                return false;
            }
            return interfaceC2572q.a().equals(interfaceC2572q2.a());
        }
        if (interfaceC2572q instanceof C2607u) {
            return interfaceC2572q.zzc().equals(interfaceC2572q2.zzc());
        }
        if (interfaceC2572q instanceof C2482g) {
            return interfaceC2572q.b().equals(interfaceC2572q2.b());
        }
        return interfaceC2572q == interfaceC2572q2;
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return ((long) g(d10)) & 4294967295L;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object j(InterfaceC2572q interfaceC2572q) {
        if (InterfaceC2572q.f33083q1.equals(interfaceC2572q)) {
            return null;
        }
        if (InterfaceC2572q.f33082p1.equals(interfaceC2572q)) {
            return "";
        }
        if (interfaceC2572q instanceof C2545n) {
            return k((C2545n) interfaceC2572q);
        }
        if (!(interfaceC2572q instanceof C2473f)) {
            return !interfaceC2572q.a().isNaN() ? interfaceC2572q.a() : interfaceC2572q.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C2473f) interfaceC2572q).iterator();
        while (it.hasNext()) {
            Object objJ = j((InterfaceC2572q) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(C2545n c2545n) {
        HashMap map = new HashMap();
        for (String str : c2545n.d()) {
            Object objJ = j(c2545n.h(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(Y1 y10) {
        int iG = g(y10.h("runtime.counter").a().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        y10.e("runtime.counter", new C2509j(Double.valueOf(iG)));
        return iG;
    }
}
