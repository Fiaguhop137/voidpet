package Ke;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;
import p015ae.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements k {
    @Override // Ke.k
    public Collection a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.l();
    }

    @Override // Ke.k
    public Set b() {
        Collection collectionE = e(d.f6205v, p034bf.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof g0) {
                p464ze.f name = ((g0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Ke.k
    public Collection c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.l();
    }

    @Override // Ke.k
    public Set d() {
        Collection collectionE = e(d.f6206w, p034bf.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof g0) {
                p464ze.f name = ((g0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Ke.n
    public Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.l();
    }

    @Override // Ke.n
    public InterfaceC1794h f(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // Ke.k
    public Set g() {
        return null;
    }
}
