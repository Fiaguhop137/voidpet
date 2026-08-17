package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.reflect.d viewType, CodedException cause) {
        super("Error occurred when invoking 'onViewDidUpdateProps' on '" + viewType.p() + "'", cause);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
