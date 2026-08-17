package C9;

/* JADX INFO: loaded from: classes2.dex */
final class S extends AbstractC0878v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f1523c;

    S(Object obj) {
        this.f1523c = B9.n.j(obj);
    }

    @Override // C9.AbstractC0878v, C9.r
    public AbstractC0876t a() {
        return AbstractC0876t.x(this.f1523c);
    }

    @Override // C9.r
    int c(Object[] objArr, int i10) {
        objArr[i10] = this.f1523c;
        return i10 + 1;
    }

    @Override // C9.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f1523c.equals(obj);
    }

    @Override // C9.AbstractC0878v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1523c.hashCode();
    }

    @Override // C9.r
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t */
    public V iterator() {
        return x.q(this.f1523c);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f1523c.toString() + ']';
    }
}
