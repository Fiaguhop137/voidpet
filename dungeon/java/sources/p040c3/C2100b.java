package p040c3;

import U1.F;
import p380v2.AbstractC4239b;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;
import p380v2.u;

/* JADX INFO: renamed from: c3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2100b implements InterfaceC4253p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f26864d = new C2099a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2101c f26865a = new C2101c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f26866b = new F(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26867c;

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new C2100b()};
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f26867c = false;
        this.f26865a.a();
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f26865a.e(rVar, new L.d(0, 1));
        rVar.t();
        rVar.p(new J.b(-9223372036854775807L));
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        F f10 = new F(10);
        int i10 = 0;
        while (true) {
            interfaceC4254q.o(f10.f(), 0, 10);
            f10.a0(0);
            if (f10.O() != 4801587) {
                break;
            }
            f10.b0(3);
            int iK = f10.K();
            i10 += iK + 10;
            interfaceC4254q.i(iK);
        }
        interfaceC4254q.d();
        interfaceC4254q.i(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC4254q.o(f10.f(), 0, 6);
            f10.a0(0);
            if (f10.T() != 2935) {
                interfaceC4254q.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC4254q.i(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG = AbstractC4239b.g(f10.f());
                if (iG == -1) {
                    return false;
                }
                interfaceC4254q.i(iG - 6);
            }
        }
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        int i11 = interfaceC4254q.read(this.f26866b.f(), 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        this.f26866b.a0(0);
        this.f26866b.Z(i11);
        if (!this.f26867c) {
            this.f26865a.f(0L, 4);
            this.f26867c = true;
        }
        this.f26865a.c(this.f26866b);
        return 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
