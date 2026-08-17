package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class W implements InterfaceC1301e, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f9098a;

    W(D d10) {
        this.f9098a = d10;
    }

    static V b(D d10) {
        return new V(d10.h());
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return b(this.f9098a);
    }

    @Override // Pf.InterfaceC1301e
    public AbstractC1333y g() {
        try {
            return e();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
