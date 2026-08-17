package p176je;

import He.e;
import Re.AbstractC1388d0;
import Se.w;
import Xd.i;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1799m;
import p015ae.Y;
import p015ae.Z;
import p015ae.g0;
import p212le.c;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {
    public static final boolean d(InterfaceC1788b interfaceC1788b) {
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        return g(interfaceC1788b) != null;
    }

    public static final String e(InterfaceC1788b callableMemberDescriptor) {
        InterfaceC1788b interfaceC1788bW;
        f fVarJ;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC1788b interfaceC1788bF = f(callableMemberDescriptor);
        if (interfaceC1788bF != null && (interfaceC1788bW = e.w(interfaceC1788bF)) != null) {
            if (interfaceC1788bW instanceof Z) {
                return C3882m.f47356a.b(interfaceC1788bW);
            }
            if ((interfaceC1788bW instanceof g0) && (fVarJ = C3875f.f47345o.j((g0) interfaceC1788bW)) != null) {
                return fVarJ.g();
            }
        }
        return null;
    }

    private static final InterfaceC1788b f(InterfaceC1788b interfaceC1788b) {
        if (i.h0(interfaceC1788b)) {
            return g(interfaceC1788b);
        }
        return null;
    }

    public static final InterfaceC1788b g(InterfaceC1788b interfaceC1788b) {
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        if (!U.f47297a.g().contains(interfaceC1788b.getName()) && !C3879j.f47349a.d().contains(e.w(interfaceC1788b).getName())) {
            return null;
        }
        if ((interfaceC1788b instanceof Z) || (interfaceC1788b instanceof Y)) {
            return e.i(interfaceC1788b, false, P.f47294a, 1, null);
        }
        if (interfaceC1788b instanceof g0) {
            return e.i(interfaceC1788b, false, Q.f47295a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C3882m.f47356a.d(e.w(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C3875f.f47345o.k((g0) it);
    }

    public static final InterfaceC1788b j(InterfaceC1788b interfaceC1788b) {
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        InterfaceC1788b interfaceC1788bG = g(interfaceC1788b);
        if (interfaceC1788bG != null) {
            return interfaceC1788bG;
        }
        C3878i c3878i = C3878i.f47348o;
        f name = interfaceC1788b.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (c3878i.n(name)) {
            return e.i(interfaceC1788b, false, S.f47296a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return i.h0(it) && C3878i.o(it) != null;
    }

    public static final boolean l(InterfaceC1791e interfaceC1791e, InterfaceC1787a specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(interfaceC1791e, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC1799m interfaceC1799mB = specialCallableDescriptor.b();
        Intrinsics.d(interfaceC1799mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC1388d0 abstractC1388d0Q = ((InterfaceC1791e) interfaceC1799mB).q();
        Intrinsics.checkNotNullExpressionValue(abstractC1388d0Q, "getDefaultType(...)");
        for (InterfaceC1791e interfaceC1791eS = De.i.s(interfaceC1791e); interfaceC1791eS != null; interfaceC1791eS = De.i.s(interfaceC1791eS)) {
            if (!(interfaceC1791eS instanceof c) && w.b(interfaceC1791eS.q(), abstractC1388d0Q) != null) {
                return !i.h0(interfaceC1791eS);
            }
        }
        return false;
    }

    public static final boolean m(InterfaceC1788b interfaceC1788b) {
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        return e.w(interfaceC1788b).b() instanceof c;
    }

    public static final boolean n(InterfaceC1788b interfaceC1788b) {
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        return m(interfaceC1788b) || i.h0(interfaceC1788b);
    }
}
