package Ub;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private final a e(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new c(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Constructor constructor) {
        return constructor.newInstance(null);
    }

    private final a g(kotlin.reflect.d dVar) {
        Iterator it = dVar.g().iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
                break;
            }
            Object next = it.next();
            List parameters = ((kotlin.reflect.g) next).getParameters();
            if (parameters == null || !parameters.isEmpty()) {
                Iterator it2 = parameters.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((j) it2.next()).u()) {
                        }
                    }
                }
            }
            if (!z10) {
                z10 = true;
                obj = next;
            }
            obj = null;
            break;
        }
        kotlin.reflect.g gVar = (kotlin.reflect.g) obj;
        if (gVar == null) {
            return null;
        }
        return new d(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(kotlin.reflect.g gVar) {
        return gVar.callBy(N.i());
    }

    private final a i(Class cls) {
        return new b(i.f13454a.d(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(i iVar) {
        return iVar.b();
    }

    public final a d(kotlin.reflect.d clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        a aVarE = e(Ld.a.b(clazz));
        return (aVarE == null && (aVarE = g(clazz)) == null) ? i(Ld.a.b(clazz)) : aVarE;
    }
}
