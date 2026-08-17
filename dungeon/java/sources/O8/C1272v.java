package O8;

import java.util.Objects;

/* JADX INFO: renamed from: O8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1272v extends AbstractC1265n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f8518d;

    private C1272v(Object obj, Object[] objArr, int i10) {
        this.f8518d = objArr;
    }

    static C1272v g(int i10, Object[] objArr, AbstractC1264m abstractC1264m) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        AbstractC1259h.b(obj, obj2);
        return new C1272v(null, objArr, 1);
    }

    @Override // O8.AbstractC1265n
    final AbstractC1260i a() {
        return new C1271u(this.f8518d, 1, 1);
    }

    @Override // O8.AbstractC1265n
    final AbstractC1266o d() {
        return new C1269s(this, this.f8518d, 0, 1);
    }

    @Override // O8.AbstractC1265n
    final AbstractC1266o e() {
        return new C1270t(this, new C1271u(this.f8518d, 0, 1));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // O8.AbstractC1265n, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f8518d;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
