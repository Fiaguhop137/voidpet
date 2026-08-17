package p015ae;

import De.i;
import He.e;
import Re.S;
import Re.v0;
import Te.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 {
    public static final X d(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        InterfaceC1794h interfaceC1794hP = s10.N0().p();
        return e(s10, interfaceC1794hP instanceof InterfaceC1795i ? (InterfaceC1795i) interfaceC1794hP : null, 0);
    }

    private static final X e(S s10, InterfaceC1795i interfaceC1795i, int i10) {
        if (interfaceC1795i == null || l.m(interfaceC1795i)) {
            return null;
        }
        int size = interfaceC1795i.r().size() + i10;
        if (interfaceC1795i.D()) {
            List listSubList = s10.L0().subList(i10, size);
            InterfaceC1799m interfaceC1799mB = interfaceC1795i.b();
            return new X(interfaceC1795i, listSubList, e(s10, interfaceC1799mB instanceof InterfaceC1795i ? (InterfaceC1795i) interfaceC1799mB : null, size));
        }
        if (size != s10.L0().size()) {
            i.E(interfaceC1795i);
        }
        return new X(interfaceC1795i, s10.L0().subList(i10, s10.L0().size()), null);
    }

    private static final C1789c f(m0 m0Var, InterfaceC1799m interfaceC1799m, int i10) {
        return new C1789c(m0Var, interfaceC1799m, i10);
    }

    public static final List g(InterfaceC1795i interfaceC1795i) {
        List listL;
        Object next;
        v0 v0VarL;
        Intrinsics.checkNotNullParameter(interfaceC1795i, "<this>");
        List listR = interfaceC1795i.r();
        Intrinsics.checkNotNullExpressionValue(listR, "getDeclaredTypeParameters(...)");
        if (!interfaceC1795i.D() && !(interfaceC1795i.b() instanceof InterfaceC1787a)) {
            return listR;
        }
        List listV = k.V(k.H(k.C(k.T(e.u(interfaceC1795i), n0.f19737a), o0.f19738a), p0.f19739a));
        Iterator it = e.u(interfaceC1795i).iterator();
        do {
            listL = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC1791e));
        InterfaceC1791e interfaceC1791e = (InterfaceC1791e) next;
        if (interfaceC1791e != null && (v0VarL = interfaceC1791e.l()) != null) {
            listL = v0VarL.getParameters();
        }
        if (listL == null) {
            listL = CollectionsKt.l();
        }
        if (listV.isEmpty() && listL.isEmpty()) {
            List listR2 = interfaceC1795i.r();
            Intrinsics.checkNotNullExpressionValue(listR2, "getDeclaredTypeParameters(...)");
            return listR2;
        }
        List<m0> listC0 = CollectionsKt.C0(listV, listL);
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listC0, 10));
        for (m0 m0Var : listC0) {
            Intrinsics.c(m0Var);
            arrayList.add(f(m0Var, interfaceC1795i, listR.size()));
        }
        return CollectionsKt.C0(listR, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1799m it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof InterfaceC1787a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1799m it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it instanceof InterfaceC1798l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence j(InterfaceC1799m it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List typeParameters = ((InterfaceC1787a) it).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return CollectionsKt.Z(typeParameters);
    }
}
