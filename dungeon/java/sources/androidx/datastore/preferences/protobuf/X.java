package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class X extends AbstractC1947c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X f23402d = new X(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f23403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23404c;

    private X(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f23403b = objArr;
        this.f23404c = i10;
    }

    private static Object[] c(int i10) {
        return new Object[i10];
    }

    public static X e() {
        return f23402d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f23404c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f23404c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f23404c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f23403b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArrC = c(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f23403b, 0, objArrC, 0, i10);
            System.arraycopy(this.f23403b, i10, objArrC, i10 + 1, this.f23404c - i10);
            this.f23403b = objArrC;
        }
        this.f23403b[i10] = obj;
        this.f23404c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i10 = this.f23404c;
        Object[] objArr = this.f23403b;
        if (i10 == objArr.length) {
            this.f23403b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f23403b;
        int i11 = this.f23404c;
        this.f23404c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        g(i10);
        return this.f23403b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1964u.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public X f(int i10) {
        if (i10 >= this.f23404c) {
            return new X(Arrays.copyOf(this.f23403b, i10), this.f23404c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1947c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f23403b;
        Object obj = objArr[i10];
        int i11 = this.f23404c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f23404c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f23403b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23404c;
    }
}
