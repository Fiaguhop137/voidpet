package p255o3;

import Ad.InterfaceC0791a;
import Ad.q;
import Ad.r;
import I.H;
import I.Z0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import p237n3.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Z0 f50409a;

    static {
        Object objB;
        Z0 z10;
        try {
            q.a aVar = q.f327b;
            ClassLoader classLoader = i.class.getClassLoader();
            Intrinsics.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof Z0) {
                        z10 = (Z0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof InterfaceC0791a)) {
                    i10++;
                }
                z10 = null;
                break;
            }
            objB = q.b(z10);
        } catch (Throwable th) {
            q.a aVar2 = q.f327b;
            objB = q.b(r.a(th));
        }
        Z0 z0J = (Z0) (q.f(objB) ? null : objB);
        if (z0J == null) {
            z0J = H.j(new a());
        }
        f50409a = z0J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i b() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    public static final Z0 c() {
        return f50409a;
    }
}
