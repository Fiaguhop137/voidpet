package p323s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K f52644a = new K(0);

    public static final S a() {
        K k10 = f52644a;
        Intrinsics.d(k10, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return k10;
    }

    public static final K b() {
        return new K(0, 1, null);
    }
}
