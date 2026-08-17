package p323s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f52688a = new P(0);

    public static final b0 a() {
        P p10 = f52688a;
        Intrinsics.d(p10, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return p10;
    }

    public static final P b() {
        return new P(0, 1, null);
    }

    public static final P c(Object obj, Object obj2) {
        P p10 = new P(2);
        p10.w(obj);
        p10.w(obj2);
        return p10;
    }
}
