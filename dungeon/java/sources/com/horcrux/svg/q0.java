package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
abstract class q0 {
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    static Matrix a(RectF rectF, RectF rectF2, String str, int i10) {
        double d10;
        double d11 = rectF.left;
        double d12 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d13 = rectF2.left;
        double d14 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d15 = dHeight2 / dHeight;
        double d16 = d13 - (d11 * dMax);
        double d17 = d14 - (d12 * d15);
        if (i10 == 2) {
            dMax = Math.min(dMax, d15);
            if (dMax > 1.0d) {
                d16 -= ((dWidth2 / dMax) - dWidth) / 2.0d;
                d10 = (dHeight2 / dMax) - dHeight;
            } else {
                d16 -= (dWidth2 - (dWidth * dMax)) / 2.0d;
                d10 = dHeight2 - (dHeight * dMax);
            }
            d17 -= d10 / 2.0d;
            d15 = dMax;
        } else {
            if (!str.equals("none") && i10 == 0) {
                dMax = Math.min(dMax, d15);
            } else if (str.equals("none") || i10 != 1) {
                if (str.contains("xMid")) {
                    d16 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d16 += dWidth2 - (dWidth * dMax);
                }
                if (str.contains("YMid")) {
                    d17 += (dHeight2 - (dHeight * d15)) / 2.0d;
                }
                if (str.contains("YMax")) {
                    d17 += dHeight2 - (dHeight * d15);
                }
            } else {
                dMax = Math.max(dMax, d15);
            }
            d15 = dMax;
            if (str.contains("xMid")) {
                d16 += (dWidth2 - (dWidth * dMax)) / 2.0d;
            }
            if (str.contains("xMax")) {
                d16 += dWidth2 - (dWidth * dMax);
            }
            if (str.contains("YMid")) {
                d17 += (dHeight2 - (dHeight * d15)) / 2.0d;
            }
            if (str.contains("YMax")) {
                d17 += dHeight2 - (dHeight * d15);
            }
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d16, (float) d17);
        matrix.preScale((float) dMax, (float) d15);
        return matrix;
    }
}
