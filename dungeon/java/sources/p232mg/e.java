package p232mg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class e extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f49389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f49390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f49391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final byte[] f49392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final byte[] f49393g;

    public e(d dVar, byte[] bArr) {
        super(true, dVar);
        a aVarA = dVar.a();
        this.f49389c = a.k(bArr, 0, aVarA.d());
        int iD = aVarA.d();
        this.f49392f = a.k(bArr, iD, (aVarA.c() + iD) - 32);
        int iC = iD + (aVarA.c() - 32);
        int i10 = iC + 32;
        this.f49393g = a.k(bArr, iC, i10);
        int i11 = iC + 64;
        this.f49390d = a.k(bArr, i10, i11);
        this.f49391e = a.k(bArr, i11, iC + 96);
    }

    public byte[] getEncoded() {
        return a.i(new byte[][]{this.f49389c, this.f49392f, this.f49393g, this.f49390d, this.f49391e});
    }
}
