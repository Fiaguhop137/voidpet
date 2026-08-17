package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2598t implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2607u f33146b;

    C2598t(C2607u c2607u) {
        Objects.requireNonNull(c2607u);
        this.f33146b = c2607u;
        this.f33145a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33145a < this.f33146b.e().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C2607u c2607u = this.f33146b;
        String strE = c2607u.e();
        int i10 = this.f33145a;
        if (i10 >= strE.length()) {
            throw new NoSuchElementException();
        }
        this.f33145a = i10 + 1;
        return new C2607u(String.valueOf(c2607u.e().charAt(i10)));
    }
}
