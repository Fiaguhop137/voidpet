package p139hc;

import Nd.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f42812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42813b;

    public k(e typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        this.f42812a = typedArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f42813b < this.f42812a.getLength();
    }

    @Override // java.util.Iterator
    public Object next() {
        e eVar = this.f42812a;
        int i10 = this.f42813b;
        this.f42813b = i10 + 1;
        return eVar.get(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
