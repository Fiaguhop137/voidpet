package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.reflect.d enumType, Enum[] enumConstants, Object obj) {
        super("'" + obj + "' is not present in " + enumType.p() + " enum, it must be one of: " + AbstractC3952n.n0(enumConstants, ", ", null, null, 0, null, new c(), 30, null), null, 2, null);
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        Intrinsics.checkNotNullParameter(enumConstants, "enumConstants");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(Enum it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "'" + it.name() + "'";
    }
}
