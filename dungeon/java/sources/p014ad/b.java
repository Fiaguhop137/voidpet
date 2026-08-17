package p014ad;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String name) {
        super("Database '" + name + "' not found", null, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
