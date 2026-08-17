package io.sentry.util;

import io.sentry.C3692d;
import io.sentry.C3821x1;
import io.sentry.C3833z3;
import io.sentry.InterfaceC3619a0;
import io.sentry.N0;
import io.sentry.Y;
import io.sentry.g4;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H {
    public static /* synthetic */ void b(Y y10, C3833z3 c3833z3, C3821x1 c3821x1) {
        C3692d c3692dA = c3821x1.a();
        if (c3692dA.q()) {
            c3692dA.H(y10, c3833z3);
            c3692dA.b();
        }
    }

    public static C3692d d(C3692d c3692d, g4 g4Var) {
        return e(c3692d, g4Var == null ? null : g4Var.e(), g4Var == null ? null : g4Var.d(), g4Var != null ? g4Var.c() : null);
    }

    public static C3692d e(C3692d c3692d, Boolean bool, Double d10, Double d11) {
        if (c3692d == null) {
            c3692d = new C3692d(N0.e());
        }
        if (c3692d.i() == null) {
            Double dJ = c3692d.j();
            if (dJ != null) {
                d10 = dJ;
            }
            c3692d.B(A.b(d11, d10, bool));
        }
        if (c3692d.q() && c3692d.r()) {
            c3692d.b();
        }
        return c3692d;
    }

    public static boolean f(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.F) it.next()).a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (((io.sentry.F) it2.next()).b(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static C3821x1 g(Y y10, C3833z3 c3833z3) {
        return y10.O(new E(y10, c3833z3));
    }

    public static void h(InterfaceC3619a0 interfaceC3619a0) {
        interfaceC3619a0.z(new F());
    }
}
