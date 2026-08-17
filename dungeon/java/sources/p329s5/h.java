package p329s5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f53342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f53344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f53345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f53346i;

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f53342e = new Matrix();
        this.f53343f = i10 - (i10 % 90);
        this.f53344g = (i11 < 0 || i11 > 8) ? 0 : i11;
        this.f53345h = new Matrix();
        this.f53346i = new RectF();
    }

    @Override // p329s5.g, p329s5.D
    public void d(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        u(transform);
        if (this.f53342e.isIdentity()) {
            return;
        }
        transform.preConcat(this.f53342e);
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f53343f <= 0 && ((i10 = this.f53344g) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f53342e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f53344g;
        return (i10 == 5 || i10 == 7 || this.f53343f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f53344g;
        return (i10 == 5 || i10 == 7 || this.f53343f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int i10;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i11 = this.f53343f;
        if (i11 <= 0 && ((i10 = this.f53344g) == 0 || i10 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i12 = this.f53344g;
        if (i12 == 2) {
            this.f53342e.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f53342e.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f53342e.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f53342e.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f53342e.setRotate(i11, bounds.centerX(), bounds.centerY());
        } else {
            this.f53342e.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f53342e.postScale(1.0f, -1.0f);
        }
        this.f53345h.reset();
        this.f53342e.invert(this.f53345h);
        this.f53346i.set(bounds);
        this.f53345h.mapRect(this.f53346i);
        RectF rectF = this.f53346i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
