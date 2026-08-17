package L8;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: L8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1157j0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6476b;

    protected AbstractC1157j0(int i10, int i11) {
        AbstractC1149f0.b(i11, i10, "index");
        this.f6475a = i10;
        this.f6476b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6476b < this.f6475a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6476b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6476b;
        this.f6476b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6476b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6476b - 1;
        this.f6476b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6476b - 1;
    }
}
