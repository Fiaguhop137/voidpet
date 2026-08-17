package Ud;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ud.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1523i extends AbstractC1507a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f13609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f13610b;

    public C1523i(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f13609a = compute;
        this.f13610b = new ConcurrentHashMap();
    }

    @Override // Ud.AbstractC1507a
    public Object a(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f13610b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f13609a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
