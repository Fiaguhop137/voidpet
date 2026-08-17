package androidx.compose.foundation.layout;

import A.z;
import androidx.compose.ui.platform.J0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final V.k b(V.k kVar, Function1 function1) {
        return kVar.then(new OffsetPxModifier(function1, true, new z(function1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, J0 j10) {
        throw null;
    }
}
