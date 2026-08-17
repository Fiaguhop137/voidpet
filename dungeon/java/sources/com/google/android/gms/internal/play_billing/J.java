package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class J extends K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f34450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f34451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ K f34452f;

    J(K k10, int i10, int i11) {
        Objects.requireNonNull(k10);
        this.f34452f = k10;
        this.f34450d = i10;
        this.f34451e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final int c() {
        return this.f34452f.e() + this.f34450d + this.f34451e;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final int e() {
        return this.f34452f.e() + this.f34450d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2895x.a(i10, this.f34451e, "index");
        return this.f34452f.get(i10 + this.f34450d);
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final Object[] i() {
        return this.f34452f.i();
    }

    @Override // com.google.android.gms.internal.play_billing.K
    /* JADX INFO: renamed from: j */
    public final K subList(int i10, int i11) {
        AbstractC2895x.d(i10, i11, this.f34451e);
        int i12 = this.f34450d;
        return this.f34452f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34451e;
    }

    @Override // com.google.android.gms.internal.play_billing.K, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
