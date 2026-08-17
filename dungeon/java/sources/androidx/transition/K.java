package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends AbstractC2013k {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String[] f25518N = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f25519M = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC2013k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f25520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f25522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f25523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f25525f = false;

        a(View view, int i10, boolean z10) {
            this.f25520a = view;
            this.f25521b = i10;
            this.f25522c = (ViewGroup) view.getParent();
            this.f25523d = z10;
            i(true);
        }

        private void h() {
            if (!this.f25525f) {
                y.f(this.f25520a, this.f25521b);
                ViewGroup viewGroup = this.f25522c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f25523d || this.f25524e == z10 || (viewGroup = this.f25522c) == null) {
                return;
            }
            this.f25524e = z10;
            x.b(viewGroup, z10);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
            i(true);
            if (this.f25525f) {
                return;
            }
            y.f(this.f25520a, 0);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
            i(false);
            if (this.f25525f) {
                return;
            }
            y.f(this.f25520a, this.f25521b);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            abstractC2013k.X(this);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25525f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                y.f(this.f25520a, 0);
                ViewGroup viewGroup = this.f25522c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC2013k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f25526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f25527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f25528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25529d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f25526a = viewGroup;
            this.f25527b = view;
            this.f25528c = view2;
        }

        private void h() {
            this.f25528c.setTag(AbstractC2010h.f25591a, null);
            this.f25526a.getOverlay().remove(this.f25527b);
            this.f25529d = false;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            abstractC2013k.X(this);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
            if (this.f25529d) {
                h();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f25526a.getOverlay().remove(this.f25527b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f25527b.getParent() == null) {
                this.f25526a.getOverlay().add(this.f25527b);
            } else {
                K.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f25528c.setTag(AbstractC2010h.f25591a, this.f25527b);
                this.f25526a.getOverlay().add(this.f25527b);
                this.f25529d = true;
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f25531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f25532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f25535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f25536f;

        c() {
        }
    }

    private void n0(v vVar) {
        vVar.f25664a.put("android:visibility:visibility", Integer.valueOf(vVar.f25665b.getVisibility()));
        vVar.f25664a.put("android:visibility:parent", vVar.f25665b.getParent());
        int[] iArr = new int[2];
        vVar.f25665b.getLocationOnScreen(iArr);
        vVar.f25664a.put("android:visibility:screenLocation", iArr);
    }

    private c o0(v vVar, v vVar2) {
        c cVar = new c();
        cVar.f25531a = false;
        cVar.f25532b = false;
        if (vVar == null || !vVar.f25664a.containsKey("android:visibility:visibility")) {
            cVar.f25533c = -1;
            cVar.f25535e = null;
        } else {
            cVar.f25533c = ((Integer) vVar.f25664a.get("android:visibility:visibility")).intValue();
            cVar.f25535e = (ViewGroup) vVar.f25664a.get("android:visibility:parent");
        }
        if (vVar2 == null || !vVar2.f25664a.containsKey("android:visibility:visibility")) {
            cVar.f25534d = -1;
            cVar.f25536f = null;
        } else {
            cVar.f25534d = ((Integer) vVar2.f25664a.get("android:visibility:visibility")).intValue();
            cVar.f25536f = (ViewGroup) vVar2.f25664a.get("android:visibility:parent");
        }
        if (vVar != null && vVar2 != null) {
            int i10 = cVar.f25533c;
            int i11 = cVar.f25534d;
            if (i10 != i11 || cVar.f25535e != cVar.f25536f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f25532b = false;
                        cVar.f25531a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f25532b = true;
                        cVar.f25531a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f25536f == null) {
                        cVar.f25532b = false;
                        cVar.f25531a = true;
                        return cVar;
                    }
                    if (cVar.f25535e == null) {
                        cVar.f25532b = true;
                        cVar.f25531a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (vVar == null && cVar.f25534d == 0) {
                cVar.f25532b = true;
                cVar.f25531a = true;
                return cVar;
            }
            if (vVar2 == null && cVar.f25533c == 0) {
                cVar.f25532b = false;
                cVar.f25531a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC2013k
    public String[] I() {
        return f25518N;
    }

    @Override // androidx.transition.AbstractC2013k
    public boolean K(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f25664a.containsKey("android:visibility:visibility") != vVar.f25664a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarO0 = o0(vVar, vVar2);
        return cVarO0.f25531a && (cVarO0.f25533c == 0 || cVarO0.f25534d == 0);
    }

    @Override // androidx.transition.AbstractC2013k
    public void g(v vVar) {
        n0(vVar);
    }

    @Override // androidx.transition.AbstractC2013k
    public void l(v vVar) {
        n0(vVar);
    }

    @Override // androidx.transition.AbstractC2013k
    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        c cVarO0 = o0(vVar, vVar2);
        if (!cVarO0.f25531a) {
            return null;
        }
        if (cVarO0.f25535e == null && cVarO0.f25536f == null) {
            return null;
        }
        return cVarO0.f25532b ? q0(viewGroup, vVar, cVarO0.f25533c, vVar2, cVarO0.f25534d) : s0(viewGroup, vVar, cVarO0.f25533c, vVar2, cVarO0.f25534d);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    public Animator q0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        if ((this.f25519M & 1) != 1 || vVar2 == null) {
            return null;
        }
        if (vVar == null) {
            View view = (View) vVar2.f25665b.getParent();
            if (o0(w(view, false), J(view, false)).f25531a) {
                return null;
            }
        }
        return p0(viewGroup, vVar2.f25665b, vVar, vVar2);
    }

    public abstract Animator r0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator s0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.f25519M & 2) != 2 || vVar == null) {
            return null;
        }
        View view3 = vVar.f25665b;
        View viewA = vVar2 != null ? vVar2.f25665b : null;
        View view4 = (View) view3.getTag(AbstractC2010h.f25591a);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z10 = false;
                } else {
                    viewA = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z10 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (o0(J(view5, true), w(view5, true)).f25531a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f25630w) {
                            }
                        } else {
                            viewA = u.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z11 = false;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z11 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            y.f(view2, 0);
            Animator animatorR0 = r0(viewGroup, view2, vVar, vVar2);
            if (animatorR0 == null) {
                y.f(view2, visibility);
                return animatorR0;
            }
            a aVar = new a(view2, i11, true);
            animatorR0.addListener(aVar);
            A().b(aVar);
            return animatorR0;
        }
        if (!z11) {
            int[] iArr = (int[]) vVar.f25664a.get("android:visibility:screenLocation");
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i12 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i13 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorR1 = r0(viewGroup, view4, vVar, vVar2);
        if (!z11) {
            if (animatorR1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorR1;
            }
            view3.setTag(AbstractC2010h.f25591a, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorR1.addListener(bVar);
            animatorR1.addPauseListener(bVar);
            A().b(bVar);
        }
        return animatorR1;
    }

    public void t0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f25519M = i10;
    }
}
