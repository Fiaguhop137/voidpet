package C9;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: C9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0858a extends W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1526b;

    protected AbstractC0858a(int i10, int i11) {
        B9.n.l(i11, i10);
        this.f1525a = i10;
        this.f1526b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1526b < this.f1525a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1526b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f1526b;
        this.f1526b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1526b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f1526b - 1;
        this.f1526b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1526b - 1;
    }
}
