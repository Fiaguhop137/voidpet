package p372uc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d moduleClass) {
        super(moduleClass + " module not found", null, 2, null);
        Intrinsics.checkNotNullParameter(moduleClass, "moduleClass");
    }
}
