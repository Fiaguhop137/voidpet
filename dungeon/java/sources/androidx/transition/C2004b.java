package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2004b extends AbstractC2013k {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String[] f25537N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Property f25538O = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final Property f25539P = new C0323b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final Property f25540Q = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final Property f25541R = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Property f25542S = new e(PointF.class, "position");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final C2011i f25543T = new C2011i();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f25544M = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0323b extends Property {
        C0323b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            y.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f25545a;
        private final i mViewBounds;

        f(i iVar) {
            this.f25545a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC2013k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f25547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f25548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f25549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f25550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f25551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f25552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f25553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f25554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f25555i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f25556j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f25557k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f25558l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f25559m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f25560n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f25547a = view;
            this.f25548b = rect;
            this.f25549c = z10;
            this.f25550d = rect2;
            this.f25551e = z11;
            this.f25552f = i10;
            this.f25553g = i11;
            this.f25554h = i12;
            this.f25555i = i13;
            this.f25556j = i14;
            this.f25557k = i15;
            this.f25558l = i16;
            this.f25559m = i17;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
            Rect rect = (Rect) this.f25547a.getTag(AbstractC2010h.f25592b);
            this.f25547a.setTag(AbstractC2010h.f25592b, null);
            this.f25547a.setClipBounds(rect);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
            this.f25547a.setTag(AbstractC2010h.f25592b, this.f25547a.getClipBounds());
            this.f25547a.setClipBounds(this.f25551e ? null : this.f25550d);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
            this.f25560n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f25560n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f25549c) {
                    rect = this.f25548b;
                }
            } else if (!this.f25551e) {
                rect = this.f25550d;
            }
            this.f25547a.setClipBounds(rect);
            if (z10) {
                y.d(this.f25547a, this.f25552f, this.f25553g, this.f25554h, this.f25555i);
            } else {
                y.d(this.f25547a, this.f25556j, this.f25557k, this.f25558l, this.f25559m);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f25554h - this.f25552f, this.f25558l - this.f25556j);
            int iMax2 = Math.max(this.f25555i - this.f25553g, this.f25559m - this.f25557k);
            int i10 = z10 ? this.f25556j : this.f25552f;
            int i11 = z10 ? this.f25557k : this.f25553g;
            y.d(this.f25547a, i10, i11, iMax + i10, iMax2 + i11);
            this.f25547a.setClipBounds(z10 ? this.f25550d : this.f25548b);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    private static class h extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f25561a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f25562b;

        h(ViewGroup viewGroup) {
            this.f25562b = viewGroup;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
            x.b(this.f25562b, true);
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
            x.b(this.f25562b, false);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            if (!this.f25561a) {
                x.b(this.f25562b, false);
            }
            abstractC2013k.X(this);
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
            x.b(this.f25562b, false);
            this.f25561a = true;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f25566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f25567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f25568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25569g;

        i(View view) {
            this.f25567e = view;
        }

        private void b() {
            y.d(this.f25567e, this.f25563a, this.f25564b, this.f25565c, this.f25566d);
            this.f25568f = 0;
            this.f25569g = 0;
        }

        void a(PointF pointF) {
            this.f25565c = Math.round(pointF.x);
            this.f25566d = Math.round(pointF.y);
            int i10 = this.f25569g + 1;
            this.f25569g = i10;
            if (this.f25568f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f25563a = Math.round(pointF.x);
            this.f25564b = Math.round(pointF.y);
            int i10 = this.f25568f + 1;
            this.f25568f = i10;
            if (i10 == this.f25569g) {
                b();
            }
        }
    }

    private void n0(v vVar) {
        View view = vVar.f25665b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        vVar.f25664a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        vVar.f25664a.put("android:changeBounds:parent", vVar.f25665b.getParent());
        if (this.f25544M) {
            vVar.f25664a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public String[] I() {
        return f25537N;
    }

    @Override // androidx.transition.AbstractC2013k
    public void g(v vVar) {
        n0(vVar);
    }

    @Override // androidx.transition.AbstractC2013k
    public void l(v vVar) {
        Rect rect;
        n0(vVar);
        if (!this.f25544M || (rect = (Rect) vVar.f25665b.getTag(AbstractC2010h.f25592b)) == null) {
            return;
        }
        vVar.f25664a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC2013k
    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (vVar == null || vVar2 == null) {
            return null;
        }
        Map map = vVar.f25664a;
        Map map2 = vVar2.f25664a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = vVar2.f25665b;
        Rect rect2 = (Rect) vVar.f25664a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) vVar2.f25664a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) vVar.f25664a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) vVar2.f25664a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        if (this.f25544M) {
            y.d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : AbstractC2008f.a(view, f25542S, y().a(i12, i14, i13, i15));
            boolean z10 = rect4 == null;
            if (z10) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            int i25 = rect5 == null ? 1 : i11;
            Rect rect6 = i25 != 0 ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f25543T, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                objectAnimatorOfObject.addListener(gVar);
                b(gVar);
            }
            animatorC = u.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            y.d(view, i12, i14, i16, i18);
            if (i24 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? AbstractC2008f.a(view, f25540Q, y().a(i16, i18, i17, i19)) : AbstractC2008f.a(view, f25541R, y().a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = AbstractC2008f.a(view, f25542S, y().a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = AbstractC2008f.a(iVar, f25538O, y().a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = AbstractC2008f.a(iVar, f25539P, y().a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.b(viewGroup4, true);
            A().b(new h(viewGroup4));
        }
        return animatorC;
    }
}
