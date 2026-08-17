package S2;

import U1.InterfaceC1470l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    private static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iE = kVar.e(j10);
        if (iE == -1) {
            iE = kVar.i();
        }
        return (iE <= 0 || kVar.h(iE + (-1)) != j10) ? iE : iE - 1;
    }

    private static void b(k kVar, int i10, InterfaceC1470l interfaceC1470l) {
        long jH = kVar.h(i10);
        List listG = kVar.g(jH);
        if (listG.isEmpty()) {
            return;
        }
        if (i10 == kVar.i() - 1) {
            throw new IllegalStateException();
        }
        long jH2 = kVar.h(i10 + 1) - kVar.h(i10);
        if (jH2 > 0) {
            interfaceC1470l.accept(new e(listG, jH, jH2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void c(k kVar, s.b bVar, InterfaceC1470l interfaceC1470l) {
        boolean z10;
        int iA = a(kVar, bVar.f11530a);
        if (bVar.f11530a == -9223372036854775807L || iA >= kVar.i()) {
            z10 = false;
        } else {
            List listG = kVar.g(bVar.f11530a);
            long jH = kVar.h(iA);
            if (listG.isEmpty()) {
                z10 = false;
            } else {
                long j10 = bVar.f11530a;
                if (j10 < jH) {
                    interfaceC1470l.accept(new e(listG, j10, jH - j10));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iA; i10 < kVar.i(); i10++) {
            b(kVar, i10, interfaceC1470l);
        }
        if (bVar.f11531b) {
            if (z10) {
                iA--;
            }
            for (int i11 = 0; i11 < iA; i11++) {
                b(kVar, i11, interfaceC1470l);
            }
            if (z10) {
                interfaceC1470l.accept(new e(kVar.g(bVar.f11530a), kVar.h(iA), bVar.f11530a - kVar.h(iA)));
            }
        }
    }
}
