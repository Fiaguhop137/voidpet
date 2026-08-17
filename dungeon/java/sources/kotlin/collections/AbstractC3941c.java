package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3941c implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f48248b;

    private final boolean d() {
        this.f48247a = 3;
        a();
        return this.f48247a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.f48247a = 2;
    }

    protected final void c(Object obj) {
        this.f48248b = obj;
        this.f48247a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f48247a;
        if (i10 == 0) {
            return d();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f48247a;
        if (i10 == 1) {
            this.f48247a = 0;
            return this.f48248b;
        }
        if (i10 == 2 || !d()) {
            throw new NoSuchElementException();
        }
        this.f48247a = 0;
        return this.f48248b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
