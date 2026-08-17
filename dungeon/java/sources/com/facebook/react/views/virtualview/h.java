package com.facebook.react.views.virtualview;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableMap b(Rect rect) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        H h10 = H.f30189a;
        writableMapCreateMap.putDouble("x", h10.e(rect.left));
        writableMapCreateMap.putDouble("y", h10.e(rect.top));
        writableMapCreateMap.putDouble("width", h10.e(rect.width()));
        writableMapCreateMap.putDouble("height", h10.e(rect.height()));
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }
}
