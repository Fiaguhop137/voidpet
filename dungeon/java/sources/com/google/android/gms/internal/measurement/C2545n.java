package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2545n implements InterfaceC2572q, InterfaceC2536m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f33019a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return InterfaceC2536m.k(this.f33019a);
    }

    public final List d() {
        return new ArrayList(this.f33019a.keySet());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2545n) {
            return this.f33019a.equals(((C2545n) obj).f33019a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        C2545n c2545n = new C2545n();
        for (Map.Entry entry : this.f33019a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2536m) {
                c2545n.f33019a.put((String) entry.getKey(), (InterfaceC2572q) entry.getValue());
            } else {
                c2545n.f33019a.put((String) entry.getKey(), ((InterfaceC2572q) entry.getValue()).g());
            }
        }
        return c2545n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final InterfaceC2572q h(String str) {
        Map map = this.f33019a;
        return map.containsKey(str) ? (InterfaceC2572q) map.get(str) : InterfaceC2572q.f33082p1;
    }

    public final int hashCode() {
        return this.f33019a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final void i(String str, InterfaceC2572q interfaceC2572q) {
        if (interfaceC2572q == null) {
            this.f33019a.remove(str);
        } else {
            this.f33019a.put(str, interfaceC2572q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public InterfaceC2572q j(String str, Y1 y10, List list) {
        return "toString".equals(str) ? new C2607u(toString()) : InterfaceC2536m.e(this, new C2607u(str), y10, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final boolean l(String str) {
        return this.f33019a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f33019a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        return "[object Object]";
    }
}
