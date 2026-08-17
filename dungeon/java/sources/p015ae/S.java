package p015ae;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f19703a;

    public S(Collection packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f19703a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c f(N it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(c cVar, c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.c() && Intrinsics.b(it.d(), cVar);
    }

    @Override // p015ae.U
    public boolean a(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f19703a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(((N) it.next()).f(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p015ae.U
    public void b(c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f19703a) {
            if (Intrinsics.b(((N) obj).f(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // p015ae.O
    public List c(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f19703a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.b(((N) obj).f(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p015ae.O
    public Collection p(c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return k.V(k.C(k.N(CollectionsKt.Z(this.f19703a), P.f19701a), new Q(fqName)));
    }
}
