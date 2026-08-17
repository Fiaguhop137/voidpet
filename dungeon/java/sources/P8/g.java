package P8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8856b;

    protected g(int i10, int i11) {
        e.b(i11, i10, "index");
        this.f8855a = i10;
        this.f8856b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8856b < this.f8855a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8856b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8856b;
        this.f8856b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8856b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8856b - 1;
        this.f8856b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8856b - 1;
    }
}
