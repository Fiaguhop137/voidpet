package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements InterfaceC2572q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f33104b;

    public r(String str, List list) {
        this.f33103a = str;
        ArrayList arrayList = new ArrayList();
        this.f33104b = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return null;
    }

    public final String d() {
        return this.f33103a;
    }

    public final ArrayList e() {
        return this.f33104b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.f33103a;
        if (str == null ? rVar.f33103a == null : str.equals(rVar.f33103a)) {
            return this.f33104b.equals(rVar.f33104b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        return this;
    }

    public final int hashCode() {
        String str = this.f33103a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f33104b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
