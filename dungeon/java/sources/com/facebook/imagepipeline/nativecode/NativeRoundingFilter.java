package com.facebook.imagepipeline.nativecode;

import V4.k;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
@V4.d
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @V4.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    @V4.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z10);

    @V4.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z10);

    @V4.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z10);

    @V4.d
    public static void toCircle(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z10);
    }

    @V4.d
    public static void toCircleFast(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z10);
    }
}
