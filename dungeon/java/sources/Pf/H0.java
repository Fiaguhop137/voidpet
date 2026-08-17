package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class H0 implements InterfaceC1301e, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f9061a;

    H0(D d10) {
        this.f9061a = d10;
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return C0.b(this.f9061a.h());
    }

    @Override // Pf.InterfaceC1301e
    public AbstractC1333y g() {
        try {
            return e();
        } catch (IOException e10) {
            throw new C1332x(e10.getMessage(), e10);
        }
    }
}
