package O8;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: O8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1258g extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8494b;

    protected AbstractC1258g(int i10, int i11) {
        AbstractC1256e.b(i11, i10, "index");
        this.f8493a = i10;
        this.f8494b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8494b < this.f8493a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8494b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8494b;
        this.f8494b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8494b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8494b - 1;
        this.f8494b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8494b - 1;
    }
}
