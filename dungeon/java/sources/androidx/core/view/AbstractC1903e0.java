package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: renamed from: androidx.core.view.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1903e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WindowInsets f23213a = C0.f23104b.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f23214b = false;

    /* JADX INFO: renamed from: androidx.core.view.e0$a */
    static class a {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    public static /* synthetic */ WindowInsets a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f23213a;
    }

    static WindowInsets b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(X0.c.f15146M);
        Object tag2 = view.getTag(X0.c.f15153T);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        WindowInsets[] windowInsetsArr = {f23213a};
        view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1901d0(windowInsetsArr, onApplyWindowInsetsListener));
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(X0.c.f15145L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b(viewGroup.getChildAt(i10), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : f23213a;
    }

    public static boolean c(ViewGroup viewGroup) {
        return a.a(viewGroup);
    }
}
