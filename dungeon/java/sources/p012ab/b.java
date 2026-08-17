package p012ab;

import Xa.C1626a;
import Xa.C1633d0;
import Xa.EnumC1641h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final EnumC1641h0 a(EnumC1641h0.a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (i10 == 0) {
            return EnumC1641h0.Unknown;
        }
        if (i10 != 1) {
            return i10 != 2 ? EnumC1641h0.Unknown : EnumC1641h0.Pending;
        }
        return EnumC1641h0.Purchased;
    }

    public static final C1626a b(C1633d0 c1633d0) {
        Intrinsics.checkNotNullParameter(c1633d0, "<this>");
        return new C1626a(c1633d0.f(), c1633d0.g(), c1633d0.g(), null, null, null, true, c1633d0.b(), c1633d0.c(), c1633d0.c(), null, c1633d0.m(), c1633d0.getId(), null, 9272, null);
    }
}
