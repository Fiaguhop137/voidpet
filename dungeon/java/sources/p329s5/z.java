package p329s5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
class z extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f53445l = new z();

    private z() {
    }

    @Override // p329s5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float f14 = rect.left;
        float f15 = rect.top;
        matrix.setScale(f12, f13);
        matrix.postTranslate((int) (f14 + 0.5f), (int) (f15 + 0.5f));
    }

    public String toString() {
        return "fit_xy";
    }
}
