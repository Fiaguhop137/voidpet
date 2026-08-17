package Q;

import I.InterfaceC1054m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(InterfaceC1054m interfaceC1054m, Function2 function2) {
        Intrinsics.d(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((Function2) K.e(function2, 2)).invoke(interfaceC1054m, 1);
    }
}
