package I;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: I.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1083w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f4878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f4879b = new G0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f4880c = new G0("provider");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f4881d = new G0("compositionLocalMap");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f4882e = new G0("providerValues");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f4883f = new G0("providers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f4884g = new G0("reference");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f4885h = new C1077u();

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1049k0 A(List list, int i10, int i11) {
        int iY = y(list, i10);
        if (iY >= list.size()) {
            return null;
        }
        C1049k0 c1049k0 = (C1049k0) list.get(iY);
        if (c1049k0.b() < i11) {
            return c1049k0;
        }
        return null;
    }

    public static final boolean B() {
        return f4878a;
    }

    public static final Object C() {
        return f4881d;
    }

    public static final Object D() {
        return f4879b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E(C1058n0 c1058n0) {
        return c1058n0.d() != null ? new C1055m0(Integer.valueOf(c1058n0.a()), c1058n0.d()) : Integer.valueOf(c1058n0.a());
    }

    public static final Object F() {
        return f4880c;
    }

    public static final Object G() {
        return f4883f;
    }

    public static final Object H() {
        return f4884g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(List list, int i10, C1029d1 c1029d1, Object obj) {
        int iZ = z(list, i10);
        if (iZ < 0) {
            int i11 = -(iZ + 1);
            if (!(obj instanceof U)) {
                obj = null;
            }
            list.add(i11, new C1049k0(c1029d1, i10, obj));
            return;
        }
        C1049k0 c1049k0 = (C1049k0) list.get(iZ);
        if (!(obj instanceof U)) {
            c1049k0.e(null);
            return;
        }
        Object objA = c1049k0.a();
        if (objA == null) {
            c1049k0.e(obj);
        } else if (objA instanceof p323s.P) {
            ((p323s.P) objA).h(obj);
        } else {
            c1049k0.e(p323s.c0.c(objA, obj));
        }
    }

    public static final boolean J(C1 c10) {
        return c10.k() > c10.u() + 1;
    }

    public static final boolean K(G1 g10) {
        return g10.Z() > g10.a0() + 1;
    }

    public static final boolean L() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p323s.O M(int i10) {
        return K.b.d(new p323s.O(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(C1 c10, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (c10.Q(i10) == i11) {
                return i11;
            }
            if (c10.Q(i11) != i10) {
                if (c10.Q(i10) == c10.Q(i11)) {
                    return c10.Q(i10);
                }
                int iX = x(c10, i10, i12);
                int iX2 = x(c10, i11, i12);
                int i13 = iX - iX2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = c10.Q(i10);
                }
                int i15 = iX2 - iX;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = c10.Q(i11);
                }
                while (i10 != i11) {
                    i10 = c10.Q(i10);
                    i11 = c10.Q(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final void O(G1 g10, InterfaceC1073s1 interfaceC1073s1) {
        g10.W(g10.Z(), new C1080v(interfaceC1073s1));
        g10.J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(InterfaceC1073s1 interfaceC1073s1, int i10, Object obj) {
        if (obj instanceof InterfaceC1042i) {
            interfaceC1073s1.b((InterfaceC1042i) obj);
        }
        if (obj instanceof C1079u1) {
            interfaceC1073s1.e((C1079u1) obj);
        }
        if (obj instanceof C1029d1) {
            ((C1029d1) obj).A();
        }
        return Unit.f48228a;
    }

    private static final void Q(G1 g10, int i10, Object obj) {
        Object objH = g10.H(i10);
        if (obj == objH) {
            return;
        }
        t("Slot table is out of sync (expected " + obj + ", got " + objH + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1049k0 R(List list, int i10) {
        int iZ = z(list, i10);
        if (iZ >= 0) {
            return (C1049k0) list.remove(iZ);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(List list, int i10, int i11) {
        int iY = y(list, i10);
        while (iY < list.size() && ((C1049k0) list.get(iY)).b() < i11) {
        }
    }

    public static final void T() {
    }

    public static final void U(int i10, int i11, int i12, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C1049k0 c1049k0, C1049k0 c1049k1) {
        return Intrinsics.e(c1049k0.b(), c1049k1.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(D1 d10, C1021b c1021b) {
        ArrayList arrayList = new ArrayList();
        C1 c1C = d10.C();
        try {
            s(c1C, arrayList, d10.c(c1021b));
            Unit unit = Unit.f48228a;
            return arrayList;
        } finally {
            c1C.d();
        }
    }

    private static final void s(C1 c10, List list, int i10) {
        if (c10.K(i10)) {
            list.add(c10.M(i10));
            return;
        }
        int iF = i10 + 1;
        int iF2 = i10 + c10.F(i10);
        while (iF < iF2) {
            s(c10, list, iF);
            iF += c10.F(iF);
        }
    }

    public static final void t(@NotNull String str) {
        throw new C1048k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @NotNull
    public static final Void u(@NotNull String str) {
        throw new C1048k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void v(G1 g10, InterfaceC1073s1 interfaceC1073s1) {
        g10.W(g10.Z(), new C1074t(interfaceC1073s1, g10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(InterfaceC1073s1 interfaceC1073s1, G1 g10, int i10, Object obj) {
        if (obj instanceof InterfaceC1042i) {
            interfaceC1073s1.c((InterfaceC1042i) obj);
        } else if (obj instanceof C1079u1) {
            C1079u1 c1079u1 = (C1079u1) obj;
            if (!(c1079u1.b() instanceof InterfaceC1088x1)) {
                Q(g10, i10, obj);
                interfaceC1073s1.e(c1079u1);
            }
        } else if (obj instanceof C1029d1) {
            Q(g10, i10, obj);
            ((C1029d1) obj).A();
        }
        return Unit.f48228a;
    }

    private static final int x(C1 c10, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = c10.Q(i10);
            i12++;
        }
        return i12;
    }

    private static final int y(List list, int i10) {
        int iZ = z(list, i10);
        return iZ < 0 ? -(iZ + 1) : iZ;
    }

    private static final int z(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iE = Intrinsics.e(((C1049k0) list.get(i12)).b(), i10);
            if (iE < 0) {
                i11 = i12 + 1;
            } else {
                if (iE <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }
}
