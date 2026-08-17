package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class W extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient N f34664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient K f34665d;

    W(N n10, K k10) {
        this.f34664c = n10;
        this.f34665d = k10;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final int a(Object[] objArr, int i10) {
        return this.f34665d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f34664c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.P, com.google.android.gms.internal.play_billing.H
    public final K g() {
        return this.f34665d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f34665d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34664c.size();
    }
}
