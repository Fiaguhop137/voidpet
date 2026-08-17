package O8;

import java.util.Objects;

/* JADX INFO: renamed from: O8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1268q extends AbstractC1263l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AbstractC1263l f8506f = new C1268q(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f8507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f8508e;

    C1268q(Object[] objArr, int i10) {
        this.f8507d = objArr;
        this.f8508e = i10;
    }

    @Override // O8.AbstractC1263l, O8.AbstractC1260i
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f8507d, 0, objArr, i10, this.f8508e);
        return i10 + this.f8508e;
    }

    @Override // O8.AbstractC1260i
    final int c() {
        return this.f8508e;
    }

    @Override // O8.AbstractC1260i
    final int e() {
        return 0;
    }

    @Override // O8.AbstractC1260i
    final Object[] g() {
        return this.f8507d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1256e.a(i10, this.f8508e, "index");
        Object obj = this.f8507d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8508e;
    }
}
