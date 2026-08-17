package p461zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
final class d extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String uri, Throwable th) {
        super("Could not save image to '" + uri + "'", th);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }
}
