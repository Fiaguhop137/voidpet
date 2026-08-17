package M;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f6640c;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f6640c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f6640c;
        int iC = c();
        f(iC + 1);
        return objArr[iC];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f6640c;
        f(c() - 1);
        return objArr[c()];
    }
}
