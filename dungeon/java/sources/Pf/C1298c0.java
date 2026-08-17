package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Pf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1298c0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f9114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9115b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f9116c;

    C1298c0(D d10) {
        this.f9114a = d10;
    }

    private InterfaceC1330v a() throws IOException {
        InterfaceC1301e interfaceC1301eG = this.f9114a.g();
        if (interfaceC1301eG == null) {
            return null;
        }
        if (interfaceC1301eG instanceof InterfaceC1330v) {
            return (InterfaceC1330v) interfaceC1301eG;
        }
        throw new IOException("unknown object encountered: " + interfaceC1301eG.getClass());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InterfaceC1330v interfaceC1330vA;
        if (this.f9116c == null) {
            if (!this.f9115b || (interfaceC1330vA = a()) == null) {
                return -1;
            }
            this.f9115b = false;
            this.f9116c = interfaceC1330vA.a();
        }
        while (true) {
            int i10 = this.f9116c.read();
            if (i10 >= 0) {
                return i10;
            }
            InterfaceC1330v interfaceC1330vA2 = a();
            if (interfaceC1330vA2 == null) {
                this.f9116c = null;
                return -1;
            }
            this.f9116c = interfaceC1330vA2.a();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        InterfaceC1330v interfaceC1330vA;
        int i12 = 0;
        if (this.f9116c == null) {
            if (!this.f9115b || (interfaceC1330vA = a()) == null) {
                return -1;
            }
            this.f9115b = false;
            this.f9116c = interfaceC1330vA.a();
        }
        while (true) {
            int i13 = this.f9116c.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                InterfaceC1330v interfaceC1330vA2 = a();
                if (interfaceC1330vA2 == null) {
                    this.f9116c = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f9116c = interfaceC1330vA2.a();
            }
        }
    }
}
