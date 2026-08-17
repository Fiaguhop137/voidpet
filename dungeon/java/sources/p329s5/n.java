package p329s5;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.Intrinsics;
import p151i6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        Intrinsics.checkNotNullParameter(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // p329s5.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (b.d()) {
            b.a("RoundedNinePatchDrawable#draw");
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
        canvas.clipPath(this.f53397e);
        super.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }
}
