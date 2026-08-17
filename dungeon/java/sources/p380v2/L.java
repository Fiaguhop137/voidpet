package p380v2;

import R1.r;
import U1.AbstractC1459a;
import U1.F;

/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC4253p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f55979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f55982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f55983g;

    public L(int i10, int i11, String str) {
        this.f55977a = i10;
        this.f55978b = i11;
        this.f55979c = str;
    }

    private void c(String str) {
        O oF = this.f55982f.f(1024, 4);
        this.f55983g = oF;
        oF.b(new r.b().W(str).y0(str).P());
        this.f55982f.t();
        this.f55982f.p(new M(-9223372036854775807L));
        this.f55981e = 1;
    }

    private void d(InterfaceC4254q interfaceC4254q) {
        int iA = ((O) AbstractC1459a.e(this.f55983g)).a(interfaceC4254q, 1024, true);
        if (iA != -1) {
            this.f55980d += iA;
            return;
        }
        this.f55981e = 2;
        this.f55983g.c(0L, 1, this.f55980d, 0, null);
        this.f55980d = 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f55981e == 1) {
            this.f55981e = 1;
            this.f55980d = 0;
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f55982f = rVar;
        c(this.f55979c);
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        AbstractC1459a.g((this.f55977a == -1 || this.f55978b == -1) ? false : true);
        F f10 = new F(this.f55978b);
        interfaceC4254q.o(f10.f(), 0, this.f55978b);
        return f10.T() == this.f55977a;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        int i11 = this.f55981e;
        if (i11 == 1) {
            d(interfaceC4254q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
