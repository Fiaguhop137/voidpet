package p168j6;

import N5.b;
import V5.g;
import V5.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import p025b6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46850a = new a();

    private a() {
    }

    public static final float a(h rotationOptions, g gVar, k encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!k.x(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (gVar == null || gVar.f14103b <= 0 || gVar.f14102a <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iD = f46850a.d(rotationOptions, encodedImage);
        boolean z10 = iD == 90 || iD == 270;
        int height = z10 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z10 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f10 = gVar.f14102a / height;
        float f11 = gVar.f14103b / width;
        float fD = e.d(f10, f11);
        W4.a.D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(gVar.f14102a), Integer.valueOf(gVar.f14103b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(fD));
        return fD;
    }

    public static final int b(h rotationOptions, g gVar, k encodedImage, int i10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!k.x(encodedImage)) {
            return 1;
        }
        float fA = a(rotationOptions, gVar, encodedImage);
        int iF = encodedImage.i() == b.f7872b ? f(fA) : e(fA);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f10 = gVar != null ? gVar.f14104c : i10;
        while (iMax / iF > f10) {
            iF = encodedImage.i() == b.f7872b ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static final int c(k encodedImage, int i10, int i11) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iO = encodedImage.o();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i10) / iO) / iO > i11) {
            iO *= 2;
        }
        return iO;
    }

    private final int d(h hVar, k kVar) {
        if (!hVar.h()) {
            return 0;
        }
        int iA2 = kVar.A2();
        if (iA2 == 0 || iA2 == 90 || iA2 == 180 || iA2 == 270) {
            return iA2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * ((double) 0.33333334f)) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / ((double) i11);
            if (d10 + (((double) 0.33333334f) * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }
}
