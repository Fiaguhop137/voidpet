package p236n2;

import B9.g;
import C9.AbstractC0876t;
import C9.z;
import O2.f;
import R1.InterfaceC1350j;
import U1.AbstractC1459a;
import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import p380v2.C4247j;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.r;
import p380v2.u;

/* JADX INFO: renamed from: n2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4007d implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f49697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4253p f49698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4254q f49699c;

    public C4007d(u uVar) {
        this.f49697a = uVar;
    }

    @Override // p236n2.Q
    public void a(long j10, long j11) {
        ((InterfaceC4253p) AbstractC1459a.e(this.f49698b)).a(j10, j11);
    }

    @Override // p236n2.Q
    public void b() {
        InterfaceC4253p interfaceC4253p = this.f49698b;
        if (interfaceC4253p == null) {
            return;
        }
        InterfaceC4253p interfaceC4253pG = interfaceC4253p.g();
        if (interfaceC4253pG instanceof f) {
            ((f) interfaceC4253pG).l();
        }
    }

    @Override // p236n2.Q
    public int c(I i10) {
        return ((InterfaceC4253p) AbstractC1459a.e(this.f49698b)).j((InterfaceC4254q) AbstractC1459a.e(this.f49699c), i10);
    }

    @Override // p236n2.Q
    public long d() {
        InterfaceC4254q interfaceC4254q = this.f49699c;
        if (interfaceC4254q != null) {
            return interfaceC4254q.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // p236n2.Q
    public void e(InterfaceC1350j interfaceC1350j, Uri uri, Map map, long j10, long j11, r rVar) throws n0 {
        C4247j c4247j = new C4247j(interfaceC1350j, j10, j11);
        this.f49699c = c4247j;
        if (this.f49698b != null) {
            return;
        }
        InterfaceC4253p[] interfaceC4253pArrD = this.f49697a.d(uri, map);
        AbstractC0876t.a aVarN = AbstractC0876t.n(interfaceC4253pArrD.length);
        if (interfaceC4253pArrD.length == 1) {
            this.f49698b = interfaceC4253pArrD[0];
        } else {
            for (InterfaceC4253p interfaceC4253p : interfaceC4253pArrD) {
                try {
                    if (interfaceC4253p.f(c4247j)) {
                        this.f49698b = interfaceC4253p;
                        AbstractC1459a.g(true);
                        c4247j.d();
                        break;
                    } else {
                        aVarN.j(interfaceC4253p.k());
                        boolean z10 = this.f49698b != null || c4247j.getPosition() == j10;
                        AbstractC1459a.g(z10);
                        c4247j.d();
                    }
                } catch (EOFException unused) {
                    if (this.f49698b != null || c4247j.getPosition() == j10) {
                    }
                } catch (Throwable th) {
                    AbstractC1459a.g(this.f49698b != null || c4247j.getPosition() == j10);
                    c4247j.d();
                    throw th;
                }
                AbstractC1459a.g(z10);
                c4247j.d();
            }
            if (this.f49698b == null) {
                throw new n0("None of the available extractors (" + g.g(", ").d(z.k(AbstractC0876t.q(interfaceC4253pArrD), new C4006c())) + ") could read the stream.", (Uri) AbstractC1459a.e(uri), aVarN.k());
            }
        }
        this.f49698b.b(rVar);
    }

    @Override // p236n2.Q
    public void release() {
        InterfaceC4253p interfaceC4253p = this.f49698b;
        if (interfaceC4253p != null) {
            interfaceC4253p.release();
            this.f49698b = null;
        }
        this.f49699c = null;
    }
}
