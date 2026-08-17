package N;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f7144a;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f7144a = new g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f7144a.next();
    }

    public final void b(Object obj, Object obj2) {
        this.f7144a.m(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7144a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f7144a.remove();
    }
}
