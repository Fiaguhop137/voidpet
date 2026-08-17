package O;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f8257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8259c;

    public c(Object obj, Map map) {
        this.f8257a = obj;
        this.f8258b = map;
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8259c < this.f8258b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object obj = this.f8257a;
        this.f8259c++;
        Object obj2 = this.f8258b.get(obj);
        if (obj2 != null) {
            this.f8257a = ((a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
