package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class V extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient N f34657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f34658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f34659e;

    V(N n10, Object[] objArr, int i10, int i11) {
        this.f34657c = n10;
        this.f34658d = objArr;
        this.f34659e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final int a(Object[] objArr, int i10) {
        return g().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f34657c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.P
    final K j() {
        return new U(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34659e;
    }
}
