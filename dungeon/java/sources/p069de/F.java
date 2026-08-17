package p069de;

import Ad.j;
import Ae.a;
import Qe.g;
import Qe.n;
import Xd.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.C;
import p015ae.G;
import p015ae.H;
import p015ae.InterfaceC1799m;
import p015ae.InterfaceC1801o;
import p015ae.O;
import p015ae.V;
import p033be.h;
import p464ze.c;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC3239m implements H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f39955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f39956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f39957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f39958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final I f39959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B f39960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private O f39961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f39963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f39964l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(f moduleName, n storageManager, i builtIns, a aVar) {
        this(moduleName, storageManager, builtIns, aVar, null, null, 48, null);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(f moduleName, n storageManager, i builtIns, a aVar, Map capabilities, f fVar) {
        super(h.f26532n1.b(), moduleName);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f39955c = storageManager;
        this.f39956d = builtIns;
        this.f39957e = fVar;
        if (!moduleName.r()) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f39958f = capabilities;
        I i10 = (I) n0(I.f39975a.a());
        this.f39959g = i10 == null ? I.b.f39978b : i10;
        this.f39962j = true;
        this.f39963k = storageManager.i(new D(this));
        this.f39964l = j.b(new E(this));
    }

    public /* synthetic */ F(f fVar, n nVar, i iVar, a aVar, Map map, f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, iVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? N.i() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    private final String L0() {
        String string = getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final C3238l N0() {
        return (C3238l) this.f39964l.getValue();
    }

    private final boolean P0() {
        return this.f39961i != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3238l R0(F f10) {
        B b10 = f10.f39960h;
        if (b10 == null) {
            throw new AssertionError("Dependencies of module " + f10.L0() + " were not set before querying module content");
        }
        List listA = b10.a();
        f10.K0();
        listA.contains(f10);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((F) it.next()).P0();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            O o10 = ((F) it2.next()).f39961i;
            Intrinsics.c(o10);
            arrayList.add(o10);
        }
        return new C3238l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V S0(F f10, c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return f10.f39959g.a(f10, fqName, f10.f39955c);
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o interfaceC1801o, Object obj) {
        return H.a.a(this, interfaceC1801o, obj);
    }

    public void K0() {
        if (Q0()) {
            return;
        }
        C.a(this);
    }

    public final O M0() {
        K0();
        return N0();
    }

    public final void O0(O providerForModuleContent) {
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        P0();
        this.f39961i = providerForModuleContent;
    }

    public boolean Q0() {
        return this.f39962j;
    }

    public final void T0(B dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f39960h = dependencies;
    }

    public final void U0(List descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        V0(descriptors, W.d());
    }

    @Override // p015ae.H
    public V V(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        K0();
        return (V) this.f39963k.invoke(fqName);
    }

    public final void V0(List descriptors, Set friends) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        T0(new C(descriptors, friends, CollectionsKt.l(), W.d()));
    }

    public final void W0(F... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        U0(AbstractC3952n.J0(descriptors));
    }

    @Override // p015ae.InterfaceC1799m
    public InterfaceC1799m b() {
        return H.a.b(this);
    }

    @Override // p015ae.H
    public i n() {
        return this.f39956d;
    }

    @Override // p015ae.H
    public Object n0(G capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        Object obj = this.f39958f.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p015ae.H
    public Collection p(c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        K0();
        return M0().p(fqName, nameFilter);
    }

    @Override // p069de.AbstractC3239m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!Q0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        O o10 = this.f39961i;
        sb2.append(o10 != null ? o10.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    @Override // p015ae.H
    public boolean x(H targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (Intrinsics.b(this, targetModule)) {
            return true;
        }
        B b10 = this.f39960h;
        Intrinsics.c(b10);
        return CollectionsKt.b0(b10.c(), targetModule) || z0().contains(targetModule) || targetModule.z0().contains(this);
    }

    @Override // p015ae.H
    public List z0() {
        B b10 = this.f39960h;
        if (b10 != null) {
            return b10.b();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }
}
