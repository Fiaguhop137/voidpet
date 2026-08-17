package C9;

/* JADX INFO: loaded from: classes2.dex */
final class N extends AbstractC0878v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f1505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final N f1506i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f1507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f1508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f1509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f1510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f1511g;

    static {
        Object[] objArr = new Object[0];
        f1505h = objArr;
        f1506i = new N(objArr, 0, objArr, 0, 0);
    }

    N(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f1507c = objArr;
        this.f1508d = i10;
        this.f1509e = objArr2;
        this.f1510f = i11;
        this.f1511g = i12;
    }

    @Override // C9.r
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f1507c, 0, objArr, i10, this.f1511g);
        return i10 + this.f1511g;
    }

    @Override // C9.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f1509e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC0874q.c(obj);
        while (true) {
            int i10 = iC & this.f1510f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // C9.r
    Object[] e() {
        return this.f1507c;
    }

    @Override // C9.r
    int g() {
        return this.f1511g;
    }

    @Override // C9.r
    int h() {
        return 0;
    }

    @Override // C9.AbstractC0878v, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f1508d;
    }

    @Override // C9.r
    boolean i() {
        return false;
    }

    @Override // C9.AbstractC0878v
    AbstractC0876t q() {
        return AbstractC0876t.k(this.f1507c, this.f1511g);
    }

    @Override // C9.AbstractC0878v
    boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f1511g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public V iterator() {
        return a().iterator();
    }
}
