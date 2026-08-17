package p017ag;

import Vf.b;

/* JADX INFO: loaded from: classes3.dex */
public class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f19792a;

    private f(int i10) {
        this.f19792a = new byte[i10];
    }

    public f(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public f(byte[] bArr, int i10, int i11) {
        this(i11);
        System.arraycopy(bArr, i10, this.f19792a, 0, i11);
    }

    public byte[] a() {
        return this.f19792a;
    }
}
