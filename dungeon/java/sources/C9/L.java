package C9;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class L extends AbstractC0876t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AbstractC0876t f1488e = new L(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f1489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f1490d;

    L(Object[] objArr, int i10) {
        this.f1489c = objArr;
        this.f1490d = i10;
    }

    @Override // C9.AbstractC0876t, C9.r
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f1489c, 0, objArr, i10, this.f1490d);
        return i10 + this.f1490d;
    }

    @Override // C9.r
    Object[] e() {
        return this.f1489c;
    }

    @Override // C9.r
    int g() {
        return this.f1490d;
    }

    @Override // java.util.List
    public Object get(int i10) {
        B9.n.h(i10, this.f1490d);
        Object obj = this.f1489c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // C9.r
    int h() {
        return 0;
    }

    @Override // C9.r
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1490d;
    }
}
