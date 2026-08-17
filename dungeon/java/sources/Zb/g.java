package Zb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String currentThreadName, String expectedThreadName) {
        super("Expected to run on " + expectedThreadName + " thread, but was run on " + currentThreadName, null, 2, null);
        Intrinsics.checkNotNullParameter(currentThreadName, "currentThreadName");
        Intrinsics.checkNotNullParameter(expectedThreadName, "expectedThreadName");
    }
}
