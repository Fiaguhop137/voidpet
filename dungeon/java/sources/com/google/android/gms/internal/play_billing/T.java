package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class T extends K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final K f34650f = new T(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f34651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f34652e;

    T(Object[] objArr, int i10) {
        this.f34651d = objArr;
        this.f34652e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.K, com.google.android.gms.internal.play_billing.H
    final int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f34651d;
        int i11 = this.f34652e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final int c() {
        return this.f34652e;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2895x.a(i10, this.f34652e, "index");
        Object obj = this.f34651d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final Object[] i() {
        return this.f34651d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34652e;
    }
}
