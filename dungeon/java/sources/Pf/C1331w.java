package Pf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: Pf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1331w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f9170a;

    C1331w(OutputStream outputStream) {
        this.f9170a = outputStream;
    }

    public static C1331w a(OutputStream outputStream) {
        return new C1331w(outputStream);
    }

    public static C1331w b(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new C1324p0(outputStream);
        }
        return str.equals("DL") ? new D0(outputStream) : new C1331w(outputStream);
    }

    static int f(int i10) {
        if (i10 < 128) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 8;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    static int g(boolean z10, int i10) {
        return (z10 ? 1 : 0) + f(i10) + i10;
    }

    static int h(int i10) {
        if (i10 < 31) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 7;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    void c() {
    }

    C1324p0 d() {
        return new C1324p0(this.f9170a);
    }

    D0 e() {
        return new D0(this.f9170a);
    }

    final void i(int i10) throws IOException {
        this.f9170a.write(i10);
    }

    final void j(byte[] bArr, int i10, int i11) throws IOException {
        this.f9170a.write(bArr, i10, i11);
    }

    final void k(int i10) throws IOException {
        if (i10 < 128) {
            i(i10);
            return;
        }
        int i11 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i12 = i11 - 1;
            bArr[i12] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                int i13 = i11 - 2;
                bArr[i13] = (byte) ((5 - i12) | 128);
                j(bArr, i13, 6 - i12);
                return;
            }
            i11 = i12;
        }
    }

    void l(InterfaceC1301e[] interfaceC1301eArr) {
        for (InterfaceC1301e interfaceC1301e : interfaceC1301eArr) {
            interfaceC1301e.g().k(this, true);
        }
    }

    final void m(boolean z10, int i10, byte b10) throws IOException {
        s(z10, i10);
        k(1);
        i(b10);
    }

    final void n(boolean z10, int i10, byte b10, byte[] bArr, int i11, int i12) throws IOException {
        s(z10, i10);
        k(i12 + 1);
        i(b10);
        j(bArr, i11, i12);
    }

    final void o(boolean z10, int i10, byte[] bArr) {
        s(z10, i10);
        k(bArr.length);
        j(bArr, 0, bArr.length);
    }

    final void p(boolean z10, int i10, byte[] bArr, int i11, int i12) {
        s(z10, i10);
        k(i12);
        j(bArr, i11, i12);
    }

    final void q(boolean z10, int i10, byte[] bArr, int i11, int i12, byte b10) throws IOException {
        s(z10, i10);
        k(i12 + 1);
        j(bArr, i11, i12);
        i(b10);
    }

    final void r(boolean z10, int i10, InterfaceC1301e[] interfaceC1301eArr) throws IOException {
        s(z10, i10);
        i(128);
        l(interfaceC1301eArr);
        i(0);
        i(0);
    }

    final void s(boolean z10, int i10) throws IOException {
        if (z10) {
            i(i10);
        }
    }

    final void t(boolean z10, int i10, int i11) throws IOException {
        if (z10) {
            if (i11 < 31) {
                i(i10 | i11);
                return;
            }
            byte[] bArr = new byte[6];
            int i12 = 5;
            bArr[5] = (byte) (i11 & 127);
            while (i11 > 127) {
                i11 >>>= 7;
                i12--;
                bArr[i12] = (byte) ((i11 & 127) | 128);
            }
            int i13 = i12 - 1;
            bArr[i13] = (byte) (31 | i10);
            j(bArr, i13, 6 - i13);
        }
    }

    void u(AbstractC1333y abstractC1333y, boolean z10) {
        abstractC1333y.k(this, z10);
    }

    void v(AbstractC1333y[] abstractC1333yArr) {
        for (AbstractC1333y abstractC1333y : abstractC1333yArr) {
            abstractC1333y.k(this, true);
        }
    }
}
