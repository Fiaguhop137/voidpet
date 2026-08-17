package We;

import Ad.n;
import Re.AbstractC1388d0;
import Re.B0;
import Re.C1402k0;
import Re.C1419y;
import Re.D0;
import Re.F0;
import Re.I;
import Re.J0;
import Re.L0;
import Re.M0;
import Re.N0;
import Re.S;
import Re.V;
import Re.s0;
import Re.v0;
import Se.e;
import Xd.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.EnumC1792f;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1795i;
import p015ae.l0;
import p015ae.m0;
import p033be.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final S A(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        S sN = J0.n(s10);
        Intrinsics.checkNotNullExpressionValue(sN, "makeNotNullable(...)");
        return sN;
    }

    public static final S B(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        S sO = J0.o(s10);
        Intrinsics.checkNotNullExpressionValue(sO, "makeNullable(...)");
        return sO;
    }

    public static final S C(S s10, h newAnnotations) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (s10.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? s10 : s10.Q0().T0(s0.a(s10.M0(), newAnnotations));
    }

    public static final S D(S s10) {
        AbstractC1388d0 abstractC1388d0;
        M0 m0F;
        Intrinsics.checkNotNullParameter(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            I i10 = (I) m0Q0;
            AbstractC1388d0 abstractC1388d0V0 = i10.V0();
            if (!abstractC1388d0V0.N0().getParameters().isEmpty() && abstractC1388d0V0.N0().p() != null) {
                List parameters = abstractC1388d0V0.N0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                ArrayList arrayList = new ArrayList(CollectionsKt.w(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1402k0((m0) it.next()));
                }
                abstractC1388d0V0 = F0.f(abstractC1388d0V0, arrayList, null, 2, null);
            }
            AbstractC1388d0 abstractC1388d0W0 = i10.W0();
            if (!abstractC1388d0W0.N0().getParameters().isEmpty() && abstractC1388d0W0.N0().p() != null) {
                List parameters2 = abstractC1388d0W0.N0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(CollectionsKt.w(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C1402k0((m0) it2.next()));
                }
                abstractC1388d0W0 = F0.f(abstractC1388d0W0, arrayList2, null, 2, null);
            }
            m0F = V.e(abstractC1388d0V0, abstractC1388d0W0);
        } else {
            if (!(m0Q0 instanceof AbstractC1388d0)) {
                throw new n();
            }
            abstractC1388d0 = (AbstractC1388d0) m0Q0;
            if (!abstractC1388d0.N0().getParameters().isEmpty() && abstractC1388d0.N0().p() != null) {
                m0F = abstractC1388d0;
                m0F = abstractC1388d0;
                List parameters3 = abstractC1388d0.N0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                ArrayList arrayList3 = new ArrayList(CollectionsKt.w(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new C1402k0((m0) it3.next()));
                }
                m0F = F0.f(abstractC1388d0, arrayList3, null, 2, null);
            }
        }
        m0F = abstractC1388d0;
        m0F = abstractC1388d0;
        m0F = abstractC1388d0;
        return L0.b(m0F, m0Q0);
    }

    public static final boolean E(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return e(s10, c.f15079a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(M0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC1794h interfaceC1794hP = it.N0().p();
        if (interfaceC1794hP != null) {
            return (interfaceC1794hP instanceof l0) || (interfaceC1794hP instanceof m0);
        }
        return false;
    }

    public static final B0 d(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return new D0(s10);
    }

    public static final boolean e(S s10, Function1 predicate) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return J0.c(s10, predicate);
    }

    private static final boolean f(S s10, v0 v0Var, Set set) {
        boolean zF;
        if (Intrinsics.b(s10.N0(), v0Var)) {
            return true;
        }
        InterfaceC1794h interfaceC1794hP = s10.N0().p();
        InterfaceC1795i interfaceC1795i = interfaceC1794hP instanceof InterfaceC1795i ? (InterfaceC1795i) interfaceC1794hP : null;
        List listR = interfaceC1795i != null ? interfaceC1795i.r() : null;
        Iterable<IndexedValue> iterableA1 = CollectionsKt.a1(s10.L0());
        if ((iterableA1 instanceof Collection) && ((Collection) iterableA1).isEmpty()) {
            return false;
        }
        for (IndexedValue indexedValue : iterableA1) {
            int index = indexedValue.getIndex();
            B0 b10 = (B0) indexedValue.getValue();
            m0 m0Var = listR != null ? (m0) CollectionsKt.l0(listR, index) : null;
            if ((m0Var == null || set == null || !set.contains(m0Var)) && !b10.a()) {
                S type = b10.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                zF = f(type, v0Var, set);
            } else {
                zF = false;
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return e(s10, b.f15078a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(M0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC1794h interfaceC1794hP = it.N0().p();
        if (interfaceC1794hP != null) {
            return x(interfaceC1794hP);
        }
        return false;
    }

    public static final boolean i(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return J0.c(s10, a.f15077a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(M0 m10) {
        return Boolean.valueOf(J0.m(m10));
    }

    public static final B0 k(S type, N0 projectionKind, m0 m0Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((m0Var != null ? m0Var.m() : null) == projectionKind) {
            projectionKind = N0.INVARIANT;
        }
        return new D0(projectionKind, type);
    }

    public static final Set l(S s10, Set set) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(s10, s10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(S s10, S s11, Set set, Set set2) {
        InterfaceC1794h interfaceC1794hP = s10.N0().p();
        if (interfaceC1794hP instanceof m0) {
            if (!Intrinsics.b(s10.N0(), s11.N0())) {
                set.add(interfaceC1794hP);
                return;
            }
            for (S s12 : ((m0) interfaceC1794hP).getUpperBounds()) {
                Intrinsics.c(s12);
                m(s12, s11, set, set2);
            }
            return;
        }
        InterfaceC1794h interfaceC1794hP2 = s10.N0().p();
        InterfaceC1795i interfaceC1795i = interfaceC1794hP2 instanceof InterfaceC1795i ? (InterfaceC1795i) interfaceC1794hP2 : null;
        List listR = interfaceC1795i != null ? interfaceC1795i.r() : null;
        int i10 = 0;
        for (B0 b10 : s10.L0()) {
            int i11 = i10 + 1;
            m0 m0Var = listR != null ? (m0) CollectionsKt.l0(listR, i10) : null;
            if ((m0Var == null || set2 == null || !set2.contains(m0Var)) && !b10.a() && !CollectionsKt.b0(set, b10.getType().N0().p()) && !Intrinsics.b(b10.getType().N0(), s11.N0())) {
                S type = b10.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                m(type, s11, set, set2);
            }
            i10 = i11;
        }
    }

    public static final i n(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        i iVarN = s10.N0().n();
        Intrinsics.checkNotNullExpressionValue(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    public static final S o(m0 m0Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        List upperBounds = m0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = m0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1794h interfaceC1794hP = ((S) next).N0().p();
            InterfaceC1791e interfaceC1791e = interfaceC1794hP instanceof InterfaceC1791e ? (InterfaceC1791e) interfaceC1794hP : null;
            if (interfaceC1791e != null && interfaceC1791e.j() != EnumC1792f.INTERFACE && interfaceC1791e.j() != EnumC1792f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        S s10 = (S) obj;
        if (s10 != null) {
            return s10;
        }
        List upperBounds3 = m0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object objJ0 = CollectionsKt.j0(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(objJ0, "first(...)");
        return (S) objJ0;
    }

    public static final boolean p(m0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return r(typeParameter, null, null, 6, null);
    }

    public static final boolean q(m0 typeParameter, v0 v0Var, Set set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List<S> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (S s10 : upperBounds) {
            Intrinsics.c(s10);
            if (f(s10, typeParameter.q().N0(), set) && (v0Var == null || Intrinsics.b(s10.N0(), v0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(m0 m0Var, v0 v0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(m0Var, v0Var, set);
    }

    public static final boolean s(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return i.g0(s10);
    }

    public static final boolean t(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return i.o0(s10);
    }

    public static final boolean u(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        if (!(s10 instanceof C1419y)) {
            return false;
        }
        ((C1419y) s10).Z0();
        return false;
    }

    public static final boolean v(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        if (!(s10 instanceof C1419y)) {
            return false;
        }
        ((C1419y) s10).Z0();
        return false;
    }

    public static final boolean w(S s10, S superType) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return e.f11611a.b(s10, superType);
    }

    public static final boolean x(InterfaceC1794h interfaceC1794h) {
        Intrinsics.checkNotNullParameter(interfaceC1794h, "<this>");
        return (interfaceC1794h instanceof m0) && (((m0) interfaceC1794h).b() instanceof l0);
    }

    public static final boolean y(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return J0.m(s10);
    }

    public static final boolean z(S type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (type instanceof Te.i) && ((Te.i) type).X0().h();
    }
}
