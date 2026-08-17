package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f23314r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f23317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f23318d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23322h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f23327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f23328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f23329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f23331q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0284a f23315a = new C0284a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f23316b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f23319e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f23320f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f23323i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f23324j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f23325k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0284a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f23334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f23335d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f23341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f23342k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f23336e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f23340i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f23337f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f23338g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f23339h = 0;

        C0284a() {
        }

        private float e(long j10) {
            long j11 = this.f23336e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f23340i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f23332a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f23341j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f23342k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f23337f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f23337f;
            this.f23337f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f23338g = (int) (this.f23334c * f10);
            this.f23339h = (int) (f10 * this.f23335d);
        }

        public int b() {
            return this.f23338g;
        }

        public int c() {
            return this.f23339h;
        }

        public int d() {
            float f10 = this.f23334c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f23335d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f23340i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f23340i + ((long) this.f23342k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f23342k = a.f((int) (jCurrentAnimationTimeMillis - this.f23336e), 0, this.f23333b);
            this.f23341j = e(jCurrentAnimationTimeMillis);
            this.f23340i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f23333b = i10;
        }

        public void k(int i10) {
            this.f23332a = i10;
        }

        public void l(float f10, float f11) {
            this.f23334c = f10;
            this.f23335d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f23336e = jCurrentAnimationTimeMillis;
            this.f23340i = -1L;
            this.f23337f = jCurrentAnimationTimeMillis;
            this.f23341j = 0.5f;
            this.f23338g = 0;
            this.f23339h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f23329o) {
                if (aVar.f23327m) {
                    aVar.f23327m = false;
                    aVar.f23315a.m();
                }
                C0284a c0284a = a.this.f23315a;
                if (c0284a.h() || !a.this.u()) {
                    a.this.f23329o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f23328n) {
                    aVar2.f23328n = false;
                    aVar2.c();
                }
                c0284a.a();
                a.this.j(c0284a.b(), c0284a.c());
                Z.e0(a.this.f23317c, this);
            }
        }
    }

    public a(View view) {
        this.f23317c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f23314r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f23319e[i10], f11, this.f23320f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f23323i[i10];
        float f14 = this.f23324j[i10];
        float f15 = this.f23325k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f23321g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f23329o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f23316b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f23316b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f23327m) {
            this.f23329o = false;
        } else {
            this.f23315a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f23318d == null) {
            this.f23318d = new b();
        }
        this.f23329o = true;
        this.f23327m = true;
        if (this.f23326l || (i10 = this.f23322h) <= 0) {
            this.f23318d.run();
        } else {
            Z.f0(this.f23317c, this.f23318d, i10);
        }
        this.f23326l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f23317c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f23322h = i10;
        return this;
    }

    public a l(int i10) {
        this.f23321g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f23330p && !z10) {
            i();
        }
        this.f23330p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f23320f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f23325k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f23330p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f23331q && this.f23329o;
        }
        this.f23328n = true;
        this.f23326l = false;
        this.f23315a.l(d(0, motionEvent.getX(), view.getWidth(), this.f23317c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f23317c.getHeight()));
        if (!this.f23329o && u()) {
            v();
        }
        if (this.f23331q) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f23324j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f23315a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f23315a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f23319e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f23323i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0284a c0284a = this.f23315a;
        int iF = c0284a.f();
        int iD = c0284a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
