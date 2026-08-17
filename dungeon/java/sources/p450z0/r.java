package p450z0;

import V.k;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.o;
import p019b0.e;
import p019b0.g;
import p288q0.m;
import p288q0.n;
import p288q0.q;
import p324s0.AbstractC4133d0;
import p324s0.AbstractC4137f0;
import p324s0.AbstractC4146k;
import p324s0.AbstractC4148m;
import p324s0.C4129b0;
import p324s0.I;
import p324s0.y0;
import p324s0.z0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.c f58297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f58299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SemanticsConfiguration f58300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f58301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f58302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f58303g;

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4368g f58304a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4368g c4368g) {
            super(1);
            this.f58304a = c4368g;
        }

        public final void a(B b10) {
            z.q(b10, this.f58304a.p());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B) obj);
            return Unit.f48228a;
        }
    }

    static final class b extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f58305a = str;
        }

        public final void a(B b10) {
            z.m(b10, this.f58305a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B) obj);
            return Unit.f48228a;
        }
    }

    public static final class c extends k.c implements y0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f58306o;

        c(Function1 function1) {
            this.f58306o = function1;
        }

        @Override // p324s0.y0
        public void m0(B b10) {
            this.f58306o.invoke(b10);
        }
    }

    public r(k.c cVar, boolean z10, I i10, SemanticsConfiguration semanticsConfiguration) {
        this.f58297a = cVar;
        this.f58298b = z10;
        this.f58299c = i10;
        this.f58300d = semanticsConfiguration;
        this.f58303g = i10.y();
    }

    private final boolean A() {
        return this.f58298b && this.f58300d.t();
    }

    private final void D(List list, SemanticsConfiguration semanticsConfiguration) {
        if (this.f58300d.s()) {
            return;
        }
        F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            r rVar = (r) list.get(size2);
            if (!rVar.A()) {
                semanticsConfiguration.v(rVar.f58300d);
                rVar.D(list, semanticsConfiguration);
            }
        }
    }

    public static /* synthetic */ List F(r rVar, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return rVar.E(list, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final g a(m mVar) {
        ?? H10;
        r rVarT = t();
        if (rVarT == null) {
            return g.f25810e.a();
        }
        C4129b0 c4129b0S0 = rVarT.f58299c.s0();
        int iA = AbstractC4137f0.a(8);
        if ((c4129b0S0.i() & iA) == 0) {
            H10 = 0;
            break;
        }
        k.c cVarK = c4129b0S0.k();
        loop0: while (true) {
            if (cVarK != null) {
                if ((cVarK.y1() & iA) != 0) {
                    H10 = cVarK;
                    ?? cVar = 0;
                    while (H10 != 0) {
                        if (H10 instanceof y0) {
                            if (((y0) H10).K()) {
                                break loop0;
                            }
                        } else if ((H10.y1() & iA) != 0 && (H10 instanceof AbstractC4148m)) {
                            k.c cVarX1 = ((AbstractC4148m) H10).X1();
                            int i10 = 0;
                            H10 = H10;
                            cVar = cVar;
                            while (cVarX1 != null) {
                                if ((cVarX1.y1() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVar = cVar;
                                        H10 = cVarX1;
                                    } else {
                                        if (cVar == 0) {
                                            cVar = new K.c(new k.c[16], 0);
                                        }
                                        if (H10 != 0) {
                                            cVar.b(H10);
                                            H10 = 0;
                                        }
                                        cVar.b(cVarX1);
                                    }
                                }
                                cVarX1 = cVarX1.u1();
                                H10 = H10;
                                cVar = cVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        H10 = AbstractC4146k.h(cVar);
                    }
                }
                if ((cVarK.t1() & iA) != 0) {
                    cVarK = cVarK.u1();
                }
            }
            H10 = 0;
            break;
        }
        y0 y0Var = (y0) H10;
        AbstractC4133d0 abstractC4133d0I = y0Var != null ? AbstractC4146k.i(y0Var, AbstractC4137f0.a(8)) : null;
        return abstractC4133d0I == null ? rVarT.a(mVar) : m.X(abstractC4133d0I, mVar, false, 2, null);
    }

    private final void c(List list) {
        C4368g c4368gF = s.f(this);
        if (c4368gF != null && this.f58300d.t() && !list.isEmpty()) {
            list.add(d(c4368gF, new a(c4368gF)));
        }
        SemanticsConfiguration semanticsConfiguration = this.f58300d;
        w wVar = w.f58331a;
        if (semanticsConfiguration.e(wVar.d()) && !list.isEmpty() && this.f58300d.t()) {
            List list2 = (List) l.a(this.f58300d, wVar.d());
            String str = list2 != null ? (String) CollectionsKt.firstOrNull(list2) : null;
            if (str != null) {
                list.add(0, d(null, new b(str)));
            }
        }
    }

    private final r d(C4368g c4368g, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.x(false);
        semanticsConfiguration.w(false);
        function1.invoke(semanticsConfiguration);
        r rVar = new r(new c(function1), false, new I(true, c4368g != null ? s.g(this) : s.e(this)), semanticsConfiguration);
        rVar.f58301e = true;
        rVar.f58302f = this;
        return rVar;
    }

    private final void e(I i10, List list, boolean z10) {
        K.c cVarH0 = i10.H0();
        Object[] objArr = cVarH0.f5867a;
        int iL = cVarH0.l();
        for (int i11 = 0; i11 < iL; i11++) {
            I i12 = (I) objArr[i11];
            if (i12.e() && (z10 || !i12.z())) {
                if (i12.s0().q(AbstractC4137f0.a(8))) {
                    list.add(s.a(i12, this.f58298b));
                } else {
                    e(i12, list, z10);
                }
            }
        }
    }

    private final List g(List list, List list2) {
        F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            r rVar = (r) list.get(size2);
            if (rVar.A()) {
                list2.add(rVar);
            } else if (!rVar.f58300d.s()) {
                rVar.g(list, list2);
            }
        }
        return list2;
    }

    static /* synthetic */ List h(r rVar, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = new ArrayList();
        }
        return rVar.g(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [K.c] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [K.c] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    private final y0 i() {
        ?? H10;
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        if (!this.f58300d.t()) {
            C4129b0 c4129b0S0 = this.f58299c.s0();
            int iA = AbstractC4137f0.a(8);
            if ((c4129b0S0.i() & iA) != 0) {
                loop3: for (k.c cVarK = c4129b0S0.k(); cVarK != null; cVarK = cVarK.u1()) {
                    if ((cVarK.y1() & iA) != 0) {
                        H10 = cVarK;
                        ?? cVar = 0;
                        while (true) {
                            if (H10 != 0) {
                                if (H10 instanceof y0) {
                                    if (((y0) H10).K()) {
                                        r10 = H10;
                                    }
                                } else if ((H10.y1() & iA) != 0 && (H10 instanceof AbstractC4148m)) {
                                    k.c cVarX1 = ((AbstractC4148m) H10).X1();
                                    int i10 = 0;
                                    while (cVarX1 != null) {
                                        if ((cVarX1.y1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                H10 = H10;
                                                cVar = cVar;
                                                cVar = cVar;
                                                H10 = cVarX1;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new K.c(new k.c[16], 0);
                                                }
                                                if (H10 != 0) {
                                                    cVar.b(H10);
                                                    H10 = 0;
                                                }
                                                cVar.b(cVarX1);
                                            }
                                        } else {
                                            H10 = H10;
                                            cVar = cVar;
                                        }
                                        cVarX1 = cVarX1.u1();
                                        H10 = H10;
                                        cVar = cVar;
                                    }
                                    if (i10 == 1) {
                                        H10 = H10;
                                        cVar = cVar;
                                    } else {
                                        H10 = H10;
                                        cVar = cVar;
                                    }
                                }
                                H10 = AbstractC4146k.h(cVar);
                            }
                        }
                    }
                    if ((cVarK.t1() & iA) == 0) {
                        break;
                    }
                }
            }
        } else {
            C4129b0 c4129b0S1 = this.f58299c.s0();
            int iA2 = AbstractC4137f0.a(8);
            if ((c4129b0S1.i() & iA2) != 0) {
                k.c cVarK2 = c4129b0S1.k();
                H10 = 0;
                while (cVarK2 != null) {
                    if ((cVarK2.y1() & iA2) != 0) {
                        ?? H11 = cVarK2;
                        ?? cVar2 = 0;
                        while (H11 != 0) {
                            if (H11 instanceof y0) {
                                y0 y0Var = (y0) H11;
                                if (y0Var.K()) {
                                    if (y0Var.p1()) {
                                        return y0Var;
                                    }
                                    if (H10 == 0) {
                                        H10 = y0Var;
                                    }
                                }
                            } else if ((H11.y1() & iA2) != 0 && (H11 instanceof AbstractC4148m)) {
                                k.c cVarX2 = ((AbstractC4148m) H11).X1();
                                int i11 = 0;
                                while (cVarX2 != null) {
                                    if ((cVarX2.y1() & iA2) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            H11 = H11;
                                            cVar2 = cVar2;
                                            cVar2 = cVar2;
                                            H11 = cVarX2;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new K.c(new k.c[16], 0);
                                            }
                                            if (H11 != 0) {
                                                cVar2.b(H11);
                                                H11 = 0;
                                            }
                                            cVar2.b(cVarX2);
                                        }
                                    } else {
                                        H11 = H11;
                                        cVar2 = cVar2;
                                    }
                                    cVarX2 = cVarX2.u1();
                                    H11 = H11;
                                    cVar2 = cVar2;
                                }
                                if (i11 == 1) {
                                    H11 = H11;
                                    cVar2 = cVar2;
                                } else {
                                    H11 = H11;
                                    cVar2 = cVar2;
                                }
                            }
                            H11 = AbstractC4146k.h(cVar2);
                        }
                    }
                    if ((cVarK2.t1() & iA2) == 0) {
                        break;
                    }
                    cVarK2 = cVarK2.u1();
                    H10 = H10;
                }
                r10 = H10;
            }
        }
        return (y0) r10;
    }

    public static /* synthetic */ List o(r rVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !rVar.f58298b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return rVar.n(z10, z11, z12);
    }

    public final boolean B() {
        AbstractC4133d0 abstractC4133d0F = f();
        if (abstractC4133d0F != null) {
            return abstractC4133d0F.J2();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean C() {
        if (this.f58301e || !v().isEmpty()) {
            return false;
        }
        I iZ0 = this.f58299c.z0();
        while (iZ0 != null) {
            SemanticsConfiguration semanticsConfigurationB = iZ0.b();
            if (semanticsConfigurationB != null && semanticsConfigurationB.t()) {
                if (iZ0 == null) {
                    return true;
                }
                return false;
            }
            iZ0 = iZ0.z0();
        }
        iZ0 = null;
        if (iZ0 == null) {
            return true;
        }
        return false;
    }

    public final List E(List list, boolean z10, boolean z11) {
        if (this.f58301e) {
            return CollectionsKt.l();
        }
        e(this.f58299c, list, z11);
        if (z10) {
            c(list);
        }
        return list;
    }

    public final r b() {
        return new r(this.f58297a, true, this.f58299c, this.f58300d);
    }

    public final AbstractC4133d0 f() {
        AbstractC4133d0 abstractC4133d0I;
        if (!this.f58301e) {
            y0 y0VarI = i();
            return (y0VarI == null || (abstractC4133d0I = AbstractC4146k.i(y0VarI, AbstractC4137f0.a(8))) == null) ? this.f58299c.W() : abstractC4133d0I;
        }
        r rVarT = t();
        if (rVarT != null) {
            return rVarT.f();
        }
        return null;
    }

    public final g j() {
        m mVarX;
        AbstractC4133d0 abstractC4133d0F = f();
        if (abstractC4133d0F != null) {
            if (!abstractC4133d0F.e()) {
                abstractC4133d0F = null;
            }
            if (abstractC4133d0F != null && (mVarX = abstractC4133d0F.x()) != null) {
                return a(mVarX);
            }
        }
        return g.f25810e.a();
    }

    public final g k() {
        g gVarB;
        AbstractC4133d0 abstractC4133d0F = f();
        if (abstractC4133d0F != null) {
            if (!abstractC4133d0F.e()) {
                abstractC4133d0F = null;
            }
            if (abstractC4133d0F != null && (gVarB = n.b(abstractC4133d0F)) != null) {
                return gVarB;
            }
        }
        return g.f25810e.a();
    }

    public final g l() {
        g gVarC;
        AbstractC4133d0 abstractC4133d0F = f();
        if (abstractC4133d0F != null) {
            if (!abstractC4133d0F.e()) {
                abstractC4133d0F = null;
            }
            if (abstractC4133d0F != null && (gVarC = n.c(abstractC4133d0F)) != null) {
                return gVarC;
            }
        }
        return g.f25810e.a();
    }

    public final List m() {
        return o(this, false, false, false, 7, null);
    }

    public final List n(boolean z10, boolean z11, boolean z12) {
        if (!z10 && this.f58300d.s()) {
            return CollectionsKt.l();
        }
        ArrayList arrayList = new ArrayList();
        return A() ? h(this, arrayList, null, 2, null) : E(arrayList, z11, z12);
    }

    public final SemanticsConfiguration p() {
        if (!A()) {
            return this.f58300d;
        }
        SemanticsConfiguration semanticsConfigurationH = this.f58300d.h();
        D(new ArrayList(), semanticsConfigurationH);
        return semanticsConfigurationH;
    }

    public final int q() {
        return this.f58303g;
    }

    public final q r() {
        return this.f58299c;
    }

    public final I s() {
        return this.f58299c;
    }

    public final r t() {
        I iZ0;
        r rVar = this.f58302f;
        if (rVar != null) {
            return rVar;
        }
        if (!this.f58298b) {
            iZ0 = null;
            break;
        }
        iZ0 = this.f58299c.z0();
        while (true) {
            if (iZ0 != null) {
                SemanticsConfiguration semanticsConfigurationB = iZ0.b();
                if (semanticsConfigurationB != null && semanticsConfigurationB.t()) {
                    break;
                }
                iZ0 = iZ0.z0();
            } else {
                iZ0 = null;
                break;
            }
        }
        if (iZ0 == null) {
            iZ0 = this.f58299c.z0();
            while (iZ0 != null) {
                if (!iZ0.s0().q(AbstractC4137f0.a(8))) {
                    iZ0 = iZ0.z0();
                }
            }
            iZ0 = null;
        }
        if (iZ0 == null) {
            return null;
        }
        return s.a(iZ0, this.f58298b);
    }

    public final long u() {
        AbstractC4133d0 abstractC4133d0F = f();
        if (abstractC4133d0F != null) {
            if (!abstractC4133d0F.e()) {
                abstractC4133d0F = null;
            }
            if (abstractC4133d0F != null) {
                return n.e(abstractC4133d0F);
            }
        }
        return e.f25805b.c();
    }

    public final List v() {
        return o(this, false, true, false, 4, null);
    }

    public final long w() {
        AbstractC4133d0 abstractC4133d0F = f();
        return abstractC4133d0F != null ? abstractC4133d0F.g() : O0.r.f8289b.a();
    }

    public final g x() {
        y0 y0VarI = i();
        return y0VarI == null ? this.f58299c.W().k3() : z0.c(y0VarI.k0(), z0.a(this.f58300d));
    }

    public final SemanticsConfiguration y() {
        return this.f58300d;
    }

    public final boolean z() {
        return this.f58301e;
    }
}
