package p015ae;

import Re.E;
import Re.S;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.W;
import p069de.Q;

/* JADX INFO: renamed from: ae.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1805t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1806u f19741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1806u f19742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1806u f19743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1806u f19744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1806u f19745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1806u f19746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC1806u f19747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1806u f19748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1806u f19749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f19750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f19751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1806u f19752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Le.g f19753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Le.g f19754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Le.g f19755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Ye.l f19756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map f19757q;

    /* JADX INFO: renamed from: ae.t$a */
    static class a implements Le.g {
        a() {
        }

        @Override // Le.g
        public S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: ae.t$b */
    static class b implements Le.g {
        b() {
        }

        @Override // Le.g
        public S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: ae.t$c */
    static class c implements Le.g {
        c() {
        }

        @Override // Le.g
        public S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: ae.t$d */
    static class d extends r {
        d(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC1799m interfaceC1799m) {
            if (interfaceC1799m == null) {
                g(0);
            }
            return De.i.j(interfaceC1799m) != i0.f19734a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == 0) {
                g(1);
            }
            if (interfaceC1799m == null) {
                g(2);
            }
            if (De.i.J(interfaceC1803q) && h(interfaceC1799m)) {
                return AbstractC1805t.f(interfaceC1803q, interfaceC1799m);
            }
            if (interfaceC1803q instanceof InterfaceC1798l) {
                InterfaceC1795i interfaceC1795iB = ((InterfaceC1798l) interfaceC1803q).b();
                if (z10 && De.i.G(interfaceC1795iB) && De.i.J(interfaceC1795iB) && (interfaceC1799m instanceof InterfaceC1798l) && De.i.J(interfaceC1799m.b()) && AbstractC1805t.f(interfaceC1803q, interfaceC1799m)) {
                    return true;
                }
            }
            while (interfaceC1803q != 0) {
                interfaceC1803q = interfaceC1803q.b();
                if (((interfaceC1803q instanceof InterfaceC1791e) && !De.i.x(interfaceC1803q)) || (interfaceC1803q instanceof N)) {
                    break;
                }
            }
            if (interfaceC1803q == 0) {
                return false;
            }
            while (interfaceC1799m != null) {
                if (interfaceC1803q == interfaceC1799m) {
                    return true;
                }
                if (interfaceC1799m instanceof N) {
                    return (interfaceC1803q instanceof N) && ((N) interfaceC1803q).f().equals(((N) interfaceC1799m).f()) && De.i.b(interfaceC1799m, interfaceC1803q);
                }
                interfaceC1799m = interfaceC1799m.b();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ae.t$e */
    static class e extends r {
        e(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            InterfaceC1799m interfaceC1799mQ;
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            if (AbstractC1805t.f19741a.e(gVar, interfaceC1803q, interfaceC1799m, z10)) {
                if (gVar == AbstractC1805t.f19754n) {
                    return true;
                }
                if (gVar != AbstractC1805t.f19753m && (interfaceC1799mQ = De.i.q(interfaceC1803q, InterfaceC1791e.class)) != null && (gVar instanceof Le.h)) {
                    return ((Le.h) gVar).u().a().equals(interfaceC1799mQ.a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ae.t$f */
    static class f extends r {
        f(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1791e interfaceC1791e) {
            if (interfaceC1803q == null) {
                g(2);
            }
            if (interfaceC1791e == null) {
                g(3);
            }
            if (gVar == AbstractC1805t.f19755o) {
                return false;
            }
            if (!(interfaceC1803q instanceof InterfaceC1788b) || (interfaceC1803q instanceof InterfaceC1798l) || gVar == AbstractC1805t.f19754n) {
                return true;
            }
            if (gVar == AbstractC1805t.f19753m || gVar == null) {
                return false;
            }
            S type = gVar.getType();
            return De.i.I(type, interfaceC1791e) || E.a(type);
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            InterfaceC1791e interfaceC1791e;
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            InterfaceC1791e interfaceC1791e2 = (InterfaceC1791e) De.i.q(interfaceC1803q, InterfaceC1791e.class);
            InterfaceC1791e interfaceC1791e3 = (InterfaceC1791e) De.i.r(interfaceC1799m, InterfaceC1791e.class, false);
            if (interfaceC1791e3 == null) {
                return false;
            }
            if (interfaceC1791e2 != null && De.i.x(interfaceC1791e2) && (interfaceC1791e = (InterfaceC1791e) De.i.q(interfaceC1791e2, InterfaceC1791e.class)) != null && De.i.H(interfaceC1791e3, interfaceC1791e)) {
                return true;
            }
            InterfaceC1803q interfaceC1803qM = De.i.M(interfaceC1803q);
            InterfaceC1791e interfaceC1791e4 = (InterfaceC1791e) De.i.q(interfaceC1803qM, InterfaceC1791e.class);
            if (interfaceC1791e4 == null) {
                return false;
            }
            if (De.i.H(interfaceC1791e3, interfaceC1791e4) && h(gVar, interfaceC1803qM, interfaceC1791e3)) {
                return true;
            }
            return e(gVar, interfaceC1803q, interfaceC1791e3.b(), z10);
        }
    }

    /* JADX INFO: renamed from: ae.t$g */
    static class g extends r {
        g(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            if (De.i.g(interfaceC1799m).x(De.i.g(interfaceC1803q))) {
                return AbstractC1805t.f19756p.a(interfaceC1803q, interfaceC1799m);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ae.t$h */
    static class h extends r {
        h(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ae.t$i */
    static class i extends r {
        i(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: ae.t$j */
    static class j extends r {
        j(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: ae.t$k */
    static class k extends r {
        k(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ae.t$l */
    static class l extends r {
        l(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p015ae.AbstractC1806u
        public boolean e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
            if (interfaceC1803q == null) {
                g(0);
            }
            if (interfaceC1799m == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(w0.e.f19766c);
        f19741a = dVar;
        e eVar = new e(w0.f.f19767c);
        f19742b = eVar;
        f fVar = new f(w0.g.f19768c);
        f19743c = fVar;
        g gVar = new g(w0.b.f19763c);
        f19744d = gVar;
        h hVar = new h(w0.h.f19769c);
        f19745e = hVar;
        i iVar = new i(w0.d.f19765c);
        f19746f = iVar;
        j jVar = new j(w0.a.f19762c);
        f19747g = jVar;
        k kVar = new k(w0.c.f19764c);
        f19748h = kVar;
        l lVar = new l(w0.i.f19770c);
        f19749i = lVar;
        f19750j = Collections.unmodifiableSet(W.g(dVar, eVar, gVar, iVar));
        HashMap mapE = p034bf.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f19751k = Collections.unmodifiableMap(mapE);
        f19752l = hVar;
        f19753m = new a();
        f19754n = new b();
        f19755o = new c();
        Iterator it = ServiceLoader.load(Ye.l.class, Ye.l.class.getClassLoader()).iterator();
        f19756p = it.hasNext() ? (Ye.l) it.next() : Ye.l.a.f17849a;
        f19757q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer d(AbstractC1806u abstractC1806u, AbstractC1806u abstractC1806u2) {
        if (abstractC1806u == null) {
            a(12);
        }
        if (abstractC1806u2 == null) {
            a(13);
        }
        Integer numA = abstractC1806u.a(abstractC1806u2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC1806u2.a(abstractC1806u);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC1803q e(Le.g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
        InterfaceC1803q interfaceC1803qE;
        if (interfaceC1803q == null) {
            a(8);
        }
        if (interfaceC1799m == null) {
            a(9);
        }
        for (InterfaceC1803q interfaceC1803q2 = (InterfaceC1803q) interfaceC1803q.a(); interfaceC1803q2 != null && interfaceC1803q2.getVisibility() != f19746f; interfaceC1803q2 = (InterfaceC1803q) De.i.q(interfaceC1803q2, InterfaceC1803q.class)) {
            if (!interfaceC1803q2.getVisibility().e(gVar, interfaceC1803q2, interfaceC1799m, z10)) {
                return interfaceC1803q2;
            }
        }
        if (!(interfaceC1803q instanceof Q) || (interfaceC1803qE = e(gVar, ((Q) interfaceC1803q).U(), interfaceC1799m, z10)) == null) {
            return null;
        }
        return interfaceC1803qE;
    }

    public static boolean f(InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2) {
        if (interfaceC1799m == null) {
            a(6);
        }
        if (interfaceC1799m2 == null) {
            a(7);
        }
        i0 i0VarJ = De.i.j(interfaceC1799m2);
        if (i0VarJ != i0.f19734a) {
            return i0VarJ.equals(De.i.j(interfaceC1799m));
        }
        return false;
    }

    public static boolean g(AbstractC1806u abstractC1806u) {
        if (abstractC1806u == null) {
            a(14);
        }
        return abstractC1806u == f19741a || abstractC1806u == f19742b;
    }

    public static boolean h(InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10) {
        if (interfaceC1803q == null) {
            a(2);
        }
        if (interfaceC1799m == null) {
            a(3);
        }
        return e(f19754n, interfaceC1803q, interfaceC1799m, z10) == null;
    }

    private static void i(AbstractC1806u abstractC1806u) {
        f19757q.put(abstractC1806u.b(), abstractC1806u);
    }

    public static AbstractC1806u j(x0 x0Var) {
        if (x0Var == null) {
            a(15);
        }
        AbstractC1806u abstractC1806u = (AbstractC1806u) f19757q.get(x0Var);
        if (abstractC1806u != null) {
            return abstractC1806u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + x0Var);
    }
}
