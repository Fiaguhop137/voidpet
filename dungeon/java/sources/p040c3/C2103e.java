package p040c3;

import U1.F;
import p380v2.AbstractC4240c;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;
import p380v2.u;

/* JADX INFO: renamed from: c3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2103e implements InterfaceC4253p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f26882d = new C2102d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2104f f26883a = new C2104f("audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f26884b = new F(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26885c;

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new C2103e()};
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f26885c = false;
        this.f26883a.a();
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f26883a.e(rVar, new L.d(0, 1));
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
            interfaceC4254q.o(f10.f(), 0, 7);
            f10.a0(0);
            int iT = f10.T();
            if (iT == 44096 || iT == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iH = AbstractC4240c.h(f10.f(), iT);
                if (iH == -1) {
                    return false;
                }
                interfaceC4254q.i(iH - 7);
            } else {
                interfaceC4254q.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC4254q.i(i12);
                i11 = 0;
            }
        }
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        int i11 = interfaceC4254q.read(this.f26884b.f(), 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        this.f26884b.a0(0);
        this.f26884b.Z(i11);
        if (!this.f26885c) {
            this.f26883a.f(0L, 4);
            this.f26885c = true;
        }
        this.f26883a.c(this.f26884b);
        return 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
