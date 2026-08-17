package Yc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Exception e10) {
        super(str, e10.getCause());
        Intrinsics.checkNotNullParameter(e10, "e");
    }
}
