package p176je;

import Ad.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import p464ze.b;
import p464ze.c;
import p464ze.i;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f47360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f47361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f47362c;

    static {
        r rVar = new r();
        f47360a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f47361b = linkedHashMap;
        i iVar = i.f58641a;
        rVar.c(iVar.l(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.n(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.m(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = b.f58558d;
        rVar.c(aVar.c(new c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(v.a(((b) entry.getKey()).a(), ((b) entry.getValue()).a()));
        }
        f47362c = N.r(arrayList);
    }

    private r() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(b.f58558d.c(new c(str)));
        }
        return arrayList;
    }

    private final void c(b bVar, List list) {
        Map map = f47361b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final c b(c classFqName) {
        Intrinsics.checkNotNullParameter(classFqName, "classFqName");
        return (c) f47362c.get(classFqName);
    }
}
