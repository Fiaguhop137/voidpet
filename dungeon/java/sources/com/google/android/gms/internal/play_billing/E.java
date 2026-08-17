package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class E extends AbstractC2792b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34438b;

    protected E(int i10, int i11) {
        AbstractC2895x.b(i11, i10, "index");
        this.f34437a = i10;
        this.f34438b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f34438b < this.f34437a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34438b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f34438b;
        this.f34438b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34438b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f34438b - 1;
        this.f34438b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34438b - 1;
    }
}
