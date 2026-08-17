package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(String message, CodedException cause) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
        String code = cause.getCode();
        String strLineSeparator = System.lineSeparator();
        Object localizedMessage = cause.getLocalizedMessage();
        super(code, message + strLineSeparator + "→ Caused by: " + (localizedMessage == null ? cause : localizedMessage), cause);
    }
}
