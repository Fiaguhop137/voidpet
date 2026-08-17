package R2;

import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.L;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC4253p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f10593a = new L(35152, 2, "image/png");

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f10593a.a(j10, j11);
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f10593a.b(rVar);
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        return this.f10593a.f(interfaceC4254q);
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        return this.f10593a.j(interfaceC4254q, i10);
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
