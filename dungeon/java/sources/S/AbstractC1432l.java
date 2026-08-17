package S;

import I.T0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: S.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1432l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11377e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11378f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1437q f11379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11382d;

    /* JADX INFO: renamed from: S.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function2 function2) {
            synchronized (AbstractC1442w.O()) {
                AbstractC1442w.f11417i = CollectionsKt.z0(AbstractC1442w.f11417i, function2);
                Unit unit = Unit.f48228a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Function1 function1) {
            synchronized (AbstractC1442w.O()) {
                AbstractC1442w.f11418j = CollectionsKt.z0(AbstractC1442w.f11418j, function1);
                Unit unit = Unit.f48228a;
            }
            AbstractC1442w.G();
        }

        public static /* synthetic */ C1424d o(a aVar, Function1 function1, Function1 function2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            return aVar.n(function1, function2);
        }

        public final AbstractC1432l c() {
            return AbstractC1442w.M();
        }

        public final AbstractC1432l d() {
            return (AbstractC1432l) AbstractC1442w.f11411c.a();
        }

        public final AbstractC1432l e(AbstractC1432l abstractC1432l) {
            if (abstractC1432l instanceof Z) {
                Z z10 = (Z) abstractC1432l;
                if (z10.V() == Q.v.a()) {
                    z10.Y(null);
                    return abstractC1432l;
                }
            }
            if (abstractC1432l instanceof a0) {
                a0 a0Var = (a0) abstractC1432l;
                if (a0Var.C() == Q.v.a()) {
                    a0Var.F(null);
                    return abstractC1432l;
                }
            }
            AbstractC1432l abstractC1432lJ = AbstractC1442w.J(abstractC1432l, null, false, 6, null);
            abstractC1432lJ.l();
            return abstractC1432lJ;
        }

        public final void f() {
            AbstractC1442w.M().o();
        }

        public final Object g(Function1 function1, Function1 function2, Function0 function0) {
            AbstractC1432l z10;
            if (function1 == null && function2 == null) {
                return function0.invoke();
            }
            AbstractC1432l abstractC1432l = (AbstractC1432l) AbstractC1442w.f11411c.a();
            if (abstractC1432l instanceof Z) {
                Z z11 = (Z) abstractC1432l;
                if (z11.V() == Q.v.a()) {
                    Function1 function1H = z11.g();
                    Function1 function1K = z11.k();
                    try {
                        ((Z) abstractC1432l).Y(AbstractC1442w.Q(function1, function1H, false, 4, null));
                        ((Z) abstractC1432l).Z(AbstractC1442w.S(function2, function1K));
                        return function0.invoke();
                    } finally {
                        z11.Y(function1H);
                        z11.Z(function1K);
                    }
                }
            }
            if (abstractC1432l == null || (abstractC1432l instanceof C1424d)) {
                z10 = new Z(abstractC1432l instanceof C1424d ? (C1424d) abstractC1432l : null, function1, function2, true, false);
            } else {
                if (function1 == null) {
                    return function0.invoke();
                }
                z10 = abstractC1432l.x(function1);
            }
            try {
                AbstractC1432l abstractC1432lL = z10.l();
                try {
                    Object objInvoke = function0.invoke();
                    z10.s(abstractC1432lL);
                    z10.d();
                    return objInvoke;
                } catch (Throwable th) {
                    z10.s(abstractC1432lL);
                    throw th;
                }
            } catch (Throwable th2) {
                z10.d();
                throw th2;
            }
        }

        public final InterfaceC1427g h(Function2 function2) {
            AbstractC1442w.F(AbstractC1442w.f11409a);
            synchronized (AbstractC1442w.O()) {
                AbstractC1442w.f11417i = CollectionsKt.D0(AbstractC1442w.f11417i, function2);
                Unit unit = Unit.f48228a;
            }
            return new C1431k(function2);
        }

        public final InterfaceC1427g j(Function1 function1) {
            synchronized (AbstractC1442w.O()) {
                AbstractC1442w.f11418j = CollectionsKt.D0(AbstractC1442w.f11418j, function1);
                Unit unit = Unit.f48228a;
            }
            AbstractC1442w.G();
            return new C1430j(function1);
        }

        public final void l(AbstractC1432l abstractC1432l, AbstractC1432l abstractC1432l2, Function1 function1) {
            if (abstractC1432l != abstractC1432l2) {
                abstractC1432l2.s(abstractC1432l);
                abstractC1432l2.d();
            } else if (abstractC1432l instanceof Z) {
                ((Z) abstractC1432l).Y(function1);
            } else {
                if (abstractC1432l instanceof a0) {
                    ((a0) abstractC1432l).F(function1);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC1432l).toString());
            }
        }

        public final void m() {
            boolean zI;
            synchronized (AbstractC1442w.O()) {
                zI = AbstractC1442w.f11419k.I();
            }
            if (zI) {
                AbstractC1442w.G();
            }
        }

        public final C1424d n(Function1 function1, Function1 function2) {
            C1424d c1424dR;
            AbstractC1432l abstractC1432lM = AbstractC1442w.M();
            C1424d c1424d = abstractC1432lM instanceof C1424d ? (C1424d) abstractC1432lM : null;
            if (c1424d == null || (c1424dR = c1424d.R(function1, function2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c1424dR;
        }
    }

    private AbstractC1432l(long j10, C1437q c1437q) {
        this.f11379a = c1437q;
        this.f11380b = j10;
        this.f11382d = j10 != AbstractC1442w.f11410b ? AbstractC1442w.k0(j10, f()) : -1;
    }

    public /* synthetic */ AbstractC1432l(long j10, C1437q c1437q, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, c1437q);
    }

    public final void b() {
        synchronized (AbstractC1442w.O()) {
            c();
            r();
            Unit unit = Unit.f48228a;
        }
    }

    public void c() {
        AbstractC1442w.f11413e = AbstractC1442w.f11413e.k(i());
    }

    public void d() {
        this.f11381c = true;
        synchronized (AbstractC1442w.O()) {
            q();
            Unit unit = Unit.f48228a;
        }
    }

    public final boolean e() {
        return this.f11381c;
    }

    public C1437q f() {
        return this.f11379a;
    }

    public abstract Function1 g();

    public abstract boolean h();

    public long i() {
        return this.f11380b;
    }

    public int j() {
        return 0;
    }

    public abstract Function1 k();

    public AbstractC1432l l() {
        AbstractC1432l abstractC1432l = (AbstractC1432l) AbstractC1442w.f11411c.a();
        AbstractC1442w.f11411c.b(this);
        return abstractC1432l;
    }

    public abstract void m(AbstractC1432l abstractC1432l);

    public abstract void n(AbstractC1432l abstractC1432l);

    public abstract void o();

    public abstract void p(V v10);

    public final void q() {
        int i10 = this.f11382d;
        if (i10 >= 0) {
            AbstractC1442w.f0(i10);
            this.f11382d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(AbstractC1432l abstractC1432l) {
        AbstractC1442w.f11411c.b(abstractC1432l);
    }

    public final void t(boolean z10) {
        this.f11381c = z10;
    }

    public void u(C1437q c1437q) {
        this.f11379a = c1437q;
    }

    public void v(long j10) {
        this.f11380b = j10;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC1432l x(Function1 function1);

    public final int y() {
        int i10 = this.f11382d;
        this.f11382d = -1;
        return i10;
    }

    public final void z() {
        if (this.f11381c) {
            T0.a("Cannot use a disposed snapshot");
        }
    }
}
