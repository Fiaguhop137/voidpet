package C0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final R.i f1069a = R.l.e(new z0(), new A0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final R.i f1070b = R.l.e(new B0(), new C0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final R.i f1071c = R.l.e(new D0(), new E0());

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(R.m mVar, M0.e eVar) {
        return Integer.valueOf(eVar.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M0.e h(Object obj) {
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return M0.e.c(M0.e.d(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(R.m mVar, C c10) {
        return CollectionsKt.g(y0.Z0(Boolean.valueOf(c10.b())), y0.Z0(C0827h.d(c10.a())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C j(Object obj) {
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        Intrinsics.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        C0827h c0827h = obj3 != null ? (C0827h) obj3 : null;
        Intrinsics.c(c0827h);
        return new C(c0827h.j(), zBooleanValue, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(R.m mVar, M0.r rVar) {
        return CollectionsKt.g(y0.Z0(M0.r.b.d(rVar.b())), y0.Z0(Boolean.valueOf(rVar.c())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M0.r l(Object obj) {
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        M0.r.b bVar = obj2 != null ? (M0.r.b) obj2 : null;
        Intrinsics.c(bVar);
        int iJ = bVar.j();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.c(bool);
        return new M0.r(iJ, bool.booleanValue(), null);
    }

    public static final R.i m(C.a aVar) {
        return f1069a;
    }

    public static final R.i n(M0.e.a aVar) {
        return f1070b;
    }

    public static final R.i o(M0.r.a aVar) {
        return f1071c;
    }
}
