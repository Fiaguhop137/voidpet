package p401w5;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: w5.a$a, reason: collision with other inner class name */
    public static class C0726a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f56615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f56616b;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0726a c0726a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0726a.f56616b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0726a.f56615a) - i10) / f10) + i11), c0726a.f56616b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0726a.f56615a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0726a.f56616b) - i11) * f10) + i10), c0726a.f56615a), 1073741824);
        }
    }
}
