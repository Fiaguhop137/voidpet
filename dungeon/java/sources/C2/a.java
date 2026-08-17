package C2;

import U1.F;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.L;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC4253p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f1289a = new F(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f1290b = new L(-1, -1, "image/heif");

    private boolean c(InterfaceC4254q interfaceC4254q, int i10) {
        this.f1289a.W(4);
        interfaceC4254q.o(this.f1289a.f(), 0, 4);
        return this.f1289a.N() == ((long) i10);
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f1290b.a(j10, j11);
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f1290b.b(rVar);
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        interfaceC4254q.i(4);
        return c(interfaceC4254q, 1718909296) && c(interfaceC4254q, 1751476579);
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        return this.f1290b.j(interfaceC4254q, i10);
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
