package p288q0;

import O0.b;
import androidx.compose.ui.layout.p;

/* JADX INFO: renamed from: q0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4059f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4062i f51183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f51184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f51185c;

    public C4059f(InterfaceC4062i interfaceC4062i, k kVar, l lVar) {
        this.f51183a = interfaceC4062i;
        this.f51184b = kVar;
        this.f51185c = lVar;
    }

    @Override // p288q0.InterfaceC4062i
    public int A(int i10) {
        return this.f51183a.A(i10);
    }

    @Override // p288q0.InterfaceC4062i
    public int Q(int i10) {
        return this.f51183a.Q(i10);
    }

    @Override // p288q0.InterfaceC4062i
    public int Z(int i10) {
        return this.f51183a.Z(i10);
    }

    @Override // p288q0.InterfaceC4062i
    public Object a() {
        return this.f51183a.a();
    }

    @Override // p288q0.InterfaceC4062i
    public int c0(int i10) {
        return this.f51183a.c0(i10);
    }

    @Override // p288q0.w
    public p d0(long j10) {
        if (this.f51185c == l.Width) {
            return new C4060g(this.f51184b == k.Max ? this.f51183a.c0(b.k(j10)) : this.f51183a.Z(b.k(j10)), b.g(j10) ? b.k(j10) : 32767);
        }
        return new C4060g(b.h(j10) ? b.l(j10) : 32767, this.f51184b == k.Max ? this.f51183a.A(b.l(j10)) : this.f51183a.Q(b.l(j10)));
    }
}
