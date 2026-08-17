package p380v2;

import R1.InterfaceC1350j;

/* JADX INFO: renamed from: v2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4254q extends InterfaceC1350j {
    int a(int i10);

    boolean b(int i10, boolean z10);

    boolean c(byte[] bArr, int i10, int i11, boolean z10);

    void d();

    boolean g(byte[] bArr, int i10, int i11, boolean z10);

    long getLength();

    long getPosition();

    long h();

    void i(int i10);

    int k(byte[] bArr, int i10, int i11);

    void l(int i10);

    boolean n(int i10, boolean z10);

    void o(byte[] bArr, int i10, int i11);

    @Override // R1.InterfaceC1350j
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);
}
