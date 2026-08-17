package Ia;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1098d {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a f5260r0 = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f5261O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f5262P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final float f5263Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f5264R;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f5278f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f5279g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f5280h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f5281i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f5282j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f5283k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private VelocityTracker f5284l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f5285m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f5286n0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Handler f5288p0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f5265S = Float.MAX_VALUE;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f5266T = Float.MIN_VALUE;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f5267U = Float.MIN_VALUE;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f5268V = Float.MAX_VALUE;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f5269W = Float.MAX_VALUE;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f5270X = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f5271Y = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f5272Z = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f5273a0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f5274b0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f5275c0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f5276d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f5277e0 = 10;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Runnable f5287o0 = new s(this);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private z f5289q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            Intrinsics.c(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public static final class b extends AbstractC1098d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f5290d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5291b = t.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5292c = "PanGestureHandler";

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5292c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5291b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public t a(Context context) {
            return new t(context);
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.g c(t handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.g(handler);
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(t handler, ReadableMap config) {
            boolean z10;
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            boolean z11 = true;
            if (config.hasKey("activeOffsetXStart")) {
                handler.f5265S = H.h(config.getDouble("activeOffsetXStart"));
                z10 = true;
            } else {
                z10 = false;
            }
            if (config.hasKey("activeOffsetXEnd")) {
                handler.f5266T = H.h(config.getDouble("activeOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXStart")) {
                handler.f5267U = H.h(config.getDouble("failOffsetXStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXEnd")) {
                handler.f5268V = H.h(config.getDouble("failOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYStart")) {
                handler.f5269W = H.h(config.getDouble("activeOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYEnd")) {
                handler.f5270X = H.h(config.getDouble("activeOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYStart")) {
                handler.f5271Y = H.h(config.getDouble("failOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYEnd")) {
                handler.f5272Z = H.h(config.getDouble("failOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("minVelocity")) {
                handler.f5275c0 = H.h(config.getDouble("minVelocity"));
                z10 = true;
            }
            if (config.hasKey("minVelocityX")) {
                handler.f5273a0 = H.h(config.getDouble("minVelocityX"));
                z10 = true;
            }
            if (config.hasKey("minVelocityY")) {
                handler.f5274b0 = H.h(config.getDouble("minVelocityY"));
            } else {
                z11 = z10;
            }
            if (config.hasKey("minDist")) {
                handler.f5264R = H.h(config.getDouble("minDist"));
            } else if (z11) {
                handler.f5264R = Float.MAX_VALUE;
            }
            if (config.hasKey("minPointers")) {
                handler.f5276d0 = config.getInt("minPointers");
            }
            if (config.hasKey("maxPointers")) {
                handler.f5277e0 = config.getInt("maxPointers");
            }
            if (config.hasKey("avgTouches")) {
                handler.f5285m0 = config.getBoolean("avgTouches");
            }
            if (config.hasKey("activateAfterLongPress")) {
                handler.f5286n0 = config.getInt("activateAfterLongPress");
            }
        }
    }

    public t(Context context) {
        this.f5264R = Float.MIN_VALUE;
        Intrinsics.c(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5263Q = scaledTouchSlop;
        this.f5264R = scaledTouchSlop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(t tVar) {
        tVar.k();
    }

    private final boolean r1() {
        float f10 = (this.f5282j0 - this.f5278f0) + this.f5280h0;
        float f11 = this.f5265S;
        if (f11 != Float.MAX_VALUE && f10 < f11) {
            return true;
        }
        float f12 = this.f5266T;
        if (f12 != Float.MIN_VALUE && f10 > f12) {
            return true;
        }
        float f13 = (this.f5283k0 - this.f5279g0) + this.f5281i0;
        float f14 = this.f5269W;
        if (f14 != Float.MAX_VALUE && f13 < f14) {
            return true;
        }
        float f15 = this.f5270X;
        if (f15 != Float.MIN_VALUE && f13 > f15) {
            return true;
        }
        float f16 = (f10 * f10) + (f13 * f13);
        float f17 = this.f5264R;
        if (f17 != Float.MAX_VALUE && f16 >= f17 * f17) {
            return true;
        }
        float f18 = this.f5261O;
        float f19 = this.f5273a0;
        if (f19 != Float.MAX_VALUE && ((f19 < 0.0f && f18 <= f19) || (0.0f <= f19 && f19 <= f18))) {
            return true;
        }
        float f20 = this.f5262P;
        float f21 = this.f5274b0;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f18 <= f21) || (0.0f <= f21 && f21 <= f18))) {
            return true;
        }
        float f22 = (f18 * f18) + (f20 * f20);
        float f23 = this.f5275c0;
        return f23 != Float.MAX_VALUE && f22 >= f23 * f23;
    }

    private final boolean s1() {
        float f10 = (this.f5282j0 - this.f5278f0) + this.f5280h0;
        float f11 = (this.f5283k0 - this.f5279g0) + this.f5281i0;
        if (this.f5286n0 > 0) {
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f5263Q;
            if (f12 > f13 * f13) {
                Handler handler = this.f5288p0;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                return true;
            }
        }
        float f14 = this.f5267U;
        if (f14 != Float.MIN_VALUE && f10 < f14) {
            return true;
        }
        float f15 = this.f5268V;
        if (f15 != Float.MAX_VALUE && f10 > f15) {
            return true;
        }
        float f16 = this.f5271Y;
        if (f16 != Float.MIN_VALUE && f11 < f16) {
            return true;
        }
        float f17 = this.f5272Z;
        return f17 != Float.MAX_VALUE && f11 > f17;
    }

    @Override // Ia.AbstractC1098d
    protected void j0() {
        Handler handler = this.f5288p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ia.AbstractC1098d
    public void l(boolean z10) {
        if (S() != 4) {
            t0();
        }
        super.l(z10);
    }

    @Override // Ia.AbstractC1098d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.f5289q0 = z.f5355f.a(event);
            }
            int iS = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f5280h0 += this.f5282j0 - this.f5278f0;
                this.f5281i0 += this.f5283k0 - this.f5279g0;
                k kVar = k.f5218a;
                this.f5282j0 = kVar.b(sourceEvent, this.f5285m0);
                float fC = kVar.c(sourceEvent, this.f5285m0);
                this.f5283k0 = fC;
                this.f5278f0 = this.f5282j0;
                this.f5279g0 = fC;
            } else {
                k kVar2 = k.f5218a;
                this.f5282j0 = kVar2.b(sourceEvent, this.f5285m0);
                this.f5283k0 = kVar2.c(sourceEvent, this.f5285m0);
            }
            if (iS != 0 || sourceEvent.getPointerCount() < this.f5276d0) {
                VelocityTracker velocityTracker = this.f5284l0;
                if (velocityTracker != null) {
                    f5260r0.b(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.f5284l0;
                    Intrinsics.c(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f5284l0;
                    Intrinsics.c(velocityTracker3);
                    this.f5261O = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f5284l0;
                    Intrinsics.c(velocityTracker4);
                    this.f5262P = velocityTracker4.getYVelocity();
                }
            } else {
                t0();
                this.f5280h0 = 0.0f;
                this.f5281i0 = 0.0f;
                this.f5261O = 0.0f;
                this.f5262P = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f5284l0 = velocityTrackerObtain;
                f5260r0.b(velocityTrackerObtain, sourceEvent);
                p();
                if (this.f5286n0 > 0) {
                    if (this.f5288p0 == null) {
                        this.f5288p0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f5288p0;
                    Intrinsics.c(handler);
                    handler.postDelayed(this.f5287o0, this.f5286n0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (iS == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.f5277e0) {
                if (iS == 4) {
                    q();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 6 && iS == 4 && sourceEvent.getPointerCount() < this.f5276d0) {
                D();
                return;
            }
            if (iS == 2) {
                if (s1()) {
                    D();
                } else if (r1()) {
                    k();
                }
            }
        }
    }

    public final z m1() {
        return this.f5289q0;
    }

    public final float n1() {
        return (this.f5282j0 - this.f5278f0) + this.f5280h0;
    }

    @Override // Ia.AbstractC1098d
    protected void o0() {
        Handler handler = this.f5288p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f5284l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5284l0 = null;
        }
        this.f5289q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final float o1() {
        return (this.f5283k0 - this.f5279g0) + this.f5281i0;
    }

    public final float p1() {
        return this.f5261O;
    }

    public final float q1() {
        return this.f5262P;
    }

    @Override // Ia.AbstractC1098d
    public void s0() {
        super.s0();
        this.f5265S = Float.MAX_VALUE;
        this.f5266T = Float.MIN_VALUE;
        this.f5267U = Float.MIN_VALUE;
        this.f5268V = Float.MAX_VALUE;
        this.f5269W = Float.MAX_VALUE;
        this.f5270X = Float.MIN_VALUE;
        this.f5271Y = Float.MIN_VALUE;
        this.f5272Z = Float.MAX_VALUE;
        this.f5273a0 = Float.MAX_VALUE;
        this.f5274b0 = Float.MAX_VALUE;
        this.f5275c0 = Float.MAX_VALUE;
        this.f5264R = this.f5263Q;
        this.f5276d0 = 1;
        this.f5277e0 = 10;
        this.f5286n0 = 0L;
        this.f5285m0 = false;
    }

    @Override // Ia.AbstractC1098d
    public void t0() {
        this.f5278f0 = this.f5282j0;
        this.f5279g0 = this.f5283k0;
    }
}
