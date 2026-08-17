package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p199l1.g;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f25423g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f25424h = new J1.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f25425i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f25426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f25427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f25428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f25429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f25430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f25431f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f25432a;

        a(c cVar) {
            this.f25432a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f25432a);
            b.this.b(fFloatValue, this.f25432a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0321b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f25434a;

        C0321b(c cVar) {
            this.f25434a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f25434a, true);
            this.f25434a.A();
            this.f25434a.l();
            b bVar = b.this;
            if (!bVar.f25431f) {
                bVar.f25430e += 1.0f;
                return;
            }
            bVar.f25431f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f25434a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f25430e = 0.0f;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f25436a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f25437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f25438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f25439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f25440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f25441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f25442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f25443h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f25444i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f25445j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f25446k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f25447l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f25448m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f25449n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f25450o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f25451p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f25452q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f25453r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f25454s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f25455t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f25456u;

        c() {
            Paint paint = new Paint();
            this.f25437b = paint;
            Paint paint2 = new Paint();
            this.f25438c = paint2;
            Paint paint3 = new Paint();
            this.f25439d = paint3;
            this.f25440e = 0.0f;
            this.f25441f = 0.0f;
            this.f25442g = 0.0f;
            this.f25443h = 5.0f;
            this.f25451p = 1.0f;
            this.f25455t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f25446k = this.f25440e;
            this.f25447l = this.f25441f;
            this.f25448m = this.f25442g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f25436a;
            float f10 = this.f25452q;
            float fMin = (this.f25443h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f25453r * this.f25451p) / 2.0f, this.f25443h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f25440e;
            float f12 = this.f25442g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f25441f + f12) * 360.0f) - f13;
            this.f25437b.setColor(this.f25456u);
            this.f25437b.setAlpha(this.f25455t);
            float f15 = this.f25443h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f25439d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f25437b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f25449n) {
                Path path = this.f25450o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f25450o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f25453r * this.f25451p) / 2.0f;
                this.f25450o.moveTo(0.0f, 0.0f);
                this.f25450o.lineTo(this.f25453r * this.f25451p, 0.0f);
                Path path3 = this.f25450o;
                float f13 = this.f25453r;
                float f14 = this.f25451p;
                path3.lineTo((f13 * f14) / 2.0f, this.f25454s * f14);
                this.f25450o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f25443h / 2.0f));
                this.f25450o.close();
                this.f25438c.setColor(this.f25456u);
                this.f25438c.setAlpha(this.f25455t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f25450o, this.f25438c);
                canvas.restore();
            }
        }

        int c() {
            return this.f25455t;
        }

        float d() {
            return this.f25441f;
        }

        int e() {
            return this.f25444i[f()];
        }

        int f() {
            return (this.f25445j + 1) % this.f25444i.length;
        }

        float g() {
            return this.f25440e;
        }

        int h() {
            return this.f25444i[this.f25445j];
        }

        float i() {
            return this.f25447l;
        }

        float j() {
            return this.f25448m;
        }

        float k() {
            return this.f25446k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f25446k = 0.0f;
            this.f25447l = 0.0f;
            this.f25448m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f25455t = i10;
        }

        void o(float f10, float f11) {
            this.f25453r = (int) f10;
            this.f25454s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f25451p) {
                this.f25451p = f10;
            }
        }

        void q(float f10) {
            this.f25452q = f10;
        }

        void r(int i10) {
            this.f25456u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f25437b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f25445j = i10;
            this.f25456u = this.f25444i[i10];
        }

        void u(int[] iArr) {
            this.f25444i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f25441f = f10;
        }

        void w(float f10) {
            this.f25442g = f10;
        }

        void x(boolean z10) {
            if (this.f25449n != z10) {
                this.f25449n = z10;
            }
        }

        void y(float f10) {
            this.f25440e = f10;
        }

        void z(float f10) {
            this.f25443h = f10;
            this.f25437b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f25428c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f25426a = cVar;
        cVar.u(f25425i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private void h(float f10) {
        this.f25427b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f25426a;
        float f14 = this.f25428c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f25426a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f25423g);
        valueAnimatorOfFloat.addListener(new C0321b(cVar));
        this.f25429d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f25431f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f25424h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f25424h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f25430e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f25426a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f25427b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f25426a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f25426a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f25426a.u(iArr);
        this.f25426a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f25426a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f25426a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f25429d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f25426a.y(f10);
        this.f25426a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f25426a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f25426a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25426a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f25429d.cancel();
        this.f25426a.A();
        if (this.f25426a.d() != this.f25426a.g()) {
            this.f25431f = true;
            this.f25429d.setDuration(666L);
            this.f25429d.start();
        } else {
            this.f25426a.t(0);
            this.f25426a.m();
            this.f25429d.setDuration(1332L);
            this.f25429d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f25429d.cancel();
        h(0.0f);
        this.f25426a.x(false);
        this.f25426a.t(0);
        this.f25426a.m();
        invalidateSelf();
    }
}
