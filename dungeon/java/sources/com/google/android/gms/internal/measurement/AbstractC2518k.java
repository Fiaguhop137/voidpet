package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2518k implements InterfaceC2572q, InterfaceC2536m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f32959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map f32960b = new HashMap();

    public AbstractC2518k(String str) {
        this.f32959a = str;
    }

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
        return InterfaceC2536m.k(this.f32960b);
    }

    public abstract InterfaceC2572q d(Y1 y10, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2518k)) {
            return false;
        }
        AbstractC2518k abstractC2518k = (AbstractC2518k) obj;
        String str = this.f32959a;
        if (str != null) {
            return str.equals(abstractC2518k.f32959a);
        }
        return false;
    }

    public final String f() {
        return this.f32959a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public InterfaceC2572q g() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final InterfaceC2572q h(String str) {
        Map map = this.f32960b;
        return map.containsKey(str) ? (InterfaceC2572q) map.get(str) : InterfaceC2572q.f33082p1;
    }

    public final int hashCode() {
        String str = this.f32959a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final void i(String str, InterfaceC2572q interfaceC2572q) {
        if (interfaceC2572q == null) {
            this.f32960b.remove(str);
        } else {
            this.f32960b.put(str, interfaceC2572q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        return "toString".equals(str) ? new C2607u(this.f32959a) : InterfaceC2536m.e(this, new C2607u(str), y10, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2536m
    public final boolean l(String str) {
        return this.f32960b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        return this.f32959a;
    }
}
