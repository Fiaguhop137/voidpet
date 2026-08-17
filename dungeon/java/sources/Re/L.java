package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L {
    public static final I a(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        Intrinsics.d(m0Q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (I) m0Q0;
    }

    public static final boolean b(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return s10.Q0() instanceof I;
    }

    public static final AbstractC1388d0 c(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            return ((I) m0Q0).V0();
        }
        if (m0Q0 instanceof AbstractC1388d0) {
            return (AbstractC1388d0) m0Q0;
        }
        throw new Ad.n();
    }

    public static final AbstractC1388d0 d(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            return ((I) m0Q0).W0();
        }
        if (m0Q0 instanceof AbstractC1388d0) {
            return (AbstractC1388d0) m0Q0;
        }
        throw new Ad.n();
    }
}
