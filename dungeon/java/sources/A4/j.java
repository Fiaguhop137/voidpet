package A4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p310r4.r;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements v, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Drawable f216a;

    public j(Drawable drawable) {
        this.f216a = (Drawable) L4.k.d(drawable);
    }

    @Override // p310r4.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f216a.getConstantState();
        return constantState == null ? this.f216a : constantState.newDrawable();
    }

    @Override // p310r4.r
    public void initialize() {
        Drawable drawable = this.f216a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C4.c) {
            ((C4.c) drawable).e().prepareToDraw();
        }
    }
}
