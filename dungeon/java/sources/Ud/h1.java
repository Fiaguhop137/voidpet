package Ud;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;
import p123ge.AbstractC3442f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        Intrinsics.c(cls);
        return AbstractC3442f.f(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb2.append(AbstractC3952n.n0(parameterTypes, "", "(", ")", 0, null, g1.f13602a, 24, null));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(AbstractC3442f.f(returnType));
        return sb2.toString();
    }
}
