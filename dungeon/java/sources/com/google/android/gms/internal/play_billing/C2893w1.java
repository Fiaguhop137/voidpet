package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2893w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34818b;

    C2893w1(Object obj, int i10) {
        this.f34817a = obj;
        this.f34818b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2893w1)) {
            return false;
        }
        C2893w1 c2893w1 = (C2893w1) obj;
        return this.f34817a == c2893w1.f34817a && this.f34818b == c2893w1.f34818b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f34817a) * 65535) + this.f34818b;
    }
}
