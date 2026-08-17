package com.google.android.material.sidesheet;

import Y8.i;
import Y8.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1929s;
import androidx.core.view.Z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p217m1.B;
import p217m1.E;
import p297q9.g;
import p297q9.k;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f36887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f36888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f36889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f36890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f36891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f36892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f36893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p343t1.c f36897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f36899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f36904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f36905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f36907u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p207l9.c f36908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f36910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p343t1.c.AbstractC0673c f36911y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f36886z = i.f17169B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f36885A = j.f17208m;

    class a extends p343t1.c.AbstractC0673c {
        a() {
        }

        @Override // p343t1.c.AbstractC0673c
        public int a(View view, int i10, int i11) {
            return p092f1.a.b(i10, SideSheetBehavior.this.f36887a.f(), SideSheetBehavior.this.f36887a.e());
        }

        @Override // p343t1.c.AbstractC0673c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // p343t1.c.AbstractC0673c
        public int d(View view) {
            return SideSheetBehavior.this.f36900n + SideSheetBehavior.this.d0();
        }

        @Override // p343t1.c.AbstractC0673c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f36894h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // p343t1.c.AbstractC0673c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f36887a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        @Override // p343t1.c.AbstractC0673c
        public void l(View view, float f10, float f11) {
            int iR = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, iR, sideSheetBehavior.D0());
        }

        @Override // p343t1.c.AbstractC0673c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f36895i == 1 || SideSheetBehavior.this.f36904r == null || SideSheetBehavior.this.f36904r.get() != view) ? false : true;
        }
    }

    protected static class b extends p325s1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f36913c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f36913c = parcel.readInt();
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f36913c = sideSheetBehavior.f36895i;
        }

        @Override // p325s1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f36913c);
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f36916c = new e(this);

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f36915b = false;
            if (SideSheetBehavior.this.f36897k != null && SideSheetBehavior.this.f36897k.m(true)) {
                cVar.b(cVar.f36914a);
            } else if (SideSheetBehavior.this.f36895i == 2) {
                SideSheetBehavior.this.z0(cVar.f36914a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f36904r == null || SideSheetBehavior.this.f36904r.get() == null) {
                return;
            }
            this.f36914a = i10;
            if (this.f36915b) {
                return;
            }
            Z.e0((View) SideSheetBehavior.this.f36904r.get(), this.f36916c);
            this.f36915b = true;
        }
    }

    public SideSheetBehavior() {
        this.f36892f = new c();
        this.f36894h = true;
        this.f36895i = 5;
        this.f36896j = 5;
        this.f36899m = 0.1f;
        this.f36906t = -1;
        this.f36910x = new LinkedHashSet();
        this.f36911y = new a();
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36892f = new c();
        this.f36894h = true;
        this.f36895i = 5;
        this.f36896j = 5;
        this.f36899m = 0.1f;
        this.f36906t = -1;
        this.f36910x = new LinkedHashSet();
        this.f36911y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y8.k.f17271F5);
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17289H5)) {
            this.f36890d = p243n9.c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17289H5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17316K5)) {
            this.f36891e = k.e(context, attributeSet, 0, f36885A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17307J5)) {
            u0(typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17307J5, -1));
        }
        U(context);
        this.f36893g = typedArrayObtainStyledAttributes.getDimension(Y8.k.f17280G5, -1.0f);
        v0(typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17298I5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f36888b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private boolean A0() {
        if (this.f36897k != null) {
            return this.f36894h || this.f36895i == 1;
        }
        return false;
    }

    private boolean C0(View view) {
        return (view.isShown() || Z.o(view) != null) && this.f36894h;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i10, View view, E.a aVar) {
        sideSheetBehavior.y0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i10, boolean z10) {
        if (!p0(view, i10, z10)) {
            z0(i10);
        } else {
            z0(2);
            this.f36892f.b(i10);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f36904r.get();
        if (view != null) {
            sideSheetBehavior.E0(view, i10, false);
        }
    }

    private void F0() {
        View view;
        WeakReference weakReference = this.f36904r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Z.g0(view, 262144);
        Z.g0(view, 1048576);
        if (this.f36895i != 5) {
            r0(view, B.a.f48978y, 5);
        }
        if (this.f36895i != 3) {
            r0(view, B.a.f48976w, 3);
        }
    }

    private void G0(k kVar) {
        g gVar = this.f36889c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void H0(View view) {
        int i10 = this.f36895i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f36895i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f36887a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f36887a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f36895i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (B0(view, f10)) {
            return (this.f36887a.l(f10, f11) || this.f36887a.k(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f36887a.d()) ? 3 : 5;
    }

    private void S() {
        WeakReference weakReference = this.f36905s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f36905s = null;
    }

    private E T(int i10) {
        return new p315r9.a(this, i10);
    }

    private void U(Context context) {
        if (this.f36891e == null) {
            return;
        }
        g gVar = new g(this.f36891e);
        this.f36889c = gVar;
        gVar.L(context);
        ColorStateList colorStateList = this.f36890d;
        if (colorStateList != null) {
            this.f36889c.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f36889c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10) {
        if (this.f36910x.isEmpty()) {
            return;
        }
        this.f36887a.b(i10);
        Iterator it = this.f36910x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (Z.o(view) == null) {
            Z.p0(view, view.getResources().getString(f36886z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private CoordinatorLayout.f j0() {
        View view;
        WeakReference weakReference = this.f36904r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f36909w, motionEvent.getX()) > ((float) this.f36897k.z());
    }

    private boolean n0(float f10) {
        return this.f36887a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && Z.Q(view);
    }

    private boolean p0(View view, int i10, boolean z10) {
        int iE0 = e0(i10);
        p343t1.c cVarI0 = i0();
        if (cVarI0 == null) {
            return false;
        }
        if (z10) {
            return cVarI0.O(iE0, view.getTop());
        }
        return cVarI0.Q(view, iE0, view.getTop());
    }

    private void q0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f36905s != null || (i10 = this.f36906t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f36905s = new WeakReference(viewFindViewById);
    }

    private void r0(View view, B.a aVar, int i10) {
        Z.i0(view, aVar, null, T(i10));
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f36907u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36907u = null;
        }
    }

    private void t0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void w0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f36887a;
        if (cVar == null || cVar.i() != i10) {
            if (i10 == 0) {
                this.f36887a = new com.google.android.material.sidesheet.b(this);
                if (this.f36891e == null || l0()) {
                    return;
                }
                k.b bVarV = this.f36891e.v();
                bVarV.G(0.0f).w(0.0f);
                G0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f36887a = new com.google.android.material.sidesheet.a(this);
                if (this.f36891e == null || k0()) {
                    return;
                }
                k.b bVarV2 = this.f36891e.v();
                bVarV2.B(0.0f).s(0.0f);
                G0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void x0(View view, int i10) {
        w0(AbstractC1929s.b(((CoordinatorLayout.f) view.getLayoutParams()).f23053c, i10) == 3 ? 1 : 0);
    }

    boolean B0(View view, float f10) {
        return this.f36887a.m(view, f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36895i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f36897k.F(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f36907u == null) {
            this.f36907u = VelocityTracker.obtain();
        }
        this.f36907u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f36898l && m0(motionEvent)) {
            this.f36897k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f36898l;
    }

    public boolean D0() {
        return true;
    }

    int Y() {
        return this.f36900n;
    }

    public View Z() {
        WeakReference weakReference = this.f36905s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f36887a.c();
    }

    public float b0() {
        return this.f36899m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f36903q;
    }

    int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f36887a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int f0() {
        return this.f36902p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f36904r = null;
        this.f36897k = null;
        this.f36908v = null;
    }

    int g0() {
        return this.f36901o;
    }

    int h0() {
        return 500;
    }

    p343t1.c i0() {
        return this.f36897k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f36904r = null;
        this.f36897k = null;
        this.f36908v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        p343t1.c cVar;
        if (!C0(view)) {
            this.f36898l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f36907u == null) {
            this.f36907u = VelocityTracker.obtain();
        }
        this.f36907u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f36909w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f36898l) {
            this.f36898l = false;
            return false;
        }
        return (this.f36898l || (cVar = this.f36897k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (Z.w(coordinatorLayout) && !Z.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36904r == null) {
            this.f36904r = new WeakReference(view);
            this.f36908v = new p207l9.c(view);
            g gVar = this.f36889c;
            if (gVar != null) {
                Z.q0(view, gVar);
                g gVar2 = this.f36889c;
                float fU = this.f36893g;
                if (fU == -1.0f) {
                    fU = Z.u(view);
                }
                gVar2.V(fU);
            } else {
                ColorStateList colorStateList = this.f36890d;
                if (colorStateList != null) {
                    Z.r0(view, colorStateList);
                }
            }
            H0(view);
            F0();
            if (Z.x(view) == 0) {
                Z.v0(view, 1);
            }
            W(view);
        }
        x0(view, i10);
        if (this.f36897k == null) {
            this.f36897k = p343t1.c.o(coordinatorLayout, this.f36911y);
        }
        int iG = this.f36887a.g(view);
        coordinatorLayout.K(view, i10);
        this.f36901o = coordinatorLayout.getWidth();
        this.f36902p = this.f36887a.h(coordinatorLayout);
        this.f36900n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f36903q = marginLayoutParams != null ? this.f36887a.a(marginLayoutParams) : 0;
        Z.W(view, P(iG, view));
        q0(coordinatorLayout);
        Iterator it = this.f36910x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void u0(int i10) {
        this.f36906t = i10;
        S();
        WeakReference weakReference = this.f36904r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !Z.R(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public void v0(boolean z10) {
        this.f36894h = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.f() != null) {
            super.x(coordinatorLayout, view, bVar.f());
        }
        int i10 = bVar.f36913c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f36895i = i10;
        this.f36896j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public void y0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f36904r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i10);
        } else {
            t0((View) this.f36904r.get(), new p315r9.b(this, i10));
        }
    }

    void z0(int i10) {
        View view;
        if (this.f36895i == i10) {
            return;
        }
        this.f36895i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f36896j = i10;
        }
        WeakReference weakReference = this.f36904r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H0(view);
        Iterator it = this.f36910x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        F0();
    }
}
