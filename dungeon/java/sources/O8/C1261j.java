package O8;

/* JADX INFO: renamed from: O8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1261j extends AbstractC1258g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1263l f8496c;

    C1261j(AbstractC1263l abstractC1263l, int i10) {
        super(abstractC1263l.size(), i10);
        this.f8496c = abstractC1263l;
    }

    @Override // O8.AbstractC1258g
    protected final Object a(int i10) {
        return this.f8496c.get(i10);
    }
}
