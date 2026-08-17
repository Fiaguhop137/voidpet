package Pf;

import java.io.IOException;

/* JADX INFO: renamed from: Pf.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1294a0 implements InterfaceC1301e, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f9102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f9103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final D f9104c;

    C1294a0(int i10, int i11, D d10) {
        this.f9102a = i10;
        this.f9103b = i11;
        this.f9104c = d10;
    }

    public AbstractC1333y e() {
        return this.f9104c.c(this.f9102a, this.f9103b);
    }

    @Override // Pf.InterfaceC1301e
    public AbstractC1333y g() {
        try {
            return e();
        } catch (IOException e10) {
            throw new C1332x(e10.getMessage());
        }
    }
}
