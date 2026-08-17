package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.reflect.d argumentType, kotlin.reflect.d desiredType, Throwable th) {
        super("Argument type '" + argumentType + "' is not compatible with expected type '" + desiredType + "'.", th);
        Intrinsics.checkNotNullParameter(argumentType, "argumentType");
        Intrinsics.checkNotNullParameter(desiredType, "desiredType");
    }

    public /* synthetic */ n(kotlin.reflect.d dVar, kotlin.reflect.d dVar2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2, (i10 & 4) != 0 ? null : th);
    }
}
