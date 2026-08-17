package R1;

/* JADX INFO: renamed from: R1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1347g implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final F.c f10155a = new F.c();

    protected AbstractC1347g() {
    }

    private int M() {
        int iF = F();
        if (iF == 1) {
            return 0;
        }
        return iF;
    }

    private void O(long j10, int i10) {
        N(D(), j10, i10, false);
    }

    @Override // R1.C
    public final boolean A() {
        F fQ = q();
        return !fQ.q() && fQ.n(D(), this.f10155a).f9952h;
    }

    @Override // R1.C
    public final boolean C() {
        return B() == 3 && s() && p() == 0;
    }

    @Override // R1.C
    public final boolean I() {
        F fQ = q();
        return !fQ.q() && fQ.n(D(), this.f10155a).f();
    }

    public final long J() {
        F fQ = q();
        if (fQ.q()) {
            return -9223372036854775807L;
        }
        return fQ.n(D(), this.f10155a).d();
    }

    public final int K() {
        F fQ = q();
        if (fQ.q()) {
            return -1;
        }
        return fQ.e(D(), M(), G());
    }

    public final int L() {
        F fQ = q();
        if (fQ.q()) {
            return -1;
        }
        return fQ.l(D(), M(), G());
    }

    protected abstract void N(int i10, long j10, int i11, boolean z10);

    @Override // R1.C
    public final void g() {
        k(true);
    }

    @Override // R1.C
    public final boolean m() {
        return K() != -1;
    }

    @Override // R1.C
    public final boolean o() {
        F fQ = q();
        return !fQ.q() && fQ.n(D(), this.f10155a).f9953i;
    }

    @Override // R1.C
    public final void pause() {
        k(false);
    }

    @Override // R1.C
    public final boolean w() {
        return L() != -1;
    }

    @Override // R1.C
    public final void y(long j10) {
        O(j10, 5);
    }
}
