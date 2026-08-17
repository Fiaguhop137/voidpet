package Db;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Exception exception) {
        super("Failed to load the image: " + exception.getMessage(), null, 2, null);
        Intrinsics.checkNotNullParameter(exception, "exception");
    }
}
