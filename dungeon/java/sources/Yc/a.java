package Yc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Exception e10) {
        super(message, e10.getCause());
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(e10, "e");
    }
}
