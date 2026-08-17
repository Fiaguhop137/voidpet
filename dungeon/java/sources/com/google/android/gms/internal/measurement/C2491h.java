package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2491h implements InterfaceC2572q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2572q f32922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32923b;

    public C2491h(String str) {
        this.f32922a = InterfaceC2572q.f33082p1;
        this.f32923b = str;
    }

    public C2491h(String str, InterfaceC2572q interfaceC2572q) {
        this.f32922a = interfaceC2572q;
        this.f32923b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return null;
    }

    public final InterfaceC2572q d() {
        return this.f32922a;
    }

    public final String e() {
        return this.f32923b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2491h)) {
            return false;
        }
        C2491h c2491h = (C2491h) obj;
        return this.f32923b.equals(c2491h.f32923b) && this.f32922a.equals(c2491h.f32922a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        return new C2491h(this.f32923b, this.f32922a.g());
    }

    public final int hashCode() {
        return (this.f32923b.hashCode() * 31) + this.f32922a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }
}
