package I;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final void c(C1020a1 c1020a1, Function2 function2, InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(-149765515);
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(-149765515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        interfaceC1054mH.p(c1020a1);
        function2.invoke(interfaceC1054mH, Integer.valueOf((i10 >> 3) & 14));
        interfaceC1054mH.u();
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new F(c1020a1, function2, i10));
        }
    }

    public static final void d(C1020a1[] c1020a1Arr, Function2 function2, InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(415205898);
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(415205898, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        interfaceC1054mH.e(c1020a1Arr);
        function2.invoke(interfaceC1054mH, Integer.valueOf((i10 >> 3) & 14));
        interfaceC1054mH.M();
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new G(c1020a1Arr, function2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(C1020a1[] c1020a1Arr, Function2 function2, int i10, InterfaceC1054m interfaceC1054m, int i11) {
        d(c1020a1Arr, function2, interfaceC1054m, AbstractC1032e1.a(i10 | 1));
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(C1020a1 c1020a1, Function2 function2, int i10, InterfaceC1054m interfaceC1054m, int i11) {
        c(c1020a1, function2, interfaceC1054m, AbstractC1032e1.a(i10 | 1));
        return Unit.f48228a;
    }

    public static final Z0 g(S1 s10, Function0 function0) {
        return new Z(s10, function0);
    }

    public static /* synthetic */ Z0 h(S1 s10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = T1.m();
        }
        return g(s10, function0);
    }

    public static final Z0 i(Function1 function1) {
        return new O(function1);
    }

    public static final Z0 j(Function0 function0) {
        return new e2(function0);
    }
}
