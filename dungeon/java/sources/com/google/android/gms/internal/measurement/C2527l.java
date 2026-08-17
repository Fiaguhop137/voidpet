package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2527l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f32968a;

    C2527l(Iterator it) {
        this.f32968a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32968a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2607u((String) this.f32968a.next());
    }
}
