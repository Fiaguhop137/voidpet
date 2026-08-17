package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3084y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3084y f36020f = new C3084y((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f36023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap f36025e;

    C3084y(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        this.f36025e = enumMap;
        enumMap.put(T8.v.AD_USER_DATA, E3.h(bool));
        this.f36021a = i10;
        this.f36022b = l();
        this.f36023c = bool2;
        this.f36024d = str;
    }

    private C3084y(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(T8.v.class);
        this.f36025e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f36021a = i10;
        this.f36022b = l();
        this.f36023c = bool;
        this.f36024d = str;
    }

    static C3084y a(T8.u uVar, int i10) {
        EnumMap enumMap = new EnumMap(T8.v.class);
        enumMap.put(T8.v.AD_USER_DATA, uVar);
        return new C3084y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C3084y g(String str) {
        if (str == null || str.length() <= 0) {
            return f36020f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(T8.v.class);
        T8.v[] vVarArrE = D3.DMA.e();
        int length = vVarArrE.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(vVarArrE[i12], E3.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C3084y(enumMap, i10, (Boolean) null, (String) null);
    }

    public static C3084y h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C3084y((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(T8.v.class);
        for (T8.v vVar : D3.DMA.e()) {
            enumMap.put(vVar, E3.g(bundle.getString(vVar.f12366a)));
        }
        return new C3084y(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        T8.u uVarG;
        if (bundle == null || (uVarG = E3.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = uVarG.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36021a);
        for (T8.v vVar : D3.DMA.e()) {
            sb2.append(":");
            sb2.append(E3.m((T8.u) this.f36025e.get(vVar)));
        }
        return sb2.toString();
    }

    public final int b() {
        return this.f36021a;
    }

    public final T8.u c() {
        T8.u uVar = (T8.u) this.f36025e.get(T8.v.AD_USER_DATA);
        return uVar == null ? T8.u.UNINITIALIZED : uVar;
    }

    public final boolean d() {
        Iterator it = this.f36025e.values().iterator();
        while (it.hasNext()) {
            if (((T8.u) it.next()) != T8.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f36022b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3084y)) {
            return false;
        }
        C3084y c3084y = (C3084y) obj;
        if (this.f36022b.equalsIgnoreCase(c3084y.f36022b) && Objects.equals(this.f36023c, c3084y.f36023c)) {
            return Objects.equals(this.f36024d, c3084y.f36024d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f36025e.entrySet()) {
            String strI = E3.i((T8.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((T8.v) entry.getKey()).f12366a, strI);
            }
        }
        Boolean bool = this.f36023c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f36024d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f36023c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f36024d;
        return this.f36022b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f36023c;
    }

    public final String k() {
        return this.f36024d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(E3.d(this.f36021a));
        for (T8.v vVar : D3.DMA.e()) {
            sb2.append(",");
            sb2.append(vVar.f12366a);
            sb2.append("=");
            T8.u uVar = (T8.u) this.f36025e.get(vVar);
            if (uVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f36023c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f36024d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }
}
