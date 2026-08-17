package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class Y implements InterfaceC1301e, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f9099a;

    Y(D d10) {
        this.f9099a = d10;
    }

    static X b(D d10) {
        return new X(d10.h());
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return b(this.f9099a);
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
