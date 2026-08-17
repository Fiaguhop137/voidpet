package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class W implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q.a f11331a = new Q.a(0);

    public final boolean A(int i10) {
        return (i10 & AbstractC1428h.a(this.f11331a.get())) != 0;
    }

    public final void B(int i10) {
        int iA;
        do {
            iA = AbstractC1428h.a(this.f11331a.get());
            if ((iA & i10) != 0) {
                return;
            }
        } while (!this.f11331a.compareAndSet(iA, AbstractC1428h.a(iA | i10)));
    }
}
