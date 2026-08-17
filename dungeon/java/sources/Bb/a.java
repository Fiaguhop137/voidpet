package Bb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p209lb.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String type) {
        super("This device doesn't support the selected haptic type: " + type);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
