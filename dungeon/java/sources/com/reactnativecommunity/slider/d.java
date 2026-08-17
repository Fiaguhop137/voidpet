package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C2262k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static a a(C2262k0 c2262k0) {
        a aVar = new a(c2262k0, null);
        aVar.setSplitTrack(false);
        return aVar;
    }

    public static Map b() {
        return p312r6.d.c("topChange", p312r6.d.c("registrationName", "topChange"));
    }

    public static Map c() {
        return p312r6.d.d("onRNCSliderSlidingStart", p312r6.d.c("registrationName", "onRNCSliderSlidingStart"), "onRNCSliderSlidingComplete", p312r6.d.c("registrationName", "onRNCSliderSlidingComplete"));
    }

    public static void d(a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    public static void e(a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    public static void f(a aVar, boolean z10) {
        aVar.setEnabled(!z10);
    }

    public static void g(a aVar, boolean z10) {
        if (z10) {
            aVar.setScaleX(-1.0f);
        } else {
            aVar.setScaleX(1.0f);
        }
    }

    public static void h(a aVar, double d10) {
        aVar.setLowerLimit(d10);
    }

    public static void i(a aVar, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void j(a aVar, float f10) {
        aVar.setMaxValue(f10);
    }

    public static void k(a aVar, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void l(a aVar, float f10) {
        aVar.setMinValue(f10);
    }

    public static void m(a aVar, float f10) {
        aVar.setStep(f10);
    }

    public static void n(a aVar, ReadableMap readableMap) {
        aVar.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    public static void o(a aVar, Integer num) {
        if (aVar.getThumb() != null) {
            if (num == null) {
                aVar.getThumb().clearColorFilter();
            } else {
                aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public static void p(a aVar, double d10) {
        aVar.setUpperLimit(d10);
    }

    public static void q(a aVar, double d10) {
        if (aVar.d()) {
            return;
        }
        aVar.setValue(d10);
        if (!aVar.isAccessibilityFocused() || Build.VERSION.SDK_INT <= 29) {
            return;
        }
        aVar.setupAccessibility((int) d10);
    }
}
