package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class B extends A {
    public static List R(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new V(list);
    }

    public static List S(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new U(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(List list, int i10) {
        if (i10 >= 0 && i10 <= C3959v.n(list)) {
            return C3959v.n(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new IntRange(0, C3959v.n(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(List list, int i10) {
        return C3959v.n(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
