package p041c4;

import p059d4.c;

/* JADX INFO: renamed from: c4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2127n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f27231a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static X3.c a(c cVar) {
        cVar.I();
        String strJ2 = null;
        String strJ3 = null;
        float fNextDouble = 0.0f;
        String strJ4 = null;
        while (cVar.hasNext()) {
            int iF = cVar.f(f27231a);
            if (iF == 0) {
                strJ2 = cVar.j2();
            } else if (iF == 1) {
                strJ4 = cVar.j2();
            } else if (iF == 2) {
                strJ3 = cVar.j2();
            } else if (iF != 3) {
                cVar.g();
                cVar.k0();
            } else {
                fNextDouble = (float) cVar.nextDouble();
            }
        }
        cVar.T();
        return new X3.c(strJ2, strJ4, strJ3, fNextDouble);
    }
}
