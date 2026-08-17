package N;

import java.util.Iterator;
import kotlin.collections.AbstractC3940b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC3940b implements L.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7149a;

    public r(d dVar) {
        this.f7149a = dVar;
    }

    @Override // kotlin.collections.AbstractC3940b
    public int c() {
        return this.f7149a.size();
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f7149a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new s(this.f7149a.s());
    }
}
