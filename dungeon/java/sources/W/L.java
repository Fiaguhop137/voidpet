package W;

import kotlin.collections.W;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final K a(String str) {
        return new C1588j(W.c(str));
    }

    public static final String[] b(K k10) {
        Intrinsics.d(k10, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C1588j) k10).a().toArray(new String[0]);
    }
}
