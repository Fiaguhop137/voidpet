package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28378d;

    public v(int i10, int i11, int i12, int i13) {
        this.f28375a = i10;
        this.f28376b = i11;
        this.f28377c = i12;
        this.f28378d = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        vVar.getClass();
        return this.f28375a == vVar.f28375a && this.f28376b == vVar.f28376b && this.f28377c == vVar.f28377c && this.f28378d == vVar.f28378d;
    }

    public final int hashCode() {
        return ((((((this.f28375a + 59) * 59) + this.f28376b) * 59) + this.f28377c) * 59) + this.f28378d;
    }

    public final String toString() {
        return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + this.f28375a + ", topRight=" + this.f28376b + ", bottomLeft=" + this.f28377c + ", bottomRight=" + this.f28378d + ")";
    }
}
