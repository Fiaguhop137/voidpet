package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.K;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f24072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f24073b;

        a(Animator animator) {
            this.f24072a = null;
            this.f24073b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f24072a = animation;
            this.f24073b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f24074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f24075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24078e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f24078e = true;
            this.f24074a = viewGroup;
            this.f24075b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f24078e = true;
            if (this.f24076c) {
                return !this.f24077d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f24076c = true;
                K.a(this.f24074a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f24078e = true;
            if (this.f24076c) {
                return !this.f24077d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f24076c = true;
                K.a(this.f24074a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24076c || !this.f24078e) {
                this.f24074a.endViewTransition(this.f24075b);
                this.f24077d = true;
            } else {
                this.f24078e = false;
                this.f24074a.post(this);
            }
        }
    }

    private static int a(i iVar, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? iVar.W() : iVar.X();
        }
        return z10 ? iVar.H() : iVar.K();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    static a b(Context context, i iVar, boolean z10, boolean z11) {
        Animator animatorLoadAnimator;
        int iS = iVar.S();
        int iA = a(iVar, z10, z11);
        iVar.L1(0, 0, 0, 0);
        ViewGroup viewGroup = iVar.f23992H;
        if (viewGroup != null && viewGroup.getTag(F1.b.f2910c) != null) {
            iVar.f23992H.setTag(F1.b.f2910c, null);
        }
        ViewGroup viewGroup2 = iVar.f23992H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationE0 = iVar.E0(iS, z10, iA);
        if (animationE0 != null) {
            return new a(animationE0);
        }
        Animator animatorF0 = iVar.F0(iS, z10, iA);
        if (animatorF0 != null) {
            return new a(animatorF0);
        }
        if (iA == 0 && iS != 0) {
            iA = d(context, iS, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? F1.a.f2906e : F1.a.f2907f;
        }
        if (i10 == 8194) {
            return z10 ? F1.a.f2902a : F1.a.f2903b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, 16842938) : c(context, 16842939);
        }
        if (i10 == 4099) {
            return z10 ? F1.a.f2904c : F1.a.f2905d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, 16842936) : c(context, 16842937);
    }
}
