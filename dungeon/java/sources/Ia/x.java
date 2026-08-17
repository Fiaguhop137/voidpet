package Ia;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC1098d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final a f5320U = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private w f5321O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private double f5322P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private double f5323Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f5324R = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f5325S = Float.NaN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final w.a f5326T = new c();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractC1098d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5327b = x.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5328c = "RotationGestureHandler";

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5328c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5327b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public x a(Context context) {
            return new x();
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.i c(x handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.i(handler);
        }
    }

    public static final class c implements w.a {
        c() {
        }

        @Override // Ia.w.a
        public boolean a(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double dY0 = x.this.Y0();
            x xVar = x.this;
            xVar.f5322P = xVar.Y0() + detector.d();
            long jE = detector.e();
            if (jE > 0) {
                x xVar2 = x.this;
                xVar2.f5323Q = (xVar2.Y0() - dY0) / jE;
            }
            if (Math.abs(x.this.Y0()) < 0.08726646259971647d || x.this.S() != 2) {
                return true;
            }
            x.this.k();
            return true;
        }

        @Override // Ia.w.a
        public void b(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            x.this.B();
        }

        @Override // Ia.w.a
        public boolean c(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            return true;
        }
    }

    public final float W0() {
        return this.f5324R;
    }

    public final float X0() {
        return this.f5325S;
    }

    public final double Y0() {
        return this.f5322P;
    }

    public final double Z0() {
        return this.f5323Q;
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
            t0();
            this.f5321O = new w(this.f5326T);
            this.f5324R = event.getX();
            this.f5325S = event.getY();
            p();
        }
        w wVar = this.f5321O;
        if (wVar != null) {
            wVar.f(sourceEvent);
        }
        w wVar2 = this.f5321O;
        if (wVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(wVar2.b(), wVar2.c()));
            this.f5324R = pointFQ0.x;
            this.f5325S = pointFQ0.y;
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
        this.f5321O = null;
        this.f5324R = Float.NaN;
        this.f5325S = Float.NaN;
        t0();
    }

    @Override // Ia.AbstractC1098d
    public void t0() {
        this.f5323Q = 0.0d;
        this.f5322P = 0.0d;
    }
}
