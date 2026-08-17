package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2616v implements InterfaceC2572q {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2616v;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        return InterfaceC2572q.f33082p1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        return "undefined";
    }
}
