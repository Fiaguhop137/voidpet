package Cb;

import Rb.u;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f1829a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f1830b = new ConcurrentHashMap();

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyOnWriteArrayList d(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyOnWriteArrayList e(Function1 function1, Object obj) {
        return (CopyOnWriteArrayList) function1.invoke(obj);
    }

    public final void c(String key, u promise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ((CopyOnWriteArrayList) f1830b.computeIfAbsent(key, new k(new j()))).add(promise);
    }

    public final void f(String key, String code, String str, Exception exc) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(code, "code");
        CopyOnWriteArrayList<u> copyOnWriteArrayList = (CopyOnWriteArrayList) f1830b.get(key);
        if (copyOnWriteArrayList != null) {
            for (u uVar : copyOnWriteArrayList) {
                Intrinsics.c(uVar);
                m.a(uVar, code, str, exc);
            }
        }
        f1830b.remove(key);
    }

    public final void g(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        CopyOnWriteArrayList<u> copyOnWriteArrayList = (CopyOnWriteArrayList) f1830b.get(key);
        if (copyOnWriteArrayList != null) {
            for (u uVar : copyOnWriteArrayList) {
                Intrinsics.c(uVar);
                m.b(uVar, obj);
            }
        }
        f1830b.remove(key);
    }
}
