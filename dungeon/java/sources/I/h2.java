package I;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public static InterfaceC1054m a(InterfaceC1054m interfaceC1054m) {
        return interfaceC1054m;
    }

    public static final void b(InterfaceC1054m interfaceC1054m, Object obj, Function2 function2) {
        if (interfaceC1054m.f() || !Intrinsics.b(interfaceC1054m.D(), obj)) {
            interfaceC1054m.t(obj);
            interfaceC1054m.m(obj, function2);
        }
    }
}
