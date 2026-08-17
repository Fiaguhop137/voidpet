package p407wb;

import Nb.c;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c permission) {
        super("Missing '" + permission.name() + "' permission for accessing the file.", null, 2, null);
        Intrinsics.checkNotNullParameter(permission, "permission");
    }
}
