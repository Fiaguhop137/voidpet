package com.facebook.hermes.intl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) throws L5.f {
        if (L5.d.n(obj)) {
            return obj4;
        }
        if (!L5.d.k(obj)) {
            throw new L5.f(str + " value is invalid.");
        }
        double dF = L5.d.f(obj);
        if (!Double.isNaN(dF) && dF <= L5.d.f(obj3) && dF >= L5.d.f(obj2)) {
            return obj;
        }
        throw new L5.f(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, L5.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) throws L5.f {
        Object objA = L5.d.a(obj, str);
        if (L5.d.n(objA)) {
            return obj3;
        }
        if (L5.d.j(objA)) {
            objA = "";
        }
        if (aVar == a.BOOLEAN && !L5.d.i(objA)) {
            throw new L5.f("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !L5.d.m(objA)) {
            throw new L5.f("String option expected but not found");
        }
        if (L5.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(objA)) {
            return objA;
        }
        throw new L5.f("String option expected but not found");
    }

    public static Enum d(Class cls, Object obj) {
        try {
            if (L5.d.n(obj)) {
                return Enum.valueOf(cls, "UNDEFINED");
            }
            if (L5.d.j(obj)) {
                return null;
            }
            String strH = L5.d.h(obj);
            if (strH.equals("2-digit")) {
                return Enum.valueOf(cls, "DIGIT2");
            }
            for (Enum r10 : (Enum[]) cls.getEnumConstants()) {
                if (r10.name().compareToIgnoreCase(strH) == 0) {
                    return r10;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
