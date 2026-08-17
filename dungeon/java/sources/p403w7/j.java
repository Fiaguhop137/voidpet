package p403w7;

import java.io.IOException;
import p421x7.a;

/* JADX INFO: loaded from: classes2.dex */
class j extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f56668h = e.a("IHDR");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f56669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f56670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte[] f56671g = new byte[5];

    j() {
    }

    @Override // p403w7.e
    void b(a aVar) throws IOException {
        this.f56669e = aVar.c();
        this.f56670f = aVar.c();
        byte[] bArr = this.f56671g;
        aVar.read(bArr, 0, bArr.length);
    }
}
