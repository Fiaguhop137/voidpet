package Rb;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f10946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f10947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f10948c;

    public m(Iterator iterator, l filter) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f10946a = iterator;
        this.f10947b = filter;
        a();
    }

    private final void a() {
        while (this.f10946a.hasNext()) {
            Object next = this.f10946a.next();
            this.f10948c = next;
            if (this.f10947b.apply(next)) {
                return;
            }
        }
        this.f10948c = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10948c != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f10948c;
        Intrinsics.c(obj);
        a();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
