package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class J implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f48238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48239b;

    public J(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f48238a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IndexedValue next() {
        int i10 = this.f48239b;
        this.f48239b = i10 + 1;
        if (i10 < 0) {
            C3959v.v();
        }
        return new IndexedValue(i10, this.f48238a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48238a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
