package Zb;

import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String fieldName, kotlin.reflect.o fieldType, ReadableType providedType, CodedException cause) {
        super("Cannot cast '" + providedType.name() + "' for field '" + fieldName + "' ('" + fieldType + "').", cause);
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
