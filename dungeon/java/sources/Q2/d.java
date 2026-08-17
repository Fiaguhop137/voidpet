package Q2;

import R1.z;
import U1.AbstractC1459a;
import U1.F;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.O;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC4253p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f9286d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f9287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f9288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9289c;

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new d()};
    }

    private static F d(F f10) {
        f10.a0(0);
        return f10;
    }

    private boolean e(InterfaceC4254q interfaceC4254q) {
        f fVar = new f();
        if (fVar.a(interfaceC4254q, true) && (fVar.f9296b & 2) == 2) {
            int iMin = Math.min(fVar.f9303i, 8);
            F f10 = new F(iMin);
            interfaceC4254q.o(f10.f(), 0, iMin);
            if (b.p(d(f10))) {
                this.f9288b = new b();
            } else if (j.r(d(f10))) {
                this.f9288b = new j();
            } else if (h.o(d(f10))) {
                this.f9288b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        i iVar = this.f9288b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f9287a = rVar;
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        try {
            return e(interfaceC4254q);
        } catch (z unused) {
            return false;
        }
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        AbstractC1459a.i(this.f9287a);
        if (this.f9288b == null) {
            if (!e(interfaceC4254q)) {
                throw z.a("Failed to determine bitstream type", null);
            }
            interfaceC4254q.d();
        }
        if (!this.f9289c) {
            O oF = this.f9287a.f(0, 1);
            this.f9287a.t();
            this.f9288b.d(this.f9287a, oF);
            this.f9289c = true;
        }
        return this.f9288b.g(interfaceC4254q, i10);
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
