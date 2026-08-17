package p329s5;

import V4.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class l extends g implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f53369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f53370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f53371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f53372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f53373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f53374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Paint f53375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f53377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f53380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Path f53383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f53384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f53385u;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53386a;

        static {
            int[] iArr = new int[b.values().length];
            f53386a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53386a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) k.g(drawable));
        this.f53369e = b.OVERLAY_COLOR;
        this.f53370f = new RectF();
        this.f53373i = new float[8];
        this.f53374j = new float[8];
        this.f53375k = new Paint(1);
        this.f53376l = false;
        this.f53377m = 0.0f;
        this.f53378n = 0;
        this.f53379o = 0;
        this.f53380p = 0.0f;
        this.f53381q = false;
        this.f53382r = false;
        this.f53383s = new Path();
        this.f53384t = new Path();
        this.f53385u = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f53383s.reset();
        this.f53384t.reset();
        this.f53385u.set(getBounds());
        RectF rectF = this.f53385u;
        float f10 = this.f53380p;
        rectF.inset(f10, f10);
        if (this.f53369e == b.OVERLAY_COLOR) {
            this.f53383s.addRect(this.f53385u, Path.Direction.CW);
        }
        if (this.f53376l) {
            this.f53383s.addCircle(this.f53385u.centerX(), this.f53385u.centerY(), Math.min(this.f53385u.width(), this.f53385u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f53383s.addRoundRect(this.f53385u, this.f53373i, Path.Direction.CW);
        }
        RectF rectF2 = this.f53385u;
        float f11 = this.f53380p;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f53385u;
        float f12 = this.f53377m;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f53376l) {
            this.f53384t.addCircle(this.f53385u.centerX(), this.f53385u.centerY(), Math.min(this.f53385u.width(), this.f53385u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f53374j;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f53373i[i10] + this.f53380p) - (this.f53377m / 2.0f);
                i10++;
            }
            this.f53384t.addRoundRect(this.f53385u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f53385u;
        float f13 = this.f53377m;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // p329s5.i
    public void b(int i10, float f10) {
        this.f53378n = i10;
        this.f53377m = f10;
        z();
        invalidateSelf();
    }

    @Override // p329s5.i
    public void c(boolean z10) {
        this.f53376l = z10;
        z();
        invalidateSelf();
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f53370f.set(getBounds());
        int i10 = a.f53386a[this.f53369e.ordinal()];
        if (i10 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f53383s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i10 == 2) {
            if (this.f53381q) {
                RectF rectF = this.f53371g;
                if (rectF == null) {
                    this.f53371g = new RectF(this.f53370f);
                    this.f53372h = new Matrix();
                } else {
                    rectF.set(this.f53370f);
                }
                RectF rectF2 = this.f53371g;
                float f10 = this.f53377m;
                rectF2.inset(f10, f10);
                Matrix matrix = this.f53372h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f53370f, this.f53371g, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f53370f);
                canvas.concat(this.f53372h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f53375k.setStyle(Paint.Style.FILL);
            this.f53375k.setColor(this.f53379o);
            this.f53375k.setStrokeWidth(0.0f);
            this.f53375k.setFilterBitmap(x());
            this.f53383s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f53383s, this.f53375k);
            if (this.f53376l) {
                float fWidth = ((this.f53370f.width() - this.f53370f.height()) + this.f53377m) / 2.0f;
                float fHeight = ((this.f53370f.height() - this.f53370f.width()) + this.f53377m) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f53370f;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + fWidth, rectF3.bottom, this.f53375k);
                    RectF rectF4 = this.f53370f;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - fWidth, rectF4.top, f12, rectF4.bottom, this.f53375k);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f53370f;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + fHeight, this.f53375k);
                    RectF rectF6 = this.f53370f;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - fHeight, rectF6.right, f16, this.f53375k);
                }
            }
        }
        if (this.f53378n != 0) {
            this.f53375k.setStyle(Paint.Style.STROKE);
            this.f53375k.setColor(this.f53378n);
            this.f53375k.setStrokeWidth(this.f53377m);
            this.f53383s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f53384t, this.f53375k);
        }
    }

    @Override // p329s5.i
    public void h(float f10) {
        this.f53380p = f10;
        z();
        invalidateSelf();
    }

    @Override // p329s5.i
    public void j(float f10) {
        Arrays.fill(this.f53373i, f10);
        z();
        invalidateSelf();
    }

    @Override // p329s5.i
    public void k(boolean z10) {
    }

    @Override // p329s5.i
    public void m(boolean z10) {
        if (this.f53382r != z10) {
            this.f53382r = z10;
            invalidateSelf();
        }
    }

    @Override // p329s5.i
    public void n(boolean z10) {
        this.f53381q = z10;
        z();
        invalidateSelf();
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // p329s5.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f53373i, 0.0f);
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f53373i, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f53382r;
    }

    public void y(int i10) {
        this.f53379o = i10;
        invalidateSelf();
    }
}
