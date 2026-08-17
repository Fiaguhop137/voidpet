package Ud;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ud.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1509b {
    static {
        Object objB;
        try {
            Ad.q.a aVar = Ad.q.f327b;
            objB = Ad.q.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Ad.q.a aVar2 = Ad.q.f327b;
            objB = Ad.q.b(Ad.r.a(th));
        }
        if (Ad.q.g(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = Ad.q.b(objB);
        Boolean bool = Boolean.FALSE;
        if (Ad.q.f(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final AbstractC1507a a(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new C1523i(compute);
    }
}
