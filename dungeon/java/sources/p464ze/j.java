package p464ze;

import Ad.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        c cVarB = i.f58641a.b();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarB, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        c cVarF = i.f58641a.f();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarF, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        c cVarC = i.f58641a.c();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarC, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        c cVarD = i.f58641a.d();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarD, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        c cVarE = i.f58641a.e();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarE, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.e(N.e(CollectionsKt.w(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pairA = v.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f58641a;
        c cVarF = iVar.a().f();
        f fVarP = f.p(fVar.i() + iVar.a().h().i());
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarF, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        c cVarG = i.f58641a.g();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarG, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        c cVarH = i.f58641a.h();
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarH, fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        c cVarF = i.f58641a.f();
        f fVarP = f.p('U' + bVar.h().i());
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return new b(cVarF, fVarP);
    }
}
