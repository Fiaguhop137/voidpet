package Ke;

import Re.E0;
import Re.G0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1799m;
import p015ae.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f6237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f6238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G0 f6239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f6240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f6241f;

    public t(k workerScope, G0 givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f6237b = workerScope;
        this.f6238c = Ad.j.b(new r(givenSubstitutor));
        E0 e0J = givenSubstitutor.j();
        Intrinsics.checkNotNullExpressionValue(e0J, "getSubstitution(...)");
        this.f6239d = Ee.e.h(e0J, false, 1, null).c();
        this.f6241f = Ad.j.b(new s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(t tVar) {
        return tVar.m(n.a.a(tVar.f6237b, null, null, 3, null));
    }

    private final Collection k() {
        return (Collection) this.f6241f.getValue();
    }

    private final InterfaceC1799m l(InterfaceC1799m interfaceC1799m) {
        if (this.f6239d.k()) {
            return interfaceC1799m;
        }
        if (this.f6240e == null) {
            this.f6240e = new HashMap();
        }
        Map map = this.f6240e;
        Intrinsics.c(map);
        Object objC = map.get(interfaceC1799m);
        if (objC == null) {
            if (!(interfaceC1799m instanceof j0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC1799m).toString());
            }
            objC = ((j0) interfaceC1799m).c(this.f6239d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC1799m + " substitution fails");
            }
            map.put(interfaceC1799m, objC);
        }
        InterfaceC1799m interfaceC1799m2 = (InterfaceC1799m) objC;
        Intrinsics.d(interfaceC1799m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC1799m2;
    }

    private final Collection m(Collection collection) {
        if (this.f6239d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = p034bf.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(l((InterfaceC1799m) it.next()));
        }
        return linkedHashSetG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 n(G0 g10) {
        return g10.j().c();
    }

    @Override // Ke.k
    public Collection a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return m(this.f6237b.a(name, location));
    }

    @Override // Ke.k
    public Set b() {
        return this.f6237b.b();
    }

    @Override // Ke.k
    public Collection c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return m(this.f6237b.c(name, location));
    }

    @Override // Ke.k
    public Set d() {
        return this.f6237b.d();
    }

    @Override // Ke.n
    public Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return k();
    }

    @Override // Ke.n
    public InterfaceC1794h f(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC1794h interfaceC1794hF = this.f6237b.f(name, location);
        if (interfaceC1794hF != null) {
            return (InterfaceC1794h) l(interfaceC1794hF);
        }
        return null;
    }

    @Override // Ke.k
    public Set g() {
        return this.f6237b.g();
    }
}
