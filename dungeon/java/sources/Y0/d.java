package Y0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f16640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f16641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f16642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f16643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f16644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f16645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f16646g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0223d f16647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f16648b;

        a(C0223d c0223d, Object obj) {
            this.f16647a = c0223d;
            this.f16648b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16647a.f16653a = this.f16648b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f16649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0223d f16650b;

        b(Application application, C0223d c0223d) {
            this.f16649a = application;
            this.f16650b = c0223d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16649a.unregisterActivityLifecycleCallbacks(this.f16650b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f16652b;

        c(Object obj, Object obj2) {
            this.f16651a = obj;
            this.f16652b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f16643d;
                if (method != null) {
                    method.invoke(this.f16651a, this.f16652b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f16644e.invoke(this.f16651a, this.f16652b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: Y0.d$d, reason: collision with other inner class name */
    private static final class C0223d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f16654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16656d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f16657e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16658f = false;

        C0223d(Activity activity) {
            this.f16654b = activity;
            this.f16655c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f16654b == activity) {
                this.f16654b = null;
                this.f16657e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f16657e || this.f16658f || this.f16656d || !d.h(this.f16653a, this.f16655c, activity)) {
                return;
            }
            this.f16658f = true;
            this.f16653a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f16654b == activity) {
                this.f16656d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f16640a = clsA;
        f16641b = b();
        f16642c = f();
        f16643d = d(clsA);
        f16644e = c(clsA);
        f16645f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f16642c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f16646g.postAtFrontOfQueue(new c(f16641b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f16645f == null) {
            return false;
        }
        if (f16644e == null && f16643d == null) {
            return false;
        }
        try {
            Object obj2 = f16642c.get(activity);
            if (obj2 == null || (obj = f16641b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0223d c0223d = new C0223d(activity);
            application.registerActivityLifecycleCallbacks(c0223d);
            f16646g.post(new a(c0223d, obj2));
            try {
                if (g()) {
                    Method method = f16645f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f16646g.post(new b(application, c0223d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
