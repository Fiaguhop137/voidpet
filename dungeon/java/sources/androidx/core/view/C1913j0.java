package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.core.view.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1913j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f23221a;

    /* JADX INFO: renamed from: androidx.core.view.j0$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1915k0 f23222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f23223b;

        a(InterfaceC1915k0 interfaceC1915k0, View view) {
            this.f23222a = interfaceC1915k0;
            this.f23223b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f23222a.a(this.f23223b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f23222a.b(this.f23223b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f23222a.c(this.f23223b);
        }
    }

    C1913j0(View view) {
        this.f23221a = new WeakReference(view);
    }

    private void h(View view, InterfaceC1915k0 interfaceC1915k0) {
        if (interfaceC1915k0 != null) {
            view.animate().setListener(new a(interfaceC1915k0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1913j0 b(float f10) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f23221a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1913j0 e(long j10) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C1913j0 f(Interpolator interpolator) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1913j0 g(InterfaceC1915k0 interfaceC1915k0) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            h(view, interfaceC1915k0);
        }
        return this;
    }

    public C1913j0 i(long j10) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C1913j0 j(InterfaceC1919m0 interfaceC1919m0) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1919m0 != null ? new C1911i0(interfaceC1919m0, view) : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1913j0 l(float f10) {
        View view = (View) this.f23221a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
