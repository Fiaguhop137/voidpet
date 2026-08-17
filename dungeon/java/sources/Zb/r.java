package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.reflect.o forType) {
        super("Cannot find type converter for '" + forType + "'. Make sure the class implements `expo.modules.kotlin.records.Record` (i.e. `class MyObj : Record`).", null, 2, null);
        Intrinsics.checkNotNullParameter(forType, "forType");
    }
}
