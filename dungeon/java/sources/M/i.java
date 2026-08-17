package M;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f6655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f6656d;

    public i(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f6655c = objArr2;
        int iD = n.d(i11);
        this.f6656d = new m(objArr, kotlin.ranges.e.i(i10, iD), iD, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        if (this.f6656d.hasNext()) {
            f(c() + 1);
            return this.f6656d.next();
        }
        Object[] objArr = this.f6655c;
        int iC = c();
        f(iC + 1);
        return objArr[iC - this.f6656d.d()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        b();
        if (c() <= this.f6656d.d()) {
            f(c() - 1);
            return this.f6656d.previous();
        }
        Object[] objArr = this.f6655c;
        f(c() - 1);
        return objArr[c() - this.f6656d.d()];
    }
}
