package p088ef;

import Ed.b;

/* JADX INFO: renamed from: ef.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3320y extends H0 implements InterfaceC3318x {
    public C3320y(B0 b10) {
        super(true);
        r0(b10);
    }

    @Override // p088ef.InterfaceC3318x
    public boolean G(Object obj) {
        return x0(obj);
    }

    @Override // p088ef.InterfaceC3318x
    public boolean c(Throwable th) {
        return x0(new C(th, false, 2, null));
    }

    @Override // p088ef.W
    public Object f() {
        return e0();
    }

    @Override // p088ef.W
    public Object i(b bVar) throws Throwable {
        Object objD = D(bVar);
        Fd.b.e();
        return objD;
    }

    @Override // p088ef.H0
    public boolean i0() {
        return true;
    }
}
