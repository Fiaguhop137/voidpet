package p329s5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import p151i6.b;

/* JADX INFO: loaded from: classes2.dex */
public class j extends m {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static boolean f53347J = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Paint f53348D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Paint f53349E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Bitmap f53350F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private WeakReference f53351G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f53352H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private RectF f53353I;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z10) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f53348D = paint2;
        Paint paint3 = new Paint(1);
        this.f53349E = paint3;
        this.f53353I = null;
        this.f53350F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f53352H = z10;
    }

    public static boolean o() {
        return f53347J;
    }

    private void p() {
        Shader shader;
        WeakReference weakReference = this.f53351G;
        if (weakReference == null || weakReference.get() != this.f53350F) {
            this.f53351G = new WeakReference(this.f53350F);
            if (this.f53350F != null) {
                Paint paint = this.f53348D;
                Bitmap bitmap = this.f53350F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f53398f = true;
            }
        }
        if (this.f53398f && (shader = this.f53348D.getShader()) != null) {
            shader.setLocalMatrix(this.f53416x);
            this.f53398f = false;
        }
        this.f53348D.setFilterBitmap(d());
    }

    @Override // p329s5.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedBitmapDrawable#draw");
        }
        if (!f()) {
            super.draw(canvas);
            if (b.d()) {
                b.b();
                return;
            }
            return;
        }
        l();
        g();
        p();
        int iSave = canvas.save();
        canvas.concat(this.f53413u);
        if (this.f53352H || this.f53353I == null) {
            canvas.drawPath(this.f53397e, this.f53348D);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f53353I);
            canvas.drawPath(this.f53397e, this.f53348D);
            canvas.restoreToCount(iSave2);
        }
        float f10 = this.f53396d;
        if (f10 > 0.0f) {
            this.f53349E.setStrokeWidth(f10);
            this.f53349E.setColor(C4165e.c(this.f53399g, this.f53348D.getAlpha()));
            canvas.drawPath(this.f53400h, this.f53349E);
        }
        canvas.restoreToCount(iSave);
        if (b.d()) {
            b.b();
        }
    }

    @Override // p329s5.m
    boolean f() {
        return super.f() && this.f53350F != null;
    }

    @Override // p329s5.m, p329s5.i
    public void k(boolean z10) {
        this.f53352H = z10;
    }

    @Override // p329s5.m
    protected void l() {
        super.l();
        if (this.f53352H) {
            return;
        }
        if (this.f53353I == null) {
            this.f53353I = new RectF();
        }
        this.f53416x.mapRect(this.f53353I, this.f53406n);
    }

    @Override // p329s5.m, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f53348D.getAlpha()) {
            this.f53348D.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // p329s5.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f53348D.setColorFilter(colorFilter);
    }
}
