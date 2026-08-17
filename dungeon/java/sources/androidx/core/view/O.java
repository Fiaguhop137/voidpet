package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f23150a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f23151a;

        a(View view) {
            this.f23151a = view;
        }

        @Override // androidx.core.view.O.c
        void a() {
            View view = this.f23151a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f23151a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.O.c
        void b() {
            View viewFindViewById = this.f23151a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f23151a.getRootView().findViewById(16908290);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new N(viewFindViewById));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f23152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsetsController f23153c;

        b(View view) {
            super(view);
            this.f23152b = view;
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f23153c = windowInsetsController;
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f23153c;
            if (windowInsetsController == null) {
                View view2 = this.f23152b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            V v10 = new V(atomicBoolean);
            windowInsetsController.addOnControllableInsetsChangedListener(v10);
            if (!atomicBoolean.get() && (view = this.f23152b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f23152b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(v10);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void b() {
            View view = this.f23152b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f23153c;
            if (windowInsetsController == null) {
                View view2 = this.f23152b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    private static class c {
        c() {
        }

        abstract void a();

        abstract void b();
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f23150a = new b(view);
        } else {
            this.f23150a = new a(view);
        }
    }

    O(WindowInsetsController windowInsetsController) {
        this.f23150a = new b(windowInsetsController);
    }

    public void a() {
        this.f23150a.a();
    }

    public void b() {
        this.f23150a.b();
    }
}
