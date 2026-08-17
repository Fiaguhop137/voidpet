package p248ne;

import Ke.d;
import Ke.k;
import Qe.i;
import Qe.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import p015ae.D;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1795i;
import p016af.a;
import p159ie.b;
import p302qe.u;
import p338se.x;
import p464ze.f;

/* JADX INFO: renamed from: ne.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4034f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f50222f = {F.j(new w(C4034f.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p230me.k f50223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f50224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f50225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f50226e;

    public C4034f(p230me.k c10, u jPackage, D packageFragment) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f50223b = c10;
        this.f50224c = packageFragment;
        this.f50225d = new G(c10, jPackage, packageFragment);
        this.f50226e = c10.e().c(new C4033e(this));
    }

    private final k[] j() {
        return (k[]) m.a(this.f50226e, this, f50222f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k[] k(C4034f c4034f) {
        Collection collectionValues = c4034f.f50224c.O0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            k kVarC = c4034f.f50223b.a().b().c(c4034f.f50224c, (x) it.next());
            if (kVarC != null) {
                arrayList.add(kVarC);
            }
        }
        return (k[]) a.b(arrayList).toArray(new k[0]);
    }

    @Override // Ke.k
    public Collection a(f name, b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l(name, location);
        G g10 = this.f50225d;
        k[] kVarArrJ = j();
        Collection collectionA = g10.a(name, location);
        for (k kVar : kVarArrJ) {
            collectionA = a.a(collectionA, kVar.a(name, location));
        }
        return collectionA == null ? W.d() : collectionA;
    }

    @Override // Ke.k
    public Set b() {
        k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArrJ) {
            CollectionsKt.B(linkedHashSet, kVar.b());
        }
        linkedHashSet.addAll(this.f50225d.b());
        return linkedHashSet;
    }

    @Override // Ke.k
    public Collection c(f name, b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l(name, location);
        G g10 = this.f50225d;
        k[] kVarArrJ = j();
        Collection collectionC = g10.c(name, location);
        for (k kVar : kVarArrJ) {
            collectionC = a.a(collectionC, kVar.c(name, location));
        }
        return collectionC == null ? W.d() : collectionC;
    }

    @Override // Ke.k
    public Set d() {
        k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArrJ) {
            CollectionsKt.B(linkedHashSet, kVar.d());
        }
        linkedHashSet.addAll(this.f50225d.d());
        return linkedHashSet;
    }

    @Override // Ke.n
    public Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        G g10 = this.f50225d;
        k[] kVarArrJ = j();
        Collection collectionE = g10.e(kindFilter, nameFilter);
        for (k kVar : kVarArrJ) {
            collectionE = a.a(collectionE, kVar.e(kindFilter, nameFilter));
        }
        return collectionE == null ? W.d() : collectionE;
    }

    @Override // Ke.n
    public InterfaceC1794h f(f name, b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l(name, location);
        InterfaceC1791e interfaceC1791eF = this.f50225d.f(name, location);
        if (interfaceC1791eF != null) {
            return interfaceC1791eF;
        }
        InterfaceC1794h interfaceC1794h = null;
        for (k kVar : j()) {
            InterfaceC1794h interfaceC1794hF = kVar.f(name, location);
            if (interfaceC1794hF != null) {
                if (!(interfaceC1794hF instanceof InterfaceC1795i) || !((D) interfaceC1794hF).m0()) {
                    return interfaceC1794hF;
                }
                if (interfaceC1794h == null) {
                    interfaceC1794h = interfaceC1794hF;
                }
            }
        }
        return interfaceC1794h;
    }

    @Override // Ke.k
    public Set g() {
        Set setA = Ke.m.a(AbstractC3952n.I(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f50225d.g());
        return setA;
    }

    public final G i() {
        return this.f50225d;
    }

    public void l(f name, b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        p141he.a.b(this.f50223b.a().l(), location, this.f50224c, name);
    }

    public String toString() {
        return "scope for " + this.f50224c;
    }
}
