package L8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class u0 extends t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final t0 f6508f = new u0(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f6509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f6510e;

    u0(Object[] objArr, int i10) {
        this.f6509d = objArr;
        this.f6510e = i10;
    }

    @Override // L8.AbstractC1167o0
    final Object[] a() {
        return this.f6509d;
    }

    @Override // L8.AbstractC1167o0
    final int c() {
        return 0;
    }

    @Override // L8.AbstractC1167o0
    final int e() {
        return this.f6510e;
    }

    @Override // L8.t0, L8.AbstractC1167o0
    final int g(Object[] objArr, int i10) {
        Object[] objArr2 = this.f6509d;
        int i11 = this.f6510e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1149f0.a(i10, this.f6510e, "index");
        Object obj = this.f6509d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6510e;
    }
}
