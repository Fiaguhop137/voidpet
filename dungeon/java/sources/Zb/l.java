package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlin.reflect.m property) {
        super("Value for field '" + property + "' is required, got nil", null, 2, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }
}
