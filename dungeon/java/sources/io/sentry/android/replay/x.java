package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f45669a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f45670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f45671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45672d;

    static final class a extends kotlin.jvm.internal.o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45673a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th) {
                Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th);
                return null;
            }
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45674a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class clsB = x.f45669a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e10) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + clsB + "#mWindow on API " + Build.VERSION.SDK_INT, e10);
                return null;
            }
        }
    }

    static {
        Ad.m mVar = Ad.m.NONE;
        f45670b = Ad.j.a(mVar, a.f45673a);
        f45671c = Ad.j.a(mVar, b.f45674a);
        f45672d = 8;
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class b() {
        return (Class) f45670b.getValue();
    }

    private final Field c() {
        return (Field) f45671c.getValue();
    }

    public final Window d(View maybeDecorView) throws IllegalAccessException {
        Field fieldC;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f45669a.c()) == null) {
            return null;
        }
        Object obj = fieldC.get(maybeDecorView);
        Intrinsics.d(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
