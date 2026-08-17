package N;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC3948j;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC3948j implements Set, Nd.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f7145a;

    public j(f fVar) {
        this.f7145a = fVar;
    }

    @Override // kotlin.collections.AbstractC3948j
    public int a() {
        return this.f7145a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f7145a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f7145a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new k(this.f7145a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f7145a.containsKey(obj)) {
            return false;
        }
        this.f7145a.remove(obj);
        return true;
    }
}
