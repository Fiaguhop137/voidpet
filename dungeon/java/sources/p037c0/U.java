package p037c0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f26688a = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f26689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f26690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f26691d;

    private U() {
    }

    public final void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            X.f26692a.a(canvas, z10);
            return;
        }
        if (!f26691d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f26689b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f26690c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f26689b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f26690c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f26689b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f26690c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f26691d = true;
        }
        if (z10) {
            try {
                Method method4 = f26689b;
                if (method4 != null) {
                    Intrinsics.c(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f26690c) == null) {
            return;
        }
        Intrinsics.c(method);
        method.invoke(canvas, null);
    }
}
