package M;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6638b;

    public a(int i10, int i11) {
        this.f6637a = i10;
        this.f6638b = i11;
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f6637a;
    }

    public final int d() {
        return this.f6638b;
    }

    public final void f(int i10) {
        this.f6637a = i10;
    }

    public final void g(int i10) {
        this.f6638b = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f6637a < this.f6638b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f6637a > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f6637a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f6637a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
