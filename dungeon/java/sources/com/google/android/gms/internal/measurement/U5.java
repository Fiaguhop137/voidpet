package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class U5 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f32742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f32743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ X5 f32744c;

    U5(X5 x10, Comparable comparable, Object obj) {
        Objects.requireNonNull(x10);
        this.f32744c = x10;
        this.f32742a = comparable;
        this.f32743b = obj;
    }

    private static final boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f32742a.compareTo(((U5) obj).f32742a);
    }

    public final Comparable e() {
        return this.f32742a;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return g(this.f32742a, entry.getKey()) && g(this.f32743b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f32742a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f32743b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f32742a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f32743b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f32744c.h();
        Object obj2 = this.f32743b;
        this.f32743b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f32742a);
        String strValueOf2 = String.valueOf(this.f32743b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
