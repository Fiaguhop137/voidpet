package p329s5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class g extends Drawable implements Drawable.Callback, D, C, InterfaceC4163c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix f53338d = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f53339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4164d f53340b = new C4164d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected D f53341c;

    public g(Drawable drawable) {
        this.f53339a = drawable;
        C4165e.d(drawable, this, this);
    }

    @Override // p329s5.D
    public void d(Matrix matrix) {
        u(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // p329s5.InterfaceC4163c
    public Drawable g(Drawable drawable) {
        return v(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f53339a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f53339a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f53339a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f53339a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f53339a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f53339a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // p329s5.C
    public void i(D d10) {
        this.f53341c = d10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f53339a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f53339a;
        return drawable == null ? super.onLevelChange(i10) : drawable.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f53339a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // p329s5.D
    public void p(RectF rectF) {
        D d10 = this.f53341c;
        if (d10 != null) {
            d10.p(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // p329s5.InterfaceC4163c
    public Drawable s() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f53340b.b(i10);
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53340b.c(colorFilter);
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f53340b.d(z10);
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f53340b.e(z10);
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f53339a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f53339a;
        return drawable == null ? visible : drawable.setVisible(z10, z11);
    }

    protected void u(Matrix matrix) {
        D d10 = this.f53341c;
        if (d10 != null) {
            d10.d(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable drawableW = w(drawable);
        invalidateSelf();
        return drawableW;
    }

    protected Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f53339a;
        C4165e.d(drawable2, null, null);
        C4165e.d(drawable, null, null);
        C4165e.e(drawable, this.f53340b);
        C4165e.a(drawable, this);
        C4165e.d(drawable, this, this);
        this.f53339a = drawable;
        return drawable2;
    }
}
