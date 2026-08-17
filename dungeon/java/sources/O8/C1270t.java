package O8;

import java.util.Iterator;

/* JADX INFO: renamed from: O8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1270t extends AbstractC1266o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC1265n f8513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient AbstractC1263l f8514d;

    C1270t(AbstractC1265n abstractC1265n, AbstractC1263l abstractC1263l) {
        this.f8513c = abstractC1265n;
        this.f8514d = abstractC1263l;
    }

    @Override // O8.AbstractC1260i
    final int a(Object[] objArr, int i10) {
        return this.f8514d.a(objArr, i10);
    }

    @Override // O8.AbstractC1260i, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8513c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f8514d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
