package com.google.android.material.bottomsheet;

import Y8.i;
import Y8.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0;
import androidx.core.view.Z;
import com.google.android.material.internal.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p217m1.B;
import p217m1.E;
import p297q9.k;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f36203i0 = j.f17205j;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f36204A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final h f36205B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f36206C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f36207D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f36208E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f36209F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    float f36210G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f36211H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    float f36212I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f36213J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f36214K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f36215L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f36216M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f36217N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    p343t1.c f36218O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f36219P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f36220Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f36221R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f36222S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f36223T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f36224U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f36225V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    WeakReference f36226W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    WeakReference f36227X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    WeakReference f36228Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ArrayList f36229Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36230a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private VelocityTracker f36231a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36232b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    p207l9.b f36233b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36234c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f36235c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f36236d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f36237d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36238e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    boolean f36239e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36240f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Map f36241f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36242g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final SparseIntArray f36243g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36244h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final p343t1.c.AbstractC0673c f36245h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p297q9.g f36247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f36248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f36256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f36258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f36259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f36261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f36262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private k f36263z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36265b;

        a(View view, int i10) {
            this.f36264a = view;
            this.f36265b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.a1(this.f36264a, this.f36265b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f36247j != null) {
                BottomSheetBehavior.this.f36247j.X(fFloatValue);
            }
        }
    }

    class c implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36268a;

        c(boolean z10) {
            this.f36268a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.p.c
        public C0 a(View view, C0 c10, p.d dVar) {
            boolean z10;
            p020b1.d dVarF = c10.f(C0.p.i());
            p020b1.d dVarF2 = c10.f(C0.p.f());
            BottomSheetBehavior.this.f36261x = dVarF.f25866b;
            boolean zG = p.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f36253p) {
                BottomSheetBehavior.this.f36260w = c10.j();
                paddingBottom = dVar.f36794d + BottomSheetBehavior.this.f36260w;
            }
            if (BottomSheetBehavior.this.f36254q) {
                paddingLeft = (zG ? dVar.f36793c : dVar.f36791a) + dVarF.f25865a;
            }
            if (BottomSheetBehavior.this.f36255r) {
                paddingRight = (zG ? dVar.f36791a : dVar.f36793c) + dVarF.f25867c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f36257t) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = dVarF.f25865a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (BottomSheetBehavior.this.f36258u) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = dVarF.f25867c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.f36259v) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = dVarF.f25866b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f36268a) {
                BottomSheetBehavior.this.f36251n = dVarF2.f25868d;
            }
            if (!BottomSheetBehavior.this.f36253p && !this.f36268a) {
                return c10;
            }
            BottomSheetBehavior.this.f1(false);
            return c10;
        }
    }

    class d extends p343t1.c.AbstractC0673c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f36270a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f36225V + bottomSheetBehavior.n0()) / 2;
        }

        @Override // p343t1.c.AbstractC0673c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // p343t1.c.AbstractC0673c
        public int b(View view, int i10, int i11) {
            return p092f1.a.b(i10, BottomSheetBehavior.this.n0(), e(view));
        }

        @Override // p343t1.c.AbstractC0673c
        public int e(View view) {
            return BottomSheetBehavior.this.f0() ? BottomSheetBehavior.this.f36225V : BottomSheetBehavior.this.f36211H;
        }

        @Override // p343t1.c.AbstractC0673c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f36215L) {
                BottomSheetBehavior.this.T0(1);
            }
        }

        @Override // p343t1.c.AbstractC0673c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.k0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // p343t1.c.AbstractC0673c
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f36213J && bottomSheetBehavior.X0(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f36238e) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f36232b || Math.abs(view.getTop() - BottomSheetBehavior.this.n0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f36209F)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f36232b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f36209F;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f36211H)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.Y0()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.f36211H) || BottomSheetBehavior.this.Y0()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f36208E) < Math.abs(top - BottomSheetBehavior.this.f36211H)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f36232b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f36209F) >= Math.abs(top2 - BottomSheetBehavior.this.f36211H) || BottomSheetBehavior.this.Y0()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f36232b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f36270a;
                if (BottomSheetBehavior.this.Y0()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.V0(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f36225V)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f36209F) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.a1(view, i10, bottomSheetBehavior4.Z0());
        }

        @Override // p343t1.c.AbstractC0673c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f36216M;
            if (i11 == 1 || bottomSheetBehavior.f36239e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f36235c0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f36228Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f36270a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f36226W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f36272a;

        e(int i10) {
            this.f36272a = i10;
        }

        @Override // p217m1.E
        public boolean a(View view, E.a aVar) {
            BottomSheetBehavior.this.S0(this.f36272a);
            return true;
        }
    }

    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    protected static class g extends p325s1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f36274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f36276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f36277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f36278g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f36274c = parcel.readInt();
            this.f36275d = parcel.readInt();
            this.f36276e = parcel.readInt() == 1;
            this.f36277f = parcel.readInt() == 1;
            this.f36278g = parcel.readInt() == 1;
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f36274c = bottomSheetBehavior.f36216M;
            this.f36275d = bottomSheetBehavior.f36240f;
            this.f36276e = bottomSheetBehavior.f36232b;
            this.f36277f = bottomSheetBehavior.f36213J;
            this.f36278g = bottomSheetBehavior.f36214K;
        }

        @Override // p325s1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f36274c);
            parcel.writeInt(this.f36275d);
            parcel.writeInt(this.f36276e ? 1 : 0);
            parcel.writeInt(this.f36277f ? 1 : 0);
            parcel.writeInt(this.f36278g ? 1 : 0);
        }
    }

    private class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f36281c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f36280b = false;
                p343t1.c cVar = BottomSheetBehavior.this.f36218O;
                if (cVar != null && cVar.m(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f36279a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f36216M == 2) {
                    bottomSheetBehavior.T0(hVar2.f36279a);
                }
            }
        }

        private h() {
            this.f36281c = new a();
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f36226W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f36279a = i10;
            if (this.f36280b) {
                return;
            }
            Z.e0((View) BottomSheetBehavior.this.f36226W.get(), this.f36281c);
            this.f36280b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f36230a = 0;
        this.f36232b = true;
        this.f36234c = false;
        this.f36249l = -1;
        this.f36250m = -1;
        this.f36205B = new h(this, null);
        this.f36210G = 0.5f;
        this.f36212I = -1.0f;
        this.f36215L = true;
        this.f36216M = 4;
        this.f36217N = 4;
        this.f36222S = 0.1f;
        this.f36229Z = new ArrayList();
        this.f36237d0 = -1;
        this.f36243g0 = new SparseIntArray();
        this.f36245h0 = new d();
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f36230a = 0;
        this.f36232b = true;
        this.f36234c = false;
        this.f36249l = -1;
        this.f36250m = -1;
        this.f36205B = new h(this, null);
        this.f36210G = 0.5f;
        this.f36212I = -1.0f;
        this.f36215L = true;
        this.f36216M = 4;
        this.f36217N = 4;
        this.f36222S = 0.1f;
        this.f36229Z = new ArrayList();
        this.f36237d0 = -1;
        this.f36243g0 = new SparseIntArray();
        this.f36245h0 = new d();
        this.f36246i = context.getResources().getDimensionPixelSize(Y8.c.f17058h0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y8.k.f17577n0);
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17613r0)) {
            this.f36248k = p243n9.c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17613r0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17302J0)) {
            this.f36263z = k.e(context, attributeSet, Y8.a.f16987e, f36203i0).m();
        }
        i0(context);
        j0();
        this.f36212I = typedArrayObtainStyledAttributes.getDimension(Y8.k.f17604q0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17586o0)) {
            M0(typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17586o0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17595p0)) {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17595p0, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(Y8.k.f17667x0);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17667x0, -1));
        } else {
            N0(i10);
        }
        K0(typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17658w0, false));
        I0(typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17230B0, false));
        H0(typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17640u0, true));
        R0(typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17221A0, false));
        F0(typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17622s0, true));
        P0(typedArrayObtainStyledAttributes.getInt(Y8.k.f17676y0, 0));
        J0(typedArrayObtainStyledAttributes.getFloat(Y8.k.f17649v0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(Y8.k.f17631t0);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            G0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Y8.k.f17631t0, 0));
        } else {
            G0(typedValuePeekValue2.data);
        }
        Q0(typedArrayObtainStyledAttributes.getInt(Y8.k.f17685z0, 500));
        this.f36253p = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17266F0, false);
        this.f36254q = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17275G0, false);
        this.f36255r = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17284H0, false);
        this.f36256s = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17293I0, true);
        this.f36257t = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17239C0, false);
        this.f36258u = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17248D0, false);
        this.f36259v = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17257E0, false);
        this.f36262y = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17311K0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f36236d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void B0(View view, B.a aVar, int i10) {
        Z.i0(view, aVar, null, h0(i10));
    }

    private void C0() {
        this.f36235c0 = -1;
        this.f36237d0 = -1;
        VelocityTracker velocityTracker = this.f36231a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36231a0 = null;
        }
    }

    private void D0(g gVar) {
        int i10 = this.f36230a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f36240f = gVar.f36275d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f36232b = gVar.f36276e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f36213J = gVar.f36277f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f36214K = gVar.f36278g;
        }
    }

    private void E0(View view, Runnable runnable) {
        if (y0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void U0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || v0() || this.f36242g) ? false : true;
        if (this.f36253p || this.f36254q || this.f36255r || this.f36257t || this.f36258u || this.f36259v || z10) {
            p.b(view, new c(z10));
        }
    }

    private boolean W0() {
        if (this.f36218O != null) {
            return this.f36215L || this.f36216M == 1;
        }
        return false;
    }

    private int X(View view, int i10, int i11) {
        return Z.c(view, view.getResources().getString(i10), h0(i11));
    }

    private void Z() {
        int iD0 = d0();
        if (this.f36232b) {
            this.f36211H = Math.max(this.f36225V - iD0, this.f36208E);
        } else {
            this.f36211H = this.f36225V - iD0;
        }
    }

    private float a0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(View view, int i10, boolean z10) {
        int iR0 = r0(i10);
        p343t1.c cVar = this.f36218O;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), iR0) : cVar.O(view.getLeft(), iR0))) {
            T0(i10);
            return;
        }
        T0(2);
        d1(i10, true);
        this.f36205B.c(i10);
    }

    private void b0() {
        this.f36209F = (int) (this.f36225V * (1.0f - this.f36210G));
    }

    private void b1() {
        WeakReference weakReference = this.f36226W;
        if (weakReference != null) {
            c1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f36227X;
        if (weakReference2 != null) {
            c1((View) weakReference2.get(), 1);
        }
    }

    private float c0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f36247j == null || (weakReference = this.f36226W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f36226W.get();
        if (!t0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(a0(this.f36247j.E(), rootWindowInsets.getRoundedCorner(0)), a0(this.f36247j.F(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void c1(View view, int i10) {
        if (view == null) {
            return;
        }
        g0(view, i10);
        if (!this.f36232b && this.f36216M != 6) {
            this.f36243g0.put(i10, X(view, i.f17170a, 6));
        }
        if (this.f36213J && x0() && this.f36216M != 5) {
            B0(view, B.a.f48978y, 5);
        }
        int i11 = this.f36216M;
        if (i11 == 3) {
            B0(view, B.a.f48977x, this.f36232b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            B0(view, B.a.f48976w, this.f36232b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            B0(view, B.a.f48977x, 4);
            B0(view, B.a.f48976w, 3);
        }
    }

    private int d0() {
        int i10;
        if (this.f36242g) {
            return Math.min(Math.max(this.f36244h, this.f36225V - ((this.f36224U * 9) / 16)), this.f36223T) + this.f36260w;
        }
        return (this.f36252o || this.f36253p || (i10 = this.f36251n) <= 0) ? this.f36240f + this.f36260w : Math.max(this.f36240f, i10 + this.f36246i);
    }

    private void d1(int i10, boolean z10) {
        boolean zU0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f36204A == (zU0 = u0()) || this.f36247j == null) {
            return;
        }
        this.f36204A = zU0;
        if (!z10 || (valueAnimator = this.f36206C) == null) {
            ValueAnimator valueAnimator2 = this.f36206C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f36206C.cancel();
            }
            this.f36247j.X(this.f36204A ? c0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f36206C.reverse();
        } else {
            this.f36206C.setFloatValues(this.f36247j.w(), zU0 ? c0() : 1.0f);
            this.f36206C.start();
        }
    }

    private float e0(int i10) {
        float f10;
        float fN0;
        int i11 = this.f36211H;
        if (i10 > i11 || i11 == n0()) {
            int i12 = this.f36211H;
            f10 = i12 - i10;
            fN0 = this.f36225V - i12;
        } else {
            int i13 = this.f36211H;
            f10 = i13 - i10;
            fN0 = i13 - n0();
        }
        return f10 / fN0;
    }

    private void e1(boolean z10) {
        Map map;
        WeakReference weakReference = this.f36226W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f36241f0 != null) {
                    return;
                } else {
                    this.f36241f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f36226W.get()) {
                    if (z10) {
                        this.f36241f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f36234c) {
                            Z.v0(childAt, 4);
                        }
                    } else if (this.f36234c && (map = this.f36241f0) != null && map.containsKey(childAt)) {
                        Z.v0(childAt, ((Integer) this.f36241f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f36241f0 = null;
            } else if (this.f36234c) {
                ((View) this.f36226W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        return w0() && x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(boolean z10) {
        View view;
        if (this.f36226W != null) {
            Z();
            if (this.f36216M != 4 || (view = (View) this.f36226W.get()) == null) {
                return;
            }
            if (z10) {
                S0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private void g0(View view, int i10) {
        if (view == null) {
            return;
        }
        Z.g0(view, 524288);
        Z.g0(view, 262144);
        Z.g0(view, 1048576);
        int i11 = this.f36243g0.get(i10, -1);
        if (i11 != -1) {
            Z.g0(view, i11);
            this.f36243g0.delete(i10);
        }
    }

    private E h0(int i10) {
        return new e(i10);
    }

    private void i0(Context context) {
        if (this.f36263z == null) {
            return;
        }
        p297q9.g gVar = new p297q9.g(this.f36263z);
        this.f36247j = gVar;
        gVar.L(context);
        ColorStateList colorStateList = this.f36248k;
        if (colorStateList != null) {
            this.f36247j.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f36247j.setTint(typedValue.data);
    }

    private void j0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0(), 1.0f);
        this.f36206C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f36206C.addUpdateListener(new b());
    }

    private int m0(int i10, int i11, int i12, int i13) {
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

    private int r0(int i10) {
        if (i10 == 3) {
            return n0();
        }
        if (i10 == 4) {
            return this.f36211H;
        }
        if (i10 == 5) {
            return this.f36225V;
        }
        if (i10 == 6) {
            return this.f36209F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float s0() {
        VelocityTracker velocityTracker = this.f36231a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f36236d);
        return this.f36231a0.getYVelocity(this.f36235c0);
    }

    private boolean t0() {
        WeakReference weakReference = this.f36226W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f36226W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean u0() {
        if (this.f36216M == 3) {
            return this.f36262y || t0();
        }
        return false;
    }

    private boolean y0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && Z.Q(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f36220Q = 0;
        this.f36221R = false;
        return (i10 & 2) != 0;
    }

    public void A0(f fVar) {
        this.f36229Z.remove(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        WeakReference weakReference;
        int i11 = 3;
        if (view.getTop() == n0()) {
            T0(3);
            return;
        }
        if (!z0() || ((weakReference = this.f36228Y) != null && view2 == weakReference.get() && this.f36221R)) {
            if (this.f36220Q > 0) {
                if (!this.f36232b && view.getTop() > this.f36209F) {
                    i11 = 6;
                }
            } else if (this.f36213J && X0(view, s0())) {
                i11 = 5;
            } else if (this.f36220Q == 0) {
                int top = view.getTop();
                if (!this.f36232b) {
                    int i12 = this.f36209F;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f36211H)) {
                            if (Y0()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.f36211H)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.f36208E) >= Math.abs(top - this.f36211H)) {
                    i11 = 4;
                }
            } else {
                if (!this.f36232b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f36209F) < Math.abs(top2 - this.f36211H)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            a1(view, i11, false);
            this.f36221R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36216M == 1 && actionMasked == 0) {
            return true;
        }
        if (W0()) {
            this.f36218O.F(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.f36231a0 == null) {
            this.f36231a0 = VelocityTracker.obtain();
        }
        this.f36231a0.addMovement(motionEvent);
        if (W0() && actionMasked == 2 && !this.f36219P && Math.abs(this.f36237d0 - motionEvent.getY()) > this.f36218O.z()) {
            this.f36218O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f36219P;
    }

    public void F0(boolean z10) {
        this.f36215L = z10;
    }

    public void G0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f36207D = i10;
        d1(this.f36216M, true);
    }

    public void H0(boolean z10) {
        if (this.f36232b == z10) {
            return;
        }
        this.f36232b = z10;
        if (this.f36226W != null) {
            Z();
        }
        T0((this.f36232b && this.f36216M == 6) ? 3 : this.f36216M);
        d1(this.f36216M, true);
        b1();
    }

    public void I0(boolean z10) {
        this.f36252o = z10;
    }

    public void J0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f36210G = f10;
        if (this.f36226W != null) {
            b0();
        }
    }

    public void K0(boolean z10) {
        if (this.f36213J != z10) {
            this.f36213J = z10;
            if (!z10 && this.f36216M == 5) {
                S0(4);
            }
            b1();
        }
    }

    public void L0(int i10) {
        this.f36250m = i10;
    }

    public void M0(int i10) {
        this.f36249l = i10;
    }

    public void N0(int i10) {
        O0(i10, false);
    }

    public final void O0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f36242g) {
                return;
            } else {
                this.f36242g = true;
            }
        } else {
            if (!this.f36242g && this.f36240f == i10) {
                return;
            }
            this.f36242g = false;
            this.f36240f = Math.max(0, i10);
        }
        f1(z10);
    }

    public void P0(int i10) {
        this.f36230a = i10;
    }

    public void Q0(int i10) {
        this.f36238e = i10;
    }

    public void R0(boolean z10) {
        this.f36214K = z10;
    }

    public void S0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f36213J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f36232b && r0(i10) <= this.f36208E) ? 3 : i10;
        WeakReference weakReference = this.f36226W;
        if (weakReference == null || weakReference.get() == null) {
            T0(i10);
        } else {
            View view = (View) this.f36226W.get();
            E0(view, new a(view, i11));
        }
    }

    void T0(int i10) {
        View view;
        if (this.f36216M == i10) {
            return;
        }
        this.f36216M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f36213J && i10 == 5)) {
            this.f36217N = i10;
        }
        WeakReference weakReference = this.f36226W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            e1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            e1(false);
        }
        d1(i10, true);
        for (int i11 = 0; i11 < this.f36229Z.size(); i11++) {
            ((f) this.f36229Z.get(i11)).c(view, i10);
        }
        b1();
    }

    public boolean V0(long j10, float f10) {
        return false;
    }

    boolean X0(View view, float f10) {
        if (this.f36214K) {
            return true;
        }
        if (x0() && view.getTop() >= this.f36211H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f36222S)) - ((float) this.f36211H)) / ((float) d0()) > 0.5f;
        }
        return false;
    }

    public void Y(f fVar) {
        if (this.f36229Z.contains(fVar)) {
            return;
        }
        this.f36229Z.add(fVar);
    }

    public boolean Y0() {
        return false;
    }

    public boolean Z0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f36226W = null;
        this.f36218O = null;
        this.f36233b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f36226W = null;
        this.f36218O = null;
        this.f36233b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        p343t1.c cVar;
        if (!view.isShown() || !this.f36215L) {
            this.f36219P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C0();
        }
        if (this.f36231a0 == null) {
            this.f36231a0 = VelocityTracker.obtain();
        }
        this.f36231a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f36237d0 = (int) motionEvent.getY();
            if (this.f36216M != 2) {
                WeakReference weakReference = this.f36228Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.C(view2, x10, this.f36237d0)) {
                    this.f36235c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f36239e0 = true;
                }
            }
            this.f36219P = this.f36235c0 == -1 && !coordinatorLayout.C(view, x10, this.f36237d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36239e0 = false;
            this.f36235c0 = -1;
            if (this.f36219P) {
                this.f36219P = false;
                return false;
            }
        }
        if (!this.f36219P && (cVar = this.f36218O) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f36228Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f36219P || this.f36216M == 1 || coordinatorLayout.C(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f36218O == null || (i10 = this.f36237d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f36218O.z())) ? false : true;
    }

    void k0(int i10) {
        View view = (View) this.f36226W.get();
        if (view == null || this.f36229Z.isEmpty()) {
            return;
        }
        float fE0 = e0(i10);
        for (int i11 = 0; i11 < this.f36229Z.size(); i11++) {
            ((f) this.f36229Z.get(i11)).b(view, fE0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (Z.w(coordinatorLayout) && !Z.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36226W == null) {
            this.f36244h = coordinatorLayout.getResources().getDimensionPixelSize(Y8.c.f17059i);
            U0(view);
            Z.H0(view, new com.google.android.material.bottomsheet.a(view));
            this.f36226W = new WeakReference(view);
            this.f36233b0 = new p207l9.b(view);
            p297q9.g gVar = this.f36247j;
            if (gVar != null) {
                Z.q0(view, gVar);
                p297q9.g gVar2 = this.f36247j;
                float fU = this.f36212I;
                if (fU == -1.0f) {
                    fU = Z.u(view);
                }
                gVar2.V(fU);
            } else {
                ColorStateList colorStateList = this.f36248k;
                if (colorStateList != null) {
                    Z.r0(view, colorStateList);
                }
            }
            b1();
            if (Z.x(view) == 0) {
                Z.v0(view, 1);
            }
        }
        if (this.f36218O == null) {
            this.f36218O = p343t1.c.o(coordinatorLayout, this.f36245h0);
        }
        int top = view.getTop();
        coordinatorLayout.K(view, i10);
        this.f36224U = coordinatorLayout.getWidth();
        this.f36225V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f36223T = height;
        int iMin = this.f36225V;
        int i11 = iMin - height;
        int i12 = this.f36261x;
        if (i11 < i12) {
            if (this.f36256s) {
                int i13 = this.f36250m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f36223T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f36250m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f36223T = iMin2;
            }
        }
        this.f36208E = Math.max(0, this.f36225V - this.f36223T);
        b0();
        Z();
        int i15 = this.f36216M;
        if (i15 == 3) {
            Z.X(view, n0());
        } else if (i15 == 6) {
            Z.X(view, this.f36209F);
        } else if (this.f36213J && i15 == 5) {
            Z.X(view, this.f36225V);
        } else if (i15 == 4) {
            Z.X(view, this.f36211H);
        } else if (i15 == 1 || i15 == 2) {
            Z.X(view, top - view.getTop());
        }
        d1(this.f36216M, false);
        this.f36228Y = new WeakReference(l0(view));
        for (int i16 = 0; i16 < this.f36229Z.size(); i16++) {
            ((f) this.f36229Z.get(i16)).a(view);
        }
        return true;
    }

    View l0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (Z.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewL0 = l0(viewGroup.getChildAt(i10));
                if (viewL0 != null) {
                    return viewL0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f36249l, marginLayoutParams.width), m0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f36250m, marginLayoutParams.height));
        return true;
    }

    public int n0() {
        if (this.f36232b) {
            return this.f36208E;
        }
        return Math.max(this.f36207D, this.f36256s ? 0 : this.f36261x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return z0() && (weakReference = this.f36228Y) != null && view2 == weakReference.get() && (this.f36216M != 3 || super.o(coordinatorLayout, view, view2, f10, f11));
    }

    public float o0() {
        return this.f36210G;
    }

    public int p0() {
        if (this.f36242g) {
            return -1;
        }
        return this.f36240f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f36228Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!z0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < n0()) {
                    int iN0 = top - n0();
                    iArr[1] = iN0;
                    Z.X(view, -iN0);
                    T0(3);
                } else {
                    if (!this.f36215L) {
                        return;
                    }
                    iArr[1] = i11;
                    Z.X(view, -i11);
                    T0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                if (i13 > this.f36211H && !f0()) {
                    int i14 = top - this.f36211H;
                    iArr[1] = i14;
                    Z.X(view, -i14);
                    T0(4);
                } else {
                    if (!this.f36215L) {
                        return;
                    }
                    iArr[1] = i11;
                    Z.X(view, -i11);
                    T0(1);
                }
            }
            k0(view.getTop());
            this.f36220Q = i11;
            this.f36221R = true;
        }
    }

    public int q0() {
        return this.f36216M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean v0() {
        return this.f36252o;
    }

    public boolean w0() {
        return this.f36213J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.f());
        D0(gVar);
        int i10 = gVar.f36274c;
        if (i10 == 1 || i10 == 2) {
            this.f36216M = 4;
            this.f36217N = 4;
        } else {
            this.f36216M = i10;
            this.f36217N = i10;
        }
    }

    public boolean x0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public boolean z0() {
        return true;
    }
}
