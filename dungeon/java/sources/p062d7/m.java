package p062d7;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f39858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f39859c;

    public static final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f39860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f39861b;

        public a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39860a = new WeakReference(view);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = (View) this.f39860a.get();
            if (view == null || !this.f39861b) {
                return;
            }
            view.setLayerType(0, null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = (View) this.f39860a.get();
            if (view != null && view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f39861b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public m(View view, float f10, float f11) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39857a = f10;
        this.f39858b = new WeakReference(view);
        this.f39859c = f11 - f10;
        setAnimationListener(new a(view));
        b.a("OpacityAnimation", p348t6.a.ERROR);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        View view = (View) this.f39858b.get();
        if (view != null) {
            view.setAlpha(this.f39857a + (this.f39859c * f10));
        }
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}
