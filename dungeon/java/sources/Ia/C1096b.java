package Ia;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ia.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1096b extends AbstractC1098d {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final a f5136W = new a(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final double f5137X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final double f5138Y;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Handler f5143S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f5144T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private VelocityTracker f5146V;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f5139O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f5140P = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final long f5141Q = 800;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final long f5142R = 2000;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Runnable f5145U = new RunnableC1095a(this);

    /* JADX INFO: renamed from: Ia.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: Ia.b$b, reason: collision with other inner class name */
    public static final class C0104b extends AbstractC1098d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f5147d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5148b = C1096b.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5149c = "FlingGestureHandler";

        /* JADX INFO: renamed from: Ia.b$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5149c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5148b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1096b a(Context context) {
            return new C1096b();
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.a c(C1096b handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.a(handler);
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(C1096b handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfPointers")) {
                handler.Z0(config.getInt("numberOfPointers"));
            }
            if (config.hasKey("direction")) {
                handler.Y0(config.getInt("direction"));
            }
        }
    }

    static {
        k kVar = k.f5218a;
        f5137X = kVar.a(30.0d);
        f5138Y = kVar.a(60.0d);
    }

    private final void V0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.c(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void W0(MotionEvent motionEvent) {
        if (b1(motionEvent)) {
            return;
        }
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(C1096b c1096b) {
        c1096b.D();
    }

    private final void a1(MotionEvent motionEvent) {
        this.f5146V = VelocityTracker.obtain();
        p();
        this.f5144T = 1;
        Handler handler = this.f5143S;
        if (handler == null) {
            this.f5143S = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f5143S;
        Intrinsics.c(handler2);
        handler2.postDelayed(this.f5145U, this.f5141Q);
    }

    private final boolean b1(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        V0(this.f5146V, motionEvent);
        C.a aVar = C.f5120f;
        VelocityTracker velocityTracker = this.f5146V;
        Intrinsics.c(velocityTracker);
        C cB = aVar.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.add(Boolean.valueOf(c1(this, cB, numArr[i10].intValue(), f5137X)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList2.add(Boolean.valueOf(c1(this, cB, numArr2[i11].intValue(), f5138Y)));
        }
        if (arrayList.isEmpty()) {
            z10 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (((Boolean) it.next()).booleanValue()) {
                z10 = true;
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = false;
                break;
            }
            if (((Boolean) it2.next()).booleanValue()) {
                z11 = true;
                break;
            }
        }
        boolean z12 = z10 | z11;
        boolean z13 = cB.k() > ((double) this.f5142R);
        if (this.f5144T != this.f5139O || !z12 || !z13) {
            return false;
        }
        Handler handler = this.f5143S;
        Intrinsics.c(handler);
        handler.removeCallbacksAndMessages(null);
        k();
        return true;
    }

    private static final boolean c1(C1096b c1096b, C c10, int i10, double d10) {
        return (c1096b.f5140P & i10) == i10 && c10.l(C.f5120f.a(i10), d10);
    }

    public final void Y0(int i10) {
        this.f5140P = i10;
    }

    public final void Z0(int i10) {
        this.f5139O = i10;
    }

    @Override // Ia.AbstractC1098d
    protected void j0() {
        Handler handler = this.f5143S;
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
            if (iS == 0) {
                a1(sourceEvent);
            }
            if (iS == 2) {
                b1(sourceEvent);
                if (sourceEvent.getPointerCount() > this.f5144T) {
                    this.f5144T = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    W0(sourceEvent);
                }
            }
        }
    }

    @Override // Ia.AbstractC1098d
    protected void o0() {
        VelocityTracker velocityTracker = this.f5146V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5146V = null;
        Handler handler = this.f5143S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ia.AbstractC1098d
    public void s0() {
        super.s0();
        this.f5139O = 1;
        this.f5140P = 1;
    }
}
