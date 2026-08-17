package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class U implements InterfaceC1330v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f9097a;

    U(D d10) {
        this.f9097a = d10;
    }

    static T b(D d10) {
        return new T(Wg.a.c(new C1298c0(d10)));
    }

    @Override // Pf.InterfaceC1330v
    public InputStream a() {
        return new C1298c0(this.f9097a);
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return b(this.f9097a);
    }

    @Override // Pf.InterfaceC1301e
    public AbstractC1333y g() {
        try {
            return e();
        } catch (IOException e10) {
            throw new C1332x("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }
}
