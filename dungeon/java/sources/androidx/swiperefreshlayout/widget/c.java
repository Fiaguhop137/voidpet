package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.C;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ViewGroup implements F, E, C {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final String f25457P = "c";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final int[] f25458Q = {16842766};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f25459A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f25460B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f25461C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Animation f25462D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Animation f25463E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Animation f25464F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Animation f25465G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Animation f25466H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f25467I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f25468J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f25469K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f25470L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Animation.AnimationListener f25471M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Animation f25472N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Animation f25473O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f25474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f25475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f25476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f25479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G f25480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final D f25481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f25482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f25483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f25484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f25487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f25488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f25489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f25492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f25494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f25495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f25497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f25498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f25499z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f25476c) {
                cVar.r();
                return;
            }
            cVar.f25461C.setAlpha(255);
            c.this.f25461C.start();
            c cVar2 = c.this;
            if (cVar2.f25467I && (jVar = cVar2.f25475b) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.f25487n = cVar3.f25495v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    class C0322c extends Animation {
        C0322c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f25503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25504b;

        d(int i10, int i11) {
            this.f25503a = i10;
            this.f25504b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = c.this.f25461C;
            int i10 = this.f25503a;
            bVar.setAlpha((int) (i10 + ((this.f25504b - i10) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f25492s) {
                return;
            }
            cVar.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            int iAbs = !cVar.f25469K ? cVar.f25459A - Math.abs(cVar.f25499z) : cVar.f25459A;
            c cVar2 = c.this;
            int i10 = cVar2.f25497x;
            c.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - cVar2.f25495v.getTop());
            c.this.f25461C.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.p(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            float f11 = cVar.f25498y;
            cVar.setAnimationProgress(f11 + ((-f11) * f10));
            c.this.p(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f25510a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcel parcel) {
            super(parcel);
            this.f25510a = parcel.readByte() != 0;
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f25510a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f25510a ? (byte) 1 : (byte) 0);
        }
    }

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25476c = false;
        this.f25478e = -1.0f;
        this.f25482i = new int[2];
        this.f25483j = new int[2];
        this.f25484k = new int[2];
        this.f25491r = -1;
        this.f25496w = -1;
        this.f25471M = new a();
        this.f25472N = new f();
        this.f25473O = new g();
        this.f25477d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f25486m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f25494u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f25468J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f25459A = i10;
        this.f25478e = i10;
        this.f25480g = new G(this);
        this.f25481h = new D(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f25468J;
        this.f25487n = i11;
        this.f25499z = i11;
        p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f25458Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f25495v.setVisibility(0);
        this.f25461C.setAlpha(255);
        b bVar = new b();
        this.f25462D = bVar;
        bVar.setDuration(this.f25486m);
        if (animationListener != null) {
            this.f25495v.b(animationListener);
        }
        this.f25495v.clearAnimation();
        this.f25495v.startAnimation(this.f25462D);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f25497x = i10;
        this.f25472N.reset();
        this.f25472N.setDuration(200L);
        this.f25472N.setInterpolator(this.f25494u);
        if (animationListener != null) {
            this.f25495v.b(animationListener);
        }
        this.f25495v.clearAnimation();
        this.f25495v.startAnimation(this.f25472N);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f25492s) {
            z(i10, animationListener);
            return;
        }
        this.f25497x = i10;
        this.f25473O.reset();
        this.f25473O.setDuration(200L);
        this.f25473O.setInterpolator(this.f25494u);
        if (animationListener != null) {
            this.f25495v.b(animationListener);
        }
        this.f25495v.clearAnimation();
        this.f25495v.startAnimation(this.f25473O);
    }

    private void d() {
        this.f25495v = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f25461C = bVar;
        bVar.l(1);
        this.f25495v.setImageDrawable(this.f25461C);
        this.f25495v.setVisibility(8);
        addView(this.f25495v);
    }

    private void f() {
        if (this.f25474a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f25495v)) {
                    this.f25474a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f25478e) {
            t(true, true);
            return;
        }
        this.f25476c = false;
        this.f25461C.j(0.0f, 0.0f);
        b(this.f25487n, !this.f25492s ? new e() : null);
        this.f25461C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f10) {
        this.f25461C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f25478e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f25478e;
        int i10 = this.f25460B;
        if (i10 <= 0) {
            i10 = this.f25469K ? this.f25459A - this.f25499z : this.f25459A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f25499z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f25495v.getVisibility() != 0) {
            this.f25495v.setVisibility(0);
        }
        if (!this.f25492s) {
            this.f25495v.setScaleX(1.0f);
            this.f25495v.setScaleY(1.0f);
        }
        if (this.f25492s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f25478e));
        }
        if (f10 < this.f25478e) {
            if (this.f25461C.getAlpha() > 76 && !h(this.f25464F)) {
                x();
            }
        } else if (this.f25461C.getAlpha() < 255 && !h(this.f25465G)) {
            w();
        }
        this.f25461C.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f25461C.e(Math.min(1.0f, fMax));
        this.f25461C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f25487n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f25491r) {
            this.f25491r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f25495v.getBackground().setAlpha(i10);
        this.f25461C.setAlpha(i10);
    }

    private void t(boolean z10, boolean z11) {
        if (this.f25476c != z10) {
            this.f25467I = z11;
            f();
            this.f25476c = z10;
            if (z10) {
                a(this.f25487n, this.f25471M);
            } else {
                y(this.f25471M);
            }
        }
    }

    private Animation u(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f25495v.b(null);
        this.f25495v.clearAnimation();
        this.f25495v.startAnimation(dVar);
        return dVar;
    }

    private void v(float f10) {
        float f11 = this.f25489p;
        float f12 = f10 - f11;
        int i10 = this.f25477d;
        if (f12 <= i10 || this.f25490q) {
            return;
        }
        this.f25488o = f11 + i10;
        this.f25490q = true;
        this.f25461C.setAlpha(76);
    }

    private void w() {
        this.f25465G = u(this.f25461C.getAlpha(), 255);
    }

    private void x() {
        this.f25464F = u(this.f25461C.getAlpha(), 76);
    }

    private void z(int i10, Animation.AnimationListener animationListener) {
        this.f25497x = i10;
        this.f25498y = this.f25495v.getScaleX();
        h hVar = new h();
        this.f25466H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f25495v.b(animationListener);
        }
        this.f25495v.clearAnimation();
        this.f25495v.startAnimation(this.f25466H);
    }

    public boolean c() {
        View view = this.f25474a;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f25481h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f25481h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f25481h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f25481h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f25481h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f25496w;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f25480g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f25468J;
    }

    public int getProgressViewEndOffset() {
        return this.f25459A;
    }

    public int getProgressViewStartOffset() {
        return this.f25499z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f25481h.j();
    }

    @Override // androidx.core.view.E
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f25481h.l();
    }

    @Override // androidx.core.view.E
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.E
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.F
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f25483j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f25483j[1] : i16;
        if (i17 >= 0 || c()) {
            return;
        }
        float fAbs = this.f25479f + Math.abs(i17);
        this.f25479f = fAbs;
        l(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.E
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f25484k);
    }

    @Override // androidx.core.view.E
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f25493t && actionMasked == 0) {
            this.f25493t = false;
        }
        if (!isEnabled() || this.f25493t || c() || this.f25476c || this.f25485l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f25499z - this.f25495v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f25491r = pointerId;
            this.f25490q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f25489p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f25490q = false;
            this.f25491r = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f25491r;
            if (i10 == -1) {
                Log.e(f25457P, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            v(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f25490q = false;
            this.f25491r = -1;
        } else if (actionMasked == 6) {
            q(motionEvent);
        }
        return this.f25490q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f25474a == null) {
            f();
        }
        View view = this.f25474a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f25495v.getMeasuredWidth();
        int measuredHeight2 = this.f25495v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f25487n;
        this.f25495v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f25474a == null) {
            f();
        }
        View view = this.f25474a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f25495v.measure(View.MeasureSpec.makeMeasureSpec(this.f25468J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25468J, 1073741824));
        this.f25496w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f25495v) {
                this.f25496w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f25479f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f25479f = 0.0f;
                } else {
                    this.f25479f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f25479f);
            }
        }
        if (this.f25469K && i11 > 0 && this.f25479f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f25495v.setVisibility(8);
        }
        int[] iArr2 = this.f25482i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f25484k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f25480g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f25479f = 0.0f;
        this.f25485l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f25510a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f25476c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f25493t || this.f25476c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f25480g.d(view);
        this.f25485l = false;
        float f10 = this.f25479f;
        if (f10 > 0.0f) {
            g(f10);
            this.f25479f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f25493t && actionMasked == 0) {
            this.f25493t = false;
        }
        if (!isEnabled() || this.f25493t || c() || this.f25476c || this.f25485l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f25491r = motionEvent.getPointerId(0);
            this.f25490q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f25491r);
                if (iFindPointerIndex < 0) {
                    Log.e(f25457P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f25490q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f25488o) * 0.5f;
                    this.f25490q = false;
                    g(y10);
                }
                this.f25491r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f25491r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f25457P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                v(y11);
                if (this.f25490q) {
                    float f10 = (y11 - this.f25488o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f25457P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f25491r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    void p(float f10) {
        int i10 = this.f25497x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f25499z - i10) * f10))) - this.f25495v.getTop());
    }

    void r() {
        this.f25495v.clearAnimation();
        this.f25461C.stop();
        this.f25495v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f25492s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f25499z - this.f25487n);
        }
        this.f25487n = this.f25495v.getTop();
    }

    public void s(boolean z10, int i10, int i11) {
        this.f25492s = z10;
        this.f25499z = i10;
        this.f25459A = i11;
        this.f25469K = true;
        r();
        this.f25476c = false;
    }

    void setAnimationProgress(float f10) {
        this.f25495v.setScaleX(f10);
        this.f25495v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f25461C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = Z0.b.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f25478e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f25470L = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f25481h.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f25475b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f25495v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(Z0.b.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f25476c == z10) {
            t(z10, false);
            return;
        }
        this.f25476c = z10;
        setTargetOffsetTopAndBottom((!this.f25469K ? this.f25459A + this.f25499z : this.f25459A) - this.f25487n);
        this.f25467I = false;
        A(this.f25471M);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f25468J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f25468J = (int) (displayMetrics.density * 40.0f);
            }
            this.f25495v.setImageDrawable(null);
            this.f25461C.l(i10);
            this.f25495v.setImageDrawable(this.f25461C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f25460B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f25495v.bringToFront();
        Z.X(this.f25495v, i10);
        this.f25487n = this.f25495v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f25481h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f25481h.q();
    }

    void y(Animation.AnimationListener animationListener) {
        C0322c c0322c = new C0322c();
        this.f25463E = c0322c;
        c0322c.setDuration(150L);
        this.f25495v.b(animationListener);
        this.f25495v.clearAnimation();
        this.f25495v.startAnimation(this.f25463E);
    }
}
