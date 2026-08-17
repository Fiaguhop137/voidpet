package p263ob;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final String a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        String localizedMessage = th.getLocalizedMessage();
        Throwable cause = th.getCause();
        return CollectionsKt.s0(CollectionsKt.q(localizedMessage, cause != null ? a(cause) : null), ": ", null, null, 0, null, null, 62, null);
    }
}
