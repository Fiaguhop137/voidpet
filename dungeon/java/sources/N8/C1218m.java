package N8;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: N8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1218m extends AbstractC1214i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC1213h f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f8026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f8027e;

    C1218m(AbstractC1213h abstractC1213h, Object[] objArr, int i10, int i11) {
        this.f8025c = abstractC1213h;
        this.f8026d = objArr;
        this.f8027e = i11;
    }

    @Override // N8.AbstractC1207b
    final int a(Object[] objArr, int i10) {
        return h().a(objArr, 0);
    }

    @Override // N8.AbstractC1207b, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8025c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // N8.AbstractC1214i
    final AbstractC1210e i() {
        return new C1217l(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8027e;
    }
}
