package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2589s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2607u f33127b;

    C2589s(C2607u c2607u) {
        Objects.requireNonNull(c2607u);
        this.f33127b = c2607u;
        this.f33126a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33126a < this.f33127b.e().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strE = this.f33127b.e();
        int i10 = this.f33126a;
        if (i10 >= strE.length()) {
            throw new NoSuchElementException();
        }
        this.f33126a = i10 + 1;
        return new C2607u(String.valueOf(i10));
    }
}
