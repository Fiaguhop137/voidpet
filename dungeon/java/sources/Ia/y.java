package Ia;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f5331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f5332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f5337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f5338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f5339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f5340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f5341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f5342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f5348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f5349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f5350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GestureDetector f5352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5353x;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            y.this.f5349t = motionEvent.getX();
            y.this.f5350u = motionEvent.getY();
            y.this.f5351v = 1;
            return true;
        }
    }

    public interface b {
        boolean a(y yVar);

        void b(y yVar);

        boolean c(y yVar);
    }

    public y(Context context, b bVar) {
        this(context, bVar, null);
    }

    public y(Context context, b bVar, Handler handler) {
        this.f5351v = 0;
        this.f5330a = context;
        this.f5331b = bVar;
        this.f5346q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f5347r = 0;
        this.f5348s = handler;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            l(true);
        }
        if (i10 > 22) {
            m(true);
        }
    }

    private boolean j() {
        return this.f5351v != 0;
    }

    public float d() {
        return this.f5336g;
    }

    public float e() {
        return this.f5332c;
    }

    public float f() {
        return this.f5333d;
    }

    public float g() {
        if (!j()) {
            float f10 = this.f5337h;
            if (f10 > 0.0f) {
                return this.f5336g / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.f5353x;
        boolean z11 = (z10 && this.f5336g < this.f5337h) || (!z10 && this.f5336g > this.f5337h);
        float fAbs = Math.abs(1.0f - (this.f5336g / this.f5337h)) * 0.5f;
        if (this.f5337h <= this.f5346q) {
            return 1.0f;
        }
        return z11 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public long h() {
        return this.f5343n - this.f5344o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        float f10;
        float f11;
        this.f5343n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5334e) {
            this.f5352w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = (motionEvent.getButtonState() & 32) != 0;
        boolean z11 = this.f5351v == 2 && !z10;
        boolean z12 = actionMasked == 1 || actionMasked == 3 || z11;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f5345p) {
                this.f5331b.b(this);
                this.f5345p = false;
                this.f5338i = 0.0f;
                this.f5351v = 0;
            } else if (j() && z12) {
                this.f5345p = false;
                this.f5338i = 0.0f;
                this.f5351v = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f5345p && this.f5335f && !j() && !z12 && z10) {
            this.f5349t = motionEvent.getX();
            this.f5350u = motionEvent.getY();
            this.f5351v = 2;
            this.f5338i = 0.0f;
        }
        boolean z13 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11;
        boolean z14 = actionMasked == 6;
        int actionIndex = z14 ? motionEvent.getActionIndex() : -1;
        int i10 = z14 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f11 = this.f5349t;
            f10 = this.f5350u;
            if (motionEvent.getY() < f10) {
                this.f5353x = true;
            } else {
                this.f5353x = false;
            }
        } else {
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    x10 += motionEvent.getX(i11);
                    y10 += motionEvent.getY(i11);
                }
            }
            float f12 = i10;
            float f13 = x10 / f12;
            f10 = y10 / f12;
            f11 = f13;
        }
        float fAbs2 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                fAbs += Math.abs(motionEvent.getX(i12) - f11);
                fAbs2 += Math.abs(motionEvent.getY(i12) - f10);
            }
        }
        float f14 = i10;
        float f15 = (fAbs / f14) * 2.0f;
        float f16 = (fAbs2 / f14) * 2.0f;
        float fHypot = j() ? f16 : (float) Math.hypot(f15, f16);
        boolean z15 = this.f5345p;
        this.f5332c = f11;
        this.f5333d = f10;
        if (!j() && this.f5345p && (fHypot < this.f5347r || z13)) {
            this.f5331b.b(this);
            this.f5345p = false;
            this.f5338i = fHypot;
        }
        if (z13) {
            this.f5339j = f15;
            this.f5341l = f15;
            this.f5340k = f16;
            this.f5342m = f16;
            this.f5336g = fHypot;
            this.f5337h = fHypot;
            this.f5338i = fHypot;
        }
        int i13 = j() ? this.f5346q : this.f5347r;
        if (!this.f5345p && fHypot >= i13 && (z15 || Math.abs(fHypot - this.f5338i) > this.f5346q)) {
            this.f5339j = f15;
            this.f5341l = f15;
            this.f5340k = f16;
            this.f5342m = f16;
            this.f5336g = fHypot;
            this.f5337h = fHypot;
            this.f5344o = this.f5343n;
            this.f5345p = this.f5331b.a(this);
        }
        if (actionMasked == 2) {
            this.f5339j = f15;
            this.f5340k = f16;
            this.f5336g = fHypot;
            if (this.f5345p ? this.f5331b.c(this) : true) {
                this.f5341l = this.f5339j;
                this.f5342m = this.f5340k;
                this.f5337h = this.f5336g;
                this.f5344o = this.f5343n;
            }
        }
        return true;
    }

    public void l(boolean z10) {
        this.f5334e = z10;
        if (z10 && this.f5352w == null) {
            this.f5352w = new GestureDetector(this.f5330a, new a(), this.f5348s);
        }
    }

    public void m(boolean z10) {
        this.f5335f = z10;
    }
}
