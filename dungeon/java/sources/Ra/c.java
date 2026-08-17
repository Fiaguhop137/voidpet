package Ra;

import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10917b;

    public c(int i10) {
        super(false, 1, null);
        this.f10917b = i10;
    }

    @Override // Ra.a
    public void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (b()) {
            int i10 = this.f10917b;
            for (int iN = CollectionsKt.n(drawingOperations); i10 < iN; iN--) {
                Collections.swap(drawingOperations, i10, iN);
                i10++;
            }
        }
    }
}
