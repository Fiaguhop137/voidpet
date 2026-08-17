package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2595s5 extends AbstractC2621v4 implements RandomAccess, InterfaceC2506i5, L5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f33139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2595s5 f33140e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f33141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33142c;

    static {
        long[] jArr = new long[0];
        f33139d = jArr;
        f33140e = new C2595s5(jArr, 0, false);
    }

    private C2595s5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f33141b = jArr;
        this.f33142c = i10;
    }

    public static C2595s5 c() {
        return f33140e;
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f33142c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private final String j(int i10) {
        return C2638x4.a(this.f33142c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2506i5
    public final long R0(int i10) {
        i(i10);
        return this.f33141b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f33142c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f33141b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[h(length)];
            System.arraycopy(this.f33141b, 0, jArr2, 0, i10);
            System.arraycopy(this.f33141b, i10, jArr2, i12, this.f33142c - i10);
            this.f33141b = jArr2;
        }
        this.f33141b[i10] = jLongValue;
        this.f33142c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC2524k5.f32966b;
        collection.getClass();
        if (!(collection instanceof C2595s5)) {
            return super.addAll(collection);
        }
        C2595s5 c2595s5 = (C2595s5) collection;
        int i10 = c2595s5.f33142c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33142c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f33141b;
        if (i12 > jArr.length) {
            this.f33141b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2595s5.f33141b, 0, this.f33141b, this.f33142c, c2595s5.f33142c);
        this.f33142c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j10) {
        a();
        int i10 = this.f33142c;
        int length = this.f33141b.length;
        if (i10 == length) {
            long[] jArr = new long[h(length)];
            System.arraycopy(this.f33141b, 0, jArr, 0, this.f33142c);
            this.f33141b = jArr;
        }
        long[] jArr2 = this.f33141b;
        int i11 = this.f33142c;
        this.f33142c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2595s5)) {
            return super.equals(obj);
        }
        C2595s5 c2595s5 = (C2595s5) obj;
        if (this.f33142c != c2595s5.f33142c) {
            return false;
        }
        long[] jArr = c2595s5.f33141b;
        for (int i10 = 0; i10 < this.f33142c; i10++) {
            if (this.f33141b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    final void g(int i10) {
        int length = this.f33141b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f33141b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f33141b = Arrays.copyOf(this.f33141b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f33141b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f33142c; i11++) {
            long j10 = this.f33141b[i11];
            byte[] bArr = AbstractC2524k5.f32966b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f33142c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f33141b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2515j5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2506i5 K(int i10) {
        if (i10 >= this.f33142c) {
            return new C2595s5(i10 == 0 ? f33139d : Arrays.copyOf(this.f33141b, i10), this.f33142c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        i(i10);
        long[] jArr = this.f33141b;
        long j10 = jArr[i10];
        int i11 = this.f33142c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f33142c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f33141b;
        System.arraycopy(jArr, i11, jArr, i10, this.f33142c - i11);
        this.f33142c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        i(i10);
        long[] jArr = this.f33141b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33142c;
    }
}
