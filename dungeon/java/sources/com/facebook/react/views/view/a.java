package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f31261a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f31262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f31263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f31264d;

    private a() {
    }

    public static final void a(Canvas canvas, boolean z10) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        f31261a.b();
        if (z10) {
            try {
                Method method2 = f31262b;
                if (method2 != null) {
                    if (method2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z10 || (method = f31263c) == null) {
            return;
        }
        if (method == null) {
            throw new IllegalStateException("Required value was null.");
        }
        method.invoke(canvas, null);
    }

    private final void b() {
        if (f31264d) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object objInvoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                Intrinsics.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                f31262b = (Method) objInvoke;
                Object objInvoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                Intrinsics.d(objInvoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                f31263c = (Method) objInvoke2;
            } else {
                f31262b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f31263c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
            }
            Method method = f31262b;
            if (method != null && f31263c != null) {
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = f31263c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                f31264d = true;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
