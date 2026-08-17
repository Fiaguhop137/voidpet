package p329s5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
class A extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f53299l = new A();

    private A() {
    }

    @Override // p329s5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fWidth = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
        float f14 = rect.top;
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f14 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
