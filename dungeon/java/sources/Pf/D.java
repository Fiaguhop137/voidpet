package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f9046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[][] f9048c;

    D(InputStream inputStream, int i10, byte[][] bArr) {
        this.f9046a = inputStream;
        this.f9047b = i10;
        this.f9048c = bArr;
    }

    private void i(boolean z10) {
        InputStream inputStream = this.f9046a;
        if (inputStream instanceof M0) {
            ((M0) inputStream).d(z10);
        }
    }

    InterfaceC1301e a(int i10) throws IOException {
        i(false);
        int iK = C1319n.k(this.f9046a, i10);
        int iH = C1319n.h(this.f9046a, this.f9047b, iK == 3 || iK == 4 || iK == 16 || iK == 17 || iK == 8);
        if (iH < 0) {
            if ((i10 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            D d10 = new D(new M0(this.f9046a, this.f9047b), this.f9047b, this.f9048c);
            int i11 = i10 & 192;
            return i11 != 0 ? new C1294a0(i11, iK, d10) : d10.e(iK);
        }
        K0 k10 = new K0(this.f9046a, iH, this.f9047b);
        if ((i10 & 224) == 0) {
            return f(iK, k10);
        }
        D d11 = new D(k10, k10.a(), this.f9048c);
        int i12 = i10 & 192;
        if (i12 != 0) {
            return new J0(i12, iK, (i10 & 32) != 0, d11);
        }
        return d11.d(iK);
    }

    AbstractC1333y b(int i10, int i11, boolean z10) {
        return !z10 ? G.A(i10, i11, ((K0) this.f9046a).e()) : G.x(i10, i11, h());
    }

    AbstractC1333y c(int i10, int i11) {
        return G.y(i10, i11, h());
    }

    InterfaceC1301e d(int i10) throws C1307h {
        if (i10 == 3) {
            return new Q(this);
        }
        if (i10 == 4) {
            return new U(this);
        }
        if (i10 == 8) {
            return new C1306g0(this);
        }
        if (i10 == 16) {
            return new F0(this);
        }
        if (i10 == 17) {
            return new H0(this);
        }
        throw new C1307h("unknown DL object encountered: 0x" + Integer.toHexString(i10));
    }

    InterfaceC1301e e(int i10) throws C1307h {
        if (i10 == 3) {
            return new Q(this);
        }
        if (i10 == 4) {
            return new U(this);
        }
        if (i10 == 8) {
            return new C1306g0(this);
        }
        if (i10 == 16) {
            return new W(this);
        }
        if (i10 == 17) {
            return new Y(this);
        }
        throw new C1307h("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    InterfaceC1301e f(int i10, K0 k10) throws C1307h {
        if (i10 == 3) {
            return new A0(k10);
        }
        if (i10 == 4) {
            return new C1322o0(k10);
        }
        if (i10 == 8) {
            throw new C1307h("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i10 == 16) {
            throw new C1307h("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i10 == 17) {
            throw new C1307h("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return C1319n.d(i10, k10, this.f9048c);
        } catch (IllegalArgumentException e10) {
            throw new C1307h("corrupted stream detected", e10);
        }
    }

    public InterfaceC1301e g() throws IOException {
        int i10 = this.f9046a.read();
        if (i10 < 0) {
            return null;
        }
        return a(i10);
    }

    C1303f h() throws IOException {
        int i10 = this.f9046a.read();
        if (i10 < 0) {
            return new C1303f(0);
        }
        C1303f c1303f = new C1303f();
        do {
            InterfaceC1301e interfaceC1301eA = a(i10);
            c1303f.a(interfaceC1301eA instanceof L0 ? ((L0) interfaceC1301eA).e() : interfaceC1301eA.g());
            i10 = this.f9046a.read();
        } while (i10 >= 0);
        return c1303f;
    }
}
