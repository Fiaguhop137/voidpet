package N8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class S extends AbstractC1223s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8006b;

    protected S(int i10, int i11) {
        P.b(i11, i10, "index");
        this.f8005a = i10;
        this.f8006b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8006b < this.f8005a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8006b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8006b;
        this.f8006b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8006b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8006b - 1;
        this.f8006b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8006b - 1;
    }
}
