package Ia;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC1098d {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final a f5099f0 = new a(null);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f5108W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f5109X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f5110Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f5111Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f5112a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f5113b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Handler f5114c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f5115d0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f5100O = Float.MIN_VALUE;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f5101P = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f5102Q = Float.MIN_VALUE;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f5103R = 500;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f5104S = 200;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f5105T = 1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f5106U = 1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f5107V = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f5116e0 = new A(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractC1098d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f5117d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5118b = B.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5119c = "TapGestureHandler";

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5119c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5118b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public B a(Context context) {
            return new B();
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.j c(B handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.j(handler);
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(B handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfTaps")) {
                handler.f5105T = config.getInt("numberOfTaps");
            }
            if (config.hasKey("maxDurationMs")) {
                handler.f5103R = config.getInt("maxDurationMs");
            }
            if (config.hasKey("maxDelayMs")) {
                handler.f5104S = config.getInt("maxDelayMs");
            }
            if (config.hasKey("maxDeltaX")) {
                handler.f5100O = H.h(config.getDouble("maxDeltaX"));
            }
            if (config.hasKey("maxDeltaY")) {
                handler.f5101P = H.h(config.getDouble("maxDeltaY"));
            }
            if (config.hasKey("maxDist")) {
                handler.f5102Q = H.h(config.getDouble("maxDist"));
            }
            if (config.hasKey("minPointers")) {
                handler.f5106U = config.getInt("minPointers");
            }
        }
    }

    public B() {
        G0(true);
    }

    private final void c1() {
        Handler handler = this.f5114c0;
        if (handler == null) {
            this.f5114c0 = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i10 = this.f5115d0 + 1;
        this.f5115d0 = i10;
        if (i10 == this.f5105T && this.f5107V >= this.f5106U) {
            k();
            return;
        }
        Handler handler2 = this.f5114c0;
        Intrinsics.c(handler2);
        handler2.postDelayed(this.f5116e0, this.f5104S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(B b10) {
        b10.D();
    }

    private final boolean e1() {
        float f10 = (this.f5112a0 - this.f5108W) + this.f5110Y;
        if (this.f5100O != Float.MIN_VALUE && Math.abs(f10) > this.f5100O) {
            return true;
        }
        float f11 = (this.f5113b0 - this.f5109X) + this.f5111Z;
        if (this.f5101P != Float.MIN_VALUE && Math.abs(f11) > this.f5101P) {
            return true;
        }
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.f5102Q;
        return f13 != Float.MIN_VALUE && f12 > f13 * f13;
    }

    private final void f1() {
        Handler handler = this.f5114c0;
        if (handler == null) {
            this.f5114c0 = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f5114c0;
        Intrinsics.c(handler2);
        handler2.postDelayed(this.f5116e0, this.f5103R);
    }

    @Override // Ia.AbstractC1098d
    protected void j0() {
        Handler handler = this.f5114c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ia.AbstractC1098d
    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    @Override // Ia.AbstractC1098d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int iS = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (iS == 0) {
                this.f5110Y = 0.0f;
                this.f5111Z = 0.0f;
                k kVar = k.f5218a;
                this.f5108W = kVar.b(sourceEvent, true);
                this.f5109X = kVar.c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f5110Y += this.f5112a0 - this.f5108W;
                this.f5111Z += this.f5113b0 - this.f5109X;
                k kVar2 = k.f5218a;
                this.f5112a0 = kVar2.b(sourceEvent, true);
                float fC = kVar2.c(sourceEvent, true);
                this.f5113b0 = fC;
                this.f5108W = this.f5112a0;
                this.f5109X = fC;
            } else {
                k kVar3 = k.f5218a;
                this.f5112a0 = kVar3.b(sourceEvent, true);
                this.f5113b0 = kVar3.c(sourceEvent, true);
            }
            if (this.f5107V < sourceEvent.getPointerCount()) {
                this.f5107V = sourceEvent.getPointerCount();
            }
            if (e1()) {
                D();
                return;
            }
            if (iS == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    p();
                }
                f1();
                return;
            }
            if (iS == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    c1();
                    return;
                }
                f1();
            }
        }
    }

    @Override // Ia.AbstractC1098d
    protected void o0() {
        this.f5115d0 = 0;
        this.f5107V = 0;
        Handler handler = this.f5114c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ia.AbstractC1098d
    public void s0() {
        super.s0();
        this.f5100O = Float.MIN_VALUE;
        this.f5101P = Float.MIN_VALUE;
        this.f5102Q = Float.MIN_VALUE;
        this.f5103R = 500L;
        this.f5104S = 200L;
        this.f5105T = 1;
        this.f5106U = 1;
        G0(true);
    }
}
