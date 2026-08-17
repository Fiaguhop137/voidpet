package Ud;

import Pe.InterfaceC1291s;
import Pe.InterfaceC1292t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1799m;

/* JADX INFO: loaded from: classes3.dex */
public final class W0 implements kotlin.reflect.p, Y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f13537d = {kotlin.jvm.internal.F.j(new kotlin.jvm.internal.w(W0.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p015ae.m0 f13538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1.a f13539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X0 f13540c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13541a;

        static {
            int[] iArr = new int[Re.N0.values().length];
            try {
                iArr[Re.N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Re.N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Re.N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13541a = iArr;
        }
    }

    public W0(X0 x10, p015ae.m0 descriptor) {
        X xE;
        Object objH0;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f13538a = descriptor;
        this.f13539b = a1.c(new V0(this));
        if (x10 == null) {
            InterfaceC1799m interfaceC1799mB = o().b();
            Intrinsics.checkNotNullExpressionValue(interfaceC1799mB, "getContainingDeclaration(...)");
            if (interfaceC1799mB instanceof InterfaceC1791e) {
                objH0 = e((InterfaceC1791e) interfaceC1799mB);
            } else {
                if (!(interfaceC1799mB instanceof InterfaceC1788b)) {
                    throw new Y0("Unknown type parameter container: " + interfaceC1799mB);
                }
                InterfaceC1799m interfaceC1799mB2 = ((InterfaceC1788b) interfaceC1799mB).b();
                Intrinsics.checkNotNullExpressionValue(interfaceC1799mB2, "getContainingDeclaration(...)");
                if (interfaceC1799mB2 instanceof InterfaceC1791e) {
                    xE = e((InterfaceC1791e) interfaceC1799mB2);
                } else {
                    InterfaceC1292t interfaceC1292t = interfaceC1799mB instanceof InterfaceC1292t ? (InterfaceC1292t) interfaceC1799mB : null;
                    if (interfaceC1292t == null) {
                        throw new Y0("Non-class callable descriptor must be deserialized: " + interfaceC1799mB);
                    }
                    kotlin.reflect.d dVarE = Ld.a.e(c(interfaceC1292t));
                    Intrinsics.d(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    xE = (X) dVarE;
                }
                objH0 = interfaceC1799mB.H0(new C1525j(xE), Unit.f48228a);
            }
            x10 = (X0) objH0;
        }
        this.f13540c = x10;
    }

    private final Class c(InterfaceC1292t interfaceC1292t) {
        Class clsF;
        InterfaceC1291s interfaceC1291sM = interfaceC1292t.M();
        p338se.r rVar = interfaceC1291sM instanceof p338se.r ? (p338se.r) interfaceC1291sM : null;
        p338se.x xVarG = rVar != null ? rVar.g() : null;
        p105fe.f fVar = xVarG instanceof p105fe.f ? (p105fe.f) xVarG : null;
        if (fVar != null && (clsF = fVar.f()) != null) {
            return clsF;
        }
        throw new Y0("Container of deserialized member is not resolved: " + interfaceC1292t);
    }

    private final X e(InterfaceC1791e interfaceC1791e) {
        Class clsQ = j1.q(interfaceC1791e);
        X x10 = (X) (clsQ != null ? Ld.a.e(clsQ) : null);
        if (x10 != null) {
            return x10;
        }
        throw new Y0("Type parameter container is not resolved: " + interfaceC1791e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(W0 w10) {
        List upperBounds = w10.o().getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.w(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new U0((Re.S) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // Ud.Y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p015ae.m0 o() {
        return this.f13538a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w10 = (W0) obj;
        return Intrinsics.b(this.f13540c, w10.f13540c) && Intrinsics.b(getName(), w10.getName());
    }

    @Override // kotlin.reflect.p
    public String getName() {
        String strG = o().getName().g();
        Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
        return strG;
    }

    @Override // kotlin.reflect.p
    public List getUpperBounds() {
        Object objB = this.f13539b.b(this, f13537d[0]);
        Intrinsics.checkNotNullExpressionValue(objB, "getValue(...)");
        return (List) objB;
    }

    public int hashCode() {
        return (this.f13540c.hashCode() * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.p
    public kotlin.reflect.q m() {
        int i10 = a.f13541a[o().m().ordinal()];
        if (i10 == 1) {
            return kotlin.reflect.q.INVARIANT;
        }
        if (i10 == 2) {
            return kotlin.reflect.q.IN;
        }
        if (i10 == 3) {
            return kotlin.reflect.q.OUT;
        }
        throw new Ad.n();
    }

    public String toString() {
        return kotlin.jvm.internal.L.f48343a.a(this);
    }
}
