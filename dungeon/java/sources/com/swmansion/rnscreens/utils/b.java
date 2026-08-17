package com.swmansion.rnscreens.utils;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f39332b;

    public b(int i10, boolean z10) {
        this.f39331a = i10;
        this.f39332b = z10;
    }

    public final int a() {
        return this.f39331a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f39331a == bVar.f39331a && this.f39332b == bVar.f39332b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f39331a) * 31) + Boolean.hashCode(this.f39332b);
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.f39331a + ", isTitleEmpty=" + this.f39332b + ")";
    }
}
