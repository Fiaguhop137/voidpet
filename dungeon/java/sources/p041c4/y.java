package p041c4;

import Z3.j;
import p059d4.c;

/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f27254a = c.a.a("nm", "mm", "hd");

    static j a(c cVar) {
        String strJ2 = null;
        boolean zB = false;
        j.a aVarG = null;
        while (cVar.hasNext()) {
            int iF = cVar.f(f27254a);
            if (iF == 0) {
                strJ2 = cVar.j2();
            } else if (iF == 1) {
                aVarG = j.a.g(cVar.nextInt());
            } else if (iF != 2) {
                cVar.g();
                cVar.k0();
            } else {
                zB = cVar.b();
            }
        }
        return new j(strJ2, aVarG, zB);
    }
}
