package io.sentry.android.replay;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f45592a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f45593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f45594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f45595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45596e;

    static final class a extends kotlin.jvm.internal.o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45597a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field invoke() throws NoSuchFieldException {
            Class clsC = v.f45592a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45598a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th) {
                Log.w("WindowManagerSpy", th);
                return null;
            }
        }
    }

    static final class c extends kotlin.jvm.internal.o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f45599a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class clsC = v.f45592a.c();
            if (clsC == null || (method = clsC.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        Ad.m mVar = Ad.m.NONE;
        f45593b = Ad.j.a(mVar, b.f45598a);
        f45594c = Ad.j.a(mVar, c.f45599a);
        f45595d = Ad.j.a(mVar, a.f45597a);
        f45596e = 8;
    }

    private v() {
    }

    private final Field b() {
        return (Field) f45595d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class c() {
        return (Class) f45593b.getValue();
    }

    private final Object d() {
        return f45594c.getValue();
    }

    public final void e(Function1 swap) {
        Field fieldB;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object objD = d();
            if (objD == null || (fieldB = f45592a.b()) == null) {
                return;
            }
            Object obj = fieldB.get(objD);
            Intrinsics.d(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            fieldB.set(objD, swap.invoke((ArrayList) obj));
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
        }
    }
}
