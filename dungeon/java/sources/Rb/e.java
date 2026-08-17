package Rb;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f10940b;

    public e(Iterator first, Iterator second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f10939a = first;
        this.f10940b = second;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10939a.hasNext() || this.f10940b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f10939a.hasNext() ? this.f10939a.next() : this.f10940b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
