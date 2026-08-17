package H1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.i fragment) {
        super(fragment, "Attempting to get target fragment from fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
