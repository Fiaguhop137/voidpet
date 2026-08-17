package p195kf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B {
    public static Object a(Object obj) {
        return obj;
    }

    public static final A b(Object obj) {
        if (obj == AbstractC3923a.f48137a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (A) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC3923a.f48137a;
    }
}
