package P8;

/* JADX INFO: loaded from: classes2.dex */
final class i extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f8858c;

    i(k kVar, int i10) {
        super(kVar.size(), i10);
        this.f8858c = kVar;
    }

    @Override // P8.g
    protected final Object a(int i10) {
        return this.f8858c.get(i10);
    }
}
