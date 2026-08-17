package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class U extends K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ V f34654d;

    U(V v10) {
        Objects.requireNonNull(v10);
        this.f34654d = v10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        V v10 = this.f34654d;
        AbstractC2895x.a(i10, v10.f34659e, "index");
        int i11 = i10 + i10;
        Object obj = v10.f34658d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = v10.f34658d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.H
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34654d.f34659e;
    }
}
