package N8;

/* JADX INFO: renamed from: N8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1208c extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1210e f8008c;

    C1208c(AbstractC1210e abstractC1210e, int i10) {
        super(abstractC1210e.size(), i10);
        this.f8008c = abstractC1210e;
    }

    @Override // N8.S
    protected final Object a(int i10) {
        return this.f8008c.get(i10);
    }
}
