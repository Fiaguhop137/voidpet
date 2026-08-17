package p014ad;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String name) {
        super("Unable to delete the database file for '" + name + "' database", null, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
