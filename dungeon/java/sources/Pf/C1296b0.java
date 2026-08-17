package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Pf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1296b0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f9108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9110c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9111d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC1297c f9112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f9113f;

    C1296b0(D d10, boolean z10) {
        this.f9108a = d10;
        this.f9109b = z10;
    }

    private InterfaceC1297c a() throws IOException {
        InterfaceC1301e interfaceC1301eG = this.f9108a.g();
        if (interfaceC1301eG == null) {
            if (!this.f9109b || this.f9111d == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f9111d);
        }
        if (interfaceC1301eG instanceof InterfaceC1297c) {
            if (this.f9111d == 0) {
                return (InterfaceC1297c) interfaceC1301eG;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + interfaceC1301eG.getClass());
    }

    int b() {
        return this.f9111d;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f9113f == null) {
            if (!this.f9110c) {
                return -1;
            }
            InterfaceC1297c interfaceC1297cA = a();
            this.f9112e = interfaceC1297cA;
            if (interfaceC1297cA == null) {
                return -1;
            }
            this.f9110c = false;
            this.f9113f = interfaceC1297cA.h();
        }
        while (true) {
            int i10 = this.f9113f.read();
            if (i10 >= 0) {
                return i10;
            }
            this.f9111d = this.f9112e.c();
            InterfaceC1297c interfaceC1297cA2 = a();
            this.f9112e = interfaceC1297cA2;
            if (interfaceC1297cA2 == null) {
                this.f9113f = null;
                return -1;
            }
            this.f9113f = interfaceC1297cA2.h();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        if (this.f9113f == null) {
            if (!this.f9110c) {
                return -1;
            }
            InterfaceC1297c interfaceC1297cA = a();
            this.f9112e = interfaceC1297cA;
            if (interfaceC1297cA == null) {
                return -1;
            }
            this.f9110c = false;
            this.f9113f = interfaceC1297cA.h();
        }
        while (true) {
            int i13 = this.f9113f.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                this.f9111d = this.f9112e.c();
                InterfaceC1297c interfaceC1297cA2 = a();
                this.f9112e = interfaceC1297cA2;
                if (interfaceC1297cA2 == null) {
                    this.f9113f = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f9113f = interfaceC1297cA2.h();
            }
        }
    }
}
