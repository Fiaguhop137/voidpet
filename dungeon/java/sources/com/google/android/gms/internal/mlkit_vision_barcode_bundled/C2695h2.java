package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2695h2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f34228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f34229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2725n2 f34230c;

    C2695h2(AbstractC2725n2 abstractC2725n2, Comparable comparable, Object obj) {
        this.f34230c = abstractC2725n2;
        this.f34228a = comparable;
        this.f34229b = obj;
    }

    private static final boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f34228a.compareTo(((C2695h2) obj).f34228a);
    }

    public final Comparable e() {
        return this.f34228a;
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
        return g(this.f34228a, entry.getKey()) && g(this.f34229b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f34228a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34229b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f34228a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f34229b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f34230c.r();
        Object obj2 = this.f34229b;
        this.f34229b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f34228a) + "=" + String.valueOf(this.f34229b);
    }
}
