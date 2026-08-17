package K8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class k extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final i f6052f = new k(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f6053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f6054e;

    k(Object[] objArr, int i10) {
        this.f6053d = objArr;
        this.f6054e = i10;
    }

    @Override // K8.d
    final Object[] a() {
        return this.f6053d;
    }

    @Override // K8.d
    final int c() {
        return 0;
    }

    @Override // K8.d
    final int e() {
        return this.f6054e;
    }

    @Override // K8.i, K8.d
    final int g(Object[] objArr, int i10) {
        Object[] objArr2 = this.f6053d;
        int i11 = this.f6054e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t.b(i10, this.f6054e, "index");
        Object obj = this.f6053d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6054e;
    }
}
