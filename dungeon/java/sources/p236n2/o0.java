package p236n2;

import R1.F;
import R1.u;
import W1.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends AbstractC4011h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f49830l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final D f49831k;

    protected o0(D d10) {
        this.f49831k = d10;
    }

    @Override // p236n2.AbstractC4011h, p236n2.AbstractC4004a
    protected final void D(x xVar) {
        super.D(xVar);
        V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p236n2.AbstractC4011h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final D.b H(Void r10, D.b bVar) {
        return N(bVar);
    }

    protected D.b N(D.b bVar) {
        return bVar;
    }

    protected long O(long j10, D.b bVar) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p236n2.AbstractC4011h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long I(Void r10, long j10, D.b bVar) {
        return O(j10, bVar);
    }

    protected int Q(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p236n2.AbstractC4011h
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int J(Void r10, int i10) {
        return Q(i10);
    }

    protected abstract void S(F f10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p236n2.AbstractC4011h
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void K(Void r10, D d10, F f10) {
        S(f10);
    }

    protected final void U() {
        L(f49830l, this.f49831k);
    }

    protected void V() {
        U();
    }

    @Override // p236n2.D
    public u c() {
        return this.f49831k.c();
    }

    @Override // p236n2.D
    public void f(u uVar) {
        this.f49831k.f(uVar);
    }

    @Override // p236n2.D
    public boolean t() {
        return this.f49831k.t();
    }

    @Override // p236n2.D
    public F u() {
        return this.f49831k.u();
    }
}
