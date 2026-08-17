package p014ad;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String name) {
        super("Unable to delete database '" + name + "' that is currently open. Close it prior to deletion.", null, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
