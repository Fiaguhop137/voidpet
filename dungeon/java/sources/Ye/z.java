package Ye;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f17930a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f17931b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(z zVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return zVar.f17931b.getAndIncrement();
    }

    public final Map b() {
        return this.f17930a;
    }

    public abstract int c(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    public final n d(kotlin.reflect.d kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new n(f(kClass));
    }

    public final int e(String keyQualifiedName) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        return c(this.f17930a, keyQualifiedName, new y(this));
    }

    public final int f(kotlin.reflect.d kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String strN = kClass.n();
        Intrinsics.c(strN);
        return e(strN);
    }

    protected final Collection h() {
        Collection collectionValues = this.f17930a.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
