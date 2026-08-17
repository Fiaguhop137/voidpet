package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3965b implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f48359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48360b;

    public C3965b(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f48359a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48360b < this.f48359a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f48359a;
            int i10 = this.f48360b;
            this.f48360b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f48360b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
