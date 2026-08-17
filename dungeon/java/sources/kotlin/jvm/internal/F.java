package kotlin.jvm.internal;

import Ud.b1;
import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.AbstractC3952n;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f48339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.d[] f48340b;

    static {
        G g10 = null;
        try {
            g10 = (G) b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g10 == null) {
            g10 = new G();
        }
        f48339a = g10;
        f48340b = new kotlin.reflect.d[0];
    }

    public static kotlin.reflect.g a(AbstractC3974k abstractC3974k) {
        return f48339a.a(abstractC3974k);
    }

    public static kotlin.reflect.d b(Class cls) {
        return f48339a.b(cls);
    }

    public static kotlin.reflect.f c(Class cls) {
        return f48339a.c(cls, "");
    }

    public static kotlin.reflect.i d(p pVar) {
        return f48339a.d(pVar);
    }

    public static kotlin.reflect.o e(Class cls) {
        return f48339a.j(b(cls), Collections.EMPTY_LIST, true);
    }

    public static kotlin.reflect.o f(Class cls, KTypeProjection kTypeProjection) {
        return f48339a.j(b(cls), Collections.singletonList(kTypeProjection), true);
    }

    public static kotlin.reflect.o g(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f48339a.j(b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static kotlin.reflect.o h(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f48339a.j(b(cls), AbstractC3952n.J0(kTypeProjectionArr), true);
    }

    public static kotlin.reflect.l i(t tVar) {
        return f48339a.e(tVar);
    }

    public static kotlin.reflect.m j(v vVar) {
        return f48339a.f(vVar);
    }

    public static kotlin.reflect.n k(x xVar) {
        return f48339a.g(xVar);
    }

    public static String l(InterfaceC3973j interfaceC3973j) {
        return f48339a.h(interfaceC3973j);
    }

    public static String m(o oVar) {
        return f48339a.i(oVar);
    }

    public static kotlin.reflect.o n(Class cls) {
        return f48339a.j(b(cls), Collections.EMPTY_LIST, false);
    }

    public static kotlin.reflect.o o(Class cls, KTypeProjection kTypeProjection) {
        return f48339a.j(b(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static kotlin.reflect.o p(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f48339a.j(b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}
