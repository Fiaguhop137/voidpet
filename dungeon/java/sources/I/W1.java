package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class W1 {
    public static final S1 a() {
        E0 e10 = E0.f4451a;
        Intrinsics.d(e10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return e10;
    }

    public static final S1 b() {
        C1068q1 c1068q1 = C1068q1.f4798a;
        Intrinsics.d(c1068q1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return c1068q1;
    }

    public static final S1 c() {
        g2 g2Var = g2.f4654a;
        Intrinsics.d(g2Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return g2Var;
    }
}
