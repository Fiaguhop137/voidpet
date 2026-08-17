package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class E3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E3 f34980c = new E3(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f34981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34982b;

    public E3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        this.f34981a = enumMap;
        enumMap.put(T8.v.AD_STORAGE, h(null));
        enumMap.put(T8.v.ANALYTICS_STORAGE, h(null));
        this.f34982b = i10;
    }

    private E3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(T8.v.class);
        this.f34981a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f34982b = i10;
    }

    public static E3 a(T8.u uVar, T8.u uVar2, int i10) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        enumMap.put(T8.v.AD_STORAGE, uVar);
        enumMap.put(T8.v.ANALYTICS_STORAGE, uVar2);
        return new E3(enumMap, -10);
    }

    static String d(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static E3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new E3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(T8.v.class);
        for (T8.v vVar : D3.STORAGE.g()) {
            enumMap.put(vVar, g(bundle.getString(vVar.f12366a)));
        }
        return new E3(enumMap, i10);
    }

    public static E3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        T8.v[] vVarArrE = D3.STORAGE.e();
        for (int i11 = 0; i11 < vVarArrE.length; i11++) {
            String str2 = str == null ? "" : str;
            T8.v vVar = vVarArrE[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(vVar, j(str2.charAt(i12)));
            } else {
                enumMap.put(vVar, T8.u.UNINITIALIZED);
            }
        }
        return new E3(enumMap, i10);
    }

    static T8.u g(String str) {
        if (str == null) {
            return T8.u.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return T8.u.GRANTED;
        }
        return str.equals("denied") ? T8.u.DENIED : T8.u.UNINITIALIZED;
    }

    static T8.u h(Boolean bool) {
        if (bool == null) {
            return T8.u.UNINITIALIZED;
        }
        return bool.booleanValue() ? T8.u.GRANTED : T8.u.DENIED;
    }

    static String i(T8.u uVar) {
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    static T8.u j(char c10) {
        if (c10 == '+') {
            return T8.u.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? T8.u.UNINITIALIZED : T8.u.GRANTED;
        }
        return T8.u.DENIED;
    }

    static char m(T8.u uVar) {
        if (uVar == null) {
            return '-';
        }
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f34982b;
    }

    public final boolean c() {
        Iterator it = this.f34981a.values().iterator();
        while (it.hasNext()) {
            if (((T8.u) it.next()) != T8.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e10 = (E3) obj;
        for (T8.v vVar : D3.STORAGE.g()) {
            if (this.f34981a.get(vVar) != e10.f34981a.get(vVar)) {
                return false;
            }
        }
        return this.f34982b == e10.f34982b;
    }

    public final int hashCode() {
        Iterator it = this.f34981a.values().iterator();
        int iHashCode = this.f34982b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((T8.u) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String k() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (T8.v vVar : D3.STORAGE.e()) {
            T8.u uVar = (T8.u) this.f34981a.get(vVar);
            char c10 = '-';
            if (uVar != null && (iOrdinal = uVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (T8.v vVar : D3.STORAGE.e()) {
            sb2.append(m((T8.u) this.f34981a.get(vVar)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f34981a.entrySet()) {
            String strI = i((T8.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((T8.v) entry.getKey()).f12366a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(T8.v vVar) {
        return ((T8.u) this.f34981a.get(vVar)) != T8.u.DENIED;
    }

    public final T8.u p() {
        T8.u uVar = (T8.u) this.f34981a.get(T8.v.AD_STORAGE);
        return uVar == null ? T8.u.UNINITIALIZED : uVar;
    }

    public final T8.u q() {
        T8.u uVar = (T8.u) this.f34981a.get(T8.v.ANALYTICS_STORAGE);
        return uVar == null ? T8.u.UNINITIALIZED : uVar;
    }

    public final boolean r(E3 e10) {
        EnumMap enumMap = this.f34981a;
        for (T8.v vVar : (T8.v[]) enumMap.keySet().toArray(new T8.v[0])) {
            T8.u uVar = (T8.u) enumMap.get(vVar);
            T8.u uVar2 = (T8.u) e10.f34981a.get(vVar);
            T8.u uVar3 = T8.u.DENIED;
            if (uVar == uVar3 && uVar2 != uVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final E3 s(E3 e10) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        for (T8.v vVar : D3.STORAGE.g()) {
            T8.u uVar = (T8.u) this.f34981a.get(vVar);
            T8.u uVar2 = (T8.u) e10.f34981a.get(vVar);
            if (uVar == null) {
                uVar = uVar2;
            } else if (uVar2 != null) {
                T8.u uVar3 = T8.u.UNINITIALIZED;
                if (uVar == uVar3) {
                    uVar = uVar2;
                } else if (uVar2 != uVar3) {
                    T8.u uVar4 = T8.u.POLICY;
                    if (uVar == uVar4) {
                        uVar = uVar2;
                    } else if (uVar2 != uVar4) {
                        T8.u uVar5 = T8.u.DENIED;
                        uVar = (uVar == uVar5 || uVar2 == uVar5) ? uVar5 : T8.u.GRANTED;
                    }
                }
            }
            if (uVar != null) {
                enumMap.put(vVar, uVar);
            }
        }
        return new E3(enumMap, 100);
    }

    public final E3 t(E3 e10) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        for (T8.v vVar : D3.STORAGE.g()) {
            T8.u uVar = (T8.u) this.f34981a.get(vVar);
            if (uVar == T8.u.UNINITIALIZED) {
                uVar = (T8.u) e10.f34981a.get(vVar);
            }
            if (uVar != null) {
                enumMap.put(vVar, uVar);
            }
        }
        return new E3(enumMap, this.f34982b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f34982b));
        for (T8.v vVar : D3.STORAGE.g()) {
            sb2.append(",");
            sb2.append(vVar.f12366a);
            sb2.append("=");
            T8.u uVar = (T8.u) this.f34981a.get(vVar);
            if (uVar == null) {
                uVar = T8.u.UNINITIALIZED;
            }
            sb2.append(uVar);
        }
        return sb2.toString();
    }
}
