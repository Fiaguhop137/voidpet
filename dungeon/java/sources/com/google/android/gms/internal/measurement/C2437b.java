package com.google.android.gms.internal.measurement;

import C9.AbstractC0878v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2437b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0878v f32860d = AbstractC0878v.y("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32863c;

    public C2437b(String str, long j10, Map map) {
        this.f32861a = str;
        this.f32862b = j10;
        HashMap map2 = new HashMap();
        this.f32863c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f32860d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f32862b;
    }

    public final String b() {
        return this.f32861a;
    }

    public final void c(String str) {
        this.f32861a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f32863c.remove(str);
        } else {
            Map map = this.f32863c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f32863c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2437b)) {
            return false;
        }
        C2437b c2437b = (C2437b) obj;
        if (this.f32862b == c2437b.f32862b && this.f32861a.equals(c2437b.f32861a)) {
            return this.f32863c.equals(c2437b.f32863c);
        }
        return false;
    }

    public final Map f() {
        return this.f32863c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C2437b clone() {
        return new C2437b(this.f32861a, this.f32862b, new HashMap(this.f32863c));
    }

    public final int hashCode() {
        int iHashCode = this.f32861a.hashCode() * 31;
        long j10 = this.f32862b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f32863c.hashCode();
    }

    public final String toString() {
        String str = this.f32861a;
        String string = this.f32863c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f32862b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
