package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    @NotNull
    public final String getMediationNetwork() {
        Object objB;
        try {
            Ad.q.a aVar = Ad.q.f327b;
            Field declaredField = p113g4.a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.d(obj, "");
            objB = Ad.q.b((String) obj);
        } catch (Throwable th) {
            Ad.q.a aVar2 = Ad.q.f327b;
            objB = Ad.q.b(Ad.r.a(th));
        }
        return (String) (Ad.q.f(objB) ? "" : objB);
    }
}
