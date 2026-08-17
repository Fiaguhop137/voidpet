package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2411t1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f32457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f32458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2417v1 f32459c;

    C2411t1(C2417v1 c2417v1, int i10) {
        this.f32459c = c2417v1;
        this.f32458b = i10;
        this.f32457a = c2417v1.f32467a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f32457a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32457a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f32457a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32457a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f32457a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32457a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
