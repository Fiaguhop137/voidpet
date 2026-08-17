package p168j6;

import V4.f;
import V5.g;
import V5.h;
import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import p025b6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f46852a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f46853b;

    static {
        f fVarE = f.e(2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(fVarE, "of(...)");
        f46853b = fVarE;
    }

    private e() {
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(g gVar, int i10, int i11) {
        if (gVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float fMax = Math.max(gVar.f14102a / f10, gVar.f14103b / f11);
        float f12 = f10 * fMax;
        float f13 = gVar.f14104c;
        if (f12 > f13) {
            fMax = f13 / f10;
        }
        return f11 * fMax > f13 ? f13 / f11 : fMax;
    }

    private final int c(k kVar) {
        int iA2 = kVar.A2();
        if (iA2 == 90 || iA2 == 180 || iA2 == 270) {
            return kVar.A2();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(h rotationOptions, k encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iF2 = encodedImage.f2();
        f fVar = f46853b;
        int iIndexOf = fVar.indexOf(Integer.valueOf(iF2));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e10 = fVar.get((iIndexOf + ((!rotationOptions.h() ? rotationOptions.f() : 0) / 90)) % fVar.size());
        Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int e(h rotationOptions, k encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.g()) {
            return 0;
        }
        int iC = f46852a.c(encodedImage);
        return rotationOptions.h() ? iC : (iC + rotationOptions.f()) % 360;
    }

    public static final int f(h rotationOptions, g gVar, k encodedImage, boolean z10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!z10 || gVar == null) {
            return 8;
        }
        int iE = e(rotationOptions, encodedImage);
        int iD = f46853b.contains(Integer.valueOf(encodedImage.f2())) ? d(rotationOptions, encodedImage) : 0;
        boolean z11 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(gVar, z11 ? encodedImage.getHeight() : encodedImage.getWidth(), z11 ? encodedImage.getWidth() : encodedImage.getHeight()), gVar.f14105d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static final Matrix g(k encodedImage, h rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (f46853b.contains(Integer.valueOf(encodedImage.f2()))) {
            return f46852a.h(d(rotationOptions, encodedImage));
        }
        int iE = e(rotationOptions, encodedImage);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    private final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8));
    }
}
