package K8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class w extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6060b;

    protected w(int i10, int i11) {
        t.c(i11, i10, "index");
        this.f6059a = i10;
        this.f6060b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6060b < this.f6059a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6060b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6060b;
        this.f6060b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6060b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6060b - 1;
        this.f6060b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6060b - 1;
    }
}
