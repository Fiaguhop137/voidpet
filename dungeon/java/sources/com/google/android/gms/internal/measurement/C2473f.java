package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2473f implements Iterable, InterfaceC2572q, InterfaceC2536m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SortedMap f32904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f32905b;

    public C2473f() {
        this.f32904a = new TreeMap();
        this.f32905b = new TreeMap();
    }

    public C2473f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                t(i10, (InterfaceC2572q) list.get(i10));
            }
        }
    }

    public final String A(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f32904a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= p()) {
                    break;
                }
                InterfaceC2572q interfaceC2572qS = s(i10);
                sb2.append(str2);
                if (!(interfaceC2572qS instanceof C2616v) && !(interfaceC2572qS instanceof C2554o)) {
                    sb2.append(interfaceC2572qS.zzc());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        SortedMap sortedMap = this.f32904a;
        if (sortedMap.size() == 1) {
            return s(0).a();
        }
        return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return new C2455d(this, this.f32904a.keySet().iterator(), this.f32905b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2473f)) {
            return false;
        }
        C2473f c2473f = (C2473f) obj;
        if (p() != c2473f.p()) {
            return false;
        }
        SortedMap sortedMap = this.f32904a;
        if (sortedMap.isEmpty()) {
            return c2473f.f32904a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!s(iIntValue).equals(c2473f.s(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        C2473f c2473f = new C2473f();
        for (Map.Entry entry : this.f32904a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2536m) {
                c2473f.f32904a.put((Integer) entry.getKey(), (InterfaceC2572q) entry.getValue());
            } else {
                c2473f.f32904a.put((Integer) entry.getKey(), ((InterfaceC2572q) entry.getValue()).g());
            }
        }
        return c2473f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final InterfaceC2572q h(String str) {
        InterfaceC2572q interfaceC2572q;
        if ("length".equals(str)) {
            return new C2509j(Double.valueOf(p()));
        }
        return (!l(str) || (interfaceC2572q = (InterfaceC2572q) this.f32905b.get(str)) == null) ? InterfaceC2572q.f33082p1 : interfaceC2572q;
    }

    public final int hashCode() {
        return this.f32904a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final void i(String str, InterfaceC2572q interfaceC2572q) {
        if (interfaceC2572q == null) {
            this.f32905b.remove(str);
        } else {
            this.f32905b.put(str, interfaceC2572q);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2464e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? D.a(str, this, y10, list) : InterfaceC2536m.e(this, new C2607u(str), y10, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final boolean l(String str) {
        return "length".equals(str) || this.f32905b.containsKey(str);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i10 = 0; i10 < p(); i10++) {
            arrayList.add(s(i10));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.f32904a.keySet().iterator();
    }

    public final int p() {
        SortedMap sortedMap = this.f32904a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int q() {
        return this.f32904a.size();
    }

    public final InterfaceC2572q s(int i10) {
        InterfaceC2572q interfaceC2572q;
        if (i10 < p()) {
            return (!v(i10) || (interfaceC2572q = (InterfaceC2572q) this.f32904a.get(Integer.valueOf(i10))) == null) ? InterfaceC2572q.f33082p1 : interfaceC2572q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void t(int i10, InterfaceC2572q interfaceC2572q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC2572q == null) {
            this.f32904a.remove(Integer.valueOf(i10));
        } else {
            this.f32904a.put(Integer.valueOf(i10), interfaceC2572q);
        }
    }

    public final String toString() {
        return A(",");
    }

    public final boolean v(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f32904a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void w() {
        this.f32904a.clear();
    }

    public final void x(int i10, InterfaceC2572q interfaceC2572q) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= p()) {
            t(i10, interfaceC2572q);
            return;
        }
        SortedMap sortedMap = this.f32904a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC2572q interfaceC2572q2 = (InterfaceC2572q) sortedMap.get(numValueOf);
            if (interfaceC2572q2 != null) {
                t(iIntValue + 1, interfaceC2572q2);
                sortedMap.remove(numValueOf);
            }
        }
        t(i10, interfaceC2572q);
    }

    public final void y(int i10) {
        SortedMap sortedMap = this.f32904a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(numValueOf, InterfaceC2572q.f33082p1);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC2572q interfaceC2572q = (InterfaceC2572q) sortedMap.get(numValueOf2);
            if (interfaceC2572q != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC2572q);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        return A(",");
    }
}
