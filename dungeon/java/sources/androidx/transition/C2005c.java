package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2005c extends K {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC2013k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f25570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25571b = false;

        a(View view) {
            this.f25570a = view;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
            this.f25570a.setTag(AbstractC2010h.f25594d, null);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
            this.f25570a.setTag(AbstractC2010h.f25594d, Float.valueOf(this.f25570a.getVisibility() == 0 ? y.b(this.f25570a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void g(AbstractC2013k abstractC2013k, boolean z10) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            y.e(this.f25570a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f25571b) {
                this.f25570a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            y.e(this.f25570a, 1.0f);
            y.a(this.f25570a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f25570a.hasOverlappingRendering() && this.f25570a.getLayerType() == 0) {
                this.f25571b = true;
                this.f25570a.setLayerType(2, null);
            }
        }
    }

    public C2005c() {
    }

    public C2005c(int i10) {
        t0(i10);
    }

    private Animator u0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        y.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) y.f25673b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        A().b(aVar);
        return objectAnimatorOfFloat;
    }

    private static float w0(v vVar, float f10) {
        Float f11;
        return (vVar == null || (f11 = (Float) vVar.f25664a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.K, androidx.transition.AbstractC2013k
    public void l(v vVar) {
        super.l(vVar);
        Float fValueOf = (Float) vVar.f25665b.getTag(AbstractC2010h.f25594d);
        if (fValueOf == null) {
            fValueOf = vVar.f25665b.getVisibility() == 0 ? Float.valueOf(y.b(vVar.f25665b)) : Float.valueOf(0.0f);
        }
        vVar.f25664a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.K
    public Animator p0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        return u0(view, w0(vVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.K
    public Animator r0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        Animator animatorU0 = u0(view, w0(vVar, 1.0f), 0.0f);
        if (animatorU0 == null) {
            y.e(view, w0(vVar2, 1.0f));
        }
        return animatorU0;
    }
}
