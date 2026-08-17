package J;

import I.AbstractC1083w;
import I.C1021b;
import I.G1;
import I.InterfaceC1027d;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f5626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ G1 f5627b;

        a(f fVar, G1 g10) {
            this.f5626a = fVar;
            this.f5627b = g10;
        }

        @Override // J.f
        public List j(Integer num) {
            List listJ = this.f5626a.j(null);
            int iA0 = this.f5627b.a0();
            if (iA0 < 0) {
                return listJ;
            }
            G1 g10 = this.f5627b;
            return CollectionsKt.C0(U.b.b(g10, num, iA0, Integer.valueOf(g10.C0(iA0))), listJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(Throwable th, f fVar, G1 g10, C1021b c1021b) {
        return fVar == null ? th : U.d.b(th, new g(c1021b, g10, fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(C1021b c1021b, G1 g10, f fVar) {
        if (c1021b != null) {
            g10.P0(c1021b);
        }
        List listC = U.b.c(g10, null, 0, null, 7, null);
        U.c cVar = (U.c) CollectionsKt.w0(listC);
        Integer numC = cVar != null ? cVar.c() : null;
        List listJ = fVar.j(numC);
        if (numC != null && !listJ.isEmpty()) {
            listJ = CollectionsKt.C0(CollectionsKt.e(U.c.b((U.c) CollectionsKt.j0(listJ), null, numC, 1, null)), CollectionsKt.d0(listJ, 1));
        }
        return CollectionsKt.C0(listC, listJ);
    }

    private static final int h(G1 g10) {
        int iZ = g10.Z();
        int iA0 = g10.a0();
        while (iA0 >= 0 && !g10.p0(iA0)) {
            iA0 = g10.C0(iA0);
        }
        int iH0 = iA0 + 1;
        int iA1 = 0;
        while (iH0 < iZ) {
            if (g10.k0(iZ, iH0)) {
                if (g10.p0(iH0)) {
                    iA1 = 0;
                }
                iH0++;
            } else {
                iA1 += g10.p0(iH0) ? 1 : g10.A0(iH0);
                iH0 += g10.h0(iH0);
            }
        }
        return iA1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(G1 g10, C1021b c1021b, InterfaceC1027d interfaceC1027d) {
        int iC = g10.C(c1021b);
        if (!(g10.Z() < iC)) {
            AbstractC1083w.t("Check failed");
        }
        j(g10, interfaceC1027d, iC);
        int iH = h(g10);
        while (g10.Z() < iC) {
            if (g10.j0(iC)) {
                if (g10.o0()) {
                    interfaceC1027d.h(g10.y0(g10.Z()));
                    iH = 0;
                }
                g10.d1();
            } else {
                iH += g10.T0();
            }
        }
        if (!(g10.Z() == iC)) {
            AbstractC1083w.t("Check failed");
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(G1 g10, InterfaceC1027d interfaceC1027d, int i10) {
        while (!g10.l0(i10)) {
            g10.U0();
            if (g10.p0(g10.a0())) {
                interfaceC1027d.k();
            }
            g10.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f k(f fVar, G1 g10) {
        return new a(fVar, g10);
    }
}
