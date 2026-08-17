package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2664b1 extends AbstractC2762v0 implements RandomAccess, InterfaceC2729o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2664b1 f33465d = new C2664b1(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f33466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33467c;

    private C2664b1(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f33466b = fArr;
        this.f33467c = i10;
    }

    public static C2664b1 e() {
        return f33465d;
    }

    private final String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33467c;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f33467c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2729o1 m(int i10) {
        if (i10 >= this.f33467c) {
            return new C2664b1(Arrays.copyOf(this.f33466b, i10), this.f33467c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2729o1
    public final void X1(float f10) {
        a();
        int i10 = this.f33467c;
        float[] fArr = this.f33466b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f33466b = fArr2;
        }
        float[] fArr3 = this.f33466b;
        int i11 = this.f33467c;
        this.f33467c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f33467c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f33466b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f33466b, i10, fArr2, i12, this.f33467c - i10);
            this.f33466b = fArr2;
        }
        this.f33466b[i10] = fFloatValue;
        this.f33467c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        X1(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC2743r1.f34293b;
        collection.getClass();
        if (!(collection instanceof C2664b1)) {
            return super.addAll(collection);
        }
        C2664b1 c2664b1 = (C2664b1) collection;
        int i10 = c2664b1.f33467c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33467c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f33466b;
        if (i12 > fArr.length) {
            this.f33466b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2664b1.f33466b, 0, this.f33466b, this.f33467c, c2664b1.f33467c);
        this.f33467c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final float c(int i10) {
        h(i10);
        return this.f33466b[i10];
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
        if (!(obj instanceof C2664b1)) {
            return super.equals(obj);
        }
        C2664b1 c2664b1 = (C2664b1) obj;
        if (this.f33467c != c2664b1.f33467c) {
            return false;
        }
        float[] fArr = c2664b1.f33466b;
        for (int i10 = 0; i10 < this.f33467c; i10++) {
            if (Float.floatToIntBits(this.f33466b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Float.valueOf(this.f33466b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f33467c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f33466b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f33467c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f33466b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2762v0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        float[] fArr = this.f33466b;
        float f10 = fArr[i10];
        int i11 = this.f33467c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f33467c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f33466b;
        System.arraycopy(fArr, i11, fArr, i10, this.f33467c - i11);
        this.f33467c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        h(i10);
        float[] fArr = this.f33466b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33467c;
    }
}
