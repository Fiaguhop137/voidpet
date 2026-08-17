package p329s5;

import V4.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: s5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC4162b extends g implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f53313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53314h;

    public RunnableC4162b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    public RunnableC4162b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) k.g(drawable));
        this.f53313g = 0.0f;
        this.f53314h = false;
        this.f53311e = i10;
        this.f53312f = z10;
    }

    private int x() {
        return (int) ((20.0f / this.f53311e) * 360.0f);
    }

    private void y() {
        if (this.f53314h) {
            return;
        }
        this.f53314h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right;
        int i11 = bounds.left;
        int i12 = i10 - i11;
        int i13 = bounds.bottom;
        int i14 = bounds.top;
        int i15 = i13 - i14;
        float f10 = this.f53313g;
        if (!this.f53312f) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, i11 + (i12 / 2), i14 + (i15 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f53314h = false;
        this.f53313g += x();
        invalidateSelf();
    }
}
