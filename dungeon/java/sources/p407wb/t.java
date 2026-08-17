package p407wb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String reason) {
        super("Unable to delete file or directory: " + reason, null, 2, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
    }
}
