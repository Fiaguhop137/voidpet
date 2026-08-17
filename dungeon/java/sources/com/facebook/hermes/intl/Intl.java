package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class Intl {
    private static List a(List list) throws L5.f {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new L5.f("Incorrect locale information provided");
            }
            if (str.isEmpty()) {
                throw new L5.f("Incorrect locale information provided");
            }
            String strA = d.a(str);
            if (!strA.isEmpty() && !arrayList.contains(strA)) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @p276p6.a
    public static List<String> getCanonicalLocales(List<String> list) throws L5.f {
        return a(list);
    }

    @p276p6.a
    public static String toLocaleLowerCase(List<String> list, String str) throws L5.f {
        return UCharacter.toLowerCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f28900a.h(), str);
    }

    @p276p6.a
    public static String toLocaleUpperCase(List<String> list, String str) throws L5.f {
        return UCharacter.toUpperCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f28900a.h(), str);
    }
}
