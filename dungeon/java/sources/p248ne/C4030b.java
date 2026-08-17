package p248ne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import p302qe.g;
import p302qe.n;
import p302qe.p;
import p302qe.r;
import p302qe.w;
import p464ze.f;

/* JADX INFO: renamed from: ne.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4030b implements InterfaceC4031c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f50212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f50213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f50216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f50217f;

    public C4030b(g jClass, Function1 memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f50212a = jClass;
        this.f50213b = memberFilter;
        C4029a c4029a = new C4029a(this);
        this.f50214c = c4029a;
        Sequence sequenceC = k.C(CollectionsKt.Z(jClass.C()), c4029a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceC) {
            f name = ((r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f50215d = linkedHashMap;
        Sequence sequenceC2 = k.C(CollectionsKt.Z(this.f50212a.y()), this.f50213b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceC2) {
            linkedHashMap2.put(((n) obj2).getName(), obj2);
        }
        this.f50216e = linkedHashMap2;
        Collection collectionM = this.f50212a.m();
        Function1 function1 = this.f50213b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionM) {
            if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e.e(N.e(CollectionsKt.w(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((w) obj4).getName(), obj4);
        }
        this.f50217f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(C4030b c4030b, r m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return ((Boolean) c4030b.f50213b.invoke(m10)).booleanValue() && !p.c(m10);
    }

    @Override // p248ne.InterfaceC4031c
    public Set a() {
        Sequence sequenceC = k.C(CollectionsKt.Z(this.f50212a.C()), this.f50214c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceC.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p248ne.InterfaceC4031c
    public Collection b(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.f50215d.get(name);
        return list != null ? list : CollectionsKt.l();
    }

    @Override // p248ne.InterfaceC4031c
    public Set c() {
        return this.f50217f.keySet();
    }

    @Override // p248ne.InterfaceC4031c
    public Set d() {
        Sequence sequenceC = k.C(CollectionsKt.Z(this.f50212a.y()), this.f50213b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceC.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p248ne.InterfaceC4031c
    public n e(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (n) this.f50216e.get(name);
    }

    @Override // p248ne.InterfaceC4031c
    public w f(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (w) this.f50217f.get(name);
    }
}
