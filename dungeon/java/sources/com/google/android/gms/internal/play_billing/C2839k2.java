package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2839k2 extends Z0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f34745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2839k2 f34746e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f34747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34748c;

    static {
        Object[] objArr = new Object[0];
        f34745d = objArr;
        f34746e = new C2839k2(objArr, 0, false);
    }

    private C2839k2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f34747b = objArr;
        this.f34748c = i10;
    }

    public static C2839k2 c() {
        return f34746e;
    }

    private static int g(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34748c;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f34748c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f34748c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f34747b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[g(length)];
            System.arraycopy(this.f34747b, 0, objArr2, 0, i10);
            System.arraycopy(this.f34747b, i10, objArr2, i12, this.f34748c - i10);
            this.f34747b = objArr2;
        }
        this.f34747b[i10] = obj;
        this.f34748c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f34748c;
        int length = this.f34747b.length;
        if (i10 == length) {
            this.f34747b = Arrays.copyOf(this.f34747b, g(length));
        }
        Object[] objArr = this.f34747b;
        int i11 = this.f34748c;
        this.f34748c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    final void e(int i10) {
        int length = this.f34747b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f34747b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = g(length);
        }
        this.f34747b = Arrays.copyOf(this.f34747b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f34747b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.K1
    public final /* bridge */ /* synthetic */ K1 m(int i10) {
        if (i10 >= this.f34748c) {
            return new C2839k2(i10 == 0 ? f34745d : Arrays.copyOf(this.f34747b, i10), this.f34748c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.Z0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        Object[] objArr = this.f34747b;
        Object obj = objArr[i10];
        int i11 = this.f34748c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f34748c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        i(i10);
        Object[] objArr = this.f34747b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34748c;
    }
}
