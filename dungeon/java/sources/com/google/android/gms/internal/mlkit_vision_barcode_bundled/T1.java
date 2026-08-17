package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class T1 extends AbstractC2762v0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final T1 f33377d = new T1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f33378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33379c;

    private T1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f33378b = objArr;
        this.f33379c = i10;
    }

    public static T1 c() {
        return f33377d;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33379c;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f33379c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f33379c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f33378b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f33378b, i10, objArr2, i12, this.f33379c - i10);
            this.f33378b = objArr2;
        }
        this.f33378b[i10] = obj;
        this.f33379c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f33379c;
        Object[] objArr = this.f33378b;
        if (i10 == objArr.length) {
            this.f33378b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f33378b;
        int i11 = this.f33379c;
        this.f33379c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.f33378b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1
    public final /* bridge */ /* synthetic */ InterfaceC2739q1 m(int i10) {
        if (i10 >= this.f33379c) {
            return new T1(Arrays.copyOf(this.f33378b, i10), this.f33379c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f33378b;
        Object obj = objArr[i10];
        int i11 = this.f33379c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f33379c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f33378b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33379c;
    }
}
