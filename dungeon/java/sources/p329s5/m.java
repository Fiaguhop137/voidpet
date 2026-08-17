package p329s5;

import V4.k;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p151i6.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends Drawable implements i, C {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private D f53392C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f53393a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float[] f53403k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    RectF f53408p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Matrix f53414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Matrix f53415w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f53394b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f53395c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f53396d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Path f53397e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f53398f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f53399g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Path f53400h = new Path();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f53401i = new float[8];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f53402j = new float[8];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f53404l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final RectF f53405m = new RectF();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final RectF f53406n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final RectF f53407o = new RectF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Matrix f53409q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Matrix f53410r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Matrix f53411s = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Matrix f53412t = new Matrix();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Matrix f53413u = new Matrix();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Matrix f53416x = new Matrix();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f53417y = 0.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f53418z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f53390A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f53391B = true;

    m(Drawable drawable) {
        this.f53393a = drawable;
    }

    private static Matrix a(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean e(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // p329s5.i
    public void b(int i10, float f10) {
        if (this.f53399g == i10 && this.f53396d == f10) {
            return;
        }
        this.f53399g = i10;
        this.f53396d = f10;
        this.f53391B = true;
        invalidateSelf();
    }

    @Override // p329s5.i
    public void c(boolean z10) {
        this.f53394b = z10;
        this.f53391B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f53393a.clearColorFilter();
    }

    public boolean d() {
        return this.f53390A;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedDrawable#draw");
        }
        this.f53393a.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }

    boolean f() {
        return this.f53394b || this.f53395c || this.f53396d > 0.0f;
    }

    protected void g() {
        float[] fArr;
        if (this.f53391B) {
            this.f53400h.reset();
            RectF rectF = this.f53404l;
            float f10 = this.f53396d;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f53394b) {
                this.f53400h.addCircle(this.f53404l.centerX(), this.f53404l.centerY(), Math.min(this.f53404l.width(), this.f53404l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f53402j;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f53401i[i10] + this.f53417y) - (this.f53396d / 2.0f);
                    i10++;
                }
                this.f53400h.addRoundRect(this.f53404l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f53404l;
            float f11 = this.f53396d;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f53397e.reset();
            float f12 = this.f53417y + (this.f53418z ? this.f53396d : 0.0f);
            this.f53404l.inset(f12, f12);
            if (this.f53394b) {
                this.f53397e.addCircle(this.f53404l.centerX(), this.f53404l.centerY(), Math.min(this.f53404l.width(), this.f53404l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f53418z) {
                if (this.f53403k == null) {
                    this.f53403k = new float[8];
                }
                for (int i11 = 0; i11 < this.f53402j.length; i11++) {
                    this.f53403k[i11] = this.f53401i[i11] - this.f53396d;
                }
                this.f53397e.addRoundRect(this.f53404l, this.f53403k, Path.Direction.CW);
            } else {
                this.f53397e.addRoundRect(this.f53404l, this.f53401i, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f53404l.inset(f13, f13);
            this.f53397e.setFillType(Path.FillType.WINDING);
            this.f53391B = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53393a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f53393a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53393a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53393a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f53393a.getOpacity();
    }

    @Override // p329s5.i
    public void h(float f10) {
        if (this.f53417y != f10) {
            this.f53417y = f10;
            this.f53391B = true;
            invalidateSelf();
        }
    }

    @Override // p329s5.C
    public void i(D d10) {
        this.f53392C = d10;
    }

    @Override // p329s5.i
    public void j(float f10) {
        k.i(f10 >= 0.0f);
        Arrays.fill(this.f53401i, f10);
        this.f53395c = f10 != 0.0f;
        this.f53391B = true;
        invalidateSelf();
    }

    public void k(boolean z10) {
    }

    protected void l() {
        Matrix matrix;
        Matrix matrix2;
        D d10 = this.f53392C;
        if (d10 != null) {
            d10.d(this.f53411s);
            this.f53392C.p(this.f53404l);
        } else {
            this.f53411s.reset();
            this.f53404l.set(getBounds());
        }
        this.f53406n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f53407o.set(this.f53393a.getBounds());
        Matrix matrix3 = this.f53409q;
        RectF rectF = this.f53406n;
        RectF rectF2 = this.f53407o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f53418z) {
            RectF rectF3 = this.f53408p;
            if (rectF3 == null) {
                this.f53408p = new RectF(this.f53404l);
            } else {
                rectF3.set(this.f53404l);
            }
            RectF rectF4 = this.f53408p;
            float f10 = this.f53396d;
            rectF4.inset(f10, f10);
            if (this.f53414v == null) {
                this.f53414v = new Matrix();
            }
            this.f53414v.setRectToRect(this.f53404l, this.f53408p, scaleToFit);
        } else {
            Matrix matrix4 = this.f53414v;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f53411s.equals(this.f53412t) || !this.f53409q.equals(this.f53410r) || ((matrix2 = this.f53414v) != null && !e(matrix2, this.f53415w))) {
            this.f53398f = true;
            this.f53411s.invert(this.f53413u);
            this.f53416x.set(this.f53411s);
            if (this.f53418z && (matrix = this.f53414v) != null) {
                this.f53416x.postConcat(matrix);
            }
            this.f53416x.preConcat(this.f53409q);
            this.f53412t.set(this.f53411s);
            this.f53410r.set(this.f53409q);
            if (this.f53418z) {
                Matrix matrix5 = this.f53415w;
                if (matrix5 == null) {
                    this.f53415w = a(this.f53414v);
                } else {
                    matrix5.set(this.f53414v);
                }
            } else {
                Matrix matrix6 = this.f53415w;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f53404l.equals(this.f53405m)) {
            return;
        }
        this.f53391B = true;
        this.f53405m.set(this.f53404l);
    }

    @Override // p329s5.i
    public void m(boolean z10) {
        if (this.f53390A != z10) {
            this.f53390A = z10;
            invalidateSelf();
        }
    }

    @Override // p329s5.i
    public void n(boolean z10) {
        if (this.f53418z != z10) {
            this.f53418z = z10;
            this.f53391B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f53393a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f53393a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f53393a.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53393a.setColorFilter(colorFilter);
    }

    @Override // p329s5.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f53401i, 0.0f);
            this.f53395c = false;
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f53401i, 0, 8);
            this.f53395c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f53395c |= fArr[i10] > 0.0f;
            }
        }
        this.f53391B = true;
        invalidateSelf();
    }
}
