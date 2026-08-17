package V0;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13872m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f13855e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f13855e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // V0.f
    public void d(int i10) {
        if (this.f13860j) {
            return;
        }
        this.f13860j = true;
        this.f13857g = i10;
        for (d dVar : this.f13861k) {
            dVar.a(dVar);
        }
    }
}
