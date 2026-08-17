package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3140f extends AbstractC3135c implements A.a, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3140f f37905d = new C3140f(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f37906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37907c;

    C3140f() {
        this(new boolean[10], 0, true);
    }

    private C3140f(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f37906b = zArr;
        this.f37907c = i10;
    }

    private void g(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f37907c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        boolean[] zArr = this.f37906b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f37906b, i10, zArr2, i10 + 1, this.f37907c - i10);
            this.f37906b = zArr2;
        }
        this.f37906b[i10] = z10;
        this.f37907c++;
        ((AbstractList) this).modCount++;
    }

    public static C3140f i() {
        return f37905d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f37907c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37907c;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        A.a(collection);
        if (!(collection instanceof C3140f)) {
            return super.addAll(collection);
        }
        C3140f c3140f = (C3140f) collection;
        int i10 = c3140f.f37907c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37907c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f37906b;
        if (i12 > zArr.length) {
            this.f37906b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c3140f.f37906b, 0, this.f37906b, this.f37907c, c3140f.f37907c);
        this.f37907c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        g(i10, bool.booleanValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        h(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3140f)) {
            return super.equals(obj);
        }
        C3140f c3140f = (C3140f) obj;
        if (this.f37907c != c3140f.f37907c) {
            return false;
        }
        boolean[] zArr = c3140f.f37906b;
        for (int i10 = 0; i10 < this.f37907c; i10++) {
            if (this.f37906b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.A.i
    public A.a f(int i10) {
        if (i10 >= this.f37907c) {
            return new C3140f(Arrays.copyOf(this.f37906b, i10), this.f37907c, true);
        }
        throw new IllegalArgumentException();
    }

    public boolean getBoolean(int i10) {
        j(i10);
        return this.f37906b[i10];
    }

    public void h(boolean z10) {
        a();
        int i10 = this.f37907c;
        boolean[] zArr = this.f37906b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f37906b = zArr2;
        }
        boolean[] zArr3 = this.f37906b;
        int i11 = this.f37907c;
        this.f37907c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f37907c; i10++) {
            iC = (iC * 31) + A.c(this.f37906b[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f37906b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        j(i10);
        boolean[] zArr = this.f37906b;
        boolean z10 = zArr[i10];
        int i11 = this.f37907c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f37907c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(p(i10, bool.booleanValue()));
    }

    public boolean p(int i10, boolean z10) {
        a();
        j(i10);
        boolean[] zArr = this.f37906b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f37906b;
        System.arraycopy(zArr, i11, zArr, i10, this.f37907c - i11);
        this.f37907c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37907c;
    }
}
