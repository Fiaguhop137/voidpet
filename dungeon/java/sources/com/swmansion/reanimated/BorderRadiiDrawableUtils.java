package com.swmansion.reanimated;

import android.view.View;
import com.facebook.react.uimanager.C2241a;
import com.facebook.react.uimanager.C2281y;

/* JADX INFO: loaded from: classes2.dex */
public class BorderRadiiDrawableUtils {
    public static ReactNativeUtils.BorderRadii getBorderRadii(View view) {
        return new ReactNativeUtils.BorderRadii(getRadiusForCorner(view, p080e7.d.BORDER_RADIUS, 0.0f), getRadiusForCorner(view, p080e7.d.BORDER_TOP_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, p080e7.d.BORDER_TOP_RIGHT_RADIUS, Float.NaN), getRadiusForCorner(view, p080e7.d.BORDER_BOTTOM_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, p080e7.d.BORDER_BOTTOM_RIGHT_RADIUS, Float.NaN));
    }

    private static float getRadiusForCorner(View view, p080e7.d dVar, float f10) {
        C2281y c2281yJ = C2241a.j(view, dVar);
        return c2281yJ == null ? f10 : c2281yJ.b(view.getBackground().getBounds().width());
    }
}
