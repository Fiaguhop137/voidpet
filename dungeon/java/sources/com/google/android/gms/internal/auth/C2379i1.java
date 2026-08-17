package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2379i1 extends AbstractC2360c0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2379i1 f32401d = new C2379i1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f32402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32403c;

    private C2379i1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f32402b = objArr;
        this.f32403c = i10;
    }

    public static C2379i1 c() {
        return f32401d;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32403c;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f32403c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f32403c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        Object[] objArr = this.f32402b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f32402b, i10, objArr2, i10 + 1, this.f32403c - i10);
            this.f32402b = objArr2;
        }
        this.f32402b[i10] = obj;
        this.f32403c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2360c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f32403c;
        Object[] objArr = this.f32402b;
        if (i10 == objArr.length) {
            this.f32402b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f32402b;
        int i11 = this.f32403c;
        this.f32403c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.f32402b[i10];
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 m(int i10) {
        if (i10 >= this.f32403c) {
            return new C2379i1(Arrays.copyOf(this.f32402b, i10), this.f32403c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2360c0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f32402b;
        Object obj = objArr[i10];
        int i11 = this.f32403c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f32403c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f32402b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32403c;
    }
}
