package p261o9;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p020b1.AbstractC2044c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f50462a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f50463b = {16842919};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f50464c = {16843623, 16842908};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f50465d = {16842908};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f50466e = {16843623};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f50467f = {16842913, 16842919};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f50468g = {16842913, 16843623, 16842908};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f50469h = {16842913, 16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f50470i = {16842913, 16843623};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f50471j = {16842913};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f50472k = {16842910, 16842919};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f50473l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f50462a) {
            int[] iArr = f50465d;
            return new ColorStateList(new int[][]{f50471j, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f50467f), c(colorStateList, iArr), c(colorStateList, f50463b)});
        }
        int[] iArr2 = f50467f;
        int[] iArr3 = f50468g;
        int[] iArr4 = f50469h;
        int[] iArr5 = f50470i;
        int[] iArr6 = f50463b;
        int[] iArr7 = f50464c;
        int[] iArr8 = f50465d;
        int[] iArr9 = f50466e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f50471j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), c(colorStateList, iArr5), 0, c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    private static int b(int i10) {
        return AbstractC2044c.k(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f50462a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f50472k, 0)) != 0) {
            Log.w(f50473l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
