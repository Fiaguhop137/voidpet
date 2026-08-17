package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class k0 extends AbstractC3135c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k0 f37978d = new k0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f37979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37980c;

    private k0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f37979b = objArr;
        this.f37980c = i10;
    }

    private static Object[] c(int i10) {
        return new Object[i10];
    }

    public static k0 e() {
        return f37978d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f37980c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37980c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f37980c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f37979b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArrC = c(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f37979b, 0, objArrC, 0, i10);
            System.arraycopy(this.f37979b, i10, objArrC, i10 + 1, this.f37980c - i10);
            this.f37979b = objArrC;
        }
        this.f37979b[i10] = obj;
        this.f37980c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i10 = this.f37980c;
        Object[] objArr = this.f37979b;
        if (i10 == objArr.length) {
            this.f37979b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f37979b;
        int i11 = this.f37980c;
        this.f37980c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        g(i10);
        return this.f37979b[i10];
    }

    @Override // com.google.protobuf.A.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k0 f(int i10) {
        if (i10 >= this.f37980c) {
            return new k0(Arrays.copyOf(this.f37979b, i10), this.f37980c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f37979b;
        Object obj = objArr[i10];
        int i11 = this.f37980c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f37980c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f37979b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37980c;
    }
}
