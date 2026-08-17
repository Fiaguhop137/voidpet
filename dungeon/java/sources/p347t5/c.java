package p347t5;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p329s5.E;
import p329s5.F;
import p329s5.g;

/* JADX INFO: loaded from: classes2.dex */
public class c extends g implements E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f54500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f54501f;

    public c(Drawable drawable) {
        super(drawable);
        this.f54500e = null;
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            F f10 = this.f54501f;
            if (f10 != null) {
                f10.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f54500e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f54500e.draw(canvas);
            }
        }
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // p329s5.E
    public void o(F f10) {
        this.f54501f = f10;
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        F f10 = this.f54501f;
        if (f10 != null) {
            f10.f(z10);
        }
        return super.setVisible(z10, z11);
    }

    public void x(Drawable drawable) {
        this.f54500e = drawable;
        invalidateSelf();
    }
}
