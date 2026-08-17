package p329s5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
class s extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f53438l = new s();

    private s() {
    }

    @Override // p329s5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fHeight;
        float fWidth;
        if (f13 > f12) {
            fWidth = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
            fHeight = rect.top;
            f12 = f13;
        } else {
            float f14 = rect.left;
            fHeight = ((rect.height() - (i11 * f12)) * 0.5f) + rect.top;
            fWidth = f14;
        }
        matrix.setScale(f12, f12);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "center_crop";
    }
}
