package De;

import Re.v0;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p015ae.D;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1799m;
import p015ae.N;
import p015ae.h0;
import p015ae.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2412a = new g();

    private g() {
    }

    public static /* synthetic */ boolean f(g gVar, InterfaceC1787a interfaceC1787a, InterfaceC1787a interfaceC1787a2, boolean z10, boolean z11, boolean z12, Se.g gVar2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return gVar.e(interfaceC1787a, interfaceC1787a2, z10, z13, z12, gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, InterfaceC1787a interfaceC1787a, InterfaceC1787a interfaceC1787a2, v0 c10, v0 c11) {
        Intrinsics.checkNotNullParameter(c10, "c1");
        Intrinsics.checkNotNullParameter(c11, "c2");
        if (Intrinsics.b(c10, c11)) {
            return true;
        }
        InterfaceC1794h interfaceC1794hP = c10.p();
        InterfaceC1794h interfaceC1794hP2 = c11.p();
        if ((interfaceC1794hP instanceof m0) && (interfaceC1794hP2 instanceof m0)) {
            return f2412a.n((m0) interfaceC1794hP, (m0) interfaceC1794hP2, z10, new f(interfaceC1787a, interfaceC1787a2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1787a interfaceC1787a, InterfaceC1787a interfaceC1787a2, InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2) {
        return Intrinsics.b(interfaceC1799m, interfaceC1787a) && Intrinsics.b(interfaceC1799m2, interfaceC1787a2);
    }

    private final boolean j(InterfaceC1791e interfaceC1791e, InterfaceC1791e interfaceC1791e2) {
        return Intrinsics.b(interfaceC1791e.l(), interfaceC1791e2.l());
    }

    public static /* synthetic */ boolean l(g gVar, InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return gVar.k(interfaceC1799m, interfaceC1799m2, z10, z11);
    }

    public static /* synthetic */ boolean o(g gVar, m0 m0Var, m0 m0Var2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = c.f2405a;
        }
        return gVar.n(m0Var, m0Var2, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2) {
        return false;
    }

    private final boolean q(InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2, Function2 function2, boolean z10) {
        InterfaceC1799m interfaceC1799mB = interfaceC1799m.b();
        InterfaceC1799m interfaceC1799mB2 = interfaceC1799m2.b();
        return ((interfaceC1799mB instanceof InterfaceC1788b) || (interfaceC1799mB2 instanceof InterfaceC1788b)) ? ((Boolean) function2.invoke(interfaceC1799mB, interfaceC1799mB2)).booleanValue() : l(this, interfaceC1799mB, interfaceC1799mB2, z10, false, 8, null);
    }

    private final h0 r(InterfaceC1787a interfaceC1787a) {
        while (interfaceC1787a instanceof InterfaceC1788b) {
            InterfaceC1788b interfaceC1788b = (InterfaceC1788b) interfaceC1787a;
            if (interfaceC1788b.j() != InterfaceC1788b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionE = interfaceC1788b.e();
            Intrinsics.checkNotNullExpressionValue(collectionE, "getOverriddenDescriptors(...)");
            interfaceC1787a = (InterfaceC1788b) CollectionsKt.G0(collectionE);
            if (interfaceC1787a == null) {
                return null;
            }
        }
        return interfaceC1787a.k();
    }

    public final boolean e(InterfaceC1787a a10, InterfaceC1787a b10, boolean z10, boolean z11, boolean z12, Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.b(a10, b10)) {
            return true;
        }
        if (!Intrinsics.b(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof D) && (b10 instanceof D) && ((D) a10).m0() != ((D) b10).m0()) {
            return false;
        }
        if ((Intrinsics.b(a10.b(), b10.b()) && (!z10 || !Intrinsics.b(r(a10), r(b10)))) || i.E(a10) || i.E(b10) || !q(a10, b10, d.f2406a, z10)) {
            return false;
        }
        o oVarI = o.i(kotlinTypeRefiner, new e(z10, a10, b10));
        Intrinsics.checkNotNullExpressionValue(oVarI, "create(...)");
        o.i.a aVarC = oVarI.E(a10, b10, null, !z12).c();
        o.i.a aVar = o.i.a.OVERRIDABLE;
        return aVarC == aVar && oVarI.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean k(InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2, boolean z10, boolean z11) {
        if ((interfaceC1799m instanceof InterfaceC1791e) && (interfaceC1799m2 instanceof InterfaceC1791e)) {
            return j((InterfaceC1791e) interfaceC1799m, (InterfaceC1791e) interfaceC1799m2);
        }
        if ((interfaceC1799m instanceof m0) && (interfaceC1799m2 instanceof m0)) {
            return o(this, (m0) interfaceC1799m, (m0) interfaceC1799m2, z10, null, 8, null);
        }
        if ((interfaceC1799m instanceof InterfaceC1787a) && (interfaceC1799m2 instanceof InterfaceC1787a)) {
            return f(this, (InterfaceC1787a) interfaceC1799m, (InterfaceC1787a) interfaceC1799m2, z10, z11, false, Se.g.a.f11613a, 16, null);
        }
        return ((interfaceC1799m instanceof N) && (interfaceC1799m2 instanceof N)) ? Intrinsics.b(((N) interfaceC1799m).f(), ((N) interfaceC1799m2).f()) : Intrinsics.b(interfaceC1799m, interfaceC1799m2);
    }

    public final boolean m(m0 a10, m0 b10, boolean z10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return o(this, a10, b10, z10, null, 8, null);
    }

    public final boolean n(m0 a10, m0 b10, boolean z10, Function2 equivalentCallables) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.b(a10, b10)) {
            return true;
        }
        return !Intrinsics.b(a10.b(), b10.b()) && q(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
