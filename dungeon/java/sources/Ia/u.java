package Ia;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC1098d {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private double f5293O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private double f5294P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private y f5297S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f5298T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f5299U;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f5295Q = Float.NaN;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f5296R = Float.NaN;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final y.b f5300V = new b();

    public static final class a extends AbstractC1098d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5301b = u.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5302c = "PinchGestureHandler";

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5302c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5301b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public u a(Context context) {
            return new u();
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.h c(u handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.h(handler);
        }
    }

    public static final class b implements y.b {
        b() {
        }

        @Override // Ia.y.b
        public boolean a(y detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            u.this.f5298T = detector.d();
            return true;
        }

        @Override // Ia.y.b
        public void b(y detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
        }

        @Override // Ia.y.b
        public boolean c(y detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double dB1 = u.this.b1();
            u uVar = u.this;
            uVar.f5293O = uVar.b1() * ((double) detector.g());
            double dI = detector.i();
            if (dI > 0.0d) {
                u uVar2 = u.this;
                uVar2.f5294P = (uVar2.b1() - dB1) / dI;
            }
            if (Math.abs(u.this.f5298T - detector.d()) < u.this.f5299U || u.this.S() != 2) {
                return true;
            }
            u.this.k();
            return true;
        }
    }

    public final float Z0() {
        return this.f5295Q;
    }

    public final float a1() {
        return this.f5296R;
    }

    public final double b1() {
        return this.f5293O;
    }

    public final double c1() {
        return this.f5294P;
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
        if (S() == 0) {
            View viewW = W();
            Intrinsics.c(viewW);
            Context context = viewW.getContext();
            t0();
            this.f5297S = new y(context, this.f5300V);
            this.f5299U = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f5295Q = event.getX();
            this.f5296R = event.getY();
            p();
        }
        y yVar = this.f5297S;
        if (yVar != null) {
            yVar.k(sourceEvent);
        }
        y yVar2 = this.f5297S;
        if (yVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(yVar2.e(), yVar2.f()));
            this.f5295Q = pointFQ0.x;
            this.f5296R = pointFQ0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (S() == 4) {
                B();
            } else {
                D();
            }
        }
    }

    @Override // Ia.AbstractC1098d
    protected void o0() {
        this.f5297S = null;
        this.f5295Q = Float.NaN;
        this.f5296R = Float.NaN;
        t0();
    }

    @Override // Ia.AbstractC1098d
    public void t0() {
        this.f5294P = 0.0d;
        this.f5293O = 1.0d;
    }
}
