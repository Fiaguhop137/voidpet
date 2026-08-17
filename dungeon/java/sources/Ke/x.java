package Ke;

import Re.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1799m;
import p015ae.Z;
import p015ae.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends Ke.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f6245d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f6247c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String message, Collection types) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((S) it.next()).o());
            }
            p034bf.j jVarB = p016af.a.b(arrayList);
            k kVarB = b.f6180d.b(message, jVarB);
            return jVarB.size() <= 1 ? kVarB : new x(message, kVarB, null);
        }
    }

    private x(String str, k kVar) {
        this.f6246b = str;
        this.f6247c = kVar;
    }

    public /* synthetic */ x(String str, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVar);
    }

    public static final k m(String str, Collection collection) {
        return f6245d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1787a n(InterfaceC1787a selectMostSpecificInEachOverridableGroup) {
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1787a o(g0 selectMostSpecificInEachOverridableGroup) {
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1787a p(Z selectMostSpecificInEachOverridableGroup) {
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // Ke.a, Ke.k
    public Collection a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return De.r.b(super.a(name, location), v.f6243a);
    }

    @Override // Ke.a, Ke.k
    public Collection c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return De.r.b(super.c(name, location), u.f6242a);
    }

    @Override // Ke.a, Ke.n
    public Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection collectionE = super.e(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionE) {
            if (((InterfaceC1799m) obj) instanceof InterfaceC1787a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        Intrinsics.d(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt.C0(De.r.b(list, w.f6244a), list2);
    }

    @Override // Ke.a
    protected k i() {
        return this.f6247c;
    }
}
