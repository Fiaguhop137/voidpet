package p176je;

import He.e;
import Xd.i;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;
import p015ae.g0;
import p338se.C;
import p464ze.f;

/* JADX INFO: renamed from: je.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3875f extends U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3875f f47345o = new C3875f();

    private C3875f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(g0 g0Var, InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return U.f47297a.j().containsKey(C.d(g0Var));
    }

    public final f j(g0 functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Map mapJ = U.f47297a.j();
        String strD = C.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return (f) mapJ.get(strD);
    }

    public final boolean k(g0 functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return i.h0(functionDescriptor) && e.i(functionDescriptor, false, new C3874e(functionDescriptor), 1, null) != null;
    }

    public final boolean m(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        return Intrinsics.b(g0Var.getName().g(), "removeAt") && Intrinsics.b(C.d(g0Var), U.f47297a.h().d());
    }
}
