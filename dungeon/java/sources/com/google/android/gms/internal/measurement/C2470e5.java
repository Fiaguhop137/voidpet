package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2470e5 extends AbstractC2621v4 implements RandomAccess, InterfaceC2497h5, L5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f32900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2470e5 f32901e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f32902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32903c;

    static {
        int[] iArr = new int[0];
        f32900d = iArr;
        f32901e = new C2470e5(iArr, 0, false);
    }

    private C2470e5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f32902b = iArr;
        this.f32903c = i10;
    }

    public static C2470e5 c() {
        return f32901e;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f32903c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        return C2638x4.a(this.f32903c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f32903c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f32902b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f32902b, 0, iArr2, 0, i10);
            System.arraycopy(this.f32902b, i10, iArr2, i12, this.f32903c - i10);
            this.f32902b = iArr2;
        }
        this.f32902b[i10] = iIntValue;
        this.f32903c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC2524k5.f32966b;
        collection.getClass();
        if (!(collection instanceof C2470e5)) {
            return super.addAll(collection);
        }
        C2470e5 c2470e5 = (C2470e5) collection;
        int i10 = c2470e5.f32903c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f32903c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f32902b;
        if (i12 > iArr.length) {
            this.f32902b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2470e5.f32902b, 0, this.f32902b, this.f32903c, c2470e5.f32903c);
        this.f32903c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        j(i10);
        return this.f32902b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2470e5)) {
            return super.equals(obj);
        }
        C2470e5 c2470e5 = (C2470e5) obj;
        if (this.f32903c != c2470e5.f32903c) {
            return false;
        }
        int[] iArr = c2470e5.f32902b;
        for (int i10 = 0; i10 < this.f32903c; i10++) {
            if (this.f32902b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        a();
        int i11 = this.f32903c;
        int length = this.f32902b.length;
        if (i11 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f32902b, 0, iArr, 0, this.f32903c);
            this.f32902b = iArr;
        }
        int[] iArr2 = this.f32902b;
        int i12 = this.f32903c;
        this.f32903c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Integer.valueOf(this.f32902b[i10]);
    }

    final void h(int i10) {
        int length = this.f32902b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f32902b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = i(length);
        }
        this.f32902b = Arrays.copyOf(this.f32902b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f32903c; i11++) {
            i10 = (i10 * 31) + this.f32902b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f32903c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f32902b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2515j5
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2497h5 K(int i10) {
        if (i10 >= this.f32903c) {
            return new C2470e5(i10 == 0 ? f32900d : Arrays.copyOf(this.f32902b, i10), this.f32903c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        j(i10);
        int[] iArr = this.f32902b;
        int i11 = iArr[i10];
        int i12 = this.f32903c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f32903c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f32902b;
        System.arraycopy(iArr, i11, iArr, i10, this.f32903c - i11);
        this.f32903c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        j(i10);
        int[] iArr = this.f32902b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32903c;
    }
}
