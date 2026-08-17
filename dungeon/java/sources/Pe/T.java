package Pe;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends C1274a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Qe.n storageManager, Function0 compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // Pe.C1274a, p033be.h
    public boolean isEmpty() {
        return false;
    }
}
