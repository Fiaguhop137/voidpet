package Ud;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ud.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1521h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1507a f13603a = AbstractC1509b.a(C1511c.f13573a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1507a f13604b = AbstractC1509b.a(C1513d.f13576a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1507a f13605c = AbstractC1509b.a(C1515e.f13590a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1507a f13606d = AbstractC1509b.a(C1517f.f13595a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC1507a f13607e = AbstractC1509b.a(C1519g.f13600a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.o a(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Sd.d.b(m(it), CollectionsKt.l(), false, CollectionsKt.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.o c(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Sd.d.b(m(it), CollectionsKt.l(), true, CollectionsKt.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X d(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new X(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1549v0 e(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new C1549v0(it);
    }

    public static final kotlin.reflect.o k(Class jClass, List arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z10 ? (kotlin.reflect.o) f13606d.a(jClass) : (kotlin.reflect.o) f13605c.a(jClass);
        }
        return l(jClass, arguments, z10);
    }

    private static final kotlin.reflect.o l(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f13607e.a(cls);
        Pair pairA = Ad.v.a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(pairA);
        if (obj == null) {
            kotlin.reflect.o oVarB = Sd.d.b(m(cls), list, z10, CollectionsKt.l());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pairA, oVarB);
            obj = objPutIfAbsent == null ? oVarB : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (kotlin.reflect.o) obj;
    }

    public static final X m(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Object objA = f13603a.a(jClass);
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (X) objA;
    }

    public static final kotlin.reflect.f n(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return (kotlin.reflect.f) f13604b.a(jClass);
    }
}
