package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1922o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1924p f23226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f23227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f23228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f23229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f23234j;

    /* JADX INFO: renamed from: androidx.core.view.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C1922o(Context context, InterfaceC1924p interfaceC1924p) {
        this(context, interfaceC1924p, new C1918m(), new C1920n());
    }

    C1922o(Context context, InterfaceC1924p interfaceC1924p, b bVar, a aVar) {
        this.f23231g = -1;
        this.f23232h = -1;
        this.f23233i = -1;
        this.f23234j = new int[]{Integer.MAX_VALUE, 0};
        this.f23225a = context;
        this.f23226b = interfaceC1924p;
        this.f23227c = bVar;
        this.f23228d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC1899c0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = AbstractC1899c0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f23232h == source && this.f23233i == deviceId && this.f23231g == i10) {
            return false;
        }
        this.f23227c.a(this.f23225a, this.f23234j, motionEvent, i10);
        this.f23232h = source;
        this.f23233i = deviceId;
        this.f23231g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f23229e == null) {
            this.f23229e = VelocityTracker.obtain();
        }
        return this.f23228d.a(this.f23229e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        W.a(velocityTracker, motionEvent);
        W.b(velocityTracker, 1000);
        return W.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f23234j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f23229e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f23229e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f23226b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f23230f) && fSignum != 0.0f)) {
            this.f23226b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f23234j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        this.f23230f = this.f23226b.a(fMax) ? fMax : 0.0f;
    }
}
