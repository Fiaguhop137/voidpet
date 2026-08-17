package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class D implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f34938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E f34939b;

    D(E e10) {
        Objects.requireNonNull(e10);
        this.f34939b = e10;
        this.f34938a = e10.f4().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f34938a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34938a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
