package p088ef;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I {
    private static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z10) {
        boolean zH = h(coroutineContext);
        boolean zH2 = h(coroutineContext2);
        if (!zH && !zH2) {
            return coroutineContext.P(coroutineContext2);
        }
        E e10 = new E();
        e10.f48338a = coroutineContext2;
        e eVar = e.f48283a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.b0(eVar, new G(e10, z10));
        if (zH2) {
            e10.f48338a = ((CoroutineContext) e10.f48338a).b0(eVar, new H());
        }
        return coroutineContext3.P((CoroutineContext) e10.f48338a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext e(E e10, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.P(element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.P(element);
    }

    public static final String g(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.b0(Boolean.FALSE, new F())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10;
    }

    public static final CoroutineContext j(O o10, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextD = d(o10.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextD == C3282e0.a() || coroutineContextD.e(d.f48281C1) != null) ? coroutineContextD : coroutineContextD.P(C3282e0.a());
    }

    public static final CoroutineContext k(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.P(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    public static final e1 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof C3274a0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof e1) {
                return (e1) eVar;
            }
        }
        return null;
    }

    public static final e1 m(b bVar, CoroutineContext coroutineContext, Object obj) {
        if (!(bVar instanceof kotlin.coroutines.jvm.internal.e) || coroutineContext.e(f1.f40833a) == null) {
            return null;
        }
        e1 e1VarL = l((kotlin.coroutines.jvm.internal.e) bVar);
        if (e1VarL != null) {
            e1VarL.Z0(coroutineContext, obj);
        }
        return e1VarL;
    }
}
