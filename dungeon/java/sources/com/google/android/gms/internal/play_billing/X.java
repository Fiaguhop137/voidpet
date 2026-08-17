package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class X extends K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f34672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f34673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f34674f;

    X(Object[] objArr, int i10, int i11) {
        this.f34672d = objArr;
        this.f34673e = i10;
        this.f34674f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2895x.a(i10, this.f34674f, "index");
        Object obj = this.f34672d[i10 + i10 + this.f34673e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34674f;
    }
}
