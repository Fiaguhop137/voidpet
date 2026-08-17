package p329s5;

import V4.i;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f53419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f53420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PointF f53421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f53424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Matrix f53425k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Drawable drawable, q scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f53425k = new Matrix();
        this.f53419e = scaleType;
    }

    private final void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f53422h == current.getIntrinsicWidth() && this.f53423i == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public final q A() {
        return this.f53419e;
    }

    public final void B(PointF pointF) {
        if (i.a(this.f53421g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f53421g = null;
        } else {
            if (this.f53421g == null) {
                this.f53421g = new PointF();
            }
            PointF pointF2 = this.f53421g;
            Intrinsics.c(pointF2);
            pointF2.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public final void C(q scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (i.a(this.f53419e, scaleType)) {
            return;
        }
        this.f53419e = scaleType;
        this.f53420f = null;
        x();
        invalidateSelf();
    }

    @Override // p329s5.g, p329s5.D
    public void d(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        u(transform);
        y();
        Matrix matrix = this.f53424j;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        y();
        if (this.f53424j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f53424j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        x();
    }

    @Override // p329s5.g
    public Drawable v(Drawable drawable) {
        Drawable drawableV = super.v(drawable);
        x();
        return drawableV;
    }

    public final void x() {
        float f10;
        Drawable current = getCurrent();
        if (current == null) {
            this.f53423i = 0;
            this.f53422h = 0;
            this.f53424j = null;
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f53422h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f53423i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f53424j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f53424j = null;
            return;
        }
        if (this.f53419e == q.f53426a) {
            current.setBounds(bounds);
            this.f53424j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f53425k.reset();
        q qVar = this.f53419e;
        Matrix matrix = this.f53425k;
        PointF pointF = this.f53421g;
        float f11 = 0.5f;
        if (pointF != null) {
            Intrinsics.c(pointF);
            f10 = pointF.x;
        } else {
            f10 = 0.5f;
        }
        PointF pointF2 = this.f53421g;
        if (pointF2 != null) {
            Intrinsics.c(pointF2);
            f11 = pointF2.y;
        }
        qVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f10, f11);
        this.f53424j = this.f53425k;
    }

    public final PointF z() {
        return this.f53421g;
    }
}
