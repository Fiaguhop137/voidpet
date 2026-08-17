package p323s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4115o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f52743a = new F(0);

    public static final AbstractC4114n a() {
        F f10 = f52743a;
        Intrinsics.d(f10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return f10;
    }

    public static final AbstractC4114n b() {
        F f10 = f52743a;
        Intrinsics.d(f10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return f10;
    }

    public static final F c() {
        return new F(0, 1, null);
    }

    public static final F d(int i10, Object obj, int i11, Object obj2, int i12, Object obj3) {
        F f10 = new F(0, 1, null);
        f10.q(i10, obj);
        f10.q(i11, obj2);
        f10.q(i12, obj3);
        return f10;
    }
}
