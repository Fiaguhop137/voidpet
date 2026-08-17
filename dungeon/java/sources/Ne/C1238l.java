package Ne;

import Pe.C1286m;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p015ae.h0;

/* JADX INFO: renamed from: Ne.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1238l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8169c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f8170d = kotlin.collections.W.c(p464ze.b.f58558d.c(Xd.o.a.f16402d.m()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1240n f8171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f8172b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ne.l$a */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p464ze.b f8173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1235i f8174b;

        public a(p464ze.b classId, C1235i c1235i) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f8173a = classId;
            this.f8174b = c1235i;
        }

        public final C1235i a() {
            return this.f8174b;
        }

        public final p464ze.b b() {
            return this.f8173a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f8173a, ((a) obj).f8173a);
        }

        public int hashCode() {
            return this.f8173a.hashCode();
        }
    }

    /* JADX INFO: renamed from: Ne.l$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C1238l.f8170d;
        }
    }

    public C1238l(C1240n components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f8171a = components;
        this.f8172b = components.u().g(new C1237k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1791e c(C1238l c1238l, a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return c1238l.d(key);
    }

    private final InterfaceC1791e d(a aVar) {
        Object next;
        C1242p c1242pA;
        p015ae.N n10;
        p464ze.b bVarB = aVar.b();
        Iterator it = this.f8171a.l().iterator();
        while (it.hasNext()) {
            InterfaceC1791e interfaceC1791eB = ((p051ce.b) it.next()).b(bVarB);
            if (interfaceC1791eB != null) {
                return interfaceC1791eB;
            }
        }
        if (f8170d.contains(bVarB)) {
            return null;
        }
        C1235i c1235iA = aVar.a();
        if (c1235iA == null && (c1235iA = this.f8171a.e().a(bVarB)) == null) {
            return null;
        }
        p410we.d dVarA = c1235iA.a();
        p374ue.c cVarB = c1235iA.b();
        p410we.a aVarC = c1235iA.c();
        h0 h0VarD = c1235iA.d();
        p464ze.b bVarE = bVarB.e();
        if (bVarE != null) {
            InterfaceC1791e interfaceC1791eF = f(this, bVarE, null, 2, null);
            C1286m c1286m = interfaceC1791eF instanceof C1286m ? (C1286m) interfaceC1791eF : null;
            if (c1286m == null || !c1286m.k1(bVarB.h())) {
                return null;
            }
            c1242pA = c1286m.d1();
        } else {
            Iterator it2 = p015ae.T.c(this.f8171a.s(), bVarB.f()).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                n10 = (p015ae.N) next;
                if (!(n10 instanceof r)) {
                    break;
                }
            } while (!((r) n10).K0(bVarB.h()));
            p015ae.N n11 = (p015ae.N) next;
            if (n11 == null) {
                return null;
            }
            C1240n c1240n = this.f8171a;
            p374ue.u uVarG1 = cVarB.g1();
            Intrinsics.checkNotNullExpressionValue(uVarG1, "getTypeTable(...)");
            p410we.h hVar = new p410we.h(uVarG1);
            we.i.a aVar2 = p410we.i.f56910b;
            p374ue.x xVarI1 = cVarB.i1();
            Intrinsics.checkNotNullExpressionValue(xVarI1, "getVersionRequirementTable(...)");
            c1242pA = c1240n.a(n11, dVarA, hVar, aVar2.a(xVarI1), aVarC, null);
            aVarC = aVarC;
        }
        return new C1286m(c1242pA, cVarB, dVarA, aVarC, h0VarD);
    }

    public static /* synthetic */ InterfaceC1791e f(C1238l c1238l, p464ze.b bVar, C1235i c1235i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c1235i = null;
        }
        return c1238l.e(bVar, c1235i);
    }

    public final InterfaceC1791e e(p464ze.b classId, C1235i c1235i) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (InterfaceC1791e) this.f8172b.invoke(new a(classId, c1235i));
    }
}
