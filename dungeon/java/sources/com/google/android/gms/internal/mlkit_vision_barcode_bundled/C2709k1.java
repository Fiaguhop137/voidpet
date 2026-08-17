package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2709k1 extends AbstractC2762v0 implements RandomAccess, InterfaceC2734p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2709k1 f34240d = new C2709k1(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f34241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34242c;

    private C2709k1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f34241b = iArr;
        this.f34242c = i10;
    }

    public static C2709k1 e() {
        return f34240d;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34242c;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f34242c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f34242c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f34241b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f34241b, i10, iArr2, i12, this.f34242c - i10);
            this.f34241b = iArr2;
        }
        this.f34241b[i10] = iIntValue;
        this.f34242c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC2743r1.f34293b;
        collection.getClass();
        if (!(collection instanceof C2709k1)) {
            return super.addAll(collection);
        }
        C2709k1 c2709k1 = (C2709k1) collection;
        int i10 = c2709k1.f34242c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34242c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f34241b;
        if (i12 > iArr.length) {
            this.f34241b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2709k1.f34241b, 0, this.f34241b, this.f34242c, c2709k1.f34242c);
        this.f34242c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i10) {
        i(i10);
        return this.f34241b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2709k1)) {
            return super.equals(obj);
        }
        C2709k1 c2709k1 = (C2709k1) obj;
        if (this.f34242c != c2709k1.f34242c) {
            return false;
        }
        int[] iArr = c2709k1.f34241b;
        for (int i10 = 0; i10 < this.f34242c; i10++) {
            if (this.f34241b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        a();
        int i11 = this.f34242c;
        int[] iArr = this.f34241b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f34241b = iArr2;
        }
        int[] iArr3 = this.f34241b;
        int i12 = this.f34242c;
        this.f34242c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f34241b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f34242c; i11++) {
            i10 = (i10 * 31) + this.f34241b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f34242c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34241b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1
    public final /* bridge */ /* synthetic */ InterfaceC2739q1 m(int i10) {
        if (i10 >= this.f34242c) {
            return new C2709k1(Arrays.copyOf(this.f34241b, i10), this.f34242c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        i(i10);
        int[] iArr = this.f34241b;
        int i11 = iArr[i10];
        int i12 = this.f34242c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f34242c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f34241b;
        System.arraycopy(iArr, i11, iArr, i10, this.f34242c - i11);
        this.f34242c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        i(i10);
        int[] iArr = this.f34241b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34242c;
    }
}
