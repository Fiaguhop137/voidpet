package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2432a3 {
    public static InterfaceC2572q a(Object obj) {
        if (obj == null) {
            return InterfaceC2572q.f33083q1;
        }
        if (obj instanceof String) {
            return new C2607u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2509j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2509j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2509j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2482g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C2473f c2473f = new C2473f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2473f.t(c2473f.p(), a(it.next()));
            }
            return c2473f;
        }
        C2545n c2545n = new C2545n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC2572q interfaceC2572qA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c2545n.i((String) string, interfaceC2572qA);
            }
        }
        return c2545n;
    }

    public static InterfaceC2572q b(G3 g10) {
        if (g10 == null) {
            return InterfaceC2572q.f33082p1;
        }
        int iL = g10.L() - 1;
        if (iL == 1) {
            return g10.E() ? new C2607u(g10.F()) : InterfaceC2572q.f33089w1;
        }
        if (iL == 2) {
            return g10.I() ? new C2509j(Double.valueOf(g10.J())) : new C2509j(null);
        }
        if (iL == 3) {
            return g10.G() ? new C2482g(Boolean.valueOf(g10.H())) : new C2482g(null);
        }
        if (iL != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listC = g10.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(b((G3) it.next()));
        }
        return new r(g10.D(), arrayList);
    }
}
