package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class Y extends X {
    public static Set d() {
        return H.f48234a;
    }

    public static LinkedHashSet e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) C3956s.C0(elements, new LinkedHashSet(P.e(elements.length)));
    }

    public static final Set f(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : X.c(set.iterator().next());
        }
        return d();
    }

    public static Set g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C3956s.W0(elements);
    }
}
