package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3147m extends AbstractC3135c implements A.b, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3147m f37987d = new C3147m(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f37988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37989c;

    C3147m() {
        this(new double[10], 0, true);
    }

    private C3147m(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f37988b = dArr;
        this.f37989c = i10;
    }

    private void h(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f37989c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        double[] dArr = this.f37988b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f37988b, i10, dArr2, i10 + 1, this.f37989c - i10);
            this.f37988b = dArr2;
        }
        this.f37988b[i10] = d10;
        this.f37989c++;
        ((AbstractList) this).modCount++;
    }

    public static C3147m i() {
        return f37987d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f37989c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37989c;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        A.a(collection);
        if (!(collection instanceof C3147m)) {
            return super.addAll(collection);
        }
        C3147m c3147m = (C3147m) collection;
        int i10 = c3147m.f37989c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37989c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f37988b;
        if (i12 > dArr.length) {
            this.f37988b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c3147m.f37988b, 0, this.f37988b, this.f37989c, c3147m.f37989c);
        this.f37989c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        h(i10, d10.doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        g(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3147m)) {
            return super.equals(obj);
        }
        C3147m c3147m = (C3147m) obj;
        if (this.f37989c != c3147m.f37989c) {
            return false;
        }
        double[] dArr = c3147m.f37988b;
        for (int i10 = 0; i10 < this.f37989c; i10++) {
            if (Double.doubleToLongBits(this.f37988b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.A.i
    public A.b f(int i10) {
        if (i10 >= this.f37989c) {
            return new C3147m(Arrays.copyOf(this.f37988b, i10), this.f37989c, true);
        }
        throw new IllegalArgumentException();
    }

    public void g(double d10) {
        a();
        int i10 = this.f37989c;
        double[] dArr = this.f37988b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f37988b = dArr2;
        }
        double[] dArr3 = this.f37988b;
        int i11 = this.f37989c;
        this.f37989c = i11 + 1;
        dArr3[i11] = d10;
    }

    public double getDouble(int i10) {
        j(i10);
        return this.f37988b[i10];
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f37989c; i10++) {
            iF = (iF * 31) + A.f(Double.doubleToLongBits(this.f37988b[i10]));
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f37988b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        j(i10);
        double[] dArr = this.f37988b;
        double d10 = dArr[i10];
        int i11 = this.f37989c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f37989c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(p(i10, d10.doubleValue()));
    }

    public double p(int i10, double d10) {
        a();
        j(i10);
        double[] dArr = this.f37988b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f37988b;
        System.arraycopy(dArr, i11, dArr, i10, this.f37989c - i11);
        this.f37989c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37989c;
    }
}
