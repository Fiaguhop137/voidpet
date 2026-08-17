package Ia;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f5313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f5314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f5315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f5318i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5319j;

    public interface a {
        boolean a(w wVar);

        void b(w wVar);

        boolean c(w wVar);
    }

    public w(a aVar) {
        this.f5310a = aVar;
    }

    private final void a() {
        if (this.f5317h) {
            this.f5319j = false;
            this.f5317h = false;
            a aVar = this.f5310a;
            if (aVar != null) {
                aVar.b(this);
            }
        }
    }

    private final void g() {
        if (this.f5319j) {
            return;
        }
        this.f5319j = true;
    }

    private final void h(double d10) {
        if (this.f5319j) {
            this.f5313d = d10;
            this.f5319j = false;
        }
    }

    private final void i(MotionEvent motionEvent) {
        this.f5312c = this.f5311b;
        this.f5311b = motionEvent.getEventTime();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f5318i[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f5318i[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x10 = motionEvent.getX(iFindPointerIndex);
        float y10 = motionEvent.getY(iFindPointerIndex);
        float x11 = motionEvent.getX(iFindPointerIndex2);
        float y11 = motionEvent.getY(iFindPointerIndex2);
        this.f5315f = (x10 + x11) * 0.5f;
        this.f5316g = (y10 + y11) * 0.5f;
        double d10 = -Math.atan2(y11 - y10, x11 - x10);
        h(d10);
        double d11 = Double.isNaN(this.f5313d) ? 0.0d : this.f5313d - d10;
        this.f5314e = d11;
        this.f5313d = d10;
        if (d11 > 3.141592653589793d) {
            this.f5314e = d11 - 3.141592653589793d;
        } else if (d11 < -3.141592653589793d) {
            this.f5314e = d11 + 3.141592653589793d;
        }
        double d12 = this.f5314e;
        if (d12 > 1.5707963267948966d) {
            this.f5314e = d12 - 3.141592653589793d;
        } else if (d12 < -1.5707963267948966d) {
            this.f5314e = d12 + 3.141592653589793d;
        }
    }

    public final float b() {
        return this.f5315f;
    }

    public final float c() {
        return this.f5316g;
    }

    public final double d() {
        return this.f5314e;
    }

    public final long e() {
        return this.f5311b - this.f5312c;
    }

    public final boolean f(MotionEvent event) {
        a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f5317h = false;
            this.f5318i[0] = event.getPointerId(event.getActionIndex());
            this.f5318i[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.f5317h || this.f5319j) {
                    this.f5318i[1] = event.getPointerId(event.getActionIndex());
                    i(event);
                }
                if (!this.f5317h) {
                    this.f5317h = true;
                    this.f5312c = event.getEventTime();
                    this.f5313d = Double.NaN;
                    a aVar2 = this.f5310a;
                    if (aVar2 != null) {
                        aVar2.c(this);
                    }
                }
            } else if (actionMasked == 6 && this.f5317h) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.f5318i;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    g();
                }
            }
        } else if (this.f5317h) {
            i(event);
            if (!this.f5319j && (aVar = this.f5310a) != null) {
                aVar.a(this);
            }
        }
        return true;
    }
}
