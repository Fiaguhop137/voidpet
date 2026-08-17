package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2455d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f32885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f32886b;

    C2455d(C2473f c2473f, Iterator it, Iterator it2) {
        this.f32885a = it;
        this.f32886b = it2;
        Objects.requireNonNull(c2473f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32885a.hasNext()) {
            return true;
        }
        return this.f32886b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f32885a;
        if (it.hasNext()) {
            return new C2607u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f32886b;
        if (it2.hasNext()) {
            return new C2607u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
