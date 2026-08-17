package S;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class T extends S implements Iterator, Nd.a {
    public T(H h10, Iterator it) {
        super(h10, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entryG = g();
        if (entryG == null) {
            throw new IllegalStateException();
        }
        c();
        return entryG.getKey();
    }
}
