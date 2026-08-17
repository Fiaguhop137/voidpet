package O8;

import java.util.Set;

/* JADX INFO: renamed from: O8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1266o extends AbstractC1260i implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC1263l f8505b;

    AbstractC1266o() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return AbstractC1273w.b(this, obj);
    }

    public final AbstractC1263l h() {
        AbstractC1263l abstractC1263l = this.f8505b;
        if (abstractC1263l != null) {
            return abstractC1263l;
        }
        AbstractC1263l abstractC1263lI = i();
        this.f8505b = abstractC1263lI;
        return abstractC1263lI;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1273w.a(this);
    }

    AbstractC1263l i() {
        Object[] array = toArray();
        int i10 = AbstractC1263l.f8501c;
        return AbstractC1263l.i(array, array.length);
    }
}
