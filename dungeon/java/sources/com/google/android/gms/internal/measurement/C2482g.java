package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2482g implements InterfaceC2572q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32911a;

    public C2482g(Boolean bool) {
        this.f32911a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        return Double.valueOf(true != this.f32911a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        return Boolean.valueOf(this.f32911a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2482g) && this.f32911a == ((C2482g) obj).f32911a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        return new C2482g(Boolean.valueOf(this.f32911a));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f32911a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        if ("toString".equals(str)) {
            return new C2607u(Boolean.toString(this.f32911a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f32911a), str));
    }

    public final String toString() {
        return String.valueOf(this.f32911a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        return Boolean.toString(this.f32911a);
    }
}
