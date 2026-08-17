package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.Z;

/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.n implements RecyclerView.r {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f25260D = {16842919};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f25261E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f25262A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Runnable f25263B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final RecyclerView.s f25264C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f25267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f25268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f25271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f25272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f25273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f25274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f25275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f25276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f25277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f25278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f25279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f25280p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f25283s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f25290z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25281q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25282r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25284t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f25285u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25286v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25287w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f25288x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f25289y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25293a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25293a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25293a) {
                this.f25293a = false;
                return;
            }
            if (((Float) d.this.f25290z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f25262A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f25262A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0315d implements ValueAnimator.AnimatorUpdateListener {
        C0315d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f25267c.setAlpha(iFloatValue);
            d.this.f25268d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f25290z = valueAnimatorOfFloat;
        this.f25262A = 0;
        this.f25263B = new a();
        this.f25264C = new b();
        this.f25267c = stateListDrawable;
        this.f25268d = drawable;
        this.f25271g = stateListDrawable2;
        this.f25272h = drawable2;
        this.f25269e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f25270f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f25273i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f25274j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f25265a = i11;
        this.f25266b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0315d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f25276l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f25277m, fMax, iArrP, this.f25283s.computeVerticalScrollRange(), this.f25283s.computeVerticalScrollOffset(), this.f25282r);
        if (iX != 0) {
            this.f25283s.scrollBy(0, iX);
        }
        this.f25277m = fMax;
    }

    private void k() {
        this.f25283s.removeCallbacks(this.f25263B);
    }

    private void l() {
        this.f25283s.V0(this);
        this.f25283s.W0(this);
        this.f25283s.X0(this.f25264C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f25282r;
        int i11 = this.f25273i;
        int i12 = i10 - i11;
        int i13 = this.f25279o;
        int i14 = this.f25278n;
        int i15 = i13 - (i14 / 2);
        this.f25271g.setBounds(0, 0, i14, i11);
        this.f25272h.setBounds(0, 0, this.f25281q, this.f25274j);
        canvas.translate(0.0f, i12);
        this.f25272h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f25271g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void n(Canvas canvas) {
        int i10 = this.f25281q;
        int i11 = this.f25269e;
        int i12 = i10 - i11;
        int i13 = this.f25276l;
        int i14 = this.f25275k;
        int i15 = i13 - (i14 / 2);
        this.f25267c.setBounds(0, 0, i11, i14);
        this.f25268d.setBounds(0, 0, this.f25270f, this.f25282r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f25268d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f25267c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f25268d.draw(canvas);
        canvas.translate(this.f25269e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f25267c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f25269e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f25289y;
        int i10 = this.f25266b;
        iArr[0] = i10;
        iArr[1] = this.f25281q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f25288x;
        int i10 = this.f25266b;
        iArr[0] = i10;
        iArr[1] = this.f25282r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f25279o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f25280p, fMax, iArrO, this.f25283s.computeHorizontalScrollRange(), this.f25283s.computeHorizontalScrollOffset(), this.f25281q);
        if (iX != 0) {
            this.f25283s.scrollBy(iX, 0);
        }
        this.f25280p = fMax;
    }

    private boolean s() {
        return Z.z(this.f25283s) == 1;
    }

    private void w(int i10) {
        k();
        this.f25283s.postDelayed(this.f25263B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f25283s.h(this);
        this.f25283s.j(this);
        this.f25283s.k(this.f25264C);
    }

    public void A() {
        int i10 = this.f25262A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f25290z.cancel();
            }
        }
        this.f25262A = 1;
        ValueAnimator valueAnimator = this.f25290z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f25290z.setDuration(500L);
        this.f25290z.setStartDelay(0L);
        this.f25290z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f25283s.computeVerticalScrollRange();
        int i12 = this.f25282r;
        this.f25284t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f25265a;
        int iComputeHorizontalScrollRange = this.f25283s.computeHorizontalScrollRange();
        int i13 = this.f25281q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f25265a;
        this.f25285u = z10;
        boolean z11 = this.f25284t;
        if (!z11 && !z10) {
            if (this.f25286v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f25276l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f25275k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f25285u) {
            float f11 = i13;
            this.f25279o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f25278n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f25286v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f25286v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f25287w = 1;
                    this.f25280p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f25287w = 2;
                    this.f25277m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f25286v == 2) {
            this.f25277m = 0.0f;
            this.f25280p = 0.0f;
            y(1);
            this.f25287w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f25286v == 2) {
            A();
            if (this.f25287w == 1) {
                r(motionEvent.getX());
            }
            if (this.f25287w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f25286v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.f25287w = 1;
            this.f25280p = (int) motionEvent.getX();
        } else if (zU) {
            this.f25287w = 2;
            this.f25277m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f25281q != this.f25283s.getWidth() || this.f25282r != this.f25283s.getHeight()) {
            this.f25281q = this.f25283s.getWidth();
            this.f25282r = this.f25283s.getHeight();
            y(0);
        } else if (this.f25262A != 0) {
            if (this.f25284t) {
                n(canvas);
            }
            if (this.f25285u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f25283s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f25283s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.f25262A;
        if (i11 == 1) {
            this.f25290z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f25262A = 3;
        ValueAnimator valueAnimator = this.f25290z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f25290z.setDuration(i10);
        this.f25290z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 < this.f25282r - this.f25273i) {
            return false;
        }
        int i10 = this.f25279o;
        int i11 = this.f25278n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f25269e / 2) {
                return false;
            }
        } else if (f10 < this.f25281q - this.f25269e) {
            return false;
        }
        int i10 = this.f25276l;
        int i11 = this.f25275k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    void v() {
        this.f25283s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f25286v != 2) {
            this.f25267c.setState(f25260D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f25286v == 2 && i10 != 2) {
            this.f25267c.setState(f25261E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f25286v = i10;
    }
}
