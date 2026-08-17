package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.reflect.o desiredType, Class receivedClass) {
        super("Cannot convert received '" + receivedClass + "' to the '" + desiredType + "', because of the inner ref type mismatch", null, 2, null);
        Intrinsics.checkNotNullParameter(desiredType, "desiredType");
        Intrinsics.checkNotNullParameter(receivedClass, "receivedClass");
    }
}
