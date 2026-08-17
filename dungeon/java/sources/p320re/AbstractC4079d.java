package p320re;

import Ve.i;
import Ve.m;
import Ve.p;
import Ve.q;
import Ve.r;
import Ve.v;
import Zd.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p176je.AbstractC3871b;
import p176je.E;
import p176je.EnumC3872c;
import p176je.w;
import p464ze.d;

/* JADX INFO: renamed from: re.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4079d {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: re.d$a */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f52513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E f52514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q f52515c;

        public a(i iVar, E e10, q qVar) {
            this.f52513a = iVar;
            this.f52514b = e10;
            this.f52515c = qVar;
        }

        public final E a() {
            return this.f52514b;
        }

        public final i b() {
            return this.f52513a;
        }

        public final q c() {
            return this.f52515c;
        }
    }

    private final C4087l G(C4087l c4087l, C4087l c4087l2) {
        if (c4087l == null) {
            return c4087l2;
        }
        return (c4087l2 != null && ((c4087l.d() && !c4087l2.d()) || ((c4087l.d() || !c4087l2.d()) && (c4087l.c().compareTo(c4087l2.c()) < 0 || c4087l.c().compareTo(c4087l2.c()) <= 0)))) ? c4087l2 : c4087l;
    }

    private final List H(i iVar) {
        return j(new a(iVar, f(iVar, r()), null), new C4078c(this, A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(AbstractC4079d abstractC4079d, r rVar, a it) {
        i iVarB;
        p pVarY0;
        List listR;
        i iVarB2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((abstractC4079d.z() && (iVarB2 = it.b()) != null && rVar.b0(iVarB2)) || (iVarB = it.b()) == null || (pVarY0 = rVar.y0(iVarB)) == null || (listR = rVar.r(pVarY0)) == null) {
            return null;
        }
        List listX0 = rVar.x0(it.b());
        Iterator it2 = listR.iterator();
        Iterator it3 = listX0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.w(listR, 10), CollectionsKt.w(listX0, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            q qVar = (q) it2.next();
            i iVarL = rVar.L((m) it3.next());
            arrayList.add(iVarL == null ? new a(null, it.a(), qVar) : new a(iVarL, abstractC4079d.f(iVarL, it.a()), qVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4083h e(r0 r0Var, C4083h[] c4083hArr, int i10) {
        Map mapB;
        C4083h c4083h;
        if (r0Var == null || (mapB = r0Var.b()) == null || (c4083h = (C4083h) mapB.get(Integer.valueOf(i10))) == null) {
            return (i10 < 0 || i10 >= c4083hArr.length) ? C4083h.f52534e.a() : c4083hArr[i10];
        }
        return c4083h;
    }

    private final E f(i iVar, E e10) {
        return m().d(e10, n(iVar));
    }

    private final C4083h g(i iVar) {
        EnumC4086k enumC4086kY;
        EnumC4086k enumC4086kY2 = y(iVar);
        EnumC4084i enumC4084i = null;
        if (enumC4086kY2 == null) {
            i iVarV = v(iVar);
            enumC4086kY = iVarV != null ? y(iVarV) : null;
        } else {
            enumC4086kY = enumC4086kY2;
        }
        r rVarA = A();
        c cVar = c.f18938a;
        if (cVar.l(x(rVarA.j0(iVar)))) {
            enumC4084i = EnumC4084i.READ_ONLY;
        } else if (cVar.k(x(rVarA.A(iVar)))) {
            enumC4084i = EnumC4084i.MUTABLE;
        }
        return new C4083h(enumC4086kY, enumC4084i, A().A0(iVar) || F(iVar), enumC4086kY != enumC4086kY2);
    }

    private final C4083h h(a aVar) {
        Iterable iterableL;
        C4087l c4087lO;
        i iVarB;
        p pVarY0;
        if (aVar.b() == null) {
            r rVarA = A();
            q qVarC = aVar.c();
            if ((qVarC != null ? rVarA.s(qVarC) : null) == v.IN) {
                return C4083h.f52534e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        i iVarB2 = aVar.b();
        if (iVarB2 == null || (iterableL = n(iVarB2)) == null) {
            iterableL = CollectionsKt.l();
        }
        r rVarA2 = A();
        i iVarB3 = aVar.b();
        q qVarG = (iVarB3 == null || (pVarY0 = rVarA2.y0(iVarB3)) == null) ? null : rVarA2.G(pVarY0);
        boolean z12 = q() == EnumC3872c.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !u() || (iVarB = aVar.b()) == null || !B(iVarB)) {
                iterableL = CollectionsKt.A0(p(), iterableL);
            } else {
                Iterable iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableP) {
                    if (!m().p(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableL = CollectionsKt.C0(arrayList, iterableL);
            }
        }
        EnumC4084i enumC4084iG = m().g(iterableL);
        C4087l c4087lH = m().h(iterableL, new C4076a(this, aVar));
        if (c4087lH != null) {
            EnumC4086k enumC4086kC = c4087lH.c();
            if (c4087lH.c() == EnumC4086k.NOT_NULL && qVarG != null) {
                z10 = true;
            }
            return new C4083h(enumC4086kC, enumC4084iG, z10, c4087lH.d());
        }
        EnumC3872c enumC3872cQ = (z11 || z12) ? q() : EnumC3872c.TYPE_USE;
        E eA = aVar.a();
        w wVarA = eA != null ? eA.a(enumC3872cQ) : null;
        C4087l c4087lO2 = qVarG != null ? o(qVarG) : null;
        C4087l c4087lT = t(c4087lO2, wVarA);
        boolean z13 = (c4087lO2 != null ? c4087lO2.c() : null) == EnumC4086k.NOT_NULL || !(qVarG == null || wVarA == null || !wVarA.c());
        q qVarC2 = aVar.c();
        if (qVarC2 == null || (c4087lO = o(qVarC2)) == null) {
            c4087lO = null;
        } else if (c4087lO.c() == EnumC4086k.NULLABLE) {
            c4087lO = C4087l.b(c4087lO, EnumC4086k.FORCE_FLEXIBILITY, false, 2, null);
        }
        C4087l c4087lG = G(c4087lO, c4087lT);
        EnumC4086k enumC4086kC2 = c4087lG != null ? c4087lG.c() : null;
        if (c4087lG != null && c4087lG.d()) {
            z10 = true;
        }
        return new C4083h(enumC4086kC2, enumC4084iG, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractC4079d abstractC4079d, a aVar, Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return abstractC4079d.l(extractNullability, aVar.b());
    }

    private final List j(Object obj, Function1 function1) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, function1);
        return arrayList;
    }

    private final void k(Object obj, List list, Function1 function1) {
        list.add(obj);
        Iterable iterable = (Iterable) function1.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k(it.next(), list, function1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:1: B:30:0x005e->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:3: B:45:0x009c->B:70:?, LOOP_END, SYNTHETIC] */
    private final C4087l o(q qVar) {
        List arrayList;
        Iterator it;
        EnumC4086k enumC4086k;
        boolean z10;
        Iterator it2;
        Iterator it3;
        i iVarV;
        r rVarA = A();
        C4087l c4087l = null;
        if (!E(qVar)) {
            return null;
        }
        List listK = rVarA.k(qVar);
        if (listK == null || !listK.isEmpty()) {
            Iterator it4 = listK.iterator();
            while (it4.hasNext()) {
                if (!rVarA.O((i) it4.next())) {
                    if (listK != null && listK.isEmpty()) {
                        if (listK != null) {
                            it2 = listK.iterator();
                            while (it2.hasNext()) {
                                if (v((i) it2.next()) != null) {
                                    arrayList = new ArrayList();
                                    it3 = listK.iterator();
                                    while (it3.hasNext()) {
                                        iVarV = v((i) it3.next());
                                        if (iVarV != null) {
                                            arrayList.add(iVarV);
                                        }
                                    }
                                    if (arrayList != null) {
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                enumC4086k = EnumC4086k.NULLABLE;
                                                break;
                                            }
                                            if (!rVarA.x((i) it.next())) {
                                                enumC4086k = EnumC4086k.NOT_NULL;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                enumC4086k = EnumC4086k.NULLABLE;
                                                break;
                                            }
                                            if (!rVarA.x((i) it.next())) {
                                                enumC4086k = EnumC4086k.NOT_NULL;
                                                break;
                                            }
                                        }
                                    }
                                    if (arrayList != listK) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    c4087l = new C4087l(enumC4086k, z10);
                                    break;
                                }
                            }
                            break;
                            break;
                        }
                        it2 = listK.iterator();
                        while (it2.hasNext()) {
                            if (v((i) it2.next()) != null) {
                                arrayList = new ArrayList();
                                it3 = listK.iterator();
                                while (it3.hasNext()) {
                                    iVarV = v((i) it3.next());
                                    if (iVarV != null) {
                                        arrayList.add(iVarV);
                                    }
                                }
                                if (arrayList != null) {
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            enumC4086k = EnumC4086k.NULLABLE;
                                            break;
                                        }
                                        if (!rVarA.x((i) it.next())) {
                                            enumC4086k = EnumC4086k.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            enumC4086k = EnumC4086k.NULLABLE;
                                            break;
                                        }
                                        if (!rVarA.x((i) it.next())) {
                                            enumC4086k = EnumC4086k.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != listK) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c4087l = new C4087l(enumC4086k, z10);
                                break;
                            }
                        }
                        break;
                        break;
                    }
                    Iterator it5 = listK.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            if (listK != null && listK.isEmpty()) {
                                break;
                            }
                            it2 = listK.iterator();
                            while (it2.hasNext()) {
                                if (v((i) it2.next()) != null) {
                                    arrayList = new ArrayList();
                                    it3 = listK.iterator();
                                    while (it3.hasNext()) {
                                        iVarV = v((i) it3.next());
                                        if (iVarV != null) {
                                            arrayList.add(iVarV);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        if (y((i) it5.next()) != null) {
                            arrayList = listK;
                        }
                        if (arrayList != null || !arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    enumC4086k = EnumC4086k.NULLABLE;
                                    break;
                                }
                                if (!rVarA.x((i) it.next())) {
                                    enumC4086k = EnumC4086k.NOT_NULL;
                                    break;
                                }
                            }
                        } else {
                            enumC4086k = EnumC4086k.NULLABLE;
                            break;
                        }
                        if (arrayList != listK) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c4087l = new C4087l(enumC4086k, z10);
                        break;
                    }
                }
            }
        }
        return c4087l;
    }

    private final EnumC4086k y(i iVar) {
        r rVarA = A();
        if (rVarA.w0(rVarA.j0(iVar))) {
            return EnumC4086k.NULLABLE;
        }
        if (rVarA.w0(rVarA.A(iVar))) {
            return null;
        }
        return EnumC4086k.NOT_NULL;
    }

    public abstract r A();

    public abstract boolean B(i iVar);

    public abstract boolean C();

    public abstract boolean D(i iVar, i iVar2);

    public abstract boolean E(q qVar);

    public abstract boolean F(i iVar);

    public final Function1 d(i iVar, Iterable overrides, r0 r0Var, boolean z10) {
        int size;
        i iVarB;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List listH = H(iVar);
        ArrayList arrayList = new ArrayList(CollectionsKt.w(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(H((i) it.next()));
        }
        if (w()) {
            size = 1;
        } else {
            if (C() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!D(iVar, (i) it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listH.size();
        }
        C4083h[] c4083hArr = new C4083h[size];
        int i10 = 0;
        while (i10 < size) {
            C4083h c4083hH = h((a) listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) CollectionsKt.l0((List) it3.next(), i10);
                C4083h c4083hG = (aVar == null || (iVarB = aVar.b()) == null) ? null : g(iVarB);
                if (c4083hG != null) {
                    arrayList2.add(c4083hG);
                }
            }
            c4083hArr[i10] = t0.a(c4083hH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new C4077b(r0Var, c4083hArr);
    }

    public abstract boolean l(Object obj, i iVar);

    public abstract AbstractC3871b m();

    public abstract Iterable n(i iVar);

    public abstract Iterable p();

    public abstract EnumC3872c q();

    public abstract E r();

    public abstract boolean s();

    protected abstract C4087l t(C4087l c4087l, w wVar);

    public abstract boolean u();

    public abstract i v(i iVar);

    public boolean w() {
        return false;
    }

    public abstract d x(i iVar);

    public abstract boolean z();
}
