package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class N5 extends AbstractC2621v4 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f32667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final N5 f32668e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f32669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32670c;

    static {
        Object[] objArr = new Object[0];
        f32667d = objArr;
        f32668e = new N5(objArr, 0, false);
    }

    private N5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f32669b = objArr;
        this.f32670c = i10;
    }

    public static N5 c() {
        return f32668e;
    }

    private static int g(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f32670c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private final String i(int i10) {
        return C2638x4.a(this.f32670c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2515j5
    public final /* bridge */ /* synthetic */ InterfaceC2515j5 K(int i10) {
        if (i10 >= this.f32670c) {
            return new N5(i10 == 0 ? f32667d : Arrays.copyOf(this.f32669b, i10), this.f32670c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f32670c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f32669b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[g(length)];
            System.arraycopy(this.f32669b, 0, objArr2, 0, i10);
            System.arraycopy(this.f32669b, i10, objArr2, i12, this.f32670c - i10);
            this.f32669b = objArr2;
        }
        this.f32669b[i10] = obj;
        this.f32670c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f32670c;
        int length = this.f32669b.length;
        if (i10 == length) {
            this.f32669b = Arrays.copyOf(this.f32669b, g(length));
        }
        Object[] objArr = this.f32669b;
        int i11 = this.f32670c;
        this.f32670c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    final void e(int i10) {
        int length = this.f32669b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f32669b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = g(length);
        }
        this.f32669b = Arrays.copyOf(this.f32669b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f32669b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2621v4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        h(i10);
        Object[] objArr = this.f32669b;
        Object obj = objArr[i10];
        int i11 = this.f32670c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f32670c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        h(i10);
        Object[] objArr = this.f32669b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32670c;
    }
}
