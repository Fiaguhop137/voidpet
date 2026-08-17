package Pf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class A0 implements InterfaceC1297c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0 f9035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9036b = 0;

    A0(K0 k10) {
        this.f9035a = k10;
    }

    private InputStream b(boolean z10) throws IOException {
        int iC = this.f9035a.c();
        if (iC < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i10 = this.f9035a.read();
        this.f9036b = i10;
        if (i10 > 0) {
            if (iC < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i10 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
            if (z10) {
                throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f9036b);
            }
        }
        return this.f9035a;
    }

    @Override // Pf.InterfaceC1297c
    public int c() {
        return this.f9036b;
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return AbstractC1295b.w(this.f9035a.e());
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
        return b(false);
    }
}
