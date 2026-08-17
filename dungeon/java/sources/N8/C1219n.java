package N8;

import java.util.Iterator;

/* JADX INFO: renamed from: N8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1219n extends AbstractC1214i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC1213h f8028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient AbstractC1210e f8029d;

    C1219n(AbstractC1213h abstractC1213h, AbstractC1210e abstractC1210e) {
        this.f8028c = abstractC1213h;
        this.f8029d = abstractC1210e;
    }

    @Override // N8.AbstractC1207b
    final int a(Object[] objArr, int i10) {
        return this.f8029d.a(objArr, 0);
    }

    @Override // N8.AbstractC1207b, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8028c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f8029d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8028c.size();
    }
}
