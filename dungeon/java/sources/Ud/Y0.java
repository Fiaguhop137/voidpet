package Ud;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Y0 extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
