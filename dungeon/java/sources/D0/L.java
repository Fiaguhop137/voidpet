package D0;

import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f2046a = new L();

    private L() {
    }

    public static final void a(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
