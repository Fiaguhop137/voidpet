package S2;

import U1.AbstractC1459a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends Y1.g implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f11525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f11526f;

    public void A(long j10, k kVar, long j11) {
        this.f16819b = j10;
        this.f11525e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f11526f = j10;
    }

    @Override // S2.k
    public int e(long j10) {
        return ((k) AbstractC1459a.e(this.f11525e)).e(j10 - this.f11526f);
    }

    @Override // S2.k
    public List g(long j10) {
        return ((k) AbstractC1459a.e(this.f11525e)).g(j10 - this.f11526f);
    }

    @Override // S2.k
    public long h(int i10) {
        return ((k) AbstractC1459a.e(this.f11525e)).h(i10) + this.f11526f;
    }

    @Override // S2.k
    public int i() {
        return ((k) AbstractC1459a.e(this.f11525e)).i();
    }

    @Override // Y1.g, Y1.a
    public void p() {
        super.p();
        this.f11525e = null;
    }
}
