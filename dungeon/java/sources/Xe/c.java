package Xe;

import Ad.n;
import Ee.e;
import Re.AbstractC1388d0;
import Re.B0;
import Re.D0;
import Re.F0;
import Re.G0;
import Re.J0;
import Re.L;
import Re.L0;
import Re.M0;
import Re.N0;
import Re.S;
import Re.V;
import Re.v0;
import Re.w0;
import Xd.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.m0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16476a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16476a = iArr;
        }
    }

    public static final class b extends w0 {
        b() {
        }

        @Override // Re.w0
        public B0 k(v0 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            Ee.b bVar = key instanceof Ee.b ? (Ee.b) key : null;
            if (bVar == null) {
                return null;
            }
            return bVar.b().a() ? new D0(N0.OUT_VARIANCE, bVar.b().getType()) : bVar.b();
        }
    }

    public static final Xe.a b(S type) {
        Object objG;
        Intrinsics.checkNotNullParameter(type, "type");
        if (L.b(type)) {
            Xe.a aVarB = b(L.c(type));
            Xe.a aVarB2 = b(L.d(type));
            return new Xe.a(L0.b(V.e(L.c((S) aVarB.c()), L.d((S) aVarB2.c())), type), L0.b(V.e(L.c((S) aVarB.d()), L.d((S) aVarB2.d())), type));
        }
        v0 v0VarN0 = type.N0();
        if (e.f(type)) {
            Intrinsics.d(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            B0 b0B = ((Ee.b) v0VarN0).b();
            S type2 = b0B.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            S sC = c(type2, type);
            int i10 = a.f16476a[b0B.b().ordinal()];
            if (i10 == 2) {
                return new Xe.a(sC, We.d.n(type).J());
            }
            if (i10 == 3) {
                AbstractC1388d0 abstractC1388d0I = We.d.n(type).I();
                Intrinsics.checkNotNullExpressionValue(abstractC1388d0I, "getNothingType(...)");
                return new Xe.a(c(abstractC1388d0I, type), sC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + b0B);
        }
        if (type.L0().isEmpty() || type.L0().size() != v0VarN0.getParameters().size()) {
            return new Xe.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = type.L0();
        List parameters = v0VarN0.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        for (Pair pair : CollectionsKt.c1(listL0, parameters)) {
            B0 b10 = (B0) pair.getFirst();
            m0 m0Var = (m0) pair.getSecond();
            Intrinsics.c(m0Var);
            d dVarI = i(b10, m0Var);
            if (b10.a()) {
                arrayList.add(dVarI);
                arrayList2.add(dVarI);
            } else {
                Xe.a aVarF = f(dVarI);
                d dVar = (d) aVarF.a();
                d dVar2 = (d) aVarF.b();
                arrayList.add(dVar);
                arrayList2.add(dVar2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((d) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = We.d.n(type).I();
            Intrinsics.checkNotNullExpressionValue(objG, "getNothingType(...)");
        } else {
            objG = g(type, arrayList);
        }
        return new Xe.a(objG, g(type, arrayList2));
    }

    private static final S c(S s10, S s11) {
        S sQ = J0.q(s10, s11.O0());
        Intrinsics.checkNotNullExpressionValue(sQ, "makeNullableIfNeeded(...)");
        return sQ;
    }

    public static final B0 d(B0 b10, boolean z10) {
        if (b10 == null) {
            return null;
        }
        if (!b10.a()) {
            S type = b10.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (J0.c(type, Xe.b.f16475a)) {
                N0 n0B = b10.b();
                Intrinsics.checkNotNullExpressionValue(n0B, "getProjectionKind(...)");
                if (n0B == N0.OUT_VARIANCE) {
                    return new D0(n0B, (S) b(type).d());
                }
                return z10 ? new D0(n0B, (S) b(type).c()) : h(b10);
            }
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(M0 m10) {
        Intrinsics.c(m10);
        return Boolean.valueOf(e.f(m10));
    }

    private static final Xe.a f(d dVar) {
        Xe.a aVarB = b(dVar.a());
        S s10 = (S) aVarB.a();
        S s11 = (S) aVarB.b();
        Xe.a aVarB2 = b(dVar.b());
        return new Xe.a(new d(dVar.c(), s11, (S) aVarB2.a()), new d(dVar.c(), s10, (S) aVarB2.b()));
    }

    private static final S g(S s10, List list) {
        s10.L0().size();
        list.size();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((d) it.next()));
        }
        return F0.e(s10, arrayList, null, null, 6, null);
    }

    private static final B0 h(B0 b10) {
        G0 g0G = G0.g(new b());
        Intrinsics.checkNotNullExpressionValue(g0G, "create(...)");
        return g0G.t(b10);
    }

    private static final d i(B0 b10, m0 m0Var) {
        int i10 = a.f16476a[G0.c(m0Var.m(), b10).ordinal()];
        if (i10 == 1) {
            S type = b10.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            S type2 = b10.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return new d(m0Var, type, type2);
        }
        if (i10 == 2) {
            S type3 = b10.getType();
            Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
            AbstractC1388d0 abstractC1388d0J = He.e.m(m0Var).J();
            Intrinsics.checkNotNullExpressionValue(abstractC1388d0J, "getNullableAnyType(...)");
            return new d(m0Var, type3, abstractC1388d0J);
        }
        if (i10 != 3) {
            throw new n();
        }
        AbstractC1388d0 abstractC1388d0I = He.e.m(m0Var).I();
        Intrinsics.checkNotNullExpressionValue(abstractC1388d0I, "getNothingType(...)");
        S type4 = b10.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        return new d(m0Var, abstractC1388d0I, type4);
    }

    private static final B0 j(d dVar) {
        dVar.d();
        if (!Intrinsics.b(dVar.a(), dVar.b())) {
            N0 n0M = dVar.c().m();
            N0 n10 = N0.IN_VARIANCE;
            if (n0M != n10) {
                if ((!i.o0(dVar.a()) || dVar.c().m() == n10) && i.q0(dVar.b())) {
                    return new D0(k(dVar, n10), dVar.a());
                }
                return new D0(k(dVar, N0.OUT_VARIANCE), dVar.b());
            }
        }
        return new D0(dVar.a());
    }

    private static final N0 k(d dVar, N0 n10) {
        return n10 == dVar.c().m() ? N0.INVARIANT : n10;
    }
}
