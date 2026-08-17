package p069de;

import Ad.j;
import Fe.g;
import Re.G0;
import Re.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.AbstractC1805t;
import p015ae.AbstractC1806u;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1799m;
import p015ae.InterfaceC1801o;
import p015ae.h0;
import p015ae.t0;
import p033be.h;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public class V extends X implements t0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f40039l = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f40042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f40043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final S f40044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t0 f40045k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(InterfaceC1787a containingDeclaration, t0 t0Var, int i10, h annotations, f name, S outType, boolean z10, boolean z11, boolean z12, S s10, h0 source, Function0 function0) {
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            return function0 == null ? new V(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source) : new b(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source, function0);
        }
    }

    public static final class b extends V {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Lazy f40046m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1787a containingDeclaration, t0 t0Var, int i10, h annotations, f name, S outType, boolean z10, boolean z11, boolean z12, S s10, h0 source, Function0 destructuringVariables) {
            super(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source);
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
            this.f40046m = j.b(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List O0(b bVar) {
            return bVar.P0();
        }

        public final List P0() {
            return (List) this.f40046m.getValue();
        }

        @Override // p069de.V, p015ae.t0
        public t0 y(InterfaceC1787a newOwner, f newName, int i10) {
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            Intrinsics.checkNotNullParameter(newName, "newName");
            h annotations = getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
            S type = getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            boolean zA0 = A0();
            boolean zS0 = s0();
            boolean zR0 = r0();
            S sV0 = v0();
            h0 NO_SOURCE = h0.f19733a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, annotations, newName, type, zA0, zS0, zR0, sV0, NO_SOURCE, new W(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC1787a containingDeclaration, t0 t0Var, int i10, h annotations, f name, S outType, boolean z10, boolean z11, boolean z12, S s10, h0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f40040f = i10;
        this.f40041g = z10;
        this.f40042h = z11;
        this.f40043i = z12;
        this.f40044j = s10;
        this.f40045k = t0Var == null ? this : t0Var;
    }

    public static final V K0(InterfaceC1787a interfaceC1787a, t0 t0Var, int i10, h hVar, f fVar, S s10, boolean z10, boolean z11, boolean z12, S s11, h0 h0Var, Function0 function0) {
        return f40039l.a(interfaceC1787a, t0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, h0Var, function0);
    }

    @Override // p015ae.t0
    public boolean A0() {
        if (!this.f40041g) {
            return false;
        }
        InterfaceC1787a interfaceC1787aB = b();
        Intrinsics.d(interfaceC1787aB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((InterfaceC1788b) interfaceC1787aB).j().e();
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.m(this, obj);
    }

    public Void L0() {
        return null;
    }

    @Override // p015ae.j0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public t0 c(G0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p015ae.u0
    public boolean Q() {
        return false;
    }

    @Override // p069de.AbstractC3240n, p069de.AbstractC3239m, p015ae.InterfaceC1799m
    public t0 a() {
        t0 t0Var = this.f40045k;
        return t0Var == this ? this : t0Var.a();
    }

    @Override // p069de.AbstractC3240n, p015ae.InterfaceC1799m
    public InterfaceC1787a b() {
        InterfaceC1799m interfaceC1799mB = super.b();
        Intrinsics.d(interfaceC1799mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC1787a) interfaceC1799mB;
    }

    @Override // p015ae.InterfaceC1787a
    public Collection e() {
        Collection collectionE = b().e();
        Intrinsics.checkNotNullExpressionValue(collectionE, "getOverriddenDescriptors(...)");
        Collection collection = collectionE;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((t0) ((InterfaceC1787a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p015ae.t0
    public int getIndex() {
        return this.f40040f;
    }

    @Override // p015ae.InterfaceC1803q
    public AbstractC1806u getVisibility() {
        AbstractC1806u LOCAL = AbstractC1805t.f19746f;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // p015ae.u0
    public /* bridge */ /* synthetic */ g q0() {
        return (g) L0();
    }

    @Override // p015ae.t0
    public boolean r0() {
        return this.f40043i;
    }

    @Override // p015ae.t0
    public boolean s0() {
        return this.f40042h;
    }

    @Override // p015ae.t0
    public S v0() {
        return this.f40044j;
    }

    @Override // p015ae.t0
    public t0 y(InterfaceC1787a newOwner, f newName, int i10) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        h annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        S type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean zA0 = A0();
        boolean zS0 = s0();
        boolean zR0 = r0();
        S sV0 = v0();
        h0 NO_SOURCE = h0.f19733a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new V(newOwner, null, i10, annotations, newName, type, zA0, zS0, zR0, sV0, NO_SOURCE);
    }
}
