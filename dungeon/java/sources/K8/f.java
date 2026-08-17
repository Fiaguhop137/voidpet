package K8;

/* JADX INFO: loaded from: classes2.dex */
final class f extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f6045c;

    f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f6045c = iVar;
    }

    @Override // K8.w
    protected final Object a(int i10) {
        return this.f6045c.get(i10);
    }
}
