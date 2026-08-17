package p407wb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String reason) {
        super("Unable to read from a file handle: '" + reason + "'", null, 2, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
    }
}
