package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Pf.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1322o0 implements InterfaceC1330v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K0 f9153a;

    C1322o0(K0 k10) {
        this.f9153a = k10;
    }

    @Override // Pf.InterfaceC1330v
    public InputStream a() {
        return this.f9153a;
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return new C1320n0(this.f9153a.e());
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
