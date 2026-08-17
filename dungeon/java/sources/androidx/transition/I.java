package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class I extends G {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f25517g = true;

    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    I() {
    }

    @Override // androidx.transition.B
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f25517g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f25517g = false;
            }
        }
    }
}
