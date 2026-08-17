package Ke;

import Re.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1811z;
import p015ae.Z;
import p015ae.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f6215d = {F.j(new kotlin.jvm.internal.w(f.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1791e f6216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Qe.i f6217c;

    public static final class a extends De.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f6218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f6219b;

        a(ArrayList arrayList, f fVar) {
            this.f6218a = arrayList;
            this.f6219b = fVar;
        }

        @Override // De.n
        public void a(InterfaceC1788b fakeOverride) {
            Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
            De.o.K(fakeOverride, null);
            this.f6218a.add(fakeOverride);
        }

        @Override // De.m
        protected void e(InterfaceC1788b fromSuper, InterfaceC1788b fromCurrent) {
            Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
            Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f6219b.m() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public f(Qe.n storageManager, InterfaceC1791e containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f6216b = containingClass;
        this.f6217c = storageManager.c(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(f fVar) {
        List listJ = fVar.j();
        return CollectionsKt.C0(listJ, fVar.k(listJ));
    }

    private final List k(List list) {
        Collection collectionL;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionA = this.f6216b.l().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            CollectionsKt.B(arrayList2, n.a.a(((S) it.next()).o(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC1788b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            p464ze.f name = ((InterfaceC1788b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            p464ze.f fVar = (p464ze.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC1788b) obj3) instanceof InterfaceC1811z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                De.o oVar = De.o.f2426f;
                if (zBooleanValue) {
                    collectionL = new ArrayList();
                    for (Object obj4 : list) {
                        if (Intrinsics.b(((InterfaceC1811z) obj4).getName(), fVar)) {
                            collectionL.add(obj4);
                        }
                    }
                } else {
                    collectionL = CollectionsKt.l();
                }
                oVar.v(fVar, list3, collectionL, this.f6216b, new a(arrayList, this));
            }
        }
        return p034bf.a.c(arrayList);
    }

    private final List l() {
        return (List) Qe.m.a(this.f6217c, this, f6215d[0]);
    }

    @Override // Ke.l, Ke.k
    public Collection a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return CollectionsKt.l();
        }
        p034bf.j jVar = new p034bf.j();
        for (Object obj : listL) {
            if ((obj instanceof Z) && Intrinsics.b(((Z) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // Ke.l, Ke.k
    public Collection c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return CollectionsKt.l();
        }
        p034bf.j jVar = new p034bf.j();
        for (Object obj : listL) {
            if ((obj instanceof g0) && Intrinsics.b(((g0) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // Ke.l, Ke.n
    public Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return !kindFilter.a(d.f6199p.m()) ? CollectionsKt.l() : l();
    }

    protected abstract List j();

    protected final InterfaceC1791e m() {
        return this.f6216b;
    }
}
