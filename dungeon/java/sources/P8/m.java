package P8;

/* JADX INFO: loaded from: classes2.dex */
final class m extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final k f8863e = new m(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f8864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f8865d;

    m(Object[] objArr, int i10) {
        this.f8864c = objArr;
        this.f8865d = i10;
    }

    @Override // P8.k, P8.h
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f8864c, 0, objArr, 0, this.f8865d);
        return this.f8865d;
    }

    @Override // P8.h
    final int c() {
        return this.f8865d;
    }

    @Override // P8.h
    final int e() {
        return 0;
    }

    @Override // P8.h
    final Object[] g() {
        return this.f8864c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e.a(i10, this.f8865d, "index");
        Object obj = this.f8864c[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8865d;
    }
}
