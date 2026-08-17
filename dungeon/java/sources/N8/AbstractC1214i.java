package N8;

import java.util.Set;

/* JADX INFO: renamed from: N8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1214i extends AbstractC1207b implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC1210e f8020b;

    AbstractC1214i() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final AbstractC1210e h() {
        AbstractC1210e abstractC1210e = this.f8020b;
        if (abstractC1210e != null) {
            return abstractC1210e;
        }
        AbstractC1210e abstractC1210eI = i();
        this.f8020b = abstractC1210eI;
        return abstractC1210eI;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1222q.a(this);
    }

    AbstractC1210e i() {
        Object[] array = toArray();
        int i10 = AbstractC1210e.f8013c;
        return AbstractC1210e.i(array, array.length);
    }
}
