package p041c4;

import R3.C1364k;
import U3.i;
import java.util.ArrayList;
import java.util.List;
import p059d4.c;
import p095f4.a;

/* JADX INFO: loaded from: classes.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c.a f27245a = c.a.a("k");

    static List a(c cVar, C1364k c1364k, float f10, N n10, boolean z10) {
        c cVar2;
        C1364k c1364k2;
        float f11;
        N n11;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.d() == c.b.STRING) {
            c1364k.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.I();
        while (cVar.hasNext()) {
            if (cVar.f(f27245a) != 0) {
                cVar.k0();
            } else if (cVar.d() == c.b.BEGIN_ARRAY) {
                cVar.N();
                if (cVar.d() == c.b.NUMBER) {
                    c cVar3 = cVar;
                    C1364k c1364k3 = c1364k;
                    float f12 = f10;
                    N n12 = n10;
                    boolean z12 = z10;
                    a aVarC = t.c(cVar3, c1364k3, f12, n12, false, z12);
                    cVar2 = cVar3;
                    c1364k2 = c1364k3;
                    f11 = f12;
                    n11 = n12;
                    z11 = z12;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    c1364k2 = c1364k;
                    f11 = f10;
                    n11 = n10;
                    z11 = z10;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.c(cVar2, c1364k2, f11, n11, true, z11));
                    }
                }
                cVar2.J();
                cVar = cVar2;
                c1364k = c1364k2;
                f10 = f11;
                n10 = n11;
                z10 = z11;
            } else {
                c cVar4 = cVar;
                arrayList.add(t.c(cVar4, c1364k, f10, n10, false, z10));
                cVar = cVar4;
            }
        }
        cVar.T();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i10;
        Object obj;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            a aVar = (a) list.get(i11);
            i11++;
            a aVar2 = (a) list.get(i11);
            aVar.f41719h = Float.valueOf(aVar2.f41718g);
            if (aVar.f41714c == null && (obj = aVar2.f41713b) != null) {
                aVar.f41714c = obj;
                if (aVar instanceof i) {
                    ((i) aVar).j();
                }
            }
        }
        a aVar3 = (a) list.get(i10);
        if ((aVar3.f41713b == null || aVar3.f41714c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
