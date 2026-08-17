package p338se;

import Ke.k;
import Ne.C1235i;
import Ne.C1240n;
import Ne.C1250y;
import Pe.M;
import Pe.r;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p015ae.N;
import p374ue.m;
import p410we.c;
import p446ye.e;
import p446ye.h;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f53617b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f53618c = W.c(p356te.a.EnumC0679a.CLASS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f53619d = W.g(p356te.a.EnumC0679a.FILE_FACADE, p356te.a.EnumC0679a.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f53620e = new c(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f53621f = new c(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f53622g = new c(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1240n f53623a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return n.f53622g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return CollectionsKt.l();
    }

    private final r e(x xVar) {
        if (!f().g().e() && xVar.c().j()) {
            return r.UNSTABLE;
        }
        return r.STABLE;
    }

    private final C1250y g(x xVar) {
        if (i() || xVar.c().d().h(h())) {
            return null;
        }
        return new C1250y(xVar.c().d(), c.f56902i, h(), h().k(xVar.c().d().j()), xVar.e(), xVar.d());
    }

    private final c h() {
        return f().g().d();
    }

    private final boolean i() {
        return f().g().f();
    }

    private final boolean j(x xVar) {
        return !f().g().b() && xVar.c().i() && Intrinsics.b(xVar.c().d(), f53621f);
    }

    private final boolean k(x xVar) {
        return (f().g().g() && (xVar.c().i() || Intrinsics.b(xVar.c().d(), f53620e))) || j(xVar);
    }

    private final String[] m(x xVar, Set set) {
        p356te.a aVarC = xVar.c();
        String[] strArrA = aVarC.a();
        if (strArrA == null) {
            strArrA = aVarC.b();
        }
        if (strArrA == null || !set.contains(aVarC.c())) {
            return null;
        }
        return strArrA;
    }

    public final k c(N descriptor, x kotlinClass) {
        Pair pairM;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f53619d);
        if (strArrM == null) {
            return null;
        }
        String[] strArrG = kotlinClass.c().g();
        try {
            if (strArrG == null) {
                return null;
            }
            try {
                pairM = h.m(strArrM, strArrG);
            } catch (Be.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.e(), e10);
            }
        } catch (Throwable th) {
            if (i() || kotlinClass.c().d().h(h())) {
                throw th;
            }
            pairM = null;
        }
        if (pairM == null) {
            return null;
        }
        e eVar = (e) pairM.getFirst();
        m mVar = (m) pairM.getSecond();
        r rVar = new r(kotlinClass, mVar, eVar, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new M(descriptor, mVar, eVar, kotlinClass.c().d(), rVar, f(), "scope for " + rVar + " in " + descriptor, m.f53616a);
    }

    public final C1240n f() {
        C1240n c1240n = this.f53623a;
        if (c1240n != null) {
            return c1240n;
        }
        Intrinsics.r("components");
        return null;
    }

    public final C1235i l(x kotlinClass) {
        String[] strArrG;
        Pair pairI;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f53618c);
        if (strArrM == null || (strArrG = kotlinClass.c().g()) == null) {
            return null;
        }
        try {
            try {
                pairI = h.i(strArrM, strArrG);
            } catch (Be.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.e(), e10);
            }
        } catch (Throwable th) {
            if (i() || kotlinClass.c().d().h(h())) {
                throw th;
            }
            pairI = null;
        }
        if (pairI == null) {
            return null;
        }
        return new C1235i((e) pairI.getFirst(), (p374ue.c) pairI.getSecond(), kotlinClass.c().d(), new z(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final InterfaceC1791e n(x kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        C1235i c1235iL = l(kotlinClass);
        if (c1235iL == null) {
            return null;
        }
        return f().f().e(kotlinClass.d(), c1235iL);
    }

    public final void o(C1240n c1240n) {
        Intrinsics.checkNotNullParameter(c1240n, "<set-?>");
        this.f53623a = c1240n;
    }

    public final void p(k components) {
        Intrinsics.checkNotNullParameter(components, "components");
        o(components.a());
    }
}
