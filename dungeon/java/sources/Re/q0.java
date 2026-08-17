package Re;

import p015ae.InterfaceC1799m;

/* JADX INFO: loaded from: classes3.dex */
public interface q0 {

    public static final class a {
        public static /* synthetic */ r0 a(q0 q0Var, p033be.h hVar, v0 v0Var, InterfaceC1799m interfaceC1799m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                v0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC1799m = null;
            }
            return q0Var.a(hVar, v0Var, interfaceC1799m);
        }
    }

    r0 a(p033be.h hVar, v0 v0Var, InterfaceC1799m interfaceC1799m);
}
