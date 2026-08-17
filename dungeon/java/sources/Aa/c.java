package Aa;

import android.graphics.Matrix;
import p170j8.C3845j;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3845j f256a = new C3845j("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f257b = new c();

    private c() {
    }

    public static c a() {
        return f257b;
    }

    public Matrix b(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }
}
