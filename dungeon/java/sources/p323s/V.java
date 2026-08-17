package p323s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f52648a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U f52649b = new L(0);

    public static final U b() {
        U u10 = f52649b;
        Intrinsics.d(u10, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return u10;
    }

    public static final L c(Object obj, Object obj2) {
        L l10 = new L(2);
        l10.k(obj);
        l10.k(obj2);
        return l10;
    }
}
