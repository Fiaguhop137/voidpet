package Ia;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.H;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC1098d {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f5228Y = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f5229O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final float f5230P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f5231Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f5232R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f5233S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f5234T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f5235U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f5236V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Handler f5237W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f5238X;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractC1098d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f5239d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5240b = o.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5241c = "LongPressGestureHandler";

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5241c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5240b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o a(Context context) {
            Intrinsics.c(context);
            return new o(context);
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.d c(o handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.d(handler);
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(o handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("minDurationMs")) {
                handler.a1(config.getInt("minDurationMs"));
            }
            if (config.hasKey("maxDist")) {
                handler.f5231Q = H.h(config.getDouble("maxDist"));
            }
            if (config.hasKey("numberOfPointers")) {
                handler.D0(config.getInt("numberOfPointers"));
            }
        }
    }

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5229O = 500L;
        G0(true);
        float f10 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.f5230P = f10;
        this.f5231Q = f10;
        this.f5232R = 1;
    }

    private final Pair W0(MotionEvent motionEvent, boolean z10) {
        if (z10) {
            int pointerCount = motionEvent.getPointerCount();
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex()) {
                    x10 += motionEvent.getX(i10);
                    y10 += motionEvent.getY(i10);
                }
            }
            return new Pair(Float.valueOf(x10 / (motionEvent.getPointerCount() - 1)), Float.valueOf(y10 / (motionEvent.getPointerCount() - 1)));
        }
        IntRange intRangeT = kotlin.ranges.e.t(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(intRangeT, 10));
        Iterator it = intRangeT.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((K) it).nextInt())));
        }
        float fA0 = (float) CollectionsKt.a0(arrayList);
        IntRange intRangeT2 = kotlin.ranges.e.t(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(intRangeT2, 10));
        Iterator it2 = intRangeT2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((K) it2).nextInt())));
        }
        return new Pair(Float.valueOf(fA0), Float.valueOf((float) CollectionsKt.a0(arrayList2)));
    }

    static /* synthetic */ Pair X0(o oVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return oVar.W0(motionEvent, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(o oVar) {
        oVar.k();
    }

    public final int Y0() {
        return (int) (this.f5236V - this.f5235U);
    }

    public final void a1(long j10) {
        this.f5229O = j10;
    }

    @Override // Ia.AbstractC1098d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (S() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.f5236V = jUptimeMillis;
                this.f5235U = jUptimeMillis;
                p();
                Pair pairX0 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue = ((Number) pairX0.getFirst()).floatValue();
                float fFloatValue2 = ((Number) pairX0.getSecond()).floatValue();
                this.f5233S = fFloatValue;
                this.f5234T = fFloatValue2;
                this.f5238X++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.f5238X++;
                Pair pairX1 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue3 = ((Number) pairX1.getFirst()).floatValue();
                float fFloatValue4 = ((Number) pairX1.getSecond()).floatValue();
                this.f5233S = fFloatValue3;
                this.f5234T = fFloatValue4;
                if (this.f5238X > this.f5232R) {
                    D();
                    this.f5238X = 0;
                }
            }
            if (S() == 2 && this.f5238X == this.f5232R && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f5237W = handler;
                long j10 = this.f5229O;
                if (j10 > 0) {
                    Intrinsics.c(handler);
                    handler.postDelayed(new n(this), this.f5229O);
                } else if (j10 == 0) {
                    k();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.f5238X--;
                Handler handler2 = this.f5237W;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f5237W = null;
                }
                if (S() == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() == 6) {
                int i10 = this.f5238X - 1;
                this.f5238X = i10;
                if (i10 < this.f5232R && S() != 4) {
                    D();
                    this.f5238X = 0;
                    return;
                }
                Pair pairW0 = W0(sourceEvent, true);
                float fFloatValue5 = ((Number) pairW0.getFirst()).floatValue();
                float fFloatValue6 = ((Number) pairW0.getSecond()).floatValue();
                this.f5233S = fFloatValue5;
                this.f5234T = fFloatValue6;
                return;
            }
            Pair pairX2 = X0(this, sourceEvent, false, 2, null);
            float fFloatValue7 = ((Number) pairX2.getFirst()).floatValue();
            float fFloatValue8 = ((Number) pairX2.getSecond()).floatValue();
            float f10 = fFloatValue7 - this.f5233S;
            float f11 = fFloatValue8 - this.f5234T;
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f5231Q;
            if (f12 > f13 * f13) {
                if (S() == 4) {
                    q();
                } else {
                    D();
                }
            }
        }
    }

    @Override // Ia.AbstractC1098d
    protected void o0() {
        super.o0();
        this.f5238X = 0;
    }

    @Override // Ia.AbstractC1098d
    protected void p0(int i10, int i11) {
        Handler handler = this.f5237W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f5237W = null;
        }
    }

    @Override // Ia.AbstractC1098d
    public void s0() {
        super.s0();
        this.f5229O = 500L;
        this.f5231Q = this.f5230P;
        G0(true);
    }

    @Override // Ia.AbstractC1098d
    public void v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5236V = SystemClock.uptimeMillis();
        super.v(event);
    }

    @Override // Ia.AbstractC1098d
    public void w(int i10, int i11) {
        this.f5236V = SystemClock.uptimeMillis();
        super.w(i10, i11);
    }
}
