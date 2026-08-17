package p380v2;

import J2.h;
import R1.x;
import U1.F;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f55951a = new F(10);

    public x a(InterfaceC4254q interfaceC4254q, h.a aVar) {
        x xVarE = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC4254q.o(this.f55951a.f(), 0, 10);
                this.f55951a.a0(0);
                if (this.f55951a.O() != 4801587) {
                    break;
                }
                this.f55951a.b0(3);
                int iK = this.f55951a.K();
                int i11 = iK + 10;
                if (xVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f55951a.f(), 0, bArr, 0, 10);
                    interfaceC4254q.o(bArr, 10, iK);
                    xVarE = new h(aVar).e(bArr, i11);
                } else {
                    interfaceC4254q.i(iK);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC4254q.d();
        interfaceC4254q.i(i10);
        return xVarE;
    }
}
