package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f30383a = Ad.j.b(new Y());

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field b() throws NoSuchFieldException {
        Field declaredField = X.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static final ReadableMap c(X x10) {
        Intrinsics.checkNotNullParameter(x10, "<this>");
        try {
            Object obj = getBackingMapField().get(x10);
            Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            return (ReadableMap) obj;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unable to access internal_backingMap via reflection", e10);
        }
    }

    private static final Field getBackingMapField() {
        Object value = f30383a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Field) value;
    }
}
