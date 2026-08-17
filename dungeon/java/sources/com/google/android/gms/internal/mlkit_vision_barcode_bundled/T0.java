package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33376b;

    T0(Object obj, int i10) {
        this.f33375a = obj;
        this.f33376b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T0)) {
            return false;
        }
        T0 t10 = (T0) obj;
        return this.f33375a == t10.f33375a && this.f33376b == t10.f33376b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f33375a) * 65535) + this.f33376b;
    }
}
