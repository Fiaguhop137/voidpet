package p069de;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.O;
import p015ae.T;
import p015ae.U;
import p464ze.c;

/* JADX INFO: renamed from: de.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3238l implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f40094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40095b;

    public C3238l(List providers, String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f40094a = providers;
        this.f40095b = debugName;
        providers.size();
        CollectionsKt.Y0(providers).size();
    }

    @Override // p015ae.U
    public boolean a(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List list = this.f40094a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!T.b((O) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p015ae.U
    public void b(c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator it = this.f40094a.iterator();
        while (it.hasNext()) {
            T.a((O) it.next(), fqName, packageFragments);
        }
    }

    @Override // p015ae.O
    public List c(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f40094a.iterator();
        while (it.hasNext()) {
            T.a((O) it.next(), fqName, arrayList);
        }
        return CollectionsKt.U0(arrayList);
    }

    @Override // p015ae.O
    public Collection p(c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f40094a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((O) it.next()).p(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f40095b;
    }
}
