package p195kf;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p088ef.X0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f48127a = new D("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f48128b = new H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f48129c = new I();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f48130d = new J();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof X0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X0 e(X0 x10, CoroutineContext.Element element) {
        if (x10 != null) {
            return x10;
        }
        if (element instanceof X0) {
            return (X0) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj == f48127a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(coroutineContext);
            return;
        }
        Object objB0 = coroutineContext.b0(null, f48129c);
        Intrinsics.d(objB0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((X0) objB0).F(coroutineContext, obj);
    }

    public static final Object g(CoroutineContext coroutineContext) {
        Object objB0 = coroutineContext.b0(0, f48128b);
        Intrinsics.c(objB0);
        return objB0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O h(O o10, CoroutineContext.Element element) {
        if (element instanceof X0) {
            X0 x10 = (X0) element;
            o10.a(x10, x10.c0(o10.f48133a));
        }
        return o10;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f48127a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.b0(new O(coroutineContext, ((Number) obj).intValue()), f48130d);
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((X0) obj).c0(coroutineContext);
    }
}
