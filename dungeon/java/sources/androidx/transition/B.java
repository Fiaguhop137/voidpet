package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f25511a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f25512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25513c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    B() {
    }

    public void a(View view) {
    }

    public float b(View view) {
        if (f25511a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f25511a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f25511a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f25511a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) {
        if (!f25513c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f25512b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f25513c = true;
        }
        Field field = f25512b;
        if (field != null) {
            try {
                f25512b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
