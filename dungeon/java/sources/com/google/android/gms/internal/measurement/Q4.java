package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class Q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32706b;

    Q4(Object obj, int i10) {
        this.f32705a = obj;
        this.f32706b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q4)) {
            return false;
        }
        Q4 q10 = (Q4) obj;
        return this.f32705a == q10.f32705a && this.f32706b == q10.f32706b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f32705a) * 65535) + this.f32706b;
    }
}
