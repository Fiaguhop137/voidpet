package Ra;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends b {
    public d() {
        super(false, 1, null);
    }

    @Override // Ra.a
    public void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (b()) {
            CollectionsKt.W(drawingOperations);
        }
    }
}
