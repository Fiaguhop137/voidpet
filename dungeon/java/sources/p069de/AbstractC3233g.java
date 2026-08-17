package p069de;

import He.e;
import Qe.i;
import Qe.n;
import Re.AbstractC1388d0;
import Re.J0;
import Re.M0;
import Re.W;
import Re.v0;
import Se.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import kotlin.reflect.k;
import p015ae.AbstractC1806u;
import p015ae.InterfaceC1790d;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1799m;
import p015ae.InterfaceC1801o;
import p015ae.InterfaceC1802p;
import p015ae.h0;
import p015ae.l0;
import p015ae.m0;
import p033be.h;
import p464ze.f;

/* JADX INFO: renamed from: de.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3233g extends AbstractC3240n implements l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ k[] f40063j = {F.j(new w(AbstractC3233g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f40064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1806u f40065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f40066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f40067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f40068i;

    /* JADX INFO: renamed from: de.g$a */
    public static final class a implements v0 {
        a() {
        }

        @Override // Re.v0
        public Collection a() {
            Collection collectionA = p().u0().N0().a();
            Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
            return collectionA;
        }

        @Override // Re.v0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public l0 p() {
            return AbstractC3233g.this;
        }

        @Override // Re.v0
        public List getParameters() {
            return AbstractC3233g.this.R0();
        }

        @Override // Re.v0
        public Xd.i n() {
            return e.m(p());
        }

        @Override // Re.v0
        public v0 o(g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // Re.v0
        public boolean q() {
            return true;
        }

        public String toString() {
            return "[typealias " + p().getName().g() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3233g(n storageManager, InterfaceC1799m containingDeclaration, h annotations, f name, h0 sourceElement, AbstractC1806u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        this.f40064e = storageManager;
        this.f40065f = visibilityImpl;
        this.f40066g = storageManager.c(new C3230d(this));
        this.f40068i = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1388d0 N0(AbstractC3233g abstractC3233g, g gVar) {
        InterfaceC1794h interfaceC1794hF = gVar.f(abstractC3233g);
        if (interfaceC1794hF != null) {
            return interfaceC1794hF.q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection O0(AbstractC3233g abstractC3233g) {
        return abstractC3233g.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public static final Boolean T0(AbstractC3233g abstractC3233g, M0 m10) {
        boolean z10;
        Intrinsics.c(m10);
        if (W.a(m10)) {
            z10 = false;
        } else {
            InterfaceC1794h interfaceC1794hP = m10.N0().p();
            if (!(interfaceC1794hP instanceof m0) || Intrinsics.b(((m0) interfaceC1794hP).b(), abstractC3233g)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // p015ae.InterfaceC1795i
    public boolean D() {
        return J0.c(u0(), new C3231e(this));
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.f(this, obj);
    }

    protected final AbstractC1388d0 M0() {
        Ke.k kVarZ;
        InterfaceC1791e interfaceC1791eU = u();
        if (interfaceC1791eU == null || (kVarZ = interfaceC1791eU.Z()) == null) {
            kVarZ = Ke.k.b.f6227b;
        }
        AbstractC1388d0 abstractC1388d0V = J0.v(this, kVarZ, new C3232f(this));
        Intrinsics.checkNotNullExpressionValue(abstractC1388d0V, "makeUnsubstitutedType(...)");
        return abstractC1388d0V;
    }

    protected final n P() {
        return this.f40064e;
    }

    @Override // p069de.AbstractC3240n, p069de.AbstractC3239m, p015ae.InterfaceC1799m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public l0 a() {
        InterfaceC1802p interfaceC1802pA = super.a();
        Intrinsics.d(interfaceC1802pA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (l0) interfaceC1802pA;
    }

    public final Collection Q0() {
        InterfaceC1791e interfaceC1791eU = u();
        if (interfaceC1791eU == null) {
            return CollectionsKt.l();
        }
        Collection<InterfaceC1790d> collectionG = interfaceC1791eU.g();
        Intrinsics.checkNotNullExpressionValue(collectionG, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1790d interfaceC1790d : collectionG) {
            T.a aVar = T.f40030I;
            n nVar = this.f40064e;
            Intrinsics.c(interfaceC1790d);
            Q qB = aVar.b(nVar, this, interfaceC1790d);
            if (qB != null) {
                arrayList.add(qB);
            }
        }
        return arrayList;
    }

    protected abstract List R0();

    public final void S0(List declaredTypeParameters) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.f40067h = declaredTypeParameters;
    }

    @Override // p015ae.D
    public boolean a0() {
        return false;
    }

    @Override // p015ae.D, p015ae.InterfaceC1803q
    public AbstractC1806u getVisibility() {
        return this.f40065f;
    }

    @Override // p015ae.D
    public boolean isExternal() {
        return false;
    }

    @Override // p015ae.InterfaceC1794h
    public v0 l() {
        return this.f40068i;
    }

    @Override // p015ae.D
    public boolean m0() {
        return false;
    }

    @Override // p015ae.InterfaceC1795i
    public List r() {
        List list = this.f40067h;
        if (list != null) {
            return list;
        }
        Intrinsics.r("declaredTypeParametersImpl");
        return null;
    }

    @Override // p069de.AbstractC3239m
    public String toString() {
        return "typealias " + getName().g();
    }
}
