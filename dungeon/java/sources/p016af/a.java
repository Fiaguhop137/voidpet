package p016af;

import Ke.k;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import p034bf.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Collection a(Collection collection, Collection collection2) {
        Intrinsics.checkNotNullParameter(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final j b(Iterable scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        j jVar = new j();
        for (Object obj : scopes) {
            k kVar = (k) obj;
            if (kVar != null && kVar != k.b.f6227b) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
