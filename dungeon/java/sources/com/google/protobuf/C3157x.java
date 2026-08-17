package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3157x extends AbstractC3135c implements A.f, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3157x f38113d = new C3157x(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f38114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38115c;

    C3157x() {
        this(new float[10], 0, true);
    }

    private C3157x(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f38114b = fArr;
        this.f38115c = i10;
    }

    private void h(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f38115c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        float[] fArr = this.f38114b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f38114b, i10, fArr2, i10 + 1, this.f38115c - i10);
            this.f38114b = fArr2;
        }
        this.f38114b[i10] = f10;
        this.f38115c++;
        ((AbstractList) this).modCount++;
    }

    public static C3157x i() {
        return f38113d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f38115c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f38115c;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        A.a(collection);
        if (!(collection instanceof C3157x)) {
            return super.addAll(collection);
        }
        C3157x c3157x = (C3157x) collection;
        int i10 = c3157x.f38115c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f38115c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f38114b;
        if (i12 > fArr.length) {
            this.f38114b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c3157x.f38114b, 0, this.f38114b, this.f38115c, c3157x.f38115c);
        this.f38115c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        h(i10, f10.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        g(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3157x)) {
            return super.equals(obj);
        }
        C3157x c3157x = (C3157x) obj;
        if (this.f38115c != c3157x.f38115c) {
            return false;
        }
        float[] fArr = c3157x.f38114b;
        for (int i10 = 0; i10 < this.f38115c; i10++) {
            if (Float.floatToIntBits(this.f38114b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.A.i
    public A.f f(int i10) {
        if (i10 >= this.f38115c) {
            return new C3157x(Arrays.copyOf(this.f38114b, i10), this.f38115c, true);
        }
        throw new IllegalArgumentException();
    }

    public void g(float f10) {
        a();
        int i10 = this.f38115c;
        float[] fArr = this.f38114b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f38114b = fArr2;
        }
        float[] fArr3 = this.f38114b;
        int i11 = this.f38115c;
        this.f38115c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f38115c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f38114b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f38114b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(l(i10));
    }

    public float l(int i10) {
        j(i10);
        return this.f38114b[i10];
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        j(i10);
        float[] fArr = this.f38114b;
        float f10 = fArr[i10];
        int i11 = this.f38115c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f38115c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(q(i10, f10.floatValue()));
    }

    public float q(int i10, float f10) {
        a();
        j(i10);
        float[] fArr = this.f38114b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f38114b;
        System.arraycopy(fArr, i11, fArr, i10, this.f38115c - i11);
        this.f38115c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38115c;
    }
}
