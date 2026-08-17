package com.google.android.material.appbar;

import Y8.j;
import Y8.k;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C;
import androidx.core.view.C0;
import androidx.core.view.C1894a;
import androidx.core.view.H;
import androidx.core.view.Z;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p217m1.B;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f36071z = j.f17203h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0 f36078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f36079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference f36085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f36086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ValueAnimator f36087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f36088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f36089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f36090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TimeInterpolator f36091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f36092u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f36093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f36094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f36095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Behavior f36096y;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f36097k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f36098l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f36099m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f36100n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference f36101o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f36102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f36103b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f36102a = coordinatorLayout;
                this.f36103b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f36102a, this.f36103b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C1894a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f36105d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f36106e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f36105d = appBarLayout;
                this.f36106e = coordinatorLayout;
            }

            @Override // androidx.core.view.C1894a
            public void g(View view, B b10) {
                View viewF0;
                super.g(view, b10);
                b10.z0(ScrollView.class.getName());
                if (this.f36105d.getTotalScrollRange() == 0 || (viewF0 = BaseBehavior.this.f0(this.f36106e)) == null || !BaseBehavior.this.b0(this.f36105d)) {
                    return;
                }
                if (BaseBehavior.this.M() != (-this.f36105d.getTotalScrollRange())) {
                    b10.b(B.a.f48970q);
                    b10.c1(true);
                }
                if (BaseBehavior.this.M() != 0) {
                    if (!viewF0.canScrollVertically(-1)) {
                        b10.b(B.a.f48971r);
                        b10.c1(true);
                    } else if ((-this.f36105d.getDownNestedPreScrollRange()) != 0) {
                        b10.b(B.a.f48971r);
                        b10.c1(true);
                    }
                }
            }

            @Override // androidx.core.view.C1894a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f36105d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.M() != 0) {
                    View viewF0 = BaseBehavior.this.f0(this.f36106e);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f36105d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f36105d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.q(this.f36106e, this.f36105d, viewF0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        protected static class c extends p325s1.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f36108c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f36109d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f36110e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            float f36111f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f36112g;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f36108c = parcel.readByte() != 0;
                this.f36109d = parcel.readByte() != 0;
                this.f36110e = parcel.readInt();
                this.f36111f = parcel.readFloat();
                this.f36112g = parcel.readByte() != 0;
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p325s1.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f36108c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f36109d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f36110e);
                parcel.writeFloat(this.f36111f);
                parcel.writeByte(this.f36112g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (Z.M(coordinatorLayout)) {
                return;
            }
            Z.m0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(M() - i10);
            float fAbs = Math.abs(f10);
            W(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iM = M();
            if (iM == i10) {
                ValueAnimator valueAnimator = this.f36099m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f36099m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f36099m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f36099m = valueAnimator3;
                valueAnimator3.setInterpolator(Z8.a.f18805e);
                this.f36099m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f36099m.setDuration(Math.min(i11, 600));
            this.f36099m.setIntValues(iM, i10);
            this.f36099m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f36116a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof C) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= Z.A(childAt);
                        }
                    }
                    if (Z.w(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listT = coordinatorLayout.t(appBarLayout);
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) ((View) listT.get(i10)).getLayoutParams()).e();
                if (cVarE instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarE).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iE0 == 0 && Z.w(appBarLayout) && Z.w(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iA += Z.A(childAt);
                    } else if (a0(iC, 5)) {
                        int iA2 = Z.A(childAt) + iA;
                        if (iM < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        iA -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, p092f1.a.b(X(iM, iA, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewD0 = d0(appBarLayout, i10);
            boolean z11 = false;
            if (viewD0 != null) {
                int iC = ((d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = Z.A(viewD0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewD0.getBottom() - iA) - appBarLayout.getTopInset()) : (-i10) >= (viewD0.getBottom() - iA) - appBarLayout.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                z11 = appBarLayout.z(c0(coordinatorLayout));
            }
            boolean zW = appBarLayout.w(z11);
            if (z10 || (zW && v0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        int M() {
            return E() + this.f36097k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f36101o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.w(appBarLayout.z(c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zL = super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            c cVar = this.f36100n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cVar.f36108c) {
                P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (cVar.f36109d) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(cVar.f36110e);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f36100n.f36112g ? Z.A(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f36100n.f36111f)));
            }
            appBarLayout.s();
            this.f36100n = null;
            G(p092f1.a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            x0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.q(E());
            U(coordinatorLayout, appBarLayout);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.L(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            AppBarLayout appBarLayout2;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = O(coordinatorLayout, appBarLayout2, i11, i14, i15);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.o()) {
                appBarLayout2.w(appBarLayout2.z(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = O(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                U(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof c) {
                s0((c) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f36100n.f());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f36100n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            c cVarT0 = t0(parcelableY, appBarLayout);
            return cVarT0 == null ? parcelableY : cVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.o() || Z(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f36099m) != null) {
                valueAnimator.cancel();
            }
            this.f36101o = null;
            this.f36098l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f36098l == 0 || i10 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.w(appBarLayout.z(view));
                }
            }
            this.f36101o = new WeakReference(view);
        }

        void s0(c cVar, boolean z10) {
            if (this.f36100n == null || z10) {
                this.f36100n = cVar;
            }
        }

        c t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = p325s1.a.f53241b;
                    }
                    c cVar = new c(parcelable);
                    boolean z10 = iE == 0;
                    cVar.f36109d = z10;
                    cVar.f36108c = !z10 && (-iE) >= appBarLayout.getTotalScrollRange();
                    cVar.f36110e = i10;
                    cVar.f36112g = bottom == Z.A(childAt) + appBarLayout.getTopInset();
                    cVar.f36111f = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iM = M();
            int i13 = 0;
            if (i11 == 0 || iM < i11 || iM > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f36097k = 0;
            } else {
                int iB = p092f1.a.b(i10, i11, i12);
                if (iM != iB) {
                    int iI0 = appBarLayout.i() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i14 = iM - iB;
                    this.f36097k = iB - iI0;
                    if (zG) {
                        while (i13 < appBarLayout.getChildCount()) {
                            d dVar = (d) appBarLayout.getChildAt(i13).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!zG && appBarLayout.i()) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.q(E());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    x0(coordinatorLayout2, appBarLayout2, iB, iB < iM ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            U(coordinatorLayout2, appBarLayout2);
            return i13;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f17600p5);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f17609q5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                return ((BaseBehavior) cVarE).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                Z.X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarE).f36097k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.w(appBarLayout.z(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.e
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.e
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.e
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                Z.m0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.s(view));
            if (appBarLayoutH != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f36143d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.t(false, !z10);
                    return true;
                }
            }
            return false;
        }
    }

    class a implements H {
        a() {
        }

        @Override // androidx.core.view.H
        public C0 a(View view, C0 c10) {
            return AppBarLayout.this.r(c10);
        }
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f36114a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f36115b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f36114a, appBarLayout, view);
            float fAbs = this.f36114a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                Z.t0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - p092f1.a.a(Math.abs(fAbs / this.f36114a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f36114a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f36115b);
            this.f36115b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f36115b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            Z.t0(view, this.f36115b);
        }
    }

    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f36117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f36118c;

        public d(int i10, int i11) {
            super(i10, i11);
            this.f36116a = 1;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36116a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f17648v);
            this.f36116a = typedArrayObtainStyledAttributes.getInt(k.f17666x, 0);
            f(typedArrayObtainStyledAttributes.getInt(k.f17657w, 0));
            if (typedArrayObtainStyledAttributes.hasValue(k.f17675y)) {
                this.f36118c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(k.f17675y, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36116a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f36116a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36116a = 1;
        }

        private b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f36117b;
        }

        public int c() {
            return this.f36116a;
        }

        public Interpolator d() {
            return this.f36118c;
        }

        boolean e() {
            int i10 = this.f36116a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f36117b = a(i10);
        }

        public void g(int i10) {
            this.f36116a = i10;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y8.a.f16979a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36071z;
        super(p351t9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f36073b = -1;
        this.f36074c = -1;
        this.f36075d = -1;
        this.f36077f = 0;
        this.f36089r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = m.i(context2, attributeSet, k.f17549k, i10, i11, new int[0]);
        Z.q0(this, typedArrayI.getDrawable(k.f17558l));
        ColorStateList colorStateListA = p243n9.c.a(context2, typedArrayI, k.f17612r);
        this.f36086o = colorStateListA != null;
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            p297q9.g gVar = new p297q9.g();
            gVar.W(colorStateListF);
            if (colorStateListA != null) {
                l(gVar, colorStateListF, colorStateListA);
            } else {
                m(context2, gVar);
            }
        }
        this.f36090s = p207l9.d.f(context2, Y8.a.f16960H, getResources().getInteger(Y8.f.f17145a));
        this.f36091t = p207l9.d.g(context2, Y8.a.f16970R, Z8.a.f18801a);
        if (typedArrayI.hasValue(k.f17594p)) {
            u(typedArrayI.getBoolean(k.f17594p, false), false, false);
        }
        if (typedArrayI.hasValue(k.f17585o)) {
            h.b(this, typedArrayI.getDimensionPixelSize(k.f17585o, 0));
        }
        if (i12 >= 26) {
            if (typedArrayI.hasValue(k.f17576n)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(k.f17576n, false));
            }
            if (typedArrayI.hasValue(k.f17567m)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(k.f17567m, false));
            }
        }
        this.f36095x = getResources().getDimension(Y8.c.f17043a);
        this.f36083l = typedArrayI.getBoolean(k.f17603q, false);
        this.f36084m = typedArrayI.getResourceId(k.f17621s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(k.f17630t));
        typedArrayI.recycle();
        Z.A0(this, new a());
    }

    private boolean A() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !Z.w(childAt)) {
                return true;
            }
        }
        return false;
    }

    private void B(float f10, float f11) {
        ValueAnimator valueAnimator = this.f36087p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f36087p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f36090s);
        this.f36087p.setInterpolator(this.f36091t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f36088q;
        if (animatorUpdateListener != null) {
            this.f36087p.addUpdateListener(animatorUpdateListener);
        }
        this.f36087p.start();
    }

    private void C() {
        setWillNotDraw(!y());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, p297q9.g gVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.V(fFloatValue);
        Drawable drawable = appBarLayout.f36093v;
        if (drawable instanceof p297q9.g) {
            ((p297q9.g) drawable).V(fFloatValue);
        }
        Iterator it = appBarLayout.f36089r.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            gVar.y();
            throw null;
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, p297q9.g gVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iJ = p118g9.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.W(ColorStateList.valueOf(iJ));
        if (appBarLayout.f36093v != null && (num2 = appBarLayout.f36094w) != null && num2.equals(num)) {
            p038c1.a.n(appBarLayout.f36093v, iJ);
        }
        if (appBarLayout.f36089r.isEmpty()) {
            return;
        }
        Iterator it = appBarLayout.f36089r.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (gVar.v() != null) {
                throw null;
            }
        }
    }

    private void c() {
        WeakReference weakReference = this.f36085n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f36085n = null;
    }

    private Integer d() {
        Drawable drawable = this.f36093v;
        if (drawable instanceof p297q9.g) {
            return Integer.valueOf(((p297q9.g) drawable).y());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f36085n == null && (i10 = this.f36084m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f36084m);
            }
            if (viewFindViewById != null) {
                this.f36085n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f36085n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(p297q9.g gVar, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.f36088q = new com.google.android.material.appbar.b(this, colorStateList, colorStateList2, gVar, p118g9.a.f(getContext(), Y8.a.f17002s));
        Z.q0(this, gVar);
    }

    private void m(Context context, p297q9.g gVar) {
        gVar.L(context);
        this.f36088q = new com.google.android.material.appbar.c(this, gVar);
        Z.q0(this, gVar);
    }

    private void n() {
        Behavior behavior = this.f36096y;
        BaseBehavior.c cVarT0 = (behavior == null || this.f36073b == -1 || this.f36077f != 0) ? null : behavior.t0(p325s1.a.f53241b, this);
        this.f36073b = -1;
        this.f36074c = -1;
        this.f36075d = -1;
        if (cVarT0 != null) {
            this.f36096y.s0(cVarT0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof p297q9.g;
    }

    private void u(boolean z10, boolean z11, boolean z12) {
        this.f36077f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean v(boolean z10) {
        if (this.f36081j == z10) {
            return false;
        }
        this.f36081j = z10;
        refreshDrawableState();
        return true;
    }

    private boolean y() {
        return this.f36093v != null && getTopInset() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (y()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f36072a);
            this.f36093v.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f36093v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f36096y = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i10 = this.f36074c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f36116a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iA = Z.A(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            iA = measuredHeight - Z.A(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && Z.w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iA;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f36074c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f36075d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i12 = dVar.f36116a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i12 & 2) != 0) {
                    iA -= Z.A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iA);
        this.f36075d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f36084m;
    }

    public p297q9.g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof p297q9.g) {
            return (p297q9.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = Z.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            iA = childCount >= 1 ? Z.A(getChildAt(childCount - 1)) : 0;
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    int getPendingAction() {
        return this.f36077f;
    }

    public Drawable getStatusBarForeground() {
        return this.f36093v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0 c10 = this.f36078g;
        if (c10 != null) {
            return c10.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f36073b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f36116a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i11 == 0 && Z.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iA -= Z.A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iA);
        this.f36073b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean i() {
        return this.f36076e;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f36083l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        p297q9.h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f36092u == null) {
            this.f36092u = new int[4];
        }
        int[] iArr = this.f36092u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f36081j;
        int i11 = Y8.a.f16978Z;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f36082k) ? Y8.a.f16980a0 : -Y8.a.f16980a0;
        int i12 = Y8.a.f16975W;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f36082k) ? Y8.a.f16974V : -Y8.a.f16974V;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (Z.w(this) && A()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                Z.X(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f36076e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f36076e = true;
                break;
            }
        }
        Drawable drawable = this.f36093v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f36080i) {
            return;
        }
        if (!this.f36083l && !j()) {
            z11 = false;
        }
        v(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && Z.w(this) && A()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = p092f1.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    void q(int i10) {
        this.f36072a = i10;
        if (!willNotDraw()) {
            Z.d0(this);
        }
        List list = this.f36079h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                android.support.v4.media.session.b.a(this.f36079h.get(i11));
            }
        }
    }

    C0 r(C0 c10) {
        C0 c11 = Z.w(this) ? c10 : null;
        if (!p199l1.c.a(this.f36078g, c11)) {
            this.f36078g = c11;
            C();
            requestLayout();
        }
        return c10;
    }

    void s() {
        this.f36077f = 0;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p297q9.h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        t(z10, Z.R(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f36083l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f36084m = -1;
        if (view == null) {
            c();
        } else {
            this.f36085n = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f36084m = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f36080i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f36093v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f36093v = drawable != null ? drawable.mutate() : null;
            this.f36094w = d();
            Drawable drawable3 = this.f36093v;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f36093v.setState(getDrawableState());
                }
                p038c1.a.m(this.f36093v, Z.z(this));
                this.f36093v.setVisible(getVisibility() == 0, false);
                this.f36093v.setCallback(this);
            }
            C();
            Z.d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(p161j.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f36093v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public void t(boolean z10, boolean z11) {
        u(z10, z11, true);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f36093v;
    }

    boolean w(boolean z10) {
        return x(z10, !this.f36080i);
    }

    boolean x(boolean z10, boolean z11) {
        if (!z11 || this.f36082k == z10) {
            return false;
        }
        this.f36082k = z10;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        if (this.f36086o) {
            B(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f36083l) {
            return true;
        }
        B(z10 ? 0.0f : this.f36095x, z10 ? this.f36095x : 0.0f);
        return true;
    }

    boolean z(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }
}
