package p304qg;

import Vf.j;

/* JADX INFO: loaded from: classes3.dex */
abstract class m {
    static void a(byte[] bArr, j jVar) {
        jVar.update(bArr, 0, bArr.length);
    }

    static void b(short s10, j jVar) {
        jVar.b((byte) (s10 >>> 8));
        jVar.b((byte) s10);
    }

    static void c(int i10, j jVar) {
        jVar.b((byte) (i10 >>> 24));
        jVar.b((byte) (i10 >>> 16));
        jVar.b((byte) (i10 >>> 8));
        jVar.b((byte) i10);
    }
}
