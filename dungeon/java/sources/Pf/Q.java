package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Q implements InterfaceC1297c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f9089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1296b0 f9090b;

    Q(D d10) {
        this.f9089a = d10;
    }

    static P b(D d10) {
        C1296b0 c1296b0 = new C1296b0(d10, false);
        return new P(Wg.a.c(c1296b0), c1296b0.b());
    }

    @Override // Pf.InterfaceC1297c
    public int c() {
        return this.f9090b.b();
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return b(this.f9089a);
    }

    @Override // Pf.InterfaceC1301e
    public AbstractC1333y g() {
        try {
            return e();
        } catch (IOException e10) {
            throw new C1332x("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // Pf.InterfaceC1297c
    public InputStream h() {
        C1296b0 c1296b0 = new C1296b0(this.f9089a, false);
        this.f9090b = c1296b0;
        return c1296b0;
    }
}
