package p329s5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
class w extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f53442l = new w();

    private w() {
    }

    @Override // p329s5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fMin = Math.min(f12, f13);
        float fWidth = rect.left + (rect.width() - (i10 * fMin));
        float fHeight = rect.top + (rect.height() - (i11 * fMin));
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_end";
    }
}
