package com.google.android.material.timepicker;

import Y8.j;
import Y8.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.Z;
import com.google.android.material.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f37197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f37198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f37201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f37203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f37205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f37206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f37207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f37208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f37209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f37210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f37211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f37212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f37213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f37214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37215t;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y8.a.f16957E);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37198c = new ValueAnimator();
        this.f37205j = new ArrayList();
        Paint paint = new Paint();
        this.f37208m = paint;
        this.f37209n = new RectF();
        this.f37215t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f17321L1, i10, j.f17218w);
        this.f37196a = p207l9.d.f(context, Y8.a.f16959G, 200);
        this.f37197b = p207l9.d.g(context, Y8.a.f16966N, Z8.a.f18802b);
        this.f37214s = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f17339N1, 0);
        this.f37206k = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f17348O1, 0);
        Resources resources = getResources();
        this.f37210o = resources.getDimensionPixelSize(Y8.c.f17020D);
        this.f37207l = resources.getDimensionPixelSize(Y8.c.f17018B);
        int color = typedArrayObtainStyledAttributes.getColor(k.f17330M1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f37203h = ViewConfiguration.get(context).getScaledTouchSlop();
        Z.v0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.f37215t = p189k9.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + p.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f37215t);
        float f10 = width;
        float f11 = iH;
        float fCos = (((float) Math.cos(this.f37213r)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f37213r))) + f12;
        this.f37208m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f37206k, this.f37208m);
        double dSin = Math.sin(this.f37213r);
        double dCos = Math.cos(this.f37213r);
        double d10 = iH - this.f37206k;
        this.f37208m.setStrokeWidth(this.f37210o);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f37208m);
        canvas.drawCircle(f10, f12, this.f37207l, this.f37208m);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f37214s * 0.66f) : this.f37214s;
    }

    private Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f37199d) {
            z13 = true;
        }
        n(f12, z13);
        return true;
    }

    private void o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f37211p = f11;
        this.f37213r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f37215t);
        float fCos = width + (((float) Math.cos(this.f37213r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f37213r)));
        RectF rectF = this.f37209n;
        int i10 = this.f37206k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f37205j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f37205j.add(bVar);
    }

    public RectF e() {
        return this.f37209n;
    }

    public float g() {
        return this.f37211p;
    }

    public int i() {
        return this.f37206k;
    }

    public void l(int i10) {
        this.f37214s = i10;
        invalidate();
    }

    public void m(float f10) {
        n(f10, false);
    }

    public void n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f37198c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            o(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f37198c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f37198c.setDuration(this.f37196a);
        this.f37198c.setInterpolator(this.f37197b);
        this.f37198c.addUpdateListener(new com.google.android.material.timepicker.a(this));
        this.f37198c.addListener(new a());
        this.f37198c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f37198c.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f37200e = x10;
            this.f37201f = y10;
            this.f37202g = true;
            this.f37212q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f37200e);
            int i11 = (int) (y10 - this.f37201f);
            this.f37202g = (i10 * i10) + (i11 * i11) > this.f37203h;
            z11 = this.f37212q;
            boolean z13 = actionMasked == 1;
            if (this.f37204i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f37212q |= k(x10, y10, z11, z10, z12);
        return true;
    }

    void p(boolean z10) {
        if (this.f37204i && !z10) {
            this.f37215t = 1;
        }
        this.f37204i = z10;
        invalidate();
    }
}
