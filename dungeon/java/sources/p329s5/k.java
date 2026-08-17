package p329s5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class k extends Drawable implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f53356c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f53354a = new float[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f53355b = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Paint f53357d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53358e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f53359f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f53360g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53361h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53362i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53363j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Path f53364k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Path f53365l = new Path();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53366m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f53367n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53368o = 255;

    public k(int i10) {
        e(i10);
    }

    public static k a(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void f() {
        float[] fArr;
        float[] fArr2;
        this.f53364k.reset();
        this.f53365l.reset();
        this.f53367n.set(getBounds());
        RectF rectF = this.f53367n;
        float f10 = this.f53359f;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f53358e) {
            this.f53365l.addCircle(this.f53367n.centerX(), this.f53367n.centerY(), Math.min(this.f53367n.width(), this.f53367n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f53355b;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f53354a[i11] + this.f53360g) - (this.f53359f / 2.0f);
                i11++;
            }
            this.f53365l.addRoundRect(this.f53367n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f53367n;
        float f11 = this.f53359f;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f53360g + (this.f53362i ? this.f53359f : 0.0f);
        this.f53367n.inset(f12, f12);
        if (this.f53358e) {
            this.f53364k.addCircle(this.f53367n.centerX(), this.f53367n.centerY(), Math.min(this.f53367n.width(), this.f53367n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f53362i) {
            if (this.f53356c == null) {
                this.f53356c = new float[8];
            }
            while (true) {
                fArr2 = this.f53356c;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.f53354a[i10] - this.f53359f;
                i10++;
            }
            this.f53364k.addRoundRect(this.f53367n, fArr2, Path.Direction.CW);
        } else {
            this.f53364k.addRoundRect(this.f53367n, this.f53354a, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f53367n.inset(f13, f13);
    }

    @Override // p329s5.i
    public void b(int i10, float f10) {
        if (this.f53361h != i10) {
            this.f53361h = i10;
            invalidateSelf();
        }
        if (this.f53359f != f10) {
            this.f53359f = f10;
            f();
            invalidateSelf();
        }
    }

    @Override // p329s5.i
    public void c(boolean z10) {
        this.f53358e = z10;
        f();
        invalidateSelf();
    }

    public boolean d() {
        return this.f53363j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f53357d.setColor(C4165e.c(this.f53366m, this.f53368o));
        this.f53357d.setStyle(Paint.Style.FILL);
        this.f53357d.setFilterBitmap(d());
        canvas.drawPath(this.f53364k, this.f53357d);
        if (this.f53359f != 0.0f) {
            this.f53357d.setColor(C4165e.c(this.f53361h, this.f53368o));
            this.f53357d.setStyle(Paint.Style.STROKE);
            this.f53357d.setStrokeWidth(this.f53359f);
            canvas.drawPath(this.f53365l, this.f53357d);
        }
    }

    public void e(int i10) {
        if (this.f53366m != i10) {
            this.f53366m = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53368o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C4165e.b(C4165e.c(this.f53366m, this.f53368o));
    }

    @Override // p329s5.i
    public void h(float f10) {
        if (this.f53360g != f10) {
            this.f53360g = f10;
            f();
            invalidateSelf();
        }
    }

    @Override // p329s5.i
    public void j(float f10) {
        V4.k.c(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f53354a, f10);
        f();
        invalidateSelf();
    }

    @Override // p329s5.i
    public void k(boolean z10) {
    }

    @Override // p329s5.i
    public void m(boolean z10) {
        if (this.f53363j != z10) {
            this.f53363j = z10;
            invalidateSelf();
        }
    }

    @Override // p329s5.i
    public void n(boolean z10) {
        if (this.f53362i != z10) {
            this.f53362i = z10;
            f();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f53368o) {
            this.f53368o = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // p329s5.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f53354a, 0.0f);
        } else {
            V4.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f53354a, 0, 8);
        }
        f();
        invalidateSelf();
    }
}
