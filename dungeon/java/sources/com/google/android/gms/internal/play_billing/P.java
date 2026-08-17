package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P extends H implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient K f34488b;

    P() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    public K g() {
        K k10 = this.f34488b;
        if (k10 != null) {
            return k10;
        }
        K kJ = j();
        this.f34488b = kJ;
        return kJ;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return Z.a(this);
    }

    K j() {
        Object[] array = toArray();
        int i10 = K.f34456c;
        return K.k(array, array.length);
    }
}
