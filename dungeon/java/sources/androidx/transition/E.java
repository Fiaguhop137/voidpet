package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class E extends B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f25514d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f25515e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    E() {
    }

    @Override // androidx.transition.B
    public void g(View view, Matrix matrix) {
        if (f25514d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25514d = false;
            }
        }
    }

    @Override // androidx.transition.B
    public void h(View view, Matrix matrix) {
        if (f25515e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25515e = false;
            }
        }
    }
}
