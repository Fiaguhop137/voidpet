package T5;

import W5.C1598a;
import kotlin.jvm.internal.Intrinsics;
import p079e6.D;
import p079e6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12276a = new e();

    private e() {
    }

    public static final d a(D poolFactory, p097f6.d platformDecoder, C1598a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        i iVarB = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(iVarB, "getBitmapPool(...)");
        return new a(iVarB, closeableReferenceFactory);
    }
}
