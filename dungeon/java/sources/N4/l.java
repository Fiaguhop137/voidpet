package N4;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g.N element, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof g.C1198s) {
            return;
        }
        if (element instanceof g.L) {
            z10 = z10 || d((g.L) element);
            g.L l10 = (g.L) element;
            f(l10.f7528e, i10);
            f(l10.f7529f, i10);
            c(l10, i10, z10);
        }
        if (element instanceof g.J) {
            for (g.N n10 : ((g.J) element).b()) {
                Intrinsics.c(n10);
                a(n10, i10, z10);
            }
        }
    }

    public static final void b(g svg, int i10) {
        Intrinsics.checkNotNullParameter(svg, "svg");
        g.F fM = svg.m();
        List listD = svg.d();
        if (listD != null) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                f(((b.p) it.next()).f7372b, i10);
            }
        }
        f(fM.f7528e, i10);
        f(fM.f7529f, i10);
        Intrinsics.c(fM);
        boolean zD = d(fM);
        for (g.N n10 : fM.f7514i) {
            Intrinsics.c(n10);
            a(n10, i10, zD);
        }
    }

    public static final void c(g.L element, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (z10) {
            return;
        }
        g.E e10 = element.f7529f;
        if (e10 == null) {
            e10 = new g.E();
            element.f7529f = e10;
        }
        g.C1186f c1186f = new g.C1186f(i10);
        if ((element instanceof g.C1201v) || (element instanceof g.C1184d) || (element instanceof g.C1188i) || (element instanceof g.B) || (element instanceof g.C) || (element instanceof g.C1196q) || (element instanceof g.A) || (element instanceof g.C1205z)) {
            e10.f7449b = c1186f;
            e10.f7448a = 1L;
        } else if (element instanceof g.Z) {
            e10.f7461n = c1186f;
            e10.f7448a = 4096L;
        }
    }

    public static final boolean d(g.L element) {
        g.O o10;
        Intrinsics.checkNotNullParameter(element, "element");
        g.E e10 = element.f7529f;
        if (e10 == null && element.f7528e == null) {
            return false;
        }
        if (e10 != null && (e10.f7461n != null || e10.f7449b != null || (o10 = e10.f7452e) != null || o10 != null || e10.f7437C != null || e10.f7442H != null)) {
            return true;
        }
        g.E e11 = element.f7528e;
        if (e11 == null) {
            return false;
        }
        return (e11.f7461n == null && e11.f7449b == null && e11.f7452e == null && e11.f7444J == null && e11.f7437C == null && e11.f7442H == null) ? false : true;
    }

    public static final void e(g.O o10, int i10) {
        if (!(o10 instanceof g.C1186f) || o10 == g.C1186f.f7586c) {
            return;
        }
        ((g.C1186f) o10).f7587a = i10;
    }

    public static final void f(g.E e10, int i10) {
        if (e10 == null) {
            return;
        }
        e(e10.f7461n, i10);
        e(e10.f7449b, i10);
        e(e10.f7452e, i10);
        e(e10.f7437C, i10);
        e(e10.f7442H, i10);
        e(e10.f7444J, i10);
    }
}
