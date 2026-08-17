package N8;

import java.util.Objects;

/* JADX INFO: renamed from: N8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1216k extends AbstractC1210e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AbstractC1210e f8021f = new C1216k(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f8022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f8023e;

    C1216k(Object[] objArr, int i10) {
        this.f8022d = objArr;
        this.f8023e = i10;
    }

    @Override // N8.AbstractC1210e, N8.AbstractC1207b
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f8022d, 0, objArr, 0, this.f8023e);
        return this.f8023e;
    }

    @Override // N8.AbstractC1207b
    final int c() {
        return this.f8023e;
    }

    @Override // N8.AbstractC1207b
    final int e() {
        return 0;
    }

    @Override // N8.AbstractC1207b
    final Object[] g() {
        return this.f8022d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P.a(i10, this.f8023e, "index");
        Object obj = this.f8022d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8023e;
    }
}
