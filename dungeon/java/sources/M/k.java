package M;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f6661c;

    public k(Object obj, int i10) {
        super(i10, 1);
        this.f6661c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        f(c() + 1);
        return this.f6661c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        b();
        f(c() - 1);
        return this.f6661c;
    }
}
