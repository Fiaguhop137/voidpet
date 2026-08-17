package p138hb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Throwable cause) {
        super("Failed to prepare the AudioRecorder", cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
