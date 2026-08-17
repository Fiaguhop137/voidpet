package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {
    public static final InterfaceC1417w a(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Ve.i iVarQ0 = s10.Q0();
        InterfaceC1417w interfaceC1417w = iVarQ0 instanceof InterfaceC1417w ? (InterfaceC1417w) iVarQ0 : null;
        if (interfaceC1417w == null || !interfaceC1417w.E0()) {
            return null;
        }
        return interfaceC1417w;
    }

    public static final boolean b(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Ve.i iVarQ0 = s10.Q0();
        InterfaceC1417w interfaceC1417w = iVarQ0 instanceof InterfaceC1417w ? (InterfaceC1417w) iVarQ0 : null;
        if (interfaceC1417w != null) {
            return interfaceC1417w.E0();
        }
        return false;
    }
}
