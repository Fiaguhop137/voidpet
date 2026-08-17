package C9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class T implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f1524a;

    T(Iterator it) {
        this.f1524a = (Iterator) B9.n.j(it);
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1524a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f1524a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1524a.remove();
    }
}
