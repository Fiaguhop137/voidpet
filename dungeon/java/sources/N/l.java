package N;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC3945g;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC3945g implements Collection, Nd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f7146a;

    public l(f fVar) {
        this.f7146a = fVar;
    }

    @Override // kotlin.collections.AbstractC3945g
    public int a() {
        return this.f7146a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f7146a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f7146a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new m(this.f7146a);
    }
}
