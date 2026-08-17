package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class J extends AbstractC3135c implements A.h, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final J f37819d = new J(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f37820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37821c;

    J() {
        this(new long[10], 0, true);
    }

    private J(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f37820b = jArr;
        this.f37821c = i10;
    }

    private void g(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f37821c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        long[] jArr = this.f37820b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f37820b, i10, jArr2, i10 + 1, this.f37821c - i10);
            this.f37820b = jArr2;
        }
        this.f37820b[i10] = j10;
        this.f37821c++;
        ((AbstractList) this).modCount++;
    }

    public static J i() {
        return f37819d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f37821c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37821c;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        A.a(collection);
        if (!(collection instanceof J)) {
            return super.addAll(collection);
        }
        J j10 = (J) collection;
        int i10 = j10.f37821c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37821c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f37820b;
        if (i12 > jArr.length) {
            this.f37820b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(j10.f37820b, 0, this.f37820b, this.f37821c, j10.f37821c);
        this.f37821c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        g(i10, l10.longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        h(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return super.equals(obj);
        }
        J j10 = (J) obj;
        if (this.f37821c != j10.f37821c) {
            return false;
        }
        long[] jArr = j10.f37820b;
        for (int i10 = 0; i10 < this.f37821c; i10++) {
            if (this.f37820b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.A.i
    public A.h f(int i10) {
        if (i10 >= this.f37821c) {
            return new J(Arrays.copyOf(this.f37820b, i10), this.f37821c, true);
        }
        throw new IllegalArgumentException();
    }

    public void h(long j10) {
        a();
        int i10 = this.f37821c;
        long[] jArr = this.f37820b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f37820b = jArr2;
        }
        long[] jArr3 = this.f37820b;
        int i11 = this.f37821c;
        this.f37821c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f37821c; i10++) {
            iF = (iF * 31) + A.f(this.f37820b[i10]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f37820b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(l(i10));
    }

    public long l(int i10) {
        j(i10);
        return this.f37820b[i10];
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        j(i10);
        long[] jArr = this.f37820b;
        long j10 = jArr[i10];
        int i11 = this.f37821c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f37821c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(q(i10, l10.longValue()));
    }

    public long q(int i10, long j10) {
        a();
        j(i10);
        long[] jArr = this.f37820b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f37820b;
        System.arraycopy(jArr, i11, jArr, i10, this.f37821c - i11);
        this.f37821c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37821c;
    }
}
