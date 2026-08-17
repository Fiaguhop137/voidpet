package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417v1 extends AbstractList implements RandomAccess, J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0 f32467a;

    public C2417v1(J0 j10) {
        this.f32467a = j10;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List d() {
        return this.f32467a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((I0) this.f32467a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2414u1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2411t1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32467a.size();
    }
}
