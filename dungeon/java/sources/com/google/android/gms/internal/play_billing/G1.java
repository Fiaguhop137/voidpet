package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class G1 extends Z0 implements RandomAccess, J1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f34440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final G1 f34441e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f34442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34443c;

    static {
        int[] iArr = new int[0];
        f34440d = iArr;
        f34441e = new G1(iArr, 0, false);
    }

    private G1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f34442b = iArr;
        this.f34443c = i10;
    }

    public static G1 e() {
        return f34441e;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34443c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f34443c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f34443c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f34442b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f34442b, 0, iArr2, 0, i10);
            System.arraycopy(this.f34442b, i10, iArr2, i12, this.f34443c - i10);
            this.f34442b = iArr2;
        }
        this.f34442b[i10] = iIntValue;
        this.f34443c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.Z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = M1.f34481b;
        collection.getClass();
        if (!(collection instanceof G1)) {
            return super.addAll(collection);
        }
        G1 g10 = (G1) collection;
        int i10 = g10.f34443c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34443c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f34442b;
        if (i12 > iArr.length) {
            this.f34442b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(g10.f34442b, 0, this.f34442b, this.f34443c, g10.f34443c);
        this.f34443c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i10) {
        k(i10);
        return this.f34442b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.Z0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G1)) {
            return super.equals(obj);
        }
        G1 g10 = (G1) obj;
        if (this.f34443c != g10.f34443c) {
            return false;
        }
        int[] iArr = g10.f34442b;
        for (int i10 = 0; i10 < this.f34443c; i10++) {
            if (this.f34442b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        a();
        int i11 = this.f34443c;
        int length = this.f34442b.length;
        if (i11 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f34442b, 0, iArr, 0, this.f34443c);
            this.f34442b = iArr;
        }
        int[] iArr2 = this.f34442b;
        int i12 = this.f34443c;
        this.f34443c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f34442b[i10]);
    }

    final void h(int i10) {
        int length = this.f34442b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f34442b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = i(length);
        }
        this.f34442b = Arrays.copyOf(this.f34442b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.Z0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f34443c; i11++) {
            i10 = (i10 * 31) + this.f34442b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f34443c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34442b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.K1
    public final /* bridge */ /* synthetic */ K1 m(int i10) {
        if (i10 >= this.f34443c) {
            return new G1(i10 == 0 ? f34440d : Arrays.copyOf(this.f34442b, i10), this.f34443c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.Z0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        k(i10);
        int[] iArr = this.f34442b;
        int i11 = iArr[i10];
        int i12 = this.f34443c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f34443c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f34442b;
        System.arraycopy(iArr, i11, iArr, i10, this.f34443c - i11);
        this.f34443c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        k(i10);
        int[] iArr = this.f34442b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34443c;
    }
}
