package N;

import java.util.Iterator;
import kotlin.collections.AbstractC3949k;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC3949k implements L.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f7148b;

    public p(d dVar) {
        this.f7148b = dVar;
    }

    @Override // kotlin.collections.AbstractC3940b
    public int c() {
        return this.f7148b.size();
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f7148b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC3949k, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new q(this.f7148b.s());
    }
}
