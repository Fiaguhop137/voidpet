package p041c4;

import R3.C1364k;
import Z3.a;
import p059d4.c;

/* JADX INFO: renamed from: c4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2118e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f27209a = c.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f27210b = c.a.a("ty", "v");

    private static a a(c cVar, C1364k c1364k) {
        cVar.I();
        a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!cVar.hasNext()) {
                    cVar.T();
                    return aVar;
                }
                int iF = cVar.f(f27210b);
                if (iF != 0) {
                    if (iF != 1) {
                        cVar.g();
                        cVar.k0();
                    } else if (z10) {
                        aVar = new a(AbstractC2117d.e(cVar, c1364k));
                    } else {
                        cVar.k0();
                    }
                } else if (cVar.nextInt() == 0) {
                    z10 = true;
                }
            }
        }
    }

    static a b(c cVar, C1364k c1364k) {
        a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.f(f27209a) != 0) {
                cVar.g();
                cVar.k0();
            } else {
                cVar.N();
                while (cVar.hasNext()) {
                    a aVarA = a(cVar, c1364k);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.J();
            }
        }
        return aVar;
    }
}
