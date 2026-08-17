package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3015o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f35711a;

    C3015o() {
        this.f35711a = new EnumMap(T8.v.class);
    }

    private C3015o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(T8.v.class);
        this.f35711a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static C3015o d(String str) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        if (str.length() >= T8.v.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                T8.v[] vVarArrValues = T8.v.values();
                int length = vVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(vVarArrValues[i10], EnumC3008n.e(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C3015o(enumMap);
            }
        }
        return new C3015o();
    }

    public final EnumC3008n a(T8.v vVar) {
        EnumC3008n enumC3008n = (EnumC3008n) this.f35711a.get(vVar);
        return enumC3008n == null ? EnumC3008n.UNSET : enumC3008n;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void b(T8.v vVar, int i10) {
        EnumC3008n enumC3008n = EnumC3008n.UNSET;
        if (i10 == -30) {
            enumC3008n = EnumC3008n.TCF;
        } else if (i10 == -20) {
            enumC3008n = EnumC3008n.API;
        } else if (i10 == -10) {
            enumC3008n = EnumC3008n.MANIFEST;
        } else if (i10 == 0) {
            enumC3008n = EnumC3008n.API;
        } else if (i10 == 30) {
            enumC3008n = EnumC3008n.INITIALIZATION;
        }
        this.f35711a.put(vVar, enumC3008n);
    }

    public final void c(T8.v vVar, EnumC3008n enumC3008n) {
        this.f35711a.put(vVar, enumC3008n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (T8.v vVar : T8.v.values()) {
            EnumC3008n enumC3008n = (EnumC3008n) this.f35711a.get(vVar);
            if (enumC3008n == null) {
                enumC3008n = EnumC3008n.UNSET;
            }
            sb2.append(enumC3008n.g());
        }
        return sb2.toString();
    }
}
