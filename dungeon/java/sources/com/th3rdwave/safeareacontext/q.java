package com.th3rdwave.safeareacontext;

import Ad.v;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    public static final Map a(a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return N.l(v.a("top", Float.valueOf(H.g(insets.d()))), v.a("right", Float.valueOf(H.g(insets.c()))), v.a("bottom", Float.valueOf(H.g(insets.a()))), v.a("left", Float.valueOf(H.g(insets.b()))));
    }

    public static final WritableMap b(a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("top", H.g(insets.d()));
        writableMapCreateMap.putDouble("right", H.g(insets.c()));
        writableMapCreateMap.putDouble("bottom", H.g(insets.a()));
        writableMapCreateMap.putDouble("left", H.g(insets.b()));
        return writableMapCreateMap;
    }

    public static final Map c(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return N.l(v.a("x", Float.valueOf(H.g(rect.c()))), v.a("y", Float.valueOf(H.g(rect.d()))), v.a("width", Float.valueOf(H.g(rect.b()))), v.a("height", Float.valueOf(H.g(rect.a()))));
    }

    public static final WritableMap d(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("x", H.g(rect.c()));
        writableMapCreateMap.putDouble("y", H.g(rect.d()));
        writableMapCreateMap.putDouble("width", H.g(rect.b()));
        writableMapCreateMap.putDouble("height", H.g(rect.a()));
        return writableMapCreateMap;
    }
}
