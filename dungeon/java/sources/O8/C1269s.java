package O8;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: O8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1269s extends AbstractC1266o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC1265n f8510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f8511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f8512e = 1;

    C1269s(AbstractC1265n abstractC1265n, Object[] objArr, int i10, int i11) {
        this.f8510c = abstractC1265n;
        this.f8511d = objArr;
    }

    @Override // O8.AbstractC1260i
    final int a(Object[] objArr, int i10) {
        return h().a(objArr, i10);
    }

    @Override // O8.AbstractC1260i, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8510c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // O8.AbstractC1266o
    final AbstractC1263l i() {
        return new r(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8512e;
    }
}
