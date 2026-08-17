package p176je;

import He.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1811z;
import p338se.C;
import p464ze.f;

/* JADX INFO: renamed from: je.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3878i extends U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3878i f47348o = new C3878i();

    private C3878i() {
    }

    private final boolean k(InterfaceC1788b interfaceC1788b) {
        return CollectionsKt.b0(U.f47297a.e(), C.d(interfaceC1788b));
    }

    public static final InterfaceC1811z l(InterfaceC1811z functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        C3878i c3878i = f47348o;
        f name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (c3878i.n(name)) {
            return (InterfaceC1811z) e.i(functionDescriptor, false, C3876g.f47346a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f47348o.k(it);
    }

    public static final U.b o(InterfaceC1788b interfaceC1788b) {
        InterfaceC1788b interfaceC1788bI;
        String strD;
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        U.a aVar = U.f47297a;
        if (!aVar.d().contains(interfaceC1788b.getName()) || (interfaceC1788bI = e.i(interfaceC1788b, false, C3877h.f47347a, 1, null)) == null || (strD = C.d(interfaceC1788bI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (it instanceof InterfaceC1811z) && f47348o.k(it);
    }

    public final boolean n(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return U.f47297a.d().contains(fVar);
    }
}
