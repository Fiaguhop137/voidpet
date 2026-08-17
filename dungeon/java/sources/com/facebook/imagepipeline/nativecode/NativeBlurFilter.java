package com.facebook.imagepipeline.nativecode;

import V4.k;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
@V4.d
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i10, int i11) {
        k.g(bitmap);
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        nativeIterativeBoxBlur(bitmap, i10, i11);
    }

    @V4.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i10, int i11);
}
