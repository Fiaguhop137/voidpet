package com.horcrux.svg;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class CustomFilter {
    public static Bitmap apply(Bitmap bitmap, Bitmap bitmap2, InterfaceC3167d interfaceC3167d) {
        int[] iArr;
        int[] iArr2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i10];
        int[] iArr5 = new int[i10];
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            bitmap.getPixels(iArr3, 0, width, 0, 0, width, height);
            iArr = iArr3;
            iArr2 = iArr4;
            try {
                bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        for (int i11 = 0; i11 < height; i11++) {
            for (int i12 = 0; i12 < width; i12++) {
                int i13 = (i11 * width) + i12;
                int i14 = iArr[i13];
                fArr[0] = ((i14 >> 24) & 255) / 255.0f;
                fArr[1] = ((i14 >> 16) & 255) / 255.0f;
                fArr[2] = ((i14 >> 8) & 255) / 255.0f;
                fArr[3] = (i14 & 255) / 255.0f;
                int i15 = iArr2[i13];
                fArr2[0] = ((i15 >> 24) & 255) / 255.0f;
                fArr2[1] = ((i15 >> 16) & 255) / 255.0f;
                fArr2[2] = ((i15 >> 8) & 255) / 255.0f;
                fArr2[3] = (i15 & 255) / 255.0f;
                iArr5[i13] = normalizeFromFloats(interfaceC3167d.a(fArr, fArr2));
            }
        }
        return Bitmap.createBitmap(iArr5, width, height, Bitmap.Config.ARGB_8888);
    }

    public static int normalizeFromFloat(float f10) {
        return Math.min(255, Math.max(0, Math.round(f10 * 255.0f)));
    }

    public static int normalizeFromFloats(float[] fArr) {
        if (fArr.length < 4 || normalizeFromFloat(fArr[0]) <= 0) {
            return 0;
        }
        return normalizeFromFloat(fArr[3] / fArr[0]) | (normalizeFromFloat(fArr[0]) << 24) | (normalizeFromFloat(fArr[1] / fArr[0]) << 16) | (normalizeFromFloat(fArr[2] / fArr[0]) << 8);
    }
}
