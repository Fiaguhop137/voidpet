package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3159z extends AbstractC3135c implements A.g, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3159z f38123d = new C3159z(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f38124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38125c;

    C3159z() {
        this(new int[10], 0, true);
    }

    private C3159z(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f38124b = iArr;
        this.f38125c = i10;
    }

    private void h(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f38125c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int[] iArr = this.f38124b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f38124b, i10, iArr2, i10 + 1, this.f38125c - i10);
            this.f38124b = iArr2;
        }
        this.f38124b[i10] = i11;
        this.f38125c++;
        ((AbstractList) this).modCount++;
    }

    public static C3159z i() {
        return f38123d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f38125c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f38125c;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        A.a(collection);
        if (!(collection instanceof C3159z)) {
            return super.addAll(collection);
        }
        C3159z c3159z = (C3159z) collection;
        int i10 = c3159z.f38125c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f38125c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f38124b;
        if (i12 > iArr.length) {
            this.f38124b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c3159z.f38124b, 0, this.f38124b, this.f38125c, c3159z.f38125c);
        this.f38125c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        h(i10, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        g(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3159z)) {
            return super.equals(obj);
        }
        C3159z c3159z = (C3159z) obj;
        if (this.f38125c != c3159z.f38125c) {
            return false;
        }
        int[] iArr = c3159z.f38124b;
        for (int i10 = 0; i10 < this.f38125c; i10++) {
            if (this.f38124b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.A.i
    public A.g f(int i10) {
        if (i10 >= this.f38125c) {
            return new C3159z(Arrays.copyOf(this.f38124b, i10), this.f38125c, true);
        }
        throw new IllegalArgumentException();
    }

    public void g(int i10) {
        a();
        int i11 = this.f38125c;
        int[] iArr = this.f38124b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f38124b = iArr2;
        }
        int[] iArr3 = this.f38124b;
        int i12 = this.f38125c;
        this.f38125c = i12 + 1;
        iArr3[i12] = i10;
    }

    public int getInt(int i10) {
        j(i10);
        return this.f38124b[i10];
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f38125c; i11++) {
            i10 = (i10 * 31) + this.f38124b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f38124b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        j(i10);
        int[] iArr = this.f38124b;
        int i11 = iArr[i10];
        int i12 = this.f38125c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f38125c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(p(i10, num.intValue()));
    }

    public int p(int i10, int i11) {
        a();
        j(i10);
        int[] iArr = this.f38124b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f38124b;
        System.arraycopy(iArr, i11, iArr, i10, this.f38125c - i11);
        this.f38125c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38125c;
    }
}
