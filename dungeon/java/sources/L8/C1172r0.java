package L8;

/* JADX INFO: renamed from: L8.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1172r0 extends AbstractC1157j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f6498c;

    C1172r0(t0 t0Var, int i10) {
        super(t0Var.size(), i10);
        this.f6498c = t0Var;
    }

    @Override // L8.AbstractC1157j0
    protected final Object a(int i10) {
        return this.f6498c.get(i10);
    }
}
