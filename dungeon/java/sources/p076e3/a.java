package p076e3;

import U1.F;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.L;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC4253p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f40357a = new F(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f40358b = new L(-1, -1, "image/webp");

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f40358b.a(j10, j11);
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f40358b.b(rVar);
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        this.f40357a.W(4);
        interfaceC4254q.o(this.f40357a.f(), 0, 4);
        if (this.f40357a.N() != 1380533830) {
            return false;
        }
        interfaceC4254q.i(4);
        this.f40357a.W(4);
        interfaceC4254q.o(this.f40357a.f(), 0, 4);
        return this.f40357a.N() == 1464156752;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        return this.f40358b.j(interfaceC4254q, i10);
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
