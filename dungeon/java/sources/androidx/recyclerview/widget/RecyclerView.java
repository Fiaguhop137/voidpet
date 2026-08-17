package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC1899c0;
import androidx.core.view.C1894a;
import androidx.core.view.D;
import androidx.core.view.ScrollingView;
import androidx.core.view.Z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p217m1.AbstractC4000b;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.C {

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private static final Class[] f24939D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    static final Interpolator f24940E0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final AccessibilityManager f24945A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List f24946B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f24947C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f24948D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f24949E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f24950F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private k f24951G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private EdgeEffect f24952H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private EdgeEffect f24953I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private EdgeEffect f24954J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private EdgeEffect f24955K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    l f24956L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f24957M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f24958N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private VelocityTracker f24959O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f24960P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f24961Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f24962R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f24963S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f24964T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private q f24965U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int f24966V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final int f24967W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f24968a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f24969a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final u f24970b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f24971b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f24972c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f24973c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a f24974d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    final B f24975d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f24976e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    androidx.recyclerview.widget.e f24977e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.recyclerview.widget.q f24978f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    androidx.recyclerview.widget.e.b f24979f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f24980g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final z f24981g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f24982h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private s f24983h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Rect f24984i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private List f24985i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f24986j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    boolean f24987j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final RectF f24988k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f24989k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f24990l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private l.a f24991l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    o f24992m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f24993m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList f24994n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    androidx.recyclerview.widget.l f24995n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList f24996o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final int[] f24997o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r f24998p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private D f24999p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f25000q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final int[] f25001q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f25002r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final int[] f25003r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f25004s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    final int[] f25005s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f25006t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    final List f25007t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25008u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private Runnable f25009u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f25010v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final androidx.recyclerview.widget.q.b f25011v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f25012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f25013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25014y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f25015z;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int[] f24941w0 = {16843830};

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    static final boolean f24942x0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    static final boolean f24943y0 = true;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    static final boolean f24944z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    static final boolean f24936A0 = true;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private static final boolean f24937B0 = false;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private static final boolean f24938C0 = false;

    public static abstract class A {
    }

    class B implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f25018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f25019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25021f;

        B() {
            Interpolator interpolator = RecyclerView.f24940E0;
            this.f25019d = interpolator;
            this.f25020e = false;
            this.f25021f = false;
            this.f25018c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int iRound;
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13));
            int iSqrt2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i14 = width / 2;
            float f10 = width;
            float f11 = i14;
            float fB = f11 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f10)) * f11);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float b(float f10) {
            return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            Z.e0(RecyclerView.this, this);
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f25017b = 0;
            this.f25016a = 0;
            Interpolator interpolator = this.f25019d;
            Interpolator interpolator2 = RecyclerView.f24940E0;
            if (interpolator != interpolator2) {
                this.f25019d = interpolator2;
                this.f25018c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f25018c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f25020e) {
                this.f25021f = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11, 0, 0);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f24940E0;
            }
            if (this.f25019d != interpolator) {
                this.f25019d = interpolator;
                this.f25018c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f25017b = 0;
            this.f25016a = 0;
            RecyclerView.this.setScrollState(2);
            this.f25018c.startScroll(0, 0, i10, i11, i13);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f25018c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f24992m == null) {
                g();
                return;
            }
            this.f25021f = false;
            this.f25020e = true;
            recyclerView.u();
            OverScroller overScroller = this.f25018c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f25016a;
                int i14 = currY - this.f25017b;
                this.f25016a = currX;
                this.f25017b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f25005s0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i13, i14, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f25005s0;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f24990l != null) {
                    int[] iArr3 = recyclerView3.f25005s0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f1(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f25005s0;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    i13 -= i15;
                    i14 -= i16;
                    y yVar = recyclerView4.f24992m.f25066g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int iB = RecyclerView.this.f24981g0.b();
                        if (iB == 0) {
                            yVar.r();
                        } else if (yVar.f() >= iB) {
                            yVar.p(iB - 1);
                            yVar.j(i15, i16);
                        } else {
                            yVar.j(i15, i16);
                        }
                    }
                    i11 = i16;
                    i10 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i17 = i13;
                int i18 = i14;
                if (!RecyclerView.this.f24994n.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f25005s0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i10, i11, i17, i18, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f25005s0;
                int i19 = i17 - iArr6[0];
                int i20 = i18 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.I(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                y yVar2 = RecyclerView.this.f24992m.f25066g;
                if ((yVar2 == null || !yVar2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i19 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i19 > 0 ? currVelocity : 0;
                        }
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i12, currVelocity);
                    }
                    if (RecyclerView.f24936A0) {
                        RecyclerView.this.f24979f0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f24977e0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            y yVar3 = RecyclerView.this.f24992m.f25066g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f25020e = false;
            if (this.f25021f) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.s1(1);
            }
        }
    }

    public static abstract class C {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final List f25023s = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f25024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference f25025b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f25033j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        RecyclerView f25041r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25026c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25027d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f25028e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f25029f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f25030g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C f25031h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        C f25032i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        List f25034k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f25035l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f25036m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        u f25037n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f25038o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f25039p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25040q = -1;

        public C(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f25024a = view;
        }

        private void g() {
            if (this.f25034k == null) {
                ArrayList arrayList = new ArrayList();
                this.f25034k = arrayList;
                this.f25035l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i10, boolean z10) {
            if (this.f25027d == -1) {
                this.f25027d = this.f25026c;
            }
            if (this.f25030g == -1) {
                this.f25030g = this.f25026c;
            }
            if (z10) {
                this.f25030g += i10;
            }
            this.f25026c += i10;
            if (this.f25024a.getLayoutParams() != null) {
                ((p) this.f25024a.getLayoutParams()).f25086c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int i10 = this.f25040q;
            if (i10 != -1) {
                this.f25039p = i10;
            } else {
                this.f25039p = Z.x(this.f25024a);
            }
            recyclerView.i1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.i1(this, this.f25039p);
            this.f25039p = 0;
        }

        void D() {
            this.f25033j = 0;
            this.f25026c = -1;
            this.f25027d = -1;
            this.f25028e = -1L;
            this.f25030g = -1;
            this.f25036m = 0;
            this.f25031h = null;
            this.f25032i = null;
            d();
            this.f25039p = 0;
            this.f25040q = -1;
            RecyclerView.r(this);
        }

        void E() {
            if (this.f25027d == -1) {
                this.f25027d = this.f25026c;
            }
        }

        void F(int i10, int i11) {
            this.f25033j = (i10 & i11) | (this.f25033j & (~i11));
        }

        public final void G(boolean z10) {
            int i10 = this.f25036m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f25036m = i11;
            if (i11 < 0) {
                this.f25036m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.f25033j |= 16;
            } else if (z10 && i11 == 0) {
                this.f25033j &= -17;
            }
        }

        void H(u uVar, boolean z10) {
            this.f25037n = uVar;
            this.f25038o = z10;
        }

        boolean I() {
            return (this.f25033j & 16) != 0;
        }

        boolean J() {
            return (this.f25033j & 128) != 0;
        }

        void K() {
            this.f25037n.J(this);
        }

        boolean L() {
            return (this.f25033j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f25033j) == 0) {
                g();
                this.f25034k.add(obj);
            }
        }

        void b(int i10) {
            this.f25033j = i10 | this.f25033j;
        }

        void c() {
            this.f25027d = -1;
            this.f25030g = -1;
        }

        void d() {
            List list = this.f25034k;
            if (list != null) {
                list.clear();
            }
            this.f25033j &= -1025;
        }

        void e() {
            this.f25033j &= -33;
        }

        void f() {
            this.f25033j &= -257;
        }

        boolean h() {
            return (this.f25033j & 16) == 0 && Z.O(this.f25024a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            A(i11, z10);
            this.f25026c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f25041r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f25028e;
        }

        public final int l() {
            return this.f25029f;
        }

        public final int m() {
            int i10 = this.f25030g;
            return i10 == -1 ? this.f25026c : i10;
        }

        public final int n() {
            return this.f25027d;
        }

        List o() {
            if ((this.f25033j & 1024) != 0) {
                return f25023s;
            }
            List list = this.f25034k;
            return (list == null || list.size() == 0) ? f25023s : this.f25035l;
        }

        boolean p(int i10) {
            return (i10 & this.f25033j) != 0;
        }

        boolean q() {
            return (this.f25033j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f25024a.getParent() == null || this.f25024a.getParent() == this.f25041r) ? false : true;
        }

        boolean s() {
            return (this.f25033j & 1) != 0;
        }

        boolean t() {
            return (this.f25033j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f25026c + " id=" + this.f25028e + ", oldPos=" + this.f25027d + ", pLpos:" + this.f25030g);
            if (w()) {
                sb2.append(" scrap ");
                sb2.append(this.f25038o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb2.append(" invalid");
            }
            if (!s()) {
                sb2.append(" unbound");
            }
            if (z()) {
                sb2.append(" update");
            }
            if (v()) {
                sb2.append(" removed");
            }
            if (J()) {
                sb2.append(" ignored");
            }
            if (x()) {
                sb2.append(" tmpDetached");
            }
            if (!u()) {
                sb2.append(" not recyclable(" + this.f25036m + ")");
            }
            if (q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f25024a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final boolean u() {
            return (this.f25033j & 16) == 0 && !Z.O(this.f25024a);
        }

        boolean v() {
            return (this.f25033j & 8) != 0;
        }

        boolean w() {
            return this.f25037n != null;
        }

        boolean x() {
            return (this.f25033j & 256) != 0;
        }

        boolean y() {
            return (this.f25033j & 2) != 0;
        }

        boolean z() {
            return (this.f25033j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC2000a implements Runnable {
        RunnableC2000a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f25006t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f25000q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f25012w) {
                recyclerView2.f25010v = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC2001b implements Runnable {
        RunnableC2001b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f24956L;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f24993m0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    static class InterpolatorC2002c implements Interpolator {
        InterpolatorC2002c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class d implements androidx.recyclerview.widget.q.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(C c10, l.b bVar, l.b bVar2) {
            RecyclerView.this.l(c10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(C c10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f24992m.q1(c10.f25024a, recyclerView.f24970b);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(C c10, l.b bVar, l.b bVar2) {
            RecyclerView.this.f24970b.J(c10);
            RecyclerView.this.n(c10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void d(C c10, l.b bVar, l.b bVar2) {
            c10.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f24947C) {
                if (recyclerView.f24956L.b(c10, c10, bVar, bVar2)) {
                    RecyclerView.this.L0();
                }
            } else if (recyclerView.f24956L.d(c10, bVar, bVar2)) {
                RecyclerView.this.L0();
            }
        }
    }

    class e implements b.InterfaceC0313b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void c(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                cF0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public C d(View view) {
            return RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void e(int i10) {
            C cF0;
            View viewA = a(i10);
            if (viewA != null && (cF0 = RecyclerView.f0(viewA)) != null) {
                if (cF0.x() && !cF0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + cF0 + RecyclerView.this.P());
                }
                cF0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void g() {
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                View viewA = a(i10);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void i(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                cF0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0313b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                if (!cF0.x() && !cF0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + cF0 + RecyclerView.this.P());
                }
                cF0.f();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    class f implements a.InterfaceC0312a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void a(int i10, int i11) {
            RecyclerView.this.B0(i10, i11);
            RecyclerView.this.f24987j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void d(int i10, int i11) {
            RecyclerView.this.C0(i10, i11, false);
            RecyclerView.this.f24987j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.v1(i10, i11, obj);
            RecyclerView.this.f24989k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public C f(int i10) {
            C cZ = RecyclerView.this.Z(i10, true);
            if (cZ == null || RecyclerView.this.f24976e.n(cZ.f25024a)) {
                return null;
            }
            return cZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void g(int i10, int i11) {
            RecyclerView.this.A0(i10, i11);
            RecyclerView.this.f24987j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0312a
        public void h(int i10, int i11) {
            RecyclerView.this.C0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f24987j0 = true;
            recyclerView.f24981g0.f25122d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f25200a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f24992m.V0(recyclerView, bVar.f25201b, bVar.f25203d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f24992m.Y0(recyclerView2, bVar.f25201b, bVar.f25203d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f24992m.a1(recyclerView3, bVar.f25201b, bVar.f25203d, bVar.f25202c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f24992m.X0(recyclerView4, bVar.f25201b, bVar.f25203d, 1);
            }
        }
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f25047a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25048b = false;

        public final void a(C c10, int i10) {
            c10.f25026c = i10;
            if (g()) {
                c10.f25028e = d(i10);
            }
            c10.F(1, 519);
            p128h1.n.a("RV OnBindView");
            j(c10, i10, c10.o());
            c10.d();
            ViewGroup.LayoutParams layoutParams = c10.f25024a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f25086c = true;
            }
            p128h1.n.b();
        }

        public final C b(ViewGroup viewGroup, int i10) {
            try {
                p128h1.n.a("RV CreateView");
                C cK = k(viewGroup, i10);
                if (cK.f25024a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                cK.f25029f = i10;
                p128h1.n.b();
                return cK;
            } catch (Throwable th) {
                p128h1.n.b();
                throw th;
            }
        }

        public abstract int c();

        public long d(int i10) {
            return -1L;
        }

        public int e(int i10) {
            return 0;
        }

        public final boolean f() {
            return this.f25047a.a();
        }

        public final boolean g() {
            return this.f25048b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(C c10, int i10);

        public void j(C c10, int i10, List list) {
            i(c10, i10);
        }

        public abstract C k(ViewGroup viewGroup, int i10);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(C c10) {
            return false;
        }

        public void n(C c10) {
        }

        public void o(C c10) {
        }

        public void p(C c10) {
        }

        public void q(i iVar) {
            this.f25047a.registerObserver(iVar);
        }

        public void r(boolean z10) {
            if (f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f25048b = z10;
        }

        public void s(i iVar) {
            this.f25047a.unregisterObserver(iVar);
        }
    }

    static class h extends Observable {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    public static abstract class i {
    }

    public interface j {
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f25049a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f25050b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f25051c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f25052d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f25053e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f25054f = 250;

        interface a {
            void a(C c10);
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f25055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f25056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f25057c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f25058d;

            public b a(C c10) {
                return b(c10, 0);
            }

            public b b(C c10, int i10) {
                View view = c10.f25024a;
                this.f25055a = view.getLeft();
                this.f25056b = view.getTop();
                this.f25057c = view.getRight();
                this.f25058d = view.getBottom();
                return this;
            }
        }

        static int e(C c10) {
            int i10 = c10.f25033j;
            int i11 = i10 & 14;
            if (c10.t()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int iN = c10.n();
                int iJ = c10.j();
                if (iN != -1 && iJ != -1 && iN != iJ) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(C c10, b bVar, b bVar2);

        public abstract boolean b(C c10, C c11, b bVar, b bVar2);

        public abstract boolean c(C c10, b bVar, b bVar2);

        public abstract boolean d(C c10, b bVar, b bVar2);

        public abstract boolean f(C c10);

        public boolean g(C c10, List list) {
            return f(c10);
        }

        public final void h(C c10) {
            r(c10);
            a aVar = this.f25049a;
            if (aVar != null) {
                aVar.a(c10);
            }
        }

        public final void i() {
            if (this.f25050b.size() <= 0) {
                this.f25050b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f25050b.get(0));
                throw null;
            }
        }

        public abstract void j(C c10);

        public abstract void k();

        public long l() {
            return this.f25051c;
        }

        public long m() {
            return this.f25054f;
        }

        public long n() {
            return this.f25053e;
        }

        public long o() {
            return this.f25052d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(C c10) {
        }

        public b s(z zVar, C c10) {
            return q().a(c10);
        }

        public b t(z zVar, C c10, int i10, List list) {
            return q().a(c10);
        }

        public abstract void u();

        void v(a aVar) {
            this.f25049a = aVar;
        }
    }

    private class m implements l.a {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public void a(C c10) {
            c10.G(true);
            if (c10.f25031h != null && c10.f25032i == null) {
                c10.f25031h = null;
            }
            c10.f25032i = null;
            if (c10.I() || RecyclerView.this.U0(c10.f25024a) || !c10.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c10.f25024a, false);
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f25060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f25061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.recyclerview.widget.p.b f25062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.recyclerview.widget.p.b f25063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.p f25064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.p f25065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        y f25066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f25067h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f25068i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f25069j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f25070k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f25071l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f25072m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f25073n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f25074o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f25075p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f25076q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f25077r;

        class a implements androidx.recyclerview.widget.p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i10) {
                return o.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.V(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.i0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.s0() - o.this.j0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements androidx.recyclerview.widget.p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i10) {
                return o.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.k0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.b0() - o.this.h0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f25080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f25081b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f25082c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f25083d;
        }

        public o() {
            a aVar = new a();
            this.f25062c = aVar;
            b bVar = new b();
            this.f25063d = bVar;
            this.f25064e = new androidx.recyclerview.widget.p(aVar);
            this.f25065f = new androidx.recyclerview.widget.p(bVar);
            this.f25067h = false;
            this.f25068i = false;
            this.f25069j = false;
            this.f25070k = true;
            this.f25071l = true;
        }

        private static boolean A0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f25060a.d(i10);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int P(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i10, boolean z10) {
            C cF0 = RecyclerView.f0(view);
            if (z10 || cF0.v()) {
                this.f25061b.f24978f.b(cF0);
            } else {
                this.f25061b.f24978f.p(cF0);
            }
            p pVar = (p) view.getLayoutParams();
            if (cF0.L() || cF0.w()) {
                if (cF0.w()) {
                    cF0.K();
                } else {
                    cF0.e();
                }
                this.f25060a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f25061b) {
                int iM = this.f25060a.m(view);
                if (i10 == -1) {
                    i10 = this.f25060a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f25061b.indexOfChild(view) + this.f25061b.P());
                }
                if (iM != i10) {
                    this.f25061b.f24992m.F0(iM, i10);
                }
            } else {
                this.f25060a.a(view, i10, false);
                pVar.f25086c = true;
                y yVar = this.f25066g;
                if (yVar != null && yVar.h()) {
                    this.f25066g.k(view);
                }
            }
            if (pVar.f25087d) {
                cF0.f25024a.invalidate();
                pVar.f25087d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p165j3.c.f46801f, i10, i11);
            dVar.f25080a = typedArrayObtainStyledAttributes.getInt(p165j3.c.f46802g, 1);
            dVar.f25081b = typedArrayObtainStyledAttributes.getInt(p165j3.c.f46812q, 1);
            dVar.f25082c = typedArrayObtainStyledAttributes.getBoolean(p165j3.c.f46811p, false);
            dVar.f25083d = typedArrayObtainStyledAttributes.getBoolean(p165j3.c.f46813r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f25061b.f24984i;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        private void z1(u uVar, int i10, View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.J()) {
                return;
            }
            if (cF0.t() && !cF0.v() && !this.f25061b.f24990l.g()) {
                u1(i10);
                uVar.C(cF0);
            } else {
                C(i10);
                uVar.D(view);
                this.f25061b.f24978f.k(cF0);
            }
        }

        public abstract int A(z zVar);

        public abstract int A1(int i10, u uVar, z zVar);

        public void B(u uVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(uVar, iO, N(iO));
            }
        }

        public boolean B0() {
            y yVar = this.f25066g;
            return yVar != null && yVar.h();
        }

        public abstract void B1(int i10);

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f25064e.b(view, 24579) && this.f25065f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int C1(int i10, u uVar, z zVar);

        public void D0(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f25085b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f25068i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect rectJ0 = this.f25061b.j0(view);
            int i12 = i10 + rectJ0.left + rectJ0.right;
            int i13 = i11 + rectJ0.top + rectJ0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) pVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) pVar).height, q());
            if (J1(view, iP, iP2, pVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i10, int i11) {
            this.f25076q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f25074o = mode;
            if (mode == 0 && !RecyclerView.f24943y0) {
                this.f25076q = 0;
            }
            this.f25077r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f25075p = mode2;
            if (mode2 != 0 || RecyclerView.f24943y0) {
                return;
            }
            this.f25077r = 0;
        }

        void F(RecyclerView recyclerView, u uVar) {
            this.f25068i = false;
            M0(recyclerView, uVar);
        }

        public void F0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                m(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f25061b.toString());
            }
        }

        public void F1(int i10, int i11) {
            this.f25061b.setMeasuredDimension(i10, i11);
        }

        public View G(View view) {
            View viewR;
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f25060a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void G0(int i10) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                recyclerView.y0(i10);
            }
        }

        public void G1(Rect rect, int i10, int i11) {
            F1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                C cF0 = RecyclerView.f0(viewN);
                if (cF0 != null && cF0.m() == i10 && !cF0.J() && (this.f25061b.f24981g0.e() || !cF0.v())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                recyclerView.z0(i10);
            }
        }

        void H1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.f25061b.w(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.f25061b.f24984i;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f25061b.f24984i.set(i15, i13, i12, i14);
            G1(this.f25061b.f24984i, i10, i11);
        }

        public abstract p I();

        public void I0(g gVar, g gVar2) {
        }

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f25061b = null;
                this.f25060a = null;
                this.f25076q = 0;
                this.f25077r = 0;
            } else {
                this.f25061b = recyclerView;
                this.f25060a = recyclerView.f24976e;
                this.f25076q = recyclerView.getWidth();
                this.f25077r = recyclerView.getHeight();
            }
            this.f25074o = 1073741824;
            this.f25075p = 1073741824;
        }

        public p J(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean J1(View view, int i10, int i11, p pVar) {
            return (!view.isLayoutRequested() && this.f25070k && A0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && A0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p K(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void K0(RecyclerView recyclerView) {
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        boolean L1(View view, int i10, int i11, p pVar) {
            return (this.f25070k && A0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && A0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((p) view.getLayoutParams()).f25085b.bottom;
        }

        public void M0(RecyclerView recyclerView, u uVar) {
            L0(recyclerView);
        }

        public abstract void M1(RecyclerView recyclerView, z zVar, int i10);

        public View N(int i10) {
            androidx.recyclerview.widget.b bVar = this.f25060a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public abstract View N0(View view, int i10, u uVar, z zVar);

        public void N1(y yVar) {
            y yVar2 = this.f25066g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.f25066g.r();
            }
            this.f25066g = yVar;
            yVar.q(this.f25061b, this);
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f25060a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f25061b;
            P0(recyclerView.f24970b, recyclerView.f24981g0, accessibilityEvent);
        }

        void O1() {
            y yVar = this.f25066g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public void P0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f25061b.canScrollVertically(-1) && !this.f25061b.canScrollHorizontally(-1) && !this.f25061b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            g gVar = this.f25061b.f24990l;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public boolean P1() {
            return false;
        }

        public void Q0(u uVar, z zVar, p217m1.B b10) {
            if (this.f25061b.canScrollVertically(-1) || this.f25061b.canScrollHorizontally(-1)) {
                b10.a(8192);
                b10.c1(true);
            }
            if (this.f25061b.canScrollVertically(1) || this.f25061b.canScrollHorizontally(1)) {
                b10.a(4096);
                b10.c1(true);
            }
            b10.B0(m1.B.f.b(o0(uVar, zVar), S(uVar, zVar), z0(uVar, zVar), p0(uVar, zVar)));
        }

        public boolean R() {
            RecyclerView recyclerView = this.f25061b;
            return recyclerView != null && recyclerView.f24980g;
        }

        void R0(p217m1.B b10) {
            RecyclerView recyclerView = this.f25061b;
            Q0(recyclerView.f24970b, recyclerView.f24981g0, b10);
        }

        public int S(u uVar, z zVar) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null || recyclerView.f24990l == null || !p()) {
                return 1;
            }
            return this.f25061b.f24990l.c();
        }

        void S0(View view, p217m1.B b10) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 == null || cF0.v() || this.f25060a.n(cF0.f25024a)) {
                return;
            }
            RecyclerView recyclerView = this.f25061b;
            T0(recyclerView.f24970b, recyclerView.f24981g0, view, b10);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(u uVar, z zVar, View view, p217m1.B b10) {
            b10.C0(m1.B.g.b(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public void U(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public View U0(View view, int i10) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W(View view) {
            Rect rect = ((p) view.getLayoutParams()).f25085b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView) {
        }

        public int X(View view) {
            Rect rect = ((p) view.getLayoutParams()).f25085b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f25060a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            Z0(recyclerView, i10, i11);
        }

        public int b0() {
            return this.f25077r;
        }

        public abstract void b1(u uVar, z zVar);

        public int c0() {
            return this.f25075p;
        }

        public void c1(z zVar) {
        }

        public int d0() {
            return Z.z(this.f25061b);
        }

        public void d1(u uVar, z zVar, int i10, int i11) {
            this.f25061b.w(i10, i11);
        }

        public int e() {
            RecyclerView recyclerView = this.f25061b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public int e0(View view) {
            return ((p) view.getLayoutParams()).f25085b.left;
        }

        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.t0();
        }

        public int f0() {
            return Z.A(this.f25061b);
        }

        public boolean f1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return Z.B(this.f25061b);
        }

        public void g1(Parcelable parcelable) {
        }

        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i10) {
        }

        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(y yVar) {
            if (this.f25066g == yVar) {
                this.f25066g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f25061b;
            return l1(recyclerView.f24970b, recyclerView.f24981g0, i10, bundle);
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int l0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0044 A[PHI: r8
          0x0044: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:24:0x0063, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean l1(u uVar, z zVar, int i10, Bundle bundle) {
            int iB0;
            int iS0;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                iB0 = recyclerView.canScrollVertically(1) ? (b0() - k0()) - h0() : 0;
                if (this.f25061b.canScrollHorizontally(1)) {
                    iS0 = (s0() - i0()) - j0();
                    i11 = iB0;
                    i12 = iS0;
                } else {
                    i11 = iB0;
                    i12 = 0;
                }
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iB0 = recyclerView.canScrollVertically(-1) ? -((b0() - k0()) - h0()) : 0;
                if (this.f25061b.canScrollHorizontally(-1)) {
                    iS0 = -((s0() - i0()) - j0());
                    i11 = iB0;
                    i12 = iS0;
                } else {
                    i11 = iB0;
                    i12 = 0;
                }
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f25061b.n1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void m(View view, int i10) {
            n(view, i10, (p) view.getLayoutParams());
        }

        boolean m1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f25061b;
            return n1(recyclerView.f24970b, recyclerView.f24981g0, view, i10, bundle);
        }

        public void n(View view, int i10, p pVar) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.v()) {
                this.f25061b.f24978f.b(cF0);
            } else {
                this.f25061b.f24978f.p(cF0);
            }
            this.f25060a.c(view, i10, pVar, cF0.v());
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).f25085b.right;
        }

        public boolean n1(u uVar, z zVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int o0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView == null || recyclerView.f24990l == null || !q()) {
                return 1;
            }
            return this.f25061b.f24990l.c();
        }

        public void o1(u uVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.f0(N(iO)).J()) {
                    r1(iO, uVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(u uVar, z zVar) {
            return 0;
        }

        void p1(u uVar) {
            int iJ = uVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = uVar.n(i10);
                C cF0 = RecyclerView.f0(viewN);
                if (!cF0.J()) {
                    cF0.G(false);
                    if (cF0.x()) {
                        this.f25061b.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f25061b.f24956L;
                    if (lVar != null) {
                        lVar.j(cF0);
                    }
                    cF0.G(true);
                    uVar.y(viewN);
                }
            }
            uVar.e();
            if (iJ > 0) {
                this.f25061b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((p) view.getLayoutParams()).f25085b.top;
        }

        public void q1(View view, u uVar) {
            t1(view);
            uVar.B(view);
        }

        public boolean r(p pVar) {
            return pVar != null;
        }

        public void r0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f25085b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f25061b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f25061b.f24988k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i10, u uVar) {
            View viewN = N(i10);
            u1(i10);
            uVar.B(viewN);
        }

        public int s0() {
            return this.f25076q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void t(int i10, int i11, z zVar, c cVar) {
        }

        public int t0() {
            return this.f25074o;
        }

        public void t1(View view) {
            this.f25060a.p(view);
        }

        public void u(int i10, c cVar) {
        }

        boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i10) {
            if (N(i10) != null) {
                this.f25060a.q(i10);
            }
        }

        public abstract int v(z zVar);

        public boolean v0() {
            return this.f25068i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return w1(recyclerView, view, rect, z10, false);
        }

        public abstract int w(z zVar);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.k1(i10, i11);
            }
            return true;
        }

        public abstract int x(z zVar);

        public void x1() {
            RecyclerView recyclerView = this.f25061b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(z zVar);

        public final boolean y0() {
            return this.f25071l;
        }

        public void y1() {
            this.f25067h = true;
        }

        public abstract int z(z zVar);

        public boolean z0(u uVar, z zVar) {
            return false;
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C f25084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f25085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f25086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f25087d;

        public p(int i10, int i11) {
            super(i10, i11);
            this.f25085b = new Rect();
            this.f25086c = true;
            this.f25087d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f25085b = new Rect();
            this.f25086c = true;
            this.f25087d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25085b = new Rect();
            this.f25086c = true;
            this.f25087d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f25085b = new Rect();
            this.f25086c = true;
            this.f25087d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f25085b = new Rect();
            this.f25086c = true;
            this.f25087d = false;
        }

        public int a() {
            return this.f25084a.m();
        }

        public boolean b() {
            return this.f25084a.y();
        }

        public boolean c() {
            return this.f25084a.v();
        }

        public boolean d() {
            return this.f25084a.t();
        }
    }

    public static abstract class q {
        public abstract boolean a(int i10, int i11);
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public abstract void b(RecyclerView recyclerView, int i10, int i11);
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f25088a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25089b = 0;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList f25090a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f25091b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f25092c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f25093d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = (a) this.f25088a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f25088a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f25089b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f25088a.size(); i10++) {
                ((a) this.f25088a.valueAt(i10)).f25090a.clear();
            }
        }

        void c() {
            this.f25089b--;
        }

        void d(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f25093d = j(aVarG.f25093d, j10);
        }

        void e(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f25092c = j(aVarG.f25092c, j10);
        }

        public C f(int i10) {
            a aVar = (a) this.f25088a.get(i10);
            if (aVar == null || aVar.f25090a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f25090a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C) arrayList.get(size)).r()) {
                    return (C) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z10) {
            if (gVar != null) {
                c();
            }
            if (!z10 && this.f25089b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(C c10) {
            int iL = c10.l();
            ArrayList arrayList = g(iL).f25090a;
            if (((a) this.f25088a.get(iL)).f25091b <= arrayList.size()) {
                return;
            }
            c10.D();
            arrayList.add(c10);
        }

        long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f25093d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f25092c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f25094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f25095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f25096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f25097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f25099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        t f25100g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f25094a = arrayList;
            this.f25095b = null;
            this.f25096c = new ArrayList();
            this.f25097d = Collections.unmodifiableList(arrayList);
            this.f25098e = 2;
            this.f25099f = 2;
        }

        private boolean H(C c10, int i10, int i11, long j10) {
            c10.f25041r = RecyclerView.this;
            int iL = c10.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f25100g.k(iL, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f24990l.a(c10, i10);
            this.f25100g.d(c10.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c10);
            if (!RecyclerView.this.f24981g0.e()) {
                return true;
            }
            c10.f25030g = i11;
            return true;
        }

        private void b(C c10) {
            if (RecyclerView.this.s0()) {
                View view = c10.f25024a;
                if (Z.x(view) == 0) {
                    Z.v0(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f24995n0;
                if (lVar == null) {
                    return;
                }
                C1894a c1894aN = lVar.n();
                if (c1894aN instanceof androidx.recyclerview.widget.l.a) {
                    ((androidx.recyclerview.widget.l.a) c1894aN).o(view);
                }
                Z.m0(view, c1894aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(C c10) {
            View view = c10.f25024a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i10) {
            a((C) this.f25096c.get(i10), true);
            this.f25096c.remove(i10);
        }

        public void B(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (cF0.w()) {
                cF0.K();
            } else if (cF0.L()) {
                cF0.e();
            }
            C(cF0);
            if (RecyclerView.this.f24956L == null || cF0.u()) {
                return;
            }
            RecyclerView.this.f24956L.j(cF0);
        }

        void C(C c10) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (c10.w() || c10.f25024a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(c10.w());
                sb2.append(" isAttached:");
                sb2.append(c10.f25024a.getParent() != null);
                sb2.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (c10.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c10 + RecyclerView.this.P());
            }
            if (c10.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zH = c10.h();
            g gVar = RecyclerView.this.f24990l;
            if ((gVar != null && zH && gVar.m(c10)) || c10.u()) {
                if (this.f25099f <= 0 || c10.p(526)) {
                    z10 = false;
                } else {
                    int size = this.f25096c.size();
                    if (size >= this.f25099f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f24936A0 && size > 0 && !RecyclerView.this.f24979f0.d(c10.f25026c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f24979f0.d(((C) this.f25096c.get(i10)).f25026c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f25096c.add(size, c10);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(c10, true);
                }
                z11 = z10;
            } else {
                z12 = false;
            }
            RecyclerView.this.f24978f.q(c10);
            if (z11 || z12 || !zH) {
                return;
            }
            c10.f25041r = null;
        }

        void D(View view) {
            C cF0 = RecyclerView.f0(view);
            if (!cF0.p(12) && cF0.y() && !RecyclerView.this.p(cF0)) {
                if (this.f25095b == null) {
                    this.f25095b = new ArrayList();
                }
                cF0.H(this, true);
                this.f25095b.add(cF0);
                return;
            }
            if (!cF0.t() || cF0.v() || RecyclerView.this.f24990l.g()) {
                cF0.H(this, false);
                this.f25094a.add(cF0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        void E(t tVar) {
            t tVar2 = this.f25100g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.f25100g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f25100g.a();
        }

        void F(A a10) {
        }

        public void G(int i10) {
            this.f25098e = i10;
            K();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:67:0x014a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0176  */
        /* JADX WARN: Code duplicated, block: B:75:0x017c  */
        /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:85:0x01af  */
        /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:91:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
        C I(int i10, boolean z10, long j10) {
            C cB;
            boolean z11;
            C c10;
            boolean z12;
            boolean zH;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            int iM;
            RecyclerView recyclerViewV;
            if (i10 < 0 || i10 >= RecyclerView.this.f24981g0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f24981g0.b() + RecyclerView.this.P());
            }
            if (RecyclerView.this.f24981g0.e()) {
                cB = h(i10);
                if (cB != null) {
                    z11 = true;
                }
                if (cB == null && (cB = m(i10, z10)) != null) {
                    if (L(cB)) {
                        z11 = true;
                    } else {
                        if (!z10) {
                            cB.b(4);
                            if (cB.w()) {
                                RecyclerView.this.removeDetachedView(cB.f25024a, false);
                                cB.K();
                            } else if (cB.L()) {
                                cB.e();
                            }
                            C(cB);
                        }
                        cB = null;
                    }
                }
                if (cB == null) {
                    iM = RecyclerView.this.f24974d.m(i10);
                    if (iM >= 0 || iM >= RecyclerView.this.f24990l.c()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f24981g0.b() + RecyclerView.this.P());
                    }
                    int iE = RecyclerView.this.f24990l.e(iM);
                    if (RecyclerView.this.f24990l.g() && (cB = l(RecyclerView.this.f24990l.d(iM), iE, z10)) != null) {
                        cB.f25026c = iM;
                        z11 = true;
                    }
                    if (cB == null) {
                        C cF = i().f(iE);
                        if (cF != null) {
                            cF.D();
                            if (RecyclerView.f24942x0) {
                                r(cF);
                            }
                        }
                        cB = cF;
                    }
                    if (cB == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f25100g.l(iE, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        cB = recyclerView.f24990l.b(recyclerView, iE);
                        if (RecyclerView.f24936A0 && (recyclerViewV = RecyclerView.V(cB.f25024a)) != null) {
                            cB.f25025b = new WeakReference(recyclerViewV);
                        }
                        this.f25100g.e(iE, RecyclerView.this.getNanoTime() - nanoTime);
                    }
                }
                c10 = cB;
                z12 = z11;
                if (z12 && !RecyclerView.this.f24981g0.e() && c10.p(8192)) {
                    c10.F(0, 8192);
                    if (RecyclerView.this.f24981g0.f25129k) {
                        int iE2 = l.e(c10) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.Q0(c10, recyclerView2.f24956L.t(recyclerView2.f24981g0, c10, iE2, c10.o()));
                    }
                }
                if (RecyclerView.this.f24981g0.e() || !c10.s()) {
                    if (c10.s() || c10.z() || c10.t()) {
                        zH = H(c10, RecyclerView.this.f24974d.m(i10), i10, j10);
                    }
                    layoutParams = c10.f25024a.getLayoutParams();
                    if (layoutParams == null) {
                        pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                        c10.f25024a.setLayoutParams(pVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        pVar = (p) layoutParams;
                    } else {
                        pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                        c10.f25024a.setLayoutParams(pVar);
                    }
                    pVar.f25084a = c10;
                    pVar.f25087d = !z12 && zH;
                    return c10;
                }
                c10.f25030g = i10;
                zH = false;
                layoutParams = c10.f25024a.getLayoutParams();
                if (layoutParams == null) {
                    pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                    c10.f25024a.setLayoutParams(pVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                    c10.f25024a.setLayoutParams(pVar);
                } else {
                    pVar = (p) layoutParams;
                }
                pVar.f25084a = c10;
                pVar.f25087d = !z12 && zH;
                return c10;
            }
            cB = null;
            z11 = false;
            if (cB == null) {
                if (L(cB)) {
                    if (!z10) {
                        cB.b(4);
                        if (cB.w()) {
                            RecyclerView.this.removeDetachedView(cB.f25024a, false);
                            cB.K();
                        } else if (cB.L()) {
                            cB.e();
                        }
                        C(cB);
                    }
                    cB = null;
                } else {
                    z11 = true;
                }
            }
            if (cB == null) {
                iM = RecyclerView.this.f24974d.m(i10);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f24981g0.b() + RecyclerView.this.P());
            }
            c10 = cB;
            z12 = z11;
            if (z12) {
                c10.F(0, 8192);
                if (RecyclerView.this.f24981g0.f25129k) {
                    int iE3 = l.e(c10) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.Q0(c10, recyclerView3.f24956L.t(recyclerView3.f24981g0, c10, iE3, c10.o()));
                }
            }
            if (RecyclerView.this.f24981g0.e()) {
                if (c10.s()) {
                }
                zH = H(c10, RecyclerView.this.f24974d.m(i10), i10, j10);
            } else {
                if (c10.s()) {
                }
                zH = H(c10, RecyclerView.this.f24974d.m(i10), i10, j10);
            }
            layoutParams = c10.f25024a.getLayoutParams();
            if (layoutParams == null) {
                pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                c10.f25024a.setLayoutParams(pVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                c10.f25024a.setLayoutParams(pVar);
            } else {
                pVar = (p) layoutParams;
            }
            pVar.f25084a = c10;
            pVar.f25087d = !z12 && zH;
            return c10;
        }

        void J(C c10) {
            if (c10.f25038o) {
                this.f25095b.remove(c10);
            } else {
                this.f25094a.remove(c10);
            }
            c10.f25037n = null;
            c10.f25038o = false;
            c10.e();
        }

        void K() {
            o oVar = RecyclerView.this.f24992m;
            this.f25099f = this.f25098e + (oVar != null ? oVar.f25072m : 0);
            for (int size = this.f25096c.size() - 1; size >= 0 && this.f25096c.size() > this.f25099f; size--) {
                A(size);
            }
        }

        boolean L(C c10) {
            if (c10.v()) {
                return RecyclerView.this.f24981g0.e();
            }
            int i10 = c10.f25026c;
            if (i10 >= 0 && i10 < RecyclerView.this.f24990l.c()) {
                if (RecyclerView.this.f24981g0.e() || RecyclerView.this.f24990l.e(c10.f25026c) == c10.l()) {
                    return !RecyclerView.this.f24990l.g() || c10.k() == RecyclerView.this.f24990l.d(c10.f25026c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c10 + RecyclerView.this.P());
        }

        void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f25096c.size() - 1; size >= 0; size--) {
                C c10 = (C) this.f25096c.get(size);
                if (c10 != null && (i12 = c10.f25026c) >= i10 && i12 < i13) {
                    c10.b(2);
                    A(size);
                }
            }
        }

        void a(C c10, boolean z10) {
            RecyclerView.r(c10);
            View view = c10.f25024a;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f24995n0;
            if (lVar != null) {
                C1894a c1894aN = lVar.n();
                Z.m0(view, c1894aN instanceof androidx.recyclerview.widget.l.a ? ((androidx.recyclerview.widget.l.a) c1894aN).n(view) : null);
            }
            if (z10) {
                g(c10);
            }
            c10.f25041r = null;
            i().i(c10);
        }

        public void c() {
            this.f25094a.clear();
            z();
        }

        void d() {
            int size = this.f25096c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C) this.f25096c.get(i10)).c();
            }
            int size2 = this.f25094a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((C) this.f25094a.get(i11)).c();
            }
            ArrayList arrayList = this.f25095b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((C) this.f25095b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f25094a.clear();
            ArrayList arrayList = this.f25095b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f24981g0.b()) {
                return !RecyclerView.this.f24981g0.e() ? i10 : RecyclerView.this.f24974d.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f24981g0.b() + RecyclerView.this.P());
        }

        void g(C c10) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.f24990l;
            if (gVar != null) {
                gVar.p(c10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f24981g0 != null) {
                recyclerView.f24978f.q(c10);
            }
        }

        C h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f25095b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C c10 = (C) this.f25095b.get(i11);
                    if (!c10.L() && c10.m() == i10) {
                        c10.b(32);
                        return c10;
                    }
                }
                if (RecyclerView.this.f24990l.g() && (iM = RecyclerView.this.f24974d.m(i10)) > 0 && iM < RecyclerView.this.f24990l.c()) {
                    long jD = RecyclerView.this.f24990l.d(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        C c11 = (C) this.f25095b.get(i12);
                        if (!c11.L() && c11.k() == jD) {
                            c11.b(32);
                            return c11;
                        }
                    }
                }
            }
            return null;
        }

        t i() {
            if (this.f25100g == null) {
                this.f25100g = new t();
            }
            return this.f25100g;
        }

        int j() {
            return this.f25094a.size();
        }

        public List k() {
            return this.f25097d;
        }

        C l(long j10, int i10, boolean z10) {
            for (int size = this.f25094a.size() - 1; size >= 0; size--) {
                C c10 = (C) this.f25094a.get(size);
                if (c10.k() == j10 && !c10.L()) {
                    if (i10 == c10.l()) {
                        c10.b(32);
                        if (c10.v() && !RecyclerView.this.f24981g0.e()) {
                            c10.F(2, 14);
                        }
                        return c10;
                    }
                    if (!z10) {
                        this.f25094a.remove(size);
                        RecyclerView.this.removeDetachedView(c10.f25024a, false);
                        y(c10.f25024a);
                    }
                }
            }
            int size2 = this.f25096c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C c11 = (C) this.f25096c.get(size2);
                if (c11.k() == j10 && !c11.r()) {
                    if (i10 == c11.l()) {
                        if (!z10) {
                            this.f25096c.remove(size2);
                        }
                        return c11;
                    }
                    if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        C m(int i10, boolean z10) {
            View viewE;
            int size = this.f25094a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C c10 = (C) this.f25094a.get(i11);
                if (!c10.L() && c10.m() == i10 && !c10.t() && (RecyclerView.this.f24981g0.f25126h || !c10.v())) {
                    c10.b(32);
                    return c10;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f24976e.e(i10)) == null) {
                int size2 = this.f25096c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C c11 = (C) this.f25096c.get(i12);
                    if (!c11.t() && c11.m() == i10 && !c11.r()) {
                        if (!z10) {
                            this.f25096c.remove(i12);
                        }
                        return c11;
                    }
                }
                return null;
            }
            C cF0 = RecyclerView.f0(viewE);
            RecyclerView.this.f24976e.s(viewE);
            int iM = RecyclerView.this.f24976e.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f24976e.d(iM);
                D(viewE);
                cF0.b(8224);
                return cF0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + cF0 + RecyclerView.this.P());
        }

        View n(int i10) {
            return ((C) this.f25094a.get(i10)).f25024a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).f25024a;
        }

        void s() {
            int size = this.f25096c.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) ((C) this.f25096c.get(i10)).f25024a.getLayoutParams();
                if (pVar != null) {
                    pVar.f25086c = true;
                }
            }
        }

        void t() {
            int size = this.f25096c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C c10 = (C) this.f25096c.get(i10);
                if (c10 != null) {
                    c10.b(6);
                    c10.a(null);
                }
            }
            g gVar = RecyclerView.this.f24990l;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        void u(int i10, int i11) {
            int size = this.f25096c.size();
            for (int i12 = 0; i12 < size; i12++) {
                C c10 = (C) this.f25096c.get(i12);
                if (c10 != null && c10.f25026c >= i10) {
                    c10.A(i11, true);
                }
            }
        }

        void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f25096c.size();
            for (int i16 = 0; i16 < size; i16++) {
                C c10 = (C) this.f25096c.get(i16);
                if (c10 != null && (i15 = c10.f25026c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        c10.A(i11 - i10, false);
                    } else {
                        c10.A(i12, false);
                    }
                }
            }
        }

        void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f25096c.size() - 1; size >= 0; size--) {
                C c10 = (C) this.f25096c.get(size);
                if (c10 != null) {
                    int i13 = c10.f25026c;
                    if (i13 >= i12) {
                        c10.A(-i11, z10);
                    } else if (i13 >= i10) {
                        c10.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z10) {
            c();
            i().h(gVar, gVar2, z10);
        }

        void y(View view) {
            C cF0 = RecyclerView.f0(view);
            cF0.f25037n = null;
            cF0.f25038o = false;
            cF0.e();
            C(cF0);
        }

        void z() {
            for (int size = this.f25096c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f25096c.clear();
            if (RecyclerView.f24936A0) {
                RecyclerView.this.f24979f0.b();
            }
        }
    }

    public interface v {
    }

    private class w extends i {
        w() {
        }
    }

    public static class x extends p325s1.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f25103c;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i10) {
                return new x[i10];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25103c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }

        void j(x xVar) {
            this.f25103c = xVar.f25103c;
        }

        @Override // p325s1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f25103c, 0);
        }
    }

    public static abstract class y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f25105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f25106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f25109f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f25111h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25104a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f25110g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f25112a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f25113b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f25114c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f25115d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f25116e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f25117f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f25118g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f25115d = -1;
                this.f25117f = false;
                this.f25118g = 0;
                this.f25112a = i10;
                this.f25113b = i11;
                this.f25114c = i12;
                this.f25116e = interpolator;
            }

            private void e() {
                if (this.f25116e != null && this.f25114c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f25114c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f25115d >= 0;
            }

            public void b(int i10) {
                this.f25115d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f25115d;
                if (i10 >= 0) {
                    this.f25115d = -1;
                    recyclerView.v0(i10);
                    this.f25117f = false;
                } else {
                    if (!this.f25117f) {
                        this.f25118g = 0;
                        return;
                    }
                    e();
                    recyclerView.f24975d0.f(this.f25112a, this.f25113b, this.f25114c, this.f25116e);
                    int i11 = this.f25118g + 1;
                    this.f25118g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f25117f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f25112a = i10;
                this.f25113b = i11;
                this.f25114c = i12;
                this.f25116e = interpolator;
                this.f25117f = true;
            }
        }

        public interface b {
            PointF c(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f25105b.f24992m.H(i10);
        }

        public int c() {
            return this.f25105b.f24992m.O();
        }

        public int d(View view) {
            return this.f25105b.d0(view);
        }

        public o e() {
            return this.f25106c;
        }

        public int f() {
            return this.f25104a;
        }

        public boolean g() {
            return this.f25107d;
        }

        public boolean h() {
            return this.f25108e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f25105b;
            if (this.f25104a == -1 || recyclerView == null) {
                r();
            }
            if (this.f25107d && this.f25109f == null && this.f25106c != null && (pointFA = a(this.f25104a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.f1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f25107d = false;
            View view = this.f25109f;
            if (view != null) {
                if (d(view) == this.f25104a) {
                    o(this.f25109f, recyclerView.f24981g0, this.f25110g);
                    this.f25110g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f25109f = null;
                }
            }
            if (this.f25108e) {
                l(i10, i11, recyclerView.f24981g0, this.f25110g);
                boolean zA = this.f25110g.a();
                this.f25110g.c(recyclerView);
                if (zA && this.f25108e) {
                    this.f25107d = true;
                    recyclerView.f24975d0.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f25109f = view;
            }
        }

        protected abstract void l(int i10, int i11, z zVar, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, z zVar, a aVar);

        public void p(int i10) {
            this.f25104a = i10;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f24975d0.g();
            if (this.f25111h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f25105b = recyclerView;
            this.f25106c = oVar;
            int i10 = this.f25104a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f24981g0.f25119a = i10;
            this.f25108e = true;
            this.f25107d = true;
            this.f25109f = b(f());
            m();
            this.f25105b.f24975d0.e();
            this.f25111h = true;
        }

        protected final void r() {
            if (this.f25108e) {
                this.f25108e = false;
                n();
                this.f25105b.f24981g0.f25119a = -1;
                this.f25109f = null;
                this.f25104a = -1;
                this.f25107d = false;
                this.f25106c.j1(this);
                this.f25106c = null;
                this.f25105b = null;
            }
        }
    }

    public static class z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f25120b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f25131m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f25132n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f25133o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f25134p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25135q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25119a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25121c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25122d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25123e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f25124f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f25125g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f25126h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f25127i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f25128j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f25129k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f25130l = false;

        void a(int i10) {
            if ((this.f25123e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f25123e));
        }

        public int b() {
            return this.f25126h ? this.f25121c - this.f25122d : this.f25124f;
        }

        public int c() {
            return this.f25119a;
        }

        public boolean d() {
            return this.f25119a != -1;
        }

        public boolean e() {
            return this.f25126h;
        }

        void f(g gVar) {
            this.f25123e = 1;
            this.f25124f = gVar.c();
            this.f25126h = false;
            this.f25127i = false;
            this.f25128j = false;
        }

        public boolean g() {
            return this.f25130l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f25119a + ", mData=" + this.f25120b + ", mItemCount=" + this.f25124f + ", mIsMeasuring=" + this.f25128j + ", mPreviousLayoutItemCount=" + this.f25121c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f25122d + ", mStructureChanged=" + this.f25125g + ", mInPreLayout=" + this.f25126h + ", mRunSimpleAnimations=" + this.f25129k + ", mRunPredictiveAnimations=" + this.f25130l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f24939D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f24940E0 = new InterpolatorC2002c();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p165j3.a.f46792a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24968a = new w();
        this.f24970b = new u();
        this.f24978f = new androidx.recyclerview.widget.q();
        this.f24982h = new RunnableC2000a();
        this.f24984i = new Rect();
        this.f24986j = new Rect();
        this.f24988k = new RectF();
        this.f24994n = new ArrayList();
        this.f24996o = new ArrayList();
        this.f25008u = 0;
        this.f24947C = false;
        this.f24948D = false;
        this.f24949E = 0;
        this.f24950F = 0;
        this.f24951G = new k();
        this.f24956L = new c();
        this.f24957M = 0;
        this.f24958N = -1;
        this.f24969a0 = Float.MIN_VALUE;
        this.f24971b0 = Float.MIN_VALUE;
        this.f24973c0 = true;
        this.f24975d0 = new B();
        this.f24979f0 = f24936A0 ? new androidx.recyclerview.widget.e.b() : null;
        this.f24981g0 = new z();
        this.f24987j0 = false;
        this.f24989k0 = false;
        this.f24991l0 = new m();
        this.f24993m0 = false;
        this.f24997o0 = new int[2];
        this.f25001q0 = new int[2];
        this.f25003r0 = new int[2];
        this.f25005s0 = new int[2];
        this.f25007t0 = new ArrayList();
        this.f25009u0 = new RunnableC2001b();
        this.f25011v0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f24964T = viewConfiguration.getScaledTouchSlop();
        this.f24969a0 = AbstractC1899c0.f(viewConfiguration, context);
        this.f24971b0 = AbstractC1899c0.j(viewConfiguration, context);
        this.f24966V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f24967W = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f24956L.v(this.f24991l0);
        n0();
        p0();
        o0();
        if (Z.x(this) == 0) {
            Z.v0(this, 1);
        }
        this.f24945A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p165j3.c.f46801f, i10, 0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, p165j3.c.f46801f, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(p165j3.c.f46810o);
        if (typedArrayObtainStyledAttributes.getInt(p165j3.c.f46804i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f24980g = typedArrayObtainStyledAttributes.getBoolean(p165j3.c.f46803h, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(p165j3.c.f46805j, false);
        this.f25004s = z10;
        if (z10) {
            q0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p165j3.c.f46808m), typedArrayObtainStyledAttributes.getDrawable(p165j3.c.f46809n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p165j3.c.f46806k), typedArrayObtainStyledAttributes.getDrawable(p165j3.c.f46807l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i10, 0);
        int[] iArr = f24941w0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        }
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    private void A() {
        int i10 = this.f25014y;
        this.f25014y = 0;
        if (i10 == 0 || !s0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC4000b.c(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.f24981g0.a(1);
        Q(this.f24981g0);
        this.f24981g0.f25128j = false;
        p1();
        this.f24978f.f();
        F0();
        N0();
        c1();
        z zVar = this.f24981g0;
        zVar.f25127i = zVar.f25129k && this.f24989k0;
        this.f24989k0 = false;
        this.f24987j0 = false;
        zVar.f25126h = zVar.f25130l;
        zVar.f25124f = this.f24990l.c();
        U(this.f24997o0);
        if (this.f24981g0.f25129k) {
            int iG = this.f24976e.g();
            for (int i10 = 0; i10 < iG; i10++) {
                C cF0 = f0(this.f24976e.f(i10));
                if (!cF0.J() && (!cF0.t() || this.f24990l.g())) {
                    this.f24978f.e(cF0, this.f24956L.t(this.f24981g0, cF0, l.e(cF0), cF0.o()));
                    if (this.f24981g0.f25127i && cF0.y() && !cF0.v() && !cF0.J() && !cF0.t()) {
                        this.f24978f.c(c0(cF0), cF0);
                    }
                }
            }
        }
        if (this.f24981g0.f25130l) {
            d1();
            z zVar2 = this.f24981g0;
            boolean z10 = zVar2.f25125g;
            zVar2.f25125g = false;
            this.f24992m.b1(this.f24970b, zVar2);
            this.f24981g0.f25125g = z10;
            for (int i11 = 0; i11 < this.f24976e.g(); i11++) {
                C cF1 = f0(this.f24976e.f(i11));
                if (!cF1.J() && !this.f24978f.i(cF1)) {
                    int iE = l.e(cF1);
                    boolean zP = cF1.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    l.b bVarT = this.f24956L.t(this.f24981g0, cF1, iE, cF1.o());
                    if (zP) {
                        Q0(cF1, bVarT);
                    } else {
                        this.f24978f.a(cF1, bVarT);
                    }
                }
            }
            s();
        } else {
            s();
        }
        G0();
        r1(false);
        this.f24981g0.f25123e = 2;
    }

    private void D() {
        p1();
        F0();
        this.f24981g0.a(6);
        this.f24974d.j();
        this.f24981g0.f25124f = this.f24990l.c();
        z zVar = this.f24981g0;
        zVar.f25122d = 0;
        zVar.f25126h = false;
        this.f24992m.b1(this.f24970b, zVar);
        z zVar2 = this.f24981g0;
        zVar2.f25125g = false;
        this.f24972c = null;
        zVar2.f25129k = zVar2.f25129k && this.f24956L != null;
        zVar2.f25123e = 4;
        G0();
        r1(false);
    }

    private void E() {
        RecyclerView recyclerView;
        this.f24981g0.a(4);
        p1();
        F0();
        z zVar = this.f24981g0;
        zVar.f25123e = 1;
        if (zVar.f25129k) {
            for (int iG = this.f24976e.g() - 1; iG >= 0; iG--) {
                C cF0 = f0(this.f24976e.f(iG));
                if (!cF0.J()) {
                    long jC0 = c0(cF0);
                    l.b bVarS = this.f24956L.s(this.f24981g0, cF0);
                    C cG = this.f24978f.g(jC0);
                    if (cG == null || cG.J()) {
                        this.f24978f.d(cF0, bVarS);
                    } else {
                        boolean zH = this.f24978f.h(cG);
                        boolean zH2 = this.f24978f.h(cF0);
                        if (zH && cG == cF0) {
                            this.f24978f.d(cF0, bVarS);
                        } else {
                            l.b bVarN = this.f24978f.n(cG);
                            this.f24978f.d(cF0, bVarS);
                            l.b bVarM = this.f24978f.m(cF0);
                            if (bVarN == null) {
                                k0(jC0, cF0, cG);
                            } else {
                                m(cG, cF0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f24978f.o(recyclerView.f25011v0);
        } else {
            recyclerView = this;
        }
        recyclerView.f24992m.p1(recyclerView.f24970b);
        z zVar2 = recyclerView.f24981g0;
        zVar2.f25121c = zVar2.f25124f;
        recyclerView.f24947C = false;
        recyclerView.f24948D = false;
        zVar2.f25129k = false;
        zVar2.f25130l = false;
        recyclerView.f24992m.f25067h = false;
        ArrayList arrayList = recyclerView.f24970b.f25095b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = recyclerView.f24992m;
        if (oVar.f25073n) {
            oVar.f25072m = 0;
            oVar.f25073n = false;
            recyclerView.f24970b.K();
        }
        recyclerView.f24992m.c1(recyclerView.f24981g0);
        G0();
        r1(false);
        recyclerView.f24978f.f();
        int[] iArr = recyclerView.f24997o0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        R0();
        a1();
    }

    private void I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f24958N) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f24958N = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f24962R = x10;
            this.f24960P = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f24963S = y10;
            this.f24961Q = y10;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        r rVar = this.f24998p;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        rVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f24998p = null;
        }
        return true;
    }

    private boolean M0() {
        return this.f24956L != null && this.f24992m.P1();
    }

    private void N0() {
        boolean z10;
        if (this.f24947C) {
            this.f24974d.u();
            if (this.f24948D) {
                this.f24992m.W0(this);
            }
        }
        if (M0()) {
            this.f24974d.s();
        } else {
            this.f24974d.j();
        }
        boolean z11 = this.f24987j0 || this.f24989k0;
        this.f24981g0.f25129k = this.f25006t && this.f24956L != null && ((z10 = this.f24947C) || z11 || this.f24992m.f25067h) && (!z10 || this.f24990l.g());
        z zVar = this.f24981g0;
        zVar.f25130l = zVar.f25129k && z11 && !this.f24947C && M0();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void P0(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                N();
                androidx.core.widget.d.c(this.f24954J, f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < 0.0f) {
                O();
                androidx.core.widget.d.c(this.f24953I, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                L();
                androidx.core.widget.d.c(this.f24955K, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            Z.d0(this);
        }
        M();
        androidx.core.widget.d.c(this.f24952H, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < 0.0f) {
            O();
            androidx.core.widget.d.c(this.f24953I, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            L();
            androidx.core.widget.d.c(this.f24955K, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        Z.d0(this);
    }

    private void R0() {
        View viewFindViewById;
        if (!this.f24973c0 || this.f24990l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f24938C0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f24976e.n(focusedChild)) {
                    return;
                }
            } else if (this.f24976e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        C cY = (this.f24981g0.f25132n == -1 || !this.f24990l.g()) ? null : Y(this.f24981g0.f25132n);
        if (cY != null && !this.f24976e.n(cY.f25024a) && cY.f25024a.hasFocusable()) {
            viewW = cY.f25024a;
        } else if (this.f24976e.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i10 = this.f24981g0.f25133o;
            if (i10 != -1 && (viewFindViewById = viewW.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private void S0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f24952H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f24952H.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f24953I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f24953I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f24954J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f24954J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f24955K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f24955K.isFinished();
        }
        if (zIsFinished) {
            Z.d0(this);
        }
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f24996o.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = (r) this.f24996o.get(i10);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.f24998p = rVar;
                return true;
            }
        }
        return false;
    }

    private void U(int[] iArr) {
        int iG = this.f24976e.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            C cF0 = f0(this.f24976e.f(i12));
            if (!cF0.J()) {
                int iM = cF0.m();
                if (iM < i10) {
                    i10 = iM;
                }
                if (iM > i11) {
                    i11 = iM;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i10));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private View W() {
        C cX;
        z zVar = this.f24981g0;
        int i10 = zVar.f25131m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = zVar.b();
        for (int i11 = i10; i11 < iB; i11++) {
            C cX2 = X(i11);
            if (cX2 == null) {
                break;
            }
            if (cX2.f25024a.hasFocusable()) {
                return cX2.f25024a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (cX = X(iMin)) == null) {
                return null;
            }
        } while (!cX.f25024a.hasFocusable());
        return cX.f25024a;
    }

    private void Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f24984i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f25086c) {
                Rect rect = pVar.f25085b;
                Rect rect2 = this.f24984i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f24984i);
            offsetRectIntoDescendantCoords(view, this.f24984i);
        }
        this.f24992m.w1(this, view, this.f24984i, !this.f25006t, view2 == null);
    }

    private void a1() {
        z zVar = this.f24981g0;
        zVar.f25132n = -1L;
        zVar.f25131m = -1;
        zVar.f25133o = -1;
    }

    private void b1() {
        VelocityTracker velocityTracker = this.f24959O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        s1(0);
        S0();
    }

    private void c1() {
        int iJ;
        View focusedChild = (this.f24973c0 && hasFocus() && this.f24990l != null) ? getFocusedChild() : null;
        C cS = focusedChild != null ? S(focusedChild) : null;
        if (cS == null) {
            a1();
            return;
        }
        this.f24981g0.f25132n = this.f24990l.g() ? cS.k() : -1L;
        z zVar = this.f24981g0;
        if (this.f24947C) {
            iJ = -1;
        } else {
            iJ = cS.v() ? cS.f25027d : cS.j();
        }
        zVar.f25131m = iJ;
        this.f24981g0.f25133o = h0(cS.f25024a);
    }

    static C f0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f25084a;
    }

    private void g(C c10) {
        View view = c10.f25024a;
        boolean z10 = view.getParent() == this;
        this.f24970b.J(e0(view));
        if (c10.x()) {
            this.f24976e.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f24976e.k(view);
        } else {
            this.f24976e.b(view, true);
        }
    }

    static void g0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f25085b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private D getScrollingChildHelper() {
        if (this.f24999p0 == null) {
            this.f24999p0 = new D(this);
        }
        return this.f24999p0;
    }

    private int h0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void h1(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.f24990l;
        if (gVar2 != null) {
            gVar2.s(this.f24968a);
            this.f24990l.l(this);
        }
        if (!z10 || z11) {
            T0();
        }
        this.f24974d.u();
        g gVar3 = this.f24990l;
        this.f24990l = gVar;
        if (gVar != null) {
            gVar.q(this.f24968a);
            gVar.h(this);
        }
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.I0(gVar3, this.f24990l);
        }
        this.f24970b.x(gVar3, this.f24990l, z10);
        this.f24981g0.f25125g = true;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void k0(long j10, C c10, C c11) {
        int iG = this.f24976e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            C cF0 = f0(this.f24976e.f(i10));
            if (cF0 != c10 && c0(cF0) == j10) {
                g gVar = this.f24990l;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + cF0 + " \n View Holder 2:" + c10 + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + cF0 + " \n View Holder 2:" + c10 + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c11 + " cannot be found but it is necessary for " + c10 + P());
    }

    private void m(C c10, C c11, l.b bVar, l.b bVar2, boolean z10, boolean z11) {
        c10.G(false);
        if (z10) {
            g(c10);
        }
        if (c10 != c11) {
            if (z11) {
                g(c11);
            }
            c10.f25031h = c11;
            g(c10);
            this.f24970b.J(c10);
            c11.G(false);
            c11.f25032i = c10;
        }
        if (this.f24956L.b(c10, c11, bVar, bVar2)) {
            L0();
        }
    }

    private boolean m0() {
        int iG = this.f24976e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            C cF0 = f0(this.f24976e.f(i10));
            if (cF0 != null && !cF0.J() && cF0.y()) {
                return true;
            }
        }
        return false;
    }

    private void o0() {
        if (Z.y(this) == 0) {
            Z.x0(this, 8);
        }
    }

    private void p0() {
        this.f24976e = new b(new e());
    }

    private void q() {
        b1();
        setScrollState(0);
    }

    static void r(C c10) {
        WeakReference weakReference = c10.f25025b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c10.f25024a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c10.f25025b = null;
        }
    }

    private boolean u0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f24984i.set(0, 0, view.getWidth(), view.getHeight());
        this.f24986j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f24984i);
        offsetDescendantRectToMyCoords(view2, this.f24986j);
        byte b10 = -1;
        int i12 = this.f24992m.d0() == 1 ? -1 : 1;
        Rect rect = this.f24984i;
        int i13 = rect.left;
        Rect rect2 = this.f24986j;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + P());
    }

    private void u1() {
        this.f24975d0.g();
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.O1();
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strI0 = i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f24939D0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e16);
            }
        }
    }

    private boolean x(int i10, int i11) {
        U(this.f24997o0);
        int[] iArr = this.f24997o0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    void A0(int i10, int i11) {
        int iJ = this.f24976e.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            C cF0 = f0(this.f24976e.i(i12));
            if (cF0 != null && !cF0.J() && cF0.f25026c >= i10) {
                cF0.A(i11, false);
                this.f24981g0.f25125g = true;
            }
        }
        this.f24970b.u(i10, i11);
        requestLayout();
    }

    void B() {
        if (this.f24990l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f24992m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        z zVar = this.f24981g0;
        zVar.f25128j = false;
        if (zVar.f25123e == 1) {
            C();
            this.f24992m.D1(this);
            D();
        } else if (!this.f24974d.q() && this.f24992m.s0() == getWidth() && this.f24992m.b0() == getHeight()) {
            this.f24992m.D1(this);
        } else {
            this.f24992m.D1(this);
            D();
        }
        E();
    }

    void B0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f24976e.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            C cF0 = f0(this.f24976e.i(i16));
            if (cF0 != null && (i15 = cF0.f25026c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    cF0.A(i11 - i10, false);
                } else {
                    cF0.A(i14, false);
                }
                this.f24981g0.f25125g = true;
            }
        }
        this.f24970b.v(i10, i11);
        requestLayout();
    }

    void C0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f24976e.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            C cF0 = f0(this.f24976e.i(i13));
            if (cF0 != null && !cF0.J()) {
                int i14 = cF0.f25026c;
                if (i14 >= i12) {
                    cF0.A(-i11, z10);
                    this.f24981g0.f25125g = true;
                } else if (i14 >= i10) {
                    cF0.i(i10 - 1, -i11, z10);
                    this.f24981g0.f25125g = true;
                }
            }
        }
        this.f24970b.w(i10, i11, z10);
        requestLayout();
    }

    public void D0(View view) {
    }

    public void E0(View view) {
    }

    public boolean F(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    void F0() {
        this.f24949E++;
    }

    public final void G(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void G0() {
        H0(true);
    }

    void H(int i10) {
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.i1(i10);
        }
        J0(i10);
        s sVar = this.f24983h0;
        if (sVar != null) {
            sVar.a(this, i10);
        }
        List list = this.f24985i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f24985i0.get(size)).a(this, i10);
            }
        }
    }

    void H0(boolean z10) {
        int i10 = this.f24949E - 1;
        this.f24949E = i10;
        if (i10 < 1) {
            this.f24949E = 0;
            if (z10) {
                A();
                J();
            }
        }
    }

    void I(int i10, int i11) {
        this.f24950F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        K0(i10, i11);
        s sVar = this.f24983h0;
        if (sVar != null) {
            sVar.b(this, i10, i11);
        }
        List list = this.f24985i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f24985i0.get(size)).b(this, i10, i11);
            }
        }
        this.f24950F--;
    }

    void J() {
        int i10;
        for (int size = this.f25007t0.size() - 1; size >= 0; size--) {
            C c10 = (C) this.f25007t0.get(size);
            if (c10.f25024a.getParent() == this && !c10.J() && (i10 = c10.f25040q) != -1) {
                Z.v0(c10.f25024a, i10);
                c10.f25040q = -1;
            }
        }
        this.f25007t0.clear();
    }

    public void J0(int i10) {
    }

    public void K0(int i10, int i11) {
    }

    void L() {
        if (this.f24955K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24951G.a(this, 3);
        this.f24955K = edgeEffectA;
        if (this.f24980g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void L0() {
        if (this.f24993m0 || !this.f25000q) {
            return;
        }
        Z.e0(this, this.f25009u0);
        this.f24993m0 = true;
    }

    void M() {
        if (this.f24952H != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24951G.a(this, 0);
        this.f24952H = edgeEffectA;
        if (this.f24980g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void N() {
        if (this.f24954J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24951G.a(this, 2);
        this.f24954J = edgeEffectA;
        if (this.f24980g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void O() {
        if (this.f24953I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24951G.a(this, 1);
        this.f24953I = edgeEffectA;
        if (this.f24980g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void O0(boolean z10) {
        this.f24948D = z10 | this.f24948D;
        this.f24947C = true;
        x0();
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.f24990l + ", layout:" + this.f24992m + ", context:" + getContext();
    }

    final void Q(z zVar) {
        if (getScrollState() != 2) {
            zVar.f25134p = 0;
            zVar.f25135q = 0;
        } else {
            OverScroller overScroller = this.f24975d0.f25018c;
            zVar.f25134p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f25135q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void Q0(C c10, l.b bVar) {
        c10.F(0, 8192);
        if (this.f24981g0.f25127i && c10.y() && !c10.v() && !c10.J()) {
            this.f24978f.c(c0(c10), c10);
        }
        this.f24978f.e(c10, bVar);
    }

    public View R(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public C S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return e0(viewR);
    }

    void T0() {
        l lVar = this.f24956L;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.o1(this.f24970b);
            this.f24992m.p1(this.f24970b);
        }
        this.f24970b.c();
    }

    boolean U0(View view) {
        p1();
        boolean zR = this.f24976e.r(view);
        if (zR) {
            C cF0 = f0(view);
            this.f24970b.J(cF0);
            this.f24970b.C(cF0);
        }
        r1(!zR);
        return zR;
    }

    public void V0(n nVar) {
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f24994n.remove(nVar);
        if (this.f24994n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void W0(r rVar) {
        this.f24996o.remove(rVar);
        if (this.f24998p == rVar) {
            this.f24998p = null;
        }
    }

    public C X(int i10) {
        C c10 = null;
        if (this.f24947C) {
            return null;
        }
        int iJ = this.f24976e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            C cF0 = f0(this.f24976e.i(i11));
            if (cF0 != null && !cF0.v() && b0(cF0) == i10) {
                if (!this.f24976e.n(cF0.f25024a)) {
                    return cF0;
                }
                c10 = cF0;
            }
        }
        return c10;
    }

    public void X0(s sVar) {
        List list = this.f24985i0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public C Y(long j10) {
        g gVar = this.f24990l;
        C c10 = null;
        if (gVar != null && gVar.g()) {
            int iJ = this.f24976e.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                C cF0 = f0(this.f24976e.i(i10));
                if (cF0 != null && !cF0.v() && cF0.k() == j10) {
                    if (!this.f24976e.n(cF0.f25024a)) {
                        return cF0;
                    }
                    c10 = cF0;
                }
            }
        }
        return c10;
    }

    void Y0() {
        C c10;
        int iG = this.f24976e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f24976e.f(i10);
            C cE0 = e0(viewF);
            if (cE0 != null && (c10 = cE0.f25032i) != null) {
                View view = c10.f25024a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    C Z(int i10, boolean z10) {
        int iJ = this.f24976e.j();
        C c10 = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            C cF0 = f0(this.f24976e.i(i11));
            if (cF0 != null && !cF0.v()) {
                if (z10) {
                    if (cF0.f25026c != i10) {
                        continue;
                    } else {
                        if (this.f24976e.n(cF0.f25024a)) {
                            return cF0;
                        }
                        c10 = cF0;
                    }
                } else if (cF0.m() != i10) {
                    continue;
                } else {
                    if (this.f24976e.n(cF0.f25024a)) {
                        return cF0;
                    }
                    c10 = cF0;
                }
            }
        }
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i10, int i11) {
        o oVar = this.f24992m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f25012w) {
            return false;
        }
        int iP = oVar.p();
        boolean zQ = this.f24992m.q();
        if (iP == 0 || Math.abs(i10) < this.f24966V) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < this.f24966V) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iP != 0 || zQ;
            dispatchNestedFling(f10, f11, z10);
            q qVar = this.f24965U;
            if (qVar != null && qVar.a(i10, i11)) {
                return true;
            }
            if (z10) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                q1(iP, 1);
                int i12 = this.f24967W;
                int iMax = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f24967W;
                this.f24975d0.c(iMax, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        o oVar = this.f24992m;
        if (oVar == null || !oVar.J0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void b(int i10, int i11) {
        if (i10 < 0) {
            M();
            if (this.f24952H.isFinished()) {
                this.f24952H.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            N();
            if (this.f24954J.isFinished()) {
                this.f24954J.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            O();
            if (this.f24953I.isFinished()) {
                this.f24953I.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            L();
            if (this.f24955K.isFinished()) {
                this.f24955K.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        Z.d0(this);
    }

    int b0(C c10) {
        if (c10.p(524) || !c10.s()) {
            return -1;
        }
        return this.f24974d.e(c10.f25026c);
    }

    long c0(C c10) {
        return this.f24990l.g() ? c10.k() : c10.f25026c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f24992m.r((p) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        o oVar = this.f24992m;
        if (oVar != null && oVar.p()) {
            return this.f24992m.v(this.f24981g0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        o oVar = this.f24992m;
        if (oVar != null && oVar.p()) {
            return this.f24992m.w(this.f24981g0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        o oVar = this.f24992m;
        if (oVar != null && oVar.p()) {
            return this.f24992m.x(this.f24981g0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        o oVar = this.f24992m;
        if (oVar != null && oVar.q()) {
            return this.f24992m.y(this.f24981g0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        o oVar = this.f24992m;
        if (oVar != null && oVar.q()) {
            return this.f24992m.z(this.f24981g0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        o oVar = this.f24992m;
        if (oVar != null && oVar.q()) {
            return this.f24992m.A(this.f24981g0);
        }
        return 0;
    }

    public int d0(View view) {
        C cF0 = f0(view);
        if (cF0 != null) {
            return cF0.m();
        }
        return -1;
    }

    void d1() {
        int iJ = this.f24976e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f24976e.i(i10));
            if (!cF0.J()) {
                cF0.E();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f24994n.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((n) this.f24994n.get(i10)).i(canvas, this, this.f24981g0);
        }
        EdgeEffect edgeEffect = this.f24952H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f24980g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f24952H;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f24953I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f24980g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f24953I;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f24954J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f24980g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f24954J;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f24955K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f24980g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f24955K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f24956L == null || this.f24994n.size() <= 0 || !this.f24956L.p()) ? z10 : true) {
            Z.d0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public C e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    boolean e1(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        u();
        if (this.f24990l != null) {
            int[] iArr = this.f25005s0;
            iArr[0] = 0;
            iArr[1] = 0;
            f1(i10, i11, iArr);
            int[] iArr2 = this.f25005s0;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i14 = i10 - i16;
            i15 = i11 - i17;
            i13 = i17;
            i12 = i16;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.f24994n.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f25005s0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i12, i13, i14, i15, this.f25001q0, 0, iArr3);
        int[] iArr4 = this.f25005s0;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z10 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.f24962R;
        int[] iArr5 = this.f25001q0;
        int i23 = iArr5[0];
        this.f24962R = i22 - i23;
        int i24 = this.f24963S;
        int i25 = iArr5[1];
        this.f24963S = i24 - i25;
        int[] iArr6 = this.f25003r0;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.B.a(motionEvent, 8194)) {
                P0(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            t(i10, i11);
        }
        if (i12 != 0 || i13 != 0) {
            I(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i12 == 0 && i13 == 0) ? false : true;
    }

    void f1(int i10, int i11, int[] iArr) {
        p1();
        F0();
        p128h1.n.a("RV Scroll");
        Q(this.f24981g0);
        int iA1 = i10 != 0 ? this.f24992m.A1(i10, this.f24970b, this.f24981g0) : 0;
        int iC1 = i11 != 0 ? this.f24992m.C1(i11, this.f24970b, this.f24981g0) : 0;
        p128h1.n.b();
        Y0();
        G0();
        r1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewN0;
        boolean z10;
        View viewU0 = this.f24992m.U0(view, i10);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z11 = (this.f24990l == null || this.f24992m == null || t0() || this.f25012w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f24992m.q()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f24937B0) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f24992m.p()) {
                int i12 = (this.f24992m.d0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f24937B0) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                this.f24992m.N0(view, i10, this.f24970b, this.f24981g0);
                r1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                viewN0 = this.f24992m.N0(view, i10, this.f24970b, this.f24981g0);
                r1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return u0(view, viewN0, i10) ? viewN0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        Z0(viewN0, null);
        return view;
    }

    public void g1(int i10) {
        if (this.f25012w) {
            return;
        }
        t1();
        o oVar = this.f24992m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.B1(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f24992m;
        if (oVar != null) {
            return oVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f24992m;
        if (oVar != null) {
            return oVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f24992m;
        if (oVar != null) {
            return oVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f24990l;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f24992m;
        return oVar != null ? oVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f24980g;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f24995n0;
    }

    @NonNull
    public k getEdgeEffectFactory() {
        return this.f24951G;
    }

    public l getItemAnimator() {
        return this.f24956L;
    }

    public int getItemDecorationCount() {
        return this.f24994n.size();
    }

    public o getLayoutManager() {
        return this.f24992m;
    }

    public int getMaxFlingVelocity() {
        return this.f24967W;
    }

    public int getMinFlingVelocity() {
        return this.f24966V;
    }

    long getNanoTime() {
        if (f24936A0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.f24965U;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f24973c0;
    }

    @NonNull
    public t getRecycledViewPool() {
        return this.f24970b.i();
    }

    public int getScrollState() {
        return this.f24957M;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i10) {
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f24994n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f24994n.add(nVar);
        } else {
            this.f24994n.add(i10, nVar);
        }
        w0();
        requestLayout();
    }

    boolean i1(C c10, int i10) {
        if (!t0()) {
            Z.v0(c10.f25024a, i10);
            return true;
        }
        c10.f25040q = i10;
        this.f25007t0.add(c10);
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f25000q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f25012w;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        this.f24996o.add(rVar);
    }

    Rect j0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f25086c) {
            return pVar.f25085b;
        }
        if (this.f24981g0.e() && (pVar.b() || pVar.d())) {
            return pVar.f25085b;
        }
        Rect rect = pVar.f25085b;
        rect.set(0, 0, 0, 0);
        int size = this.f24994n.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24984i.set(0, 0, 0, 0);
            ((n) this.f24994n.get(i10)).e(this.f24984i, view, this, this.f24981g0);
            int i11 = rect.left;
            Rect rect2 = this.f24984i;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f25086c = false;
        return rect;
    }

    boolean j1(AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC4000b.a(accessibilityEvent) : 0;
        this.f25014y |= iA != 0 ? iA : 0;
        return true;
    }

    public void k(s sVar) {
        if (this.f24985i0 == null) {
            this.f24985i0 = new ArrayList();
        }
        this.f24985i0.add(sVar);
    }

    public void k1(int i10, int i11) {
        l1(i10, i11, null);
    }

    void l(C c10, l.b bVar, l.b bVar2) {
        c10.G(false);
        if (this.f24956L.a(c10, bVar, bVar2)) {
            L0();
        }
    }

    public boolean l0() {
        return !this.f25006t || this.f24947C || this.f24974d.p();
    }

    public void l1(int i10, int i11, Interpolator interpolator) {
        m1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void m1(int i10, int i11, Interpolator interpolator, int i12) {
        n1(i10, i11, interpolator, i12, false);
    }

    void n(C c10, l.b bVar, l.b bVar2) {
        g(c10);
        c10.G(false);
        if (this.f24956L.c(c10, bVar, bVar2)) {
            L0();
        }
    }

    void n0() {
        this.f24974d = new a(new f());
    }

    void n1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.f24992m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f25012w) {
            return;
        }
        if (!oVar.p()) {
            i10 = 0;
        }
        if (!this.f24992m.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            q1(i13, 1);
        }
        this.f24975d0.f(i10, i11, i12, interpolator);
    }

    void o(String str) {
        if (t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.f24950F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void o1(int i10) {
        if (this.f25012w) {
            return;
        }
        o oVar = this.f24992m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.M1(this, this.f24981g0, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f24949E = 0;
        this.f25000q = true;
        this.f25006t = this.f25006t && !isLayoutRequested();
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.E(this);
        }
        this.f24993m0 = false;
        if (f24936A0) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.e.f25296e;
            androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) threadLocal.get();
            this.f24977e0 = eVar;
            if (eVar == null) {
                this.f24977e0 = new androidx.recyclerview.widget.e();
                Display displayT = Z.t(this);
                if (isInEditMode() || displayT == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayT.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.f24977e0;
                eVar2.f25300c = (long) (1.0E9f / refreshRate);
                threadLocal.set(eVar2);
            }
            this.f24977e0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f24956L;
        if (lVar != null) {
            lVar.k();
        }
        t1();
        this.f25000q = false;
        o oVar = this.f24992m;
        if (oVar != null) {
            oVar.F(this, this.f24970b);
        }
        this.f25007t0.clear();
        removeCallbacks(this.f25009u0);
        this.f24978f.j();
        if (!f24936A0 || (eVar = this.f24977e0) == null) {
            return;
        }
        eVar.j(this);
        this.f24977e0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f24994n.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n) this.f24994n.get(i10)).g(canvas, this, this.f24981g0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f24992m != null && !this.f25012w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f24992m.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f24992m.p() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f24992m.q()) {
                    f10 = -axisValue2;
                } else if (this.f24992m.p()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                e1((int) (axisValue * this.f24969a0), (int) (f10 * this.f24971b0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f25012w) {
            return false;
        }
        this.f24998p = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f24992m;
        if (oVar == null) {
            return false;
        }
        boolean zP = oVar.p();
        boolean zQ = this.f24992m.q();
        if (this.f24959O == null) {
            this.f24959O = VelocityTracker.obtain();
        }
        this.f24959O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f25013x) {
                this.f25013x = false;
            }
            this.f24958N = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f24962R = x10;
            this.f24960P = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f24963S = y10;
            this.f24961Q = y10;
            if (this.f24957M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                s1(1);
            }
            int[] iArr = this.f25003r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zP;
            if (zQ) {
                i10 = (zP ? 1 : 0) | 2;
            }
            q1(i10, 0);
        } else if (actionMasked == 1) {
            this.f24959O.clear();
            s1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f24958N);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f24958N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f24957M != 1) {
                int i11 = x11 - this.f24960P;
                int i12 = y11 - this.f24961Q;
                if (!zP || Math.abs(i11) <= this.f24964T) {
                    z10 = false;
                } else {
                    this.f24962R = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i12) > this.f24964T) {
                    this.f24963S = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f24958N = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f24962R = x12;
            this.f24960P = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f24963S = y12;
            this.f24961Q = y12;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        return this.f24957M == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p128h1.n.a("RV OnLayout");
        B();
        p128h1.n.b();
        this.f25006t = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        o oVar = this.f24992m;
        if (oVar == null) {
            w(i10, i11);
            return;
        }
        if (oVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f24992m.d1(this.f24970b, this.f24981g0, i10, i11);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f24990l == null) {
                return;
            }
            if (this.f24981g0.f25123e == 1) {
                C();
            }
            this.f24992m.E1(i10, i11);
            this.f24981g0.f25128j = true;
            D();
            this.f24992m.H1(i10, i11);
            if (this.f24992m.K1()) {
                this.f24992m.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f24981g0.f25128j = true;
                D();
                this.f24992m.H1(i10, i11);
                return;
            }
            return;
        }
        if (this.f25002r) {
            this.f24992m.d1(this.f24970b, this.f24981g0, i10, i11);
            return;
        }
        if (this.f25015z) {
            p1();
            F0();
            N0();
            G0();
            z zVar = this.f24981g0;
            if (zVar.f25130l) {
                zVar.f25126h = true;
            } else {
                this.f24974d.j();
                this.f24981g0.f25126h = false;
            }
            this.f25015z = false;
            r1(false);
        } else if (this.f24981g0.f25130l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f24990l;
        if (gVar != null) {
            this.f24981g0.f25124f = gVar.c();
        } else {
            this.f24981g0.f25124f = 0;
        }
        p1();
        this.f24992m.d1(this.f24970b, this.f24981g0, i10, i11);
        r1(false);
        this.f24981g0.f25126h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f24972c = xVar;
        super.onRestoreInstanceState(xVar.f());
        o oVar = this.f24992m;
        if (oVar == null || (parcelable2 = this.f24972c.f25103c) == null) {
            return;
        }
        oVar.g1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f24972c;
        if (xVar2 != null) {
            xVar.j(xVar2);
            return xVar;
        }
        o oVar = this.f24992m;
        if (oVar != null) {
            xVar.f25103c = oVar.h1();
            return xVar;
        }
        xVar.f25103c = null;
        return xVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        r0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v45 int) = (r1v26 int), (r1v49 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        if (this.f25012w || this.f25013x) {
            return false;
        }
        if (K(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f24992m;
        if (oVar == null) {
            return false;
        }
        boolean zP = oVar.p();
        boolean zQ = this.f24992m.q();
        if (this.f24959O == null) {
            this.f24959O = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f25003r0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f25003r0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f24959O.addMovement(motionEventObtain);
                this.f24959O.computeCurrentVelocity(1000, this.f24967W);
                float f10 = zP ? -this.f24959O.getXVelocity(this.f24958N) : 0.0f;
                float f11 = zQ ? -this.f24959O.getYVelocity(this.f24958N) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !a0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                b1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f24958N);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f24958N + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f24962R - x10;
                int iMax2 = this.f24963S - y10;
                if (this.f24957M != 1) {
                    if (zP) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f24964T) : Math.min(0, iMax + this.f24964T);
                        if (iMax != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (zQ) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f24964T) : Math.min(0, iMax2 + this.f24964T);
                        if (iMax2 != 0) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        setScrollState(1);
                    }
                }
                int i11 = iMax;
                int i12 = iMax2;
                if (this.f24957M == 1) {
                    int[] iArr3 = this.f25005s0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (F(zP ? i11 : 0, zQ ? i12 : 0, iArr3, this.f25001q0, 0)) {
                        int[] iArr4 = this.f25005s0;
                        i11 -= iArr4[0];
                        i12 -= iArr4[1];
                        int[] iArr5 = this.f25003r0;
                        int i13 = iArr5[0];
                        int[] iArr6 = this.f25001q0;
                        iArr5[0] = i13 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f25001q0;
                    this.f24962R = x10 - iArr7[0];
                    this.f24963S = y10 - iArr7[1];
                    if (e1(zP ? i11 : 0, zQ ? i12 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.e eVar = this.f24977e0;
                    if (eVar != null && (i11 != 0 || i12 != 0)) {
                        eVar.f(this, i11, i12);
                    }
                }
            } else if (actionMasked == 3) {
                q();
            } else if (actionMasked == 5) {
                this.f24958N = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f24962R = x11;
                this.f24960P = x11;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f24963S = y11;
                this.f24961Q = y11;
            } else if (actionMasked == 6) {
                I0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f24958N = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.f24962R = x12;
        this.f24960P = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.f24963S = y12;
        this.f24961Q = y12;
        if (zQ) {
            i10 = zP;
            i10 = (zP ? 1 : 0) | 2;
        }
        i10 = zP;
        q1(i10, 0);
        this.f24959O.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    boolean p(C c10) {
        l lVar = this.f24956L;
        return lVar == null || lVar.g(c10, c10.o());
    }

    void p1() {
        int i10 = this.f25008u + 1;
        this.f25008u = i10;
        if (i10 != 1 || this.f25012w) {
            return;
        }
        this.f25010v = false;
    }

    void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(p165j3.b.f46793a), resources.getDimensionPixelSize(p165j3.b.f46795c), resources.getDimensionPixelOffset(p165j3.b.f46794b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public boolean q1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void r0() {
        this.f24955K = null;
        this.f24953I = null;
        this.f24954J = null;
        this.f24952H = null;
    }

    void r1(boolean z10) {
        if (this.f25008u < 1) {
            this.f25008u = 1;
        }
        if (!z10 && !this.f25012w) {
            this.f25010v = false;
        }
        if (this.f25008u == 1) {
            if (z10 && this.f25010v && !this.f25012w && this.f24992m != null && this.f24990l != null) {
                B();
            }
            if (!this.f25012w) {
                this.f25010v = false;
            }
        }
        this.f25008u--;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        C cF0 = f0(view);
        if (cF0 != null) {
            if (cF0.x()) {
                cF0.f();
            } else if (!cF0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + cF0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f24992m.f1(this, this.f24981g0, view, view2) && view2 != null) {
            Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f24992m.v1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f24996o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f24996o.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f25008u != 0 || this.f25012w) {
            this.f25010v = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.f24976e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f24976e.i(i10));
            if (!cF0.J()) {
                cF0.c();
            }
        }
        this.f24970b.d();
    }

    boolean s0() {
        AccessibilityManager accessibilityManager = this.f24945A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void s1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        o oVar = this.f24992m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f25012w) {
            return;
        }
        boolean zP = oVar.p();
        boolean zQ = this.f24992m.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            e1(i10, i11, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (j1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f24995n0 = lVar;
        Z.m0(this, lVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        h1(gVar, false, true);
        O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f24980g) {
            r0();
        }
        this.f24980g = z10;
        super.setClipToPadding(z10);
        if (this.f25006t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull k kVar) {
        p199l1.g.g(kVar);
        this.f24951G = kVar;
        r0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f25002r = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f24956L;
        if (lVar2 != null) {
            lVar2.k();
            this.f24956L.v(null);
        }
        this.f24956L = lVar;
        if (lVar != null) {
            lVar.v(this.f24991l0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f24970b.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f24992m) {
            return;
        }
        t1();
        if (this.f24992m != null) {
            l lVar = this.f24956L;
            if (lVar != null) {
                lVar.k();
            }
            this.f24992m.o1(this.f24970b);
            this.f24992m.p1(this.f24970b);
            this.f24970b.c();
            if (this.f25000q) {
                this.f24992m.F(this, this.f24970b);
            }
            this.f24992m.I1(null);
            this.f24992m = null;
        } else {
            this.f24970b.c();
        }
        this.f24976e.o();
        this.f24992m = oVar;
        if (oVar != null) {
            if (oVar.f25061b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f25061b.P());
            }
            oVar.I1(this);
            if (this.f25000q) {
                this.f24992m.E(this);
            }
        }
        this.f24970b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(q qVar) {
        this.f24965U = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f24983h0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f24973c0 = z10;
    }

    public void setRecycledViewPool(t tVar) {
        this.f24970b.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    void setScrollState(int i10) {
        if (i10 == this.f24957M) {
            return;
        }
        this.f24957M = i10;
        if (i10 != 2) {
            u1();
        }
        H(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f24964T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f24964T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(A a10) {
        this.f24970b.F(a10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f25012w) {
            o("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f25012w = true;
                this.f25013x = true;
                t1();
                return;
            }
            this.f25012w = false;
            if (this.f25010v && this.f24992m != null && this.f24990l != null) {
                requestLayout();
            }
            this.f25010v = false;
        }
    }

    void t(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f24952H;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f24952H.onRelease();
            zIsFinished = this.f24952H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f24954J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f24954J.onRelease();
            zIsFinished |= this.f24954J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f24953I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f24953I.onRelease();
            zIsFinished |= this.f24953I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f24955K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f24955K.onRelease();
            zIsFinished |= this.f24955K.isFinished();
        }
        if (zIsFinished) {
            Z.d0(this);
        }
    }

    public boolean t0() {
        return this.f24949E > 0;
    }

    public void t1() {
        setScrollState(0);
        u1();
    }

    void u() {
        if (!this.f25006t || this.f24947C) {
            p128h1.n.a("RV FullInvalidate");
            B();
            p128h1.n.b();
            return;
        }
        if (this.f24974d.p()) {
            if (!this.f24974d.o(4) || this.f24974d.o(11)) {
                if (this.f24974d.p()) {
                    p128h1.n.a("RV FullInvalidate");
                    B();
                    p128h1.n.b();
                    return;
                }
                return;
            }
            p128h1.n.a("RV PartialInvalidate");
            p1();
            F0();
            this.f24974d.s();
            if (!this.f25010v) {
                if (m0()) {
                    B();
                } else {
                    this.f24974d.i();
                }
            }
            r1(true);
            G0();
            p128h1.n.b();
        }
    }

    void v0(int i10) {
        if (this.f24992m == null) {
            return;
        }
        setScrollState(2);
        this.f24992m.B1(i10);
        awakenScrollBars();
    }

    void v1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f24976e.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f24976e.i(i14);
            C cF0 = f0(viewI);
            if (cF0 != null && !cF0.J() && (i12 = cF0.f25026c) >= i10 && i12 < i13) {
                cF0.b(2);
                cF0.a(obj);
                ((p) viewI.getLayoutParams()).f25086c = true;
            }
        }
        this.f24970b.M(i10, i11);
    }

    void w(int i10, int i11) {
        setMeasuredDimension(o.s(i10, getPaddingLeft() + getPaddingRight(), Z.B(this)), o.s(i11, getPaddingTop() + getPaddingBottom(), Z.A(this)));
    }

    void w0() {
        int iJ = this.f24976e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((p) this.f24976e.i(i10).getLayoutParams()).f25086c = true;
        }
        this.f24970b.s();
    }

    void x0() {
        int iJ = this.f24976e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f24976e.i(i10));
            if (cF0 != null && !cF0.J()) {
                cF0.b(6);
            }
        }
        w0();
        this.f24970b.t();
    }

    void y(View view) {
        int size;
        C cF0 = f0(view);
        D0(view);
        g gVar = this.f24990l;
        if (gVar != null && cF0 != null) {
            gVar.n(cF0);
        }
        List list = this.f24946B;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f24946B.get(size));
        throw null;
    }

    public void y0(int i10) {
        int iG = this.f24976e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f24976e.f(i11).offsetLeftAndRight(i10);
        }
    }

    void z(View view) {
        int size;
        C cF0 = f0(view);
        E0(view);
        g gVar = this.f24990l;
        if (gVar != null && cF0 != null) {
            gVar.o(cF0);
        }
        List list = this.f24946B;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f24946B.get(size));
        throw null;
    }

    public void z0(int i10) {
        int iG = this.f24976e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f24976e.f(i11).offsetTopAndBottom(i10);
        }
    }
}
