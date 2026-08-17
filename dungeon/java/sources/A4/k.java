package A4;

import android.graphics.drawable.Drawable;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
final class k extends j {
    private k(Drawable drawable) {
        super(drawable);
    }

    static v d(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // p310r4.v
    public int a() {
        return Math.max(1, this.f216a.getIntrinsicWidth() * this.f216a.getIntrinsicHeight() * 4);
    }

    @Override // p310r4.v
    public Class b() {
        return this.f216a.getClass();
    }

    @Override // p310r4.v
    public void recycle() {
    }
}
