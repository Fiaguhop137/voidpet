package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Y implements Serializable, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f32294a;

    Y(Object obj) {
        this.f32294a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Object obj2 = this.f32294a;
        Object obj3 = ((Y) obj).f32294a;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32294a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f32294a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        return this.f32294a;
    }
}
