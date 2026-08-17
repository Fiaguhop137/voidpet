package p304qg;

import Ug.f;
import Vf.j;

/* JADX INFO: loaded from: classes3.dex */
abstract class l {
    static byte[] a(e eVar, byte[] bArr, int i10, byte[] bArr2) {
        j jVarC = b.c(eVar);
        byte[] bArrB = a.f().d(bArr).i(i10).h(-32640).g(0, 22).b();
        jVarC.update(bArrB, 0, bArrB.length);
        j jVarC2 = b.c(eVar);
        byte[] bArrB2 = a.f().d(bArr).i(i10).g(0, jVarC2.d() + 23).b();
        n nVar = new n(bArr, bArr2, b.c(eVar));
        nVar.d(i10);
        nVar.c(0);
        int iD = eVar.d();
        int iC = eVar.c();
        int iG = (1 << eVar.g()) - 1;
        int i11 = 0;
        while (i11 < iD) {
            nVar.a(bArrB2, i11 < iD + (-1), 23);
            f.k((short) i11, bArrB2, 20);
            for (int i12 = 0; i12 < iG; i12++) {
                bArrB2[22] = (byte) i12;
                jVarC2.update(bArrB2, 0, bArrB2.length);
                jVarC2.a(bArrB2, 23);
            }
            jVarC.update(bArrB2, 23, iC);
            i11++;
        }
        byte[] bArr3 = new byte[jVarC.d()];
        jVarC.a(bArr3, 0);
        return bArr3;
    }
}
