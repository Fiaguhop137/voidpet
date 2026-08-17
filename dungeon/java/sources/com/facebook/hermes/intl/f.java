package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static HashMap a(List list, Object obj, List list2) {
        Object obj2;
        Object objO;
        Object objR;
        HashMap map = new HashMap();
        e.a aVarF = L5.d.h(L5.d.a(obj, "localeMatcher")).equals("lookup") ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objB = L5.d.b();
            if (!aVarF.f28901b.isEmpty() && aVarF.f28901b.containsKey(str)) {
                String str2 = (String) aVarF.f28901b.get(str);
                if (str2.isEmpty()) {
                    obj2 = objB;
                    obj2 = objB;
                    objR = str2;
                    objR = L5.d.r("true");
                }
                obj2 = objB;
                obj2 = objB;
                objR = str2;
                hashSet.add(str);
                obj2 = objR;
            }
            obj2 = objB;
            obj2 = objB;
            obj2 = objB;
            Object obj3 = obj2;
            if (L5.d.g(obj).containsKey(str)) {
                Object objA = L5.d.a(obj, str);
                if (L5.d.m(objA) && L5.d.h(objA).isEmpty()) {
                    objO = objA;
                    objO = objA;
                    objO = L5.d.o(true);
                }
                objO = objA;
                objO = objA;
                objO = objA;
                obj3 = obj2;
                if (!L5.d.n(objO) && !objO.equals(obj2)) {
                    obj3 = obj2;
                    hashSet.remove(str);
                    obj3 = objO;
                }
            }
            obj3 = obj2;
            boolean zJ = L5.d.j(obj3);
            Object objF = obj3;
            if (!zJ) {
                objF = L5.j.f(str, obj3);
            }
            if (!L5.d.m(objF) || L5.j.c(str, L5.d.h(objF), aVarF.f28900a)) {
                map.put(str, objF);
            } else {
                map.put(str, L5.d.b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String strH = L5.d.h(L5.j.f(str3, L5.d.r((String) aVarF.f28901b.get(str3))));
            if (!L5.d.m(strH) || L5.j.c(str3, L5.d.h(strH), aVarF.f28900a)) {
                arrayList.add(strH);
                aVarF.f28900a.f(str3, arrayList);
            }
        }
        map.put("locale", aVarF.f28900a);
        return map;
    }
}
