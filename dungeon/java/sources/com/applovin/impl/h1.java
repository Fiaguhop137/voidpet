package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28054b;

    public h1(int i10, int i11) {
        this.f28053a = i10;
        this.f28054b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        h1Var.getClass();
        return this.f28053a == h1Var.f28053a && this.f28054b == h1Var.f28054b;
    }

    public final int hashCode() {
        return ((this.f28053a + 59) * 59) + this.f28054b;
    }

    public final String toString() {
        return "IndexPath(section=" + this.f28053a + ", row=" + this.f28054b + ")";
    }
}
